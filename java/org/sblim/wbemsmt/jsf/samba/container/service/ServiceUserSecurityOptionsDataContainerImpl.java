/** 
  * ServiceUserSecurityOptionsDataContainerImpl.java
  *

 
 * � Copyright IBM Corp. 2005
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
  * Description: Container for defining user related security options
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.service;

import org.sblim.wbemsmt.exception.*;
import java.util.*;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class ServiceUserSecurityOptionsDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.service.ServiceUserSecurityOptionsDataContainer {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_GuestUser;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_CurrentForceUser;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_NewForceUser;
    			private java.util.List icUserRights = new java.util.ArrayList();
	
		
	
	public ServiceUserSecurityOptionsDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {

			
				super(adapter,bindingPrefix, "ServiceUserSecurityOptionsDataContainer.caption",false);
				
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_GuestUser());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_CurrentForceUser());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_NewForceUser());
        					
		setFooter(getPanelForCustomLayout(),"ServiceUserSecurityOptionsDataContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_GuestUser() {
    		if (ic_usr_GuestUser == null)
    		{
				String label = bundle.getString("ServiceUserSecurityOptionsDataContainer.guestUser");
				String binding = bindingPrefix + "_usr_GuestUser.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_usr_GuestUser = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_GuestUser;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_CurrentForceUser() {
    		if (ic_usr_CurrentForceUser == null)
    		{
				String label = bundle.getString("ServiceUserSecurityOptionsDataContainer.currentForceUser");
				String binding = bindingPrefix + "_usr_CurrentForceUser.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_usr_CurrentForceUser = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_CurrentForceUser;
    	}
			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType COMBOBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_NewForceUser() {
    		if (ic_usr_NewForceUser == null)
    		{
				String label = bundle.getString("ServiceUserSecurityOptionsDataContainer.newForceUser");
				String binding = bindingPrefix + "_usr_NewForceUser.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_usr_NewForceUser = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFComboBoxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_NewForceUser;
    	}
		
			
		/**
		* 
		* linked container UserACLItemDataContainerForService
		*/
		public java.util.List getUserRights()
		{
						return icUserRights;
		}

	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_GuestUser != null)
    		{
				ic_usr_GuestUser.setLabelText(bundle.getString("ServiceUserSecurityOptionsDataContainer.guestUser"));
    		}
	    		if (ic_usr_CurrentForceUser != null)
    		{
				ic_usr_CurrentForceUser.setLabelText(bundle.getString("ServiceUserSecurityOptionsDataContainer.currentForceUser"));
    		}
	    		if (ic_usr_NewForceUser != null)
    		{
				ic_usr_NewForceUser.setLabelText(bundle.getString("ServiceUserSecurityOptionsDataContainer.newForceUser"));
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
    				fields.add(get_usr_GuestUser());
    				fields.add(get_usr_CurrentForceUser());
    				fields.add(get_usr_NewForceUser());
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List getChildContainers()
	{
		List childs = new ArrayList();
    	    		childs.addAll(getUserRights());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer)
	{
		ServiceUserSecurityOptionsDataContainerImpl source = (ServiceUserSecurityOptionsDataContainerImpl)sourceContainer;
	
    	    		get_usr_GuestUser().setValue(source.get_usr_GuestUser().getValue());
		    		get_usr_CurrentForceUser().setValue(source.get_usr_CurrentForceUser().getValue());
		    		get_usr_NewForceUser().setValue(source.get_usr_NewForceUser().getValue());
				
    	    		List targetListForUserRights = (List) getUserRights();
    		List sourceListForUserRights = (List) source.getUserRights();
    		if (sourceListForUserRights.size() != targetListForUserRights.size())
    		{
    			throw new IllegalArgumentException("The Lists are not from same size. Source is " + sourceListForUserRights.size() + " and target is " + targetListForUserRights.size() );
    		}
			for (int ii=0; ii < sourceListForUserRights.size(); ii++)
			{
				((DataContainer) targetListForUserRights.get(ii)).copyFrom(((DataContainer) sourceListForUserRights.get(ii)));
			}
			
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}