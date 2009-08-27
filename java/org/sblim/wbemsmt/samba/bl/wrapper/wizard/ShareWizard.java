 /** 
  * ShareWizard.java
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
  * Description: Wrapper for Share Wizard
  *  
  */
package org.sblim.wbemsmt.samba.bl.wrapper.wizard;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.cim.CIMProperty;
import javax.cim.UnsignedInteger16;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter;
import org.sblim.wbemsmt.samba.bl.container.wizard.*;
import org.sblim.wbemsmt.samba.bl.fco.*;
import org.sblim.wbemsmt.samba.bl.wrapper.Service;

public class ShareWizard   extends SambaWizard{

	private ShareWizardPage1 page1;
	private ShareWizardPage2 page2;
//	private DataContainer page3;
	private ShareWizardPage4 page4;
	private DataContainer lastcontainer;
	private int listCount;
	private Set<ShareWizardPage2> updatedContainers = new HashSet<ShareWizardPage2>();
//	private static final DecimalFormat FORMAT_MASK = new DecimalFormat("0000");

	public ShareWizard(SambaCimAdapter adapter) {
		super(adapter);
	}

	public void create(ShareWizardPage4 container) throws WbemsmtException {
	    try {
    		Linux_SambaShareOptions share = new Linux_SambaShareOptions(adapter.getCimClient(),adapter.getNamespace());
    		WBEMClient cc = adapter.getCimClient();
    		MessageList.init(container);
			share.set_key_Name((String) page1.get_Name().getConvertedControlValue());
			share.set_Path((String) page1.get_Path().getConvertedControlValue());
			share.set_Comment((String) page1.get_Comment().getConvertedControlValue());
			setInstanceId(share);
			share = (Linux_SambaShareOptions) adapter.getFcoHelper().create(share,cc);
			container.setKey(new CimObjectKey(share.getCimObjectPath()));
			
			boolean enableGuest  = ((Boolean)page2.get_usr_EnableGuest().getConvertedControlValue()).booleanValue();
			boolean publicShare = ((Boolean)page2.get_usr_SeenByEverybody().getConvertedControlValue()).booleanValue();

			createForceUser(share);
			createBrowseOpts(share, publicShare);
			createCommonSec(share, enableGuest);			
			createShareSec(share);			
			createFilenameHandlingOpts(share);			
			createProtocolOpts(share);			

			createUserAcl(share);
			
			//next time in the wizard is first time
			updatedContainers.clear();
			
			//reload the tree for this adapter
			adapter.setMarkedForReload();
			//select the share in the Tree
			adapter.setPathOfTreeNode(share.getCimObjectPath());

		} catch (Exception e) {
			throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,adapter.getBundle().getString("cannot.create.share"),e);
		}
	}

	private void createForceUser(Linux_SambaShareOptions share) throws WbemsmtException {
		try {
            UnsignedInteger16 index = (UnsignedInteger16) page2.get_usr_ForceUser().getConvertedControlValue();
            //first element is the "no force user text" so subtract one to get the right user
            if (index != null && index.intValue() > 0)
            {
            	Linux_SambaUser user = ((SambaCimAdapter) page4.getAdapter()).getSelectedService().getUsers().getUser(index.intValue()-1).getUser();
            	Linux_SambaForceUserForShare newForceUserAssoc = new Linux_SambaForceUserForShare(adapter.getCimClient(),adapter.getNamespace());
            	newForceUserAssoc.set_GroupComponent_Linux_SambaShareOptions(share);
            	newForceUserAssoc.set_PartComponent_Linux_SambaUser(user);
            	adapter.getFcoHelper().create(newForceUserAssoc,adapter.getCimClient());
            	
            }
        }
        catch (Exception e) {
            throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,e);
        }
	}

	private void createUserAcl(Linux_SambaShareOptions share) throws WbemsmtException {
		List<UserInShareWizardACLItemDataContainer> items = page4.getUsers();
		for (int i=0; i < items.size(); i++)
		{
		    UserInShareWizardACLItemDataContainer item = (UserInShareWizardACLItemDataContainer)items.get(i);
            boolean admin = ((Boolean)item.get_usr_Admin().getConvertedControlValue()).booleanValue();
            Linux_SambaUser user = adapter.getSelectedService().getUsers().getUser(i).getUser();
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
	
	private void createFilenameHandlingOpts(Linux_SambaShareOptions share) throws WbemsmtException {
		try {
			Linux_SambaShareFileNameHandlingOptions child = 
				(Linux_SambaShareFileNameHandlingOptions) getFirstChild(Linux_SambaShareFileNameHandlingOptions.class,share.getAssociated_Linux_SambaShareFileNameHandlingOptions_Linux_SambaShareFileNameHandlingForShareNames(adapter.getCimClient()),false);
			adapter.getFcoHelper().save(child,adapter.getCimClient());
		} catch (Exception e) {
			throw new WbemsmtException(WbemsmtException.ERR_SAVE_OBJECT,e);
		}
	}

	private void createProtocolOpts(Linux_SambaShareOptions share) throws WbemsmtException {
		try {
			Linux_SambaShareProtocolOptions child = 
				(Linux_SambaShareProtocolOptions) getFirstChild(Linux_SambaShareProtocolOptions.class,share.getAssociated_Linux_SambaShareProtocolOptions_Linux_SambaShareProtocolForShareNames(adapter.getCimClient()),false);
			adapter.getFcoHelper().save(child,adapter.getCimClient());
		} catch (Exception e) {
			throw new WbemsmtException(WbemsmtException.ERR_SAVE_OBJECT,e);
		}
	}

	private void createCommonSec(Linux_SambaShareOptions share, boolean enableGuest) throws WbemsmtException {
		try {
			Linux_SambaCommonSecurityOptions child = 
				(Linux_SambaCommonSecurityOptions) getFirstChild(Linux_SambaCommonSecurityOptions.class,share.getAssociated_Linux_SambaCommonSecurityOptions_Linux_SambaCommonSecurityForShareNames(adapter.getCimClient()),false);
			child.set_GuestOK(new Boolean(enableGuest));
			adapter.getFcoHelper().save(child,adapter.getCimClient());
		} catch (Exception e) {
			throw new WbemsmtException(WbemsmtException.ERR_SAVE_OBJECT,e);
		}
		
	}

	private void createShareSec(Linux_SambaShareOptions share) throws WbemsmtException {
//		Linux_SambaShareSecurityOptions child;
//		child = (Linux_SambaShareSecurityOptions) getFirstChild(adapter.getCimClient(),Linux_SambaShareSecurityOptions.class,share.getAssociated_Linux_SambaShareSecurityOptions_Linux_SambaShareSecurityForShare_Names(adapter.getCimClient(),false),false);
//		child.set_CreateMask(new UnsignedInteger16(Integer.parseInt((String) page4.get_CreateMask().getConvertedControlValue())));
//		child.set_DirectoryMask(new UnsignedInteger16(Integer.parseInt((String) page4.get_DirectoryMask().getConvertedControlValue())));
//		child.set_DirectorySecurityMask(new UnsignedInteger16(Integer.parseInt((String) page4.get_DirectorySecurityMask().getConvertedControlValue())));
//		adapter.getFcoHelper().save(child,adapter.getCimClient());
		
	}

	private void createBrowseOpts(Linux_SambaShareOptions share, boolean publicShare) throws WbemsmtException {
		try {
			Linux_SambaShareBrowseOptions child = 
				(Linux_SambaShareBrowseOptions) getFirstChild(Linux_SambaShareBrowseOptions.class,share.getAssociated_Linux_SambaShareBrowseOptions_Linux_SambaShareBrowseForShareNames(adapter.getCimClient()),false);

			child.set_Browsable(new Boolean(publicShare));
			adapter.getFcoHelper().save(child,adapter.getCimClient());
		} catch (Exception e) {
			throw new WbemsmtException(WbemsmtException.ERR_SAVE_OBJECT,e);
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

	public void updateControls(ShareWizardPage2 container) throws WbemsmtException {
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

	public void updateControls(ShareWizardPage4 container) throws WbemsmtException
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
//				UnsignedInteger16 createMask = updateModel(
//						p3.get_usr_Create_u(),p3.get_usr_Create_g(),p3.get_usr_Create_s(),
//						p3.get_usr_Create_user_r(),p3.get_usr_Create_user_w(),p3.get_usr_Create_user_x(),
//						p3.get_usr_Create_group_r(),p3.get_usr_Create_group_w(),p3.get_usr_Create_group_x(),
//						p3.get_usr_Create_other_r(),p3.get_usr_Create_other_w(),p3.get_usr_Create_other_x()
//				);
//				container.get_CreateMask().setControlValue(FORMAT_MASK.format(createMask.intValue()));
//			} catch (ObjectSaveException e) {
//				throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS,"Canot create CreateMask for share " + sharename );
//			}
//			try {
//				UnsignedInteger16 directoryMask = updateModel(
//						p3.get_usr_Directory_u(),p3.get_usr_Directory_g(),p3.get_usr_Directory_s(),
//						p3.get_usr_Directory_user_r(),p3.get_usr_Directory_user_w(),p3.get_usr_Directory_user_x(),
//						p3.get_usr_Directory_group_r(),p3.get_usr_Directory_group_w(),p3.get_usr_Directory_group_x(),
//						p3.get_usr_Directory_other_r(),p3.get_usr_Directory_other_w(),p3.get_usr_Directory_other_x()
//				);
//				container.get_DirectoryMask().setControlValue(FORMAT_MASK.format(directoryMask.intValue()));
//			} catch (ObjectSaveException e) {
//				throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS,"Canot create DirectoryMask for share " + sharename);
//			}
//			try {
//				UnsignedInteger16 directorySecurityMask = updateModel(
//						p3.get_usr_Directory_security_u(),p3.get_usr_Directory_security_g(),p3.get_usr_Directory_security_s(),
//						p3.get_usr_Directory_security_user_r(),p3.get_usr_Directory_security_user_w(),p3.get_usr_Directory_security_user_x(),
//						p3.get_usr_Directory_security_group_r(),p3.get_usr_Directory_security_group_w(),p3.get_usr_Directory_security_group_x(),
//						p3.get_usr_Directory_security_other_r(),p3.get_usr_Directory_security_other_w(),p3.get_usr_Directory_security_other_x()
//				);
//				container.get_DirectorySecurityMask().setControlValue(FORMAT_MASK.format(directorySecurityMask.intValue()));
//			} catch (ObjectSaveException e) {
//				throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS,"Canot create DirectorySecurityMask for share " + sharename);
//			}
//		}
//		else 
//		{
//			throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS,"Cannot create object with page3 is instanceof " +(  page3 != null ? page3.getClass().getName() : "null"));
//		}

//overwrite the values on the lastPage with default values if there is no value set and the enable All-Checkbox is active
        listCount = 0;
        adapter.updateControls(container.getUsers(),adapter.getSelectedService().getUsers().getFCOs());
	}
	
	public void updateControls(UserInShareWizardACLItemDataContainer container, Linux_SambaUser fco) throws WbemsmtException {
		container.get_SambaUserName().setControlValue(fco.get_key_SambaUserName());
		container.get_usr_AccessTypeRW().setValues(getReadWriteTypes(adapter.getBundle()));
		container.get_usr_AccessTypeVI().setValues(getValidInvalidTypes(adapter.getBundle()));
		
		
		boolean lastPage = lastcontainer == page4;
		container.get_usr_AccessTypeVI().getProperties().setReadOnly(lastPage);
		container.get_usr_AccessTypeRW().getProperties().setReadOnly(lastPage);
		container.get_usr_Admin().getProperties().setReadOnly(lastPage);
		
		if (lastPage)
		{
			UserInShareWizardACLItemDataContainer page2Container = (UserInShareWizardACLItemDataContainer) page2.getUsers().get(listCount);			
			container.get_usr_AccessTypeRW().setControlValue(page2Container.get_usr_AccessTypeRW().getConvertedControlValue());
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
			updateValidInvalidWithUserList(container,container.get_usr_AccessTypeVI(), fco.get_key_SambaUserName(), srv.getInvalidUsers(), srv.getValidUsers(), false, srv);
            updateReadWriteWithUserList(container,container.get_usr_AccessTypeRW(), fco.get_key_SambaUserName(), srv.getReadUsers(), srv.getWriteUsers(), false, srv);
            updateAdminWithUserList(container,container.get_usr_Admin(), fco.get_key_SambaUserName(), srv.getAdminUsers(), srv,adapter.getSelectedService().getAdminUsers(), false);
		}
	}

	public void updateModel(ShareWizardPage2 container) {
		
		if (adapter.getUpdateTrigger() == container.get_usr_EnableAllUsers())
		{
			List<UserInShareWizardACLItemDataContainer> items = page2.getUsers();
			changeAllUsers(items,container);
		}

	}

	private void changeAllUsers(List<UserInShareWizardACLItemDataContainer> items,ShareWizardPage2 container) {

		boolean enableAll = ((Boolean)container.get_usr_EnableAllUsers().getConvertedControlValue()).booleanValue();
		
		for (int i=0; i < items.size(); i++)
		{
			UserInShareWizardACLItemDataContainer item = (UserInShareWizardACLItemDataContainer)items.get(i);
			item.get_usr_AccessTypeVI().setControlValue(new UnsignedInteger16(enableAll ? USR_ACL_IDX_ENABLE : USR_ACL_IDX_DISABLE));
			item.get_usr_AccessTypeRW().setControlValue(enableAll ?  new UnsignedInteger16(USR_ACL_IDX_WRITE) : null);
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
