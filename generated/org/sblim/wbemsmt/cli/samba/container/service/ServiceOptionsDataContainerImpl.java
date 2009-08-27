/** 
  * ServiceOptionsDataContainerImpl.java
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
  * Description: Container for Setting Options on the Samba Service
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

public class ServiceOptionsDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.service.ServiceOptionsDataContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_BindInterfacesOnly;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Interfaces;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_NetbiosAlias;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_NetbiosName;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_ServerString;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Workgroup;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_ConfigurationFile;
    	
		
	public ServiceOptionsDataContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
		super();
		setAdapter(adapter);
    			adapter.initContainer(this);
	}

			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_BindInterfacesOnly() {
    		if (ic_BindInterfacesOnly == null)
    		{
				String label = getAdapter().getBundle().getString("ServiceOptionsDataContainer.BindInterfacesOnly");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_BindInterfacesOnly = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_BindInterfacesOnly;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Interfaces() {
    		if (ic_Interfaces == null)
    		{
				String label = getAdapter().getBundle().getString("ServiceOptionsDataContainer.Interfaces");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_Interfaces = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_Interfaces;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_NetbiosAlias() {
    		if (ic_NetbiosAlias == null)
    		{
				String label = getAdapter().getBundle().getString("ServiceOptionsDataContainer.NetbiosAlias");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_NetbiosAlias = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_NetbiosAlias;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_NetbiosName() {
    		if (ic_NetbiosName == null)
    		{
				String label = getAdapter().getBundle().getString("ServiceOptionsDataContainer.NetbiosName");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_NetbiosName = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_NetbiosName;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_ServerString() {
    		if (ic_ServerString == null)
    		{
				String label = getAdapter().getBundle().getString("ServiceOptionsDataContainer.ServerString");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_ServerString = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_ServerString;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Workgroup() {
    		if (ic_Workgroup == null)
    		{
				String label = getAdapter().getBundle().getString("ServiceOptionsDataContainer.Workgroup");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_Workgroup = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_Workgroup;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_ConfigurationFile() {
    		if (ic_ConfigurationFile == null)
    		{
				String label = getAdapter().getBundle().getString("ServiceOptionsDataContainer.ConfigurationFile");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_ConfigurationFile = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_ConfigurationFile;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("ServiceOptionsDataContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_BindInterfacesOnly().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_BindInterfacesOnly()).getValue();
        				printStream.println(get_BindInterfacesOnly().getLabelText() + ": " + value);
   			}
   			   			   			if (get_Interfaces().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_Interfaces()).getValue();
        				printStream.println(get_Interfaces().getLabelText() + ": " + value);
   			}
   			   			   			if (get_NetbiosAlias().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_NetbiosAlias()).getValue();
        				printStream.println(get_NetbiosAlias().getLabelText() + ": " + value);
   			}
   			   			   			if (get_NetbiosName().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_NetbiosName()).getValue();
        				printStream.println(get_NetbiosName().getLabelText() + ": " + value);
   			}
   			   			   			if (get_ServerString().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_ServerString()).getValue();
        				printStream.println(get_ServerString().getLabelText() + ": " + value);
   			}
   			   			   			if (get_Workgroup().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_Workgroup()).getValue();
        				printStream.println(get_Workgroup().getLabelText() + ": " + value);
   			}
   			   			   			if (get_ConfigurationFile().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_ConfigurationFile()).getValue();
        				printStream.println(get_ConfigurationFile().getLabelText() + ": " + value);
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
    				fields.add(get_BindInterfacesOnly());
    				fields.add(get_Interfaces());
    				fields.add(get_NetbiosAlias());
    				fields.add(get_NetbiosName());
    				fields.add(get_ServerString());
    				fields.add(get_Workgroup());
    				fields.add(get_ConfigurationFile());
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
	    		       ServiceOptionsDataContainerImpl source = (ServiceOptionsDataContainerImpl)sourceContainer;
		    		    
    	    		   get_BindInterfacesOnly().copyFrom(source.get_BindInterfacesOnly());
		        		   get_Interfaces().copyFrom(source.get_Interfaces());
		        		   get_NetbiosAlias().copyFrom(source.get_NetbiosAlias());
		        		   get_NetbiosName().copyFrom(source.get_NetbiosName());
		        		   get_ServerString().copyFrom(source.get_ServerString());
		        		   get_Workgroup().copyFrom(source.get_Workgroup());
		        		   get_ConfigurationFile().copyFrom(source.get_ConfigurationFile());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}