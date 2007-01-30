/** 
  * ServiceGlobalSecurityOptionsDataContainerImpl.java
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
  * Description: Container for defining Security Options
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



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;


public class ServiceGlobalSecurityOptionsDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.service.ServiceGlobalSecurityOptionsDataContainer {

	protected static WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(new String[]{"messages","messagesSamba"},Locale.getDefault());

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_AuthMethods;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_EncryptPasswords;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_MinPasswordLength;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_NullPasswords;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_PassdbBackend;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SMBPasswdFile;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_Security;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_GuestOK;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_GuestOnly;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_HostsAllow;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_HostsDeny;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_ReadOnly;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_DomainMaster;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Browsable;
    	
		
	public ServiceGlobalSecurityOptionsDataContainerImpl(AbstractBaseCimAdapter adapter) throws InitContainerException {
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_AuthMethods() {
    		if (ic_AuthMethods == null)
    		{
				String label = bundle.getString("ServiceGlobalSecurityOptionsDataContainer.AuthMethods");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_AuthMethods = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_AuthMethods;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_EncryptPasswords() {
    		if (ic_EncryptPasswords == null)
    		{
				String label = bundle.getString("ServiceGlobalSecurityOptionsDataContainer.EncryptPasswords");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_EncryptPasswords = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_EncryptPasswords;
    	}
			/**
		* 
		* DataType UNSIGNED_INT8
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_MinPasswordLength() {
    		if (ic_MinPasswordLength == null)
    		{
				String label = bundle.getString("ServiceGlobalSecurityOptionsDataContainer.MinPasswordLength");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt8StringConverter();
    			ic_MinPasswordLength = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_MinPasswordLength;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_NullPasswords() {
    		if (ic_NullPasswords == null)
    		{
				String label = bundle.getString("ServiceGlobalSecurityOptionsDataContainer.NullPasswords");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_NullPasswords = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_NullPasswords;
    	}
			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType COMBOBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_PassdbBackend() {
    		if (ic_usr_PassdbBackend == null)
    		{
				String label = bundle.getString("ServiceGlobalSecurityOptionsDataContainer.PassdbBackend");
				org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
    			ic_usr_PassdbBackend = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(this,label,"",converter);
    		}
    		return ic_usr_PassdbBackend;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SMBPasswdFile() {
    		if (ic_SMBPasswdFile == null)
    		{
				String label = bundle.getString("ServiceGlobalSecurityOptionsDataContainer.SMBPasswdFile");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_SMBPasswdFile = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_SMBPasswdFile;
    	}
			/**
		* 
		* DataType UNSIGNED_INT8
		* UIType COMBOBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_Security() {
    		if (ic_Security == null)
    		{
				String label = bundle.getString("ServiceGlobalSecurityOptionsDataContainer.Security");
				org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt8StringArrayConverter();
    			ic_Security = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(this,label,"",converter);
    		}
    		return ic_Security;
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
				String label = bundle.getString("ServiceGlobalSecurityOptionsDataContainer.GuestOK");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_GuestOK = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = bundle.getString("ServiceGlobalSecurityOptionsDataContainer.GuestOnly");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_GuestOnly = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = bundle.getString("ServiceGlobalSecurityOptionsDataContainer.HostsAllow");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_HostsAllow = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = bundle.getString("ServiceGlobalSecurityOptionsDataContainer.HostsDeny");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_HostsDeny = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = bundle.getString("ServiceGlobalSecurityOptionsDataContainer.ReadOnly");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_ReadOnly = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_ReadOnly;
    	}
			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType COMBOBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_DomainMaster() {
    		if (ic_DomainMaster == null)
    		{
				String label = bundle.getString("ServiceGlobalSecurityOptionsDataContainer.DomainMaster");
				org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
    			ic_DomainMaster = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(this,label,"",converter);
    		}
    		return ic_DomainMaster;
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
				String label = bundle.getString("ServiceGlobalSecurityOptionsDataContainer.Browsable");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_Browsable = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_Browsable;
    	}
		
	
		
	public void trace(java.io.PrintStream printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(bundle.getString("ServiceGlobalSecurityOptionsDataContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
						if (get_AuthMethods().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_AuthMethods()).getValue();
				printStream.println(get_AuthMethods().getLabelText() + ": " + value);
			}
						if (get_EncryptPasswords().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_EncryptPasswords()).getValue();
				printStream.println(get_EncryptPasswords().getLabelText() + ": " + value);
			}
						if (get_MinPasswordLength().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_MinPasswordLength()).getValue();
				printStream.println(get_MinPasswordLength().getLabelText() + ": " + value);
			}
						if (get_NullPasswords().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_NullPasswords()).getValue();
				printStream.println(get_NullPasswords().getLabelText() + ": " + value);
			}
						if (get_usr_PassdbBackend().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_PassdbBackend()).getValue();
				printStream.println(get_usr_PassdbBackend().getLabelText() + ": " + value);
			}
						if (get_SMBPasswdFile().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_SMBPasswdFile()).getValue();
				printStream.println(get_SMBPasswdFile().getLabelText() + ": " + value);
			}
						if (get_Security().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_Security()).getValue();
				printStream.println(get_Security().getLabelText() + ": " + value);
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
						if (get_DomainMaster().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_DomainMaster()).getValue();
				printStream.println(get_DomainMaster().getLabelText() + ": " + value);
			}
						if (get_Browsable().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_Browsable()).getValue();
				printStream.println(get_Browsable().getLabelText() + ": " + value);
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
	
	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List getFields()
	{
		List fields = new ArrayList();
    				fields.add(get_AuthMethods());
    				fields.add(get_EncryptPasswords());
    				fields.add(get_MinPasswordLength());
    				fields.add(get_NullPasswords());
    				fields.add(get_usr_PassdbBackend());
    				fields.add(get_SMBPasswdFile());
    				fields.add(get_Security());
    				fields.add(get_GuestOK());
    				fields.add(get_GuestOnly());
    				fields.add(get_HostsAllow());
    				fields.add(get_HostsDeny());
    				fields.add(get_ReadOnly());
    				fields.add(get_DomainMaster());
    				fields.add(get_Browsable());
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List getChildContainers()
	{
		List childs = new ArrayList();
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer)
	{
		ServiceGlobalSecurityOptionsDataContainerImpl source = (ServiceGlobalSecurityOptionsDataContainerImpl)sourceContainer;
	
    	    		get_AuthMethods().setValue(source.get_AuthMethods().getValue());
		    		get_EncryptPasswords().setValue(source.get_EncryptPasswords().getValue());
		    		get_MinPasswordLength().setValue(source.get_MinPasswordLength().getValue());
		    		get_NullPasswords().setValue(source.get_NullPasswords().getValue());
		    		get_usr_PassdbBackend().setValue(source.get_usr_PassdbBackend().getValue());
		    		get_SMBPasswdFile().setValue(source.get_SMBPasswdFile().getValue());
		    		get_Security().setValue(source.get_Security().getValue());
		    		get_GuestOK().setValue(source.get_GuestOK().getValue());
		    		get_GuestOnly().setValue(source.get_GuestOnly().getValue());
		    		get_HostsAllow().setValue(source.get_HostsAllow().getValue());
		    		get_HostsDeny().setValue(source.get_HostsDeny().getValue());
		    		get_ReadOnly().setValue(source.get_ReadOnly().getValue());
		    		get_DomainMaster().setValue(source.get_DomainMaster().getValue());
		    		get_Browsable().setValue(source.get_Browsable().getValue());
				
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}