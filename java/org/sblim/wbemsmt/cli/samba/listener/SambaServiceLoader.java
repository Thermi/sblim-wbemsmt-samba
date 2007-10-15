 /** 
  * SambaLoader.java
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
  * Description: class for loading the objects if user lists the samba services
  * 
  */
package org.sblim.wbemsmt.cli.samba.listener;

import java.util.ArrayList;
import java.util.Iterator;

import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.exception.ObjectNotFoundException;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaServiceHelper;
import org.sblim.wbemsmt.tools.cli.CimCommandValues;
import org.sblim.wbemsmt.tools.cli.CliUtil;
import org.sblim.wbemsmt.tools.cli.OptionDefinition;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public abstract class SambaServiceLoader extends SambaLoader {

	protected CimCommandValues commandValues;

	public SambaServiceLoader() {
		super();
	}

	public void load(WbemSmtResourceBundle bundle,
			AbstractBaseCimAdapter adapter, CimCommandValues commandValues)
			throws ObjectNotFoundException {
		this.commandValues = commandValues;
		String serviceName = CliUtil.getOption(commandValues,getServiceNameKey());
		selectService(bundle, adapter, serviceName);
	}
	
	protected abstract OptionDefinition getServiceNameKey();

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

	protected CIMObjectPath getPathOfService(AbstractBaseCimAdapter adapter, String serviceName) {
		ArrayList list = Linux_SambaServiceHelper.enumerateInstanceNames(adapter.getCimClient(),false);
		CIMObjectPath pathService = null;
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			Object o = iter.next();
			CIMObjectPath path = (CIMObjectPath) o;
			if (path.getKey("Name").getValue().getValue().equals(serviceName))
			{
				pathService = path;
			}
		}
		return pathService;
	}

}
