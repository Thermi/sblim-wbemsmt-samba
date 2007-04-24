 /** 
  * PrinterGlobals.java
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
  * Description: Class for wrapping the printer globals business object and the related-actions
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
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt64;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.bl.fco.FcoHelper;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.ModelUpdateException;
import org.sblim.wbemsmt.exception.ObjectDeletionException;
import org.sblim.wbemsmt.exception.ObjectRevertException;
import org.sblim.wbemsmt.exception.ObjectSaveException;
import org.sblim.wbemsmt.exception.UpdateControlsException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter;
import org.sblim.wbemsmt.samba.bl.adapter.SambaObject;
import org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals;
import org.sblim.wbemsmt.samba.bl.container.global.PrintingGlobalsDataContainer;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaGlobalOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaGlobalPrintingOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterAdminForGlobal;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser;
import org.sblim.wbemsmt.util.StringUtil;

public class PrinterGlobals extends SambaObject {

	private final Service service;
	private Linux_SambaGlobalPrintingOptions globalPrintingOptions1;
	private Set adminsBySambaUserName;

	public PrinterGlobals(Service service, SambaCimAdapter adapter) throws ModelLoadException {
		super(adapter);
		this.service = service;
		loadGlobalPrinterAdmins(adapter.getCimClient());
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaObject#loadChilds(org.sblim.wbem.client.CIMClient)
	 */
	public void reloadChilds(CIMClient cimClient) throws ModelLoadException {
		getGlobalPrintingOptions(cimClient);
		reloadChilds = false;
	}


	private Linux_SambaGlobalPrintingOptions getGlobalPrintingOptions(CIMClient cimClient) throws ModelLoadException{
		if (globalPrintingOptions1 == null || reloadChilds)
		{
			globalPrintingOptions1 = (Linux_SambaGlobalPrintingOptions) 
			getFirstChild(
					Linux_SambaGlobalPrintingOptions.class
					,service.
						getGlobalOptions(cimClient).
						getAssociated_Linux_SambaGlobalPrintingOptions_Linux_SambaGlobalPrintingForGlobal_Names(cimClient,false), false);
		}
		return globalPrintingOptions1;
	}

	private void loadGlobalPrinterAdmins(CIMClient cimClient) throws ModelLoadException
	{
		//get the associated Admin
		List admins = service.getGlobalOptions(cimClient).getAssociated_Linux_SambaUser_Linux_SambaPrinterAdminForGlobals(cimClient,false,false,null);
		adminsBySambaUserName = new HashSet();
		for (Iterator iter = admins.iterator(); iter.hasNext();) {
			Linux_SambaUser user = (Linux_SambaUser) iter.next();
			adminsBySambaUserName.add(user.get_SambaUserName());			
		}
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaObject#getCimObjectKey()
	 */
	public CimObjectKey getCimObjectKey() {
		return service.getCimObjectKey();
	}

	public void updateControls(PrintingGlobalsDataContainer container) throws UpdateControlsException {
		
		try {
			CIMClient cc = container.getAdapter().getCimClient();
			container.get_CupsOptions().setControlValue(getGlobalPrintingOptions(cc).get_CupsOptions());
			container.get_DefaultDevMode().setControlValue(getGlobalPrintingOptions(cc).get_DefaultDevMode());
			container.get_MaxPrintjobs().setControlValue(getGlobalPrintingOptions(cc).get_MaxPrintjobs());
			container.get_MaxReportedPrintjobs().setControlValue(getGlobalPrintingOptions(cc).get_MaxReportedPrintjobs());
			container.get_PrintcapCacheTime().setControlValue(getGlobalPrintingOptions(cc).get_PrintcapCacheTime());
			container.get_PrintCommand().setControlValue(getGlobalPrintingOptions(cc).get_PrintCommand());
			
			
			container.get_usr_SystemPrinterName().setValues(service.getSystemPrinters(cc).getNameArray());
			int index = StringUtil.indexOf(service.getSystemPrinters(cc).getNameArray(),getGlobalPrintingOptions(cc).get_SystemPrinterName());
			if (index == -1)
			{
				index = 0;
			}
			container.get_usr_SystemPrinterName().setControlValue(new UnsignedInt16(index));
			container.get_UseClientDriver().setControlValue(getGlobalPrintingOptions(cc).get_UseClientDriver());
			
			container.getAdapter().updateControls(container.getUsers(),service.getUsers().getFCOs());
			
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
		
	}

	public void updateModel(PrintingGlobalsDataContainer container) throws ModelUpdateException {
	}

	public MessageList save(PrintingGlobalsDataContainer container) throws ObjectSaveException {

		try {
		
			CIMClient cc = container.getAdapter().getCimClient();
		
			getGlobalPrintingOptions(cc).set_CupsOptions((String) container.get_CupsOptions().getConvertedControlValue());
			getGlobalPrintingOptions(cc).set_DefaultDevMode((Boolean) container.get_DefaultDevMode().getConvertedControlValue());
			getGlobalPrintingOptions(cc).set_MaxPrintjobs((UnsignedInt64) container.get_MaxPrintjobs().getConvertedControlValue());
			getGlobalPrintingOptions(cc).set_MaxReportedPrintjobs((UnsignedInt64) container.get_MaxReportedPrintjobs().getConvertedControlValue());
			getGlobalPrintingOptions(cc).set_PrintcapCacheTime((UnsignedInt64) container.get_PrintcapCacheTime().getConvertedControlValue());
			getGlobalPrintingOptions(cc).set_PrintCommand((String) container.get_PrintCommand().getConvertedControlValue());
			UnsignedInt16 index = (UnsignedInt16) container.get_usr_SystemPrinterName().getConvertedControlValue();
			if (index != null)
			{
				getGlobalPrintingOptions(cc).set_SystemPrinterName(service.getSystemPrinters(cc).getNameArray()[index.intValue()]);
			}
			getGlobalPrintingOptions(cc).set_UseClientDriver((Boolean) container.get_UseClientDriver().getConvertedControlValue());
			FcoHelper.save(getGlobalPrintingOptions(cc),cc);

			container.getAdapter().save(container.getUsers(),service.getUsers().getFCOs());
			
			reloadChilds = true;
			reloadChilds(cc);
			resetPrinterAcl(service);
			resetPrinterChilds(service);
			resetUserAcl(service);
			return null;
			
			
		} catch (ModelLoadException e) {
			throw new ObjectSaveException(e);
		}
	}

	public void updateControls(AdminUsersInPrinterGlobals container) throws UpdateControlsException {
		super.updateSharePrinterAdminForGlobalControls(container,adminsBySambaUserName,service);
	}

	public void updateControls(AdminUsersInPrinterGlobals container, Linux_SambaUser fco) {
		super.updateSharePrinterAdminForGlobalControls(container,fco,adminsBySambaUserName);
	}

	public MessageList save(AdminUsersInPrinterGlobals container, Linux_SambaUser fco) throws ObjectSaveException {
		
		CIMClient cc = container.getAdapter().getCimClient();
		String userName = (String) container.get_usr_SambaUserName().getConvertedControlValue();
		boolean checked = ((Boolean) container.get_usr_Admin().getConvertedControlValue()).booleanValue();

		try {
			if (!checked && adminsBySambaUserName.contains(userName))
			{
				Vector vKeyProperties = new Vector();
				CIMDataType dataTypeGlobals = new CIMDataType(Linux_SambaGlobalOptions.CIM_CLASS_NAME);
				CIMValue valueGlobals = new CIMValue(service.getGlobalOptions(cc ).getCimObjectPath(), dataTypeGlobals);
				CIMProperty propertyGlobals = new CIMProperty(Linux_SambaPrinterAdminForGlobal.CIM_PROPERTY_LINUX_SAMBAGLOBALOPTIONS, valueGlobals);
				CIMValue valueUser = new CIMValue(fco.getCimObjectPath(), new CIMDataType(Linux_SambaUser.CIM_CLASS_NAME));
				CIMProperty propertyUser = new CIMProperty(Linux_SambaPrinterAdminForGlobal.CIM_PROPERTY_LINUX_SAMBAUSER, valueUser);
				
				vKeyProperties.add(propertyUser);
				vKeyProperties.add(propertyGlobals);
				FcoHelper.delete(Linux_SambaPrinterAdminForGlobal.class,vKeyProperties,cc);
				loadGlobalPrinterAdmins(cc);
			}
			else if (checked && !adminsBySambaUserName.contains(userName))
			{
				Linux_SambaPrinterAdminForGlobal assoc = new Linux_SambaPrinterAdminForGlobal();
				assoc.set_Linux_SambaGlobalOptions(service.getGlobalOptions(cc));
				assoc.set_Linux_SambaUser(fco);
				FcoHelper.create(assoc,cc);
				loadGlobalPrinterAdmins(cc);
			}
		} catch (ModelLoadException e) {
			throw new ObjectSaveException(e);
		} catch (ObjectDeletionException e) {
			throw new ObjectSaveException(e);
		}
		
		return null;
	}

	/**
	 * Called from commandline
	 * @param container
	 * @return
	 * @throws ObjectSaveException 
	 */
	public MessageList save(AdminUsersInPrinterGlobals container) throws ObjectSaveException {
		try {
			User user = getCurrenUser(container, service);
			Linux_SambaUser fco = user.getUser();
			return save(container,fco);
		} catch (ModelLoadException e) {
			throw new ObjectSaveException(e);
		}		
	}
	
	public Set getAdminUsers(CIMClient cc) throws ModelLoadException
	{
		return adminsBySambaUserName;
	}

	public MessageList revert(AdminUsersInPrinterGlobals container, Linux_SambaUser fco) throws ObjectRevertException {
		try {
			loadGlobalPrinterAdmins(container.getAdapter().getCimClient());
		} catch (ModelLoadException e) {
			throw new ObjectRevertException(e);
		}
		return null;
	}

	public MessageList revert(PrintingGlobalsDataContainer container) throws ObjectRevertException {
		
		globalPrintingOptions1 = null;

		container.getAdapter().revert(container.getUsers(),service.getUsers().getFCOs());		
		
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

	public MessageList revert(AdminUsersInPrinterGlobals container) throws ObjectRevertException {
		try {
			loadGlobalPrinterAdmins(container.getAdapter().getCimClient());
		} catch (ModelLoadException e) {
			throw new ObjectRevertException(e);
		}
		return null;
	}


}
