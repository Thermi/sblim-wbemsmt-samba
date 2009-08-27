 /** 
  * PrinterList.java
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
  * Description: List with printers
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper.list;

import javax.cim.CIMObjectPath;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.wrapper.ObjectList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.wrapper.Printer;
import org.sblim.wbemsmt.schema.cim221.CIM_ManagedElement;



public class PrinterList extends ObjectList  {

	public Printer getPrinter(CimObjectKey key)
	{
		return (Printer)get(key);
	}
	
	public Printer getPrinter(CIMObjectPath path)
	{
		return getPrinter(new CimObjectKey(path));
	}

	public Printer getPrinter(CIM_ManagedElement element)
	{
		return getPrinter(new CimObjectKey(element.getCimObjectPath()));
	}

	public void addPrinter(Printer printer) throws WbemsmtException
	{
		put(printer);
	}

	protected Object getKey(Object value) {
		Printer printer = (Printer) value;
		return printer.getPrinter().get_key_Name();
	}
	
	protected Object getFco(Object value) {
		Printer printer = (Printer) value;
		return printer.getPrinter();
	}

	public Printer getPrinterByName(String printerName) throws WbemsmtException {
		return (Printer) getObjectsByName().get(printerName);
	}

	public Printer getPrinter(int i) throws WbemsmtException {
		return (Printer) getList().get(i);
	}
}
