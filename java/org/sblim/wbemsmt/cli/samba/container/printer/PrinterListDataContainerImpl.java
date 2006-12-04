/** 
  * PrinterListDataContainerImpl.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
  * @template: ./tools-dcg/templates/cmd/containerImpl.vm
  *
  * Contributors: 
  * 
  * Description: List with printers
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.container.printer;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
//import org.sblim.wbemsmt.tools.converter.*;
//import org.sblim.wbemsmt.tools.converter.test.*;
//import org.sblim.wbemsmt.tools.input.*;
//import org.sblim.wbemsmt.tools.input.test.*;
import org.sblim.wbemsmt.tools.resources.*;
import org.sblim.wbemsmt.exception.*;

public class PrinterListDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.printer.PrinterListDataContainer {

	protected static WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(new String[]{"messages","messagesSamba"},Locale.getDefault());

				private java.util.List icPrinters = new java.util.ArrayList();
	
		
	public PrinterListDataContainerImpl(AbstractBaseCimAdapter adapter) throws InitContainerException {
		super();
		setAdapter(adapter);
    			adapter.initContainer(this);
	}

		
			
		/**
		* 
		* linked container PrinterListItemDataContainer
		*/
		public java.util.List getPrinters()
		{
			return icPrinters;
		}

	
		
	public void trace(java.io.PrintStream printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(bundle.getString("PrinterListDataContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
					}

		if (showChilds(listOptions))
		{
			traceChilds(printStream,listOptions,title);
		}
	}
	
	public void traceChilds(java.io.PrintStream printStream, String listOptions, boolean title)
	{
    		        		printStream.println();
        		printStream.println(bundle.getString("PrinterListDataContainer.role.printers"));
        		List listprinters = getPrinters();
        		for (int i = 0; i < listprinters.size(); i++) {
        			BaseDataContainer child = (BaseDataContainer)listprinters.get(i);
        			printStream.println();
        			printStream.println(bundle.getString("item") + ": " + (i+1) + " " + bundle.getString("of") + " " + listprinters.size());
        			child.trace(printStream,listOptions,false);
        		}
    			
			
	}
	
}