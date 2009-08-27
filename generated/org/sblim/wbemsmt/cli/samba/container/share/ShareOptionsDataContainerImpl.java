/** 
  * ShareOptionsDataContainerImpl.java
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
  * Description: Container for Share Options
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.container.share;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class ShareOptionsDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.share.ShareOptionsDataContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Name;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Available;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Comment;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Path;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Browsable;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_GuestOK;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_GuestOnly;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_HostsAllow;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_HostsDeny;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_ReadOnly;
    	
		
	public ShareOptionsDataContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
		super();
		setAdapter(adapter);
    			adapter.initContainer(this);
	}

			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Name() {
    		if (ic_Name == null)
    		{
				String label = getAdapter().getBundle().getString("ShareOptionsDataContainer.Name");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_Name = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_Name;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Available() {
    		if (ic_Available == null)
    		{
				String label = getAdapter().getBundle().getString("ShareOptionsDataContainer.Available");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_Available = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_Available;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Comment() {
    		if (ic_Comment == null)
    		{
				String label = getAdapter().getBundle().getString("ShareOptionsDataContainer.Comment");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_Comment = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_Comment;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Path() {
    		if (ic_Path == null)
    		{
				String label = getAdapter().getBundle().getString("ShareOptionsDataContainer.Path");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_Path = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_Path;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Browsable() {
    		if (ic_Browsable == null)
    		{
				String label = getAdapter().getBundle().getString("ShareOptionsDataContainer.Browsable");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_Browsable = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_Browsable;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_GuestOK() {
    		if (ic_GuestOK == null)
    		{
				String label = getAdapter().getBundle().getString("ShareOptionsDataContainer.GuestOK");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_GuestOK = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_GuestOK;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_GuestOnly() {
    		if (ic_GuestOnly == null)
    		{
				String label = getAdapter().getBundle().getString("ShareOptionsDataContainer.GuestOnly");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_GuestOnly = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_GuestOnly;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_HostsAllow() {
    		if (ic_HostsAllow == null)
    		{
				String label = getAdapter().getBundle().getString("ShareOptionsDataContainer.HostsAllow");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_HostsAllow = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_HostsAllow;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_HostsDeny() {
    		if (ic_HostsDeny == null)
    		{
				String label = getAdapter().getBundle().getString("ShareOptionsDataContainer.HostsDeny");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_HostsDeny = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_HostsDeny;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_ReadOnly() {
    		if (ic_ReadOnly == null)
    		{
				String label = getAdapter().getBundle().getString("ShareOptionsDataContainer.ReadOnly");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_ReadOnly = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_ReadOnly;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("ShareOptionsDataContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_Name().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_Name()).getValue();
        				printStream.println(get_Name().getLabelText() + ": " + value);
   			}
   			   			   			if (get_Available().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_Available()).getValue();
        				printStream.println(get_Available().getLabelText() + ": " + value);
   			}
   			   			   			if (get_Comment().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_Comment()).getValue();
        				printStream.println(get_Comment().getLabelText() + ": " + value);
   			}
   			   			   			if (get_Path().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_Path()).getValue();
        				printStream.println(get_Path().getLabelText() + ": " + value);
   			}
   			   			   			if (get_Browsable().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_Browsable()).getValue();
        				printStream.println(get_Browsable().getLabelText() + ": " + value);
   			}
   			   			   			if (get_GuestOK().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_GuestOK()).getValue();
        				printStream.println(get_GuestOK().getLabelText() + ": " + value);
   			}
   			   			   			if (get_GuestOnly().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_GuestOnly()).getValue();
        				printStream.println(get_GuestOnly().getLabelText() + ": " + value);
   			}
   			   			   			if (get_HostsAllow().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_HostsAllow()).getValue();
        				printStream.println(get_HostsAllow().getLabelText() + ": " + value);
   			}
   			   			   			if (get_HostsDeny().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_HostsDeny()).getValue();
        				printStream.println(get_HostsDeny().getLabelText() + ": " + value);
   			}
   			   			   			if (get_ReadOnly().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_ReadOnly()).getValue();
        				printStream.println(get_ReadOnly().getLabelText() + ": " + value);
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
    				fields.add(get_Name());
    				fields.add(get_Available());
    				fields.add(get_Comment());
    				fields.add(get_Path());
    				fields.add(get_Browsable());
    				fields.add(get_GuestOK());
    				fields.add(get_GuestOnly());
    				fields.add(get_HostsAllow());
    				fields.add(get_HostsDeny());
    				fields.add(get_ReadOnly());
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
	    		       ShareOptionsDataContainerImpl source = (ShareOptionsDataContainerImpl)sourceContainer;
		    		    
    	    		   get_Name().copyFrom(source.get_Name());
		        		   get_Available().copyFrom(source.get_Available());
		        		   get_Comment().copyFrom(source.get_Comment());
		        		   get_Path().copyFrom(source.get_Path());
		        		   get_Browsable().copyFrom(source.get_Browsable());
		        		   get_GuestOK().copyFrom(source.get_GuestOK());
		        		   get_GuestOnly().copyFrom(source.get_GuestOnly());
		        		   get_HostsAllow().copyFrom(source.get_HostsAllow());
		        		   get_HostsDeny().copyFrom(source.get_HostsDeny());
		        		   get_ReadOnly().copyFrom(source.get_ReadOnly());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}