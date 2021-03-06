/** 
  * ServiceScriptingDataContainerImpl.java
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
  * Description: Container to Scripting Options
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.service;

import org.sblim.wbemsmt.exception.*;
import java.util.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;




import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class ServiceScriptingDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.service.ServiceScriptingDataContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_AddGroupScript;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_AddPrinterCommand;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_AddShareCommand;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_AddUserScript;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_AddUsertoGroupScript;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DeleteGroupScript;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DeleteUserScript;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DeleteUserfromGroupScript;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SetPrimaryGroupScript;

    	
		
	
	public ServiceScriptingDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "ServiceScriptingDataContainer.caption",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_AddGroupScript());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_AddPrinterCommand());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_AddShareCommand());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_AddUserScript());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_AddUsertoGroupScript());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_DeleteGroupScript());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_DeleteUserScript());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_DeleteUserfromGroupScript());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_SetPrimaryGroupScript());
        					
		setFooter(getPanelForCustomLayout(),"ServiceScriptingDataContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_AddGroupScript() {
    		if (ic_AddGroupScript == null)
    		{
				String label = bundle.getString("ServiceScriptingDataContainer.AddGroupScript");
				String binding = expressionPrefix + "_AddGroupScript.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_AddGroupScript = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_AddGroupScript;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_AddPrinterCommand() {
    		if (ic_AddPrinterCommand == null)
    		{
				String label = bundle.getString("ServiceScriptingDataContainer.AddPrinterCommand");
				String binding = expressionPrefix + "_AddPrinterCommand.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_AddPrinterCommand = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_AddPrinterCommand;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_AddShareCommand() {
    		if (ic_AddShareCommand == null)
    		{
				String label = bundle.getString("ServiceScriptingDataContainer.AddShareCommand");
				String binding = expressionPrefix + "_AddShareCommand.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_AddShareCommand = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_AddShareCommand;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_AddUserScript() {
    		if (ic_AddUserScript == null)
    		{
				String label = bundle.getString("ServiceScriptingDataContainer.AddUserScript");
				String binding = expressionPrefix + "_AddUserScript.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_AddUserScript = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_AddUserScript;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_AddUsertoGroupScript() {
    		if (ic_AddUsertoGroupScript == null)
    		{
				String label = bundle.getString("ServiceScriptingDataContainer.AddUsertoGroupScript");
				String binding = expressionPrefix + "_AddUsertoGroupScript.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_AddUsertoGroupScript = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_AddUsertoGroupScript;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DeleteGroupScript() {
    		if (ic_DeleteGroupScript == null)
    		{
				String label = bundle.getString("ServiceScriptingDataContainer.DeleteGroupScript");
				String binding = expressionPrefix + "_DeleteGroupScript.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_DeleteGroupScript = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_DeleteGroupScript;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DeleteUserScript() {
    		if (ic_DeleteUserScript == null)
    		{
				String label = bundle.getString("ServiceScriptingDataContainer.DeleteUserScript");
				String binding = expressionPrefix + "_DeleteUserScript.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_DeleteUserScript = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_DeleteUserScript;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DeleteUserfromGroupScript() {
    		if (ic_DeleteUserfromGroupScript == null)
    		{
				String label = bundle.getString("ServiceScriptingDataContainer.DeleteUserfromGroupScript");
				String binding = expressionPrefix + "_DeleteUserfromGroupScript.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_DeleteUserfromGroupScript = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_DeleteUserfromGroupScript;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SetPrimaryGroupScript() {
    		if (ic_SetPrimaryGroupScript == null)
    		{
				String label = bundle.getString("ServiceScriptingDataContainer.SetPrimaryGroupScript");
				String binding = expressionPrefix + "_SetPrimaryGroupScript.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_SetPrimaryGroupScript = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_SetPrimaryGroupScript;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_AddGroupScript != null)
    		{
				ic_AddGroupScript.setLabelText(bundle.getString("ServiceScriptingDataContainer.AddGroupScript"));
    		}
	    		if (ic_AddPrinterCommand != null)
    		{
				ic_AddPrinterCommand.setLabelText(bundle.getString("ServiceScriptingDataContainer.AddPrinterCommand"));
    		}
	    		if (ic_AddShareCommand != null)
    		{
				ic_AddShareCommand.setLabelText(bundle.getString("ServiceScriptingDataContainer.AddShareCommand"));
    		}
	    		if (ic_AddUserScript != null)
    		{
				ic_AddUserScript.setLabelText(bundle.getString("ServiceScriptingDataContainer.AddUserScript"));
    		}
	    		if (ic_AddUsertoGroupScript != null)
    		{
				ic_AddUsertoGroupScript.setLabelText(bundle.getString("ServiceScriptingDataContainer.AddUsertoGroupScript"));
    		}
	    		if (ic_DeleteGroupScript != null)
    		{
				ic_DeleteGroupScript.setLabelText(bundle.getString("ServiceScriptingDataContainer.DeleteGroupScript"));
    		}
	    		if (ic_DeleteUserScript != null)
    		{
				ic_DeleteUserScript.setLabelText(bundle.getString("ServiceScriptingDataContainer.DeleteUserScript"));
    		}
	    		if (ic_DeleteUserfromGroupScript != null)
    		{
				ic_DeleteUserfromGroupScript.setLabelText(bundle.getString("ServiceScriptingDataContainer.DeleteUserfromGroupScript"));
    		}
	    		if (ic_SetPrimaryGroupScript != null)
    		{
				ic_SetPrimaryGroupScript.setLabelText(bundle.getString("ServiceScriptingDataContainer.SetPrimaryGroupScript"));
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
    				fields.add(get_AddGroupScript());
    				fields.add(get_AddPrinterCommand());
    				fields.add(get_AddShareCommand());
    				fields.add(get_AddUserScript());
    				fields.add(get_AddUsertoGroupScript());
    				fields.add(get_DeleteGroupScript());
    				fields.add(get_DeleteUserScript());
    				fields.add(get_DeleteUserfromGroupScript());
    				fields.add(get_SetPrimaryGroupScript());
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
	    		       ServiceScriptingDataContainerImpl source = (ServiceScriptingDataContainerImpl)sourceContainer;
		    		    
    	    		   get_AddGroupScript().copyFrom(source.get_AddGroupScript());
		        		   get_AddPrinterCommand().copyFrom(source.get_AddPrinterCommand());
		        		   get_AddShareCommand().copyFrom(source.get_AddShareCommand());
		        		   get_AddUserScript().copyFrom(source.get_AddUserScript());
		        		   get_AddUsertoGroupScript().copyFrom(source.get_AddUsertoGroupScript());
		        		   get_DeleteGroupScript().copyFrom(source.get_DeleteGroupScript());
		        		   get_DeleteUserScript().copyFrom(source.get_DeleteUserScript());
		        		   get_DeleteUserfromGroupScript().copyFrom(source.get_DeleteUserfromGroupScript());
		        		   get_SetPrimaryGroupScript().copyFrom(source.get_SetPrimaryGroupScript());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}