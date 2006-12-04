 /** 
  * SambaLoader.java
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
  * Description: base class for loading samba objects
  * 
  */
package org.sblim.wbemsmt.cli.samba.listener;

import java.util.ArrayList;

import org.apache.commons.cli.CommandLine;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.fco.FcoHelper;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.ObjectNotFoundException;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaService;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaServiceHelper;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class SambaLoader {

	protected CommandLine cmd;

	public SambaLoader() {
		super();
	}

	protected void selectService(WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, String serviceName) throws ObjectNotFoundException {
		try {
			CIMObjectPath pathService = getPathOfService(adapter, serviceName);
			if (pathService != null)
			{
				CimObjectKey key = new CimObjectKey(pathService);
				adapter.select(key);
				return;
			}
			else
			{
				throw new ObjectNotFoundException(bundle.getString("service.not.found",new Object[]{serviceName}));
			}
		} catch (ObjectNotFoundException e) {
			throw new ObjectNotFoundException(bundle.getString("service.not.found",new Object[]{serviceName}),e);
		}
	}

	protected void selectUser(WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, String serviceName, String username) throws ObjectNotFoundException {
		try {
			CIMObjectPath pathService = getPathOfService(adapter, serviceName);
			Linux_SambaService service = (Linux_SambaService) FcoHelper.reload(Linux_SambaServiceHelper.class,pathService,adapter.getCimClient());
			CIMObjectPath pathUser = getPathOfUser(adapter, service,username);

			CimObjectKey keyService = new CimObjectKey(pathService);
			CimObjectKey keyUser = new CimObjectKey(pathUser);
			keyService.setNextKey(keyUser);
			adapter.select(keyService);
		} catch (ObjectNotFoundException e) {
			throw new ObjectNotFoundException(bundle.getString("userInService.not.found",new Object[]{serviceName,username}),e);
		} catch (ModelLoadException e) {
			throw new ObjectNotFoundException(bundle.getString("userInService.not.found",new Object[]{serviceName,username}),e);
		}
	}

	protected void selectShare(WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, String serviceName, String shareName) throws ObjectNotFoundException {
		try {
			CIMObjectPath pathService = getPathOfService(adapter, serviceName);
			Linux_SambaService service = (Linux_SambaService) FcoHelper.reload(Linux_SambaServiceHelper.class,pathService,adapter.getCimClient());
			CIMObjectPath pathShare = getPathOfShare(adapter, service,shareName);

			CimObjectKey keyService = new CimObjectKey(pathService);
			CimObjectKey keyShare = new CimObjectKey(pathShare);
			keyService.setNextKey(keyShare);
			adapter.select(keyService);
		} catch (ObjectNotFoundException e) {
			throw new ObjectNotFoundException(bundle.getString("shareInService.not.found",new Object[]{serviceName,shareName}),e);
		} catch (ModelLoadException e) {
			throw new ObjectNotFoundException(bundle.getString("shareInService.not.found",new Object[]{serviceName,shareName}),e);
		}
	}

	protected void selectPrinter(WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, String serviceName, String printerName) throws ObjectNotFoundException {
		try {
			CIMObjectPath pathService = getPathOfService(adapter, serviceName);
			Linux_SambaService service = (Linux_SambaService) FcoHelper.reload(Linux_SambaServiceHelper.class,pathService,adapter.getCimClient());
			CIMObjectPath pathPrinter = getPathOfPrinter(adapter, service,printerName);

			CimObjectKey keyService = new CimObjectKey(pathService);
			CimObjectKey keyPrinter = new CimObjectKey(pathPrinter);
			keyService.setNextKey(keyPrinter);
			adapter.select(keyService);
		} catch (ObjectNotFoundException e) {
			throw new ObjectNotFoundException(bundle.getString("printerInService.not.found",new Object[]{serviceName,printerName}),e);
		} catch (ModelLoadException e) {
			throw new ObjectNotFoundException(bundle.getString("printerInService.not.found",new Object[]{serviceName,printerName}),e);
		}
	}

	protected void selectHost(WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, String serviceName, String hostName) throws ObjectNotFoundException {
		try {
			CIMObjectPath pathService = getPathOfService(adapter, serviceName);
			Linux_SambaService service = (Linux_SambaService) FcoHelper.reload(Linux_SambaServiceHelper.class,pathService,adapter.getCimClient());
			CIMObjectPath pathHost = getPathOfHost(adapter, service,hostName);
	
			CimObjectKey keyService = new CimObjectKey(pathService);
			CimObjectKey keyHost = new CimObjectKey(pathHost);
			keyService.setNextKey(keyHost);
			adapter.select(keyService);
		} catch (ObjectNotFoundException e) {
			throw new ObjectNotFoundException(bundle.getString("hostInService.not.found",new Object[]{serviceName,hostName}),e);
		} catch (ModelLoadException e) {
			throw new ObjectNotFoundException(bundle.getString("hostInService.not.found",new Object[]{serviceName,hostName}),e);
		}
	}

	protected CIMObjectPath getPathOfService(AbstractBaseCimAdapter adapter, String serviceName) throws ObjectNotFoundException {

		return FcoHelper.getPath(Linux_SambaService.class,"Name",serviceName,adapter.getCimClient());
	}

	protected CIMObjectPath getPathOfHost(AbstractBaseCimAdapter adapter, Linux_SambaService service, String hostName) throws ObjectNotFoundException {
		ArrayList hostNames = service.getAssociated_Linux_SambaHost_Linux_SambaHostsForService_Names(adapter.getCimClient(),false);
		return FcoHelper.getPath(hostNames,"Name",hostName);
	}

	protected CIMObjectPath getPathOfPrinter(AbstractBaseCimAdapter adapter, Linux_SambaService service, String printerName) throws ObjectNotFoundException {
		ArrayList printerNames = service.getAssociated_Linux_SambaPrinterOptions_Linux_SambaPrinterForService_Names(adapter.getCimClient(),false);
		return FcoHelper.getPath(printerNames,"Name",printerName);
	}

	protected CIMObjectPath getPathOfShare(AbstractBaseCimAdapter adapter, Linux_SambaService service, String shareName) throws ObjectNotFoundException {
		ArrayList shareNames = service.getAssociated_Linux_SambaShareOptions_Linux_SambaShareForService_Names(adapter.getCimClient(),false);
		return FcoHelper.getPath(shareNames,"Name",shareName);
	}

	protected CIMObjectPath getPathOfUser(AbstractBaseCimAdapter adapter, Linux_SambaService service, String sambaUserName) throws ObjectNotFoundException {
		ArrayList userNames = service.getAssociated_Linux_SambaUser_Linux_SambaUsersForService_Names(adapter.getCimClient(),false);
		return FcoHelper.getPath(userNames,"SambaUserName",sambaUserName);
	}

}
