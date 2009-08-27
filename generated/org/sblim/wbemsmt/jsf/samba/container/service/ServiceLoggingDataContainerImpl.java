/** 
  * ServiceLoggingDataContainerImpl.java
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
  * Description: Container for defining the logging
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.service;

import org.sblim.wbemsmt.exception.*;
import java.util.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;




import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class ServiceLoggingDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.service.ServiceLoggingDataContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SysLog;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SysLogOnly;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_MaxLogSize;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DebugHiresTimestamp;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DebugPID;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DebugTimestamp;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DebugUID;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_LogFile;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_LogLevel;

    	
		
	
	public ServiceLoggingDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "ServiceLoggingDataContainer.caption",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_SysLog());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_SysLogOnly());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_MaxLogSize());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_DebugHiresTimestamp());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_DebugPID());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_DebugTimestamp());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_DebugUID());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_LogFile());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_LogLevel());
        					
		setFooter(getPanelForCustomLayout(),"ServiceLoggingDataContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SysLog() {
    		if (ic_SysLog == null)
    		{
				String label = bundle.getString("ServiceLoggingDataContainer.SysLog");
				String binding = expressionPrefix + "_SysLog.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_SysLog = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_SysLog;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SysLogOnly() {
    		if (ic_SysLogOnly == null)
    		{
				String label = bundle.getString("ServiceLoggingDataContainer.SysLogOnly");
				String binding = expressionPrefix + "_SysLogOnly.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_SysLogOnly = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_SysLogOnly;
    	}
			/**
		* 
		* DataType UNSIGNED_INT32
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_MaxLogSize() {
    		if (ic_MaxLogSize == null)
    		{
				String label = bundle.getString("ServiceLoggingDataContainer.MaxLogSize");
				String binding = expressionPrefix + "_MaxLogSize.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt32StringConverter();
				boolean readOnly = false;
    			ic_MaxLogSize = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_MaxLogSize;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DebugHiresTimestamp() {
    		if (ic_DebugHiresTimestamp == null)
    		{
				String label = bundle.getString("ServiceLoggingDataContainer.DebugHiresTimestamp");
				String binding = expressionPrefix + "_DebugHiresTimestamp.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_DebugHiresTimestamp = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_DebugHiresTimestamp;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DebugPID() {
    		if (ic_DebugPID == null)
    		{
				String label = bundle.getString("ServiceLoggingDataContainer.DebugPID");
				String binding = expressionPrefix + "_DebugPID.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_DebugPID = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_DebugPID;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DebugTimestamp() {
    		if (ic_DebugTimestamp == null)
    		{
				String label = bundle.getString("ServiceLoggingDataContainer.DebugTimestamp");
				String binding = expressionPrefix + "_DebugTimestamp.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_DebugTimestamp = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_DebugTimestamp;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DebugUID() {
    		if (ic_DebugUID == null)
    		{
				String label = bundle.getString("ServiceLoggingDataContainer.DebugUID");
				String binding = expressionPrefix + "_DebugUID.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_DebugUID = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_DebugUID;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_LogFile() {
    		if (ic_LogFile == null)
    		{
				String label = bundle.getString("ServiceLoggingDataContainer.LogFile");
				String binding = expressionPrefix + "_LogFile.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_LogFile = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_LogFile;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_LogLevel() {
    		if (ic_LogLevel == null)
    		{
				String label = bundle.getString("ServiceLoggingDataContainer.LogLevel");
				String binding = expressionPrefix + "_LogLevel.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_LogLevel = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_LogLevel;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_SysLog != null)
    		{
				ic_SysLog.setLabelText(bundle.getString("ServiceLoggingDataContainer.SysLog"));
    		}
	    		if (ic_SysLogOnly != null)
    		{
				ic_SysLogOnly.setLabelText(bundle.getString("ServiceLoggingDataContainer.SysLogOnly"));
    		}
	    		if (ic_MaxLogSize != null)
    		{
				ic_MaxLogSize.setLabelText(bundle.getString("ServiceLoggingDataContainer.MaxLogSize"));
    		}
	    		if (ic_DebugHiresTimestamp != null)
    		{
				ic_DebugHiresTimestamp.setLabelText(bundle.getString("ServiceLoggingDataContainer.DebugHiresTimestamp"));
    		}
	    		if (ic_DebugPID != null)
    		{
				ic_DebugPID.setLabelText(bundle.getString("ServiceLoggingDataContainer.DebugPID"));
    		}
	    		if (ic_DebugTimestamp != null)
    		{
				ic_DebugTimestamp.setLabelText(bundle.getString("ServiceLoggingDataContainer.DebugTimestamp"));
    		}
	    		if (ic_DebugUID != null)
    		{
				ic_DebugUID.setLabelText(bundle.getString("ServiceLoggingDataContainer.DebugUID"));
    		}
	    		if (ic_LogFile != null)
    		{
				ic_LogFile.setLabelText(bundle.getString("ServiceLoggingDataContainer.LogFile"));
    		}
	    		if (ic_LogLevel != null)
    		{
				ic_LogLevel.setLabelText(bundle.getString("ServiceLoggingDataContainer.LogLevel"));
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
    				fields.add(get_SysLog());
    				fields.add(get_SysLogOnly());
    				fields.add(get_MaxLogSize());
    				fields.add(get_DebugHiresTimestamp());
    				fields.add(get_DebugPID());
    				fields.add(get_DebugTimestamp());
    				fields.add(get_DebugUID());
    				fields.add(get_LogFile());
    				fields.add(get_LogLevel());
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
	    		       ServiceLoggingDataContainerImpl source = (ServiceLoggingDataContainerImpl)sourceContainer;
		    		    
    	    		   get_SysLog().copyFrom(source.get_SysLog());
		        		   get_SysLogOnly().copyFrom(source.get_SysLogOnly());
		        		   get_MaxLogSize().copyFrom(source.get_MaxLogSize());
		        		   get_DebugHiresTimestamp().copyFrom(source.get_DebugHiresTimestamp());
		        		   get_DebugPID().copyFrom(source.get_DebugPID());
		        		   get_DebugTimestamp().copyFrom(source.get_DebugTimestamp());
		        		   get_DebugUID().copyFrom(source.get_DebugUID());
		        		   get_LogFile().copyFrom(source.get_LogFile());
		        		   get_LogLevel().copyFrom(source.get_LogLevel());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}