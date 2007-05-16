/** 
  * UserWizardPage1Impl.java
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
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.wizard;

import org.sblim.wbemsmt.exception.*;
import java.util.*;




import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class UserWizardPage1Impl extends org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel implements org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1 {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SambaUserName;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_SystemUserName;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SambaUserPassword;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SambaUserPassword2;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_IsGuest;
    	
		
	
	public UserWizardPage1Impl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {

			
				super(adapter,bindingPrefix, "UserWizardPage1.caption","UserWizardPage1.subTitle",false);
				
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_SambaUserName());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_SystemUserName());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_SambaUserPassword());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_SambaUserPassword2());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_IsGuest());
        					
		setFooter(getPanelForCustomLayout(),"UserWizardPage1.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SambaUserName() {
    		if (ic_SambaUserName == null)
    		{
				String label = bundle.getString("UserWizardPage1.SambaUserName");
				String binding = bindingPrefix + "_SambaUserName.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_SambaUserName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
								ic_SambaUserName.setRequired(true);
				;
    		}
			
						
    		return ic_SambaUserName;
    	}
			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType LIST
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_SystemUserName() {
    		if (ic_SystemUserName == null)
    		{
				String label = bundle.getString("UserWizardPage1.SystemUserName");
				String binding = bindingPrefix + "_SystemUserName.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_SystemUserName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFListComponent(parent,label,binding,converter, readOnly);
								ic_SystemUserName.setRequired(true);
				;
    		}
			
						
    		return ic_SystemUserName;
    	}
			/**
		* 
		* DataType STRING
		* UIType PASSWORD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SambaUserPassword() {
    		if (ic_SambaUserPassword == null)
    		{
				String label = bundle.getString("UserWizardPage1.SambaUserPassword");
				String binding = bindingPrefix + "_SambaUserPassword.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_SambaUserPassword = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFPasswordFieldComponent(parent,label,binding,converter, readOnly);
								ic_SambaUserPassword.setRequired(true);
				;
    		}
			
						
    		return ic_SambaUserPassword;
    	}
			/**
		* 
		* DataType STRING
		* UIType PASSWORD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SambaUserPassword2() {
    		if (ic_SambaUserPassword2 == null)
    		{
				String label = bundle.getString("UserWizardPage1.SambaUserPassword2");
				String binding = bindingPrefix + "_SambaUserPassword2.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_SambaUserPassword2 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFPasswordFieldComponent(parent,label,binding,converter, readOnly);
								ic_SambaUserPassword2.setRequired(true);
				;
    		}
			
						
    		return ic_SambaUserPassword2;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_IsGuest() {
    		if (ic_usr_IsGuest == null)
    		{
				String label = bundle.getString("UserWizardPage1.isGuest");
				String binding = bindingPrefix + "_usr_IsGuest.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_IsGuest = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_IsGuest;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_SambaUserName != null)
    		{
				ic_SambaUserName.setLabelText(bundle.getString("UserWizardPage1.SambaUserName"));
    		}
	    		if (ic_SystemUserName != null)
    		{
				ic_SystemUserName.setLabelText(bundle.getString("UserWizardPage1.SystemUserName"));
    		}
	    		if (ic_SambaUserPassword != null)
    		{
				ic_SambaUserPassword.setLabelText(bundle.getString("UserWizardPage1.SambaUserPassword"));
    		}
	    		if (ic_SambaUserPassword2 != null)
    		{
				ic_SambaUserPassword2.setLabelText(bundle.getString("UserWizardPage1.SambaUserPassword2"));
    		}
	    		if (ic_usr_IsGuest != null)
    		{
				ic_usr_IsGuest.setLabelText(bundle.getString("UserWizardPage1.isGuest"));
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
    				fields.add(get_SambaUserName());
    				fields.add(get_SystemUserName());
    				fields.add(get_SambaUserPassword());
    				fields.add(get_SambaUserPassword2());
    				fields.add(get_usr_IsGuest());
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
		UserWizardPage1Impl source = (UserWizardPage1Impl)sourceContainer;
	
    	    		get_SambaUserName().setValue(source.get_SambaUserName().getValue());
		    		get_SystemUserName().setValue(source.get_SystemUserName().getValue());
		    		get_SambaUserPassword().setValue(source.get_SambaUserPassword().getValue());
		    		get_SambaUserPassword2().setValue(source.get_SambaUserPassword2().getValue());
		    		get_usr_IsGuest().setValue(source.get_usr_IsGuest().getValue());
				
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}