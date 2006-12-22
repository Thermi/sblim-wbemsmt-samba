/** 
  * UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage3Impl.java
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
  * @template: ./tools-dcg/templates/jsf/containerImplMultiLine.vm
  *
  * Contributors: 
  * 
  * Description: Defines a user-related acl within the printer wizard
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.wizard;

import javax.faces.component.html.HtmlPanelGrid;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.tools.input.jsf.*;
import org.sblim.wbemsmt.exception.*;

	
public class UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage3Impl extends org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel implements org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainer {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SambaUserName;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_AccessTypeVI;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_AccessTypeRW;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Admin;
    	
	
	private final int index;
	
//	public UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage3Impl(String bindingPrefix, org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,int index) throws InitContainerException {
//		this(adapter,bindingPrefix,index, null);
//	}
	
	public UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage3Impl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix,int index, HtmlPanelGrid grid) throws InitContainerException {
	    super(adapter,
			  bindingPrefix, // the prefix for binding values
			  "#{" +  bindingPrefix + "users["+ index +"]", // binding for Title
			  "UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage3.caption", //Key for title
			  4,grid);
		this.index = index;
		addComponents(new LabeledJSFInputComponent[]{
					(LabeledJSFInputComponent)get_SambaUserName(),
			
					(LabeledJSFInputComponent)get_usr_AccessTypeVI(),
			
					(LabeledJSFInputComponent)get_usr_AccessTypeRW(),
			
					(LabeledJSFInputComponent)get_usr_Admin(),
			
				});
		if (first)
		{
			//setFooter(getInputFieldContainer(),"#{localeManager.bundle['SAMBA'].UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage3Impl_footerText}","UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage3Impl.footerText");
			//setFooter(getInputFieldContainer(),"UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage3Impl.footerText");
			String binding = "#{" +  bindingPrefix + "users["+ index +"].footerText}";
			setFooter(getOuterPanel(),"UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage3.footerText",binding);
		}
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SambaUserName() {
    		if (ic_SambaUserName == null)
    		{
				String label = bundle.getString("UserInPrinterWizardACLItemDataContainer.SambaUserName");
				String binding = bindingPrefix + "users["+ index +"]._SambaUserName.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_SambaUserName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
    		return ic_SambaUserName;
    	}
			/**
		* relates to<br> Linux_SambaReadListForShare<br> Linux_SambaWriteListForShare<br> Linux_SambaInvalidUsersForShare<br> Linux_SambaValidUsersForShare<br> 
		* DataType UNSIGNED_INT16
		* UIType RADIOBUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_AccessTypeVI() {
    		if (ic_usr_AccessTypeVI == null)
    		{
				String label = bundle.getString("UserInPrinterWizardACLItemDataContainer.accessTypeVI");
				String binding = bindingPrefix + "users["+ index +"]._usr_AccessTypeVI.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_usr_AccessTypeVI = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(parent,label,binding,converter, readOnly);
				;
    		}
    		return ic_usr_AccessTypeVI;
    	}
			/**
		* relates to<br> Linux_SambaReadListForShare<br> Linux_SambaWriteListForShare<br> Linux_SambaInvalidUsersForShare<br> Linux_SambaValidUsersForShare<br> 
		* DataType UNSIGNED_INT16
		* UIType RADIOBUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_AccessTypeRW() {
    		if (ic_usr_AccessTypeRW == null)
    		{
				String label = bundle.getString("UserInPrinterWizardACLItemDataContainer.accessTypeRW");
				String binding = bindingPrefix + "users["+ index +"]._usr_AccessTypeRW.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_usr_AccessTypeRW = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(parent,label,binding,converter, readOnly);
				;
    		}
    		return ic_usr_AccessTypeRW;
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
				String label = bundle.getString("UserInPrinterWizardACLItemDataContainer.admin");
				String binding = bindingPrefix + "users["+ index +"]._usr_Admin.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Admin = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
    		return ic_usr_Admin;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_SambaUserName != null)
    		{
				ic_SambaUserName.setLabelText(bundle.getString("UserInPrinterWizardACLItemDataContainer.SambaUserName"));
    		}
	    		if (ic_usr_AccessTypeVI != null)
    		{
				ic_usr_AccessTypeVI.setLabelText(bundle.getString("UserInPrinterWizardACLItemDataContainer.accessTypeVI"));
    		}
	    		if (ic_usr_AccessTypeRW != null)
    		{
				ic_usr_AccessTypeRW.setLabelText(bundle.getString("UserInPrinterWizardACLItemDataContainer.accessTypeRW"));
    		}
	    		if (ic_usr_Admin != null)
    		{
				ic_usr_Admin.setLabelText(bundle.getString("UserInPrinterWizardACLItemDataContainer.admin"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesSamba"};
	}
	

}