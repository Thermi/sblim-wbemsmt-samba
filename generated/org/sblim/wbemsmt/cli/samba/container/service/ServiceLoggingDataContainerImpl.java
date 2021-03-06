/** 
  * ServiceLoggingDataContainerImpl.java
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
  * Description: Container for defining the logging
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.container.service;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class ServiceLoggingDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.service.ServiceLoggingDataContainer
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
    	
		
	public ServiceLoggingDataContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
		super();
		setAdapter(adapter);
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
				String label = getAdapter().getBundle().getString("ServiceLoggingDataContainer.SysLog");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
    			ic_SysLog = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("ServiceLoggingDataContainer.SysLogOnly");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_SysLogOnly = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("ServiceLoggingDataContainer.MaxLogSize");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt32StringConverter();
    			ic_MaxLogSize = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("ServiceLoggingDataContainer.DebugHiresTimestamp");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_DebugHiresTimestamp = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("ServiceLoggingDataContainer.DebugPID");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_DebugPID = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("ServiceLoggingDataContainer.DebugTimestamp");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_DebugTimestamp = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("ServiceLoggingDataContainer.DebugUID");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_DebugUID = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("ServiceLoggingDataContainer.LogFile");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_LogFile = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("ServiceLoggingDataContainer.LogLevel");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_LogLevel = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_LogLevel;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("ServiceLoggingDataContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_SysLog().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_SysLog()).getValue();
        				printStream.println(get_SysLog().getLabelText() + ": " + value);
   			}
   			   			   			if (get_SysLogOnly().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_SysLogOnly()).getValue();
        				printStream.println(get_SysLogOnly().getLabelText() + ": " + value);
   			}
   			   			   			if (get_MaxLogSize().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_MaxLogSize()).getValue();
        				printStream.println(get_MaxLogSize().getLabelText() + ": " + value);
   			}
   			   			   			if (get_DebugHiresTimestamp().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_DebugHiresTimestamp()).getValue();
        				printStream.println(get_DebugHiresTimestamp().getLabelText() + ": " + value);
   			}
   			   			   			if (get_DebugPID().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_DebugPID()).getValue();
        				printStream.println(get_DebugPID().getLabelText() + ": " + value);
   			}
   			   			   			if (get_DebugTimestamp().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_DebugTimestamp()).getValue();
        				printStream.println(get_DebugTimestamp().getLabelText() + ": " + value);
   			}
   			   			   			if (get_DebugUID().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_DebugUID()).getValue();
        				printStream.println(get_DebugUID().getLabelText() + ": " + value);
   			}
   			   			   			if (get_LogFile().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_LogFile()).getValue();
        				printStream.println(get_LogFile().getLabelText() + ": " + value);
   			}
   			   			   			if (get_LogLevel().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_LogLevel()).getValue();
        				printStream.println(get_LogLevel().getLabelText() + ": " + value);
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