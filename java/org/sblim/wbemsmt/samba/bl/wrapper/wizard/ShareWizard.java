 /** 
  * ShareWizard.java
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
  * Description: Wrapper for Share Wizard
  *  
  */
package org.sblim.wbemsmt.samba.bl.wrapper.wizard;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.ObjectCreationException;
import org.sblim.wbemsmt.exception.ObjectSaveException;
import org.sblim.wbemsmt.exception.UpdateControlsException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter;
import org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1;
import org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2;
import org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3CMD;
import org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3GUI;
import org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4;
import org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaAdminUsersForShare;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaCommonSecurityOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaForceUserForShare;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaInvalidUsersForShare;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaReadListForShare;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareBrowseOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareFileNameHandlingOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareProtocolOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaValidUsersForShare;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaWriteListForShare;
import org.sblim.wbemsmt.samba.bl.wrapper.Service;

public class ShareWizard   extends SambaWizard{

	private ShareWizardPage1 page1;
	private ShareWizardPage2 page2;
//	private DataContainer page3;
	private ShareWizardPage4 page4;
	private DataContainer lastcontainer;
	private int listCount;
	private Set updatedContainers = new HashSet();
//	private static final DecimalFormat FORMAT_MASK = new DecimalFormat("0000");

	public ShareWizard(SambaCimAdapter adapter) {
		super(adapter);
	}

	public void create(ShareWizardPage4 container) throws ObjectCreationException {
		Linux_SambaShareOptions share = new Linux_SambaShareOptions();
		CIMClient cc = adapter.getCimClient();
		MessageList.init(container);
		try {
			share.set_Name((String) page1.get_Name().getConvertedControlValue());
			share.set_Path((String) page1.get_Path().getConvertedControlValue());
			share.set_Comment((String) page1.get_Comment().getConvertedControlValue());
			setInstanceId(share);
			share = (Linux_SambaShareOptions) adapter.getFcoHelper().create(share,cc);
			container.setKey(new CimObjectKey(share.getCimObjectPath()));
			
			boolean enableGuest  = ((Boolean)page2.get_usr_EnableGuest().getConvertedControlValue()).booleanValue();
			boolean publicShare = ((Boolean)page2.get_usr_SeenByEverybody().getConvertedControlValue()).booleanValue();

			createForceUser(share,cc);
			createBrowseOpts(share, cc, publicShare);
			createCommonSec(share, cc, enableGuest);			
			createShareSec(share, cc);			
			createFilenameHandlingOpts(share, cc);			
			createProtocolOpts(share, cc);			

			createUserAcl(cc, share);
			
			//next time in the wizard is first time
			updatedContainers.clear();
			
			//reload the tree for this adapter
			adapter.setMarkedForReload();
			//select the share in the Tree
			adapter.setPathOfTreeNode(share.getCimObjectPath());

		} catch (Exception e) {
			throw new ObjectCreationException(adapter.getBundle().getString("cannot.create.share"),e);
		}
	}

	private void createForceUser(Linux_SambaShareOptions share, CIMClient cc) throws ObjectCreationException {
		UnsignedInt16 index = (UnsignedInt16) page2.get_usr_ForceUser().getConvertedControlValue();
		//first element is the "no force user text" so subtract one to get the right user
		if (index != null && index.intValue() > 0)
		{
			Linux_SambaUser user = ((SambaCimAdapter) page4.getAdapter()).getSelectedService().getUsers().getUser(index.intValue()-1).getUser();
			Linux_SambaForceUserForShare newForceUserAssoc = new Linux_SambaForceUserForShare();
			newForceUserAssoc.set_Linux_SambaShareOptions(share);
			newForceUserAssoc.set_Linux_SambaUser(user);
			adapter.getFcoHelper().create(newForceUserAssoc,cc);
			
		}
	}

	private void createUserAcl(CIMClient cc, Linux_SambaShareOptions share) throws ObjectSaveException {
		List items = page4.getUsers();
		for (int i=0; i < items.size(); i++)
		{
			UserInShareWizardACLItemDataContainer item = (UserInShareWizardACLItemDataContainer)items.get(i);
			boolean admin = ((Boolean)item.get_usr_Admin().getConvertedControlValue()).booleanValue();
			Linux_SambaUser user = adapter.getSelectedService().getUsers().getUser(i).getUser();
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
	
	private void createFilenameHandlingOpts(Linux_SambaShareOptions share, CIMClient cc) throws ObjectSaveException {
		try {
			Linux_SambaShareFileNameHandlingOptions child = 
				(Linux_SambaShareFileNameHandlingOptions) getFirstChild(Linux_SambaShareFileNameHandlingOptions.class,share.getAssociated_Linux_SambaShareFileNameHandlingOptions_Linux_SambaShareFileNameHandlingForShare_Names(cc,false),false);
			adapter.getFcoHelper().save(child,cc);
		} catch (ModelLoadException e) {
			throw new ObjectSaveException(e);
		}
	}

	private void createProtocolOpts(Linux_SambaShareOptions share, CIMClient cc) throws ObjectSaveException {
		try {
			Linux_SambaShareProtocolOptions child = 
				(Linux_SambaShareProtocolOptions) getFirstChild(Linux_SambaShareProtocolOptions.class,share.getAssociated_Linux_SambaShareProtocolOptions_Linux_SambaShareProtocolForShare_Names(cc,false),false);
			adapter.getFcoHelper().save(child,cc);
		} catch (ModelLoadException e) {
			throw new ObjectSaveException(e);
		}
	}

	private void createCommonSec(Linux_SambaShareOptions share, CIMClient cc, boolean enableGuest) throws ObjectSaveException {
		try {
			Linux_SambaCommonSecurityOptions child = 
				(Linux_SambaCommonSecurityOptions) getFirstChild(Linux_SambaCommonSecurityOptions.class,share.getAssociated_Linux_SambaCommonSecurityOptions_Linux_SambaCommonSecurityForShare_Names(cc,false),false);
			child.set_GuestOK(new Boolean(enableGuest));
			adapter.getFcoHelper().save(child,cc);
		} catch (ModelLoadException e) {
			throw new ObjectSaveException(e);
		}
		
	}

	private void createShareSec(Linux_SambaShareOptions share, CIMClient cc) throws ObjectSaveException {
//		Linux_SambaShareSecurityOptions child;
//		try {
//			child = (Linux_SambaShareSecurityOptions) getFirstChild(cc,Linux_SambaShareSecurityOptions.class,share.getAssociated_Linux_SambaShareSecurityOptions_Linux_SambaShareSecurityForShare_Names(cc,false),false);
//		} catch (ModelLoadException e1) {
//			throw new ObjectSaveException("Cannot find Linux_SambaShareSecurityOptions for Share " + share.get_Name(),e1);
//		}
//		child.set_CreateMask(new UnsignedInt16(Integer.parseInt((String) page4.get_CreateMask().getConvertedControlValue())));
//		child.set_DirectoryMask(new UnsignedInt16(Integer.parseInt((String) page4.get_DirectoryMask().getConvertedControlValue())));
//		child.set_DirectorySecurityMask(new UnsignedInt16(Integer.parseInt((String) page4.get_DirectorySecurityMask().getConvertedControlValue())));
//		adapter.getFcoHelper().save(child,cc);
		
	}

	private void createBrowseOpts(Linux_SambaShareOptions share, CIMClient cc, boolean publicShare) throws ObjectSaveException {
		try {
			Linux_SambaShareBrowseOptions child = 
				(Linux_SambaShareBrowseOptions) getFirstChild(Linux_SambaShareBrowseOptions.class,share.getAssociated_Linux_SambaShareBrowseOptions_Linux_SambaShareBrowseForShare_Names(cc,false),false);

			child.set_Browsable(new Boolean(publicShare));
			adapter.getFcoHelper().save(child,cc);
		} catch (ModelLoadException e) {
			throw new ObjectSaveException(e);
		}
	}

	public void updateControls(ShareWizardPage3CMD container)
	{
//		lastcontainer = page3 = container;
	}
	public void updateControls(ShareWizardPage3GUI container)
	{
//		lastcontainer = page3 = container;
	}

	public void updateControls(ShareWizardPage2 container) throws UpdateControlsException {
		lastcontainer = page2 = container;
		
		super.updateForceUserForWizard(container,container.get_usr_ForceUser(),adapter.getSelectedService());
		
		if (!updatedContainers.contains(page2))
		{
			adapter.updateControls(container.getUsers(),adapter.getSelectedService().getUsers().getFCOs());
			updatedContainers.add(page2);
		}
		
	}

	public void updateControls(ShareWizardPage1 container) {
		lastcontainer = page1 = container;
	}

	public void updateControls(ShareWizardPage4 container) throws UpdateControlsException
	{
		lastcontainer = page4 = container;
		
		container.get_Name().setControlValue(page1.get_Name().getConvertedControlValue());
		container.get_Path().setControlValue(page1.get_Path().getConvertedControlValue());
		container.get_Comment().setControlValue(page1.get_Comment().getConvertedControlValue());
		container.get_usr_EnableGuest().setControlValue(page2.get_usr_EnableGuest().getConvertedControlValue());
		container.get_usr_SeenByEverybody().setControlValue(page2.get_usr_SeenByEverybody().getConvertedControlValue());

		super.setForceUserForWizardOverview(container, page2.get_usr_ForceUser(),page4.get_usr_ForceUser());
		
		//remove if the createMask etc is enabled again
		container.get_CreateMask().getProperties().setVisible(false);
		container.get_DirectoryMask().getProperties().setVisible(false);
		container.get_DirectorySecurityMask().getProperties().setVisible(false);
		
//		if (page3 instanceof ShareWizardPage3CMD)
//		{
//			ShareWizardPage3CMD cmd = (ShareWizardPage3CMD) page3;
//			container.get_CreateMask().setControlValue(cmd.get_CreateMask().getConvertedControlValue());
//			container.get_DirectoryMask().setControlValue(cmd.get_DirectorySecurityMask().getConvertedControlValue());
//			container.get_DirectorySecurityMask().setControlValue(cmd.get_DirectorySecurityMask().getConvertedControlValue());
//		}
//		else if (page3 instanceof ShareWizardPage3GUI)
//		{
//			ShareWizardPage3GUI p3 = (ShareWizardPage3GUI) page3;
//			String sharename = (String) page1.get_Name().getConvertedControlValue();
//			try {
//				UnsignedInt16 createMask = updateModel(
//						p3.get_usr_Create_u(),p3.get_usr_Create_g(),p3.get_usr_Create_s(),
//						p3.get_usr_Create_user_r(),p3.get_usr_Create_user_w(),p3.get_usr_Create_user_x(),
//						p3.get_usr_Create_group_r(),p3.get_usr_Create_group_w(),p3.get_usr_Create_group_x(),
//						p3.get_usr_Create_other_r(),p3.get_usr_Create_other_w(),p3.get_usr_Create_other_x()
//				);
//				container.get_CreateMask().setControlValue(FORMAT_MASK.format(createMask.intValue()));
//			} catch (ObjectSaveException e) {
//				throw new UpdateControlsException("Canot create CreateMask for share " + sharename );
//			}
//			try {
//				UnsignedInt16 directoryMask = updateModel(
//						p3.get_usr_Directory_u(),p3.get_usr_Directory_g(),p3.get_usr_Directory_s(),
//						p3.get_usr_Directory_user_r(),p3.get_usr_Directory_user_w(),p3.get_usr_Directory_user_x(),
//						p3.get_usr_Directory_group_r(),p3.get_usr_Directory_group_w(),p3.get_usr_Directory_group_x(),
//						p3.get_usr_Directory_other_r(),p3.get_usr_Directory_other_w(),p3.get_usr_Directory_other_x()
//				);
//				container.get_DirectoryMask().setControlValue(FORMAT_MASK.format(directoryMask.intValue()));
//			} catch (ObjectSaveException e) {
//				throw new UpdateControlsException("Canot create DirectoryMask for share " + sharename);
//			}
//			try {
//				UnsignedInt16 directorySecurityMask = updateModel(
//						p3.get_usr_Directory_security_u(),p3.get_usr_Directory_security_g(),p3.get_usr_Directory_security_s(),
//						p3.get_usr_Directory_security_user_r(),p3.get_usr_Directory_security_user_w(),p3.get_usr_Directory_security_user_x(),
//						p3.get_usr_Directory_security_group_r(),p3.get_usr_Directory_security_group_w(),p3.get_usr_Directory_security_group_x(),
//						p3.get_usr_Directory_security_other_r(),p3.get_usr_Directory_security_other_w(),p3.get_usr_Directory_security_other_x()
//				);
//				container.get_DirectorySecurityMask().setControlValue(FORMAT_MASK.format(directorySecurityMask.intValue()));
//			} catch (ObjectSaveException e) {
//				throw new UpdateControlsException("Canot create DirectorySecurityMask for share " + sharename);
//			}
//		}
//		else 
//		{
//			throw new UpdateControlsException("Cannot create object with page3 is instanceof " +(  page3 != null ? page3.getClass().getName() : "null"));
//		}
		
		//overwrite the values on the lastPage with default values if there is no value set and the enable All-Checkbox is active
		listCount = 0;
		adapter.updateControls(container.getUsers(),adapter.getSelectedService().getUsers().getFCOs());
	}
	
	public void updateControls(UserInShareWizardACLItemDataContainer container, Linux_SambaUser fco) throws UpdateControlsException {
		container.get_SambaUserName().setControlValue(fco.get_SambaUserName());
		container.get_usr_AccessTypeRW().setValues(getReadWriteTypes(adapter.getBundle()));
		container.get_usr_AccessTypeVI().setValues(getValidInvalidTypes(adapter.getBundle()));
		
		
		boolean lastPage = lastcontainer == page4;
		container.get_usr_AccessTypeVI().getProperties().setReadOnly(lastPage);
		container.get_usr_AccessTypeRW().getProperties().setReadOnly(lastPage);
		container.get_usr_Admin().getProperties().setReadOnly(lastPage);
		
		if (lastPage)
		{
			UserInShareWizardACLItemDataContainer page2Container = (UserInShareWizardACLItemDataContainer) page2.getUsers().get(listCount);			container.get_usr_AccessTypeRW().setControlValue(page2Container.get_usr_AccessTypeRW().getConvertedControlValue());
			container.get_usr_Admin().setControlValue(page2Container.get_usr_Admin().getConvertedControlValue());
			container.get_usr_AccessTypeRW().setControlValue(page2Container.get_usr_AccessTypeRW().getConvertedControlValue());
			container.get_usr_AccessTypeVI().setControlValue(page2Container.get_usr_AccessTypeVI().getConvertedControlValue());
			listCount++;
		} else {
			//if it's not the lastPage this updateControls should be only called the first time the panel is displayed 
			//to set the default values from global
			//use the globals's sets to get the default valus
			//becaus we are having no default values for the new printer and no associator call to get the "global-local-merged" entries
			//from the server
			Service srv = adapter.getSelectedService();
			CIMClient cc = adapter.getCimClient();
			try {
				updateValidInvalidWithUserList(container,container.get_usr_AccessTypeVI(), fco.get_SambaUserName(), srv.getInvalidUsers(cc), srv.getValidUsers(cc), false, srv,adapter.getCimClient());
				updateReadWriteWithUserList(container,container.get_usr_AccessTypeRW(), fco.get_SambaUserName(), srv.getReadUsers(cc), srv.getWriteUsers(cc), false, srv,adapter.getCimClient());
				updateAdminWithUserList(container,container.get_usr_Admin(), fco.get_SambaUserName(), srv.getAdminUsers(cc), srv,adapter.getCimClient(),adapter.getSelectedService().getAdminUsers(cc), false);
			} catch (ModelLoadException e) {
				throw new UpdateControlsException(e);
			}
		}
	}

	public void updateModel(ShareWizardPage2 container) {
		
		if (adapter.getUpdateTrigger() == container.get_usr_EnableAllUsers())
		{
			List items = page2.getUsers();
			changeAllUsers(items,container);
		}

	}

	private void changeAllUsers(List items,ShareWizardPage2 container) {

		boolean enableAll = ((Boolean)container.get_usr_EnableAllUsers().getConvertedControlValue()).booleanValue();
		
		for (int i=0; i < items.size(); i++)
		{
			UserInShareWizardACLItemDataContainer item = (UserInShareWizardACLItemDataContainer)items.get(i);
			item.get_usr_AccessTypeVI().setControlValue(new UnsignedInt16(enableAll ? USR_ACL_IDX_ENABLE : USR_ACL_IDX_DISABLE));
			item.get_usr_AccessTypeRW().setControlValue(enableAll ?  new UnsignedInt16(USR_ACL_IDX_WRITE) : null);
		}
	}

	public void updateModel(ShareWizardPage1 container) {
		//do nothing
	}

	public void updateModel(ShareWizardPage3GUI container) {
		//do nothing
	}

	public void updateModel(ShareWizardPage3CMD container) {
		// do nothing
	}

}
