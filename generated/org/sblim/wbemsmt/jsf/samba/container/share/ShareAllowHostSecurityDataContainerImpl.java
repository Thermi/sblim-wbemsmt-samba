/** 
  * ShareAllowHostSecurityDataContainerImpl.java
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
  * Description: Container for AllowHosts within a share
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.share;

import org.sblim.wbemsmt.exception.*;
import java.util.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;




import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class ShareAllowHostSecurityDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.share.ShareAllowHostSecurityDataContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_AllowedHosts;

    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_HostsToAllow;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_AddHost;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_RemoveHost;

    	
		
	
	public ShareAllowHostSecurityDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "ShareAllowHostSecurityDataContainer.caption",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_AllowedHosts());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_HostsToAllow());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_AddHost());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_RemoveHost());
        					
		setFooter(getPanelForCustomLayout(),"ShareAllowHostSecurityDataContainer.footerText");
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
				String label = bundle.getString("ShareAllowHostSecurityDataContainer.allowedHosts");
				String binding = expressionPrefix + "_usr_AllowedHosts.item";
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
				String label = bundle.getString("ShareAllowHostSecurityDataContainer.hostsToAllow");
				String binding = expressionPrefix + "_usr_HostsToAllow.item";
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
				String label = bundle.getString("ShareAllowHostSecurityDataContainer.addHost");
				String binding = expressionPrefix + "_usr_AddHost.item";
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
				String label = bundle.getString("ShareAllowHostSecurityDataContainer.removeHost");
				String binding = expressionPrefix + "_usr_RemoveHost.item";
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
				ic_usr_AllowedHosts.setLabelText(bundle.getString("ShareAllowHostSecurityDataContainer.allowedHosts"));
    		}
	    		if (ic_usr_HostsToAllow != null)
    		{
				ic_usr_HostsToAllow.setLabelText(bundle.getString("ShareAllowHostSecurityDataContainer.hostsToAllow"));
    		}
	    		if (ic_usr_AddHost != null)
    		{
				ic_usr_AddHost.setLabelText(bundle.getString("ShareAllowHostSecurityDataContainer.addHost"));
    		}
	    		if (ic_usr_RemoveHost != null)
    		{
				ic_usr_RemoveHost.setLabelText(bundle.getString("ShareAllowHostSecurityDataContainer.removeHost"));
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
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       ShareAllowHostSecurityDataContainerImpl source = (ShareAllowHostSecurityDataContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_AllowedHosts().copyFrom(source.get_usr_AllowedHosts());
		        		   get_usr_HostsToAllow().copyFrom(source.get_usr_HostsToAllow());
		        		   get_usr_AddHost().copyFrom(source.get_usr_AddHost());
		        		   get_usr_RemoveHost().copyFrom(source.get_usr_RemoveHost());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}