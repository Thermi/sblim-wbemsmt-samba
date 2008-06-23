 /** 
  * Printer.java
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
  * Description: Wrapper for Linux_SambaPrinterOptions and dependent objects
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper;

import java.util.*;

import javax.cim.CIMProperty;
import javax.cim.UnsignedInteger16;
import javax.cim.UnsignedInteger64;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter;
import org.sblim.wbemsmt.samba.bl.adapter.SambaObject;
import org.sblim.wbemsmt.samba.bl.container.printer.*;
import org.sblim.wbemsmt.samba.bl.fco.*;
import org.sblim.wbemsmt.util.StringUtil;

public class Printer extends SambaObject {

	private Linux_SambaPrinterOptions printer;
	private final Service service;
	private Linux_SambaCommonSecurityOptions commonSecurity;
	private Linux_SambaPrinterPrintingOptions printingOptions;
	private Linux_SambaPrinterBrowseOptions browseOptions;

	protected Set allowHosts =null;
	protected Set denyHosts = null;
	protected Set invalidUsers = null;
	protected Set validUsers = null;
	protected Set readUsers = null;
	protected Set writeUsers = null;
	protected Set adminUsers = null;
	
	private ArrayList listHostsToAllow;
	private ArrayList listHostsAllowed;
	private ArrayList listHostsDenied;
	private ArrayList listHostsToDeny;
	
	private boolean reloadPrinterUsers;
	private String[] systemPrinterNames;
	private Linux_SambaUser forceUser;
	
	public Printer(Service service, Linux_SambaPrinterOptions printerFco, SambaCimAdapter adapter) throws WbemsmtException {
		super(adapter);
		this.service = service;
		printer = printerFco;
		getAdminUsers();
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaObject#loadChilds(org.sblim.wbem.client.WBEMClient)
	 */
	public void reloadChilds() throws WbemsmtException {
		
		
		getCommonSecurity();
		getPrintingOptions();
		getBrowseOptions();

		reloadPrinterUsers = reloadChilds;
		reloadPrinterUsers();

		reloadChilds = false;
	
	}

	public void resetChilds()
	{
		commonSecurity = null;
		printingOptions = null;
		browseOptions = null;
	}
	
	public void resetPrinterUsers()
	{
		invalidUsers = null;
		validUsers = null;
		adminUsers = null;
	}

	private void reloadPrinterUsers() throws WbemsmtException {
		
		getInvalidUsers();
		getValidUsers();
		getAdminUsers();

		reloadPrinterUsers = false;
	
	}

	private Set getAdminUsers() throws WbemsmtException {
		
		if (adminUsers == null || reloadPrinterUsers)
        {
        	adminUsers = new HashSet();
        	setShareUsers(adminUsers,printer.getAssociated_Linux_SambaUser_Linux_SambaPrinterAdminForPrinterNames(adapter.getCimClient()));
        }
        return adminUsers;
	}	
	private Set getValidUsers() throws WbemsmtException {
		
		if (validUsers == null || reloadPrinterUsers)
        {
        	validUsers = new HashSet();
        	setShareUsers(validUsers,printer.getAssociated_Linux_SambaUser_Linux_SambaValidUsersForPrinterNames(adapter.getCimClient()));
        }
        return validUsers;
	}

	private Set getInvalidUsers() throws WbemsmtException {
		
		if (invalidUsers == null || reloadPrinterUsers)
        {
        	invalidUsers = new HashSet();
        	setShareUsers(invalidUsers,printer.getAssociated_Linux_SambaUser_Linux_SambaInvalidUsersForPrinterNames(adapter.getCimClient()));
        }
        return invalidUsers;
	}	
	
	private Set getWriteUsers() throws WbemsmtException {
		
		if (writeUsers == null || reloadPrinterUsers)
        {
        	writeUsers = new HashSet();
        	setShareUsers(writeUsers,printer.getAssociated_Linux_SambaUser_Linux_SambaWriteListForPrinterNames(adapter.getCimClient()));
        }
        return writeUsers;
	}

	private Set getReadUsers() throws WbemsmtException {
		
		if (readUsers == null || reloadPrinterUsers)
        {
        	readUsers = new HashSet();
        	setShareUsers(readUsers,printer.getAssociated_Linux_SambaUser_Linux_SambaReadListForPrinterNames(adapter.getCimClient()));
        }
        return readUsers;
	}	

	private Linux_SambaCommonSecurityOptions getCommonSecurity() throws WbemsmtException {
		
		if (commonSecurity == null || reloadChilds)
        {
        	commonSecurity = (Linux_SambaCommonSecurityOptions)getFirstChild(Linux_SambaCommonSecurityOptions.class,printer.getAssociated_Linux_SambaCommonSecurityOptions_Linux_SambaCommonSecurityForPrinterNames(adapter.getCimClient()), false);
        }
        return commonSecurity;
		
	}
	
	public void setCommonSecurity(Linux_SambaCommonSecurityOptions commonSecurity) {
		this.commonSecurity = commonSecurity;
	}

	private Linux_SambaPrinterPrintingOptions getPrintingOptions() throws WbemsmtException {
		if (printingOptions == null || reloadChilds)
        {
        	printingOptions = (Linux_SambaPrinterPrintingOptions)getFirstChild(Linux_SambaPrinterPrintingOptions.class,printer.getAssociated_Linux_SambaPrinterPrintingOptions_Linux_SambaPrinterPrintingForPrinterNames(adapter.getCimClient()), false);
        }
        return printingOptions;
	}

	private Linux_SambaPrinterBrowseOptions getBrowseOptions() throws WbemsmtException {
		if (browseOptions == null || reloadChilds)
        {
        	browseOptions = (Linux_SambaPrinterBrowseOptions)getFirstChild(Linux_SambaPrinterBrowseOptions.class,printer.getAssociated_Linux_SambaPrinterBrowseOptions_Linux_SambaPrinterBrowseForPrinterNames(adapter.getCimClient()), false);
        }
        return browseOptions;
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaObject#getCimObjectKey()
	 */
	public CimObjectKey getCimObjectKey() {
		return new CimObjectKey(printer.getCimObjectPath());
	}

	public Linux_SambaPrinterOptions getPrinter() {
		return printer;
	}

	public void updateControls(UserACLItemDataContainerForPrinter container, Linux_SambaUser fco) throws WbemsmtException {
		container.get_SambaUserName().setControlValue(fco.get_key_SambaUserName());
        updateValidInvalidWithUserList(container,container.get_usr_AccessTypeVI(), fco.get_key_SambaUserName(), getInvalidUsers(), getValidUsers(), false, service);
        updateReadWriteWithUserList(container,container.get_usr_AccessTypeRW(), fco.get_key_SambaUserName(), getReadUsers(), getWriteUsers(), false, service);
        updateAdminWithUserList(container,container.get_usr_Admin(), fco.get_key_SambaUserName(), getAdminUsers(), service,service.getPrinterGlobals().getAdminUsers(), false);
	}

	public void updateControls(PrinterDenyHostSecurityDataContainer container)  throws WbemsmtException {
		listHostsToDeny = new ArrayList();
		listHostsDenied = new ArrayList();
		
		seperateDenyHosts(allowHosts,denyHosts,listHostsToDeny,listHostsDenied);
		
		container.get_usr_DeniedHosts().setValues((String[]) listHostsDenied.toArray(new String[listHostsDenied.size()]));
		container.get_usr_HostsToDeny().setValues((String[]) listHostsToDeny.toArray(new String[listHostsToDeny.size()]));
	}

	public void updateControls(PrinterAllowHostSecurityDataContainer container)  throws WbemsmtException {
		listHostsToAllow = new ArrayList();
		listHostsAllowed = new ArrayList();
		
		seperateAllowHosts(allowHosts,denyHosts,listHostsToAllow,listHostsAllowed);
		
		container.get_usr_AllowedHosts().setValues((String[]) listHostsAllowed.toArray(new String[listHostsAllowed.size()]));
		container.get_usr_HostsToAllow().setValues((String[]) listHostsToAllow.toArray(new String[listHostsToAllow.size()]));
	}
	
	public void updateControls(UserInPrinterACLDataContainer container) throws WbemsmtException {
		super.updateForceUser(container, container.get_usr_CurrentForceUser(),container.get_usr_NewForceUser(),service,getForceUser());
        container.getAdapter().updateControls(container.getUsers(),service.getUsers().getFCOs());
	}


	public void updateControls(PrintingOptionsDataContainer container) throws WbemsmtException {
		
		container.get_CupsOptions().setControlValue(getPrintingOptions().get_CupsOptions());
        container.get_DefaultDevMode().setControlValue(getPrintingOptions().get_DefaultDevMode());
        container.get_MaxPrintjobs().setControlValue(getPrintingOptions().get_MaxPrintjobs());
        container.get_MaxReportedPrintjobs().setControlValue(getPrintingOptions().get_MaxReportedPrintjobs());
        container.get_PrintCommand().setControlValue(getPrintingOptions().get_PrintCommand());
        container.get_UseClientDriver().setControlValue(getPrintingOptions().get_UseClientDriver());
	}

	public void updateControls(PrinterOptionsDataContainer container) throws WbemsmtException {
		container.get_Name().setControlValue(printer.get_key_Name());
        container.get_Available().setControlValue(printer.get_Available());
        container.get_Browsable().setControlValue(getBrowseOptions().get_Browsable());
        container.get_Comment().setControlValue(printer.get_Comment());
        container.get_GuestOK().setControlValue(getCommonSecurity().get_GuestOK());
        container.get_GuestOnly().setControlValue(getCommonSecurity().get_GuestOnly());
        container.get_HostsAllow().setControlValue(getCommonSecurity().get_HostsAllow());
        container.get_HostsDeny().setControlValue(getCommonSecurity().get_HostsDeny());
        container.get_Path().setControlValue(printer.get_Path());
        container.get_ReadOnly().setControlValue(getCommonSecurity().get_ReadOnly());
        systemPrinterNames = service.getSystemPrinters().getNameArray();
        container.get_usr_SystemPrinterName().setValues(systemPrinterNames);
        int index = StringUtil.indexOf(systemPrinterNames,printer.get_SystemPrinterName());
        if (index == -1)
        {
        	index = 0;
        }
        
        container.get_usr_SystemPrinterName().setControlValue(new UnsignedInteger16(index ));
	}


	public MessageList save(UserInPrinterACLDataContainer container) throws WbemsmtException {
		
		MessageList list = new MessageList();
		
		UnsignedInteger16 index = (UnsignedInteger16) container.get_usr_NewForceUser().getConvertedControlValue();
		if (index != null)
        {
        	setForceUser(index.intValue() <= 0 ? null : service.getUsers().getUser(index.intValue()-1).getUser());
        }
        
        list.addAll(container.getAdapter().save(container.getUsers(),service.getUsers().getFCOs()));
		
		if (reloadPrinterUsers)
		{
			reloadPrinterUsers();
            //force reload
            super.resetUserAcl(service);
            reloadPrinterUsers = false;
		}
		return list;
	}

	public MessageList save(UserACLItemDataContainerForPrinter container, Linux_SambaUser fco) throws WbemsmtException {
		reloadPrinterUsers = saveUserACL(container,fco,printer) || reloadPrinterUsers;
		return null;
	}

	public MessageList save(PrintingOptionsDataContainer container) throws WbemsmtException {
		getPrintingOptions().set_CupsOptions((String) container.get_CupsOptions().getConvertedControlValue());
        getPrintingOptions().set_DefaultDevMode((Boolean) container.get_DefaultDevMode().getConvertedControlValue());
        getPrintingOptions().set_MaxPrintjobs((UnsignedInteger64) container.get_MaxPrintjobs().getConvertedControlValue());
        getPrintingOptions().set_MaxReportedPrintjobs((UnsignedInteger64) container.get_MaxReportedPrintjobs().getConvertedControlValue());
        getPrintingOptions().set_PrintCommand((String) container.get_PrintCommand().getConvertedControlValue());
        getPrintingOptions().set_UseClientDriver((Boolean) container.get_UseClientDriver().getConvertedControlValue());
        adapter.getFcoHelper().save(getPrintingOptions(),adapter.getCimClient());
        //force a reload
        printingOptions = null;
        return null;
	}

	public MessageList save(PrinterAllowHostSecurityDataContainer container) {
		
		return null;
	}
	public MessageList save(PrinterDenyHostSecurityDataContainer container) {
		
		return null;
	}
	

	public MessageList save(PrinterOptionsDataContainer container)  throws WbemsmtException {
		
		printer.set_Available((Boolean) container.get_Available().getConvertedControlValue());
        getBrowseOptions().set_Browsable((Boolean) container.get_Browsable().getConvertedControlValue());
        printer.set_Comment((String) container.get_Comment().getConvertedControlValue());
        getCommonSecurity().set_GuestOK((Boolean) container.get_GuestOK().getConvertedControlValue());
        getCommonSecurity().set_GuestOnly((Boolean) container.get_GuestOnly().getConvertedControlValue());
        getCommonSecurity().set_HostsAllow((String) container.get_HostsAllow().getConvertedControlValue());
        getCommonSecurity().set_HostsDeny((String) container.get_HostsDeny().getConvertedControlValue());
        //share.set_Name(container.get_Name().getConvertedControlValue());
        printer.set_Path((String) container.get_Path().getConvertedControlValue());
        getCommonSecurity().set_ReadOnly((Boolean) container.get_ReadOnly().getConvertedControlValue());
        
        UnsignedInteger16 index = (UnsignedInteger16) container.get_usr_SystemPrinterName().getConvertedControlValue();
        if (index != null && index.intValue() < systemPrinterNames.length)
        {
        	printer.set_SystemPrinterName(systemPrinterNames[index.intValue()]);
        }
        
        adapter.getFcoHelper().save(printer,adapter.getCimClient());
        adapter.getFcoHelper().save(getCommonSecurity(),adapter.getCimClient());
        adapter.getFcoHelper().save(getBrowseOptions(),adapter.getCimClient());
        
        printer = (Linux_SambaPrinterOptions)adapter.getFcoHelper().reload(printer,adapter.getCimClient());
        //fore reload
        commonSecurity = null;
        browseOptions = null;
        return null;
	}

	public void updateModel(PrinterAllowHostSecurityDataContainer container) throws WbemsmtException{
		updateModelHostsAcl(container, container.get_usr_AddHost(), container.get_usr_RemoveHost(), container.get_usr_AllowedHosts(), container.get_usr_HostsToAllow(), listHostsAllowed, listHostsToAllow);
	}

	public void updateModel(PrinterDenyHostSecurityDataContainer container) throws WbemsmtException {
		updateModelHostsAcl(container, container.get_usr_AddHost(), container.get_usr_RemoveHost(), container.get_usr_DeniedHosts(), container.get_usr_HostsToDeny(), listHostsDenied, listHostsToDeny);
	}

	private boolean saveUserACL(UserACLItemDataContainerForPrinter container, Linux_SambaUser user, Linux_SambaPrinterOptions printerOptions) throws WbemsmtException {

		boolean reloadShareUsers = false;
        String sambaUserName = user.get_key_SambaUserName();
        CIMProperty[] vKeyProperties = new CIMProperty[] {
            Linux_SambaInvalidUsersForPrinter.create_GroupComponent_Linux_SambaPrinterOptions(adapter.getCimClient(), adapter.getNamespace(), printerOptions),
            Linux_SambaInvalidUsersForPrinter.create_PartComponent_Linux_SambaUser(adapter.getCimClient(), adapter.getNamespace(), user)};
        
        boolean admin = ((Boolean)container.get_usr_Admin().getConvertedControlValue()).booleanValue();

        reloadShareUsers = save(admin, getAdminUsers(),
        		Linux_SambaPrinterAdminForPrinter.class, sambaUserName,
        		vKeyProperties);
        reloadShareUsers = saveValidInvalid(container.get_usr_AccessTypeVI(), user,
        		getInvalidUsers(), getValidUsers(), vKeyProperties,
        		Linux_SambaInvalidUsersForPrinter.class,
        		Linux_SambaValidUsersForPrinter.class)
        		|| reloadShareUsers;
        reloadShareUsers = saveReadWrite(container.get_usr_AccessTypeRW(), user, getReadUsers(),
        		getWriteUsers(), vKeyProperties,
        		Linux_SambaReadListForPrinter.class,
        		Linux_SambaWriteListForPrinter.class)
        		|| reloadShareUsers;
        return reloadShareUsers;
	}

	public MessageList save(UserACLItemDataContainerForPrinter container) throws WbemsmtException {
		Linux_SambaUser fco = service.getUsers().getUserByName((String) container.get_SambaUserName().getConvertedControlValue()).getUser();
        reloadPrinterUsers = saveUserACL(container,fco,printer);
        return null;
	}

	public void updateControls(UserACLItemDataContainerForPrinter container) throws WbemsmtException {
		Linux_SambaUser fco = service.getUsers().getUserByName((String) container.get_SambaUserName().getConvertedControlValue()).getUser();
        updateControls(container,fco);
	}

	public Linux_SambaUser getForceUser() throws WbemsmtException {
		if (forceUser == null || reloadChilds)
        {
        	List list = printer.getAssociated_Linux_SambaUser_Linux_SambaForceUserForPrinters(adapter.getCimClient()); 
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
		//delete Old Guest
        oldForceUser = getForceUser();
        if (oldForceUser != null)
        {
        	logger.info("Deleting Force User " + oldForceUser.get_key_SambaUserName());
        	
        	List list = oldForceUser.getAssociations_Linux_SambaForceUserForPrinter(adapter.getCimClient(), false,false,null,null);
        	adapter.getFcoHelper().delete(list,adapter.getCimClient());
        }
        //create new Guest
        if (newForceUser != null)
        {
        	logger.info("Set as Force User " + newForceUser.get_key_SambaUserName());
        	Linux_SambaForceUserForPrinter newForceUserAssoc = new Linux_SambaForceUserForPrinter(adapter.getCimClient(),adapter.getNamespace());
        	newForceUserAssoc.set_GroupComponent_Linux_SambaPrinterOptions(printer);
        	newForceUserAssoc.set_PartComponent_Linux_SambaUser(newForceUser);
        	adapter.getFcoHelper().create(newForceUserAssoc,adapter.getCimClient());
        }
        //force a reload if needed next time
        this.forceUser = null;
	}

	public MessageList revert(PrinterOptionsDataContainer container) throws WbemsmtException {
		printer = (Linux_SambaPrinterOptions) adapter.getFcoHelper().reload(printer, container.getAdapter().getCimClient());

		printingOptions = null;
		forceUser = null;
		return null;
	}

	public MessageList revert(PrinterAllowHostSecurityDataContainer container) {
		allowHosts = null;
		return null;
	}
	public MessageList revert(PrinterDenyHostSecurityDataContainer container) {
		denyHosts = null;
		return null;
	}

	public MessageList revert(PrintingOptionsDataContainer container) {
		printingOptions = null;
		return null;
	}

	public MessageList revert(UserInPrinterACLDataContainer container) throws WbemsmtException {
		resetPrinterUsers();
		return null;
	}


	public MessageList revert(UserACLItemDataContainerForPrinter container) {
		resetPrinterUsers();
		return null;
	}
}
