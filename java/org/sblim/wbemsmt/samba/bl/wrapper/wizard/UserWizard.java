 /** 
  * UserWizard.java
  *
  * (C) Copyright IBM Corp. 2005
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
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.fco.FcoHelper;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.ObjectCreationException;
import org.sblim.wbemsmt.exception.ObjectSaveException;
import org.sblim.wbemsmt.exception.UpdateControlsException;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter;
import org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1;
import org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2;
import org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaAdminUsersForShare;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaInvalidUsersForPrinter;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaInvalidUsersForShare;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterAdminForPrinter;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaReadListForPrinter;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaReadListForShare;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaValidUsersForPrinter;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaValidUsersForShare;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaWriteListForPrinter;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaWriteListForShare;

public class UserWizard extends SambaWizard {

	private UserWizardPage1 page1;
	private UserWizardPage2 page2;
	private UserWizardPage3 page3;
	private DataContainer lastcontainer;
	private int listCount;

	public UserWizard(SambaCimAdapter adapter) {
		super(adapter);
	}

	public void updateControls(UserWizardPage1 container) throws UpdateControlsException {
		this.lastcontainer = this.page1 = container;
		CIMClient cc = container.getAdapter().getCimClient();
		try {
			container.get_SystemUserName().setValues(adapter.getSelectedService().getSystemUsers(cc ).getNameArray());
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
	}

	public void updateControls(UserWizardPage2 container) throws UpdateControlsException {
		this.lastcontainer = this.page2 = container;
		adapter.updateControls(container.getPrinters(),adapter.getSelectedService().getPrinters().getFCOs());
		adapter.updateControls(container.getShares(),adapter.getSelectedService().getShares().getFCOs());
	}

	public void updateControls(UserWizardPage3 container) throws UpdateControlsException {
		this.lastcontainer = this.page3 = container;
		
		try {
			container.get_SambaUserName().setControlValue(page1.get_SambaUserName().getConvertedControlValue());
			
			CIMClient cc = container.getAdapter().getCimClient();
			container.get_SystemUserName().setControlValue(getSysUserName(cc ));
			
			container.get_usr_IsGuest().setControlValue(page1.get_usr_IsGuest().getConvertedControlValue());
			
			listCount = 0;
			adapter.updateControls(container.getShares(),adapter.getSelectedService().getShares().getFCOs());
			listCount = 0;
			adapter.updateControls(container.getPrinters(),adapter.getSelectedService().getPrinters().getFCOs());
			
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
	}

	private String getSysUserName(CIMClient cc) throws ModelLoadException {
		String sysUserName = null; 
		UnsignedInt16 userIdx = (UnsignedInt16) page1.get_SystemUserName().getConvertedControlValue();
		if (userIdx != null)
		{
			sysUserName = adapter.getSelectedService().getSystemUsers(cc).getSystemUser(userIdx.intValue()).getName();
		}
		return sysUserName;
	}

	public void updateControls(ShareInUserWizardACLItemDataContainer container, Linux_SambaShareOptions fco) throws UpdateControlsException {
		container.get_usr_AccessTypeVI().setValues(getValidInvalidTypes(container.getAdapter().getBundle()));
		container.get_usr_AccessTypeRW().setValues(getReadWriteTypes(container.getAdapter().getBundle()));
		container.get_ShareName().setControlValue(fco.get_Name());		
		
		
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
		container.get_PrinterName().setControlValue(fco.get_Name());		

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
			item.get_usr_AccessTypeVI().setControlValue(new UnsignedInt16(enableAll ? USR_ACL_IDX_ENABLE : USR_ACL_IDX_DISABLE));
			item.get_usr_AccessTypeRW().setControlValue(enableAll ?  new UnsignedInt16(USR_ACL_IDX_WRITE) : null);
		}

		items = container.getPrinters();
		for (int i=0; i < items.size(); i++)
		{
			PrinterInUserWizardACLItemDataContainer item = (PrinterInUserWizardACLItemDataContainer)items.get(i);
			item.get_usr_AccessTypeVI().setControlValue(new UnsignedInt16(enableAll ? USR_ACL_IDX_ENABLE : USR_ACL_IDX_DISABLE));
			item.get_usr_AccessTypeRW().setControlValue(enableAll ?  new UnsignedInt16(USR_ACL_IDX_WRITE) : null);
		}
	}
	public void create(UserWizardPage3 container) throws ObjectCreationException {
		
		Linux_SambaUser user = new Linux_SambaUser();
		CIMClient cc = adapter.getCimClient();
		try {
			user.set_SambaUserName((String) page1.get_SambaUserName().getConvertedControlValue());
			user.set_SambaUserPassword((String) page1.get_SambaUserPassword().getConvertedControlValue());
			user.set_SystemUserName(getSysUserName(cc));
			user = (Linux_SambaUser) FcoHelper.create(user,cc);
			
			createShareAcl(cc, user);
			createPrinterAcl(cc, user);

			boolean guest = ((Boolean)page1.get_usr_IsGuest().getConvertedControlValue()).booleanValue();
			if (guest)
			{
				adapter.getSelectedService().setGuestAccount(cc,user);
			}

			//reload
			if (adapter.getRootNode()!= null)
			{
				adapter.getRootNode().readSubnodes(true);
			}

		} catch (ObjectCreationException e) {
			throw e;
		} catch (WbemSmtException e) {
			throw new ObjectCreationException(adapter.getBundle().getString("cannot.create.user"),e);
		}
		
	}

	private void createShareAcl(CIMClient cc, Linux_SambaUser user) throws ObjectSaveException {
		List shares = page2.getShares();
		for (int i=0; i < shares.size(); i++)
		{
			ShareInUserWizardACLItemDataContainer item = (ShareInUserWizardACLItemDataContainer)shares.get(i);
			boolean admin = ((Boolean)item.get_usr_Admin().getConvertedControlValue()).booleanValue();
			Linux_SambaShareOptions share = adapter.getSelectedService().getShares().getShare(i).getShare();
			String sambaUserName = user.get_SambaUserName();

			Vector vKeyProperties = new Vector();
			vKeyProperties.add(new CIMProperty(Linux_SambaInvalidUsersForShare.CIM_PROPERTY_LINUX_SAMBAUSER, new CIMValue(user.getCimObjectPath(), new CIMDataType(Linux_SambaUser.CIM_CLASS_NAME))));
			vKeyProperties.add(new CIMProperty(Linux_SambaInvalidUsersForShare.CIM_PROPERTY_LINUX_SAMBASHAREOPTIONS, new CIMValue(share.getCimObjectPath(), new CIMDataType(Linux_SambaShareOptions.CIM_CLASS_NAME))));

			try {
				save(admin, adapter.getSelectedService().getAdminUsers(cc),
						Linux_SambaAdminUsersForShare.class, sambaUserName,
						vKeyProperties, cc);
				saveValidInvalid(item.get_usr_AccessTypeVI(), user,
						adapter.getSelectedService().getInvalidUsers(cc), adapter.getSelectedService().getValidUsers(cc), cc, vKeyProperties,
						Linux_SambaInvalidUsersForShare.class,
						Linux_SambaValidUsersForShare.class);
				saveReadWrite(item.get_usr_AccessTypeRW(), user, adapter.getSelectedService().getReadUsers(cc),
						adapter.getSelectedService().getWriteUsers(cc), cc, vKeyProperties,
						Linux_SambaReadListForShare.class,
						Linux_SambaWriteListForShare.class);
			} catch (ModelLoadException e) {
				throw new ObjectSaveException(e);
			}
		}
	}
	
	private void createPrinterAcl(CIMClient cc, Linux_SambaUser user) throws ObjectSaveException {
		List printers = page2.getPrinters();
		for (int i=0; i < printers.size(); i++)
		{
			PrinterInUserWizardACLItemDataContainer item = (PrinterInUserWizardACLItemDataContainer)printers.get(i);
			boolean admin = ((Boolean)item.get_usr_Admin().getConvertedControlValue()).booleanValue();
			Linux_SambaPrinterOptions printer = adapter.getSelectedService().getPrinters().getPrinter(i).getPrinter();
			String sambaUserName = user.get_SambaUserName();

			Vector vKeyProperties = new Vector();
			vKeyProperties.add(new CIMProperty(Linux_SambaInvalidUsersForPrinter.CIM_PROPERTY_LINUX_SAMBAUSER, new CIMValue(user.getCimObjectPath(), new CIMDataType(Linux_SambaUser.CIM_CLASS_NAME))));
			vKeyProperties.add(new CIMProperty(Linux_SambaInvalidUsersForPrinter.CIM_PROPERTY_LINUX_SAMBAPRINTEROPTIONS, new CIMValue(printer.getCimObjectPath(), new CIMDataType(Linux_SambaShareOptions.CIM_CLASS_NAME))));

			try {
				save(admin, adapter.getSelectedService().getAdminUsers(cc),
						Linux_SambaPrinterAdminForPrinter.class, sambaUserName,
						vKeyProperties, cc);
				saveValidInvalid(item.get_usr_AccessTypeVI(), user,
						adapter.getSelectedService().getInvalidUsers(cc), adapter.getSelectedService().getValidUsers(cc), cc, vKeyProperties,
						Linux_SambaInvalidUsersForPrinter.class,
						Linux_SambaValidUsersForPrinter.class);
				saveReadWrite(item.get_usr_AccessTypeRW(), user, adapter.getSelectedService().getReadUsers(cc),
						adapter.getSelectedService().getWriteUsers(cc), cc, vKeyProperties,
						Linux_SambaReadListForPrinter.class,
						Linux_SambaWriteListForPrinter.class);
			} catch (ModelLoadException e) {
				throw new ObjectSaveException(e);
			}
		}
	}
	
}
