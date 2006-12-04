 /** 
  * UserList.java
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
  * Description: List with users
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper.list;

import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.wrapper.ObjectList;
import org.sblim.wbemsmt.samba.bl.wrapper.User;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;



public class UserList extends ObjectList {

	
	public User getUser(CimObjectKey key)
	{
		return (User)objectsByCimObjectKey.get(key);
	}
	
	public User getUser(CIMObjectPath path)
	{
		return getUser(new CimObjectKey(path));
	}

	public User getUser(CIM_ManagedElement element)
	{
		return getUser(new CimObjectKey(element.getCimObjectPath()));
	}

	public void addUser(User user)
	{
		objectsByCimObjectKey.put(user.getCimObjectKey(),user);
		if (loaded) reloadListValues();
	}
	
	public void removeUser(User user)
	{
		removeUser(user.getCimObjectKey());
	}

	public void removeUser(CimObjectKey key)
	{
		objectsByCimObjectKey.remove(key);
		if (loaded) reloadListValues();
	}
	
	public User getUserByName(String username) {
		return (User) getObjectsByName().get(username);
	}
	
	public User getUser(int i) {
		if (!loaded) reloadListValues();
		return (User)getList().get(i);
	}

	protected String getKey(Object value) {
		User user = (User) value;
		return user.getUser().get_SambaUserName();
	}
	
	protected Object getFco(Object value) {
		User user = (User) value;
		return user.getUser();
	}
}
