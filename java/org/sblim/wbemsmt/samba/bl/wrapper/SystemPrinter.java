 /** 
  * SystemPrinter.java
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
  * Description: Wrapper for a Samba SystemPrinter
  * 
  */


package org.sblim.wbemsmt.samba.bl.wrapper;

import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbemsmt.bl.WbemsmtBusinessObject;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;

public class SystemPrinter extends WbemsmtBusinessObject {

	private final String name;

	public SystemPrinter(String name, AbstractBaseCimAdapter adapter) {
		super(adapter);
		this.name = name;
	}

	public CimObjectKey getCimObjectKey() {
		return new CimObjectKey(new CIMObjectPath(name));
	}

	public String getName() {
		return name;
	}

	public static SystemPrinter[] asObjects(String[] printers, AbstractBaseCimAdapter adapter) {
		SystemPrinter[] result = new SystemPrinter[printers.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = new SystemPrinter(printers[i],adapter);
		}
		return result;
	}

}
