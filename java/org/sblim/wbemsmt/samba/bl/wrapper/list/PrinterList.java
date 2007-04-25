 /** 
  * PrinterList.java
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
  * Description: List with printers
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper.list;

import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.wrapper.ObjectList;
import org.sblim.wbemsmt.samba.bl.wrapper.Printer;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;



public class PrinterList extends ObjectList  {

	public Printer getPrinter(CimObjectKey key)
	{
		return (Printer)objectsByCimObjectKey.get(key);
	}
	
	public Printer getPrinter(CIMObjectPath path)
	{
		return getPrinter(new CimObjectKey(path));
	}

	public Printer getPrinter(CIM_ManagedElement element)
	{
		return getPrinter(new CimObjectKey(element.getCimObjectPath()));
	}

	public void addPrinter(Printer printer)
	{
		objectsByCimObjectKey.put(printer.getCimObjectKey(),printer);
	}

	protected String getKey(Object value) {
		Printer printer = (Printer) value;
		return printer.getPrinter().get_Name();
	}
	
	protected Object getFco(Object value) {
		Printer printer = (Printer) value;
		return printer.getPrinter();
	}

	public Printer getPrinterByName(String printerName) {
		return (Printer) getObjectsByName().get(printerName);
	}

	public Printer getPrinter(int i) {
		return (Printer) getList().get(i);
	}
}
