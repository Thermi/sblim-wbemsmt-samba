 /** 
  * PrinterWizard.java
  *
  * © Copyright IBM Corp. 2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE COMMON PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Common Public License from
  * http://www.opensource.org/licenses/cpl1.0.php
  *
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Wrapper for Printer Wizard BL
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper.wizard;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.cim.CIMProperty;
import javax.cim.UnsignedInteger16;
import javax.cim.UnsignedInteger64;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter;
import org.sblim.wbemsmt.samba.bl.container.wizard.*;
import org.sblim.wbemsmt.samba.bl.fco.*;
import org.sblim.wbemsmt.samba.bl.wrapper.Service;
import org.sblim.wbemsmt.samba.bl.wrapper.SystemPrinter;
import org.sblim.wbemsmt.samba.bl.wrapper.list.SystemPrinterList;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

public class PrinterWizard  extends SambaWizard {

	private static final String DEFAULT_PREFIX_PRINTER = "smb";
	private PrinterWizardPage1 page1;
	private PrinterWizardPage2 page2;
	private PrinterWizardPage3 page3;
	private PrinterWizardPage4 page4;
	private PrinterWizardPage5 page5;
	private DataContainer lastcontainer;
	private Set updatedContainers = new HashSet();
	
	private int listCount;

	public PrinterWizard(SambaCimAdapter adapter)
	{
		super(adapter);
	}

	public void create(PrinterWizardPage5 container) throws WbemsmtException
	{
		this.page5 = container;
		SystemPrinterList systemPrinters = null;
		
		systemPrinters = adapter.getSelectedService().getSystemPrinters();
		
		Linux_SambaPrinterOptions printer = null;
		if (getDefineForAllPrinters())
		{
				
				for (int i=0; i < systemPrinters.size(); i++)
                {
                	SystemPrinter sysPrinter = systemPrinters.getSystemPrinter(i);
                	printer = createPrinter(PrinterWizard.DEFAULT_PREFIX_PRINTER + sysPrinter.getName(),sysPrinter);
                }
		}
		else
		{
			UnsignedInteger16 idx = (UnsignedInteger16) page2.get_usr_SystemPrinterName().getConvertedControlValue();
			if (idx != null)
			{
				printer = createPrinter((String) page2.get_SambaPrinterName().getConvertedControlValue(),systemPrinters.getSystemPrinter(idx.intValue()));
				
			}
			else
			{
				throw new WbemsmtException(WbemsmtException.ERR_SAVE_OBJECT,container.getAdapter().getBundle().getString("cannot.create.printer"));
			}
		}
		
		//next time in the wizard is first time
		updatedContainers.clear();
		
		adapter.setMarkedForReload();
		adapter.setPathOfTreeNode(printer.getCimObjectPath());
		
	}



	private Linux_SambaPrinterOptions createPrinter(String name, SystemPrinter systemPrinter) throws WbemsmtException {
		
	    try {
	        WBEMClient cc = adapter.getCimClient();
    		Linux_SambaPrinterOptions printer = new Linux_SambaPrinterOptions(cc,adapter.getNamespace());
			printer.set_key_Name(name);
			printer.set_Comment((String) page2.get_Comment().getConvertedControlValue());
			printer.set_Available(new Boolean(true));
			printer.set_Path((String) page2.get_Path().getConvertedControlValue());
			printer.set_Printable(new Boolean(true));
			printer.set_SystemPrinterName(systemPrinter.getName());
			setInstanceId(printer);
			printer = (Linux_SambaPrinterOptions) adapter.getFcoHelper().create(printer,cc);
			page5.setKey(new CimObjectKey(printer.getCimObjectPath()));
			
			boolean enableGuest  = ((Boolean)page3.get_usr_EnableGuest().getConvertedControlValue()).booleanValue();
			boolean publicPrinter = ((Boolean)page3.get_usr_SeenByEverybody().getConvertedControlValue()).booleanValue();

			createForceUser(printer);
			createBrowseOpts(printer, publicPrinter);
			createCommonSec(printer, enableGuest);			
			createPrinterSec(printer);			
			createPrintingOpts(printer);			

			createUserAcl(printer);
			return printer;
			
			
		} catch (Exception e) {
			throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,adapter.getBundle().getString("cannot.create.printer"),e);
		}
	}

	private void createForceUser(Linux_SambaPrinterOptions printer) throws WbemsmtException {
	    WBEMClient cc = adapter.getCimClient();
		UnsignedInteger16 index = (UnsignedInteger16) page3.get_usr_ForceUser().getConvertedControlValue();
		//first element is the "no force user text" so subtract one to get the right user
		if (index != null && index.intValue() > 0)
		{
			Linux_SambaUser user = ((SambaCimAdapter) page4.getAdapter()).getSelectedService().getUsers().getUser(index.intValue()-1).getUser();
            Linux_SambaForceUserForPrinter newForceUserAssoc = new Linux_SambaForceUserForPrinter(cc,adapter.getNamespace());
            newForceUserAssoc.set_GroupComponent_Linux_SambaPrinterOptions(printer);
            newForceUserAssoc.set_PartComponent_Linux_SambaUser(user);
            adapter.getFcoHelper().create(newForceUserAssoc,cc);
		}
	}
	
	
	private void createUserAcl(Linux_SambaPrinterOptions printer) throws WbemsmtException {
		List items = page3.getUsers();
		for (int i=0; i < items.size(); i++)
		{
		    UserInPrinterWizardACLItemDataContainer item = (UserInPrinterWizardACLItemDataContainer)items.get(i);
            boolean admin = ((Boolean)item.get_usr_Admin().getConvertedControlValue()).booleanValue();
            Linux_SambaUser user = adapter.getSelectedService().getUsers().getUser(i).getUser();
            String sambaUserName = user.get_key_SambaUserName();
   
            CIMProperty[] vKeyProperties = new CIMProperty[] {
                    Linux_SambaInvalidUsersForPrinter.create_PartComponent_Linux_SambaUser(adapter.getCimClient(), adapter.getNamespace(), user),
                    Linux_SambaInvalidUsersForPrinter.create_GroupComponent_Linux_SambaPrinterOptions(adapter.getCimClient(), adapter.getNamespace(), printer)};

            save(admin, adapter.getSelectedService().getPrinterGlobals().getAdminUsers(),
            		Linux_SambaPrinterAdminForPrinter.class, sambaUserName,
            		vKeyProperties);
            saveValidInvalid(item.get_usr_AccessTypeVI(), user,
            		adapter.getSelectedService().getInvalidUsers(), adapter.getSelectedService().getValidUsers(), vKeyProperties,
            		Linux_SambaInvalidUsersForPrinter.class,
            		Linux_SambaValidUsersForPrinter.class);
            saveReadWrite(item.get_usr_AccessTypeRW(), user, adapter.getSelectedService().getReadUsers(),
            		adapter.getSelectedService().getWriteUsers(), vKeyProperties,
            		Linux_SambaReadListForPrinter.class,
            		Linux_SambaWriteListForPrinter.class);
		}
	}	
	
	private void createPrintingOpts(Linux_SambaPrinterOptions printer) throws WbemsmtException {
		
		Linux_SambaPrinterPrintingOptions printingOptions = 
        	(Linux_SambaPrinterPrintingOptions) getFirstChild(Linux_SambaPrinterPrintingOptions.class,printer.getAssociated_Linux_SambaPrinterPrintingOptions_Linux_SambaPrinterPrintingForPrinterNames(adapter.getCimClient()),false);
        
        
        printingOptions.set_CupsOptions((String) page4.get_CupsOptions().getConvertedControlValue());
        printingOptions.set_PrintCommand((String) page4.get_PrintCommand().getConvertedControlValue());
        printingOptions.set_DefaultDevMode(new Boolean(false));
        printingOptions.set_MaxPrintjobs(new UnsignedInteger64("100"));
        printingOptions.set_MaxReportedPrintjobs(new UnsignedInteger64("100"));
        printingOptions.set_UseClientDriver(new Boolean(true));
        adapter.getFcoHelper().save(printingOptions,adapter.getCimClient());
		
		
	}

	private void createBrowseOpts(Linux_SambaPrinterOptions printer, boolean publicPrinter) throws WbemsmtException {
	    WBEMClient cc = adapter.getCimClient();
	    Linux_SambaPrinterBrowseOptions child = 
        	(Linux_SambaPrinterBrowseOptions) getFirstChild(Linux_SambaPrinterBrowseOptions.class,printer.getAssociated_Linux_SambaPrinterBrowseOptions_Linux_SambaPrinterBrowseForPrinterNames(cc),false);
        child.set_Browsable(new Boolean(publicPrinter));
        adapter.getFcoHelper().save(child,cc);
	}
	
	private void createCommonSec(Linux_SambaPrinterOptions printer, boolean enableGuest) throws WbemsmtException {
	    WBEMClient cc = adapter.getCimClient();
	    Linux_SambaCommonSecurityOptions child = 
        	(Linux_SambaCommonSecurityOptions) getFirstChild(Linux_SambaCommonSecurityOptions.class,printer.getAssociated_Linux_SambaCommonSecurityOptions_Linux_SambaCommonSecurityForPrinterNames(cc),false);
        child.set_GuestOK(new Boolean(enableGuest));
        adapter.getFcoHelper().save(child,cc);
	}
	
	private void createPrinterSec(Linux_SambaPrinterOptions printer) throws WbemsmtException {
	}	
	
	public void updateControls(PrinterWizardPage1 container) {
		
		lastcontainer = page1 = container;
		WbemSmtResourceBundle bundle = adapter.getBundle();
		String[] values = getAllOrOneValues(bundle);
		container.get_usr_AllOrOne().setValues(values);

		Object convertedControlValue = container.get_usr_AllOrOne().getConvertedControlValue();
		UnsignedInteger16 index = (UnsignedInteger16) convertedControlValue;
		if (index == null)
		{
			//SET TO 1 if enable all is activated again
			container.get_usr_AllOrOne().setControlValue(new UnsignedInteger16(0));
		}
	}

	private String[] getAllOrOneValues(WbemSmtResourceBundle bundle) {
		String[] values;
		if (RuntimeUtil.getInstance().isCommandline())
		{
			values = new String[]{
					//"true","false"
					"false"
				};
		}
		else
		{
			values = new String[]{
					//bundle.getString("wizard.all.printers"),
					bundle.getString("wizard.one.printer")
				};
		}
		return values;
	}

	public void updateControls(PrinterWizardPage2 container) throws WbemsmtException {
		lastcontainer = page2 = container;
//			enable again if can create samba printers for all systemprinters
//			if (getDefineForAllPrinters())
//			{
//				container.get_usr_SystemPrinterName().getProperties().setReadOnly(true);
//				container.get_usr_SystemPrinterName().setValues(new String[]{});
//			}
//			else
//			{
        	container.get_usr_SystemPrinterName().getProperties().setReadOnly(false);
        	container.get_usr_SystemPrinterName().setValues(adapter.getSelectedService().getSystemPrinters().getNameArray());
//			}
	}

	public void updateControls(PrinterWizardPage3 container) throws WbemsmtException {
		lastcontainer = page3 = container;
		super.updateForceUserForWizard(container,container.get_usr_ForceUser(),adapter.getSelectedService());

		if (!updatedContainers.contains(page3))
		{
			adapter.updateControls(page3.getUsers(),adapter.getSelectedService().getUsers().getFCOs());
            updatedContainers.add(page3);
		}

	}

	public void updateControls(PrinterWizardPage4 container) {
		lastcontainer = page4 = container;
	}

	public void updateControls(PrinterWizardPage5 container) throws WbemsmtException {
		
		lastcontainer = page5 = container;
		
			WbemSmtResourceBundle bundle = adapter.getBundle();
			String[] values = getAllOrOneValues(bundle);
			container.get_usr_AllOrOne().setValues(values);
			container.get_usr_AllOrOne().getProperties().setVisible(false);
			
			if (getDefineForAllPrinters())
			{
				container.get_usr_SystemPrinterName().setValues(new String[]{});
			}
			else
			{
				container.get_usr_SystemPrinterName().setValues(adapter.getSelectedService().getSystemPrinters().getNameArray());
			}
			
			
			
			container.get_CupsOptions().setControlValue(page4.get_CupsOptions().getConvertedControlValue());
			container.get_PrintCommand().setControlValue(page4.get_PrintCommand().getConvertedControlValue());
			container.get_usr_AllOrOne().setControlValue(page1.get_usr_AllOrOne().getConvertedControlValue());
			container.get_usr_EnableGuest().setControlValue(page3.get_usr_EnableGuest().getConvertedControlValue());
			container.get_usr_SeenByEverybody().setControlValue(page3.get_usr_SeenByEverybody().getConvertedControlValue());
			if (!getDefineForAllPrinters())
			{
				container.get_Comment().setControlValue(page2.get_Comment().getConvertedControlValue());
				container.get_Path().setControlValue(page2.get_Path().getConvertedControlValue());
				container.get_SambaPrinterName().setControlValue(page2.get_SambaPrinterName().getConvertedControlValue());
				container.get_usr_SystemPrinterName().setControlValue(page2.get_usr_SystemPrinterName().getConvertedControlValue());
			}
			container.get_Comment().getProperties().setVisible(!getDefineForAllPrinters());
			container.get_Path().getProperties().setVisible(!getDefineForAllPrinters());
			container.get_SambaPrinterName().getProperties().setVisible(!getDefineForAllPrinters());
			container.get_usr_SystemPrinterName().getProperties().setVisible(!getDefineForAllPrinters());

			super.setForceUserForWizardOverview(container, page3.get_usr_ForceUser(),page5.get_usr_ForceUser());
			
			listCount = 0;			
			adapter.updateControls(page5.getUsers(),adapter.getSelectedService().getUsers().getFCOs());
	}

//	private String getSysPrinterName(WBEMClient cc) throws WbemsmtException {
//			String sysUserName = null; 
//			UnsignedInteger16 printerIdx = (UnsignedInteger16) page2.get_usr_SystemPrinterName().getConvertedControlValue();
//			if (printerIdx != null)
//			{
//				sysUserName = adapter.getSelectedService().getSystemPrinters(cc).getSystemPrinter(printerIdx.intValue()).getName();
//			}
//			return sysUserName;
//	}
	
	private boolean getDefineForAllPrinters() {
		UnsignedInteger16 printerIdx = (UnsignedInteger16) page1.get_usr_AllOrOne().getConvertedControlValue();
		//set to == 0 if enable for all is activated again
		return printerIdx != null && printerIdx.intValue() == 1;
	}

	public void updateControls(UserInPrinterWizardACLItemDataContainer container) {
		
	}

	public void updateControls(UserInPrinterWizardACLItemDataContainer container, Linux_SambaUser fco) throws WbemsmtException {
		container.get_SambaUserName().setControlValue(fco.get_key_SambaUserName());
		container.get_usr_AccessTypeVI().setValues(super.getValidInvalidTypes(adapter.getBundle()));
		container.get_usr_AccessTypeRW().setValues(super.getReadWriteTypes(adapter.getBundle()));
		
		boolean lastPage = lastcontainer == page5;
		container.get_usr_AccessTypeVI().getProperties().setReadOnly(lastPage);
		container.get_usr_AccessTypeRW().getProperties().setReadOnly(lastPage);
		container.get_usr_Admin().getProperties().setReadOnly(lastPage);
		
		if (lastPage)
		{
			UserInPrinterWizardACLItemDataContainer page3Container = (UserInPrinterWizardACLItemDataContainer) page3.getUsers().get(listCount);
			container.get_usr_AccessTypeVI().setControlValue(page3Container.get_usr_AccessTypeVI().getConvertedControlValue());
			container.get_usr_AccessTypeRW().setControlValue(page3Container.get_usr_AccessTypeRW().getConvertedControlValue());
			container.get_usr_Admin().setControlValue(page3Container.get_usr_Admin().getConvertedControlValue());
			listCount++;
		} else {
			//if it's not the lastPage this updateControls should be only called the first time the panel is displayed 
			//to set the default values from global
			//use the globals's sets to get the default valus
			//becaus we are having no default values for the new printer and no associator call to get the "global-local-merged" entries
			//from the server
			Service srv = adapter.getSelectedService();
			updateValidInvalidWithUserList(container,container.get_usr_AccessTypeVI(), fco.get_key_SambaUserName(), srv.getInvalidUsers(), srv.getValidUsers(), false, srv);
            updateReadWriteWithUserList(container,container.get_usr_AccessTypeRW(), fco.get_key_SambaUserName(), srv.getReadUsers(), srv.getWriteUsers(),false,srv);
            Set printerAdmins = adapter.getSelectedService().getPrinterGlobals().getAdminUsers();
            updateAdminWithUserList(container,container.get_usr_Admin(), fco.get_key_SambaUserName(), printerAdmins, srv,printerAdmins, false);
		}		
	}

	public void updateModel(PrinterWizardPage4 container) {
	}

	public void updateModel(PrinterWizardPage3 container) {
		if (adapter.getUpdateTrigger() == container.get_usr_EnableAllUsers())
		{
			List items = container.getUsers();
			changeAllUsers(items,container);
		}
	}

	private void changeAllUsers(List items,PrinterWizardPage3 container) {

		boolean enableAll = ((Boolean)container.get_usr_EnableAllUsers().getConvertedControlValue()).booleanValue();
		
		for (int i=0; i < items.size(); i++)
		{
			UserInPrinterWizardACLItemDataContainer item = (UserInPrinterWizardACLItemDataContainer)items.get(i);
			item.get_usr_AccessTypeVI().setControlValue(new UnsignedInteger16(enableAll ? USR_ACL_IDX_ENABLE : USR_ACL_IDX_DISABLE));
			item.get_usr_AccessTypeRW().setControlValue(new UnsignedInteger16(enableAll ? USR_ACL_IDX_WRITE : USR_ACL_IDX_READ));
		}
	}

	
	public void updateModel(PrinterWizardPage2 container) {
	}

	public void updateModel(PrinterWizardPage1 container) {
	}	
}
