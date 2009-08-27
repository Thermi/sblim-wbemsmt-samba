 /** 
  * User.java
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
  * Description: Wrapper for SambaUserObjects and childs
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper;

import java.util.HashSet;
import java.util.Set;

import javax.cim.CIMProperty;
import javax.cim.UnsignedInteger16;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter;
import org.sblim.wbemsmt.samba.bl.adapter.SambaObject;
import org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.ShareACLItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.PrinterInUserACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.ShareInUserACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.UserDataContainer;
import org.sblim.wbemsmt.samba.bl.fco.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class User extends SambaObject {

	private Linux_SambaUser user;

	protected Set<String> invalidPrinters = null;
	protected Set<String> validPrinters = null;
	protected Set<String> readPrinters = null;
	protected Set<String> writePrinters = null;
	protected Set<String> forcePrinters = null;
	protected Set<String> adminPrinters = null;
	
	protected Set<String> invalidShares = null;
	protected Set<String> validShares = null;
	protected Set<String> forceShares = null;
	protected Set<String> adminShares = null;
	protected Set<String> readShares = null;
	protected Set<String> writeShares = null;

	private boolean isGuestWorkingCopy;

	private boolean isGuestOnServer;

	private final Service service;

	private boolean reloadPrinterInUser = false;
	private boolean reloadShareInUser = false;

	
	public User(Service service, Linux_SambaUser userFco, SambaCimAdapter adapter) throws WbemsmtException {
		super(adapter);
		this.service = service;
		user = userFco;
		isGuestOnServer = isGuestWorkingCopy = service.isGuest(user);
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
		
	private void loadShareAcl() throws WbemsmtException {
		forceShares = new HashSet<String>();
		invalidShares = new HashSet<String>();
		validShares = new HashSet<String>();
		adminShares = new HashSet<String>();
		writeShares = new HashSet<String>();
		readShares = new HashSet<String>();
		
		setUserShares(forceShares,user.getAssociated_Linux_SambaShareOptions_Linux_SambaForceUserForShareNames(adapter.getCimClient()));
        setUserShares(invalidShares,user.getAssociated_Linux_SambaShareOptions_Linux_SambaInvalidUsersForShareNames(adapter.getCimClient()));
        setUserShares(validShares,user.getAssociated_Linux_SambaShareOptions_Linux_SambaValidUsersForShareNames(adapter.getCimClient()));
        setUserShares(readShares,user.getAssociated_Linux_SambaShareOptions_Linux_SambaReadListForShareNames(adapter.getCimClient()));
        setUserShares(writeShares,user.getAssociated_Linux_SambaShareOptions_Linux_SambaWriteListForShareNames(adapter.getCimClient()));
        setUserShares(adminShares,user.getAssociated_Linux_SambaShareOptions_Linux_SambaAdminUsersForShareNames(adapter.getCimClient()));
	}

	private void loadPrinterAcl() throws WbemsmtException {
		forcePrinters = new HashSet<String>();
		invalidPrinters = new HashSet<String>();
		validPrinters = new HashSet<String>();
		readPrinters = new HashSet<String>();
		writePrinters = new HashSet<String>();
		adminPrinters = new HashSet<String>();
		setUserPrinters(forcePrinters,user.getAssociated_Linux_SambaPrinterOptions_Linux_SambaForceUserForPrinterNames(adapter.getCimClient()));
        setUserPrinters(adminPrinters,user.getAssociated_Linux_SambaPrinterOptions_Linux_SambaPrinterAdminForPrinterNames(adapter.getCimClient()));
        setUserPrinters(invalidPrinters,user.getAssociated_Linux_SambaPrinterOptions_Linux_SambaInvalidUsersForPrinterNames(adapter.getCimClient()));
        setUserPrinters(validPrinters,user.getAssociated_Linux_SambaPrinterOptions_Linux_SambaValidUsersForPrinterNames(adapter.getCimClient()));
        setUserPrinters(readPrinters,user.getAssociated_Linux_SambaPrinterOptions_Linux_SambaReadListForPrinterNames(adapter.getCimClient()));
        setUserPrinters(writePrinters,user.getAssociated_Linux_SambaPrinterOptions_Linux_SambaWriteListForPrinterNames(adapter.getCimClient()));
	}
	
	public CimObjectKey getCimObjectKey() {
		return new CimObjectKey(user.getCimObjectPath());
	}

	public Linux_SambaUser getUser() {
		return user;
	}

	public void updateControls(PrinterInUserACLDataContainer container) throws WbemsmtException {
		container.getAdapter().updateControls(container.getPrinters(),service.getPrinters().getFCOs());
	}

	public void updateControls(ShareInUserACLDataContainer container) throws WbemsmtException {
		container.getAdapter().updateControls(container.getShares(),service.getShares().getFCOs());
	}

	public void updateControls(UserDataContainer container) {
		container.get_SambaUserName().setControlValue(user.get_key_SambaUserName());
		container.get_SystemUserName().setControlValue(user.get_SystemUserName());
		//password is not set
		container.get_usr_IsGuest().setControlValue(new Boolean(isGuestWorkingCopy));
	}

	public MessageList save(ShareACLItemDataContainer container) throws WbemsmtException {
		Linux_SambaShareOptions fco = service.getShares().getShareByName((String) container.get_ShareName().getConvertedControlValue()).getShare();
        reloadShareInUser = saveShareACL(container,fco ,user);
        if (reloadShareInUser)
        {
        	resetAcl();
        	reloadShareInUser = false;
        }
        return null;
	}

	public MessageList save(PrinterACLItemDataContainer container) throws WbemsmtException {
		Linux_SambaPrinterOptions fco = service.getPrinters().getPrinterByName((String) container.get_PrinterName().getConvertedControlValue()).getPrinter();
        reloadPrinterInUser = savePrinterACL(container,fco ,user);
        if (reloadPrinterInUser)
        {
        	resetAcl();
        	reloadPrinterInUser = false;
        }
        return null;
	}

	public MessageList save(ShareACLItemDataContainer container, Linux_SambaShareOptions fco) throws WbemsmtException {
		reloadShareInUser = saveShareACL(container,fco,user) || reloadShareInUser;
		return null;
	}

	public MessageList save(PrinterACLItemDataContainer container, Linux_SambaPrinterOptions fco) throws WbemsmtException {
		reloadPrinterInUser = savePrinterACL(container,fco,user) || reloadPrinterInUser;
		return null;
	}
	
	public MessageList save(ShareInUserACLDataContainer container) throws WbemsmtException {
	    reloadShareInUser = false;
        MessageList list = container.getAdapter().save(container.getShares(),service.getShares().getFCOs());
        if (reloadShareInUser)
        {
        		loadPrinterAcl();
        		loadShareAcl();
        		reloadShareInUser  = false;
        		reloadPrinterInUser = false;
        	
        	//force reload
                resetPrinterAcl(service);
                resetShareAcl(service);
        }
        return list;
	}

	public MessageList save(PrinterInUserACLDataContainer container) throws WbemsmtException {
	    reloadPrinterInUser = false;
        MessageList list = container.getAdapter().save(container.getPrinters(),service.getPrinters().getFCOs());
        if (reloadPrinterInUser)
        {
        		loadPrinterAcl();
        		reloadPrinterInUser  = false;
        }
        return list;
	}

	public void updateControls(PrinterACLItemDataContainer container, Linux_SambaPrinterOptions fco) throws WbemsmtException {
		
		container.get_PrinterName().setControlValue(fco.get_key_Name());
        updateValidInvalidWithUserList(container,container.get_usr_AccessTypeVI(), fco.get_key_Name(), user.get_key_SambaUserName(), getInvalidPrinters(), getValidPrinters(), false, service);
        updateReadWriteWithUserList(container,container.get_usr_AccessTypeRW(), fco.get_key_Name(), user.get_key_SambaUserName(),getReadPrinters(), getWritePrinters(), false, service);
        updateAdminWithUserList(container,container.get_usr_Admin(), fco.get_key_Name(), user.get_key_SambaUserName(), getAdminPrinters(), service,service.getPrinterGlobals().getAdminUsers());
	}

	public void updateControls(ShareACLItemDataContainer container, Linux_SambaShareOptions fco) throws WbemsmtException  {
		container.get_ShareName().setControlValue(fco.get_key_Name());
        updateValidInvalidWithUserList(container,container.get_usr_AccessTypeVI(), fco.get_key_Name(),user.get_key_SambaUserName(), getInvalidShares(), getValidShares(), false, service);
        updateReadWriteWithUserList(container,container.get_usr_AccessTypeRW(), fco.get_key_Name(),user.get_key_SambaUserName(), getReadShares(), getWriteShares(), false, service);
        updateAdminWithUserList(container,container.get_usr_Admin(), fco.get_key_Name(), user.get_key_SambaUserName(), getAdminShares(), service,service.getAdminUsers());
	}

	protected void updateValidInvalidWithUserList(DataContainer container, LabeledStringArrayInputComponentIf viField, String keyLocal, String keyGlobal, Set<String> invalidSet, Set<String> validSet, boolean globalAcl, Service service) throws WbemsmtException {
		UnsignedInteger16 selectedIV = null; 

		WbemSmtResourceBundle bundle = container.getAdapter().getBundle();
        viField.setValues(getValidInvalidTypes(bundle));
        
        int count = (invalidSet.contains(keyLocal) ? 1 : 0);
        count = count + (validSet.contains(keyLocal) ? 1 : 0);

        if (!globalAcl && count > 1)
        {
        	
        	//check the global ones to get the info whats really matching
        	//if globals contains an invalid user there must be an valid user in local
        	if (service.getInvalidUsers().contains(keyGlobal))
        	{
        		selectedIV = new UnsignedInteger16(USR_ACL_IDX_ENABLE);
        	}
        	//if globals contains an valid user there must be an invalid user in local
        	if (service.getValidUsers().contains(keyGlobal))
        	{
        		selectedIV = new UnsignedInteger16(USR_ACL_IDX_DISABLE);
        	}
        }
        else
        {
        	if (invalidSet.contains(keyLocal))
        	{
        		selectedIV = new UnsignedInteger16(USR_ACL_IDX_DISABLE);
        	}
        	if (validSet.contains(keyLocal))
        	{
        		selectedIV = new UnsignedInteger16(USR_ACL_IDX_ENABLE);
        	}
        }
		
		if (selectedIV != null)
		{
			viField.setControlValue(selectedIV);
		}
//		else if (RuntimeUtil.getInstance().isCommandline())
//		{
//			viField.setValue(container.getAdapter().getBundle().getString("right.not.defined"));
//		}
	}

	protected void updateReadWriteWithUserList(DataContainer container, LabeledStringArrayInputComponentIf rwField, String keyLocal, String keyGlobal, Set<String> readSet, Set<String> writeSet, boolean globalAcl, Service service) throws WbemsmtException {
		UnsignedInteger16 selectedRW = null; 

		WbemSmtResourceBundle bundle = container.getAdapter().getBundle();
        rwField.setValues(getReadWriteTypes(bundle));
        
        int count = (readSet.contains(keyLocal) ? 1 : 0);
        count = count + (writeSet.contains(keyLocal) ? 1 : 0);

        if (!globalAcl && count > 1)
        {
        	//check the global ones to get the info whats really matching
        	//if globals contains an read user there must be an write user in local
        	if (service.getReadUsers().contains(keyGlobal))
        	{
        		selectedRW = new UnsignedInteger16(USR_ACL_IDX_WRITE);
        	}
        	// if globals contains an write user there must be an read user in local
        	if (service.getWriteUsers().contains(keyGlobal))
        	{
        		selectedRW = new UnsignedInteger16(USR_ACL_IDX_READ);
        	}
        }
        else
        {
        	if (readSet.contains(keyLocal))
        	{
        		selectedRW = new UnsignedInteger16(USR_ACL_IDX_READ);
        	}
        	if (writeSet.contains(keyLocal))
        	{
        		selectedRW = new UnsignedInteger16(USR_ACL_IDX_WRITE);
        	}
        }
		
		if (selectedRW != null)
		{
			rwField.setControlValue(selectedRW);
		}
//		else if (RuntimeUtil.getInstance().isCommandline())
//		{
//			rwField.setValue(container.getAdapter().getBundle().getString("right.not.defined"));
//		}
	}
	
	protected void updateAdminWithUserList(DataContainer container, LabeledBaseInputComponentIf adminField, String localKey, String globalKey, Set<String> adminUsers, Service service, Set<?> setWithGlobalAdmins) throws WbemsmtException {
		adminField.setControlValue(new Boolean(adminUsers.contains(localKey) || setWithGlobalAdmins.contains(globalKey)));
		adminField.getProperties().setReadOnly(setWithGlobalAdmins.contains(globalKey));
	}		

	public void updateControls(PrinterACLItemDataContainer container) throws WbemsmtException  {
		String printerName = (String) container.get_PrinterName().getConvertedControlValue();
        Printer printerByName = service.getPrinters().getPrinterByName(printerName);
        if (printerByName == null)
        {
        	String serviceName = service.getService().get_Name();
        	throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS,container.getAdapter().getBundle().getString("printerInService.not.found",new Object[]{serviceName,printerName}));
        }
        Linux_SambaPrinterOptions fco = printerByName.getPrinter();
        updateControls(container,fco);
	}

	public void updateControls(ShareACLItemDataContainer container) throws WbemsmtException  {
		String shareName = (String) container.get_ShareName().getConvertedControlValue();
        Share shareByName = service.getShares().getShareByName(shareName);
        if (shareByName == null)
        {
        	String serviceName = service.getService().get_Name();
        	throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS,container.getAdapter().getBundle().getString("shareInService.not.found",new Object[]{serviceName,shareName}));
        }
        Linux_SambaShareOptions fco = shareByName.getShare();
        updateControls(container,fco);		
	}

	private boolean savePrinterACL(PrinterACLItemDataContainer container, Linux_SambaPrinterOptions printer, Linux_SambaUser user) throws WbemsmtException {
		boolean reloadShareUsers = false;

		CIMProperty[] vKeyProperties = new CIMProperty[] {
		        Linux_SambaInvalidUsersForPrinter.create_GroupComponent_Linux_SambaPrinterOptions(adapter.getCimClient(), adapter.getNamespace(), printer),
		        Linux_SambaInvalidUsersForPrinter.create_PartComponent_Linux_SambaUser(adapter.getCimClient(), adapter.getNamespace(), user)};
		
		boolean admin = ((Boolean)container.get_usr_Admin().getConvertedControlValue()).booleanValue();

		reloadShareUsers = save(admin, getAdminPrinters(),
        		Linux_SambaPrinterAdminForPrinter.class, printer.get_key_Name(),
        		vKeyProperties);
        reloadShareUsers = saveValidInvalid(container.get_usr_AccessTypeVI(), printer,
        		getInvalidPrinters(), getValidPrinters(), vKeyProperties,
        		Linux_SambaInvalidUsersForPrinter.class,
        		Linux_SambaValidUsersForPrinter.class)
        		|| reloadShareUsers;
        reloadShareUsers = saveReadWrite(container.get_usr_AccessTypeRW(), printer, getReadPrinters(),
        		getWritePrinters(), vKeyProperties,
        		Linux_SambaReadListForPrinter.class,
        		Linux_SambaWriteListForPrinter.class)
        		|| reloadShareUsers;
        return reloadShareUsers;
	}
	
	private boolean saveShareACL(ShareACLItemDataContainer container, Linux_SambaShareOptions share,  Linux_SambaUser user) throws WbemsmtException {
		boolean reloadShareUsers = false;
		CIMProperty[] vKeyProperties = new CIMProperty[] {
		        Linux_SambaInvalidUsersForShare.create_GroupComponent_Linux_SambaShareOptions(adapter.getCimClient(), adapter.getNamespace(), share),
		        Linux_SambaInvalidUsersForShare.create_PartComponent_Linux_SambaUser(adapter.getCimClient(), adapter.getNamespace(), user)};
		
		boolean admin = ((Boolean)container.get_usr_Admin().getConvertedControlValue()).booleanValue();

		reloadShareUsers = save(admin, getAdminShares(),
        		Linux_SambaAdminUsersForShare.class, share.get_key_Name(),
        		vKeyProperties);
        reloadShareUsers = saveValidInvalid(container.get_usr_AccessTypeVI(), share,
        		getInvalidShares(), getValidShares(), vKeyProperties,
        		Linux_SambaInvalidUsersForShare.class,
        		Linux_SambaValidUsersForShare.class)
        		|| reloadShareUsers;
        reloadShareUsers = saveReadWrite(container.get_usr_AccessTypeRW(), share, getReadShares(),
        		getWriteShares(), vKeyProperties,
        		Linux_SambaReadListForShare.class,
        		Linux_SambaWriteListForShare.class)
        		|| reloadShareUsers;
        return reloadShareUsers;
	}


	private Set<String> getAdminShares() throws WbemsmtException {
		if (adminShares == null)
		{
			loadShareAcl();
		}
		return adminShares;
	}

	private Set<String> getReadShares() throws WbemsmtException {
		if (readShares == null)
		{
			loadShareAcl();
		}
		return readShares;
	}

	private Set<String> getWriteShares() throws WbemsmtException {
		if (writeShares == null)
		{
			loadShareAcl();
		}
		return writeShares;
	}

	private Set<String> getInvalidShares() throws WbemsmtException {
		if (invalidShares == null)
		{
			loadShareAcl();
		}
		return invalidShares;
	}

	private Set<String> getValidShares() throws WbemsmtException {
		if (validShares == null)
		{
			loadShareAcl();
		}
		return validShares;
	}


	private Set<String> getAdminPrinters() throws WbemsmtException {
		if (adminPrinters == null)
		{
			loadPrinterAcl();
		}
		return adminPrinters;
	}

	private Set<String> getValidPrinters() throws WbemsmtException {
		if (validPrinters == null)
		{
			loadPrinterAcl();
		}
		return validPrinters;
	}

	private Set<String> getInvalidPrinters() throws WbemsmtException {
		if (invalidPrinters == null)
		{
			loadPrinterAcl();
		}
		return invalidPrinters;
	}
	
	private Set<String> getReadPrinters() throws WbemsmtException {
		if (readPrinters == null)
		{
			loadPrinterAcl();
		}
		return readPrinters;
	}

	private Set<String> getWritePrinters() throws WbemsmtException {
		if (writePrinters == null)
		{
			loadPrinterAcl();
		}
		return writePrinters;
	}

	public MessageList save(UserDataContainer container) throws WbemsmtException {
		
		isGuestWorkingCopy = ((Boolean)container.get_usr_IsGuest().getConvertedControlValue()).booleanValue();
        
        if (isGuestOnServer != isGuestWorkingCopy)
        {
        	if (isGuestWorkingCopy)
        	{
        		service.setGuestAccount(user);
        	}
        	else
        	{
        		service.removeGuestAccount(user);
        	}
        		service.reloadGuestAccount();
        		isGuestOnServer = isGuestWorkingCopy = service.isGuest(user);
        }
		
		return null;
	}

	public MessageList revert(UserDataContainer container) throws WbemsmtException {
		user = (Linux_SambaUser) adapter.getFcoHelper().reload(user, container.getAdapter().getCimClient());
        isGuestWorkingCopy = isGuestOnServer;
		return null;
	}

	public MessageList revert(PrinterInUserACLDataContainer container) {
		resetAcl();
		return null;
	}

	public MessageList revert(ShareInUserACLDataContainer container) {
		resetAcl();
		return null;
	}

	public MessageList revert(ShareACLItemDataContainer container) {
		resetAcl();
		return null;
	}

	public MessageList revert(PrinterACLItemDataContainer container) {
		resetAcl();
		return null;
	}

	public MessageList revert(PrinterACLItemDataContainer container, Linux_SambaPrinterOptions fco) {
		resetAcl();
		return null;
	}

	public MessageList revert(ShareACLItemDataContainer container, Linux_SambaShareOptions fco) {
		resetAcl();
		return null;
	}
	
}
