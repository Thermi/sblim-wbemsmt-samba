 /** 
  * SystemPrinter.java
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
  * Description: Wrapper for a Samba SystemPrinter
  * 
  */


package org.sblim.wbemsmt.samba.bl.wrapper;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter;
import org.sblim.wbemsmt.samba.bl.adapter.SambaObject;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterOptions;

public class SystemPrinter extends SambaObject {

	private final String name;

	public SystemPrinter(String name, SambaCimAdapter adapter) {
		super(adapter);
		this.name = name;
	}

	public CimObjectKey getCimObjectKey() throws WbemsmtException {
	    Linux_SambaPrinterOptions printerOptions = new Linux_SambaPrinterOptions(adapter.getCimClient(),adapter.getNamespace());
	    printerOptions.set_key_Name(name);
		return new CimObjectKey(printerOptions);
	}

	public String getName() {
		return name;
	}

	public static SystemPrinter[] asObjects(String[] printers, SambaCimAdapter adapter) {
		SystemPrinter[] result = new SystemPrinter[printers.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = new SystemPrinter(printers[i],adapter);
		}
		return result;
	}

}
