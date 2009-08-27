/** 
  * PrintingOptionsDataContainerImpl.java
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
  * Description: container for printing options
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.container.printer;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class PrintingOptionsDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.printer.PrintingOptionsDataContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_CupsOptions;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DefaultDevMode;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_MaxPrintjobs;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_MaxReportedPrintjobs;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_PrintCommand;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_UseClientDriver;
    	
		
	public PrintingOptionsDataContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
		super();
		setAdapter(adapter);
    			adapter.initContainer(this);
	}

			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_CupsOptions() {
    		if (ic_CupsOptions == null)
    		{
				String label = getAdapter().getBundle().getString("PrintingOptionsDataContainer.CupsOptions");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_CupsOptions = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_CupsOptions;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DefaultDevMode() {
    		if (ic_DefaultDevMode == null)
    		{
				String label = getAdapter().getBundle().getString("PrintingOptionsDataContainer.DefaultDevMode");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_DefaultDevMode = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_DefaultDevMode;
    	}
			/**
		* 
		* DataType UNSIGNED_INT64
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_MaxPrintjobs() {
    		if (ic_MaxPrintjobs == null)
    		{
				String label = getAdapter().getBundle().getString("PrintingOptionsDataContainer.MaxPrintjobs");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt64StringConverter();
    			ic_MaxPrintjobs = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_MaxPrintjobs;
    	}
			/**
		* 
		* DataType UNSIGNED_INT64
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_MaxReportedPrintjobs() {
    		if (ic_MaxReportedPrintjobs == null)
    		{
				String label = getAdapter().getBundle().getString("PrintingOptionsDataContainer.MaxReportedPrintjobs");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt64StringConverter();
    			ic_MaxReportedPrintjobs = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_MaxReportedPrintjobs;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_PrintCommand() {
    		if (ic_PrintCommand == null)
    		{
				String label = getAdapter().getBundle().getString("PrintingOptionsDataContainer.PrintCommand");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_PrintCommand = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_PrintCommand;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_UseClientDriver() {
    		if (ic_UseClientDriver == null)
    		{
				String label = getAdapter().getBundle().getString("PrintingOptionsDataContainer.UseClientDriver");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_UseClientDriver = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_UseClientDriver;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("PrintingOptionsDataContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_CupsOptions().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_CupsOptions()).getValue();
        				printStream.println(get_CupsOptions().getLabelText() + ": " + value);
   			}
   			   			   			if (get_DefaultDevMode().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_DefaultDevMode()).getValue();
        				printStream.println(get_DefaultDevMode().getLabelText() + ": " + value);
   			}
   			   			   			if (get_MaxPrintjobs().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_MaxPrintjobs()).getValue();
        				printStream.println(get_MaxPrintjobs().getLabelText() + ": " + value);
   			}
   			   			   			if (get_MaxReportedPrintjobs().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_MaxReportedPrintjobs()).getValue();
        				printStream.println(get_MaxReportedPrintjobs().getLabelText() + ": " + value);
   			}
   			   			   			if (get_PrintCommand().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_PrintCommand()).getValue();
        				printStream.println(get_PrintCommand().getLabelText() + ": " + value);
   			}
   			   			   			if (get_UseClientDriver().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_UseClientDriver()).getValue();
        				printStream.println(get_UseClientDriver().getLabelText() + ": " + value);
   			}
   					}

		if (showChilds(listOptions))
		{
			traceChilds(printStream,listOptions,title);
		}
	}
	
	public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title)
	{
    			
			
	}
	
	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    				fields.add(get_CupsOptions());
    				fields.add(get_DefaultDevMode());
    				fields.add(get_MaxPrintjobs());
    				fields.add(get_MaxReportedPrintjobs());
    				fields.add(get_PrintCommand());
    				fields.add(get_UseClientDriver());
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       PrintingOptionsDataContainerImpl source = (PrintingOptionsDataContainerImpl)sourceContainer;
		    		    
    	    		   get_CupsOptions().copyFrom(source.get_CupsOptions());
		        		   get_DefaultDevMode().copyFrom(source.get_DefaultDevMode());
		        		   get_MaxPrintjobs().copyFrom(source.get_MaxPrintjobs());
		        		   get_MaxReportedPrintjobs().copyFrom(source.get_MaxReportedPrintjobs());
		        		   get_PrintCommand().copyFrom(source.get_PrintCommand());
		        		   get_UseClientDriver().copyFrom(source.get_UseClientDriver());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}