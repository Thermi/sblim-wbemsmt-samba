/** 
  * UserWizardPage1Impl.java
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
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.wizard;

import org.sblim.wbemsmt.exception.*;
import java.util.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;




import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class UserWizardPage1Impl extends org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel implements org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SambaUserName;

    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_SystemUserName;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SambaUserPassword;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SambaUserPassword2;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_IsGuest;

    	
		
	
	public UserWizardPage1Impl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "UserWizardPage1.caption","UserWizardPage1.subTitle",false);
				
				
		
				
    			
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
				String binding = expressionPrefix + "_SambaUserName.item";
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
				String binding = expressionPrefix + "_SystemUserName.item";
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
				String binding = expressionPrefix + "_SambaUserPassword.item";
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
				String binding = expressionPrefix + "_SambaUserPassword2.item";
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
				String binding = expressionPrefix + "_usr_IsGuest.item";
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
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       UserWizardPage1Impl source = (UserWizardPage1Impl)sourceContainer;
		    		    
    	    		   get_SambaUserName().copyFrom(source.get_SambaUserName());
		        		   get_SystemUserName().copyFrom(source.get_SystemUserName());
		        		   get_SambaUserPassword().copyFrom(source.get_SambaUserPassword());
		        		   get_SambaUserPassword2().copyFrom(source.get_SambaUserPassword2());
		        		   get_usr_IsGuest().copyFrom(source.get_usr_IsGuest());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}