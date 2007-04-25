 /** 
  * ShareGlobals.java
  *
  * ï¿½ Copyright IBM Corp. 2005
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
  * Description: Class for wrapping the Share Globals business object and the related actions
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt8;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.bl.fco.FcoHelper;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.ObjectDeletionException;
import org.sblim.wbemsmt.exception.ObjectRevertException;
import org.sblim.wbemsmt.exception.ObjectSaveException;
import org.sblim.wbemsmt.exception.UpdateControlsException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter;
import org.sblim.wbemsmt.samba.bl.adapter.SambaObject;
import org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobals;
import org.sblim.wbemsmt.samba.bl.container.global.CMDShareGlobalsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.global.GUIShareGlobalsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.global.ShareGlobalsDataContainer;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaAdminUsersForGlobal;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaGlobalFileNameHandlingOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaGlobalOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaGlobalProtocolOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareSecurityOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser;

public class ShareGlobals extends SambaObject {

	private final Service service;
	private Linux_SambaGlobalFileNameHandlingOptions filenameHandlingOptions1;
	private Linux_SambaGlobalProtocolOptions protocolOptions1;
	private Linux_SambaShareSecurityOptions shareSecurityOptions1;
	private Set adminsBySambaUserName;

	public ShareGlobals(Service service, SambaCimAdapter adapter) throws ModelLoadException {
		super(adapter);
		this.service = service;
		loadGlobalShareAdmins(adapter.getCimClient());
	}

	private void loadGlobalShareAdmins(CIMClient cimClient) throws ModelLoadException
	{
		//get the associated Admin
		List admins = service.getGlobalOptions(cimClient).getAssociated_Linux_SambaUser_Linux_SambaAdminUsersForGlobals(cimClient,false,false,null);
		adminsBySambaUserName = new HashSet();
		for (Iterator iter = admins.iterator(); iter.hasNext();) {
			Linux_SambaUser user = (Linux_SambaUser) iter.next();
			adminsBySambaUserName.add(user.get_SambaUserName());			
		}
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaObject#loadChilds(org.sblim.wbem.client.CIMClient)
	 */
	public void reloadChilds(CIMClient cimClient) throws ModelLoadException {
		
		getFileNameHandlingOptions(cimClient);
		getProtocolOptions(cimClient);
		getShareSecurityOptions(cimClient);
		
		reloadChilds = false;
	}
	
	private Linux_SambaGlobalFileNameHandlingOptions getFileNameHandlingOptions(CIMClient cimClient) throws ModelLoadException {
		if (filenameHandlingOptions1 == null || reloadChilds)
		{
			filenameHandlingOptions1 = (Linux_SambaGlobalFileNameHandlingOptions)getFirstChild(Linux_SambaGlobalFileNameHandlingOptions.class,service.getGlobalOptions(cimClient).getAssociated_Linux_SambaGlobalFileNameHandlingOptions_Linux_SambaGlobalFileNameHandlingForGlobal_Names(cimClient,false), false);
		}
		return filenameHandlingOptions1;
	}

	private Linux_SambaGlobalProtocolOptions getProtocolOptions(CIMClient cimClient) throws ModelLoadException {
		if (protocolOptions1 == null || reloadChilds)
		{
			protocolOptions1 = (Linux_SambaGlobalProtocolOptions)getFirstChild(Linux_SambaGlobalProtocolOptions.class,service.getGlobalOptions(cimClient).getAssociated_Linux_SambaGlobalProtocolOptions_Linux_SambaGlobalProtocolForGlobal_Names(cimClient,false), false);
		}
		return protocolOptions1;
	}

	private Linux_SambaShareSecurityOptions getShareSecurityOptions(CIMClient cimClient) throws ModelLoadException {
		if (shareSecurityOptions1 == null || reloadChilds)
		{
			shareSecurityOptions1 = (Linux_SambaShareSecurityOptions)getFirstChild(Linux_SambaShareSecurityOptions.class,service.getGlobalOptions(cimClient).getAssociated_Linux_SambaShareSecurityOptions_Linux_SambaShareSecurityForGlobal_Names(cimClient,false), false);
		}
		return shareSecurityOptions1;
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaObject#getCimObjectKey()
	 */
	public CimObjectKey getCimObjectKey() {
		return service.getCimObjectKey();
	}

	public void updateControls(GUIShareGlobalsDataContainer container) throws UpdateControlsException
	{
		try {
			CIMClient cc = container.getAdapter().getCimClient();
			
			updateShareControls(container);
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
			
			container.getAdapter().updateControls(container.getUsers(),service.getUsers().getFCOs());
			
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
	
	}


	public void updateControls(CMDShareGlobalsDataContainer container)  throws UpdateControlsException 
	{
		try {
			updateShareControls(container);
			CIMClient cc = container.getAdapter().getCimClient();
			container.get_CreateMask().setControlValue(getShareSecurityOptions(cc).get_CreateMask());
			container.get_DirectoryMask().setControlValue(getShareSecurityOptions(cc).get_DirectoryMask());
			container.get_DirectorySecurityMask().setControlValue(getShareSecurityOptions(cc).get_DirectorySecurityMask());
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
	}

	public void updateShareControls(ShareGlobalsDataContainer container)  throws UpdateControlsException 
	{
		try {
			CIMClient cc = container.getAdapter().getCimClient();
			container.get_AclCompatibility().setValues(new String[]{Linux_SambaGlobalProtocolOptions.ACLCOMPATIBILITY_0,Linux_SambaGlobalProtocolOptions.ACLCOMPATIBILITY_1,Linux_SambaGlobalProtocolOptions.ACLCOMPATIBILITY_2});
			container.get_AclCompatibility().setControlValue(getProtocolOptions(cc).get_AclCompatibility());
			container.get_CaseSensitive().setControlValue(getFileNameHandlingOptions(cc).get_CaseSensitive());
			container.get_DosFiletimes().setControlValue(getFileNameHandlingOptions(cc).get_DosFiletimes());
			container.get_EASupport().setControlValue(getProtocolOptions(cc).get_EASupport());
			container.get_HideDotFiles().setControlValue(getFileNameHandlingOptions(cc).get_HideDotFiles());
			container.get_NTACLSupport().setControlValue(getProtocolOptions(cc).get_NTACLSupport());
			
			//Currently there are no admins for share globals
			//container.getAdapter().updateControls(container.getUsers(),service.getUsers().getFCOs());
			
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);		
		}
	}

	public MessageList save(CMDShareGlobalsDataContainer container) throws ObjectSaveException {
		try {
//			CIMClient cc = container.getAdapter().getCimClient();
			saveShareGlobals(container);
//			getShareSecurityOptions(cc).set_DirectoryMask((UnsignedInt16) container.get_DirectoryMask().getConvertedControlValue());
//			getShareSecurityOptions(cc).set_DirectorySecurityMask((UnsignedInt16) container.get_DirectorySecurityMask().getConvertedControlValue());
//			getShareSecurityOptions(cc).set_CreateMask((UnsignedInt16) container.get_CreateMask().getConvertedControlValue());
			reloadChilds = true;
			reloadChilds(container.getAdapter().getCimClient());
//			FcoHelper.save(getShareSecurityOptions(cc),cc);
//			shareSecurityOptions1 = null;

			resetShareAcl(service);
			resetShareChilds(service);
			resetUserAcl(service);
			
			return null;
		} catch (ModelLoadException e) {
			throw new ObjectSaveException(e);
		}
	}

	public MessageList save(GUIShareGlobalsDataContainer container) throws ObjectSaveException {
		try {
			saveShareGlobals(container);
//			CIMClient cc = container.getAdapter().getCimClient();		
//			UnsignedInt16 createMask = updateModel(container.get_usr_Create_u(),container.get_usr_Create_g(),container.get_usr_Create_s(),
//					container.get_usr_Create_user_r(),container.get_usr_Create_user_w(),container.get_usr_Create_user_x(),
//					container.get_usr_Create_group_r(),container.get_usr_Create_group_w(),container.get_usr_Create_group_x(),
//					container.get_usr_Create_other_r(),container.get_usr_Create_other_w(),container.get_usr_Create_other_x());
//
//			UnsignedInt16 directoryMask = updateModel(container.get_usr_Directory_u(),container.get_usr_Directory_g(),container.get_usr_Directory_s(),
//					container.get_usr_Directory_user_r(),container.get_usr_Directory_user_w(),container.get_usr_Directory_user_x(),
//					container.get_usr_Directory_group_r(),container.get_usr_Directory_group_w(),container.get_usr_Directory_group_x(),
//					container.get_usr_Directory_other_r(),container.get_usr_Directory_other_w(),container.get_usr_Directory_other_x());
//			
//			UnsignedInt16 directorySecurityMask = updateModel(container.get_usr_Directory_security_u(),container.get_usr_Directory_security_g(),container.get_usr_Directory_security_s(),
//					container.get_usr_Directory_security_user_r(),container.get_usr_Directory_security_user_w(),container.get_usr_Directory_security_user_x(),
//					container.get_usr_Directory_security_group_r(),container.get_usr_Directory_security_group_w(),container.get_usr_Directory_security_group_x(),
//					container.get_usr_Directory_security_other_r(),container.get_usr_Directory_security_other_w(),container.get_usr_Directory_security_other_x());
//			
//			getShareSecurityOptions(cc).set_CreateMask(createMask);
//			getShareSecurityOptions(cc).set_DirectoryMask(directoryMask);
//			getShareSecurityOptions(cc).set_DirectorySecurityMask(directorySecurityMask);
			
			//Currently there are no admins for share globals
			//container.getAdapter().save(container.getUsers(),service.getUsers().getFCOs());
			
			
//			FcoHelper.save(getShareSecurityOptions(cc),cc);
//			shareSecurityOptions1 = null;
		
			container.getAdapter().save(container.getUsers(),service.getUsers().getFCOs());

			reloadChilds = true;
			reloadChilds(container.getAdapter().getCimClient());

			
			
			resetShareAcl(service);
			resetShareChilds(service);
			resetUserAcl(service);
		
		} catch (ModelLoadException e) {
			throw new ObjectSaveException(e);
		}
		return null;
	}
	

	public void saveShareGlobals(ShareGlobalsDataContainer container)  throws ObjectSaveException 
	{
		try {
			CIMClient cc = container.getAdapter().getCimClient();		
			getProtocolOptions(cc).set_AclCompatibility((UnsignedInt8) container.get_AclCompatibility().getConvertedControlValue());
			getFileNameHandlingOptions(cc).set_CaseSensitive((Boolean) container.get_CaseSensitive().getConvertedControlValue());
			getFileNameHandlingOptions(cc).set_DosFiletimes((Boolean) container.get_DosFiletimes().getConvertedControlValue());
			getProtocolOptions(cc).set_EASupport((Boolean) container.get_EASupport().getConvertedControlValue());
			getFileNameHandlingOptions(cc).set_HideDotFiles((Boolean) container.get_HideDotFiles().getConvertedControlValue());
			getProtocolOptions(cc).set_NTACLSupport((Boolean) container.get_NTACLSupport().getConvertedControlValue());
			
			FcoHelper.save(getProtocolOptions(cc),cc);
			FcoHelper.save(getFileNameHandlingOptions(cc),cc);
			
			//force a reload next time
			protocolOptions1 = null;
			filenameHandlingOptions1 = null;
			
		} catch (ModelLoadException e) {
			throw new ObjectSaveException(e);
		}
	}

	public MessageList save(AdminUsersInShareGlobals container) {
		
		return null;
	}

	/**
	 * Called from commandline
	 * @param container
	 * @throws UpdateControlsException 
	 */
	public void updateControls(AdminUsersInShareGlobals container) throws UpdateControlsException {
		super.updateSharePrinterAdminForGlobalControls(container,adminsBySambaUserName,service);
	}

	public MessageList save(AdminUsersInShareGlobals container, Linux_SambaUser fco) throws ObjectSaveException {
		
		CIMClient cc = container.getAdapter().getCimClient();
		String userName = (String) container.get_usr_SambaUserName().getConvertedControlValue();
		boolean checked = ((Boolean) container.get_usr_Admin().getConvertedControlValue()).booleanValue();

		try {
			if (!checked && adminsBySambaUserName.contains(userName))
			{
				Vector vKeyProperties = new Vector();
				CIMDataType dataTypeGlobals = new CIMDataType(Linux_SambaGlobalOptions.CIM_CLASS_NAME);
				CIMValue valueGlobals = new CIMValue(service.getGlobalOptions(cc ).getCimObjectPath(), dataTypeGlobals);
				CIMProperty propertyGlobals = new CIMProperty(Linux_SambaAdminUsersForGlobal.CIM_PROPERTY_LINUX_SAMBAGLOBALOPTIONS, valueGlobals);
				CIMValue valueUser = new CIMValue(fco.getCimObjectPath(), new CIMDataType(Linux_SambaUser.CIM_CLASS_NAME));
				CIMProperty propertyUser = new CIMProperty(Linux_SambaAdminUsersForGlobal.CIM_PROPERTY_LINUX_SAMBAUSER, valueUser);
				
				vKeyProperties.add(propertyUser);
				vKeyProperties.add(propertyGlobals);
				FcoHelper.delete(Linux_SambaAdminUsersForGlobal.class,vKeyProperties,cc);
				loadGlobalShareAdmins(cc);
			}
			else if (checked && !adminsBySambaUserName.contains(userName))
			{
				Linux_SambaAdminUsersForGlobal assoc = new Linux_SambaAdminUsersForGlobal();
				assoc.set_Linux_SambaGlobalOptions(service.getGlobalOptions(cc));
				assoc.set_Linux_SambaUser(fco);
				FcoHelper.create(assoc,cc);
				loadGlobalShareAdmins(cc);
			}
		} catch (ModelLoadException e) {
			throw new ObjectSaveException(e);
		} catch (ObjectDeletionException e) {
			throw new ObjectSaveException(e);
		}
		
		return null;
	}

	public void updateControls(AdminUsersInShareGlobals container, Linux_SambaUser fco) {
		super.updateSharePrinterAdminForGlobalControls(container,fco,adminsBySambaUserName);
	}


	public MessageList revert(AdminUsersInShareGlobals container, Linux_SambaUser fco) throws ObjectRevertException {
		try {
			loadGlobalShareAdmins(container.getAdapter().getCimClient());
		} catch (ModelLoadException e) {
			throw new ObjectRevertException(e);
		}
		return null;
	}

	public MessageList revert(ShareGlobalsDataContainer container) throws ObjectRevertException {
		
		reloadChilds = true;
		try {
			reloadChilds(container.getAdapter().getCimClient());
		} catch (ModelLoadException e) {
			throw new ObjectRevertException(e);
		}
		resetPrinterAcl(service);
		resetPrinterChilds(service);
		resetUserAcl(service);
		return null;
	}

	public MessageList revert(AdminUsersInShareGlobals container) throws ObjectRevertException {
		try {
			loadGlobalShareAdmins(container.getAdapter().getCimClient());
		} catch (ModelLoadException e) {
			throw new ObjectRevertException(e);
		}
		return null;
	}

	
	public void revertShareGlobals(ShareGlobalsDataContainer container) throws ObjectRevertException {
		reloadChilds = true;
		try {
			reloadChilds(container.getAdapter().getCimClient());
		} catch (ModelLoadException e) {
			throw new ObjectRevertException(e);
		}
		
		resetShareAcl(service);
		resetShareChilds(service);
		resetUserAcl(service);

		//force a reload next time
		protocolOptions1 = null;
		filenameHandlingOptions1 = null;
	}
}
