/** 
  * UserWizardPage2Impl.java
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

public class UserWizardPage2Impl extends org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel implements org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2 {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_AccessToAll;
    			private java.util.List icShares = new java.util.ArrayList();
			private java.util.List icPrinters = new java.util.ArrayList();
	
		
	
	public UserWizardPage2Impl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {

				super(adapter,bindingPrefix, "UserWizardPage2.caption","UserWizardPage2.subTitle");
				
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_AccessToAll());
        					
		setFooter(getInputFieldContainer(),"UserWizardPage2.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX_WITH_CLICKEVENT
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_AccessToAll() {
    		if (ic_usr_AccessToAll == null)
    		{
				String label = bundle.getString("UserWizardPage2.accessToAll");
				String binding = bindingPrefix + "_usr_AccessToAll.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_AccessToAll = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxActionComponent(parent,label,binding,converter, readOnly);
				;
    		}
    		return ic_usr_AccessToAll;
    	}
		
			
		/**
		* 
		* linked container ShareInUserWizardACLItemDataContainer
		*/
		public java.util.List getShares()
		{
			return icShares;
		}

			
		/**
		* 
		* linked container PrinterInUserWizardACLItemDataContainer
		*/
		public java.util.List getPrinters()
		{
			return icPrinters;
		}

	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_AccessToAll != null)
    		{
				ic_usr_AccessToAll.setLabelText(bundle.getString("UserWizardPage2.accessToAll"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesSamba"};
	}

	
}