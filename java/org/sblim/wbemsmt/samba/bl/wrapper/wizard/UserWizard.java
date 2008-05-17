 /** 
  * UserWizard.java
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
  * Description: Wrapper for User Wizard
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper.wizard;

import java.util.List;

import javax.cim.CIMProperty;
import javax.cim.UnsignedInteger16;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter;
import org.sblim.wbemsmt.samba.bl.container.wizard.*;
import org.sblim.wbemsmt.samba.bl.fco.*;

public class UserWizard extends SambaWizard {

	private UserWizardPage1 page1;
	private UserWizardPage2 page2;
	private UserWizardPage3 page3;
	private DataContainer lastcontainer;
	private int listCount;

	public UserWizard(SambaCimAdapter adapter) {
		super(adapter);
	}

	public void updateControls(UserWizardPage1 container) throws WbemsmtException {
		this.lastcontainer = this.page1 = container;
		container.get_SystemUserName().setValues(adapter.getSelectedService().getSystemUsers( ).getNameArray());
	}

	public void updateControls(UserWizardPage2 container) throws WbemsmtException {
		this.lastcontainer = this.page2 = container;
        adapter.updateControls(container.getPrinters(),adapter.getSelectedService().getPrinters().getFCOs());
        adapter.updateControls(container.getShares(),adapter.getSelectedService().getShares().getFCOs());
	}

	public void updateControls(UserWizardPage3 container) throws WbemsmtException {
		this.lastcontainer = this.page3 = container;
		
		container.get_SambaUserName().setControlValue(page1.get_SambaUserName().getConvertedControlValue());
        
        container.get_SystemUserName().setControlValue(getSysUserName( ));
        
        container.get_usr_IsGuest().setControlValue(page1.get_usr_IsGuest().getConvertedControlValue());
        
        listCount = 0;
        adapter.updateControls(container.getShares(),adapter.getSelectedService().getShares().getFCOs());
        listCount = 0;
        adapter.updateControls(container.getPrinters(),adapter.getSelectedService().getPrinters().getFCOs());
	}

	private String getSysUserName() throws WbemsmtException {
		String sysUserName = null; 
		UnsignedInteger16 userIdx = (UnsignedInteger16) page1.get_SystemUserName().getConvertedControlValue();
		if (userIdx != null)
		{
			sysUserName = adapter.getSelectedService().getSystemUsers().getSystemUser(userIdx.intValue()).getName();
		}
		return sysUserName;
	}

	public void updateControls(ShareInUserWizardACLItemDataContainer container, Linux_SambaShareOptions fco) throws WbemsmtException {
		container.get_usr_AccessTypeVI().setValues(getValidInvalidTypes(container.getAdapter().getBundle()));
		container.get_usr_AccessTypeRW().setValues(getReadWriteTypes(container.getAdapter().getBundle()));
		container.get_ShareName().setControlValue(fco.get_key_Name());		
		
		
		boolean lastPage = lastcontainer == page3;

		container.get_usr_AccessTypeVI().getProperties().setReadOnly(lastPage);
		container.get_usr_AccessTypeRW().getProperties().setReadOnly(lastPage);
		container.get_usr_Admin().getProperties().setReadOnly(lastPage);
		
		if (lastPage)
		{
			ShareInUserWizardACLItemDataContainer page3Container = (ShareInUserWizardACLItemDataContainer) page2.getShares().get(listCount);
			container.get_usr_AccessTypeVI().setControlValue(page3Container.get_usr_AccessTypeVI().getConvertedControlValue());
			container.get_usr_AccessTypeRW().setControlValue(page3Container.get_usr_AccessTypeRW().getConvertedControlValue());
			container.get_usr_Admin().setControlValue(page3Container.get_usr_Admin().getConvertedControlValue());
			listCount++;
		}
	}

	public void updateControls(PrinterInUserWizardACLItemDataContainer container, Linux_SambaPrinterOptions fco) {
		container.get_usr_AccessTypeVI().setValues(getValidInvalidTypes(container.getAdapter().getBundle()));
		container.get_usr_AccessTypeRW().setValues(getReadWriteTypes(container.getAdapter().getBundle()));
		container.get_PrinterName().setControlValue(fco.get_key_Name());		

		boolean lastPage = lastcontainer == page3;

		container.get_usr_AccessTypeVI().getProperties().setReadOnly(lastPage);
		container.get_usr_AccessTypeRW().getProperties().setReadOnly(lastPage);
		container.get_usr_Admin().getProperties().setReadOnly(lastPage);
		
		if (lastPage)
		{
			PrinterInUserWizardACLItemDataContainer page3Container = (PrinterInUserWizardACLItemDataContainer) page2.getPrinters().get(listCount);
			container.get_usr_AccessTypeVI().setControlValue(page3Container.get_usr_AccessTypeVI().getConvertedControlValue());
			container.get_usr_AccessTypeRW().setControlValue(page3Container.get_usr_AccessTypeRW().getConvertedControlValue());
			container.get_usr_Admin().setControlValue(page3Container.get_usr_Admin().getConvertedControlValue());
			listCount++;
		}
	
	}

	public void updateModel(UserWizardPage2 container) {
		if (adapter.getUpdateTrigger() == container.get_usr_AccessToAll())
		{
			changeAllUsers(container);
		}
	}

	public void updateModel(UserWizardPage1 container) {
	}

	private void changeAllUsers(UserWizardPage2 container) {

		boolean enableAll = ((Boolean)container.get_usr_AccessToAll().getConvertedControlValue()).booleanValue();
		
		List items = container.getShares();
		for (int i=0; i < items.size(); i++)
		{
			ShareInUserWizardACLItemDataContainer item = (ShareInUserWizardACLItemDataContainer)items.get(i);
			item.get_usr_AccessTypeVI().setControlValue(new UnsignedInteger16(enableAll ? USR_ACL_IDX_ENABLE : USR_ACL_IDX_DISABLE));
			item.get_usr_AccessTypeRW().setControlValue(enableAll ?  new UnsignedInteger16(USR_ACL_IDX_WRITE) : null);
		}

		items = container.getPrinters();
		for (int i=0; i < items.size(); i++)
		{
			PrinterInUserWizardACLItemDataContainer item = (PrinterInUserWizardACLItemDataContainer)items.get(i);
			item.get_usr_AccessTypeVI().setControlValue(new UnsignedInteger16(enableAll ? USR_ACL_IDX_ENABLE : USR_ACL_IDX_DISABLE));
			item.get_usr_AccessTypeRW().setControlValue(enableAll ?  new UnsignedInteger16(USR_ACL_IDX_WRITE) : null);
		}
	}
	public void create(UserWizardPage3 container) throws WbemsmtException {
		
	    Linux_SambaUser user = new Linux_SambaUser(adapter.getCimClient(),adapter.getNamespace());
        WBEMClient cc = adapter.getCimClient();
        user.set_key_SambaUserName((String) page1.get_SambaUserName().getConvertedControlValue());
        user.set_SambaUserPassword((String) page1.get_SambaUserPassword().getConvertedControlValue());
        user.set_SystemUserName(getSysUserName());
        user = (Linux_SambaUser) adapter.getFcoHelper().create(user,cc);
        
        createShareAcl(user);
        createPrinterAcl(user);

        boolean guest = ((Boolean)page1.get_usr_IsGuest().getConvertedControlValue()).booleanValue();
        if (guest)
        {
        	adapter.getSelectedService().setGuestAccount(user);
        }

        adapter.setMarkedForReload();
        adapter.setPathOfTreeNode(user.getCimObjectPath());
		
	}

	private void createShareAcl(Linux_SambaUser user) throws WbemsmtException {
		List shares = page2.getShares();
		for (int i=0; i < shares.size(); i++)
		{
		    ShareInUserWizardACLItemDataContainer item = (ShareInUserWizardACLItemDataContainer)shares.get(i);
            boolean admin = ((Boolean)item.get_usr_Admin().getConvertedControlValue()).booleanValue();
            Linux_SambaShareOptions share = adapter.getSelectedService().getShares().getShare(i).getShare();
            String sambaUserName = user.get_key_SambaUserName();
   
            CIMProperty[] vKeyProperties = new CIMProperty[] {
                    Linux_SambaInvalidUsersForShare.create_GroupComponent_Linux_SambaShareOptions(adapter.getCimClient(), adapter.getNamespace(), share),
                    Linux_SambaInvalidUsersForShare.create_PartComponent_Linux_SambaUser(adapter.getCimClient(), adapter.getNamespace(), user)};

            save(admin, adapter.getSelectedService().getAdminUsers(),
            		Linux_SambaAdminUsersForShare.class, sambaUserName,
            		vKeyProperties);
            saveValidInvalid(item.get_usr_AccessTypeVI(), user,
            		adapter.getSelectedService().getInvalidUsers(), adapter.getSelectedService().getValidUsers(), vKeyProperties,
            		Linux_SambaInvalidUsersForShare.class,
            		Linux_SambaValidUsersForShare.class);
            saveReadWrite(item.get_usr_AccessTypeRW(), user, adapter.getSelectedService().getReadUsers(),
            		adapter.getSelectedService().getWriteUsers(), vKeyProperties,
            		Linux_SambaReadListForShare.class,
            		Linux_SambaWriteListForShare.class);
		}
	}
	
	private void createPrinterAcl(Linux_SambaUser user) throws WbemsmtException {
		List printers = page2.getPrinters();
		for (int i=0; i < printers.size(); i++)
		{
		    PrinterInUserWizardACLItemDataContainer item = (PrinterInUserWizardACLItemDataContainer)printers.get(i);
            boolean admin = ((Boolean)item.get_usr_Admin().getConvertedControlValue()).booleanValue();
            Linux_SambaPrinterOptions printer = adapter.getSelectedService().getPrinters().getPrinter(i).getPrinter();
            String sambaUserName = user.get_key_SambaUserName();
   
            CIMProperty[] vKeyProperties = new CIMProperty[] {
                    Linux_SambaInvalidUsersForPrinter.create_GroupComponent_Linux_SambaPrinterOptions(adapter.getCimClient(), adapter.getNamespace(), printer),
                    Linux_SambaInvalidUsersForPrinter.create_PartComponent_Linux_SambaUser(adapter.getCimClient(), adapter.getNamespace(), user)};

            save(admin, adapter.getSelectedService().getAdminUsers(),
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
	
}
