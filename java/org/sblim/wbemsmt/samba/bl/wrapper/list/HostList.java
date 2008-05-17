 /** 
  * HostList.java
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
  * Description: List with hosts
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper.list;

import javax.cim.CIMObjectPath;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.wrapper.ObjectList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.wrapper.Host;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;



public class HostList extends ObjectList {

	public Host getHost(CimObjectKey key)
	{
		return (Host)get(key);
	}
	
	public Host getHost(CIMObjectPath path)
	{
		return getHost(new CimObjectKey(path));
	}

	public Host getHost(CIM_ManagedElement element)
	{
		return getHost(new CimObjectKey(element.getCimObjectPath()));
	}

	public void addHost(Host host) throws WbemsmtException
	{
		put(host);
	}
	
	protected Object getKey(Object value) {
		Host host = (Host) value;
		return host.getHost().get_key_Name();
	}
	
	protected Object getFco(Object value) {
		Host host = (Host) value;
		return host.getHost();
	}

	public Host getHostByName(String nameOfHost) throws WbemsmtException {
		return (Host) getObjectsByName().get(nameOfHost);
	}
	
}
