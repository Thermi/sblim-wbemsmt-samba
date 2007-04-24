 /** 
  * Printer.java
  *
  * � Copyright IBM Corp. 2005
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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt64;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.bl.fco.CIMPropertyBuilder;
import org.sblim.wbemsmt.bl.fco.FcoHelper;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.ModelUpdateException;
import org.sblim.wbemsmt.exception.ObjectRevertException;
import org.sblim.wbemsmt.exception.ObjectSaveException;
import org.sblim.wbemsmt.exception.UpdateControlsException;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter;
import org.sblim.wbemsmt.samba.bl.adapter.SambaObject;
import org.sblim.wbemsmt.samba.bl.container.printer.PrinterAllowHostSecurityDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.PrinterDenyHostSecurityDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.PrinterOptionsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.PrintingOptionsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinter;
import org.sblim.wbemsmt.samba.bl.container.printer.UserInPrinterACLDataContainer;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaCommonSecurityOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaForceUserForPrinter;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaGlobalOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaInvalidUsersForPrinter;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterAdminForPrinter;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterBrowseOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterPrintingOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaReadListForPrinter;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaValidUsersForPrinter;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaWriteListForPrinter;
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
	
	public Printer(Service service, Linux_SambaPrinterOptions printerFco, SambaCimAdapter adapter) throws ModelLoadException {
		super(adapter);
		this.service = service;
		printer = printerFco;
		getAdminUsers(adapter.getCimClient());
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaObject#loadChilds(org.sblim.wbem.client.CIMClient)
	 */
	public void reloadChilds(CIMClient cimClient) throws ModelLoadException {
		
		
		getCommonSecurity(cimClient);
		getPrintingOptions(cimClient);
		getBrowseOptions(cimClient);

		reloadPrinterUsers = reloadChilds;
		reloadPrinterUsers(cimClient);

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

	private void reloadPrinterUsers(CIMClient cimClient) throws ModelLoadException {
		
		getInvalidUsers(cimClient);
		getValidUsers(cimClient);
		getAdminUsers(cimClient);

		reloadPrinterUsers = false;
	
	}

	private Set getAdminUsers(CIMClient cimClient) {
		
		if (adminUsers == null || reloadPrinterUsers)
		{
			adminUsers = new HashSet();
			setShareUsers(adminUsers,printer.getAssociated_Linux_SambaUser_Linux_SambaPrinterAdminForPrinter_Names(cimClient,false));
		}
		return adminUsers;
	}	
	private Set getValidUsers(CIMClient cimClient) {
		
		if (validUsers == null || reloadPrinterUsers)
		{
			validUsers = new HashSet();
			setShareUsers(validUsers,printer.getAssociated_Linux_SambaUser_Linux_SambaValidUsersForPrinter_Names(cimClient,false));
		}
		return validUsers;
	}

	private Set getInvalidUsers(CIMClient cimClient) {
		
		if (invalidUsers == null || reloadPrinterUsers)
		{
			invalidUsers = new HashSet();
			setShareUsers(invalidUsers,printer.getAssociated_Linux_SambaUser_Linux_SambaInvalidUsersForPrinter_Names(cimClient,false));
		}
		return invalidUsers;
	}	
	
	private Set getWriteUsers(CIMClient cimClient) {
		
		if (writeUsers == null || reloadPrinterUsers)
		{
			writeUsers = new HashSet();
			setShareUsers(writeUsers,printer.getAssociated_Linux_SambaUser_Linux_SambaWriteListForPrinter_Names(cimClient,false));
		}
		return writeUsers;
	}

	private Set getReadUsers(CIMClient cimClient) {
		
		if (readUsers == null || reloadPrinterUsers)
		{
			readUsers = new HashSet();
			setShareUsers(readUsers,printer.getAssociated_Linux_SambaUser_Linux_SambaReadListForPrinter_Names(cimClient,false));
		}
		return readUsers;
	}	

	private Linux_SambaCommonSecurityOptions getCommonSecurity(CIMClient cimClient) throws ModelLoadException {
		
		if (commonSecurity == null || reloadChilds)
		{
			commonSecurity = (Linux_SambaCommonSecurityOptions)getFirstChild(Linux_SambaCommonSecurityOptions.class,printer.getAssociated_Linux_SambaCommonSecurityOptions_Linux_SambaCommonSecurityForPrinter_Names(cimClient, false), false);
		}
		return commonSecurity;
		
	}
	
	public void setCommonSecurity(Linux_SambaCommonSecurityOptions commonSecurity) {
		this.commonSecurity = commonSecurity;
	}

	private Linux_SambaPrinterPrintingOptions getPrintingOptions(CIMClient cimClient) throws ModelLoadException {
		if (printingOptions == null || reloadChilds)
		{
			printingOptions = (Linux_SambaPrinterPrintingOptions)getFirstChild(Linux_SambaPrinterPrintingOptions.class,printer.getAssociated_Linux_SambaPrinterPrintingOptions_Linux_SambaPrinterPrintingForPrinter_Names(cimClient, false), false);
		}
		return printingOptions;
	}

	private Linux_SambaPrinterBrowseOptions getBrowseOptions(CIMClient cimClient) throws ModelLoadException {
		if (browseOptions == null || reloadChilds)
		{
			browseOptions = (Linux_SambaPrinterBrowseOptions)getFirstChild(Linux_SambaPrinterBrowseOptions.class,printer.getAssociated_Linux_SambaPrinterBrowseOptions_Linux_SambaPrinterBrowseForPrinter_Names(cimClient, false), false);
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

	public void updateControls(UserACLItemDataContainerForPrinter container, Linux_SambaUser fco) throws UpdateControlsException {
		try {
			CIMClient cc = container.getAdapter().getCimClient();
			container.get_SambaUserName().setControlValue(fco.get_SambaUserName());
			updateValidInvalidWithUserList(container,container.get_usr_AccessTypeVI(), fco.get_SambaUserName(), getInvalidUsers(cc), getValidUsers(cc), false, service,cc);
			updateReadWriteWithUserList(container,container.get_usr_AccessTypeRW(), fco.get_SambaUserName(), getReadUsers(cc), getWriteUsers(cc), false, service,cc);
			updateAdminWithUserList(container,container.get_usr_Admin(), fco.get_SambaUserName(), getAdminUsers(cc), service,cc,service.getPrinterGlobals().getAdminUsers(cc), false);
		}catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
	}

	public void updateControls(PrinterDenyHostSecurityDataContainer container)  throws UpdateControlsException {
		listHostsToDeny = new ArrayList();
		listHostsDenied = new ArrayList();
		
		seperateDenyHosts(allowHosts,denyHosts,listHostsToDeny,listHostsDenied);
		
		container.get_usr_DeniedHosts().setValues((String[]) listHostsDenied.toArray(new String[listHostsDenied.size()]));
		container.get_usr_HostsToDeny().setValues((String[]) listHostsToDeny.toArray(new String[listHostsToDeny.size()]));
	}

	public void updateControls(PrinterAllowHostSecurityDataContainer container)  throws UpdateControlsException {
		listHostsToAllow = new ArrayList();
		listHostsAllowed = new ArrayList();
		
		seperateAllowHosts(allowHosts,denyHosts,listHostsToAllow,listHostsAllowed);
		
		container.get_usr_AllowedHosts().setValues((String[]) listHostsAllowed.toArray(new String[listHostsAllowed.size()]));
		container.get_usr_HostsToAllow().setValues((String[]) listHostsToAllow.toArray(new String[listHostsToAllow.size()]));
	}
	
	public void updateControls(UserInPrinterACLDataContainer container) throws UpdateControlsException {
		CIMClient cc = container.getAdapter().getCimClient();
		try {
			super.updateForceUser(container, container.get_usr_CurrentForceUser(),container.get_usr_NewForceUser(),service,getForceUser(cc));
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
		container.getAdapter().updateControls(container.getUsers(),service.getUsers().getFCOs());
	}


	public void updateControls(PrintingOptionsDataContainer container) throws UpdateControlsException {
		
		try {
			CIMClient cc = container.getAdapter().getCimClient();
			container.get_CupsOptions().setControlValue(getPrintingOptions(cc).get_CupsOptions());
			container.get_DefaultDevMode().setControlValue(getPrintingOptions(cc).get_DefaultDevMode());
			container.get_MaxPrintjobs().setControlValue(getPrintingOptions(cc).get_MaxPrintjobs());
			container.get_MaxReportedPrintjobs().setControlValue(getPrintingOptions(cc).get_MaxReportedPrintjobs());
			container.get_PrintCommand().setControlValue(getPrintingOptions(cc).get_PrintCommand());
			container.get_UseClientDriver().setControlValue(getPrintingOptions(cc).get_UseClientDriver());
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
	}

	public void updateControls(PrinterOptionsDataContainer container) throws UpdateControlsException {
		try {
			CIMClient cc = container.getAdapter().getCimClient();
			container.get_Name().setControlValue(printer.get_Name());
			container.get_Available().setControlValue(printer.get_Available());
			container.get_Browsable().setControlValue(getBrowseOptions(cc).get_Browsable());
			container.get_Comment().setControlValue(printer.get_Comment());
			container.get_GuestOK().setControlValue(getCommonSecurity(cc).get_GuestOK());
			container.get_GuestOnly().setControlValue(getCommonSecurity(cc).get_GuestOnly());
			container.get_HostsAllow().setControlValue(getCommonSecurity(cc).get_HostsAllow());
			container.get_HostsDeny().setControlValue(getCommonSecurity(cc).get_HostsDeny());
			container.get_Path().setControlValue(printer.get_Path());
			container.get_ReadOnly().setControlValue(getCommonSecurity(cc).get_ReadOnly());
			systemPrinterNames = service.getSystemPrinters(cc).getNameArray();
			container.get_usr_SystemPrinterName().setValues(systemPrinterNames);
			int index = StringUtil.indexOf(systemPrinterNames,printer.get_SystemPrinterName());
			if (index == -1)
			{
				index = 0;
			}
			
			container.get_usr_SystemPrinterName().setControlValue(new UnsignedInt16(index ));
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
	}


	public MessageList save(UserInPrinterACLDataContainer container) throws ObjectSaveException {
		
		CIMClient cc = container.getAdapter().getCimClient();
		MessageList list = new MessageList();
		
		UnsignedInt16 index = (UnsignedInt16) container.get_usr_NewForceUser().getConvertedControlValue();
		//first element is the "no force user text" so subtract one to get the right user
		if (index != null)
		{
			setForceUser(cc,index.intValue() <= 0 ? null : service.getUsers().getUser(index.intValue()-1).getUser());
		}
		
		list.addAll(container.getAdapter().save(container.getUsers(),service.getUsers().getFCOs()));
		
		if (reloadPrinterUsers)
		{
			try {
				reloadPrinterUsers(container.getAdapter().getCimClient());
				//force reload
				super.resetUserAcl(service);
				reloadPrinterUsers = false;
			} catch (ModelLoadException e) {
				throw new ObjectSaveException(e);
			}
		}
		return list;
	}

	public MessageList save(UserACLItemDataContainerForPrinter container, Linux_SambaUser fco) throws ObjectSaveException {
		reloadPrinterUsers = saveUserACL(container,fco,printer) || reloadPrinterUsers;
		return null;
	}

	public MessageList save(PrintingOptionsDataContainer container) throws ObjectSaveException {
		try {
			CIMClient cc = container.getAdapter().getCimClient();
			getPrintingOptions(cc).set_CupsOptions((String) container.get_CupsOptions().getConvertedControlValue());
			getPrintingOptions(cc).set_DefaultDevMode((Boolean) container.get_DefaultDevMode().getConvertedControlValue());
			getPrintingOptions(cc).set_MaxPrintjobs((UnsignedInt64) container.get_MaxPrintjobs().getConvertedControlValue());
			getPrintingOptions(cc).set_MaxReportedPrintjobs((UnsignedInt64) container.get_MaxReportedPrintjobs().getConvertedControlValue());
			getPrintingOptions(cc).set_PrintCommand((String) container.get_PrintCommand().getConvertedControlValue());
			getPrintingOptions(cc).set_UseClientDriver((Boolean) container.get_UseClientDriver().getConvertedControlValue());
			FcoHelper.save(getPrintingOptions(cc),cc);
			//force a reload
			printingOptions = null;
			return null;
		} catch (ModelLoadException e) {
			throw new ObjectSaveException(e);
		}
	}

	public MessageList save(PrinterAllowHostSecurityDataContainer container) {
		
		return null;
	}
	public MessageList save(PrinterDenyHostSecurityDataContainer container) {
		
		return null;
	}
	

	public MessageList save(PrinterOptionsDataContainer container)  throws ObjectSaveException {
		
		try {
			CIMClient cc = container.getAdapter().getCimClient();
			printer.set_Available((Boolean) container.get_Available().getConvertedControlValue());
			getBrowseOptions(cc).set_Browsable((Boolean) container.get_Browsable().getConvertedControlValue());
			printer.set_Comment((String) container.get_Comment().getConvertedControlValue());
			getCommonSecurity(cc).set_GuestOK((Boolean) container.get_GuestOK().getConvertedControlValue());
			getCommonSecurity(cc).set_GuestOnly((Boolean) container.get_GuestOnly().getConvertedControlValue());
			getCommonSecurity(cc).set_HostsAllow((String) container.get_HostsAllow().getConvertedControlValue());
			getCommonSecurity(cc).set_HostsDeny((String) container.get_HostsDeny().getConvertedControlValue());
			//share.set_Name(container.get_Name().getConvertedControlValue());
			printer.set_Path((String) container.get_Path().getConvertedControlValue());
			getCommonSecurity(cc).set_ReadOnly((Boolean) container.get_ReadOnly().getConvertedControlValue());
			
			UnsignedInt16 index = (UnsignedInt16) container.get_usr_SystemPrinterName().getConvertedControlValue();
			if (index != null && index.intValue() < systemPrinterNames.length)
			{
				printer.set_SystemPrinterName(systemPrinterNames[index.intValue()]);
			}
			
			FcoHelper.save(printer,cc);
			FcoHelper.save(getCommonSecurity(cc),cc);
			FcoHelper.save(getBrowseOptions(cc),cc);
			
			printer = (Linux_SambaPrinterOptions)FcoHelper.reload(printer,cc);
			//fore reload
			commonSecurity = null;
			browseOptions = null;
			return null;
		} catch (ModelLoadException e) {
			throw new ObjectSaveException(e);
		}
	}

	public void updateModel(PrinterAllowHostSecurityDataContainer container) throws ModelUpdateException{
		updateModelHostsAcl(container, container.get_usr_AddHost(), container.get_usr_RemoveHost(), container.get_usr_AllowedHosts(), container.get_usr_HostsToAllow(), listHostsAllowed, listHostsToAllow);
	}

	public void updateModel(PrinterDenyHostSecurityDataContainer container) throws ModelUpdateException {
		updateModelHostsAcl(container, container.get_usr_AddHost(), container.get_usr_RemoveHost(), container.get_usr_DeniedHosts(), container.get_usr_HostsToDeny(), listHostsDenied, listHostsToDeny);
	}

	private boolean saveUserACL(UserACLItemDataContainerForPrinter container, Linux_SambaUser user, Linux_SambaPrinterOptions printerOptions) throws ObjectSaveException {

		boolean reloadShareUsers = false;
		CIMClient cc = container.getAdapter().getCimClient();
		String sambaUserName = user.get_SambaUserName();
		Vector vKeyProperties = new Vector();
		vKeyProperties.add(CIMPropertyBuilder.create(Linux_SambaInvalidUsersForPrinter.CIM_PROPERTY_LINUX_SAMBAUSER, user));
		vKeyProperties.add(CIMPropertyBuilder.create(Linux_SambaInvalidUsersForPrinter.CIM_PROPERTY_LINUX_SAMBAPRINTEROPTIONS, printerOptions));
		
		boolean admin = ((Boolean)container.get_usr_Admin().getConvertedControlValue()).booleanValue();

		reloadShareUsers = save(admin, getAdminUsers(cc),
				Linux_SambaPrinterAdminForPrinter.class, sambaUserName,
				vKeyProperties, cc);
		reloadShareUsers = saveValidInvalid(container.get_usr_AccessTypeVI(), user,
				getInvalidUsers(cc), getValidUsers(cc), cc, vKeyProperties,
				Linux_SambaInvalidUsersForPrinter.class,
				Linux_SambaValidUsersForPrinter.class)
				|| reloadShareUsers;
		reloadShareUsers = saveReadWrite(container.get_usr_AccessTypeRW(), user, getReadUsers(cc),
				getWriteUsers(cc), cc, vKeyProperties,
				Linux_SambaReadListForPrinter.class,
				Linux_SambaWriteListForPrinter.class)
				|| reloadShareUsers;
		return reloadShareUsers;
	}

	public MessageList save(UserACLItemDataContainerForPrinter container) throws ObjectSaveException {
		Linux_SambaUser fco = service.getUsers().getUserByName((String) container.get_SambaUserName().getConvertedControlValue()).getUser();
		reloadPrinterUsers = saveUserACL(container,fco,printer);
		return null;
	}

	public void updateControls(UserACLItemDataContainerForPrinter container) throws UpdateControlsException {
		Linux_SambaUser fco = service.getUsers().getUserByName((String) container.get_SambaUserName().getConvertedControlValue()).getUser();
		updateControls(container,fco);
	}

	public Linux_SambaUser getForceUser(CIMClient cimClient) throws ModelLoadException {
		if (forceUser == null || reloadChilds)
		{
			List list = printer.getAssociated_Linux_SambaUser_Linux_SambaForceUserForPrinters(cimClient,false,false,null); 
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
				keys.add(new CIMProperty(Linux_SambaForceUserForPrinter.CIM_PROPERTY_LINUX_SAMBAPRINTEROPTIONS, new CIMValue(printer.getCimObjectPath(), new CIMDataType(Linux_SambaGlobalOptions.CIM_CLASS_NAME))));
				keys.add(new CIMProperty(Linux_SambaForceUserForPrinter.CIM_PROPERTY_LINUX_SAMBAUSER, new CIMValue(oldForceUser.getCimObjectPath(), new CIMDataType(Linux_SambaUser.CIM_CLASS_NAME))));
				FcoHelper.delete(Linux_SambaForceUserForPrinter.class,keys,cc);
			}
			//create new Guest
			if (newForceUser != null)
			{
				logger.info("Set as Force User " + newForceUser.get_SambaUserName());
				Linux_SambaForceUserForPrinter newForceUserAssoc = new Linux_SambaForceUserForPrinter();
				newForceUserAssoc.set_Linux_SambaPrinterOptions(printer);
				newForceUserAssoc.set_Linux_SambaUser(newForceUser);
				FcoHelper.create(newForceUserAssoc,cc);
			}
			//force a reload if needed next time
			this.forceUser = null;
		} catch (WbemSmtException e) {
			throw new ObjectSaveException(newForceUser,e);
		}
	}

	public MessageList revert(PrinterOptionsDataContainer container) throws ObjectRevertException {
		try {
			printer = (Linux_SambaPrinterOptions) FcoHelper.reload(printer, container.getAdapter().getCimClient());
		} catch (ModelLoadException e) {
			throw new ObjectRevertException(e);
		}

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

	public MessageList revert(UserInPrinterACLDataContainer container) throws ObjectRevertException {
		resetPrinterUsers();
		return null;
	}


	public MessageList revert(UserACLItemDataContainerForPrinter container) {
		resetPrinterUsers();
		return null;
	}
}
