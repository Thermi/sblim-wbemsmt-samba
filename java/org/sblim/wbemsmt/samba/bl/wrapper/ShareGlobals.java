 /** 
  * ShareGlobals.java
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
  * Description: Class for wrapping the Share Globals business object and the related actions
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper;

import java.util.*;

import javax.cim.UnsignedInteger8;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter;
import org.sblim.wbemsmt.samba.bl.adapter.SambaObject;
import org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobals;
import org.sblim.wbemsmt.samba.bl.container.global.CMDShareGlobalsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.global.GUIShareGlobalsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.global.ShareGlobalsDataContainer;
import org.sblim.wbemsmt.samba.bl.fco.*;

public class ShareGlobals extends SambaObject {

	private final Service service;
	private Linux_SambaGlobalFileNameHandlingOptions filenameHandlingOptions1;
	private Linux_SambaGlobalProtocolOptions protocolOptions1;
	private Linux_SambaShareSecurityOptions shareSecurityOptions1;
	private Set adminsBySambaUserName;

	public ShareGlobals(Service service, SambaCimAdapter adapter) throws WbemsmtException {
		super(adapter);
		this.service = service;
		loadGlobalShareAdmins();
	}

	private void loadGlobalShareAdmins() throws WbemsmtException
	{
		//get the associated Admin
	    WBEMClient cimClient = adapter.getCimClient();
	    
	    List admins = service.getGlobalOptions().getAssociated_Linux_SambaUser_Linux_SambaAdminUsersForGlobals(cimClient);
        adminsBySambaUserName = new HashSet();
        for (Iterator iter = admins.iterator(); iter.hasNext();) {
        	Linux_SambaUser user = (Linux_SambaUser) iter.next();
        	adminsBySambaUserName.add(user.get_key_SambaUserName());			
        }
	}

	public void reloadChilds() throws WbemsmtException {
		
		getFileNameHandlingOptions();
		getProtocolOptions();
		getShareSecurityOptions();
		
		reloadChilds = false;
	}
	
	private Linux_SambaGlobalFileNameHandlingOptions getFileNameHandlingOptions() throws WbemsmtException {
		if (filenameHandlingOptions1 == null || reloadChilds)
        {
        	filenameHandlingOptions1 = (Linux_SambaGlobalFileNameHandlingOptions)getFirstChild(Linux_SambaGlobalFileNameHandlingOptions.class,service.getGlobalOptions().getAssociated_Linux_SambaGlobalFileNameHandlingOptions_Linux_SambaGlobalFileNameHandlingForGlobalNames(adapter.getCimClient()), false);
        }
        return filenameHandlingOptions1;
	}

	private Linux_SambaGlobalProtocolOptions getProtocolOptions() throws WbemsmtException {
		if (protocolOptions1 == null || reloadChilds)
        {
        	protocolOptions1 = (Linux_SambaGlobalProtocolOptions)getFirstChild(Linux_SambaGlobalProtocolOptions.class,service.getGlobalOptions().getAssociated_Linux_SambaGlobalProtocolOptions_Linux_SambaGlobalProtocolForGlobalNames(adapter.getCimClient()), false);
        }
        return protocolOptions1;
	}

	private Linux_SambaShareSecurityOptions getShareSecurityOptions() throws WbemsmtException {
		if (shareSecurityOptions1 == null || reloadChilds)
        {
        	shareSecurityOptions1 = (Linux_SambaShareSecurityOptions)getFirstChild(Linux_SambaShareSecurityOptions.class,service.getGlobalOptions().getAssociated_Linux_SambaShareSecurityOptions_Linux_SambaShareSecurityForGlobalNames(adapter.getCimClient()), false);
        }
        return shareSecurityOptions1;
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaObject#getCimObjectKey()
	 */
	public CimObjectKey getCimObjectKey() {
		return service.getCimObjectKey();
	}

	public void updateControls(GUIShareGlobalsDataContainer container) throws WbemsmtException
	{
		updateShareControls(container);
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
        
        container.getAdapter().updateControls(container.getUsers(),service.getUsers().getFCOs());
	
	}


	public void updateControls(CMDShareGlobalsDataContainer container)  throws WbemsmtException 
	{
		updateShareControls(container);
        container.get_CreateMask().setControlValue(getShareSecurityOptions().get_CreateMask());
        container.get_DirectoryMask().setControlValue(getShareSecurityOptions().get_DirectoryMask());
        container.get_DirectorySecurityMask().setControlValue(getShareSecurityOptions().get_DirectorySecurityMask());
	}

	public void updateShareControls(ShareGlobalsDataContainer container)  throws WbemsmtException 
	{
		container.get_AclCompatibility().setValues(Linux_SambaProtocolOptions.PROPERTY_ACLCOMPATIBILITY.VALUE_ENTRIES_FOR_DISPLAY);
        int indexForDisplay = Linux_SambaProtocolOptions.PROPERTY_ACLCOMPATIBILITY.getIndexForDisplay(getProtocolOptions().get_AclCompatibility());
        container.get_AclCompatibility().setControlValue(indexForDisplay != -1 ? new UnsignedInteger8(""+indexForDisplay) : null);
        container.get_CaseSensitive().setControlValue(getFileNameHandlingOptions().get_CaseSensitive());
        container.get_DosFiletimes().setControlValue(getFileNameHandlingOptions().get_DosFiletimes());
        container.get_EASupport().setControlValue(getProtocolOptions().get_EASupport());
        container.get_HideDotFiles().setControlValue(getFileNameHandlingOptions().get_HideDotFiles());
        container.get_NTACLSupport().setControlValue(getProtocolOptions().get_NTACLSupport());
	}

	public MessageList save(CMDShareGlobalsDataContainer container) throws WbemsmtException {
		//			WBEMClient cc = container.getAdapter().getCimClient();
        			saveShareGlobals(container);
        //			getShareSecurityOptions(cc).set_DirectoryMask((UnsignedInteger16) container.get_DirectoryMask().getConvertedControlValue());
        //			getShareSecurityOptions(cc).set_DirectorySecurityMask((UnsignedInteger16) container.get_DirectorySecurityMask().getConvertedControlValue());
        //			getShareSecurityOptions(cc).set_CreateMask((UnsignedInteger16) container.get_CreateMask().getConvertedControlValue());
        			reloadChilds = true;
        			reloadChilds();
        //			adapter.getFcoHelper().save(getShareSecurityOptions(cc),cc);
        //			shareSecurityOptions1 = null;
        
        			resetShareAcl(service);
        			resetShareChilds(service);
        			resetUserAcl(service);
        			
        			return null;
	}

	public MessageList save(GUIShareGlobalsDataContainer container) throws WbemsmtException {
		saveShareGlobals(container);
//			WBEMClient cc = container.getAdapter().getCimClient();		
//			UnsignedInteger16 createMask = updateModel(container.get_usr_Create_u(),container.get_usr_Create_g(),container.get_usr_Create_s(),
//					container.get_usr_Create_user_r(),container.get_usr_Create_user_w(),container.get_usr_Create_user_x(),
//					container.get_usr_Create_group_r(),container.get_usr_Create_group_w(),container.get_usr_Create_group_x(),
//					container.get_usr_Create_other_r(),container.get_usr_Create_other_w(),container.get_usr_Create_other_x());
//
//			UnsignedInteger16 directoryMask = updateModel(container.get_usr_Directory_u(),container.get_usr_Directory_g(),container.get_usr_Directory_s(),
//					container.get_usr_Directory_user_r(),container.get_usr_Directory_user_w(),container.get_usr_Directory_user_x(),
//					container.get_usr_Directory_group_r(),container.get_usr_Directory_group_w(),container.get_usr_Directory_group_x(),
//					container.get_usr_Directory_other_r(),container.get_usr_Directory_other_w(),container.get_usr_Directory_other_x());
//			
//			UnsignedInteger16 directorySecurityMask = updateModel(container.get_usr_Directory_security_u(),container.get_usr_Directory_security_g(),container.get_usr_Directory_security_s(),
//					container.get_usr_Directory_security_user_r(),container.get_usr_Directory_security_user_w(),container.get_usr_Directory_security_user_x(),
//					container.get_usr_Directory_security_group_r(),container.get_usr_Directory_security_group_w(),container.get_usr_Directory_security_group_x(),
//					container.get_usr_Directory_security_other_r(),container.get_usr_Directory_security_other_w(),container.get_usr_Directory_security_other_x());
//			
//			getShareSecurityOptions(cc).set_CreateMask(createMask);
//			getShareSecurityOptions(cc).set_DirectoryMask(directoryMask);
//			getShareSecurityOptions(cc).set_DirectorySecurityMask(directorySecurityMask);
        
        //Currently there are no admins for share globals
        //container.getAdapter().save(container.getUsers(),service.getUsers().getFCOs());
        
        
//			adapter.getFcoHelper().save(getShareSecurityOptions(cc),cc);
//			shareSecurityOptions1 = null;

        container.getAdapter().save(container.getUsers(),service.getUsers().getFCOs());

        reloadChilds = true;
        reloadChilds();

        
        
        resetShareAcl(service);
        resetShareChilds(service);
        resetUserAcl(service);
		return null;
	}
	

	public void saveShareGlobals(ShareGlobalsDataContainer container)  throws WbemsmtException 
	{
		WBEMClient cc = container.getAdapter().getCimClient();		
        getProtocolOptions().set_AclCompatibility(Linux_SambaProtocolOptions.PROPERTY_ACLCOMPATIBILITY.getValueMapEntryFromDisplayedValue((Number) container.get_AclCompatibility().getConvertedControlValue()));
        getFileNameHandlingOptions().set_CaseSensitive((Boolean) container.get_CaseSensitive().getConvertedControlValue());
        getFileNameHandlingOptions().set_DosFiletimes((Boolean) container.get_DosFiletimes().getConvertedControlValue());
        getProtocolOptions().set_EASupport((Boolean) container.get_EASupport().getConvertedControlValue());
        getFileNameHandlingOptions().set_HideDotFiles((Boolean) container.get_HideDotFiles().getConvertedControlValue());
        getProtocolOptions().set_NTACLSupport((Boolean) container.get_NTACLSupport().getConvertedControlValue());
        
        adapter.getFcoHelper().save(getProtocolOptions(),cc);
        adapter.getFcoHelper().save(getFileNameHandlingOptions(),cc);
        
        //force a reload next time
        protocolOptions1 = null;
        filenameHandlingOptions1 = null;
	}

	public MessageList save(AdminUsersInShareGlobals container) {
		
		return null;
	}

	/**
	 * Called from commandline
	 * @param container
	 * @throws WbemsmtException 
	 */
	public void updateControls(AdminUsersInShareGlobals container) throws WbemsmtException {
		super.updateSharePrinterAdminForGlobalControls(container,adminsBySambaUserName,service);
	}

	public MessageList save(AdminUsersInShareGlobals container, Linux_SambaUser fco) throws WbemsmtException {
		
		WBEMClient cc = container.getAdapter().getCimClient();
		String userName = (String) container.get_usr_SambaUserName().getConvertedControlValue();
		boolean checked = ((Boolean) container.get_usr_Admin().getConvertedControlValue()).booleanValue();

		if (!checked && adminsBySambaUserName.contains(userName))
        {
        	Vector vKeyProperties = new Vector();
            vKeyProperties.add(Linux_SambaAdminUsersForGlobal.create_GroupComponent_Linux_SambaGlobalOptions(adapter.getCimClient(), adapter.getNamespace(), service.getGlobalOptions()));
            vKeyProperties.add(Linux_SambaAdminUsersForGlobal.create_PartComponent_Linux_SambaUser(adapter.getCimClient(), adapter.getNamespace(), fco));

        	AbstractWbemsmtFco assoc = adapter.getFcoHelper().getInstance(Linux_SambaAdminUsersForGlobalHelper.class, adapter.getNamespace(), vKeyProperties, cc);
        	adapter.getFcoHelper().delete(assoc,cc);
        	loadGlobalShareAdmins();
        }
        else if (checked && !adminsBySambaUserName.contains(userName))
        {
        	Linux_SambaAdminUsersForGlobal assoc = new Linux_SambaAdminUsersForGlobal(cc,adapter.getNamespace());
        	assoc.set_GroupComponent_Linux_SambaGlobalOptions(service.getGlobalOptions());
        	assoc.set_PartComponent_Linux_SambaUser(fco);
        	adapter.getFcoHelper().create(assoc,cc);
        	loadGlobalShareAdmins();
        }
		
		return null;
	}

	public void updateControls(AdminUsersInShareGlobals container, Linux_SambaUser fco) {
		super.updateSharePrinterAdminForGlobalControls(container,fco,adminsBySambaUserName);
	}


	public MessageList revert(AdminUsersInShareGlobals container, Linux_SambaUser fco) throws WbemsmtException {
		loadGlobalShareAdmins();
		return null;
	}

	public MessageList revert(ShareGlobalsDataContainer container) throws WbemsmtException {
		
		reloadChilds = true;
		reloadChilds();
        resetPrinterAcl(service);
        resetPrinterChilds(service);
        resetUserAcl(service);
		return null;
	}

	public MessageList revert(AdminUsersInShareGlobals container) throws WbemsmtException {
		loadGlobalShareAdmins();
		return null;
	}

	
	public void revertShareGlobals(ShareGlobalsDataContainer container) throws WbemsmtException {
		reloadChilds = true;
		reloadChilds();
        resetShareAcl(service);
        resetShareChilds(service);
        resetUserAcl(service);
		

		//force a reload next time
		protocolOptions1 = null;
		filenameHandlingOptions1 = null;
	}
}
