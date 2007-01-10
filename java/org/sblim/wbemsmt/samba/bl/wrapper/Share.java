 /** 
  * Share.java
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
  * Description: Class for wrapping the Share business object and the related actions
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.bl.fco.FcoHelper;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.ModelUpdateException;
import org.sblim.wbemsmt.exception.ObjectRevertException;
import org.sblim.wbemsmt.exception.ObjectSaveException;
import org.sblim.wbemsmt.exception.UpdateControlsException;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaObject;
import org.sblim.wbemsmt.samba.bl.container.share.CMDShareFileAttributes;
import org.sblim.wbemsmt.samba.bl.container.share.GUIShareFileAttributes;
import org.sblim.wbemsmt.samba.bl.container.share.ShareAllowHostSecurityDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.ShareDenyHostSecurityDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.ShareFileAttributes;
import org.sblim.wbemsmt.samba.bl.container.share.ShareOptionsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.UserACLItemDataContainerForShare;
import org.sblim.wbemsmt.samba.bl.container.share.UserInShareACLDataContainer;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaAdminUsersForShare;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaCommonSecurityOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaForceUserForShare;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaGlobalOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaGlobalProtocolOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaInvalidUsersForShare;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaReadListForShare;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareBrowseOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareFileNameHandlingOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareProtocolOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareSecurityOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaValidUsersForShare;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaWriteListForShare;

public class Share extends SambaObject
{

	protected Set allowHosts = new HashSet();
	protected Set denyHosts = new HashSet();
	protected Set invalidUsers = null;
	protected Set validUsers = null;
	protected Set readUsers = null;
	protected Set writeUsers = null;
	protected Set adminUsers = null;
	
	private Linux_SambaShareOptions share;

	//stores for each shareName a List of SambaUserNames
	private Linux_SambaShareBrowseOptions shareBrowseOptions = null;
	private Linux_SambaCommonSecurityOptions shareCommonSecurityOptions = null;
	private Linux_SambaShareSecurityOptions shareSecurityOptions = null;
	private Linux_SambaShareFileNameHandlingOptions fileNameHandlingOptions  = null;
	private Linux_SambaShareProtocolOptions protocolOptions =  null;
	private final Service service;
	private ArrayList listHostsToAllow;
	private ArrayList listHostsAllowed;
	private ArrayList listHostsDenied;
	private ArrayList listHostsToDeny;
	private boolean reloadShareUsers;
	private Linux_SambaUser forceUser;
	private final AbstractBaseCimAdapter adapter;
	public Share(Service service, Linux_SambaShareOptions share, AbstractBaseCimAdapter adapter) throws ModelLoadException {
		this.service = service;
		this.share = share;
		this.adapter = adapter;
	}

	public void loadChilds(CIMClient cimClient) throws ModelLoadException {
		

	}

	public void reloadChilds(CIMClient cimClient) throws ModelLoadException {

		getBrowseOptions(cimClient);
		getCommonSecurityOptions(cimClient);
		getShareSecurityOptions(cimClient);
		getFilenameHandlingOptions(cimClient);
		getProtocolOptions(cimClient);
		
		reloadShareUsers = reloadChilds;
		reloadShareUsers(cimClient);

		reloadChilds = false;
	}

	
	public void resetChilds()
	{
		shareBrowseOptions = null;
		shareCommonSecurityOptions = null;
		shareSecurityOptions = null;
		fileNameHandlingOptions = null;
		protocolOptions = null;
	}

	public void resetShareUsers()
	{
		invalidUsers = null;
		validUsers = null;
		writeUsers = null;
		readUsers = null;
		adminUsers = null;
	}

	public void reloadShareUsers(CIMClient cimClient) {

		getInvalidUsers(cimClient);
		getValidUsers(cimClient);
		getWriteUsers(cimClient);
		getReadUsers(cimClient);
		getAdminUsers(cimClient);
		
		reloadShareUsers = false;
		
	}

	private Set getAdminUsers(CIMClient cimClient) {
		
		if (adminUsers == null || reloadShareUsers)
		{
			adminUsers = new HashSet();
			setShareUsers(adminUsers,share.getAssociated_Linux_SambaUser_Linux_SambaAdminUsersForShare_Names(cimClient,false));
		}
		return adminUsers;
	}
		
	private Set getReadUsers(CIMClient cimClient) {
		
		if (readUsers == null || reloadShareUsers)
		{
			readUsers = new HashSet();
			setShareUsers(readUsers,share.getAssociated_Linux_SambaUser_Linux_SambaReadListForShare_Names(cimClient,false));
		}
		return readUsers;
	}
	
	private Set getWriteUsers(CIMClient cimClient) {
		
		if (writeUsers == null || reloadShareUsers)
		{
			writeUsers = new HashSet();
			setShareUsers(writeUsers,share.getAssociated_Linux_SambaUser_Linux_SambaWriteListForShare_Names(cimClient,false));
		}
		return writeUsers;
	}
	
	private Set getValidUsers(CIMClient cimClient) {
		
		if (validUsers == null || reloadShareUsers)
		{
			validUsers = new HashSet();
			setShareUsers(validUsers,share.getAssociated_Linux_SambaUser_Linux_SambaValidUsersForShare_Names(cimClient,false));
		}
		return validUsers;
	}

	private Set getInvalidUsers(CIMClient cimClient) {
		
		if (invalidUsers == null || reloadShareUsers)
		{
			invalidUsers = new HashSet();
			setShareUsers(invalidUsers,share.getAssociated_Linux_SambaUser_Linux_SambaInvalidUsersForShare_Names(cimClient,false));
		}
		return invalidUsers;
	}

	private Linux_SambaShareSecurityOptions getShareSecurityOptions(CIMClient cimClient) throws ModelLoadException {
		if (shareSecurityOptions == null || reloadChilds)
		{
			shareSecurityOptions = (Linux_SambaShareSecurityOptions) getFirstChild(cimClient,Linux_SambaShareSecurityOptions.class,share.getAssociated_Linux_SambaShareSecurityOptions_Linux_SambaShareSecurityForShare_Names(cimClient,false), false, adapter);
		}
		return shareSecurityOptions;
	}

	private Linux_SambaShareProtocolOptions getProtocolOptions(CIMClient cimClient) throws ModelLoadException {
		if (protocolOptions == null || reloadChilds)
		{
			protocolOptions = (Linux_SambaShareProtocolOptions) getFirstChild(cimClient,Linux_SambaShareProtocolOptions.class,share.getAssociated_Linux_SambaShareProtocolOptions_Linux_SambaShareProtocolForShare_Names(cimClient,false), false, adapter);
		}
		return protocolOptions;
	}

	private Linux_SambaShareFileNameHandlingOptions getFilenameHandlingOptions(CIMClient cimClient) throws ModelLoadException {
		if (fileNameHandlingOptions == null || reloadChilds)
		{
			fileNameHandlingOptions = (Linux_SambaShareFileNameHandlingOptions) getFirstChild(cimClient,Linux_SambaShareFileNameHandlingOptions.class,share.getAssociated_Linux_SambaShareFileNameHandlingOptions_Linux_SambaShareFileNameHandlingForShare_Names(cimClient,false), false, adapter);
		}
		return fileNameHandlingOptions;
	}

	private Linux_SambaCommonSecurityOptions getCommonSecurityOptions(CIMClient cimClient) throws ModelLoadException {
		if (shareCommonSecurityOptions == null || reloadChilds)
		{
			shareCommonSecurityOptions = (Linux_SambaCommonSecurityOptions) getFirstChild(cimClient,Linux_SambaCommonSecurityOptions.class,share.getAssociated_Linux_SambaCommonSecurityOptions_Linux_SambaCommonSecurityForShare_Names(cimClient,false), false, adapter);
		}
		return shareCommonSecurityOptions;
	}

	public void setCommonSecurity(Linux_SambaCommonSecurityOptions commonSecurityOptions) {
		this.shareCommonSecurityOptions = commonSecurityOptions;
	}

	private Linux_SambaShareBrowseOptions getBrowseOptions(CIMClient cimClient) throws ModelLoadException {
		if (shareBrowseOptions == null || reloadChilds)
		{
			shareBrowseOptions = (Linux_SambaShareBrowseOptions) getFirstChild(cimClient,Linux_SambaShareBrowseOptions.class,share.getAssociated_Linux_SambaShareBrowseOptions_Linux_SambaShareBrowseForShare_Names(cimClient,false), false, adapter);
		}
		return shareBrowseOptions;
	}

	public CimObjectKey getCimObjectKey() {
		return new CimObjectKey(share.getCimObjectPath());
	}

	public Linux_SambaShareOptions getShare() {
		return share;
	}

	public void updateControls(ShareOptionsDataContainer container) throws UpdateControlsException {
		
		try {
			CIMClient cc = container.getAdapter().getCimClient();
			container.get_Available().setControlValue(share.get_Available());
			container.get_Browsable().setControlValue(getBrowseOptions(cc).get_Browsable());
			container.get_Comment().setControlValue(share.get_Comment());
			container.get_GuestOK().setControlValue(getCommonSecurityOptions(cc).get_GuestOK());
			container.get_GuestOnly().setControlValue(getCommonSecurityOptions(cc).get_GuestOnly());
			container.get_HostsAllow().setControlValue(getCommonSecurityOptions(cc).get_HostsAllow());
			container.get_HostsDeny().setControlValue(getCommonSecurityOptions(cc).get_HostsDeny());
			container.get_Name().setControlValue(share.get_Name());
			container.get_Path().setControlValue(share.get_Path());
			container.get_ReadOnly().setControlValue(getCommonSecurityOptions(cc).get_ReadOnly());
			container.setKey(new CimObjectKey(share));
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
	}

	public void updateControls(ShareDenyHostSecurityDataContainer container)  throws UpdateControlsException {
		listHostsToDeny = new ArrayList();
		listHostsDenied = new ArrayList();
		
		seperateDenyHosts(allowHosts,denyHosts,listHostsToDeny,listHostsDenied);
		
		container.get_usr_DeniedHosts().setValues((String[]) listHostsDenied.toArray(new String[listHostsDenied.size()]));
		container.get_usr_HostsToDeny().setValues((String[]) listHostsToDeny.toArray(new String[listHostsToDeny.size()]));
	}

	public void updateControls(ShareAllowHostSecurityDataContainer container)  throws UpdateControlsException {
		listHostsToAllow = new ArrayList();
		listHostsAllowed = new ArrayList();
		
		seperateAllowHosts(allowHosts,denyHosts,listHostsToAllow,listHostsAllowed);
		
		container.get_usr_AllowedHosts().setValues((String[]) listHostsAllowed.toArray(new String[listHostsAllowed.size()]));
		container.get_usr_HostsToAllow().setValues((String[]) listHostsToAllow.toArray(new String[listHostsToAllow.size()]));
	}

	public void updateControls(GUIShareFileAttributes container)  throws UpdateControlsException {

		try {
			CIMClient cc = container.getAdapter().getCimClient();		
			
			udpateFileAttributeControls(container);
			
			updateMaskControls(container.get_usr_Create_u(),container.get_usr_Create_g(),container.get_usr_Create_s(),getShareSecurityOptions(cc).get_CreateMask(),0);
			updateMaskControls(container.get_usr_Create_user_r(),container.get_usr_Create_user_w(),container.get_usr_Create_user_x(),getShareSecurityOptions(cc).get_CreateMask(),1);
			updateMaskControls(container.get_usr_Create_group_r(),container.get_usr_Create_group_w(),container.get_usr_Create_group_x(),getShareSecurityOptions(cc).get_CreateMask(),2);
			updateMaskControls(container.get_usr_Create_other_r(),container.get_usr_Create_other_w(),container.get_usr_Create_other_x(),getShareSecurityOptions(cc).get_CreateMask(),3);

			updateMaskControls(container.get_usr_Directory_u(),container.get_usr_Directory_g(),container.get_usr_Directory_s(),getShareSecurityOptions(cc).get_DirectoryMask(),0);
			updateMaskControls(container.get_usr_Directory_user_r(),container.get_usr_Directory_user_w(),container.get_usr_Directory_user_x(),getShareSecurityOptions(cc).get_DirectoryMask(),1);
			updateMaskControls(container.get_usr_Directory_group_r(),container.get_usr_Directory_group_w(),container.get_usr_Directory_group_x(),getShareSecurityOptions(cc).get_DirectoryMask(),2);
			updateMaskControls(container.get_usr_Directory_other_r(),container.get_usr_Directory_other_w(),container.get_usr_Directory_other_x(),getShareSecurityOptions(cc).get_DirectoryMask(),3);

			updateMaskControls(container.get_usr_Directory_security_u(),container.get_usr_Directory_security_g(),container.get_usr_Directory_security_s(),getShareSecurityOptions(cc).get_DirectorySecurityMask(),0);
			updateMaskControls(container.get_usr_Directory_security_user_r(),container.get_usr_Directory_security_user_w(),container.get_usr_Directory_security_user_x(),getShareSecurityOptions(cc).get_DirectorySecurityMask(),1);
			updateMaskControls(container.get_usr_Directory_security_group_r(),container.get_usr_Directory_security_group_w(),container.get_usr_Directory_security_group_x(),getShareSecurityOptions(cc).get_DirectorySecurityMask(),2);
			updateMaskControls(container.get_usr_Directory_security_other_r(),container.get_usr_Directory_security_other_w(),container.get_usr_Directory_security_other_x(),getShareSecurityOptions(cc).get_DirectorySecurityMask(),3);
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
		
	}

	public void updateControls(CMDShareFileAttributes container)  throws UpdateControlsException {

		try {
			udpateFileAttributeControls(container);
			CIMClient cc = container.getAdapter().getCimClient();
			
			container.get_CreateMask().setControlValue(getShareSecurityOptions(cc).get_CreateMask());
			container.get_DirectoryMask().setControlValue(getShareSecurityOptions(cc).get_DirectoryMask());
			container.get_DirectorySecurityMask().setControlValue(getShareSecurityOptions(cc).get_DirectorySecurityMask());
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
	}

	private void udpateFileAttributeControls(ShareFileAttributes container) throws ModelLoadException {
		CIMClient cc = container.getAdapter().getCimClient();
		container.get_AclCompatibility().setValues(new String[]{Linux_SambaGlobalProtocolOptions.ACLCOMPATIBILITY_0,Linux_SambaGlobalProtocolOptions.ACLCOMPATIBILITY_1,Linux_SambaGlobalProtocolOptions.ACLCOMPATIBILITY_2});
		container.get_AclCompatibility().setControlValue(getProtocolOptions(cc).get_AclCompatibility());
		container.get_CaseSensitive().setControlValue(getFilenameHandlingOptions(cc).get_CaseSensitive());
		container.get_DosFiletimes().setControlValue(getFilenameHandlingOptions(cc).get_DosFiletimes());
		container.get_EASupport().setControlValue(getProtocolOptions(cc).get_EASupport());
		container.get_HideDotFiles().setControlValue(getFilenameHandlingOptions(cc).get_HideDotFiles());
		container.get_NTACLSupport().setControlValue(getProtocolOptions(cc).get_NTACLSupport());
	}

	public void updateControls(UserInShareACLDataContainer container)  throws UpdateControlsException  {
		
		CIMClient cc = container.getAdapter().getCimClient();

		try {
			super.updateForceUser(container, container.get_usr_CurrentForceUser(),container.get_usr_NewForceUser(),service,getForceUser(cc));
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
		
		
		container.getAdapter().updateControls(container.getUsers(),service.getUsers().getFCOs());
		
	}

	public Linux_SambaUser getForceUser(CIMClient cimClient) throws ModelLoadException {
		if (forceUser == null || reloadChilds)
		{
			List list = share.getAssociated_Linux_SambaUser_Linux_SambaForceUserForShares(cimClient,false,false,null); 
			forceUser = (Linux_SambaUser)getFirstChild(cimClient, Linux_SambaUser.class, list , true, adapter);
		}
		return forceUser;
	}
	
	/**
	 * @param cc
	 * @param newForceUser
	 * @throws ModelUpdateException
	 */
	public void setForceUser(CIMClient cc, Linux_SambaUser newForceUser) throws ObjectSaveException  {
		
		Linux_SambaUser oldForceUser = null;
		try {
			//delete Old Guest
			oldForceUser = getForceUser(cc);
			if (oldForceUser != null)
			{
				logger.info("Deleting Force User " + oldForceUser.get_SambaUserName());
				Vector keys = new Vector();
				keys.add(new CIMProperty(Linux_SambaForceUserForShare.CIM_PROPERTY_LINUX_SAMBASHAREOPTIONS, new CIMValue(share.getCimObjectPath(), new CIMDataType(Linux_SambaGlobalOptions.CIM_CLASS_NAME))));
				keys.add(new CIMProperty(Linux_SambaForceUserForShare.CIM_PROPERTY_LINUX_SAMBAUSER, new CIMValue(oldForceUser.getCimObjectPath(), new CIMDataType(Linux_SambaUser.CIM_CLASS_NAME))));
				FcoHelper.delete(Linux_SambaForceUserForShare.class,keys,cc);
			}
			//create new Guest
			if (newForceUser != null)
			{
				logger.info("Set as Force User " + newForceUser.get_SambaUserName());
				Linux_SambaForceUserForShare newForceUserAssoc = new Linux_SambaForceUserForShare();
				newForceUserAssoc.set_Linux_SambaShareOptions(share);
				newForceUserAssoc.set_Linux_SambaUser(newForceUser);
				FcoHelper.create(newForceUserAssoc,cc);
			}
			//force a reload if needed next time
			this.forceUser = null;
		} catch (WbemSmtException e) {
			throw new ObjectSaveException(e);
		}
	}
	
	
	public void updateControls(UserACLItemDataContainerForShare container, Linux_SambaUser fco) throws UpdateControlsException {
		try {
			CIMClient cc = container.getAdapter().getCimClient();
			container.get_SambaUserName().setControlValue(fco.get_SambaUserName());
			updateValidInvalidWithUserList(container,container.get_usr_AccessTypeVI(), fco.get_SambaUserName(), getInvalidUsers(cc), getValidUsers(cc), false, service,cc);
			updateReadWriteWithUserList(container,container.get_usr_AccessTypeRW(), fco.get_SambaUserName(), getReadUsers(cc), getWriteUsers(cc), false, service,cc);
			updateAdminWithUserList(container,container.get_usr_Admin(), fco.get_SambaUserName(), getAdminUsers(cc), service,cc,service.getAdminUsers(cc), false);
		}catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
	}

	public void updateModel(ShareAllowHostSecurityDataContainer container) throws ModelUpdateException{
		updateModelHostsAcl(container, container.get_usr_AddHost(), container.get_usr_RemoveHost(), container.get_usr_AllowedHosts(), container.get_usr_HostsToAllow(), listHostsAllowed, listHostsToAllow);
	}

	public void updateModel(ShareDenyHostSecurityDataContainer container) throws ModelUpdateException {
		updateModelHostsAcl(container, container.get_usr_AddHost(), container.get_usr_RemoveHost(), container.get_usr_DeniedHosts(), container.get_usr_HostsToDeny(), listHostsDenied, listHostsToDeny);
	}

	public MessageList save(CMDShareFileAttributes container) throws ObjectSaveException {
//		try {
//			CIMClient cc = container.getAdapter().getCimClient();
//			saveFileAttributes(container);
//			getShareSecurityOptions(cc).set_DirectoryMask((UnsignedInt16) container.get_DirectoryMask().getConvertedControlValue());
//			getShareSecurityOptions(cc).set_DirectorySecurityMask((UnsignedInt16) container.get_DirectorySecurityMask().getConvertedControlValue());
//			getShareSecurityOptions(cc).set_CreateMask((UnsignedInt16) container.get_CreateMask().getConvertedControlValue());
//			FcoHelper.save(getShareSecurityOptions(cc),cc);
//			shareSecurityOptions = null;
//		} catch (ModelLoadException e) {
//			throw new ObjectSaveException(e);
//		}
		return null;
	}

	public MessageList save(GUIShareFileAttributes container) throws ObjectSaveException {
//		try {
//		CIMClient cc = container.getAdapter().getCimClient();
//		saveFileAttributes(container);
//		getShareSecurityOptions(cc).set_CreateMask(
//				updateModel(container.get_usr_Create_u(),container.get_usr_Create_g(),container.get_usr_Create_s(),
//							container.get_usr_Create_user_r(),container.get_usr_Create_user_w(),container.get_usr_Create_user_x(),
//							container.get_usr_Create_group_r(),container.get_usr_Create_group_w(),container.get_usr_Create_group_x(),
//							container.get_usr_Create_other_r(),container.get_usr_Create_other_w(),container.get_usr_Create_other_x()));
//
//		getShareSecurityOptions(cc).set_DirectoryMask(
//				updateModel(container.get_usr_Directory_u(),container.get_usr_Directory_g(),container.get_usr_Directory_s(),
//							container.get_usr_Directory_user_r(),container.get_usr_Directory_user_w(),container.get_usr_Directory_user_x(),
//							container.get_usr_Directory_group_r(),container.get_usr_Directory_group_w(),container.get_usr_Directory_group_x(),
//							container.get_usr_Directory_other_r(),container.get_usr_Directory_other_w(),container.get_usr_Directory_other_x()));
//
//		getShareSecurityOptions(cc).set_DirectorySecurityMask(
//				updateModel(container.get_usr_Directory_security_u(),container.get_usr_Directory_security_g(),container.get_usr_Directory_security_s(),
//							container.get_usr_Directory_security_user_r(),container.get_usr_Directory_security_user_w(),container.get_usr_Directory_security_user_x(),
//							container.get_usr_Directory_security_group_r(),container.get_usr_Directory_security_group_w(),container.get_usr_Directory_security_group_x(),
//							container.get_usr_Directory_security_other_r(),container.get_usr_Directory_security_other_w(),container.get_usr_Directory_security_other_x()));
//		
//		FcoHelper.save(getShareSecurityOptions(cc),cc);
//		
//		shareSecurityOptions = null;
			
//		} catch (ModelLoadException e) {
//			throw new ObjectSaveException(e);
//		}
		return null;
	}

//	private void saveFileAttributes(ShareFileAttributes container) throws ObjectSaveException {
//		try {
//			CIMClient cc = container.getAdapter().getCimClient();
//			getProtocolOptions(cc).set_AclCompatibility((UnsignedInt8) container.get_AclCompatibility().getConvertedControlValue());
//			getFilenameHandlingOptions(cc).set_CaseSensitive((Boolean) container.get_CaseSensitive().getConvertedControlValue());
//			getFilenameHandlingOptions(cc).set_DosFiletimes((Boolean) container.get_DosFiletimes().getConvertedControlValue());
//			getProtocolOptions(cc).set_EASupport((Boolean) container.get_EASupport().getConvertedControlValue());
//			getFilenameHandlingOptions(cc).set_HideDotFiles((Boolean) container.get_HideDotFiles().getConvertedControlValue());
//			getProtocolOptions(cc).set_NTACLSupport((Boolean) container.get_NTACLSupport().getConvertedControlValue());
//			
//			FcoHelper.save(getProtocolOptions(cc),cc);
//			FcoHelper.save(getFilenameHandlingOptions(cc),cc);
//			
//			protocolOptions = null;
//			fileNameHandlingOptions = null;
//
//		} catch (ModelLoadException e) {
//			throw new ObjectSaveException(e);
//		}
//	}

	public MessageList save(ShareOptionsDataContainer container) throws ObjectSaveException {
		try {
			CIMClient cc = container.getAdapter().getCimClient();
			share.set_Available((Boolean) container.get_Available().getConvertedControlValue());
			getBrowseOptions(cc).set_Browsable((Boolean) container.get_Browsable().getConvertedControlValue());
			share.set_Comment((String) container.get_Comment().getConvertedControlValue());
			getCommonSecurityOptions(cc).set_GuestOK((Boolean) container.get_GuestOK().getConvertedControlValue());
			getCommonSecurityOptions(cc).set_GuestOnly((Boolean) container.get_GuestOnly().getConvertedControlValue());
			getCommonSecurityOptions(cc).set_HostsAllow((String) container.get_HostsAllow().getConvertedControlValue());
			getCommonSecurityOptions(cc).set_HostsDeny((String) container.get_HostsDeny().getConvertedControlValue());
			//share.set_Name(container.get_Name().getConvertedControlValue());
			share.set_Path((String) container.get_Path().getConvertedControlValue());
			getCommonSecurityOptions(cc).set_ReadOnly((Boolean) container.get_ReadOnly().getConvertedControlValue());
			
			FcoHelper.save(share,cc);
			FcoHelper.save(getCommonSecurityOptions(cc),cc);
			FcoHelper.save(getBrowseOptions(cc),cc);
			
			share = (Linux_SambaShareOptions)FcoHelper.reload(share,cc);
			//fore reload
			shareCommonSecurityOptions = null;
			shareBrowseOptions = null;

			MessageList list = MessageList.init(container);
			return list;
		} catch (ModelLoadException e) {
			throw new ObjectSaveException(share,e);
		}
	}

	public MessageList save(ShareDenyHostSecurityDataContainer container)  throws ObjectSaveException {
		
		return null;
	}

	public MessageList save(ShareAllowHostSecurityDataContainer container) throws ObjectSaveException  {
		
		return null;
	}

	public MessageList save(UserInShareACLDataContainer container) throws ObjectSaveException {
		
		CIMClient cc = container.getAdapter().getCimClient();
		MessageList list = new MessageList();
		
		UnsignedInt16 index = (UnsignedInt16) container.get_usr_NewForceUser().getConvertedControlValue();
		//first element is the "no force user text" so subtract one to get the right user
		if (index != null)
		{
			setForceUser(cc,index.intValue() <= 0 ? null : service.getUsers().getUser(index.intValue()-1).getUser());
		}
		
		list.addAll(container.getAdapter().save(container.getUsers(),service.getUsers().getFCOs()));
		
		if (reloadShareUsers)
		{
			reloadShareUsers(cc);
			reloadShareUsers = false;
			//force reload
			super.resetUserAcl(service);
		}
		return list;
	}

	public MessageList save(UserACLItemDataContainerForShare container, Linux_SambaUser fco) throws ObjectSaveException {
		reloadShareUsers = saveUserACL(container,fco,share) || reloadShareUsers;
		return null;
	}

	private boolean saveUserACL(UserACLItemDataContainerForShare container, Linux_SambaUser user, Linux_SambaShareOptions share) throws ObjectSaveException {
		boolean reloadShareUsers = false;
		CIMClient cc = container.getAdapter().getCimClient();
		String sambaUserName = user.get_SambaUserName();
		Vector vKeyProperties = new Vector();
		vKeyProperties.add(new CIMProperty(Linux_SambaInvalidUsersForShare.CIM_PROPERTY_LINUX_SAMBAUSER, new CIMValue(user.getCimObjectPath(), new CIMDataType(Linux_SambaUser.CIM_CLASS_NAME))));
		vKeyProperties.add(new CIMProperty(Linux_SambaInvalidUsersForShare.CIM_PROPERTY_LINUX_SAMBASHAREOPTIONS, new CIMValue(share.getCimObjectPath(), new CIMDataType(Linux_SambaShareOptions.CIM_CLASS_NAME))));
		
		boolean admin = ((Boolean)container.get_usr_Admin().getConvertedControlValue()).booleanValue();

		reloadShareUsers = save(admin, getAdminUsers(cc),
				Linux_SambaAdminUsersForShare.class, sambaUserName,
				vKeyProperties, cc);
		reloadShareUsers = saveValidInvalid(container.get_usr_AccessTypeVI(), user,
				getInvalidUsers(cc), getValidUsers(cc), cc, vKeyProperties,
				Linux_SambaInvalidUsersForShare.class,
				Linux_SambaValidUsersForShare.class)
				|| reloadShareUsers;
		reloadShareUsers = saveReadWrite(container.get_usr_AccessTypeRW(), user, getReadUsers(cc),
				getWriteUsers(cc), cc, vKeyProperties,
				Linux_SambaReadListForShare.class,
				Linux_SambaWriteListForShare.class)
				|| reloadShareUsers;
		return reloadShareUsers;
	}


	public MessageList save(UserACLItemDataContainerForShare container) throws ObjectSaveException {
		Linux_SambaUser fco = service.getUsers().getUserByName((String) container.get_SambaUserName().getConvertedControlValue()).getUser();
		reloadShareUsers = saveUserACL(container,fco,share);
		return null;
	}

	public void updateControls(UserACLItemDataContainerForShare container) throws UpdateControlsException {
		Linux_SambaUser fco = service.getUsers().getUserByName((String) container.get_SambaUserName().getConvertedControlValue()).getUser();
		updateControls(container,fco);
	}

	public MessageList revert(ShareOptionsDataContainer container) throws ObjectRevertException {
		shareBrowseOptions = null;
		shareCommonSecurityOptions = null;
		shareSecurityOptions = null;
		try {
			share = (Linux_SambaShareOptions) FcoHelper.reload(share, container.getAdapter().getCimClient());
		} catch (ModelLoadException e) {
			throw new ObjectRevertException(e);
		}
		return null;
	}

	public MessageList revert(ShareAllowHostSecurityDataContainer container) {
		allowHosts = null;
		return null;
	}
	public MessageList revert(ShareDenyHostSecurityDataContainer container) {
		denyHosts = null;
		return null;
	}

	public MessageList revert(UserInShareACLDataContainer container) throws ObjectRevertException {
		resetShareUsers();
		return null;
	}


	public MessageList revert(UserACLItemDataContainerForShare container) {
		resetShareUsers();
		return null;
	}

	public MessageList revert(ShareFileAttributes container) {
		shareSecurityOptions = null;
		return null;
	}
	
}
