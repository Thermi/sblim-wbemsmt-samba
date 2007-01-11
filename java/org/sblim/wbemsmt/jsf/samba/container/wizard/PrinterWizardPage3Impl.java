/** 
  * PrinterWizardPage3Impl.java
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
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.wizard;

import org.sblim.wbemsmt.exception.*;
import java.util.*;

public class PrinterWizardPage3Impl extends org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel implements org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage3 {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_SeenByEverybody;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_EnableGuest;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_EnableAllUsers;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_ForceUser;
    			private java.util.List icUsers = new java.util.ArrayList();
	
		
	
	public PrinterWizardPage3Impl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {

				super(adapter,bindingPrefix, "PrinterWizardPage3.caption","PrinterWizardPage3.subTitle");
				
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_SeenByEverybody());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_EnableGuest());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_EnableAllUsers());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_ForceUser());
        					
		setFooter(getInputFieldContainer(),"PrinterWizardPage3.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_SeenByEverybody() {
    		if (ic_usr_SeenByEverybody == null)
    		{
				String label = bundle.getString("PrinterWizardPage3.seenByEverybody");
				String binding = bindingPrefix + "_usr_SeenByEverybody.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_SeenByEverybody = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
    		return ic_usr_SeenByEverybody;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_EnableGuest() {
    		if (ic_usr_EnableGuest == null)
    		{
				String label = bundle.getString("PrinterWizardPage3.enableGuest");
				String binding = bindingPrefix + "_usr_EnableGuest.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_EnableGuest = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
    		return ic_usr_EnableGuest;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX_WITH_CLICKEVENT
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_EnableAllUsers() {
    		if (ic_usr_EnableAllUsers == null)
    		{
				String label = bundle.getString("PrinterWizardPage3.enableAllUsers");
				String binding = bindingPrefix + "_usr_EnableAllUsers.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_EnableAllUsers = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxActionComponent(parent,label,binding,converter, readOnly);
				;
    		}
    		return ic_usr_EnableAllUsers;
    	}
			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType COMBOBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_ForceUser() {
    		if (ic_usr_ForceUser == null)
    		{
				String label = bundle.getString("PrinterWizardPage3.forceUser");
				String binding = bindingPrefix + "_usr_ForceUser.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_usr_ForceUser = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFComboBoxComponent(parent,label,binding,converter, readOnly);
				;
    		}
    		return ic_usr_ForceUser;
    	}
		
			
		/**
		* 
		* linked container UserInPrinterWizardACLItemDataContainer
		*/
		public java.util.List getUsers()
		{
			return icUsers;
		}

	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_SeenByEverybody != null)
    		{
				ic_usr_SeenByEverybody.setLabelText(bundle.getString("PrinterWizardPage3.seenByEverybody"));
    		}
	    		if (ic_usr_EnableGuest != null)
    		{
				ic_usr_EnableGuest.setLabelText(bundle.getString("PrinterWizardPage3.enableGuest"));
    		}
	    		if (ic_usr_EnableAllUsers != null)
    		{
				ic_usr_EnableAllUsers.setLabelText(bundle.getString("PrinterWizardPage3.enableAllUsers"));
    		}
	    		if (ic_usr_ForceUser != null)
    		{
				ic_usr_ForceUser.setLabelText(bundle.getString("PrinterWizardPage3.forceUser"));
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
    				fields.add(get_usr_SeenByEverybody());
    				fields.add(get_usr_EnableGuest());
    				fields.add(get_usr_EnableAllUsers());
    				fields.add(get_usr_ForceUser());
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List getChildContainers()
	{
		List childs = new ArrayList();
    	    		childs.addAll(getUsers());
    	    			return childs;
	
	}

	
}