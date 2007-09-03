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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt32;
import org.sblim.wbem.cim.UnsignedInt8;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.adapter.Message;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.ModelUpdateException;
import org.sblim.wbemsmt.exception.ObjectCreationException;
import org.sblim.wbemsmt.exception.ObjectDeletionException;
import org.sblim.wbemsmt.exception.ObjectNotFoundException;
import org.sblim.wbemsmt.exception.ObjectRevertException;
import org.sblim.wbemsmt.exception.ObjectSaveException;
import org.sblim.wbemsmt.exception.UpdateControlsException;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter;
import org.sblim.wbemsmt.samba.bl.adapter.SambaErrCodes;
import org.sblim.wbemsmt.samba.bl.adapter.SambaObject;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceAllowHostSecurityDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceDenyHostDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceGlobalSecurityOptionsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceLoggingDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceOperationsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceOptionsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceScriptingDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceUserSecurityOptionsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceWinsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForService;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaCommonSecurityOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaForceUserForGlobal;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaGlobalBrowseOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaGlobalOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaGlobalSecurityOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaGuestAccountForGlobal;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaGuestAccountForGlobalHelper;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaHost;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaInvalidUsersForGlobal;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaLoggingForGlobal;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaLoggingOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaReadListForGlobal;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaScriptingOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaService;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaServiceConfiguration;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaServiceHelper;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaValidUsersForGlobal;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaWinbindOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaWinsOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaWriteListForGlobal;
import org.sblim.wbemsmt.samba.bl.wrapper.list.HostList;
import org.sblim.wbemsmt.samba.bl.wrapper.list.PrinterList;
import org.sblim.wbemsmt.samba.bl.wrapper.list.ShareList;
import org.sblim.wbemsmt.samba.bl.wrapper.list.SystemPrinterList;
import org.sblim.wbemsmt.samba.bl.wrapper.list.SystemUserList;
import org.sblim.wbemsmt.samba.bl.wrapper.list.UserList;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.util.StringUtil;

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
	public ArrayList listHostsToDeny;
	public ArrayList listHostsDenied;
	public ArrayList listHostsToAllow;
	public ArrayList listHostsAllowed;
	private boolean reloadShareUsers = false;
	
	private ShareGlobals shareGlobals = null;
	private PrinterGlobals printerGlobals = null;
	private SystemPrinterList systemPrinters;
	private SystemUserList systemUsers;
	private boolean foundSystemPrinters;
	private boolean foundSystemUsers;
	private String[] valuesPassDbBackend;
	private String[] valuesDomainMaster;
	private String[] valuesSecurity;
	private Linux_SambaUser forceUser;
	
	public Service(SambaCimAdapter adapter, Linux_SambaService service) throws ModelLoadException
	{
		super(adapter);
		this.service = service;
		shareGlobals = new ShareGlobals(this,adapter);
		printerGlobals = new PrinterGlobals(this,adapter);
	}
	
	public void reloadChilds(CIMClient cimClient) throws ModelLoadException
	{
		logger.log(Level.INFO, "Loading childs of service " + service.get_Name()); 
		
//		loadGlobalOptions(cimClient);
		getLoggingOptions(cimClient);
		getGlobalSecurityOptions(cimClient);
		getServiceConfig(cimClient);
		getGuestAccount(cimClient);
		getWindBindOptions(cimClient);
		getWinsOptions(cimClient);
		getCommonSecurity(cimClient);
		getBrowseOptions(cimClient);
		getScriptingOptions(cimClient);
		loadHosts(cimClient);
		
		reloadShareUsers = reloadChilds;
		
		reloadShareUsers(cimClient);
		loadSystemPrinters(cimClient);
		loadSystemUsers(cimClient);
		
		reloadChilds = false;
	}

	private Linux_SambaLoggingOptions getLoggingOptions(CIMClient cimClient) throws ModelLoadException {
		if (loggingOptions1 == null || reloadChilds)
		{
			loggingOptions1 = (Linux_SambaLoggingOptions)getFirstChild(Linux_SambaLoggingOptions.class, getGlobalOptions(cimClient).getAssociated_Linux_SambaLoggingOptions_Linux_SambaLoggingForGlobals(cimClient,false,false,null), true);
			if (SambaCimAdapter.DUMMY_MODE)
			{
				if (loggingOptions1 == null)
				{
					loggingOptions1 = new Linux_SambaLoggingOptions();
				}
			}
		}
		return loggingOptions1;

	}

	private Linux_SambaGlobalSecurityOptions getGlobalSecurityOptions(CIMClient cimClient) throws ModelLoadException {
		if (globalSecurityOptions1 == null || reloadChilds)
		{
			globalSecurityOptions1 = (Linux_SambaGlobalSecurityOptions)getFirstChild(Linux_SambaGlobalSecurityOptions.class, getGlobalOptions(cimClient).getAssociated_Linux_SambaGlobalSecurityOptions_Linux_SambaGlobalSecurityForGlobals(cimClient, false, false, null), false);
		}
		return globalSecurityOptions1;
	}

	public Linux_SambaGlobalOptions getGlobalOptions(CIMClient cimClient) throws ModelLoadException {
		if (globalOptions1 == null || reloadChilds)
		{
			globalOptions1 = (Linux_SambaGlobalOptions)getFirstChild(Linux_SambaGlobalOptions.class, service.getAssociated_Linux_SambaGlobalOptions_Linux_SambaGlobalForServices(cimClient,false,false,null), false);
		}
		return globalOptions1;
	}

	private Linux_SambaServiceConfiguration getServiceConfig(CIMClient cimClient) throws ModelLoadException {
		if (serviceConfig1 == null || reloadChilds)
		{
			serviceConfig1 = (Linux_SambaServiceConfiguration)getFirstChild(Linux_SambaServiceConfiguration.class, service.getAssociated_Linux_SambaServiceConfiguration_Linux_SambaServiceConfigurationForServices(cimClient,false,false,null), false);
		}
		return serviceConfig1;
	}

	private Linux_SambaScriptingOptions getScriptingOptions(CIMClient cimClient) throws ModelLoadException {
		if (scriptingOptions1 == null || reloadChilds)
		{
			scriptingOptions1 = (Linux_SambaScriptingOptions)getFirstChild(Linux_SambaScriptingOptions.class, getGlobalOptions(cimClient).getAssociated_Linux_SambaScriptingOptions_Linux_SambaScriptingForGlobal_Names(cimClient,false), false);			
		}
		return scriptingOptions1;
	}

	private Linux_SambaGlobalBrowseOptions getBrowseOptions(CIMClient cimClient) throws ModelLoadException {
		if (browseOptions1 == null || reloadChilds)
		{
			browseOptions1 = (Linux_SambaGlobalBrowseOptions)getFirstChild(Linux_SambaGlobalBrowseOptions.class, getGlobalOptions(cimClient).getAssociated_Linux_SambaGlobalBrowseOptions_Linux_SambaGlobalBrowseForGlobal_Names(cimClient,false), false);
		}
		return browseOptions1;
	}

	private Linux_SambaCommonSecurityOptions getCommonSecurity(CIMClient cimClient) throws ModelLoadException {
		if (commonSecurityOptions1 == null || reloadChilds)
		{
			commonSecurityOptions1 = (Linux_SambaCommonSecurityOptions)getFirstChild(Linux_SambaCommonSecurityOptions.class, getGlobalOptions(cimClient).getAssociated_Linux_SambaCommonSecurityOptions_Linux_SambaCommonSecurityForGlobal_Names(cimClient,false), false);
			allowHostsFromServer = commonSecurityOptions1.get_HostsAllow();
			denyHostsFromServer = commonSecurityOptions1.get_HostsDeny();
		}
		return commonSecurityOptions1;
	}

	private Linux_SambaWinsOptions getWinsOptions(CIMClient cimClient) throws ModelLoadException {
		if (winsOptions1 == null || reloadChilds)
		{
			winsOptions1 = (Linux_SambaWinsOptions)getFirstChild(Linux_SambaWinsOptions.class, getGlobalOptions(cimClient).getAssociated_Linux_SambaWinsOptions_Linux_SambaWinsForGlobal_Names(cimClient,false),true);
			if (SambaCimAdapter.DUMMY_MODE)
			{
				if (winsOptions1 == null)
				{
					winsOptions1 = new Linux_SambaWinsOptions();
				}		
			}
		}
		return winsOptions1;
	}

	private Linux_SambaWinbindOptions getWindBindOptions(CIMClient cimClient) throws ModelLoadException {
		if (winbindOptions1 == null || reloadChilds)
		{
			winbindOptions1 = (Linux_SambaWinbindOptions)getFirstChild(Linux_SambaWinbindOptions.class, getGlobalOptions(cimClient).getAssociated_Linux_SambaWinbindOptions_Linux_SambaWinbindForGlobal_Names(cimClient,false), true);
			if (SambaCimAdapter.DUMMY_MODE)
			{
				if (winbindOptions1 == null)
				{
					winbindOptions1 = new Linux_SambaWinbindOptions();
				}
			}
		}
		return winbindOptions1;
	}

	public Linux_SambaUser getGuestAccount(CIMClient cimClient) throws ModelLoadException {
		if (guestAccount == null || reloadChilds)
		{
			guestAccount = (Linux_SambaUser)getFirstChild(Linux_SambaUser.class, getGlobalOptions(cimClient).getAssociated_Linux_SambaUser_Linux_SambaGuestAccountForGlobal_Names(cimClient,false), true);
		}
		return guestAccount;
	}

	public void reloadGuestAccount(CIMClient cimClient) throws ModelLoadException {
		guestAccount = null;
		getGuestAccount(cimClient);
	}

	public void reloadShareUsers(CIMClient cimClient)  throws ModelLoadException {

		getInvalidUsers(cimClient);
		getValidUsers(cimClient);
		getWriteUsers(cimClient);
		getReadUsers(cimClient);
		getAdminUsers(cimClient);
		
		reloadShareUsers = false;
		
	}	
	
	public Set getAdminUsers(CIMClient cimClient) throws ModelLoadException {
		
		if (adminUsers == null || reloadShareUsers)
		{
			adminUsers = new HashSet();
			setShareUsers(adminUsers,getGlobalOptions(cimClient).getAssociated_Linux_SambaUser_Linux_SambaAdminUsersForGlobal_Names(cimClient,false));
		}
		return adminUsers;
	}
		
	public Set getReadUsers(CIMClient cimClient) throws ModelLoadException {
		
		if (readUsers == null || reloadShareUsers)
		{
			readUsers = new HashSet();
			setShareUsers(readUsers,getGlobalOptions(cimClient).getAssociated_Linux_SambaUser_Linux_SambaReadListForGlobal_Names(cimClient,false));
		}
		return readUsers;
	}
	
	public Set getWriteUsers(CIMClient cimClient) throws ModelLoadException  {
		
		if (writeUsers == null || reloadShareUsers)
		{
			writeUsers = new HashSet();
			setShareUsers(writeUsers,getGlobalOptions(cimClient).getAssociated_Linux_SambaUser_Linux_SambaWriteListForGlobal_Names(cimClient,false));
		}
		return writeUsers;
	}
	
	public Set getValidUsers(CIMClient cimClient)  throws ModelLoadException {
		
		if (validUsers == null || reloadShareUsers)
		{
			validUsers = new HashSet();
			setShareUsers(validUsers,getGlobalOptions(cimClient).getAssociated_Linux_SambaUser_Linux_SambaValidUsersForGlobal_Names(cimClient,false));
		}
		return validUsers;
	}

	public Set getInvalidUsers(CIMClient cimClient) throws ModelLoadException {
		
		if (invalidUsers == null || reloadShareUsers)
		{
			invalidUsers = new HashSet();
			setShareUsers(invalidUsers,getGlobalOptions(cimClient).getAssociated_Linux_SambaUser_Linux_SambaInvalidUsersForGlobal_Names(cimClient,false));
		}
		return invalidUsers;
	}

	void loadHosts(CIMClient cimClient) throws ModelLoadException {

		allHosts.clear();
		denyHosts.clear();
		allowHosts.clear();
		
		if (!SambaCimAdapter.DUMMY_MODE)
		{
			setHosts(allowHosts,getGlobalOptions(cimClient).getAssociated_Linux_SambaHost_Linux_SambaAllowHostsForGlobal_Names(cimClient, false));
			setHosts(denyHosts,getGlobalOptions(cimClient).getAssociated_Linux_SambaHost_Linux_SambaDenyHostsForGlobal_Names(cimClient, false));
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
	
	void loadSystemPrinters(CIMClient cimClient) throws ModelLoadException {

		systemPrinters = new SystemPrinterList();
		
		String printerString = Linux_SambaPrinterOptions.invoke_getAllSystemDefinedPrinters(cimClient);
		String[] printers = new org.sblim.wbemsmt.util.StringTokenizer(printerString,",").asArray(true,false);
		systemPrinters.addSystemPrinters(SystemPrinter.asObjects(printers,adapter));
		
		foundSystemPrinters = systemPrinters.size() > 0;
		
		if (!foundSystemPrinters)
		{
			systemPrinters.addSystemPrinter(new SystemPrinter(adapter.getBundle().getString(Service.KEY_NO_SYSTEMPRINTER_FOUND),adapter));
		}
		
	}
	
	void loadSystemUsers(CIMClient cimClient) throws ModelLoadException {

		systemUsers = new SystemUserList();
		
		String userString = Linux_SambaUser.invoke_getAllSystemUsers(cimClient);
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

	public void updateControls(ServiceOptionsDataContainer container)  throws UpdateControlsException {
		
		try {
			CIMClient cc = container.getAdapter().getCimClient();
			container.get_BindInterfacesOnly().setControlValue(getGlobalOptions(cc).get_BindInterfacesOnly());
			container.get_ConfigurationFile().setControlValue(getServiceConfig(cc).get_ConfigurationFile());
			container.get_Interfaces().setControlValue(getGlobalOptions(cc).get_Interfaces());
			container.get_NetbiosAlias().setControlValue(getGlobalOptions(cc).get_NetbiosAlias());
			container.get_NetbiosName().setControlValue(getGlobalOptions(cc).get_NetbiosName());
			container.get_ServerString().setControlValue(getGlobalOptions(cc).get_ServerString());
			container.get_Workgroup().setControlValue(getGlobalOptions(cc).get_Workgroup());
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
	}

	public void updateControls(ServiceLoggingDataContainer container)  throws UpdateControlsException {
		try {
			CIMClient cc = container.getAdapter().getCimClient();
			container.get_DebugHiresTimestamp().setControlValue(getLoggingOptions(cc).get_DebugHiresTimestamp());
			container.get_DebugPID().setControlValue(getLoggingOptions(cc).get_DebugPID());
			container.get_DebugTimestamp().setControlValue(getLoggingOptions(cc).get_DebugTimestamp());
			container.get_DebugUID().setControlValue(getLoggingOptions(cc).get_DebugUID());
			container.get_LogFile().setControlValue(getLoggingOptions(cc).get_LogFile());
			container.get_LogLevel().setControlValue(getLoggingOptions(cc).get_LogLevel());
			container.get_MaxLogSize().setControlValue(getLoggingOptions(cc).get_MaxLogSize());
			container.get_SysLog().setControlValue(getLoggingOptions(cc).get_SysLog());
			container.get_SysLogOnly().setControlValue(getLoggingOptions(cc).get_SysLogOnly());
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
		
	}

	public void updateControls(ServiceOperationsDataContainer container)  throws UpdateControlsException {
		boolean started = service.get_Started().booleanValue();
		
		logger.info("Service started: " + started);
		
		container.get_Started().setControlValue(new Boolean(started));
		container.get_invoke_StartService().getProperties().setReadOnly(started);
		container.get_invoke_StopService().getProperties().setReadOnly(!started);
		container.get_usr_RestartService().getProperties().setReadOnly(!started);
		
	}

	public void updateControls(ServiceGlobalSecurityOptionsDataContainer container) throws UpdateControlsException 
	{
		try {
			CIMClient cc = container.getAdapter().getCimClient();
			container.get_AuthMethods().setControlValue(getGlobalSecurityOptions(cc).get_AuthMethods());
			container.get_Browsable().setControlValue(getBrowseOptions(cc).get_Browsable());
			
			valuesDomainMaster = new String[]
			                             {
					Linux_SambaGlobalBrowseOptions.DOMAINMASTER_0,
					Linux_SambaGlobalBrowseOptions.DOMAINMASTER_1,
					Linux_SambaGlobalBrowseOptions.DOMAINMASTER_2
			                             };
			
			container.get_DomainMaster().setValues(valuesDomainMaster);
			container.get_DomainMaster().setControlValue(getBrowseOptions(cc).get_DomainMaster());
			container.get_EncryptPasswords().setControlValue(getGlobalSecurityOptions(cc).get_EncryptPasswords());
			container.get_GuestOK().setControlValue(getCommonSecurity(cc).get_GuestOK());
			container.get_GuestOnly().setControlValue(getCommonSecurity(cc).get_GuestOnly());
			container.get_HostsAllow().setControlValue(getCommonSecurity(cc).get_HostsAllow());
			container.get_HostsDeny().setControlValue(getCommonSecurity(cc).get_HostsDeny());
			container.get_MinPasswordLength().setControlValue(getGlobalSecurityOptions(cc).get_MinPasswordLength());
			container.get_NullPasswords().setControlValue(getGlobalSecurityOptions(cc).get_NullPasswords());

			valuesPassDbBackend = new String[]
	                             {
								  Linux_SambaGlobalSecurityOptions.PASSDBBACKEND_0,
								  Linux_SambaGlobalSecurityOptions.PASSDBBACKEND_1,
								  Linux_SambaGlobalSecurityOptions.PASSDBBACKEND_2,
								  Linux_SambaGlobalSecurityOptions.PASSDBBACKEND_3,
								  Linux_SambaGlobalSecurityOptions.PASSDBBACKEND_4
	                             };
			container.get_usr_PassdbBackend().setValues(valuesPassDbBackend);
			container.get_usr_PassdbBackend().setControlValue(new UnsignedInt16(StringUtil.indexOf(valuesPassDbBackend,getGlobalSecurityOptions(cc).get_PassdbBackend())));
			container.get_ReadOnly().setControlValue(getCommonSecurity(cc).get_ReadOnly());

			valuesSecurity = new String[]
			                             {
										  Linux_SambaGlobalSecurityOptions.SECURITY_0,
										  Linux_SambaGlobalSecurityOptions.SECURITY_1,
										  Linux_SambaGlobalSecurityOptions.SECURITY_2,
										  Linux_SambaGlobalSecurityOptions.SECURITY_3,
										  Linux_SambaGlobalSecurityOptions.SECURITY_4
			                             };
			container.get_Security().setValues(valuesSecurity);
			container.get_Security().setControlValue(getGlobalSecurityOptions(cc).get_Security());
			container.get_SMBPasswdFile().setControlValue(getGlobalSecurityOptions(cc).get_SMBPasswdFile());
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
	}

	public void updateControls(ServiceUserSecurityOptionsDataContainer container) throws UpdateControlsException 
	{
		try {
			CIMClient cc = container.getAdapter().getCimClient();
			
			updateForceUser(container,container.get_usr_CurrentForceUser(),container.get_usr_NewForceUser(),this,getForceUser(cc));
			
			Linux_SambaUser guest = getGuestAccount(cc);
			container.get_usr_GuestUser().setControlValue(guest != null ? guest.get_SambaUserName() : adapter.getBundle().getString("no.guest.defined"));
			
			if (RuntimeUtil.getInstance().isCommandline())
			{
				container.get_usr_NewForceUser().getProperties().setVisible(false);
			}
			
			container.getAdapter().updateControls(container.getUserRights(),getUsers().getFCOs());
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
	}

	public void updateControls(ServiceDenyHostDataContainer container)  throws UpdateControlsException {
		listHostsToDeny = new ArrayList();
		listHostsDenied = new ArrayList();
		seperateDenyHosts(allowHosts,denyHosts,listHostsToDeny,listHostsDenied);
		container.get_usr_DeniedHosts().setValues((String[]) listHostsDenied.toArray(new String[listHostsDenied.size()]));
		container.get_usr_HostsToDeny().setValues((String[]) listHostsToDeny.toArray(new String[listHostsToDeny.size()]));
	}

	public void updateControls(ServiceAllowHostSecurityDataContainer container) throws UpdateControlsException 
	{
		listHostsToAllow = new ArrayList();
		listHostsAllowed = new ArrayList();
		
		seperateAllowHosts(allowHosts,denyHosts,listHostsToAllow,listHostsAllowed);
		
		container.get_usr_AllowedHosts().setValues((String[]) listHostsAllowed.toArray(new String[listHostsAllowed.size()]));
		container.get_usr_HostsToAllow().setValues((String[]) listHostsToAllow.toArray(new String[listHostsToAllow.size()]));
	}

	public void updateControls(ServiceScriptingDataContainer container) throws UpdateControlsException 
	{
		try {
			CIMClient cc = container.getAdapter().getCimClient();
			container.get_AddGroupScript().setControlValue(getScriptingOptions(cc).get_AddGroupScript());
			container.get_AddPrinterCommand().setControlValue(getScriptingOptions(cc).get_AddPrinterCommand());
			container.get_AddShareCommand().setControlValue(getScriptingOptions(cc).get_AddShareCommand());
			container.get_AddUserScript().setControlValue(getScriptingOptions(cc).get_AddUserScript());
			container.get_AddUsertoGroupScript().setControlValue(getScriptingOptions(cc).get_AddUsertoGroupScript());
			container.get_DeleteGroupScript().setControlValue(getScriptingOptions(cc).get_DeleteGrouprScript());
			container.get_DeleteUserfromGroupScript().setControlValue(getScriptingOptions(cc).get_DeleteUserfromGroupScript());
			container.get_DeleteUserScript().setControlValue(getScriptingOptions(cc).get_DeleteUserScript());
			container.get_SetPrimaryGroupScript().setControlValue(getScriptingOptions(cc).get_SetPrimaryGroupScript());
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
	}

	public void updateControls(ServiceWinsDataContainer container)  throws UpdateControlsException 
	{
		try {
			CIMClient cc = container.getAdapter().getCimClient();
			container.get_DNS_Proxy().setControlValue(getWinsOptions(cc).get_DNS_Proxy());
			container.get_WINSHook().setControlValue(getWinsOptions(cc).get_WINSHook());
			container.get_WINSProxy().setControlValue(getWinsOptions(cc).get_WINSProxy());
			container.get_WINSServer().setControlValue(getWinsOptions(cc).get_WINSServer());
			container.get_WINSServer().setControlValue(getWinsOptions(cc).get_WINSServer());
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
	}

	public void updateControls(UserACLItemDataContainerForService container, Linux_SambaUser fco) throws UpdateControlsException
	{
		CIMClient cc = adapter.getCimClient();
		try {
			container.get_SambaUserName().setControlValue(fco.get_SambaUserName());
			updateValidInvalidWithUserList(container,container.get_usr_AccessTypeVI(), fco.get_SambaUserName(), getInvalidUsers(cc), getValidUsers(cc), true, this,cc);
			updateReadWriteWithUserList(container,container.get_usr_AccessTypeRW(), fco.get_SambaUserName(), getReadUsers(cc), getWriteUsers(cc), true, this,cc);
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
	}

	public void updateModel(ServiceOperationsDataContainer container)
	{
		CIMClient cimClient = adapter.getCimClient();
		if (adapter.getUpdateTrigger() == container.get_invoke_StartService())
		{
			start(container,cimClient);
		}
		else if (adapter.getUpdateTrigger() == container.get_invoke_StopService())
		{
			stop(container,cimClient);
		}
		else if (adapter.getUpdateTrigger() == container.get_usr_RestartService())
		{
			stop(container,cimClient);
			start(container,cimClient);
		}
	}

	private void stop(ServiceOperationsDataContainer container, CIMClient cimClient) {
		UnsignedInt32 rc = service.invoke_stopService(cimClient);
		this.service = Linux_SambaServiceHelper.getInstance(cimClient,service.getCimObjectPath());
		
		MessageList list = MessageList.init(container);
		
		if (rc.intValue() != 0)
		{
			list.addMessage(Message.create(SambaErrCodes.MSGDEF_CANNOT_STOP_RC, container.getAdapter().getBundle(),new Object[]{""+rc.intValue()}));
		}
		else if (service.get_Started().booleanValue() == true)
		{
			list.addMessage(Message.create(SambaErrCodes.MSGDEF_CANNOT_STOP_STATUS, container.getAdapter().getBundle()));
		}
	}

	private void start(ServiceOperationsDataContainer container, CIMClient cimClient) {
		UnsignedInt32 rc = service.invoke_startService(cimClient);
		this.service = Linux_SambaServiceHelper.getInstance(cimClient,service.getCimObjectPath());
		
		MessageList list = MessageList.init(container);
		
		if (rc.intValue() != 0)
		{
			list.addMessage(Message.create(SambaErrCodes.MSGDEF_CANNOT_START_RC, container.getAdapter().getBundle(),new Object[]{""+rc.intValue()}));
		}
		else if (service.get_Started().booleanValue() == false)
		{
			list.addMessage(Message.create(SambaErrCodes.MSGDEF_CANNOT_START_STATUS, container.getAdapter().getBundle()));
		}
	}

	public void updateModel(ServiceAllowHostSecurityDataContainer container)  throws ModelUpdateException{
		try {
			updateModelHostsAcl(container, container.get_usr_AddHost(), container.get_usr_RemoveHost(), container.get_usr_AllowedHosts(), container.get_usr_HostsToAllow(), listHostsAllowed, listHostsToAllow);
			loadHosts(adapter.getCimClient());
		} catch (ModelLoadException e) {
			throw new ModelUpdateException(e);
		}
}

	public void updateModel(ServiceDenyHostDataContainer container)  throws ModelUpdateException{
		try {
			updateModelHostsAcl(container, container.get_usr_AddHost(), container.get_usr_RemoveHost(), container.get_usr_DeniedHosts(), container.get_usr_HostsToDeny(), listHostsDenied, listHostsToDeny);
			loadHosts(adapter.getCimClient());
		} catch (ModelLoadException e) {
			throw new ModelUpdateException(e);
		}
	}

	public MessageList saveImpl(ServiceOptionsDataContainer container) throws ObjectSaveException {
		try {
			CIMClient cc = adapter.getCimClient();
			getGlobalOptions(cc).set_BindInterfacesOnly((Boolean) container.get_BindInterfacesOnly().getConvertedControlValue());
			getServiceConfig(cc).set_ConfigurationFile((String) container.get_ConfigurationFile().getConvertedControlValue());
			getGlobalOptions(cc).set_Interfaces((String) container.get_Interfaces().getConvertedControlValue());
			getGlobalOptions(cc).set_NetbiosAlias((String) container.get_NetbiosAlias().getConvertedControlValue());
			getGlobalOptions(cc).set_NetbiosName((String) container.get_NetbiosName().getConvertedControlValue());
			getGlobalOptions(cc).set_ServerString((String) container.get_ServerString().getConvertedControlValue());
			getGlobalOptions(cc).set_Workgroup((String) container.get_Workgroup().getConvertedControlValue());
			adapter.getFcoHelper().save(getGlobalOptions(cc),cc);
			adapter.getFcoHelper().save(getServiceConfig(cc),cc);
			
			globalOptions1 = null;
			serviceConfig1 = null;
			getGlobalOptions(cc);
			getServiceConfig(cc);
		} catch (ModelLoadException e) {
			throw new ObjectSaveException(e);
		}
		return null;
	}

	public MessageList saveImpl(ServiceWinsDataContainer container) throws ObjectSaveException  {
		try {
			CIMClient cc = adapter.getCimClient();
			getWinsOptions(cc).set_DNS_Proxy((String) container.get_DNS_Proxy().getConvertedControlValue());
			getWinsOptions(cc).set_WINSHook((String) container.get_WINSHook().getConvertedControlValue());
			getWinsOptions(cc).set_WINSProxy((Boolean) container.get_WINSProxy().getConvertedControlValue());
			getWinsOptions(cc).set_WINSServer((String) container.get_WINSServer().getConvertedControlValue());
			getWinsOptions(cc).set_WINSSupport((Boolean) container.get_WINSSupport().getConvertedControlValue());
			if (!SambaCimAdapter.DUMMY_MODE)
			{
				adapter.getFcoHelper().save(getWinsOptions(cc),cc);
				winsOptions1 = null;
				getWinsOptions(cc);
			}
			return null;
		} catch (ModelLoadException e) {
			throw new ObjectSaveException(e);
		}
	}

	public MessageList saveImpl(ServiceScriptingDataContainer container) throws ObjectSaveException  {
		try {
			CIMClient cc = adapter.getCimClient();
			getScriptingOptions(cc).set_AddGroupScript((String) container.get_AddGroupScript().getConvertedControlValue());
			getScriptingOptions(cc).set_AddPrinterCommand((String) container.get_AddPrinterCommand().getConvertedControlValue());
			getScriptingOptions(cc).set_AddShareCommand((String) container.get_AddShareCommand().getConvertedControlValue());
			getScriptingOptions(cc).set_AddUserScript((String) container.get_AddUserScript().getConvertedControlValue());
			getScriptingOptions(cc).set_AddUsertoGroupScript((String) container.get_AddUsertoGroupScript().getConvertedControlValue());
			getScriptingOptions(cc).set_DeleteGrouprScript((String) container.get_DeleteGroupScript().getConvertedControlValue());
			getScriptingOptions(cc).set_DeleteUserfromGroupScript((String) container.get_DeleteUserfromGroupScript().getConvertedControlValue());
			getScriptingOptions(cc).set_DeleteUserScript((String) container.get_DeleteUserScript().getConvertedControlValue());
			getScriptingOptions(cc).set_SetPrimaryGroupScript((String) container.get_SetPrimaryGroupScript().getConvertedControlValue());
			adapter.getFcoHelper().save(getScriptingOptions(cc),cc);
			scriptingOptions1 = null;
			getScriptingOptions(cc);
		} catch (ModelLoadException e) {
			throw new ObjectSaveException(e);
		}
		return null;	
	}

	public MessageList saveImpl(ServiceDenyHostDataContainer container) throws ObjectSaveException  {
		return null;
	}

	public MessageList saveImpl(ServiceAllowHostSecurityDataContainer container) throws ObjectSaveException  {
		return null;
	}

	public MessageList saveImpl(ServiceUserSecurityOptionsDataContainer container) throws ObjectSaveException  {
		
		try {
			CIMClient cc = adapter.getCimClient();
			MessageList list = new MessageList();
			
			UnsignedInt16 index = (UnsignedInt16) container.get_usr_NewForceUser().getConvertedControlValue();
			//first element is the "no force user text" so subtract one to get the right user
			if (index != null)
			{
				setForceUser(cc,index.intValue() <= 0 ? null : getUsers().getUser(index.intValue()-1).getUser());
			}
			
			list.addAll(adapter.save(container.getUserRights(),getUsers().getFCOs()));
			if (reloadShareUsers)
			{
				//force reload
				resetPrinterAcl(this);
				resetShareAcl(this);				
				reloadShareUsers(cc);
			}
			return list;
		} catch (ModelLoadException e) {
			throw new ObjectSaveException(e);
		}
	}

	public MessageList save(UserACLItemDataContainerForService container, Linux_SambaUser fco) throws ObjectSaveException {
			reloadShareUsers = saveUserACL(container,fco) 
							   || reloadShareUsers;
			return null;
	}

	public MessageList saveImpl(ServiceGlobalSecurityOptionsDataContainer container) throws ObjectSaveException  {
		try {
			CIMClient cc = adapter.getCimClient();
			getGlobalSecurityOptions(cc).set_AuthMethods((String) container.get_AuthMethods().getConvertedControlValue());
			getBrowseOptions(cc).set_Browsable((Boolean) container.get_Browsable().getConvertedControlValue());
			getBrowseOptions(cc).set_DomainMaster((UnsignedInt16) container.get_DomainMaster().getConvertedControlValue());
			getGlobalSecurityOptions(cc).set_EncryptPasswords((Boolean) container.get_EncryptPasswords().getConvertedControlValue());
			getCommonSecurity(cc).set_GuestOK((Boolean) container.get_GuestOK().getConvertedControlValue());
			getCommonSecurity(cc).set_GuestOnly((Boolean) container.get_GuestOnly().getConvertedControlValue());
			getCommonSecurity(cc).set_HostsAllow((String) container.get_HostsAllow().getConvertedControlValue());
			getCommonSecurity(cc).set_HostsDeny((String) container.get_HostsDeny().getConvertedControlValue());
			getGlobalSecurityOptions(cc).set_MinPasswordLength((UnsignedInt8) container.get_MinPasswordLength().getConvertedControlValue());
			getGlobalSecurityOptions(cc).set_NullPasswords((Boolean) container.get_NullPasswords().getConvertedControlValue());
			
			UnsignedInt16 index = (UnsignedInt16) container.get_usr_PassdbBackend().getConvertedControlValue();
			if (index != null)
			{
				getGlobalSecurityOptions(cc).set_PassdbBackend(valuesPassDbBackend[index.intValue()]);
			}
			getCommonSecurity(cc).set_ReadOnly((Boolean) container.get_ReadOnly().getConvertedControlValue());
			getGlobalSecurityOptions(cc).set_Security((UnsignedInt8) container.get_Security().getConvertedControlValue());
			getGlobalSecurityOptions(cc).set_SMBPasswdFile((String) container.get_SMBPasswdFile().getConvertedControlValue());
			adapter.getFcoHelper().save(getGlobalSecurityOptions(cc),cc);
			adapter.getFcoHelper().save(getBrowseOptions(cc),cc);
			adapter.getFcoHelper().save(getCommonSecurity(cc),cc);

			//force reload of objects
			if (!getCommonSecurity(cc).get_HostsAllow().equals(allowHostsFromServer)
				||!getCommonSecurity(cc).get_HostsDeny().equals(denyHostsFromServer))
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
			
			
		} catch (ModelLoadException e) {
			throw new ObjectSaveException(e);
		}
		return null;	
	}

	public MessageList saveImpl(ServiceLoggingDataContainer container) throws ObjectSaveException  {
		CIMClient cc = adapter.getCimClient();
		try {
			getLoggingOptions(cc).set_DebugHiresTimestamp((Boolean) container.get_DebugHiresTimestamp().getConvertedControlValue());
			getLoggingOptions(cc).set_DebugPID((Boolean) container.get_DebugPID().getConvertedControlValue());
			getLoggingOptions(cc).set_DebugTimestamp((Boolean) container.get_DebugTimestamp().getConvertedControlValue());
			getLoggingOptions(cc).set_DebugUID((Boolean) container.get_DebugUID().getConvertedControlValue());
			getLoggingOptions(cc).set_LogFile((String) container.get_LogFile().getConvertedControlValue());
			getLoggingOptions(cc).set_LogLevel((String) container.get_LogLevel().getConvertedControlValue());
			getLoggingOptions(cc).set_MaxLogSize((UnsignedInt32) container.get_MaxLogSize().getConvertedControlValue());
			getLoggingOptions(cc).set_SysLog((UnsignedInt16) container.get_SysLog().getConvertedControlValue());
			getLoggingOptions(cc).set_SysLogOnly((Boolean) container.get_SysLogOnly().getConvertedControlValue());
			if (getLoggingOptions(cc).isValidCimInstance())
			{
				adapter.getFcoHelper().save(getLoggingOptions(cc),cc);
			}
			else
			{
				getLoggingOptions(cc).set_Name(service.get_Name());
				loggingOptions1 = (Linux_SambaLoggingOptions) adapter.getFcoHelper().create(getLoggingOptions(cc),cc);
				Vector vKeyProperties = new Vector();
				vKeyProperties.add(new CIMProperty(Linux_SambaLoggingForGlobal.CIM_PROPERTY_LINUX_SAMBALOGGINGOPTIONS, new CIMValue(getLoggingOptions(cc).getCimObjectPath(), new CIMDataType(Linux_SambaUser.CIM_CLASS_NAME))));
				vKeyProperties.add(new CIMProperty(Linux_SambaLoggingForGlobal.CIM_PROPERTY_LINUX_SAMBAGLOBALOPTIONS, new CIMValue(getGlobalOptions(cc).getCimObjectPath(), new CIMDataType(Linux_SambaGlobalOptions.CIM_CLASS_NAME))));
				adapter.getFcoHelper().create(Linux_SambaLoggingForGlobal.class,cc,vKeyProperties);
			}
			getLoggingOptions(cc);
		} catch (ObjectCreationException e) {
			throw new ObjectSaveException(e);
		} catch (ModelLoadException e) {
			throw new ObjectSaveException(e);
		}
		return null;	
	}

	public boolean saveUserACL(UserACLItemDataContainerForService container, Linux_SambaUser fco) throws ObjectSaveException {
		boolean reloadShareUsers = false;
		try {
			CIMClient cc = adapter.getCimClient();
			Vector vKeyProperties = new Vector();
			vKeyProperties.add(new CIMProperty(Linux_SambaInvalidUsersForGlobal.CIM_PROPERTY_LINUX_SAMBAUSER, new CIMValue(fco.getCimObjectPath(), new CIMDataType(Linux_SambaUser.CIM_CLASS_NAME))));
			vKeyProperties.add(new CIMProperty(Linux_SambaInvalidUsersForGlobal.CIM_PROPERTY_LINUX_SAMBAGLOBALOPTIONS, new CIMValue(getGlobalOptions(cc).getCimObjectPath(), new CIMDataType(Linux_SambaGlobalOptions.CIM_CLASS_NAME))));
			
			reloadShareUsers = saveValidInvalid(container.get_usr_AccessTypeVI(), fco,
					getInvalidUsers(cc), getValidUsers(cc), cc, vKeyProperties,
					Linux_SambaInvalidUsersForGlobal.class,
					Linux_SambaValidUsersForGlobal.class);
			reloadShareUsers = saveReadWrite(container.get_usr_AccessTypeRW(), fco, getReadUsers(cc),
					getWriteUsers(cc), cc, vKeyProperties,
					Linux_SambaReadListForGlobal.class,
					Linux_SambaWriteListForGlobal.class)
					|| reloadShareUsers;
			
		}
		catch (ModelLoadException e)
		{
			throw new ObjectSaveException(e);
		}
		
		return reloadShareUsers;
	}

	public MessageList save(UserACLItemDataContainerForService container) throws ObjectSaveException {
		Linux_SambaUser fco = getUsers().getUserByName((String) container.get_SambaUserName().getConvertedControlValue()).getUser();
		reloadShareUsers = saveUserACL(container,fco) || reloadShareUsers;
		return null;
	}

	public void updateControls(UserACLItemDataContainerForService container) throws UpdateControlsException {
		String username = (String) container.get_SambaUserName().getConvertedControlValue();
		User userByName = getUsers().getUserByName(username);
		if (userByName == null)
		{
			logger.severe("User " + username + " was not found.");
			Linux_SambaUser user = new Linux_SambaUser();
			user.set_SambaUserName(username);
			throw new UpdateControlsException(new ObjectNotFoundException(adapter.getFcoHelper().getCIM_ObjectCreator().createUnhecked(user)));
		}
		Linux_SambaUser fco = userByName.getUser();
		updateControls(container,fco);
	}

	/**
	 * @param cc
	 * @param newGuestAccount
	 * @throws ModelUpdateException
	 */
	public void setGuestAccount(CIMClient cc, Linux_SambaUser newGuestAccount) throws ObjectSaveException  {
		
		Linux_SambaUser oldGuest = null;
		try {
			//delete Old Guest
			oldGuest = getGuestAccount(cc);
			if (oldGuest != null)
			{
				logger.info("Deleting Guest " + oldGuest.get_SambaUserName());
				Vector keys = new Vector();
				keys.add(new CIMProperty(Linux_SambaGuestAccountForGlobal.CIM_PROPERTY_LINUX_SAMBAGLOBALOPTIONS, new CIMValue(getGlobalOptions(cc).getCimObjectPath(), new CIMDataType(Linux_SambaGlobalOptions.CIM_CLASS_NAME))));
				keys.add(new CIMProperty(Linux_SambaGuestAccountForGlobal.CIM_PROPERTY_LINUX_SAMBAUSER, new CIMValue(oldGuest.getCimObjectPath(), new CIMDataType(Linux_SambaUser.CIM_CLASS_NAME))));
				adapter.getFcoHelper().delete(Linux_SambaGuestAccountForGlobal.class,keys,cc);
			}
			//create new Guest
			if (newGuestAccount != null)
			{
				logger.info("Set as Guest " + newGuestAccount.get_SambaUserName());				Linux_SambaGuestAccountForGlobal guestAcc = new Linux_SambaGuestAccountForGlobal();
				guestAcc.set_Linux_SambaGlobalOptions(getGlobalOptions(cc));
				guestAcc.set_Linux_SambaUser(newGuestAccount);
				adapter.getFcoHelper().create(guestAcc,cc);
			}
			//force a reload if needed next time
			this.guestAccount = null;
		} catch (WbemSmtException e) {
			throw new ObjectSaveException(e);
		}
	}

	/**
	 * @param cc
	 * @param guestToRemove
	 * @throws ModelUpdateException
	 */
	public void removeGuestAccount(CIMClient cc, Linux_SambaUser guestToRemove) throws ObjectSaveException  {
		
		logger.info("Remove Guest " + guestToRemove.get_SambaUserName());
		try {
			ArrayList list = Linux_SambaGuestAccountForGlobalHelper.enumerateInstances(cc,false);
			for (Iterator iter = list.iterator(); iter.hasNext();) {
				Linux_SambaGuestAccountForGlobal guestAcc = (Linux_SambaGuestAccountForGlobal) iter.next();
				if (guestAcc.get_Linux_SambaUser().equals(guestToRemove.getCimObjectPath()))
				{
					adapter.getFcoHelper().delete(guestAcc,cc);
				}
			}
		} catch (ObjectDeletionException e) {
			throw new ObjectSaveException(e);
		}
	}
	
	public boolean isGuest(CIMClient client, Linux_SambaUser user) throws ModelLoadException {
		Linux_SambaUser guest = getGuestAccount(client);
		return guest != null && guest.get_SambaUserName().equals(user.get_SambaUserName());
	}

	public SystemPrinterList getSystemPrinters(CIMClient cimClient) throws ModelLoadException {
		if (systemPrinters == null)
		{
			loadSystemPrinters(cimClient);
		}
		return systemPrinters;
	}

	public SystemUserList getSystemUsers(CIMClient cimClient) throws ModelLoadException {
		if (systemUsers == null)
		{
			loadSystemUsers(cimClient);
		}
		return systemUsers;
	}

	public void loadUserList(CIMClient cimClient) throws ModelLoadException {
		users = new UserList();
		Linux_SambaUser fco;
		ArrayList list = service.getAssociated_Linux_SambaUser_Linux_SambaUsersForServices(cimClient,false,false,null);
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			fco = (Linux_SambaUser) iter.next();
			users.addUser(new User(this,fco,adapter));
		}
	}

	public void loadPrinterList(CIMClient cimClient) throws ModelLoadException {
		printers = new PrinterList();
		Linux_SambaPrinterOptions fco;
		ArrayList list = service.getAssociated_Linux_SambaPrinterOptions_Linux_SambaPrinterForServices(cimClient,false,false,null);
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			fco = (Linux_SambaPrinterOptions) iter.next();
			printers.addPrinter(new Printer(this,fco,adapter));
		}
	}

	public void loadShareList(CIMClient cimClient) throws ModelLoadException {
		shares = new ShareList();
		Linux_SambaShareOptions fco;
		ArrayList list = service.getAssociated_Linux_SambaShareOptions_Linux_SambaShareForServices(cimClient,false,false,null);
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			fco = (Linux_SambaShareOptions) iter.next();
			shares.addShare(new Share(this,fco,adapter));
		}
	}
	
	public void loadHostList(CIMClient cimClient) throws ModelLoadException {
		loadHosts(cimClient);
		hosts = new HostList();
		Iterator iterator = allHosts.values().iterator();
		while (iterator.hasNext())
		{
			Linux_SambaHost host = (Linux_SambaHost) iterator.next();
			hosts.addHost(new Host(this,host,adapter));
		}
	}
	
	public Linux_SambaUser getForceUser(CIMClient cimClient) throws ModelLoadException {
		if (forceUser == null || reloadChilds)
		{
			List list = getGlobalOptions(cimClient).getAssociated_Linux_SambaUser_Linux_SambaForceUserForGlobals(cimClient,false,false,null); 
			forceUser = (Linux_SambaUser)getFirstChild(Linux_SambaUser.class, list , true);
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
				keys.add(new CIMProperty(Linux_SambaForceUserForGlobal.CIM_PROPERTY_LINUX_SAMBAGLOBALOPTIONS, new CIMValue(getGlobalOptions(cc).getCimObjectPath(), new CIMDataType(Linux_SambaGlobalOptions.CIM_CLASS_NAME))));
				keys.add(new CIMProperty(Linux_SambaForceUserForGlobal.CIM_PROPERTY_LINUX_SAMBAUSER, new CIMValue(oldForceUser.getCimObjectPath(), new CIMDataType(Linux_SambaUser.CIM_CLASS_NAME))));
				adapter.getFcoHelper().delete(Linux_SambaForceUserForGlobal.class,keys,cc);
			}
			//create new Guest
			if (newForceUser != null)
			{
				logger.info("Set as Force User " + newForceUser.get_SambaUserName());
				Linux_SambaForceUserForGlobal newForceUserAssoc = new Linux_SambaForceUserForGlobal();
				newForceUserAssoc.set_Linux_SambaGlobalOptions(getGlobalOptions(cc));
				newForceUserAssoc.set_Linux_SambaUser(newForceUser);
				adapter.getFcoHelper().create(newForceUserAssoc,cc);
			}
			//force a reload if needed next time
			this.forceUser = null;
		} catch (WbemSmtException e) {
			throw new ObjectSaveException(e);
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

	public MessageList revertImpl(ServiceUserSecurityOptionsDataContainer container) throws ObjectRevertException {
		//force reload
		resetPrinterAcl(this);
		resetShareAcl(this);				
		try {
			reloadShareUsers(container.getAdapter().getCimClient());
		} catch (ModelLoadException e) {
			throw new ObjectRevertException(e);
		}
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

	public MessageList revert(UserACLItemDataContainerForService container) throws ObjectRevertException {
		return null;
	}

	public MessageList revert(UserACLItemDataContainerForService container, Linux_SambaUser fco) throws ObjectRevertException {
		return null;
	}
	

	

}
