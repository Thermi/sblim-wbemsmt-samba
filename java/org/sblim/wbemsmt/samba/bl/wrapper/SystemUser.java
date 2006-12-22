 /** 
  * SystemUser.java
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
  * Description: Wrapper for a Samba SystemUser
  * 
  */


package org.sblim.wbemsmt.samba.bl.wrapper;

import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;

public class SystemUser {

	private final String name;

	public SystemUser(String name) {
		super();
		this.name = name;
	}

	public CimObjectKey getCimObjectKey() {
		return new CimObjectKey(new CIMObjectPath(name));
	}

	public String getName() {
		return name;
	}

	public static SystemUser[] asObjects(String[] users) {
		SystemUser[] result = new SystemUser[users.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = new SystemUser(users[i]);
		}
		return result;
	}

}