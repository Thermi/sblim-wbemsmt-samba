/** 
  * ServiceWinsDataContainerImpl.java
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
  * Description: Container for WINS Options
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.service;

import org.sblim.wbemsmt.exception.*;

public class ServiceWinsDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.service.ServiceWinsDataContainer {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DNS_Proxy;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_WINSHook;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_WINSProxy;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_WINSServer;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_WINSSupport;
    	
		
	
	public ServiceWinsDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {

				super(adapter,bindingPrefix, "ServiceWinsDataContainer.caption");
				
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_DNS_Proxy());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_WINSHook());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_WINSProxy());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_WINSServer());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_WINSSupport());
        					
		setFooter(getInputFieldContainer(),"ServiceWinsDataContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DNS_Proxy() {
    		if (ic_DNS_Proxy == null)
    		{
				String label = bundle.getString("ServiceWinsDataContainer.DNS_Proxy");
				String binding = bindingPrefix + "_DNS_Proxy.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_DNS_Proxy = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
    		return ic_DNS_Proxy;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_WINSHook() {
    		if (ic_WINSHook == null)
    		{
				String label = bundle.getString("ServiceWinsDataContainer.WINSHook");
				String binding = bindingPrefix + "_WINSHook.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_WINSHook = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
    		return ic_WINSHook;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_WINSProxy() {
    		if (ic_WINSProxy == null)
    		{
				String label = bundle.getString("ServiceWinsDataContainer.WINSProxy");
				String binding = bindingPrefix + "_WINSProxy.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_WINSProxy = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
    		return ic_WINSProxy;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_WINSServer() {
    		if (ic_WINSServer == null)
    		{
				String label = bundle.getString("ServiceWinsDataContainer.WINSServer");
				String binding = bindingPrefix + "_WINSServer.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_WINSServer = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
    		return ic_WINSServer;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_WINSSupport() {
    		if (ic_WINSSupport == null)
    		{
				String label = bundle.getString("ServiceWinsDataContainer.WINSSupport");
				String binding = bindingPrefix + "_WINSSupport.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_WINSSupport = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
    		return ic_WINSSupport;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_DNS_Proxy != null)
    		{
				ic_DNS_Proxy.setLabelText(bundle.getString("ServiceWinsDataContainer.DNS_Proxy"));
    		}
	    		if (ic_WINSHook != null)
    		{
				ic_WINSHook.setLabelText(bundle.getString("ServiceWinsDataContainer.WINSHook"));
    		}
	    		if (ic_WINSProxy != null)
    		{
				ic_WINSProxy.setLabelText(bundle.getString("ServiceWinsDataContainer.WINSProxy"));
    		}
	    		if (ic_WINSServer != null)
    		{
				ic_WINSServer.setLabelText(bundle.getString("ServiceWinsDataContainer.WINSServer"));
    		}
	    		if (ic_WINSSupport != null)
    		{
				ic_WINSSupport.setLabelText(bundle.getString("ServiceWinsDataContainer.WINSSupport"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesSamba"};
	}

	
}