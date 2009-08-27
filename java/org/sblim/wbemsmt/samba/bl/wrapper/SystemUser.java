 /** 
  * SystemUser.java
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
  * Description: Wrapper for a Samba SystemUser
  * 
  */


package org.sblim.wbemsmt.samba.bl.wrapper;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter;
import org.sblim.wbemsmt.samba.bl.adapter.SambaObject;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser;

public class SystemUser extends SambaObject {

	private final String name;

	public SystemUser(String name, SambaCimAdapter adapter) {
		super(adapter);
		this.name = name;
	}

	public CimObjectKey getCimObjectKey() throws WbemsmtException {
        Linux_SambaUser user = new Linux_SambaUser(adapter.getCimClient(),adapter.getNamespace());
        user.set_key_SambaUserName(name);
	    return new CimObjectKey(user);
	}

	public String getName() {
		return name;
	}

	public static SystemUser[] asObjects(String[] users, SambaCimAdapter adapter) {
		SystemUser[] result = new SystemUser[users.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = new SystemUser(users[i],adapter);
		}
		return result;
	}

}
