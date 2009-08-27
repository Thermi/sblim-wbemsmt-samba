/** 
  * ServiceGlobalSecurityOptionsDataContainerImpl.java
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
  * Description: Container for defining Security Options
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.service;

import org.sblim.wbemsmt.exception.*;
import java.util.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;




import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class ServiceGlobalSecurityOptionsDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.service.ServiceGlobalSecurityOptionsDataContainer
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

    	
		
	
	public ServiceGlobalSecurityOptionsDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "ServiceGlobalSecurityOptionsDataContainer.caption",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_AuthMethods());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_EncryptPasswords());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_MinPasswordLength());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_NullPasswords());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_PassdbBackend());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_SMBPasswdFile());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_Security());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_GuestOK());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_GuestOnly());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_HostsAllow());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_HostsDeny());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_ReadOnly());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_DomainMaster());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_Browsable());
        					
		setFooter(getPanelForCustomLayout(),"ServiceGlobalSecurityOptionsDataContainer.footerText");
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
				String binding = expressionPrefix + "_AuthMethods.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_AuthMethods = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
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
				String binding = expressionPrefix + "_EncryptPasswords.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_EncryptPasswords = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
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
				String binding = expressionPrefix + "_MinPasswordLength.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt8StringConverter();
				boolean readOnly = false;
    			ic_MinPasswordLength = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
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
				String binding = expressionPrefix + "_NullPasswords.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_NullPasswords = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
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
				String binding = expressionPrefix + "_usr_PassdbBackend.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_usr_PassdbBackend = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFComboBoxComponent(parent,label,binding,converter, readOnly);
				;
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
				String binding = expressionPrefix + "_SMBPasswdFile.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_SMBPasswdFile = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
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
				String binding = expressionPrefix + "_Security.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt8StringConverter();
				boolean readOnly = false;
    			ic_Security = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFComboBoxComponent(parent,label,binding,converter, readOnly);
				;
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
				String binding = expressionPrefix + "_GuestOK.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_GuestOK = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
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
				String binding = expressionPrefix + "_GuestOnly.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_GuestOnly = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
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
				String binding = expressionPrefix + "_HostsAllow.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_HostsAllow = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
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
				String binding = expressionPrefix + "_HostsDeny.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_HostsDeny = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
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
				String binding = expressionPrefix + "_ReadOnly.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_ReadOnly = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
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
				String binding = expressionPrefix + "_DomainMaster.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_DomainMaster = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFComboBoxComponent(parent,label,binding,converter, readOnly);
				;
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
				String binding = expressionPrefix + "_Browsable.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_Browsable = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_Browsable;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_AuthMethods != null)
    		{
				ic_AuthMethods.setLabelText(bundle.getString("ServiceGlobalSecurityOptionsDataContainer.AuthMethods"));
    		}
	    		if (ic_EncryptPasswords != null)
    		{
				ic_EncryptPasswords.setLabelText(bundle.getString("ServiceGlobalSecurityOptionsDataContainer.EncryptPasswords"));
    		}
	    		if (ic_MinPasswordLength != null)
    		{
				ic_MinPasswordLength.setLabelText(bundle.getString("ServiceGlobalSecurityOptionsDataContainer.MinPasswordLength"));
    		}
	    		if (ic_NullPasswords != null)
    		{
				ic_NullPasswords.setLabelText(bundle.getString("ServiceGlobalSecurityOptionsDataContainer.NullPasswords"));
    		}
	    		if (ic_usr_PassdbBackend != null)
    		{
				ic_usr_PassdbBackend.setLabelText(bundle.getString("ServiceGlobalSecurityOptionsDataContainer.PassdbBackend"));
    		}
	    		if (ic_SMBPasswdFile != null)
    		{
				ic_SMBPasswdFile.setLabelText(bundle.getString("ServiceGlobalSecurityOptionsDataContainer.SMBPasswdFile"));
    		}
	    		if (ic_Security != null)
    		{
				ic_Security.setLabelText(bundle.getString("ServiceGlobalSecurityOptionsDataContainer.Security"));
    		}
	    		if (ic_GuestOK != null)
    		{
				ic_GuestOK.setLabelText(bundle.getString("ServiceGlobalSecurityOptionsDataContainer.GuestOK"));
    		}
	    		if (ic_GuestOnly != null)
    		{
				ic_GuestOnly.setLabelText(bundle.getString("ServiceGlobalSecurityOptionsDataContainer.GuestOnly"));
    		}
	    		if (ic_HostsAllow != null)
    		{
				ic_HostsAllow.setLabelText(bundle.getString("ServiceGlobalSecurityOptionsDataContainer.HostsAllow"));
    		}
	    		if (ic_HostsDeny != null)
    		{
				ic_HostsDeny.setLabelText(bundle.getString("ServiceGlobalSecurityOptionsDataContainer.HostsDeny"));
    		}
	    		if (ic_ReadOnly != null)
    		{
				ic_ReadOnly.setLabelText(bundle.getString("ServiceGlobalSecurityOptionsDataContainer.ReadOnly"));
    		}
	    		if (ic_DomainMaster != null)
    		{
				ic_DomainMaster.setLabelText(bundle.getString("ServiceGlobalSecurityOptionsDataContainer.DomainMaster"));
    		}
	    		if (ic_Browsable != null)
    		{
				ic_Browsable.setLabelText(bundle.getString("ServiceGlobalSecurityOptionsDataContainer.Browsable"));
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