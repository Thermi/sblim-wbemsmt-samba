/** 
  * AdminUsersInShareGlobalsImpl.java
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
  * Description: container for admin Users in global share settings
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.global;

import org.sblim.wbemsmt.exception.*;

public class AdminUsersInShareGlobalsImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobals {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_SambaUserName;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Admin;
    	
		
	
	public AdminUsersInShareGlobalsImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {
		super(adapter,bindingPrefix, "AdminUsersInShareGlobals.caption");
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_SambaUserName());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Admin());
        					
		setFooter(getInputFieldContainer(),"AdminUsersInShareGlobals.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_SambaUserName() {
    		if (ic_usr_SambaUserName == null)
    		{
				String label = bundle.getString("AdminUsersInShareGlobals.SambaUserName");
				String binding = bindingPrefix + "_usr_SambaUserName.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_usr_SambaUserName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
    		}
    		return ic_usr_SambaUserName;
    	}
			/**
		* relates to Linux_SambaAdminUsersForShare
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Admin() {
    		if (ic_usr_Admin == null)
    		{
				String label = bundle.getString("AdminUsersInShareGlobals.admin");
				String binding = bindingPrefix + "_usr_Admin.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Admin = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
    		}
    		return ic_usr_Admin;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_SambaUserName != null)
    		{
				ic_usr_SambaUserName.setLabelText(bundle.getString("AdminUsersInShareGlobals.SambaUserName"));
    		}
	    		if (ic_usr_Admin != null)
    		{
				ic_usr_Admin.setLabelText(bundle.getString("AdminUsersInShareGlobals.admin"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesSamba"};
	}

	
}