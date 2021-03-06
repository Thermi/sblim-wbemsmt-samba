 /** 
  * UserList.java
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
  * Description: List with users
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper.list;

import javax.cim.CIMObjectPath;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.wrapper.ObjectList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.wrapper.User;
import org.sblim.wbemsmt.schema.cim221.CIM_ManagedElement;



public class UserList extends ObjectList {

	
	public User getUser(CimObjectKey key)
	{
		return (User)get(key);
	}
	
	public User getUser(CIMObjectPath path)
	{
		return getUser(new CimObjectKey(path));
	}

	public User getUser(CIM_ManagedElement element)
	{
		return getUser(new CimObjectKey(element.getCimObjectPath()));
	}

	public void addUser(User user) throws WbemsmtException
	{
		put(user);
	}
	
	public void removeUser(User user)
	{
		removeUser(user.getCimObjectKey());
	}

	public void removeUser(CimObjectKey key)
	{
		remove(key);
	}
	
	public User getUserByName(String username) throws WbemsmtException {
		return (User) getObjectsByName().get(username);
	}
	
	public User getUser(int i) throws WbemsmtException {
		return (User)getList().get(i);
	}

	protected Object getKey(Object value) {
		User user = (User) value;
		return user.getUser().get_key_SambaUserName();
	}
	
	protected Object getFco(Object value) {
		User user = (User) value;
		return user.getUser();
	}
}
