/** 
  * ServiceOptionsDataContainerImpl.java
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
  * Description: Container for Setting Options on the Samba Service
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.service;

import org.sblim.wbemsmt.exception.*;

public class ServiceOptionsDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.service.ServiceOptionsDataContainer {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_BindInterfacesOnly;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Interfaces;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_NetbiosAlias;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_NetbiosName;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_ServerString;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Workgroup;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_ConfigurationFile;
    	
		
	
	public ServiceOptionsDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {
		super(adapter,bindingPrefix, "ServiceOptionsDataContainer.caption");
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_BindInterfacesOnly());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_Interfaces());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_NetbiosAlias());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_NetbiosName());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_ServerString());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_Workgroup());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_ConfigurationFile());
        					
		setFooter(getInputFieldContainer(),"ServiceOptionsDataContainer.footerText");
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
				String label = bundle.getString("ServiceOptionsDataContainer.BindInterfacesOnly");
				String binding = bindingPrefix + "_BindInterfacesOnly.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_BindInterfacesOnly = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String label = bundle.getString("ServiceOptionsDataContainer.Interfaces");
				String binding = bindingPrefix + "_Interfaces.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_Interfaces = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
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
				String label = bundle.getString("ServiceOptionsDataContainer.NetbiosAlias");
				String binding = bindingPrefix + "_NetbiosAlias.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_NetbiosAlias = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
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
				String label = bundle.getString("ServiceOptionsDataContainer.NetbiosName");
				String binding = bindingPrefix + "_NetbiosName.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_NetbiosName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
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
				String label = bundle.getString("ServiceOptionsDataContainer.ServerString");
				String binding = bindingPrefix + "_ServerString.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_ServerString = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
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
				String label = bundle.getString("ServiceOptionsDataContainer.Workgroup");
				String binding = bindingPrefix + "_Workgroup.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_Workgroup = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
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
				String label = bundle.getString("ServiceOptionsDataContainer.ConfigurationFile");
				String binding = bindingPrefix + "_ConfigurationFile.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_ConfigurationFile = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
    		}
    		return ic_ConfigurationFile;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_BindInterfacesOnly != null)
    		{
				ic_BindInterfacesOnly.setLabelText(bundle.getString("ServiceOptionsDataContainer.BindInterfacesOnly"));
    		}
	    		if (ic_Interfaces != null)
    		{
				ic_Interfaces.setLabelText(bundle.getString("ServiceOptionsDataContainer.Interfaces"));
    		}
	    		if (ic_NetbiosAlias != null)
    		{
				ic_NetbiosAlias.setLabelText(bundle.getString("ServiceOptionsDataContainer.NetbiosAlias"));
    		}
	    		if (ic_NetbiosName != null)
    		{
				ic_NetbiosName.setLabelText(bundle.getString("ServiceOptionsDataContainer.NetbiosName"));
    		}
	    		if (ic_ServerString != null)
    		{
				ic_ServerString.setLabelText(bundle.getString("ServiceOptionsDataContainer.ServerString"));
    		}
	    		if (ic_Workgroup != null)
    		{
				ic_Workgroup.setLabelText(bundle.getString("ServiceOptionsDataContainer.Workgroup"));
    		}
	    		if (ic_ConfigurationFile != null)
    		{
				ic_ConfigurationFile.setLabelText(bundle.getString("ServiceOptionsDataContainer.ConfigurationFile"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesSamba"};
	}

	
}