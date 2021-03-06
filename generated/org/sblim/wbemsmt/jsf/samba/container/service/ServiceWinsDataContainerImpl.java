/** 
  * ServiceWinsDataContainerImpl.java
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
  * Description: Container for WINS Options
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.service;

import org.sblim.wbemsmt.exception.*;
import java.util.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;




import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class ServiceWinsDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.service.ServiceWinsDataContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DNS_Proxy;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_WINSHook;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_WINSProxy;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_WINSServer;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_WINSSupport;

    	
		
	
	public ServiceWinsDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "ServiceWinsDataContainer.caption",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_DNS_Proxy());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_WINSHook());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_WINSProxy());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_WINSServer());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_WINSSupport());
        					
		setFooter(getPanelForCustomLayout(),"ServiceWinsDataContainer.footerText");
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
				String binding = expressionPrefix + "_DNS_Proxy.item";
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
				String binding = expressionPrefix + "_WINSHook.item";
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
				String binding = expressionPrefix + "_WINSProxy.item";
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
				String binding = expressionPrefix + "_WINSServer.item";
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
				String binding = expressionPrefix + "_WINSSupport.item";
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
    				fields.add(get_DNS_Proxy());
    				fields.add(get_WINSHook());
    				fields.add(get_WINSProxy());
    				fields.add(get_WINSServer());
    				fields.add(get_WINSSupport());
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
	    		       ServiceWinsDataContainerImpl source = (ServiceWinsDataContainerImpl)sourceContainer;
		    		    
    	    		   get_DNS_Proxy().copyFrom(source.get_DNS_Proxy());
		        		   get_WINSHook().copyFrom(source.get_WINSHook());
		        		   get_WINSProxy().copyFrom(source.get_WINSProxy());
		        		   get_WINSServer().copyFrom(source.get_WINSServer());
		        		   get_WINSSupport().copyFrom(source.get_WINSSupport());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}