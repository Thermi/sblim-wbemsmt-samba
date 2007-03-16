/** 
  * PrinterAllowHostSecurityDataContainerImpl.java
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
  * @template: ./tools-dcg/templates/jsf/containerImpl.vm
  *
  * Contributors: 
  * 
  * Description: Container for AllowHosts within a printer
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.printer;

import org.sblim.wbemsmt.exception.*;
import java.util.*;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class PrinterAllowHostSecurityDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.printer.PrinterAllowHostSecurityDataContainer {

			private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_AllowedHosts;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_HostsToAllow;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_AddHost;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_RemoveHost;
    	
		
	
	public PrinterAllowHostSecurityDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {

			
				super(adapter,bindingPrefix, "PrinterAllowHostSecurityDataContainer.caption",false);
				
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_AllowedHosts());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_HostsToAllow());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_AddHost());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_RemoveHost());
        					
		setFooter(getPanelForCustomLayout(),"PrinterAllowHostSecurityDataContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType LIST
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_AllowedHosts() {
    		if (ic_usr_AllowedHosts == null)
    		{
				String label = bundle.getString("PrinterAllowHostSecurityDataContainer.allowedHosts");
				String binding = bindingPrefix + "_usr_AllowedHosts.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_usr_AllowedHosts = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFListComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_AllowedHosts;
    	}
			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType LIST
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_HostsToAllow() {
    		if (ic_usr_HostsToAllow == null)
    		{
				String label = bundle.getString("PrinterAllowHostSecurityDataContainer.hostsToAllow");
				String binding = bindingPrefix + "_usr_HostsToAllow.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_usr_HostsToAllow = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFListComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_HostsToAllow;
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
				String label = bundle.getString("PrinterAllowHostSecurityDataContainer.addHost");
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
				String label = bundle.getString("PrinterAllowHostSecurityDataContainer.removeHost");
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
	    		if (ic_usr_AllowedHosts != null)
    		{
				ic_usr_AllowedHosts.setLabelText(bundle.getString("PrinterAllowHostSecurityDataContainer.allowedHosts"));
    		}
	    		if (ic_usr_HostsToAllow != null)
    		{
				ic_usr_HostsToAllow.setLabelText(bundle.getString("PrinterAllowHostSecurityDataContainer.hostsToAllow"));
    		}
	    		if (ic_usr_AddHost != null)
    		{
				ic_usr_AddHost.setLabelText(bundle.getString("PrinterAllowHostSecurityDataContainer.addHost"));
    		}
	    		if (ic_usr_RemoveHost != null)
    		{
				ic_usr_RemoveHost.setLabelText(bundle.getString("PrinterAllowHostSecurityDataContainer.removeHost"));
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
    				fields.add(get_usr_AllowedHosts());
    				fields.add(get_usr_HostsToAllow());
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
		PrinterAllowHostSecurityDataContainerImpl source = (PrinterAllowHostSecurityDataContainerImpl)sourceContainer;
	
    	    		get_usr_AllowedHosts().setValue(source.get_usr_AllowedHosts().getValue());
		    		get_usr_HostsToAllow().setValue(source.get_usr_HostsToAllow().getValue());
		    		get_usr_AddHost().setValue(source.get_usr_AddHost().getValue());
		    		get_usr_RemoveHost().setValue(source.get_usr_RemoveHost().getValue());
				
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}