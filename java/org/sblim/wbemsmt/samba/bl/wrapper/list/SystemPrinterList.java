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
import org.sblim.wbemsmt.samba.bl.wrapper.SystemPrinter;
import org.sblim.wbemsmt.schema.cim221.CIM_ManagedElement;



public class SystemPrinterList extends ObjectList {

	
	public SystemPrinter getSystemPrinter(CimObjectKey key)
	{
		return (SystemPrinter)get(key);
	}
	
	public SystemPrinter getSystemPrinter(CIMObjectPath path)
	{
		return getSystemPrinter(new CimObjectKey(path));
	}

	public SystemPrinter getSystemPrinter(CIM_ManagedElement element)
	{
		return getSystemPrinter(new CimObjectKey(element.getCimObjectPath()));
	}

	public void addSystemPrinter(SystemPrinter printer) throws WbemsmtException
	{
		put(printer);
	}
	
	public void addSystemPrinters(SystemPrinter[] printers) throws WbemsmtException {
		for (int i = 0; i < printers.length; i++) {
			addSystemPrinter(printers[i]);
		}
	}
	
	
	public void removeSystemPrinter(SystemPrinter printer) throws WbemsmtException
	{
		removeSystemPrinter(printer.getCimObjectKey());
	}

	public void removeSystemPrinter(CimObjectKey key)
	{
		remove(key);
	}
	
	public SystemPrinter getSystemPrinterByName(String printername) throws WbemsmtException {
		return (SystemPrinter) getObjectsByName().get(printername);
	}
	
	public SystemPrinter getSystemPrinter(int i) throws WbemsmtException {
		return (SystemPrinter)getList().get(i);
	}

	protected Object getKey(Object value) {
		SystemPrinter printer = (SystemPrinter) value;
		return printer.getName();
	}
	
	protected Object getFco(Object value) {
		SystemPrinter printer = (SystemPrinter) value;
		return printer;
	}
}
