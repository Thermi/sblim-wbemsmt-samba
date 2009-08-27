 /** 
  * ShareList.java
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
  * Description: List of samba Service wrapper objects
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper.list;

import javax.cim.CIMObjectPath;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.wrapper.ObjectList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.wrapper.Service;
import org.sblim.wbemsmt.schema.cim221.CIM_ManagedElement;


/**
 * @see org.sblim.wbemsmt.samba.bl.wrapper.Service
 */
public class ServiceList extends ObjectList {

	public Service getService(CimObjectKey key)
	{
		return (Service)get(key);
	}
	
	public Service getService(CIMObjectPath path)
	{
		return getService(new CimObjectKey(path));
	}

	public Service getService(CIM_ManagedElement element)
	{
		return getService(new CimObjectKey(element.getCimObjectPath()));
	}

	public void addService(Service service) throws WbemsmtException
	{
		put(service);
	}

	protected Object getKey(Object value) {
		Service service = (Service) value;
		return service.getService().get_Name();
	}
	
	protected Object getFco(Object value) {
		Service service = (Service) value;
		return service.getService();
	}
	
	public Service getServiceByName(String nameOfService) throws WbemsmtException {
		return (Service) getObjectsByName().get(nameOfService);
	}
	
}
