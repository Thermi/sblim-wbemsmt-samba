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
  * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
  * @template: ./tools-dcg/templates/cmd/containerImpl.vm
  *
  * Contributors: 
  * 
  * Description: Container to Scripting Options
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.container.service;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
//import org.sblim.wbemsmt.tools.converter.*;
//import org.sblim.wbemsmt.tools.converter.test.*;
//import org.sblim.wbemsmt.tools.input.*;
//import org.sblim.wbemsmt.tools.input.test.*;
import org.sblim.wbemsmt.tools.resources.*;
import org.sblim.wbemsmt.exception.*;

public class ServiceScriptingDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.service.ServiceScriptingDataContainer {

	protected static WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(new String[]{"messages","messagesSamba"},Locale.getDefault());

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_AddGroupScript;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_AddPrinterCommand;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_AddShareCommand;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_AddUserScript;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_AddUsertoGroupScript;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DeleteGroupScript;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DeleteUserScript;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DeleteUserfromGroupScript;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SetPrimaryGroupScript;
    	
		
	public ServiceScriptingDataContainerImpl(AbstractBaseCimAdapter adapter) throws InitContainerException {
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_AddGroupScript() {
    		if (ic_AddGroupScript == null)
    		{
				String label = bundle.getString("ServiceScriptingDataContainer.AddGroupScript");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_AddGroupScript = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_AddPrinterCommand = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_AddShareCommand = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_AddUserScript = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_AddUsertoGroupScript = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_DeleteGroupScript = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_DeleteUserScript = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_DeleteUserfromGroupScript = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_SetPrimaryGroupScript = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_SetPrimaryGroupScript;
    	}
		
	
		
	public void trace(java.io.PrintStream printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(bundle.getString("ServiceScriptingDataContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
						if (get_AddGroupScript().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_AddGroupScript()).getValue();
				printStream.println(get_AddGroupScript().getLabelText() + ": " + value);
			}
						if (get_AddPrinterCommand().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_AddPrinterCommand()).getValue();
				printStream.println(get_AddPrinterCommand().getLabelText() + ": " + value);
			}
						if (get_AddShareCommand().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_AddShareCommand()).getValue();
				printStream.println(get_AddShareCommand().getLabelText() + ": " + value);
			}
						if (get_AddUserScript().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_AddUserScript()).getValue();
				printStream.println(get_AddUserScript().getLabelText() + ": " + value);
			}
						if (get_AddUsertoGroupScript().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_AddUsertoGroupScript()).getValue();
				printStream.println(get_AddUsertoGroupScript().getLabelText() + ": " + value);
			}
						if (get_DeleteGroupScript().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_DeleteGroupScript()).getValue();
				printStream.println(get_DeleteGroupScript().getLabelText() + ": " + value);
			}
						if (get_DeleteUserScript().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_DeleteUserScript()).getValue();
				printStream.println(get_DeleteUserScript().getLabelText() + ": " + value);
			}
						if (get_DeleteUserfromGroupScript().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_DeleteUserfromGroupScript()).getValue();
				printStream.println(get_DeleteUserfromGroupScript().getLabelText() + ": " + value);
			}
						if (get_SetPrimaryGroupScript().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_SetPrimaryGroupScript()).getValue();
				printStream.println(get_SetPrimaryGroupScript().getLabelText() + ": " + value);
			}
					}

		if (showChilds(listOptions))
		{
			traceChilds(printStream,listOptions,title);
		}
	}
	
	public void traceChilds(java.io.PrintStream printStream, String listOptions, boolean title)
	{
    			
			
	}
	
}