 /** 
  * UserList.java
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
  * Description: List with users
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper.list;

import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.wrapper.ObjectList;
import org.sblim.wbemsmt.samba.bl.wrapper.SystemUser;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;



public class SystemUserList extends ObjectList {

	
	public SystemUser getSystemUser(CimObjectKey key)
	{
		return (SystemUser)objectsByCimObjectKey.get(key);
	}
	
	public SystemUser getSystemUser(CIMObjectPath path)
	{
		return getSystemUser(new CimObjectKey(path));
	}

	public SystemUser getSystemUser(CIM_ManagedElement element)
	{
		return getSystemUser(new CimObjectKey(element.getCimObjectPath()));
	}

	public void addSystemUser(SystemUser user)
	{
		objectsByCimObjectKey.put(user.getCimObjectKey(),user);
		if (loaded) reloadListValues();
	}
	
	public void removeSystemUser(SystemUser user)
	{
		removeSystemUser(user.getCimObjectKey());
	}

	public void removeSystemUser(CimObjectKey key)
	{
		objectsByCimObjectKey.remove(key);
		if (loaded) reloadListValues();
	}
	
	public SystemUser getSystemUserByName(String username) {
		return (SystemUser) getObjectsByName().get(username);
	}
	
	public SystemUser getSystemUser(int i) {
		if (!loaded) reloadListValues();
		return (SystemUser)getList().get(i);
	}

	protected Object getKey(Object value) {
		SystemUser user = (SystemUser) value;
		return user.getName();
	}
	
	protected Object getFco(Object value) {
		SystemUser user = (SystemUser) value;
		return user;
	}

	public void addSystemUsers(SystemUser[] users) {
		for (int i = 0; i < users.length; i++) {
			SystemUser user = users[i];
			addSystemUser(user);
		}
		
	}
}
