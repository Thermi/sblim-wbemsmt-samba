/** 
  * PrintingOptionsDataContainerImpl.java
  *
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
  * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/jsf/containerImpl.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: container for printing options
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.printer;

import org.sblim.wbemsmt.exception.*;
import java.util.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;




import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class PrintingOptionsDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.printer.PrintingOptionsDataContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_CupsOptions;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DefaultDevMode;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_MaxPrintjobs;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_MaxReportedPrintjobs;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_PrintCommand;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_UseClientDriver;

    	
		
	
	public PrintingOptionsDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "PrintingOptionsDataContainer.caption",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_CupsOptions());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_DefaultDevMode());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_MaxPrintjobs());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_MaxReportedPrintjobs());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_PrintCommand());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_UseClientDriver());
        					
		setFooter(getPanelForCustomLayout(),"PrintingOptionsDataContainer.footerText");
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
				String label = bundle.getString("PrintingOptionsDataContainer.CupsOptions");
				String binding = expressionPrefix + "_CupsOptions.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_CupsOptions = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
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
				String label = bundle.getString("PrintingOptionsDataContainer.DefaultDevMode");
				String binding = expressionPrefix + "_DefaultDevMode.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_DefaultDevMode = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
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
				String label = bundle.getString("PrintingOptionsDataContainer.MaxPrintjobs");
				String binding = expressionPrefix + "_MaxPrintjobs.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt64StringConverter();
				boolean readOnly = false;
    			ic_MaxPrintjobs = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
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
				String label = bundle.getString("PrintingOptionsDataContainer.MaxReportedPrintjobs");
				String binding = expressionPrefix + "_MaxReportedPrintjobs.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt64StringConverter();
				boolean readOnly = false;
    			ic_MaxReportedPrintjobs = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
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
				String label = bundle.getString("PrintingOptionsDataContainer.PrintCommand");
				String binding = expressionPrefix + "_PrintCommand.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_PrintCommand = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
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
				String label = bundle.getString("PrintingOptionsDataContainer.UseClientDriver");
				String binding = expressionPrefix + "_UseClientDriver.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_UseClientDriver = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_UseClientDriver;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_CupsOptions != null)
    		{
				ic_CupsOptions.setLabelText(bundle.getString("PrintingOptionsDataContainer.CupsOptions"));
    		}
	    		if (ic_DefaultDevMode != null)
    		{
				ic_DefaultDevMode.setLabelText(bundle.getString("PrintingOptionsDataContainer.DefaultDevMode"));
    		}
	    		if (ic_MaxPrintjobs != null)
    		{
				ic_MaxPrintjobs.setLabelText(bundle.getString("PrintingOptionsDataContainer.MaxPrintjobs"));
    		}
	    		if (ic_MaxReportedPrintjobs != null)
    		{
				ic_MaxReportedPrintjobs.setLabelText(bundle.getString("PrintingOptionsDataContainer.MaxReportedPrintjobs"));
    		}
	    		if (ic_PrintCommand != null)
    		{
				ic_PrintCommand.setLabelText(bundle.getString("PrintingOptionsDataContainer.PrintCommand"));
    		}
	    		if (ic_UseClientDriver != null)
    		{
				ic_UseClientDriver.setLabelText(bundle.getString("PrintingOptionsDataContainer.UseClientDriver"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesSamba"};
	}

	public void countAndCreateChildren() throws WbemsmtException {
	
    		}


	/**
	 * count and create childrens
	 * @throws WbemsmtException
	 */
	public void updateControls() throws WbemsmtException {
			   countAndCreateChildren();
			   adapter.updateControls(this);
		
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