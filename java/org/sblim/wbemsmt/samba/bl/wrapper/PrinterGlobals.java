 /** 
  * PrinterGlobals.java
  *
  * © Copyright IBM Corp.  2009,2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Class for wrapping the printer globals business object and the related-actions
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.cim.UnsignedInteger16;
import javax.cim.UnsignedInteger64;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter;
import org.sblim.wbemsmt.samba.bl.adapter.SambaObject;
import org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals;
import org.sblim.wbemsmt.samba.bl.container.global.PrintingGlobalsDataContainer;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaGlobalPrintingOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterAdminForGlobal;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser;
import org.sblim.wbemsmt.util.StringUtil;

public class PrinterGlobals extends SambaObject {

	private final Service service;
	private Linux_SambaGlobalPrintingOptions globalPrintingOptions1;
	private Set<String> adminsBySambaUserName;

	public PrinterGlobals(Service service, SambaCimAdapter adapter) throws WbemsmtException {
		super(adapter);
		this.service = service;
		loadGlobalPrinterAdmins();
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaObject#loadChilds(org.sblim.wbem.client.WBEMClient)
	 */
	public void reloadChilds() throws WbemsmtException {
		getGlobalPrintingOptions();
		reloadChilds = false;
	}


	private Linux_SambaGlobalPrintingOptions getGlobalPrintingOptions() throws WbemsmtException{
		if (globalPrintingOptions1 == null || reloadChilds)
        {
        	globalPrintingOptions1 = (Linux_SambaGlobalPrintingOptions) 
        	getFirstChild(
        			Linux_SambaGlobalPrintingOptions.class
        			,service.
        				getGlobalOptions().
        				getAssociated_Linux_SambaGlobalPrintingOptions_Linux_SambaGlobalPrintingForGlobalNames(adapter.getCimClient()), false);
        }
        return globalPrintingOptions1;
	}

	private void loadGlobalPrinterAdmins() throws WbemsmtException
	{
		List<Linux_SambaUser> admins = service.getGlobalOptions().getAssociated_Linux_SambaUser_Linux_SambaPrinterAdminForGlobals(adapter.getCimClient());
        adminsBySambaUserName = new HashSet<String>();
        for (Iterator<Linux_SambaUser> iter = admins.iterator(); iter.hasNext();) {
        	Linux_SambaUser user = (Linux_SambaUser) iter.next();
        	adminsBySambaUserName.add(user.get_key_SambaUserName());			
        }
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaObject#getCimObjectKey()
	 */
	public CimObjectKey getCimObjectKey() {
		return service.getCimObjectKey();
	}

	public void updateControls(PrintingGlobalsDataContainer container) throws WbemsmtException {
		
		container.get_CupsOptions().setControlValue(getGlobalPrintingOptions().get_CupsOptions());
        container.get_DefaultDevMode().setControlValue(getGlobalPrintingOptions().get_DefaultDevMode());
        container.get_MaxPrintjobs().setControlValue(getGlobalPrintingOptions().get_MaxPrintjobs());
        container.get_MaxReportedPrintjobs().setControlValue(getGlobalPrintingOptions().get_MaxReportedPrintjobs());
        container.get_PrintcapCacheTime().setControlValue(getGlobalPrintingOptions().get_PrintcapCacheTime());
        container.get_PrintCommand().setControlValue(getGlobalPrintingOptions().get_PrintCommand());
        
        
        container.get_usr_SystemPrinterName().setValues(service.getSystemPrinters().getNameArray());
        int index = StringUtil.indexOf(service.getSystemPrinters().getNameArray(),getGlobalPrintingOptions().get_SystemPrinterName());
        if (index == -1)
        {
        	index = 0;
        }
        container.get_usr_SystemPrinterName().setControlValue(new UnsignedInteger16(index));
        container.get_UseClientDriver().setControlValue(getGlobalPrintingOptions().get_UseClientDriver());
        
        container.getAdapter().updateControls(container.getUsers(),service.getUsers().getFCOs());
		
	}

	public void updateModel(PrintingGlobalsDataContainer container) throws WbemsmtException {
	}

	public MessageList save(PrintingGlobalsDataContainer container) throws WbemsmtException {

		WBEMClient cc = container.getAdapter().getCimClient();

        getGlobalPrintingOptions().set_CupsOptions((String) container.get_CupsOptions().getConvertedControlValue());
        getGlobalPrintingOptions().set_DefaultDevMode((Boolean) container.get_DefaultDevMode().getConvertedControlValue());
        getGlobalPrintingOptions().set_MaxPrintjobs((UnsignedInteger64) container.get_MaxPrintjobs().getConvertedControlValue());
        getGlobalPrintingOptions().set_MaxReportedPrintjobs((UnsignedInteger64) container.get_MaxReportedPrintjobs().getConvertedControlValue());
        getGlobalPrintingOptions().set_PrintcapCacheTime((UnsignedInteger64) container.get_PrintcapCacheTime().getConvertedControlValue());
        getGlobalPrintingOptions().set_PrintCommand((String) container.get_PrintCommand().getConvertedControlValue());
        UnsignedInteger16 index = (UnsignedInteger16) container.get_usr_SystemPrinterName().getConvertedControlValue();
        if (index != null)
        {
        	getGlobalPrintingOptions().set_SystemPrinterName(service.getSystemPrinters().getNameArray()[index.intValue()]);
        }
        getGlobalPrintingOptions().set_UseClientDriver((Boolean) container.get_UseClientDriver().getConvertedControlValue());
        adapter.getFcoHelper().save(getGlobalPrintingOptions(),cc);

        container.getAdapter().save(container.getUsers(),service.getUsers().getFCOs());
        
        reloadChilds = true;
        reloadChilds();
        resetPrinterAcl(service);
        resetPrinterChilds(service);
        resetUserAcl(service);
        return null;
	}

	public void updateControls(AdminUsersInPrinterGlobals container) throws WbemsmtException {
		super.updateSharePrinterAdminForGlobalControls(container,adminsBySambaUserName,service);
	}

	public void updateControls(AdminUsersInPrinterGlobals container, Linux_SambaUser fco) {
		super.updateSharePrinterAdminForGlobalControls(container,fco,adminsBySambaUserName);
	}

	public MessageList save(AdminUsersInPrinterGlobals container, Linux_SambaUser fco) throws WbemsmtException {
		
		WBEMClient cc = container.getAdapter().getCimClient();
		String userName = (String) container.get_usr_SambaUserName().getConvertedControlValue();
		boolean checked = ((Boolean) container.get_usr_Admin().getConvertedControlValue()).booleanValue();

		if (!checked && adminsBySambaUserName.contains(userName))
        {
            
            List<Linux_SambaPrinterAdminForGlobal> list = fco.getAssociations_Linux_SambaPrinterAdminForGlobal(cc, false, false, null, null);
            adapter.getFcoHelper().delete(list, cc);
        	loadGlobalPrinterAdmins();
        }
        else if (checked && !adminsBySambaUserName.contains(userName))
        {
        	Linux_SambaPrinterAdminForGlobal assoc = new Linux_SambaPrinterAdminForGlobal(cc,adapter.getNamespace());
        	assoc.set_GroupComponent_Linux_SambaGlobalOptions(service.getGlobalOptions());
        	assoc.set_PartComponent_Linux_SambaUser(fco);
        	adapter.getFcoHelper().create(assoc,cc);
        	loadGlobalPrinterAdmins();
        }
		
		return null;
	}

	/**
	 * Called from commandline
	 * @param container
	 * @return
	 * @throws WbemsmtException 
	 */
	public MessageList save(AdminUsersInPrinterGlobals container) throws WbemsmtException {
		User user = getCurrenUser(container, service);
        Linux_SambaUser fco = user.getUser();
        return save(container,fco);		
	}
	
	public Set<String> getAdminUsers() throws WbemsmtException
	{
		return adminsBySambaUserName;
	}

	public MessageList revert(AdminUsersInPrinterGlobals container, Linux_SambaUser fco) throws WbemsmtException {
		loadGlobalPrinterAdmins();
		return null;
	}

	public MessageList revert(PrintingGlobalsDataContainer container) throws WbemsmtException {
		
		globalPrintingOptions1 = null;

		container.getAdapter().revert(container.getUsers(),service.getUsers().getFCOs());

        reloadChilds = true;
        reloadChilds();
        resetPrinterAcl(service);
        resetPrinterChilds(service);
        resetUserAcl(service);
		return null;
	}

	public MessageList revert(AdminUsersInPrinterGlobals container) throws WbemsmtException {
		loadGlobalPrinterAdmins();
		return null;
	}


}
