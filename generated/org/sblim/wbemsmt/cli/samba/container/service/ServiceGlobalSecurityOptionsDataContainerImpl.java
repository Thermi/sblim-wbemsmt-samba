/** 
  * ServiceGlobalSecurityOptionsDataContainerImpl.java
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
  * Description: Container for defining Security Options
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

public class ServiceGlobalSecurityOptionsDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.service.ServiceGlobalSecurityOptionsDataContainer
	{
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
    	
		
	public ServiceGlobalSecurityOptionsDataContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
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
				String label = getAdapter().getBundle().getString("ServiceGlobalSecurityOptionsDataContainer.AuthMethods");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_AuthMethods = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("ServiceGlobalSecurityOptionsDataContainer.EncryptPasswords");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_EncryptPasswords = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("ServiceGlobalSecurityOptionsDataContainer.MinPasswordLength");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt8StringConverter();
    			ic_MinPasswordLength = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("ServiceGlobalSecurityOptionsDataContainer.NullPasswords");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_NullPasswords = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("ServiceGlobalSecurityOptionsDataContainer.PassdbBackend");
				org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
    			ic_usr_PassdbBackend = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("ServiceGlobalSecurityOptionsDataContainer.SMBPasswdFile");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_SMBPasswdFile = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("ServiceGlobalSecurityOptionsDataContainer.Security");
				org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt8StringArrayConverter();
    			ic_Security = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("ServiceGlobalSecurityOptionsDataContainer.GuestOK");
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
				String label = getAdapter().getBundle().getString("ServiceGlobalSecurityOptionsDataContainer.GuestOnly");
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
				String label = getAdapter().getBundle().getString("ServiceGlobalSecurityOptionsDataContainer.HostsAllow");
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
				String label = getAdapter().getBundle().getString("ServiceGlobalSecurityOptionsDataContainer.HostsDeny");
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
				String label = getAdapter().getBundle().getString("ServiceGlobalSecurityOptionsDataContainer.ReadOnly");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_ReadOnly = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("ServiceGlobalSecurityOptionsDataContainer.DomainMaster");
				org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
    			ic_DomainMaster = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("ServiceGlobalSecurityOptionsDataContainer.Browsable");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_Browsable = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_Browsable;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("ServiceGlobalSecurityOptionsDataContainer.caption"));
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
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       ServiceGlobalSecurityOptionsDataContainerImpl source = (ServiceGlobalSecurityOptionsDataContainerImpl)sourceContainer;
		    		    
    	    		   get_AuthMethods().copyFrom(source.get_AuthMethods());
		        		   get_EncryptPasswords().copyFrom(source.get_EncryptPasswords());
		        		   get_MinPasswordLength().copyFrom(source.get_MinPasswordLength());
		        		   get_NullPasswords().copyFrom(source.get_NullPasswords());
		        		   get_usr_PassdbBackend().copyFrom(source.get_usr_PassdbBackend());
		        		   get_SMBPasswdFile().copyFrom(source.get_SMBPasswdFile());
		        		   get_Security().copyFrom(source.get_Security());
		        		   get_GuestOK().copyFrom(source.get_GuestOK());
		        		   get_GuestOnly().copyFrom(source.get_GuestOnly());
		        		   get_HostsAllow().copyFrom(source.get_HostsAllow());
		        		   get_HostsDeny().copyFrom(source.get_HostsDeny());
		        		   get_ReadOnly().copyFrom(source.get_ReadOnly());
		        		   get_DomainMaster().copyFrom(source.get_DomainMaster());
		        		   get_Browsable().copyFrom(source.get_Browsable());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}