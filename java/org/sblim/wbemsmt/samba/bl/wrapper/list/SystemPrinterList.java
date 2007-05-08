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
import org.sblim.wbemsmt.samba.bl.wrapper.SystemPrinter;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;



public class SystemPrinterList extends ObjectList {

	
	public SystemPrinter getSystemPrinter(CimObjectKey key)
	{
		return (SystemPrinter)objectsByCimObjectKey.get(key);
	}
	
	public SystemPrinter getSystemPrinter(CIMObjectPath path)
	{
		return getSystemPrinter(new CimObjectKey(path));
	}

	public SystemPrinter getSystemPrinter(CIM_ManagedElement element)
	{
		return getSystemPrinter(new CimObjectKey(element.getCimObjectPath()));
	}

	public void addSystemPrinter(SystemPrinter printer)
	{
		objectsByCimObjectKey.put(printer.getCimObjectKey(),printer);
		if (loaded) reloadListValues();
	}
	
	public void addSystemPrinters(SystemPrinter[] printers) {
		for (int i = 0; i < printers.length; i++) {
			addSystemPrinter(printers[i]);
		}
	}
	
	
	public void removeSystemPrinter(SystemPrinter printer)
	{
		removeSystemPrinter(printer.getCimObjectKey());
	}

	public void removeSystemPrinter(CimObjectKey key)
	{
		objectsByCimObjectKey.remove(key);
		if (loaded) reloadListValues();
	}
	
	public SystemPrinter getSystemPrinterByName(String printername) {
		return (SystemPrinter) getObjectsByName().get(printername);
	}
	
	public SystemPrinter getSystemPrinter(int i) {
		if (!loaded) reloadListValues();
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
