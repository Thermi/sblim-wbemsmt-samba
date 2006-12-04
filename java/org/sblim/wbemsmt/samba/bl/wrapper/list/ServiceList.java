 /** 
  * ShareList.java
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
  * Description: List of samba Service wrapper objects
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper.list;

import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.wrapper.ObjectList;
import org.sblim.wbemsmt.samba.bl.wrapper.Service;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;


/**
 * @see org.sblim.wbemsmt.samba.bl.wrapper.Service
 */
public class ServiceList extends ObjectList {

	public Service getService(CimObjectKey key)
	{
		return (Service)objectsByCimObjectKey.get(key);
	}
	
	public Service getService(CIMObjectPath path)
	{
		return getService(new CimObjectKey(path));
	}

	public Service getService(CIM_ManagedElement element)
	{
		return getService(new CimObjectKey(element.getCimObjectPath()));
	}

	public void addService(Service service)
	{
		objectsByCimObjectKey.put(service.getCimObjectKey(),service);
	}

	protected String getKey(Object value) {
		Service service = (Service) value;
		return service.getService().get_Name();
	}
	
	protected Object getFco(Object value) {
		Service service = (Service) value;
		return service.getService();
	}
	
	public Service getServiceByName(String nameOfService) {
		return (Service) getObjectsByName().get(nameOfService);
	}
	
}
