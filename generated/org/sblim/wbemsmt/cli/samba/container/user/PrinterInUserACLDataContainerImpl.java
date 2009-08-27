/** 
  * PrinterInUserACLDataContainerImpl.java
  * 
  * Â© Copyright IBM Corp.  2009,2006,2007
  *
  * THIS FILE IS PROVIDED UNDER THE TER	MS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/cmd/containerImpl.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: Container for the printer-related acl within a user
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.container.user;

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.BaseDataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class PrinterInUserACLDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.user.PrinterInUserACLDataContainer
			, org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainerHeader		
	{
				
		
		private java.util.List<PrinterACLItemDataContainer> icPrinters = new java.util.ArrayList<PrinterACLItemDataContainer>();

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_PrinterName;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_usr_AccessTypeVI;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_usr_AccessTypeRW;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_usr_Admin;
		
	
		
	public PrinterInUserACLDataContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
		super();
		setAdapter(adapter);
    			adapter.initContainer(this);
	}

		
			
		
		/**
		* 
		* linked container PrinterACLItemDataContainer
		*/
				public java.util.List<PrinterACLItemDataContainer> getPrinters()
				{
			return icPrinters;
		}

   	       /**
		* Header for:
		* 
		* linked container PrinterACLItemDataContainer
		*/
		public org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainerHeader getPrintersHeader()
		{
			return this;
		}

				/**
   		 * Header for field PrinterName
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_PrinterName() {
    		if (icPrintersHeader_PrinterName == null)
    		{
    			String label = getAdapter().getBundle().getString("PrinterACLItemDataContainer.PrinterName");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			icPrintersHeader_PrinterName = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icPrintersHeader_PrinterName;
    	    }
				/**
   		 * Header for field accessTypeVI
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_usr_AccessTypeVI() {
    		if (icPrintersHeader_usr_AccessTypeVI == null)
    		{
    			String label = getAdapter().getBundle().getString("PrinterACLItemDataContainer.accessTypeVI");
			    org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
    			icPrintersHeader_usr_AccessTypeVI = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(this,label,"",converter);
			}
    		return icPrintersHeader_usr_AccessTypeVI;
    	    }
				/**
   		 * Header for field accessTypeRW
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_usr_AccessTypeRW() {
    		if (icPrintersHeader_usr_AccessTypeRW == null)
    		{
    			String label = getAdapter().getBundle().getString("PrinterACLItemDataContainer.accessTypeRW");
			    org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
    			icPrintersHeader_usr_AccessTypeRW = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(this,label,"",converter);
			}
    		return icPrintersHeader_usr_AccessTypeRW;
    	    }
				/**
   		 * Header for field admin
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_usr_Admin() {
    		if (icPrintersHeader_usr_Admin == null)
    		{
    			String label = getAdapter().getBundle().getString("PrinterACLItemDataContainer.admin");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			icPrintersHeader_usr_Admin = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icPrintersHeader_usr_Admin;
    	    }
		

	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("PrinterInUserACLDataContainer.caption"));
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
	
	public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title)
	{
    		        		List<PrinterACLItemDataContainer> listprinters = getPrinters();
        		printStream.println();
        		printStream.println(getAdapter().getBundle().getString("PrinterInUserACLDataContainer.role.printers") + " " + getAdapter().getBundle().getString("items.found", new Object[]{new Integer(listprinters.size())}));
        		for (int i = 0; i < listprinters.size(); i++) {
        			BaseDataContainer child = (BaseDataContainer)listprinters.get(i);
        			printStream.println();
        			printStream.println(getAdapter().getBundle().getString("item") + ": " + (i+1) + " " + getAdapter().getBundle().getString("of") + " " + listprinters.size());
        			child.trace(printStream,listOptions,false);
        		}
    			
			
	}
	
	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    		childs.addAll(getPrinters());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       PrinterInUserACLDataContainerImpl source = (PrinterInUserACLDataContainerImpl)sourceContainer;
		    		    
    			
    	    		   List<PrinterACLItemDataContainer> targetListForPrinters = getPrinters();
    		   List<PrinterACLItemDataContainer> sourceListForPrinters = source.getPrinters();
    		   if (sourceListForPrinters.size() != targetListForPrinters.size())
    		   {
    			      throw new WbemsmtException(WbemsmtException.ERR_FAILED,"The Lists are not from same size. Source is " + sourceListForPrinters.size() + " and target is " + targetListForPrinters.size() );
    		   }
			       for (int ii=0; ii < sourceListForPrinters.size(); ii++)
			       {
				          ((DataContainer) targetListForPrinters.get(ii)).copyFrom(((DataContainer) sourceListForPrinters.get(ii)));
			        }
			
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}