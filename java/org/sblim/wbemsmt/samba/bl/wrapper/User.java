 /** 
  * User.java
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
  * Description: Wrapper for SambaUserObjects and childs
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper;

import java.util.HashSet;
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
import org.sblim.wbemsmt.exception.ObjectSaveException;
import org.sblim.wbemsmt.exception.UpdateControlsException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaObject;
import org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.ShareACLItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.PrinterInUserACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.ShareInUserACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.UserDataContainer;
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
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class User extends SambaObject {

	private Linux_SambaUser user;

	protected Set invalidPrinters = null;
	protected Set validPrinters = null;
	protected Set readPrinters = null;
	protected Set writePrinters = null;
	protected Set forcePrinters = null;
	protected Set adminPrinters = null;
	
	protected Set invalidShares = null;
	protected Set validShares = null;
	protected Set forceShares = null;
	protected Set adminShares = null;
	protected Set readShares = null;
	protected Set writeShares = null;

	private boolean isGuestWorkingCopy;

	private boolean isGuestOnServer;

	private final Service service;

	private boolean reloadPrinterInUser = false;
	private boolean reloadShareInUser = false;

	
	public User(Service service, Linux_SambaUser userFco, CIMClient cimClient) throws ModelLoadException {
		this.service = service;
		user = userFco;
		isGuestOnServer = isGuestWorkingCopy = service.isGuest(cimClient,user);
	}

	public void resetAcl() {
		forceShares = null;
		invalidShares = null;
		validShares = null;
		adminShares = null;
		writeShares = null;
		readShares = null;
		
		forcePrinters = null;
		invalidPrinters = null;
		validPrinters = null;
		adminPrinters = null;		
	}
		
	private void loadShareAcl(CIMClient cimClient) {
		forceShares = new HashSet();
		invalidShares = new HashSet();
		validShares = new HashSet();
		adminShares = new HashSet();
		writeShares = new HashSet();
		readShares = new HashSet();
		
		setUserShares(forceShares,user.getAssociated_Linux_SambaShareOptions_Linux_SambaForceUserForShare_Names(cimClient,false));
		setUserShares(invalidShares,user.getAssociated_Linux_SambaShareOptions_Linux_SambaInvalidUsersForShare_Names(cimClient,false));
		setUserShares(validShares,user.getAssociated_Linux_SambaShareOptions_Linux_SambaValidUsersForShare_Names(cimClient,false));
		setUserShares(readShares,user.getAssociated_Linux_SambaShareOptions_Linux_SambaReadListForShare_Names(cimClient,false));
		setUserShares(writeShares,user.getAssociated_Linux_SambaShareOptions_Linux_SambaWriteListForShare_Names(cimClient,false));
		setUserShares(adminShares,user.getAssociated_Linux_SambaShareOptions_Linux_SambaAdminUsersForShare_Names(cimClient,false));
	}

	private void loadPrinterAcl(CIMClient cimClient) throws ModelLoadException {
		forcePrinters = new HashSet();
		invalidPrinters = new HashSet();
		validPrinters = new HashSet();
		readPrinters = new HashSet();
		writePrinters = new HashSet();
		adminPrinters = new HashSet();
		setUserPrinters(forcePrinters,user.getAssociated_Linux_SambaPrinterOptions_Linux_SambaForceUserForPrinter_Names(cimClient,false));
		setUserPrinters(adminPrinters,user.getAssociated_Linux_SambaPrinterOptions_Linux_SambaPrinterAdminForPrinter_Names(cimClient,false));
		setUserPrinters(invalidPrinters,user.getAssociated_Linux_SambaPrinterOptions_Linux_SambaInvalidUsersForPrinter_Names(cimClient,false));
		setUserPrinters(validPrinters,user.getAssociated_Linux_SambaPrinterOptions_Linux_SambaValidUsersForPrinter_Names(cimClient,false));
		setUserPrinters(readPrinters,user.getAssociated_Linux_SambaPrinterOptions_Linux_SambaReadListForPrinter_Names(cimClient,false));
		setUserPrinters(writePrinters,user.getAssociated_Linux_SambaPrinterOptions_Linux_SambaWriteListForPrinter_Names(cimClient,false));
	}
	
	public CimObjectKey getCimObjectKey() {
		return new CimObjectKey(user.getCimObjectPath());
	}

	public Linux_SambaUser getUser() {
		return user;
	}

	public void updateControls(PrinterInUserACLDataContainer container) throws UpdateControlsException {
		container.getAdapter().updateControls(container.getPrinters(),service.getPrinters().getFCOs());
	}

	public void updateControls(ShareInUserACLDataContainer container) throws UpdateControlsException {
		container.getAdapter().updateControls(container.getShares(),service.getShares().getFCOs());
	}

	public void updateControls(UserDataContainer container) {
		container.get_SambaUserName().setControlValue(user.get_SambaUserName());
		container.get_SystemUserName().setControlValue(user.get_SystemUserName());
		//password is not set
		container.get_usr_IsGuest().setControlValue(new Boolean(isGuestWorkingCopy));
	}

	public MessageList save(ShareACLItemDataContainer container) throws ObjectSaveException {
		Linux_SambaShareOptions fco = service.getShares().getShareByName((String) container.get_ShareName().getConvertedControlValue()).getShare();
		reloadShareInUser = saveShareACL(container,fco ,user);
		if (reloadShareInUser)
		{
			resetAcl();
			reloadShareInUser = false;
		}
		return null;
	}

	public MessageList save(PrinterACLItemDataContainer container) throws ObjectSaveException {
		Linux_SambaPrinterOptions fco = service.getPrinters().getPrinterByName((String) container.get_PrinterName().getConvertedControlValue()).getPrinter();
		reloadPrinterInUser = savePrinterACL(container,fco ,user);
		if (reloadPrinterInUser)
		{
			resetAcl();
			reloadPrinterInUser = false;
		}
		return null;
	}

	public MessageList save(ShareACLItemDataContainer container, Linux_SambaShareOptions fco) throws ObjectSaveException {
		reloadShareInUser = saveShareACL(container,fco,user) || reloadShareInUser;
		return null;
	}

	public MessageList save(PrinterACLItemDataContainer container, Linux_SambaPrinterOptions fco) throws ObjectSaveException {
		reloadPrinterInUser = savePrinterACL(container,fco,user) || reloadPrinterInUser;
		return null;
	}
	
	public MessageList save(ShareInUserACLDataContainer container) throws ObjectSaveException {
		reloadShareInUser = false;
		CIMClient cc = container.getAdapter().getCimClient();
		MessageList list = container.getAdapter().save(container.getShares(),service.getShares().getFCOs());
		if (reloadShareInUser)
		{
			try {
				loadPrinterAcl(cc);
				loadShareAcl(cc);
				reloadShareInUser  = false;
				reloadPrinterInUser = false;
			} catch (ModelLoadException e) {
				throw new ObjectSaveException(user,e);
			}
			
			//force reload
			resetPrinterAcl(service);
			resetShareAcl(service);
		}
		return list;
	}

	public MessageList save(PrinterInUserACLDataContainer container) throws ObjectSaveException {
		reloadPrinterInUser = false;
		MessageList list = container.getAdapter().save(container.getPrinters(),service.getPrinters().getFCOs());
		if (reloadPrinterInUser)
		{
			try {
				loadPrinterAcl(container.getAdapter().getCimClient());
				reloadPrinterInUser  = false;
			} catch (ModelLoadException e) {
				throw new ObjectSaveException(user,e);
			}
		}
		return list;
	}

	public void updateControls(PrinterACLItemDataContainer container, Linux_SambaPrinterOptions fco) throws UpdateControlsException {
		
		try {
			CIMClient cc = container.getAdapter().getCimClient();
			container.get_PrinterName().setControlValue(fco.get_Name());
			updateValidInvalidWithUserList(container,container.get_usr_AccessTypeVI(), fco.get_Name(), user.get_SambaUserName(), getInvalidPrinters(cc), getValidPrinters(cc), false, service,cc);
			updateReadWriteWithUserList(container,container.get_usr_AccessTypeRW(), fco.get_Name(), user.get_SambaUserName(),getReadPrinters(cc), getWritePrinters(cc), false, service,cc);
			updateAdminWithUserList(container,container.get_usr_Admin(), fco.get_Name(), user.get_SambaUserName(), getAdminPrinters(cc), service,cc,service.getPrinterGlobals().getAdminUsers(cc));
		}catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
	}

	public void updateControls(ShareACLItemDataContainer container, Linux_SambaShareOptions fco) throws UpdateControlsException  {
		try {
			CIMClient cc = container.getAdapter().getCimClient();
			container.get_ShareName().setControlValue(fco.get_Name());
			updateValidInvalidWithUserList(container,container.get_usr_AccessTypeVI(), fco.get_Name(),user.get_SambaUserName(), getInvalidShares(cc), getValidShares(cc), false, service,cc);
			updateReadWriteWithUserList(container,container.get_usr_AccessTypeRW(), fco.get_Name(),user.get_SambaUserName(), getReadShares(cc), getWriteShares(cc), false, service,cc);
			updateAdminWithUserList(container,container.get_usr_Admin(), fco.get_Name(), user.get_SambaUserName(), getAdminShares(cc), service,cc,service.getAdminUsers(cc));
		}catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
	}

	protected void updateValidInvalidWithUserList(DataContainer container, LabeledStringArrayInputComponentIf viField, String keyLocal, String keyGlobal, Set invalidSet, Set validSet, boolean globalAcl, Service service, CIMClient cc) throws UpdateControlsException {
		UnsignedInt16 selectedIV = null; 

		try {
			WbemSmtResourceBundle bundle = container.getAdapter().getBundle();
			viField.setValues(getValidInvalidTypes(bundle));
			
			int count = (invalidSet.contains(keyLocal) ? 1 : 0);
			count = count + (validSet.contains(keyLocal) ? 1 : 0);

			if (!globalAcl && count > 1)
			{
				
				//check the global ones to get the info whats really matching
				//if globals contains an invalid user there must be an valid user in local
				if (service.getInvalidUsers(cc).contains(keyGlobal))
				{
					selectedIV = new UnsignedInt16(USR_ACL_IDX_ENABLE);
				}
				//if globals contains an valid user there must be an invalid user in local
				if (service.getValidUsers(cc).contains(keyGlobal))
				{
					selectedIV = new UnsignedInt16(USR_ACL_IDX_DISABLE);
				}
			}
			else
			{
				if (invalidSet.contains(keyLocal))
				{
					selectedIV = new UnsignedInt16(USR_ACL_IDX_DISABLE);
				}
				if (validSet.contains(keyLocal))
				{
					selectedIV = new UnsignedInt16(USR_ACL_IDX_ENABLE);
				}
			}
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
		
		if (selectedIV != null)
		{
			viField.setControlValue(new UnsignedInt16(selectedIV));
		}
//		else if (RuntimeUtil.getInstance().isCommandline())
//		{
//			viField.setValue(container.getAdapter().getBundle().getString("right.not.defined"));
//		}
	}

	protected void updateReadWriteWithUserList(DataContainer container, LabeledStringArrayInputComponentIf rwField, String keyLocal, String keyGlobal, Set readSet, Set writeSet, boolean globalAcl, Service service, CIMClient cc) throws UpdateControlsException {
		UnsignedInt16 selectedRW = null; 

		try {
			WbemSmtResourceBundle bundle = container.getAdapter().getBundle();
			rwField.setValues(getReadWriteTypes(bundle));
			
			int count = (readSet.contains(keyLocal) ? 1 : 0);
			count = count + (writeSet.contains(keyLocal) ? 1 : 0);

			if (!globalAcl && count > 1)
			{
				//check the global ones to get the info whats really matching
				//if globals contains an read user there must be an write user in local
				if (service.getReadUsers(cc).contains(keyGlobal))
				{
					selectedRW = new UnsignedInt16(USR_ACL_IDX_WRITE);
				}
				// if globals contains an write user there must be an read user in local
				if (service.getWriteUsers(cc).contains(keyGlobal))
				{
					selectedRW = new UnsignedInt16(USR_ACL_IDX_READ);
				}
			}
			else
			{
				if (readSet.contains(keyLocal))
				{
					selectedRW = new UnsignedInt16(USR_ACL_IDX_READ);
				}
				if (writeSet.contains(keyLocal))
				{
					selectedRW = new UnsignedInt16(USR_ACL_IDX_WRITE);
				}
			}
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
		
		if (selectedRW != null)
		{
			rwField.setControlValue(new UnsignedInt16(selectedRW));
		}
//		else if (RuntimeUtil.getInstance().isCommandline())
//		{
//			rwField.setValue(container.getAdapter().getBundle().getString("right.not.defined"));
//		}
	}
	
	protected void updateAdminWithUserList(DataContainer container, LabeledBaseInputComponentIf adminField, String localKey, String globalKey, Set adminUsers, Service service, CIMClient cc, Set setWithGlobalAdmins) throws UpdateControlsException {
		adminField.setControlValue(new Boolean(adminUsers.contains(localKey) || setWithGlobalAdmins.contains(globalKey)));
		adminField.getProperties().setReadOnly(setWithGlobalAdmins.contains(globalKey));
	}		

	public void updateControls(PrinterACLItemDataContainer container) throws UpdateControlsException  {
		String printerName = (String) container.get_PrinterName().getConvertedControlValue();
		Printer printerByName = service.getPrinters().getPrinterByName(printerName);
		if (printerByName == null)
		{
			String serviceName = service.getService().get_Name();
			throw new UpdateControlsException(container.getAdapter().getBundle().getString("printerInService.not.found",new Object[]{serviceName,printerName}));
		}
		Linux_SambaPrinterOptions fco = printerByName.getPrinter();
		updateControls(container,fco);
	}

	public void updateControls(ShareACLItemDataContainer container) throws UpdateControlsException  {
		String shareName = (String) container.get_ShareName().getConvertedControlValue();
		Share shareByName = service.getShares().getShareByName(shareName);
		if (shareByName == null)
		{
			String serviceName = service.getService().get_Name();
			throw new UpdateControlsException(container.getAdapter().getBundle().getString("shareInService.not.found",new Object[]{serviceName,shareName}));
		}
		Linux_SambaShareOptions fco = shareByName.getShare();
		updateControls(container,fco);		
	}

	private boolean savePrinterACL(PrinterACLItemDataContainer container, Linux_SambaPrinterOptions printer, Linux_SambaUser user) throws ObjectSaveException {
		boolean reloadShareUsers = false;
		CIMClient cc = container.getAdapter().getCimClient();

		Vector vKeyProperties = new Vector();
		vKeyProperties.add(new CIMProperty(Linux_SambaInvalidUsersForPrinter.CIM_PROPERTY_LINUX_SAMBAUSER, new CIMValue(user.getCimObjectPath(), new CIMDataType(Linux_SambaUser.CIM_CLASS_NAME))));
		vKeyProperties.add(new CIMProperty(Linux_SambaInvalidUsersForPrinter.CIM_PROPERTY_LINUX_SAMBAPRINTEROPTIONS, new CIMValue(printer.getCimObjectPath(), new CIMDataType(Linux_SambaShareOptions.CIM_CLASS_NAME))));
		
		boolean admin = ((Boolean)container.get_usr_Admin().getConvertedControlValue()).booleanValue();

		try {
			reloadShareUsers = save(admin, getAdminPrinters(cc),
					Linux_SambaPrinterAdminForPrinter.class, printer.get_Name(),
					vKeyProperties, cc);
			reloadShareUsers = saveValidInvalid(container.get_usr_AccessTypeVI(), printer,
					getInvalidPrinters(cc), getValidPrinters(cc), cc, vKeyProperties,
					Linux_SambaInvalidUsersForPrinter.class,
					Linux_SambaValidUsersForPrinter.class)
					|| reloadShareUsers;
			reloadShareUsers = saveReadWrite(container.get_usr_AccessTypeRW(), printer, getReadPrinters(cc),
					getWritePrinters(cc), cc, vKeyProperties,
					Linux_SambaReadListForPrinter.class,
					Linux_SambaWriteListForPrinter.class)
					|| reloadShareUsers;
			return reloadShareUsers;
		}catch (ModelLoadException e) {
			throw new ObjectSaveException(e);
		}
	}
	
	private boolean saveShareACL(ShareACLItemDataContainer container, Linux_SambaShareOptions share,  Linux_SambaUser user) throws ObjectSaveException {
		boolean reloadShareUsers = false;
		CIMClient cc = container.getAdapter().getCimClient();
		Vector vKeyProperties = new Vector();
		vKeyProperties.add(new CIMProperty(Linux_SambaInvalidUsersForShare.CIM_PROPERTY_LINUX_SAMBAUSER, new CIMValue(user.getCimObjectPath(), new CIMDataType(Linux_SambaUser.CIM_CLASS_NAME))));
		vKeyProperties.add(new CIMProperty(Linux_SambaInvalidUsersForShare.CIM_PROPERTY_LINUX_SAMBASHAREOPTIONS, new CIMValue(share.getCimObjectPath(), new CIMDataType(Linux_SambaShareOptions.CIM_CLASS_NAME))));
		
		boolean admin = ((Boolean)container.get_usr_Admin().getConvertedControlValue()).booleanValue();

		try {
			reloadShareUsers = save(admin, getAdminShares(cc),
					Linux_SambaAdminUsersForShare.class, share.get_Name(),
					vKeyProperties, cc);
			reloadShareUsers = saveValidInvalid(container.get_usr_AccessTypeVI(), share,
					getInvalidShares(cc), getValidShares(cc), cc, vKeyProperties,
					Linux_SambaInvalidUsersForShare.class,
					Linux_SambaValidUsersForShare.class)
					|| reloadShareUsers;
			reloadShareUsers = saveReadWrite(container.get_usr_AccessTypeRW(), share, getReadShares(cc),
					getWriteShares(cc), cc, vKeyProperties,
					Linux_SambaReadListForShare.class,
					Linux_SambaWriteListForShare.class)
					|| reloadShareUsers;
			return reloadShareUsers;
		}catch (ModelLoadException e) {
			throw new ObjectSaveException(e);
		}
	}


	private Set getAdminShares(CIMClient cc) throws ModelLoadException {
		if (adminShares == null)
		{
			loadShareAcl(cc);
		}
		return adminShares;
	}

	private Set getReadShares(CIMClient cc) throws ModelLoadException {
		if (readShares == null)
		{
			loadShareAcl(cc);
		}
		return readShares;
	}

	private Set getWriteShares(CIMClient cc) throws ModelLoadException {
		if (writeShares == null)
		{
			loadShareAcl(cc);
		}
		return writeShares;
	}

	private Set getInvalidShares(CIMClient cc) throws ModelLoadException {
		if (invalidShares == null)
		{
			loadShareAcl(cc);
		}
		return invalidShares;
	}

	private Set getValidShares(CIMClient cc) throws ModelLoadException {
		if (validShares == null)
		{
			loadShareAcl(cc);
		}
		return validShares;
	}

//	private Set getForcePrinters(CIMClient cc) throws ModelLoadException {
//		if (forcePrinters == null)
//		{
//			loadPrinterAcl(cc);
//		}
//		return forcePrinters;
//	}

	private Set getAdminPrinters(CIMClient cc) throws ModelLoadException {
		if (adminPrinters == null)
		{
			loadPrinterAcl(cc);
		}
		return adminPrinters;
	}

	private Set getValidPrinters(CIMClient cc) throws ModelLoadException {
		if (validPrinters == null)
		{
			loadPrinterAcl(cc);
		}
		return validPrinters;
	}

	private Set getInvalidPrinters(CIMClient cc) throws ModelLoadException {
		if (invalidPrinters == null)
		{
			loadPrinterAcl(cc);
		}
		return invalidPrinters;
	}
	
	private Set getReadPrinters(CIMClient cc) throws ModelLoadException {
		if (readPrinters == null)
		{
			loadPrinterAcl(cc);
		}
		return readPrinters;
	}

	private Set getWritePrinters(CIMClient cc) throws ModelLoadException {
		if (writePrinters == null)
		{
			loadPrinterAcl(cc);
		}
		return writePrinters;
	}

	public MessageList save(UserDataContainer container) throws ObjectSaveException {
		
		try {
			CIMClient cc = container.getAdapter().getCimClient();
			
			isGuestWorkingCopy = ((Boolean)container.get_usr_IsGuest().getConvertedControlValue()).booleanValue();
			
			if (isGuestOnServer != isGuestWorkingCopy)
			{
				if (isGuestWorkingCopy)
				{
					service.setGuestAccount(cc,user);
				}
				else
				{
					service.removeGuestAccount(cc,user);
				}
					service.reloadGuestAccount(cc);
					isGuestOnServer = isGuestWorkingCopy = service.isGuest(cc,user);
			}
		} catch (ModelLoadException e) {
			throw new ObjectSaveException(e);
		}
		
		return null;
	}
	
}
