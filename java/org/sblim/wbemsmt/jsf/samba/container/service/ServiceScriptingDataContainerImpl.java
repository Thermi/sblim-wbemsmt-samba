/** 
  * ServiceScriptingDataContainerImpl.java
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
  * Description: Container to Scripting Options
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.service;

import org.sblim.wbemsmt.exception.*;

public class ServiceScriptingDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.service.ServiceScriptingDataContainer {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_AddGroupScript;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_AddPrinterCommand;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_AddShareCommand;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_AddUserScript;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_AddUsertoGroupScript;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DeleteGroupScript;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DeleteUserScript;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DeleteUserfromGroupScript;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SetPrimaryGroupScript;
    	
		
	
	public ServiceScriptingDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {

				super(adapter,bindingPrefix, "ServiceScriptingDataContainer.caption");
				
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_AddGroupScript());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_AddPrinterCommand());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_AddShareCommand());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_AddUserScript());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_AddUsertoGroupScript());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_DeleteGroupScript());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_DeleteUserScript());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_DeleteUserfromGroupScript());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_SetPrimaryGroupScript());
        					
		setFooter(getInputFieldContainer(),"ServiceScriptingDataContainer.footerText");
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
				String binding = bindingPrefix + "_AddGroupScript.item";
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
				String binding = bindingPrefix + "_AddPrinterCommand.item";
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
				String binding = bindingPrefix + "_AddShareCommand.item";
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
				String binding = bindingPrefix + "_AddUserScript.item";
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
				String binding = bindingPrefix + "_AddUsertoGroupScript.item";
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
				String binding = bindingPrefix + "_DeleteGroupScript.item";
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
				String binding = bindingPrefix + "_DeleteUserScript.item";
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
				String binding = bindingPrefix + "_DeleteUserfromGroupScript.item";
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
				String binding = bindingPrefix + "_SetPrimaryGroupScript.item";
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

	
}