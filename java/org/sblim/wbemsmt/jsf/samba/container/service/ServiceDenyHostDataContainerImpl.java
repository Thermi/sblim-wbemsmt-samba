/** 
  * ServiceDenyHostDataContainerImpl.java
  *

 
  * © Copyright IBM Corp. 2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE COMMON PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Common Public License from
  * http://www.opensource.org/licenses/cpl1.0.php
  *
  * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/jsf/containerImpl.vm
  *
  * Contributors: 
  * 
  * Description: Container to define DenyHosts
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.service;

import org.sblim.wbemsmt.exception.*;
import java.util.*;




import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class ServiceDenyHostDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.service.ServiceDenyHostDataContainer {

			private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_DeniedHosts;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_HostsToDeny;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_AddHost;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_RemoveHost;
    	
		
	
	public ServiceDenyHostDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {

			
				super(adapter,bindingPrefix, "ServiceDenyHostDataContainer.caption",false);
				
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_DeniedHosts());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_HostsToDeny());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_AddHost());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_RemoveHost());
        					
		setFooter(getPanelForCustomLayout(),"ServiceDenyHostDataContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType LIST
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_DeniedHosts() {
    		if (ic_usr_DeniedHosts == null)
    		{
				String label = bundle.getString("ServiceDenyHostDataContainer.deniedHosts");
				String binding = bindingPrefix + "_usr_DeniedHosts.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_usr_DeniedHosts = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFListComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_DeniedHosts;
    	}
			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType LIST
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_HostsToDeny() {
    		if (ic_usr_HostsToDeny == null)
    		{
				String label = bundle.getString("ServiceDenyHostDataContainer.hostsToDeny");
				String binding = bindingPrefix + "_usr_HostsToDeny.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_usr_HostsToDeny = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFListComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_HostsToDeny;
    	}
			/**
		* 
		* DataType ACTION
		* UIType BUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_AddHost() {
    		if (ic_usr_AddHost == null)
    		{
				String label = bundle.getString("ServiceDenyHostDataContainer.addHost");
				String binding = bindingPrefix + "_usr_AddHost.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_AddHost = new org.sblim.wbemsmt.tools.input.jsf.JSFButtonComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_AddHost;
    	}
			/**
		* 
		* DataType ACTION
		* UIType BUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_RemoveHost() {
    		if (ic_usr_RemoveHost == null)
    		{
				String label = bundle.getString("ServiceDenyHostDataContainer.removeHost");
				String binding = bindingPrefix + "_usr_RemoveHost.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_RemoveHost = new org.sblim.wbemsmt.tools.input.jsf.JSFButtonComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_RemoveHost;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_DeniedHosts != null)
    		{
				ic_usr_DeniedHosts.setLabelText(bundle.getString("ServiceDenyHostDataContainer.deniedHosts"));
    		}
	    		if (ic_usr_HostsToDeny != null)
    		{
				ic_usr_HostsToDeny.setLabelText(bundle.getString("ServiceDenyHostDataContainer.hostsToDeny"));
    		}
	    		if (ic_usr_AddHost != null)
    		{
				ic_usr_AddHost.setLabelText(bundle.getString("ServiceDenyHostDataContainer.addHost"));
    		}
	    		if (ic_usr_RemoveHost != null)
    		{
				ic_usr_RemoveHost.setLabelText(bundle.getString("ServiceDenyHostDataContainer.removeHost"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesSamba"};
	}

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List getFields()
	{
		List fields = new ArrayList();
    				fields.add(get_usr_DeniedHosts());
    				fields.add(get_usr_HostsToDeny());
    				fields.add(get_usr_AddHost());
    				fields.add(get_usr_RemoveHost());
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
		ServiceDenyHostDataContainerImpl source = (ServiceDenyHostDataContainerImpl)sourceContainer;
	
    	    		get_usr_DeniedHosts().setValue(source.get_usr_DeniedHosts().getValue());
		    		get_usr_HostsToDeny().setValue(source.get_usr_HostsToDeny().getValue());
		    		get_usr_AddHost().setValue(source.get_usr_AddHost().getValue());
		    		get_usr_RemoveHost().setValue(source.get_usr_RemoveHost().getValue());
				
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}