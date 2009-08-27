 /** 
  * SambaLoader.java
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
  * Description: class for loading the objects if user lists the samba services
  * 
  */
package org.sblim.wbemsmt.cli.samba.listener;

import java.util.Iterator;
import java.util.List;

import javax.cim.CIMObjectPath;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaService;
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
			throws WbemsmtException {
		this.commandValues = commandValues;
		String serviceName = CliUtil.getOption(commandValues,getServiceNameKey());
		selectService(bundle, adapter, serviceName);
	}
	
	protected abstract OptionDefinition getServiceNameKey();

	protected void selectService(WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, String serviceName) throws WbemsmtException {
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
				throw new WbemsmtException(WbemsmtException.ERR_OBJECT_NOT_FOUND,bundle.getString("service.not.found",new Object[]{serviceName}));
			}
		} catch (WbemsmtException e) {
			throw new WbemsmtException(WbemsmtException.ERR_OBJECT_NOT_FOUND,bundle.getString("service.not.found",new Object[]{serviceName}),e);
		}
	}

	protected CIMObjectPath getPathOfService(AbstractBaseCimAdapter adapter, String serviceName) throws WbemsmtException {
        List<CIMObjectPath> list = Linux_SambaServiceHelper.enumerateInstanceNames(adapter.getCimClient(),adapter.getNamespace(),false);
        CIMObjectPath pathService = null;
        for (Iterator<CIMObjectPath> iter = list.iterator(); iter.hasNext();) {
        	Object o = iter.next();
        	CIMObjectPath path = (CIMObjectPath) o;
        	if (path.getKey(Linux_SambaService.PROPERTY_NAME.NAME).getValue().equals(serviceName))
        	{
        		pathService = path;
        	}
        }
        return pathService;
	}

}
