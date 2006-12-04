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
  * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
  * @template: ./tools-dcg/templates/jsf/containerImpl.vm
  *
  * Contributors: 
  * 
  * Description: List with printers
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.printer;

import org.sblim.wbemsmt.exception.*;

public class PrinterListDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.printer.PrinterListDataContainer {

				private java.util.List icPrinters = new java.util.ArrayList();
	
		
	
	public PrinterListDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {
		super(adapter,bindingPrefix, "PrinterListDataContainer.caption");
		
				
    			
    	    						
		setFooter(getInputFieldContainer(),"PrinterListDataContainer.footerText");
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

	
		
	public void reload()
	{
		super.reload();
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesSamba"};
	}

	
}