/** 
  * PrinterListDataContainerImpl.java
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
  * Description: List with printers
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.container.printer;

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.BaseDataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.container.printer.PrinterListItemDataContainer;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class PrinterListDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.printer.PrinterListDataContainer
			, org.sblim.wbemsmt.samba.bl.container.printer.PrinterListItemDataContainerHeader		
	{
				
		
		private java.util.List<PrinterListItemDataContainer> icPrinters = new java.util.ArrayList<PrinterListItemDataContainer>();

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_Name;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_usr_SystemPrinterName;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_Path;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_Comment;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_Available;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_GuestOK;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_GuestOnly;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_HostsAllow;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_HostsDeny;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_ReadOnly;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_Browsable;
		
	
		
	public PrinterListDataContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
		super();
		setAdapter(adapter);
    			adapter.initContainer(this);
	}

		
			
		
		/**
		* 
		* linked container PrinterListItemDataContainer
		*/
				public java.util.List<PrinterListItemDataContainer> getPrinters()
				{
			return icPrinters;
		}

   	       /**
		* Header for:
		* 
		* linked container PrinterListItemDataContainer
		*/
		public org.sblim.wbemsmt.samba.bl.container.printer.PrinterListItemDataContainerHeader getPrintersHeader()
		{
			return this;
		}

				/**
   		 * Header for field Name
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_Name() {
    		if (icPrintersHeader_Name == null)
    		{
    			String label = getAdapter().getBundle().getString("PrinterListItemDataContainer.Name");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			icPrintersHeader_Name = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icPrintersHeader_Name;
    	    }
				/**
   		 * Header for field SystemPrinterName
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_usr_SystemPrinterName() {
    		if (icPrintersHeader_usr_SystemPrinterName == null)
    		{
    			String label = getAdapter().getBundle().getString("PrinterListItemDataContainer.SystemPrinterName");
			    org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
    			icPrintersHeader_usr_SystemPrinterName = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(this,label,"",converter);
			}
    		return icPrintersHeader_usr_SystemPrinterName;
    	    }
				/**
   		 * Header for field Path
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_Path() {
    		if (icPrintersHeader_Path == null)
    		{
    			String label = getAdapter().getBundle().getString("PrinterListItemDataContainer.Path");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			icPrintersHeader_Path = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icPrintersHeader_Path;
    	    }
				/**
   		 * Header for field Comment
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_Comment() {
    		if (icPrintersHeader_Comment == null)
    		{
    			String label = getAdapter().getBundle().getString("PrinterListItemDataContainer.Comment");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			icPrintersHeader_Comment = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icPrintersHeader_Comment;
    	    }
				/**
   		 * Header for field Available
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_Available() {
    		if (icPrintersHeader_Available == null)
    		{
    			String label = getAdapter().getBundle().getString("PrinterListItemDataContainer.Available");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			icPrintersHeader_Available = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icPrintersHeader_Available;
    	    }
				/**
   		 * Header for field GuestOK
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_GuestOK() {
    		if (icPrintersHeader_GuestOK == null)
    		{
    			String label = getAdapter().getBundle().getString("PrinterListItemDataContainer.GuestOK");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			icPrintersHeader_GuestOK = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icPrintersHeader_GuestOK;
    	    }
				/**
   		 * Header for field GuestOnly
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_GuestOnly() {
    		if (icPrintersHeader_GuestOnly == null)
    		{
    			String label = getAdapter().getBundle().getString("PrinterListItemDataContainer.GuestOnly");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			icPrintersHeader_GuestOnly = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icPrintersHeader_GuestOnly;
    	    }
				/**
   		 * Header for field HostsAllow
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_HostsAllow() {
    		if (icPrintersHeader_HostsAllow == null)
    		{
    			String label = getAdapter().getBundle().getString("PrinterListItemDataContainer.HostsAllow");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			icPrintersHeader_HostsAllow = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icPrintersHeader_HostsAllow;
    	    }
				/**
   		 * Header for field HostsDeny
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_HostsDeny() {
    		if (icPrintersHeader_HostsDeny == null)
    		{
    			String label = getAdapter().getBundle().getString("PrinterListItemDataContainer.HostsDeny");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			icPrintersHeader_HostsDeny = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icPrintersHeader_HostsDeny;
    	    }
				/**
   		 * Header for field ReadOnly
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_ReadOnly() {
    		if (icPrintersHeader_ReadOnly == null)
    		{
    			String label = getAdapter().getBundle().getString("PrinterListItemDataContainer.ReadOnly");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			icPrintersHeader_ReadOnly = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icPrintersHeader_ReadOnly;
    	    }
				/**
   		 * Header for field Browsable
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_Browsable() {
    		if (icPrintersHeader_Browsable == null)
    		{
    			String label = getAdapter().getBundle().getString("PrinterListItemDataContainer.Browsable");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			icPrintersHeader_Browsable = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icPrintersHeader_Browsable;
    	    }
		

	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("PrinterListDataContainer.caption"));
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
    		        		List<PrinterListItemDataContainer> listprinters = getPrinters();
        		printStream.println();
        		printStream.println(getAdapter().getBundle().getString("PrinterListDataContainer.role.printers") + " " + getAdapter().getBundle().getString("items.found", new Object[]{new Integer(listprinters.size())}));
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
	    		       PrinterListDataContainerImpl source = (PrinterListDataContainerImpl)sourceContainer;
		    		    
    			
    	    		   List<PrinterListItemDataContainer> targetListForPrinters = getPrinters();
    		   List<PrinterListItemDataContainer> sourceListForPrinters = source.getPrinters();
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