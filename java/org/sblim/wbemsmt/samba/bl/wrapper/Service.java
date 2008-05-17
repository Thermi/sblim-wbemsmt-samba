 /** 
  * Service.java
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
  * Description: Class for wrapping the Samba Service business object and the related-actions
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper;

import java.util.*;
import java.util.logging.Level;

import javax.cim.CIMProperty;
import javax.cim.UnsignedInteger16;
import javax.cim.UnsignedInteger32;
import javax.cim.UnsignedInteger8;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.adapter.Message;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.exception.impl.GetInstanceException;
import org.sblim.wbemsmt.exception.impl.userobject.GetInstanceUserObject;
import org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter;
import org.sblim.wbemsmt.samba.bl.adapter.SambaErrCodes;
import org.sblim.wbemsmt.samba.bl.adapter.SambaObject;
import org.sblim.wbemsmt.samba.bl.container.service.*;
import org.sblim.wbemsmt.samba.bl.fco.*;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterOptions.GetAllSystemDefinedPrintersResult;
import org.sblim.wbemsmt.samba.bl.wrapper.list.*;
import org.sblim.wbemsmt.schema.cim29.CIM_Service.StartServiceResult;
import org.sblim.wbemsmt.schema.cim29.CIM_Service.StopServiceResult;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

public class Service extends SambaObject {

	public static final String KEY_NO_SYSTEMPRINTER_FOUND = "no.systemprinter.found";
	public static final String KEY_NO_SYSTEMUSER_FOUND = "no.systemuser.found";
	private Linux_SambaService service;
	private Linux_SambaGlobalOptions globalOptions1;
	public String allowHostsFromServer = "";
	public String denyHostsFromServer = "";
	
	public Set allowHosts = new HashSet();
	public Set denyHosts = new HashSet();
	protected Set invalidUsers = null;
	protected Set validUsers = null;
	protected Set readUsers = null;
	protected Set writeUsers = null;
	protected Set adminUsers = null;
	private Linux_SambaLoggingOptions loggingOptions1;
	private Linux_SambaGlobalSecurityOptions globalSecurityOptions1;
	private Linux_SambaServiceConfiguration serviceConfig1;
	private Linux_SambaUser guestAccount;
	private Linux_SambaWinbindOptions winbindOptions1;
	private Linux_SambaCommonSecurityOptions commonSecurityOptions1;
	private Linux_SambaGlobalBrowseOptions browseOptions1;
	private Linux_SambaScriptingOptions scriptingOptions1;
	private Linux_SambaWinsOptions winsOptions1;
	private ShareList shares;
	private PrinterList printers;
	private UserList users;
	private HostList hosts;
	public List listHostsToDeny;
	public List listHostsDenied;
	public List listHostsToAllow;
	public List listHostsAllowed;
	private boolean reloadShareUsers = false;
	
	private ShareGlobals shareGlobals = null;
	private PrinterGlobals printerGlobals = null;
	private SystemPrinterList systemPrinters;
	private SystemUserList systemUsers;
	private boolean foundSystemPrinters;
	private boolean foundSystemUsers;
	private Linux_SambaUser forceUser;
	
	public Service(SambaCimAdapter adapter, Linux_SambaService service) throws WbemsmtException
	{
		super(adapter);
		this.service = service;
		shareGlobals = new ShareGlobals(this,adapter);
		printerGlobals = new PrinterGlobals(this,adapter);
	}
	
	public void reloadChilds() throws WbemsmtException
	{
		logger.log(Level.INFO, "Loading childs of service " + service.get_Name()); 
		
//		loadGlobalOptions(cimClient);
		getLoggingOptions();
		getGlobalSecurityOptions();
		getServiceConfig();
		getGuestAccount();
		getWindBindOptions();
		getWinsOptions();
		getCommonSecurity();
		getBrowseOptions();
		getScriptingOptions();
		loadHosts();
		
		reloadShareUsers = reloadChilds;
		
		reloadShareUsers();
		loadSystemPrinters();
		loadSystemUsers();
		
		reloadChilds = false;
	}

	private Linux_SambaLoggingOptions getLoggingOptions() throws WbemsmtException {
		if (loggingOptions1 == null || reloadChilds)
        {
        	loggingOptions1 = (Linux_SambaLoggingOptions)getFirstChild(Linux_SambaLoggingOptions.class, getGlobalOptions().getAssociated_Linux_SambaLoggingOptions_Linux_SambaLoggingForGlobals(adapter.getCimClient()), true);
        	if (SambaCimAdapter.DUMMY_MODE)
        	{
        		if (loggingOptions1 == null)
        		{
        			loggingOptions1 = new Linux_SambaLoggingOptions(adapter.getCimClient(),adapter.getNamespace());
        			loggingOptions1 = (Linux_SambaLoggingOptions) adapter.getFcoHelper().create(loggingOptions1, adapter.getCimClient());
        		}
        	}
        }
        return loggingOptions1;

	}

	private Linux_SambaGlobalSecurityOptions getGlobalSecurityOptions() throws WbemsmtException {
		if (globalSecurityOptions1 == null || reloadChilds)
        {
        	globalSecurityOptions1 = (Linux_SambaGlobalSecurityOptions)getFirstChild(Linux_SambaGlobalSecurityOptions.class, getGlobalOptions().getAssociated_Linux_SambaGlobalSecurityOptions_Linux_SambaGlobalSecurityForGlobals(adapter.getCimClient()), false);
        }
        return globalSecurityOptions1;
	}

	public Linux_SambaGlobalOptions getGlobalOptions() throws WbemsmtException {
		if (globalOptions1 == null || reloadChilds)
        {
        	globalOptions1 = (Linux_SambaGlobalOptions)getFirstChild(Linux_SambaGlobalOptions.class, service.getAssociated_Linux_SambaGlobalOptions_Linux_SambaGlobalForServices(adapter.getCimClient()), false);
        }
        return globalOptions1;
	}

	private Linux_SambaServiceConfiguration getServiceConfig() throws WbemsmtException {
		if (serviceConfig1 == null || reloadChilds)
        {
        	serviceConfig1 = (Linux_SambaServiceConfiguration)getFirstChild(Linux_SambaServiceConfiguration.class, service.getAssociated_Linux_SambaServiceConfiguration_Linux_SambaServiceConfigurationForServices(adapter.getCimClient()), false);
        }
        return serviceConfig1;
	}

	private Linux_SambaScriptingOptions getScriptingOptions() throws WbemsmtException {
		if (scriptingOptions1 == null || reloadChilds)
        {
        	scriptingOptions1 = (Linux_SambaScriptingOptions)getFirstChild(Linux_SambaScriptingOptions.class, getGlobalOptions().getAssociated_Linux_SambaScriptingOptions_Linux_SambaScriptingForGlobalNames(adapter.getCimClient()), false);			
        }
        return scriptingOptions1;
	}

	private Linux_SambaGlobalBrowseOptions getBrowseOptions() throws WbemsmtException {
		if (browseOptions1 == null || reloadChilds)
        {
        	browseOptions1 = (Linux_SambaGlobalBrowseOptions)getFirstChild(Linux_SambaGlobalBrowseOptions.class, getGlobalOptions().getAssociated_Linux_SambaGlobalBrowseOptions_Linux_SambaGlobalBrowseForGlobalNames(adapter.getCimClient()), false);
        }
        return browseOptions1;
	}

	private Linux_SambaCommonSecurityOptions getCommonSecurity() throws WbemsmtException {
		if (commonSecurityOptions1 == null || reloadChilds)
        {
        	commonSecurityOptions1 = (Linux_SambaCommonSecurityOptions)getFirstChild(Linux_SambaCommonSecurityOptions.class, getGlobalOptions().getAssociated_Linux_SambaCommonSecurityOptions_Linux_SambaCommonSecurityForGlobalNames(adapter.getCimClient()), false);
        	allowHostsFromServer = commonSecurityOptions1.get_HostsAllow();
        	denyHostsFromServer = commonSecurityOptions1.get_HostsDeny();
        }
        return commonSecurityOptions1;
	}

	private Linux_SambaWinsOptions getWinsOptions() throws WbemsmtException {
		if (winsOptions1 == null || reloadChilds)
        {
        	winsOptions1 = (Linux_SambaWinsOptions)getFirstChild(Linux_SambaWinsOptions.class, getGlobalOptions().getAssociated_Linux_SambaWinsOptions_Linux_SambaWinsForGlobalNames(adapter.getCimClient()),true);
        	if (SambaCimAdapter.DUMMY_MODE)
        	{
        		if (winsOptions1 == null)
        		{
        			winsOptions1 = new Linux_SambaWinsOptions(adapter.getCimClient(),adapter.getNamespace());
        		}		
        	}
        }
        return winsOptions1;
	}

	private Linux_SambaWinbindOptions getWindBindOptions() throws WbemsmtException {
		if (winbindOptions1 == null || reloadChilds)
        {
        	winbindOptions1 = (Linux_SambaWinbindOptions)getFirstChild(Linux_SambaWinbindOptions.class, getGlobalOptions().getAssociated_Linux_SambaWinbindOptions_Linux_SambaWinbindForGlobalNames(adapter.getCimClient()), true);
        	if (SambaCimAdapter.DUMMY_MODE)
        	{
        		if (winbindOptions1 == null)
        		{
        			winbindOptions1 = new Linux_SambaWinbindOptions(adapter.getCimClient(),adapter.getNamespace());
        		}
        	}
        }
        return winbindOptions1;
	}

	public Linux_SambaUser getGuestAccount() throws WbemsmtException {
		if (guestAccount == null || reloadChilds)
        {
        	guestAccount = (Linux_SambaUser)getFirstChild(Linux_SambaUser.class, getGlobalOptions().getAssociated_Linux_SambaUser_Linux_SambaGuestAccountForGlobalNames(adapter.getCimClient()), true);
        }
        return guestAccount;
	}

	public void reloadGuestAccount() throws WbemsmtException {
		guestAccount = null;
		getGuestAccount();
	}

	public void reloadShareUsers()  throws WbemsmtException {

		getInvalidUsers();
		getValidUsers();
		getWriteUsers();
		getReadUsers();
		getAdminUsers();
		
		reloadShareUsers = false;
		
	}	
	
	public Set getAdminUsers() throws WbemsmtException {
		
		if (adminUsers == null || reloadShareUsers)
        {
        	adminUsers = new HashSet();
        	setShareUsers(adminUsers,getGlobalOptions().getAssociated_Linux_SambaUser_Linux_SambaAdminUsersForGlobalNames(adapter.getCimClient()));
        }
        return adminUsers;
	}
		
	public Set getReadUsers() throws WbemsmtException {
		
		if (readUsers == null || reloadShareUsers)
        {
        	readUsers = new HashSet();
        	setShareUsers(readUsers,getGlobalOptions().getAssociated_Linux_SambaUser_Linux_SambaReadListForGlobalNames(adapter.getCimClient()));
        }
        return readUsers;
	}
	
	public Set getWriteUsers() throws WbemsmtException  {
		
		if (writeUsers == null || reloadShareUsers)
        {
        	writeUsers = new HashSet();
        	setShareUsers(writeUsers,getGlobalOptions().getAssociated_Linux_SambaUser_Linux_SambaWriteListForGlobalNames(adapter.getCimClient()));
        }
        return writeUsers;
	}
	
	public Set getValidUsers()  throws WbemsmtException {
		
		if (validUsers == null || reloadShareUsers)
        {
        	validUsers = new HashSet();
        	setShareUsers(validUsers,getGlobalOptions().getAssociated_Linux_SambaUser_Linux_SambaValidUsersForGlobalNames(adapter.getCimClient()));
        }
        return validUsers;
	}

	public Set getInvalidUsers() throws WbemsmtException {
		
		if (invalidUsers == null || reloadShareUsers)
        {
        	invalidUsers = new HashSet();
        	setShareUsers(invalidUsers,getGlobalOptions().getAssociated_Linux_SambaUser_Linux_SambaInvalidUsersForGlobalNames(adapter.getCimClient()));
        }
        return invalidUsers;
	}

	void loadHosts() throws WbemsmtException {

		allHosts.clear();
        denyHosts.clear();
        allowHosts.clear();
        
        if (!SambaCimAdapter.DUMMY_MODE)
        {
        	setHosts(allowHosts,getGlobalOptions().getAssociated_Linux_SambaHost_Linux_SambaAllowHostsForGlobalNames(adapter.getCimClient()));
        	setHosts(denyHosts,getGlobalOptions().getAssociated_Linux_SambaHost_Linux_SambaDenyHostsForGlobalNames(adapter.getCimClient()));
        }
        else 
        {
        	if (allowHosts.size() == 0)
        	{
        		List hosts = new ArrayList();
//				Linux_SambaHost host = new Linux_SambaHost();
//				host.set_Name("host1");
//				hosts.add(host);
//				host = new Linux_SambaHost();
//				host.set_Name("host2");
//				hosts.add(host);
        		
        		setHosts(allowHosts,hosts);				
        	}	
        	
        	if (denyHosts.size() == 0)
        	{
        		List hosts = new ArrayList();
//				Linux_SambaHost host = new Linux_SambaHost();
//				host.set_Name("host3");
//				hosts.add(host);
//				host = new Linux_SambaHost();
//				host.set_Name("host4");
//				hosts.add(host);
        		
        		setHosts(denyHosts,hosts);				

        	}	
        }
		
	}
	
	void loadSystemPrinters() throws WbemsmtException {

		systemPrinters = new SystemPrinterList();
        
        GetAllSystemDefinedPrintersResult result = Linux_SambaPrinterOptions.invoke_getAllSystemDefinedPrinters(adapter.getCimClient(),adapter.getNamespace());
        
        String printerString = result.getResultObject(); 
        String[] printers = new org.sblim.wbemsmt.util.StringTokenizer(printerString,",").asArray(true,false);
        systemPrinters.addSystemPrinters(SystemPrinter.asObjects(printers,adapter));
        
        foundSystemPrinters = systemPrinters.size() > 0;
        
        if (!foundSystemPrinters)
        {
        	systemPrinters.addSystemPrinter(new SystemPrinter(adapter.getBundle().getString(Service.KEY_NO_SYSTEMPRINTER_FOUND),adapter));
        }
		
	}
	
	void loadSystemUsers() throws WbemsmtException {

		systemUsers = new SystemUserList();
        
        String userString = Linux_SambaUser.invoke_getAllSystemUsers(adapter.getCimClient(),adapter.getNamespace()).getResultObject();
        String[] users = new org.sblim.wbemsmt.util.StringTokenizer(userString,",").asArray(true,false);
        systemUsers.addSystemUsers(SystemUser.asObjects(users,adapter));
        
        foundSystemUsers = systemUsers.size() > 0;
        
        if (!foundSystemUsers)
        {
        	systemUsers.addSystemUser(new SystemUser(adapter.getBundle().getString(Service.KEY_NO_SYSTEMUSER_FOUND),adapter));
        }
		
	}

	public CimObjectKey getCimObjectKey() {
		return new CimObjectKey(service.getCimObjectPath());
	}

	public ShareList getShares() {
		return shares;
	}

	public void setShares(ShareList shares) {
		this.shares = shares;
	}

	public HostList getHosts() {
		return hosts;
	}

	public void setHosts(HostList hosts) {
		this.hosts = hosts;
	}

	public PrinterList getPrinters() {
		return printers;
	}

	public void setPrinters(PrinterList printers) {
		this.printers = printers;
	}

	public UserList getUsers() {
		return users;
	}

	public void setUsers(UserList users) {
		this.users = users;
	}
	
	public PrinterGlobals getPrinterGlobals() {
		return printerGlobals;
	}

	public ShareGlobals getShareGlobals() {
		return shareGlobals;
	}

	public Linux_SambaService getService() {
		return service;
	}
	
	public boolean isFoundSystemPrinters() {
		return foundSystemPrinters;
	}

	public void updateControls(ServiceOptionsDataContainer container)  throws WbemsmtException {
		
		container.get_BindInterfacesOnly().setControlValue(getGlobalOptions().get_BindInterfacesOnly());
        container.get_ConfigurationFile().setControlValue(getServiceConfig().get_ConfigurationFile());
        container.get_Interfaces().setControlValue(getGlobalOptions().get_Interfaces());
        container.get_NetbiosAlias().setControlValue(getGlobalOptions().get_NetbiosAlias());
        container.get_NetbiosName().setControlValue(getGlobalOptions().get_NetbiosName());
        container.get_ServerString().setControlValue(getGlobalOptions().get_ServerString());
        container.get_Workgroup().setControlValue(getGlobalOptions().get_Workgroup());
	}

	public void updateControls(ServiceLoggingDataContainer container)  throws WbemsmtException {
		container.get_DebugHiresTimestamp().setControlValue(getLoggingOptions().get_DebugHiresTimestamp());
        container.get_DebugPID().setControlValue(getLoggingOptions().get_DebugPID());
        container.get_DebugTimestamp().setControlValue(getLoggingOptions().get_DebugTimestamp());
        container.get_DebugUID().setControlValue(getLoggingOptions().get_DebugUID());
        container.get_LogFile().setControlValue(getLoggingOptions().get_LogFile());
        container.get_LogLevel().setControlValue(getLoggingOptions().get_LogLevel());
        container.get_MaxLogSize().setControlValue(getLoggingOptions().get_MaxLogSize());
        container.get_SysLog().setControlValue(getLoggingOptions().get_SysLog());
        container.get_SysLogOnly().setControlValue(getLoggingOptions().get_SysLogOnly());
		
	}

	public void updateControls(ServiceOperationsDataContainer container)  throws WbemsmtException {
		boolean started = service.get_Started().booleanValue();
		
		logger.info("Service started: " + started);
		
		container.get_Started().setControlValue(new Boolean(started));
		container.get_invoke_StartService().getProperties().setReadOnly(started);
		container.get_invoke_StopService().getProperties().setReadOnly(!started);
		container.get_usr_RestartService().getProperties().setReadOnly(!started);
		
	}

	public void updateControls(ServiceGlobalSecurityOptionsDataContainer container) throws WbemsmtException 
	{
		container.get_AuthMethods().setControlValue(getGlobalSecurityOptions().get_AuthMethods());
        container.get_Browsable().setControlValue(getBrowseOptions().get_Browsable());
        
        container.get_DomainMaster().setValues(Linux_SambaGlobalBrowseOptions.PROPERTY_DOMAINMASTER.VALUE_ENTRIES_FOR_DISPLAY);
        container.get_DomainMaster().setControlValue(getBrowseOptions().get_DomainMaster());
        container.get_EncryptPasswords().setControlValue(getGlobalSecurityOptions().get_EncryptPasswords());
        container.get_GuestOK().setControlValue(getCommonSecurity().get_GuestOK());
        container.get_GuestOnly().setControlValue(getCommonSecurity().get_GuestOnly());
        container.get_HostsAllow().setControlValue(getCommonSecurity().get_HostsAllow());
        container.get_HostsDeny().setControlValue(getCommonSecurity().get_HostsDeny());
        container.get_MinPasswordLength().setControlValue(getGlobalSecurityOptions().get_MinPasswordLength());
        container.get_NullPasswords().setControlValue(getGlobalSecurityOptions().get_NullPasswords());

        container.get_usr_PassdbBackend().setValues(Linux_SambaGlobalSecurityOptions.PROPERTY_PASSDBBACKEND.VALUE_ENTRIES_FOR_DISPLAY);
        container.get_usr_PassdbBackend().setControlValue(getGlobalSecurityOptions().get_PassdbBackend());
        container.get_ReadOnly().setControlValue(getCommonSecurity().get_ReadOnly());

        container.get_Security().setValues(Linux_SambaGlobalSecurityOptions.PROPERTY_SECURITY.VALUE_ENTRIES_FOR_DISPLAY);
        container.get_Security().setControlValue(getGlobalSecurityOptions().get_Security());
        container.get_SMBPasswdFile().setControlValue(getGlobalSecurityOptions().get_SMBPasswdFile());
	}

	public void updateControls(ServiceUserSecurityOptionsDataContainer container) throws WbemsmtException 
	{
		updateForceUser(container,container.get_usr_CurrentForceUser(),container.get_usr_NewForceUser(),this,getForceUser());
        
        Linux_SambaUser guest = getGuestAccount();
        container.get_usr_GuestUser().setControlValue(guest != null ? guest.get_key_SambaUserName() : adapter.getBundle().getString("no.guest.defined"));
        
        if (RuntimeUtil.getInstance().isCommandline())
        {
        	container.get_usr_NewForceUser().getProperties().setVisible(false);
        }
        
        container.getAdapter().updateControls(container.getUserRights(),getUsers().getFCOs());
	}

	public void updateControls(ServiceDenyHostDataContainer container)  throws WbemsmtException {
		listHostsToDeny = new ArrayList();
		listHostsDenied = new ArrayList();
		seperateDenyHosts(allowHosts,denyHosts,listHostsToDeny,listHostsDenied);
		container.get_usr_DeniedHosts().setValues((String[]) listHostsDenied.toArray(new String[listHostsDenied.size()]));
		container.get_usr_HostsToDeny().setValues((String[]) listHostsToDeny.toArray(new String[listHostsToDeny.size()]));
	}

	public void updateControls(ServiceAllowHostSecurityDataContainer container) throws WbemsmtException 
	{
		listHostsToAllow = new ArrayList();
		listHostsAllowed = new ArrayList();
		
		seperateAllowHosts(allowHosts,denyHosts,listHostsToAllow,listHostsAllowed);
		
		container.get_usr_AllowedHosts().setValues((String[]) listHostsAllowed.toArray(new String[listHostsAllowed.size()]));
		container.get_usr_HostsToAllow().setValues((String[]) listHostsToAllow.toArray(new String[listHostsToAllow.size()]));
	}

	public void updateControls(ServiceScriptingDataContainer container) throws WbemsmtException 
	{
		container.get_AddGroupScript().setControlValue(getScriptingOptions().get_addGroupScript());
        container.get_AddPrinterCommand().setControlValue(getScriptingOptions().get_addPrinterCommand());
        container.get_AddShareCommand().setControlValue(getScriptingOptions().get_addShareCommand());
        container.get_AddUserScript().setControlValue(getScriptingOptions().get_addUserScript());
        container.get_AddUsertoGroupScript().setControlValue(getScriptingOptions().get_addUsertoGroupScript());
        container.get_DeleteGroupScript().setControlValue(getScriptingOptions().get_deleteGrouprScript());
        container.get_DeleteUserfromGroupScript().setControlValue(getScriptingOptions().get_deleteUserfromGroupScript());
        container.get_DeleteUserScript().setControlValue(getScriptingOptions().get_deleteUserScript());
        container.get_SetPrimaryGroupScript().setControlValue(getScriptingOptions().get_setPrimaryGroupScript());
	}

	public void updateControls(ServiceWinsDataContainer container)  throws WbemsmtException 
	{
		container.get_DNS_Proxy().setControlValue(getWinsOptions().get_DNS_Proxy());
        container.get_WINSHook().setControlValue(getWinsOptions().get_WINSHook());
        container.get_WINSProxy().setControlValue(getWinsOptions().get_WINSProxy());
        container.get_WINSServer().setControlValue(getWinsOptions().get_WINSServer());
        container.get_WINSServer().setControlValue(getWinsOptions().get_WINSServer());
	}

	public void updateControls(UserACLItemDataContainerForService container, Linux_SambaUser fco) throws WbemsmtException
	{
		container.get_SambaUserName().setControlValue(fco.get_key_SambaUserName());
        updateValidInvalidWithUserList(container,container.get_usr_AccessTypeVI(), fco.get_key_SambaUserName(), getInvalidUsers(), getValidUsers(), true, this);
        updateReadWriteWithUserList(container,container.get_usr_AccessTypeRW(), fco.get_key_SambaUserName(), getReadUsers(), getWriteUsers(), true, this);
	}

	public void updateModel(ServiceOperationsDataContainer container) throws WbemsmtException
	{
		if (adapter.getUpdateTrigger() == container.get_invoke_StartService())
		{
			start(container);
		}
		else if (adapter.getUpdateTrigger() == container.get_invoke_StopService())
		{
			stop(container);
		}
		else if (adapter.getUpdateTrigger() == container.get_usr_RestartService())
		{
			stop(container);
			start(container);
		}
	}

	private void stop(ServiceOperationsDataContainer container) throws WbemsmtException {
		StopServiceResult result = service.invoke_StopService(adapter.getCimClient());
        this.service = Linux_SambaServiceHelper.getInstance(adapter.getCimClient(),service.getCimObjectPath());
        
        MessageList list = MessageList.init(container);
        
        int rc = result.getResultObject().intValue();
        if (rc != 0)
        {
        	list.addMessage(Message.create(SambaErrCodes.MSGDEF_CANNOT_STOP_RC, container.getAdapter().getBundle(),new Object[]{""+rc}));
        }
        else if (service.get_Started().booleanValue() == true)
        {
        	list.addMessage(Message.create(SambaErrCodes.MSGDEF_CANNOT_STOP_STATUS, container.getAdapter().getBundle()));
        }
	}

	private void start(ServiceOperationsDataContainer container) throws WbemsmtException {
		StartServiceResult result = service.invoke_StartService(adapter.getCimClient());
        this.service = Linux_SambaServiceHelper.getInstance(adapter.getCimClient(),service.getCimObjectPath());
        
        MessageList list = MessageList.init(container);

        int rc = result.getResultObject().intValue();
        
        if (rc != 0)
        {
        	list.addMessage(Message.create(SambaErrCodes.MSGDEF_CANNOT_START_RC, container.getAdapter().getBundle(),new Object[]{""+rc}));
        }
        else if (service.get_Started().booleanValue() == false)
        {
        	list.addMessage(Message.create(SambaErrCodes.MSGDEF_CANNOT_START_STATUS, container.getAdapter().getBundle()));
        }
	}

	public void updateModel(ServiceAllowHostSecurityDataContainer container)  throws WbemsmtException{
		updateModelHostsAcl(container, container.get_usr_AddHost(), container.get_usr_RemoveHost(), container.get_usr_AllowedHosts(), container.get_usr_HostsToAllow(), listHostsAllowed, listHostsToAllow);
        loadHosts();
}

	public void updateModel(ServiceDenyHostDataContainer container)  throws WbemsmtException{
		updateModelHostsAcl(container, container.get_usr_AddHost(), container.get_usr_RemoveHost(), container.get_usr_DeniedHosts(), container.get_usr_HostsToDeny(), listHostsDenied, listHostsToDeny);
        loadHosts();
	}

	public MessageList saveImpl(ServiceOptionsDataContainer container) throws WbemsmtException {
		WBEMClient cc = adapter.getCimClient();
        getGlobalOptions().set_BindInterfacesOnly((Boolean) container.get_BindInterfacesOnly().getConvertedControlValue());
        getServiceConfig().set_ConfigurationFile((String) container.get_ConfigurationFile().getConvertedControlValue());
        getGlobalOptions().set_Interfaces((String) container.get_Interfaces().getConvertedControlValue());
        getGlobalOptions().set_NetbiosAlias((String) container.get_NetbiosAlias().getConvertedControlValue());
        getGlobalOptions().set_NetbiosName((String) container.get_NetbiosName().getConvertedControlValue());
        getGlobalOptions().set_ServerString((String) container.get_ServerString().getConvertedControlValue());
        getGlobalOptions().set_Workgroup((String) container.get_Workgroup().getConvertedControlValue());
        adapter.getFcoHelper().save(getGlobalOptions(),cc);
        adapter.getFcoHelper().save(getServiceConfig(),cc);
        
        globalOptions1 = null;
        serviceConfig1 = null;
        getGlobalOptions();
        getServiceConfig();
		return null;
	}

	public MessageList saveImpl(ServiceWinsDataContainer container) throws WbemsmtException  {
		WBEMClient cc = adapter.getCimClient();
        getWinsOptions().set_DNS_Proxy((String) container.get_DNS_Proxy().getConvertedControlValue());
        getWinsOptions().set_WINSHook((String) container.get_WINSHook().getConvertedControlValue());
        getWinsOptions().set_WINSProxy((Boolean) container.get_WINSProxy().getConvertedControlValue());
        getWinsOptions().set_WINSServer((String) container.get_WINSServer().getConvertedControlValue());
        getWinsOptions().set_WINSSupport((Boolean) container.get_WINSSupport().getConvertedControlValue());
        if (!SambaCimAdapter.DUMMY_MODE)
        {
        	adapter.getFcoHelper().save(getWinsOptions(),cc);
        	winsOptions1 = null;
        	getWinsOptions();
        }
        return null;
	}

	public MessageList saveImpl(ServiceScriptingDataContainer container) throws WbemsmtException  {
		WBEMClient cc = adapter.getCimClient();
        getScriptingOptions().set_addGroupScript((String) container.get_AddGroupScript().getConvertedControlValue());
        getScriptingOptions().set_addPrinterCommand((String) container.get_AddPrinterCommand().getConvertedControlValue());
        getScriptingOptions().set_addShareCommand((String) container.get_AddShareCommand().getConvertedControlValue());
        getScriptingOptions().set_addUserScript((String) container.get_AddUserScript().getConvertedControlValue());
        getScriptingOptions().set_addUsertoGroupScript((String) container.get_AddUsertoGroupScript().getConvertedControlValue());
        getScriptingOptions().set_deleteGrouprScript((String) container.get_DeleteGroupScript().getConvertedControlValue());
        getScriptingOptions().set_deleteUserfromGroupScript((String) container.get_DeleteUserfromGroupScript().getConvertedControlValue());
        getScriptingOptions().set_deleteUserScript((String) container.get_DeleteUserScript().getConvertedControlValue());
        getScriptingOptions().set_setPrimaryGroupScript((String) container.get_SetPrimaryGroupScript().getConvertedControlValue());
        adapter.getFcoHelper().save(getScriptingOptions(),cc);
        scriptingOptions1 = null;
        getScriptingOptions();
		return null;	
	}

	public MessageList saveImpl(ServiceDenyHostDataContainer container) throws WbemsmtException  {
		return null;
	}

	public MessageList saveImpl(ServiceAllowHostSecurityDataContainer container) throws WbemsmtException  {
		return null;
	}

	public MessageList saveImpl(ServiceUserSecurityOptionsDataContainer container) throws WbemsmtException  {
		
		MessageList list = new MessageList();
        
        UnsignedInteger16 index = (UnsignedInteger16) container.get_usr_NewForceUser().getConvertedControlValue();
        //first element is the "no force user text" so subtract one to get the right user
        if (index != null)
        {
        	setForceUser(index.intValue() <= 0 ? null : getUsers().getUser(index.intValue()-1).getUser());
        }
        
        list.addAll(adapter.save(container.getUserRights(),getUsers().getFCOs()));
        if (reloadShareUsers)
        {
        	//force reload
        	resetPrinterAcl(this);
        	resetShareAcl(this);				
        	reloadShareUsers();
        }
        return list;
	}

	public MessageList save(UserACLItemDataContainerForService container, Linux_SambaUser fco) throws WbemsmtException {
			reloadShareUsers = saveUserACL(container,fco) 
							   || reloadShareUsers;
			return null;
	}

	public MessageList saveImpl(ServiceGlobalSecurityOptionsDataContainer container) throws WbemsmtException  {
		WBEMClient cc = adapter.getCimClient();
        getGlobalSecurityOptions().set_AuthMethods((String) container.get_AuthMethods().getConvertedControlValue());
        getBrowseOptions().set_Browsable((Boolean) container.get_Browsable().getConvertedControlValue());
        getBrowseOptions().set_DomainMaster((UnsignedInteger16) container.get_DomainMaster().getConvertedControlValue());
        getGlobalSecurityOptions().set_EncryptPasswords((Boolean) container.get_EncryptPasswords().getConvertedControlValue());
        getCommonSecurity().set_GuestOK((Boolean) container.get_GuestOK().getConvertedControlValue());
        getCommonSecurity().set_GuestOnly((Boolean) container.get_GuestOnly().getConvertedControlValue());
        getCommonSecurity().set_HostsAllow((String) container.get_HostsAllow().getConvertedControlValue());
        getCommonSecurity().set_HostsDeny((String) container.get_HostsDeny().getConvertedControlValue());
        getGlobalSecurityOptions().set_MinPasswordLength((UnsignedInteger8) container.get_MinPasswordLength().getConvertedControlValue());
        getGlobalSecurityOptions().set_NullPasswords((Boolean) container.get_NullPasswords().getConvertedControlValue());
        
        UnsignedInteger16 index = (UnsignedInteger16) container.get_usr_PassdbBackend().getConvertedControlValue();
        if (index != null)
        {
        	getGlobalSecurityOptions().set_PassdbBackend(Linux_SambaGlobalSecurityOptions.PROPERTY_PASSDBBACKEND.getValueMapEntryFromDisplayedValue(index));
        }
        getCommonSecurity().set_ReadOnly((Boolean) container.get_ReadOnly().getConvertedControlValue());
        getGlobalSecurityOptions().set_Security((UnsignedInteger8) container.get_Security().getConvertedControlValue());
        getGlobalSecurityOptions().set_SMBPasswdFile((String) container.get_SMBPasswdFile().getConvertedControlValue());
        adapter.getFcoHelper().save(getGlobalSecurityOptions(),cc);
        adapter.getFcoHelper().save(getBrowseOptions(),cc);
        adapter.getFcoHelper().save(getCommonSecurity(),cc);

        //force reload of objects
        if (!getCommonSecurity().get_HostsAllow().equals(allowHostsFromServer)
        	||!getCommonSecurity().get_HostsDeny().equals(denyHostsFromServer))
        {
        	for (int i=0; i < getPrinters().size();i++)
        	{
        		getPrinters().getPrinter(i).setCommonSecurity(null);
        	}
        	for (int i=0; i < getShares().size();i++)
        	{
        		getShares().getShare(i).setCommonSecurity(null);
        	}
        }
        globalSecurityOptions1 = null;
        browseOptions1 = null;
        commonSecurityOptions1 = null;
		return null;	
	}

	public MessageList saveImpl(ServiceLoggingDataContainer container) throws WbemsmtException  {
		WBEMClient cc = adapter.getCimClient();
		getLoggingOptions().set_DebugHiresTimestamp((Boolean) container.get_DebugHiresTimestamp().getConvertedControlValue());
        getLoggingOptions().set_DebugPID((Boolean) container.get_DebugPID().getConvertedControlValue());
        getLoggingOptions().set_DebugTimestamp((Boolean) container.get_DebugTimestamp().getConvertedControlValue());
        getLoggingOptions().set_DebugUID((Boolean) container.get_DebugUID().getConvertedControlValue());
        getLoggingOptions().set_LogFile((String) container.get_LogFile().getConvertedControlValue());
        getLoggingOptions().set_LogLevel((String) container.get_LogLevel().getConvertedControlValue());
        getLoggingOptions().set_MaxLogSize((UnsignedInteger32) container.get_MaxLogSize().getConvertedControlValue());
        getLoggingOptions().set_SysLog((UnsignedInteger16) container.get_SysLog().getConvertedControlValue());
        getLoggingOptions().set_SysLogOnly((Boolean) container.get_SysLogOnly().getConvertedControlValue());
        adapter.getFcoHelper().save(getLoggingOptions(),cc);
        getLoggingOptions();
		return null;	
	}

	public boolean saveUserACL(UserACLItemDataContainerForService container, Linux_SambaUser fco) throws WbemsmtException {
		boolean reloadShareUsers = false;
		CIMProperty[] vKeyProperties = new CIMProperty[] {
		        Linux_SambaInvalidUsersForGlobal.create_GroupComponent_Linux_SambaGlobalOptions(adapter.getCimClient(), adapter.getNamespace(), getGlobalOptions()),
		        Linux_SambaInvalidUsersForGlobal.create_PartComponent_Linux_SambaUser(adapter.getCimClient(), adapter.getNamespace(), fco)};
        
        reloadShareUsers = saveValidInvalid(container.get_usr_AccessTypeVI(), fco,
        		getInvalidUsers(), getValidUsers(), vKeyProperties,
        		Linux_SambaInvalidUsersForGlobal.class,
        		Linux_SambaValidUsersForGlobal.class);
        reloadShareUsers = saveReadWrite(container.get_usr_AccessTypeRW(), fco, getReadUsers(),
        		getWriteUsers(), vKeyProperties,
        		Linux_SambaReadListForGlobal.class,
        		Linux_SambaWriteListForGlobal.class)
        		|| reloadShareUsers;
		
		return reloadShareUsers;
	}

	public MessageList save(UserACLItemDataContainerForService container) throws WbemsmtException {
		Linux_SambaUser fco = getUsers().getUserByName((String) container.get_SambaUserName().getConvertedControlValue()).getUser();
        reloadShareUsers = saveUserACL(container,fco) || reloadShareUsers;
        return null;
	}

	public void updateControls(UserACLItemDataContainerForService container) throws WbemsmtException {
		String username = (String) container.get_SambaUserName().getConvertedControlValue();
        User userByName = getUsers().getUserByName(username);
        if (userByName == null)
        {
        	logger.severe("User " + username + " was not found.");
        	Linux_SambaUser user = new Linux_SambaUser(adapter.getCimClient(),adapter.getNamespace());
        	user.set_key_SambaUserName(username);
        	throw new GetInstanceException("User " + username + " was not found.",new GetInstanceUserObject(user.getCimObjectPath()));
        }
        Linux_SambaUser fco = userByName.getUser();
        updateControls(container,fco);
	}

	/**
	 * @param newGuestAccount
	 * @throws WbemsmtException
	 */
	public void setGuestAccount(Linux_SambaUser newGuestAccount) throws WbemsmtException  {
		
		Linux_SambaUser oldGuest = null;
		//delete Old Guest
        oldGuest = getGuestAccount();
        WBEMClient cc = adapter.getCimClient();
        if (oldGuest != null)
        {
        	logger.info("Deleting Guest " + oldGuest.get_key_SambaUserName());
        	Vector keys = new Vector();
            keys.add(Linux_SambaGuestAccountForGlobal.create_GroupComponent_Linux_SambaGlobalOptions(adapter.getCimClient(), adapter.getNamespace(), getGlobalOptions()));
            keys.add(Linux_SambaGuestAccountForGlobal.create_PartComponent_Linux_SambaUser(adapter.getCimClient(), adapter.getNamespace(), oldGuest));

            
            AbstractWbemsmtFco instance = adapter.getFcoHelper().getInstance(Linux_SambaGuestAccountForGlobalHelper.class, adapter.getNamespace(), keys, cc );
        	adapter.getFcoHelper().delete(instance,cc);
        }
        //create new Guest
        if (newGuestAccount != null)
        {
        	logger.info("Set as Guest " + newGuestAccount.get_key_SambaUserName());				
        	Linux_SambaGuestAccountForGlobal guestAcc = new Linux_SambaGuestAccountForGlobal(cc,adapter.getNamespace());
        	guestAcc.set_GroupComponent_Linux_SambaGlobalOptions(getGlobalOptions());
        	guestAcc.set_PartComponent_Linux_SambaUser(newGuestAccount);
        	guestAcc = (Linux_SambaGuestAccountForGlobal) adapter.getFcoHelper().create(guestAcc,cc);
        }
        //force a reload if needed next time
        this.guestAccount = null;
	}

	/**
	 * @param guestToRemove
	 * @throws WbemsmtException
	 */
	public void removeGuestAccount(Linux_SambaUser guestToRemove) throws WbemsmtException  {
		
		logger.info("Remove Guest " + guestToRemove.get_key_SambaUserName());
		
		WBEMClient cc = adapter.getCimClient();
		
		List list = Linux_SambaGuestAccountForGlobalHelper.enumerateInstances(adapter.getCimClient(), adapter.getNamespace(),false);
        for (Iterator iter = list.iterator(); iter.hasNext();) {
        	Linux_SambaGuestAccountForGlobal guestAcc = (Linux_SambaGuestAccountForGlobal) iter.next();
        	if (guestAcc.get_PartComponent_Linux_SambaUser(adapter.getCimClient()).equals(guestToRemove.getCimObjectPath()))
        	{
        		adapter.getFcoHelper().delete(guestAcc,cc);
        	}
        }
	}
	
	public boolean isGuest(Linux_SambaUser user) throws WbemsmtException {
		Linux_SambaUser guest = getGuestAccount();
		return guest != null && guest.get_key_SambaUserName().equals(user.get_key_SambaUserName());
	}

	public SystemPrinterList getSystemPrinters() throws WbemsmtException {
		if (systemPrinters == null)
		{
			loadSystemPrinters();
		}
		return systemPrinters;
	}

	public SystemUserList getSystemUsers() throws WbemsmtException {
		if (systemUsers == null)
		{
			loadSystemUsers();
		}
		return systemUsers;
	}

	public void loadUserList() throws WbemsmtException {
		users = new UserList();
        Linux_SambaUser fco;
        List list = service.getAssociated_Linux_SambaUser_Linux_SambaUsersForServices(adapter.getCimClient());
        for (Iterator iter = list.iterator(); iter.hasNext();) {
        	fco = (Linux_SambaUser) iter.next();
        	users.addUser(new User(this,fco,adapter));
        }
	}

	public void loadPrinterList() throws WbemsmtException {
		printers = new PrinterList();
        Linux_SambaPrinterOptions fco;
        List list = service.getAssociated_Linux_SambaPrinterOptions_Linux_SambaPrinterForServices(adapter.getCimClient());
        for (Iterator iter = list.iterator(); iter.hasNext();) {
        	fco = (Linux_SambaPrinterOptions) iter.next();
        	printers.addPrinter(new Printer(this,fco,adapter));
        }
	}

	public void loadShareList() throws WbemsmtException {
		shares = new ShareList();
        Linux_SambaShareOptions fco;
        List list = service.getAssociated_Linux_SambaShareOptions_Linux_SambaShareForServices(adapter.getCimClient());
        for (Iterator iter = list.iterator(); iter.hasNext();) {
        	fco = (Linux_SambaShareOptions) iter.next();
        	shares.addShare(new Share(this,fco,adapter));
        }
	}
	
	public void loadHostList() throws WbemsmtException {
		loadHosts();
		hosts = new HostList();
		Iterator iterator = allHosts.values().iterator();
		while (iterator.hasNext())
		{
			Linux_SambaHost host = (Linux_SambaHost) iterator.next();
			hosts.addHost(new Host(this,host,adapter));
		}
	}
	
	public Linux_SambaUser getForceUser() throws WbemsmtException {
		if (forceUser == null || reloadChilds)
        {
        	List list = getGlobalOptions().getAssociated_Linux_SambaUser_Linux_SambaForceUserForGlobals(adapter.getCimClient()); 
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
        WBEMClient cc = adapter.getCimClient();
        try {
            //delete Old force user
            oldForceUser = getForceUser();
            if (oldForceUser != null)
            {
                logger.info("Deleting ForceUser " + oldForceUser.get_key_SambaUserName());
                Vector keys = new Vector();
                keys.add(Linux_SambaForceUserForGlobal.create_GroupComponent_Linux_SambaGlobalOptions(adapter.getCimClient(), adapter.getNamespace(), getGlobalOptions()));
                keys.add(Linux_SambaForceUserForGlobal.create_PartComponent_Linux_SambaUser(adapter.getCimClient(), adapter.getNamespace(), oldForceUser));
                
                AbstractWbemsmtFco instance = adapter.getFcoHelper().getInstance(Linux_SambaForceUserForGlobalHelper.class, adapter.getNamespace(), keys, cc);
                adapter.getFcoHelper().delete(instance,cc);
            }
            //create new force user
            if (newForceUser != null)
            {
                logger.info("Set as Guest " + newForceUser.get_key_SambaUserName());             
                Linux_SambaForceUserForGlobal forceUser = new Linux_SambaForceUserForGlobal(cc,adapter.getNamespace());
                forceUser.set_GroupComponent_Linux_SambaGlobalOptions(getGlobalOptions());
                forceUser.set_PartComponent_Linux_SambaUser(newForceUser);
                forceUser = (Linux_SambaForceUserForGlobal) adapter.getFcoHelper().create(forceUser,cc);
            }
            //force a reload if needed next time
            this.forceUser = null;
        } catch (Exception e) {
            throw new WbemsmtException(WbemsmtException.ERR_SAVE_OBJECT,e);
        }
	}

	public MessageList revertImpl(ServiceLoggingDataContainer container) {
		loggingOptions1 = null;
		return null;
	}

	public MessageList revertImpl(ServiceGlobalSecurityOptionsDataContainer container) {
		globalOptions1 = null;
		globalSecurityOptions1 = null;
		return null;
	}

	public MessageList revertImpl(ServiceUserSecurityOptionsDataContainer container) throws WbemsmtException {
		resetPrinterAcl(this);
        resetShareAcl(this);				
        reloadShareUsers();
		return null;
	}

	public MessageList revertImpl(ServiceAllowHostSecurityDataContainer container) {
		allowHosts = null;
		return null;
	}

	public MessageList revertImpl(ServiceDenyHostDataContainer container) {
		denyHosts = null;
		return null;
	}

	public MessageList revertImpl(ServiceScriptingDataContainer container) {
		scriptingOptions1 = null;
		return null;
	}

	public MessageList revertImpl(ServiceWinsDataContainer container) {
		winsOptions1 = null;
		return null;
	}

	public MessageList revertImpl(ServiceOptionsDataContainer container) {
		globalOptions1 = null;
		serviceConfig1 = null;
		return null;
	}

	public MessageList revert(UserACLItemDataContainerForService container) throws WbemsmtException {
		return null;
	}

	public MessageList revert(UserACLItemDataContainerForService container, Linux_SambaUser fco) throws WbemsmtException {
		return null;
	}
	

	

}
