 /** 
  * Share.java
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
  * Description: Class for wrapping the Share business object and the related actions
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.cim.CIMProperty;
import javax.cim.UnsignedInteger16;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter;
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
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaForceUserForShareHelper;
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

	protected Set<String> allowHosts = new HashSet<String>();
	protected Set<String> denyHosts = new HashSet<String>();
	protected Set<String> invalidUsers = null;
	protected Set<String> validUsers = null;
	protected Set<String> readUsers = null;
	protected Set<String> writeUsers = null;
	protected Set<String> adminUsers = null;
	
	private Linux_SambaShareOptions share;

	//stores for each shareName a List of SambaUserNames
	private Linux_SambaShareBrowseOptions shareBrowseOptions = null;
	private Linux_SambaCommonSecurityOptions shareCommonSecurityOptions = null;
	private Linux_SambaShareSecurityOptions shareSecurityOptions = null;
	private Linux_SambaShareFileNameHandlingOptions fileNameHandlingOptions  = null;
	private Linux_SambaShareProtocolOptions protocolOptions =  null;
	private final Service service;
	private ArrayList<String> listHostsToAllow;
	private ArrayList<String> listHostsAllowed;
	private ArrayList<String> listHostsDenied;
	private ArrayList<String> listHostsToDeny;
	private boolean reloadShareUsers;
	private Linux_SambaUser forceUser;
	public Share(Service service, Linux_SambaShareOptions share, SambaCimAdapter adapter) throws WbemsmtException {
		super(adapter);
		this.service = service;
		this.share = share;
	}

	public void loadChilds() throws WbemsmtException {
		

	}

	public void reloadChilds() throws WbemsmtException {

		getBrowseOptions();
		getCommonSecurityOptions();
		getShareSecurityOptions();
		getFilenameHandlingOptions();
		getProtocolOptions();
		
		reloadShareUsers = reloadChilds;
		reloadShareUsers();

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

	public void reloadShareUsers() throws WbemsmtException {

		getInvalidUsers();
		getValidUsers();
		getWriteUsers();
		getReadUsers();
		getAdminUsers();
		
		reloadShareUsers = false;
		
	}

	private Set<String> getAdminUsers() throws WbemsmtException {
		
		if (adminUsers == null || reloadShareUsers)
        {
        	adminUsers = new HashSet<String>();
        	setShareUsers(adminUsers,share.getAssociated_Linux_SambaUser_Linux_SambaAdminUsersForShareNames(adapter.getCimClient()));
        }
        return adminUsers;
	}
		
	private Set<String> getReadUsers() throws WbemsmtException {
		
		if (readUsers == null || reloadShareUsers)
        {
        	readUsers = new HashSet<String>();
        	setShareUsers(readUsers,share.getAssociated_Linux_SambaUser_Linux_SambaReadListForShareNames(adapter.getCimClient()));
        }
        return readUsers;
	}
	
	private Set<String> getWriteUsers() throws WbemsmtException {
		
		if (writeUsers == null || reloadShareUsers)
        {
        	writeUsers = new HashSet<String>();
        	setShareUsers(writeUsers,share.getAssociated_Linux_SambaUser_Linux_SambaWriteListForShareNames(adapter.getCimClient()));
        }
        return writeUsers;
	}
	
	private Set<String> getValidUsers() throws WbemsmtException {
		
		if (validUsers == null || reloadShareUsers)
        {
        	validUsers = new HashSet<String>();
        	setShareUsers(validUsers,share.getAssociated_Linux_SambaUser_Linux_SambaValidUsersForShareNames(adapter.getCimClient()));
        }
        return validUsers;
	}

	private Set<String> getInvalidUsers() throws WbemsmtException {
		
		if (invalidUsers == null || reloadShareUsers)
        {
        	invalidUsers = new HashSet<String>();
        	setShareUsers(invalidUsers,share.getAssociated_Linux_SambaUser_Linux_SambaInvalidUsersForShareNames(adapter.getCimClient()));
        }
        return invalidUsers;
	}

	private Linux_SambaShareSecurityOptions getShareSecurityOptions() throws WbemsmtException {
		if (shareSecurityOptions == null || reloadChilds)
        {
        	shareSecurityOptions = (Linux_SambaShareSecurityOptions) getFirstChild(Linux_SambaShareSecurityOptions.class,share.getAssociated_Linux_SambaShareSecurityOptions_Linux_SambaShareSecurityForShareNames(adapter.getCimClient()), false);
        }
        return shareSecurityOptions;
	}

	private Linux_SambaShareProtocolOptions getProtocolOptions() throws WbemsmtException {
		if (protocolOptions == null || reloadChilds)
        {
        	protocolOptions = (Linux_SambaShareProtocolOptions) getFirstChild(Linux_SambaShareProtocolOptions.class,share.getAssociated_Linux_SambaShareProtocolOptions_Linux_SambaShareProtocolForShareNames(adapter.getCimClient()), false);
        }
        return protocolOptions;
	}

	private Linux_SambaShareFileNameHandlingOptions getFilenameHandlingOptions() throws WbemsmtException {
		if (fileNameHandlingOptions == null || reloadChilds)
        {
        	fileNameHandlingOptions = (Linux_SambaShareFileNameHandlingOptions) getFirstChild(Linux_SambaShareFileNameHandlingOptions.class,share.getAssociated_Linux_SambaShareFileNameHandlingOptions_Linux_SambaShareFileNameHandlingForShareNames(adapter.getCimClient()), false);
        }
        return fileNameHandlingOptions;
	}

	private Linux_SambaCommonSecurityOptions getCommonSecurityOptions() throws WbemsmtException {
		if (shareCommonSecurityOptions == null || reloadChilds)
        {
        	shareCommonSecurityOptions = (Linux_SambaCommonSecurityOptions) getFirstChild(Linux_SambaCommonSecurityOptions.class,share.getAssociated_Linux_SambaCommonSecurityOptions_Linux_SambaCommonSecurityForShareNames(adapter.getCimClient()), false);
        }
        return shareCommonSecurityOptions;
	}

	public void setCommonSecurity(Linux_SambaCommonSecurityOptions commonSecurityOptions) {
		this.shareCommonSecurityOptions = commonSecurityOptions;
	}

	private Linux_SambaShareBrowseOptions getBrowseOptions() throws WbemsmtException {
		if (shareBrowseOptions == null || reloadChilds)
        {
        	shareBrowseOptions = (Linux_SambaShareBrowseOptions) getFirstChild(Linux_SambaShareBrowseOptions.class,share.getAssociated_Linux_SambaShareBrowseOptions_Linux_SambaShareBrowseForShareNames(adapter.getCimClient()), false);
        }
        return shareBrowseOptions;
	}

	public CimObjectKey getCimObjectKey() {
		return new CimObjectKey(share.getCimObjectPath());
	}

	public Linux_SambaShareOptions getShare() {
		return share;
	}

	public void updateControls(ShareOptionsDataContainer container) throws WbemsmtException {
		
		container.get_Available().setControlValue(share.get_Available());
        container.get_Browsable().setControlValue(getBrowseOptions().get_Browsable());
        container.get_Comment().setControlValue(share.get_Comment());
        container.get_GuestOK().setControlValue(getCommonSecurityOptions().get_GuestOK());
        container.get_GuestOnly().setControlValue(getCommonSecurityOptions().get_GuestOnly());
        container.get_HostsAllow().setControlValue(getCommonSecurityOptions().get_HostsAllow());
        container.get_HostsDeny().setControlValue(getCommonSecurityOptions().get_HostsDeny());
        container.get_Name().setControlValue(share.get_key_Name());
        container.get_Path().setControlValue(share.get_Path());
        container.get_ReadOnly().setControlValue(getCommonSecurityOptions().get_ReadOnly());
        container.setKey(new CimObjectKey(share.getCimObjectPath()));
	}

	public void updateControls(ShareDenyHostSecurityDataContainer container)  throws WbemsmtException {
		listHostsToDeny = new ArrayList<String>();
		listHostsDenied = new ArrayList<String>();
		
		seperateDenyHosts(allowHosts,denyHosts,listHostsToDeny,listHostsDenied);
		
		container.get_usr_DeniedHosts().setValues((String[]) listHostsDenied.toArray(new String[listHostsDenied.size()]));
		container.get_usr_HostsToDeny().setValues((String[]) listHostsToDeny.toArray(new String[listHostsToDeny.size()]));
	}

	public void updateControls(ShareAllowHostSecurityDataContainer container)  throws WbemsmtException {
		listHostsToAllow = new ArrayList<String>();
		listHostsAllowed = new ArrayList<String>();
		
		seperateAllowHosts(allowHosts,denyHosts,listHostsToAllow,listHostsAllowed);
		
		container.get_usr_AllowedHosts().setValues((String[]) listHostsAllowed.toArray(new String[listHostsAllowed.size()]));
		container.get_usr_HostsToAllow().setValues((String[]) listHostsToAllow.toArray(new String[listHostsToAllow.size()]));
	}

	public void updateControls(GUIShareFileAttributes container)  throws WbemsmtException {

		udpateFileAttributeControls(container);
        
        updateMaskControls(container.get_usr_Create_u(),container.get_usr_Create_g(),container.get_usr_Create_s(),getShareSecurityOptions().get_CreateMask(),0);
        updateMaskControls(container.get_usr_Create_user_r(),container.get_usr_Create_user_w(),container.get_usr_Create_user_x(),getShareSecurityOptions().get_CreateMask(),1);
        updateMaskControls(container.get_usr_Create_group_r(),container.get_usr_Create_group_w(),container.get_usr_Create_group_x(),getShareSecurityOptions().get_CreateMask(),2);
        updateMaskControls(container.get_usr_Create_other_r(),container.get_usr_Create_other_w(),container.get_usr_Create_other_x(),getShareSecurityOptions().get_CreateMask(),3);

        updateMaskControls(container.get_usr_Directory_u(),container.get_usr_Directory_g(),container.get_usr_Directory_s(),getShareSecurityOptions().get_DirectoryMask(),0);
        updateMaskControls(container.get_usr_Directory_user_r(),container.get_usr_Directory_user_w(),container.get_usr_Directory_user_x(),getShareSecurityOptions().get_DirectoryMask(),1);
        updateMaskControls(container.get_usr_Directory_group_r(),container.get_usr_Directory_group_w(),container.get_usr_Directory_group_x(),getShareSecurityOptions().get_DirectoryMask(),2);
        updateMaskControls(container.get_usr_Directory_other_r(),container.get_usr_Directory_other_w(),container.get_usr_Directory_other_x(),getShareSecurityOptions().get_DirectoryMask(),3);

        updateMaskControls(container.get_usr_Directory_security_u(),container.get_usr_Directory_security_g(),container.get_usr_Directory_security_s(),getShareSecurityOptions().get_DirectorySecurityMask(),0);
        updateMaskControls(container.get_usr_Directory_security_user_r(),container.get_usr_Directory_security_user_w(),container.get_usr_Directory_security_user_x(),getShareSecurityOptions().get_DirectorySecurityMask(),1);
        updateMaskControls(container.get_usr_Directory_security_group_r(),container.get_usr_Directory_security_group_w(),container.get_usr_Directory_security_group_x(),getShareSecurityOptions().get_DirectorySecurityMask(),2);
        updateMaskControls(container.get_usr_Directory_security_other_r(),container.get_usr_Directory_security_other_w(),container.get_usr_Directory_security_other_x(),getShareSecurityOptions().get_DirectorySecurityMask(),3);
		
	}

	public void updateControls(CMDShareFileAttributes container)  throws WbemsmtException {

		udpateFileAttributeControls(container);
        container.get_CreateMask().setControlValue(getShareSecurityOptions().get_CreateMask());
        container.get_DirectoryMask().setControlValue(getShareSecurityOptions().get_DirectoryMask());
        container.get_DirectorySecurityMask().setControlValue(getShareSecurityOptions().get_DirectorySecurityMask());
	}

	private void udpateFileAttributeControls(ShareFileAttributes container) throws WbemsmtException {
		container.get_AclCompatibility().setValues(Linux_SambaShareProtocolOptions.PROPERTY_ACLCOMPATIBILITY.VALUE_ENTRIES_FOR_DISPLAY);
		container.get_AclCompatibility().setControlValue(getProtocolOptions().get_AclCompatibility());
		container.get_CaseSensitive().setControlValue(getFilenameHandlingOptions().get_CaseSensitive());
		container.get_DosFiletimes().setControlValue(getFilenameHandlingOptions().get_DosFiletimes());
		container.get_EASupport().setControlValue(getProtocolOptions().get_EASupport());
		container.get_HideDotFiles().setControlValue(getFilenameHandlingOptions().get_HideDotFiles());
		container.get_NTACLSupport().setControlValue(getProtocolOptions().get_NTACLSupport());
	}

	public void updateControls(UserInShareACLDataContainer container)  throws WbemsmtException  {
		

		super.updateForceUser(container, container.get_usr_CurrentForceUser(),container.get_usr_NewForceUser(),service,getForceUser());
		
		
		container.getAdapter().updateControls(container.getUsers(),service.getUsers().getFCOs());
		
	}

	public Linux_SambaUser getForceUser() throws WbemsmtException {
		if (forceUser == null || reloadChilds)
        {
        	List<Linux_SambaUser> list = share.getAssociated_Linux_SambaUser_Linux_SambaForceUserForShares(adapter.getCimClient()); 
        	forceUser = (Linux_SambaUser)getFirstChild(Linux_SambaUser.class, list , true);
        }
        return forceUser;
	}
	
	/**
	 * @param newForceUser
	 * @throws WbemsmtException
	 */
    public void setForceUser(Linux_SambaUser newForceUser) throws WbemsmtException  {
        
        Linux_SambaUser oldForceUser = null;
        //delete Old force user
        oldForceUser = getForceUser();
        if (oldForceUser != null)
        {
            logger.info("Deleting ForceUser " + oldForceUser.get_key_SambaUserName());
            Vector<CIMProperty> keys = new Vector<CIMProperty>();
            keys.add(Linux_SambaForceUserForShare.create_GroupComponent_Linux_SambaShareOptions(adapter.getCimClient(), adapter.getNamespace(), share));
            keys.add(Linux_SambaForceUserForShare.create_PartComponent_Linux_SambaUser(adapter.getCimClient(), adapter.getNamespace(), oldForceUser));
            
            AbstractWbemsmtFco instance = adapter.getFcoHelper().getInstance(Linux_SambaForceUserForShareHelper.class, adapter.getNamespace(), keys, adapter.getCimClient());
            adapter.getFcoHelper().delete(instance,adapter.getCimClient());
        }
        //create new force user
        if (newForceUser != null)
        {
            logger.info("Set as Guest " + newForceUser.get_key_SambaUserName());             
            Linux_SambaForceUserForShare forceUser = new Linux_SambaForceUserForShare(adapter.getCimClient(),adapter.getNamespace());
            forceUser.set_GroupComponent_Linux_SambaShareOptions(share);
            forceUser.set_PartComponent_Linux_SambaUser(newForceUser);
            forceUser = (Linux_SambaForceUserForShare) adapter.getFcoHelper().create(forceUser,adapter.getCimClient());
        }
        //force a reload if needed next time
        this.forceUser = null;
    }

	
	
	public void updateControls(UserACLItemDataContainerForShare container, Linux_SambaUser fco) throws WbemsmtException {
		container.get_SambaUserName().setControlValue(fco.get_key_SambaUserName());
        updateValidInvalidWithUserList(container,container.get_usr_AccessTypeVI(), fco.get_key_SambaUserName(), getInvalidUsers(), getValidUsers(), false, service);
        updateReadWriteWithUserList(container,container.get_usr_AccessTypeRW(), fco.get_key_SambaUserName(), getReadUsers(), getWriteUsers(), false, service);
        updateAdminWithUserList(container,container.get_usr_Admin(), fco.get_key_SambaUserName(), getAdminUsers(), service,service.getAdminUsers(), false);
	}

	public void updateModel(ShareAllowHostSecurityDataContainer container) throws WbemsmtException{
		updateModelHostsAcl(container, container.get_usr_AddHost(), container.get_usr_RemoveHost(), container.get_usr_AllowedHosts(), container.get_usr_HostsToAllow(), listHostsAllowed, listHostsToAllow);
	}

	public void updateModel(ShareDenyHostSecurityDataContainer container) throws WbemsmtException {
		updateModelHostsAcl(container, container.get_usr_AddHost(), container.get_usr_RemoveHost(), container.get_usr_DeniedHosts(), container.get_usr_HostsToDeny(), listHostsDenied, listHostsToDeny);
	}

	public MessageList save(CMDShareFileAttributes container) throws WbemsmtException {

//			WBEMClient cc = container.getAdapter().getCimClient();
//			saveFileAttributes(container);
//			getShareSecurityOptions(cc).set_DirectoryMask((UnsignedInteger16) container.get_DirectoryMask().getConvertedControlValue());
//			getShareSecurityOptions(cc).set_DirectorySecurityMask((UnsignedInteger16) container.get_DirectorySecurityMask().getConvertedControlValue());
//			getShareSecurityOptions(cc).set_CreateMask((UnsignedInteger16) container.get_CreateMask().getConvertedControlValue());
//			adapter.getFcoHelper().save(getShareSecurityOptions(cc),cc);
//			shareSecurityOptions = null;

		return null;
	}

	public MessageList save(GUIShareFileAttributes container) throws WbemsmtException {
//		WBEMClient cc = container.getAdapter().getCimClient();
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
//		adapter.getFcoHelper().save(getShareSecurityOptions(cc),cc);
//		
//		shareSecurityOptions = null;
			

	    
		return null;
	}

//	private void saveFileAttributes(ShareFileAttributes container) throws WbemsmtException {

//			WBEMClient cc = container.getAdapter().getCimClient();
//			getProtocolOptions(cc).set_AclCompatibility((UnsignedInt8) container.get_AclCompatibility().getConvertedControlValue());
//			getFilenameHandlingOptions(cc).set_CaseSensitive((Boolean) container.get_CaseSensitive().getConvertedControlValue());
//			getFilenameHandlingOptions(cc).set_DosFiletimes((Boolean) container.get_DosFiletimes().getConvertedControlValue());
//			getProtocolOptions(cc).set_EASupport((Boolean) container.get_EASupport().getConvertedControlValue());
//			getFilenameHandlingOptions(cc).set_HideDotFiles((Boolean) container.get_HideDotFiles().getConvertedControlValue());
//			getProtocolOptions(cc).set_NTACLSupport((Boolean) container.get_NTACLSupport().getConvertedControlValue());
//			
//			adapter.getFcoHelper().save(getProtocolOptions(cc),cc);
//			adapter.getFcoHelper().save(getFilenameHandlingOptions(cc),cc);
//			
//			protocolOptions = null;
//			fileNameHandlingOptions = null;

//	}

	public MessageList save(ShareOptionsDataContainer container) throws WbemsmtException {
		WBEMClient cc = container.getAdapter().getCimClient();
        share.set_Available((Boolean) container.get_Available().getConvertedControlValue());
        getBrowseOptions().set_Browsable((Boolean) container.get_Browsable().getConvertedControlValue());
        share.set_Comment((String) container.get_Comment().getConvertedControlValue());
        getCommonSecurityOptions().set_GuestOK((Boolean) container.get_GuestOK().getConvertedControlValue());
        getCommonSecurityOptions().set_GuestOnly((Boolean) container.get_GuestOnly().getConvertedControlValue());
        getCommonSecurityOptions().set_HostsAllow((String) container.get_HostsAllow().getConvertedControlValue());
        getCommonSecurityOptions().set_HostsDeny((String) container.get_HostsDeny().getConvertedControlValue());
        //share.set_Name(container.get_Name().getConvertedControlValue());
        share.set_Path((String) container.get_Path().getConvertedControlValue());
        getCommonSecurityOptions().set_ReadOnly((Boolean) container.get_ReadOnly().getConvertedControlValue());
        
        adapter.getFcoHelper().save(share,cc);
        adapter.getFcoHelper().save(getCommonSecurityOptions(),cc);
        adapter.getFcoHelper().save(getBrowseOptions(),cc);
        
        share = (Linux_SambaShareOptions)adapter.getFcoHelper().reload(share,cc);
        //fore reload
        shareCommonSecurityOptions = null;
        shareBrowseOptions = null;

        MessageList list = MessageList.init(container);
        return list;
	}

	public MessageList save(ShareDenyHostSecurityDataContainer container)  throws WbemsmtException {
		
		return null;
	}

	public MessageList save(ShareAllowHostSecurityDataContainer container) throws WbemsmtException  {
		
		return null;
	}

	public MessageList save(UserInShareACLDataContainer container) throws WbemsmtException {
		
		MessageList list = new MessageList();
        
        UnsignedInteger16 index = (UnsignedInteger16) container.get_usr_NewForceUser().getConvertedControlValue();
        //first element is the "no force user text" so subtract one to get the right user
        if (index != null)
        {
        	setForceUser(index.intValue() <= 0 ? null : service.getUsers().getUser(index.intValue()-1).getUser());
        }
        
        list.addAll(container.getAdapter().save(container.getUsers(),service.getUsers().getFCOs()));
        
        if (reloadShareUsers)
        {
        	reloadShareUsers();
        	reloadShareUsers = false;
        	//force reload
        	super.resetUserAcl(service);
        }
        return list;
	}

	public MessageList save(UserACLItemDataContainerForShare container, Linux_SambaUser fco) throws WbemsmtException {
		reloadShareUsers = saveUserACL(container,fco,share) || reloadShareUsers;
		return null;
	}

	private boolean saveUserACL(UserACLItemDataContainerForShare container, Linux_SambaUser user, Linux_SambaShareOptions share) throws WbemsmtException {
		boolean reloadShareUsers = false;
		String sambaUserName = user.get_key_SambaUserName();
		CIMProperty[] vKeyProperties = new CIMProperty[] {
		    Linux_SambaInvalidUsersForShare.create_GroupComponent_Linux_SambaShareOptions(adapter.getCimClient(), adapter.getNamespace(), share),
            Linux_SambaInvalidUsersForShare.create_PartComponent_Linux_SambaUser(adapter.getCimClient(), adapter.getNamespace(), user)};
		
		boolean admin = ((Boolean)container.get_usr_Admin().getConvertedControlValue()).booleanValue();

		reloadShareUsers = save(admin, getAdminUsers(),
        		Linux_SambaAdminUsersForShare.class, sambaUserName,
        		vKeyProperties);
        reloadShareUsers = saveValidInvalid(container.get_usr_AccessTypeVI(), user,
        		getInvalidUsers(), getValidUsers(), vKeyProperties,
        		Linux_SambaInvalidUsersForShare.class,
        		Linux_SambaValidUsersForShare.class)
        		|| reloadShareUsers;
        reloadShareUsers = saveReadWrite(container.get_usr_AccessTypeRW(), user, getReadUsers(),
        		getWriteUsers(), vKeyProperties,
        		Linux_SambaReadListForShare.class,
        		Linux_SambaWriteListForShare.class)
        		|| reloadShareUsers;
        return reloadShareUsers;
	}


	public MessageList save(UserACLItemDataContainerForShare container) throws WbemsmtException {
		Linux_SambaUser fco = service.getUsers().getUserByName((String) container.get_SambaUserName().getConvertedControlValue()).getUser();
        reloadShareUsers = saveUserACL(container,fco,share);
        return null;
	}

	public void updateControls(UserACLItemDataContainerForShare container) throws WbemsmtException {
		Linux_SambaUser fco = service.getUsers().getUserByName((String) container.get_SambaUserName().getConvertedControlValue()).getUser();
        updateControls(container,fco);
	}

	public MessageList revert(ShareOptionsDataContainer container) throws WbemsmtException {
		shareBrowseOptions = null;
		shareCommonSecurityOptions = null;
		shareSecurityOptions = null;
		share = (Linux_SambaShareOptions) adapter.getFcoHelper().reload(share, container.getAdapter().getCimClient());
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

	public MessageList revert(UserInShareACLDataContainer container) throws WbemsmtException {
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

	public void delete(Linux_SambaShareOptions fco) throws WbemsmtException {
		
		if (share.getCimObjectPath().equals(fco.getCimObjectPath()))
		{
			adapter.getFcoHelper().delete(fco,adapter.getCimClient());
		}
		else
		{
			throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,"Cannot delete object - wrong share selected");
		}
		adapter.setMarkedForReload();
	}
	
}
