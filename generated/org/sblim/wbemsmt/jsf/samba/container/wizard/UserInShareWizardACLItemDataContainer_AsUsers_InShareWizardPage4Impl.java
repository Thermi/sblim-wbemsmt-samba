/** 
  * UserInShareWizardACLItemDataContainer_AsUsers_InShareWizardPage4Impl.java
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
  * @template: org/sblim/wbemsmt/dcg/templates/jsf/containerImplMultiLine.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: Defines a user-related acl within the share-wizard
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.wizard;

import java.util.*;
import org.sblim.wbemsmt.tools.input.jsf.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;


	
public class UserInShareWizardACLItemDataContainer_AsUsers_InShareWizardPage4Impl extends org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel2 implements org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SambaUserName;
			private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_AccessTypeVI;
			private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_AccessTypeRW;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Admin;
		
	public static final int COLS = 4;
	
	public static String[] orientationOfColumnAsCss = new String[]{
    				"left",
    				"left",
    				"left",
    				"left",
    		
	};
	
	
	
	public UserInShareWizardACLItemDataContainer_AsUsers_InShareWizardPage4Impl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String expressionPrefix,int index) throws WbemsmtException {
	    super(adapter,expressionPrefix,index);
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SambaUserName() {
    		if (ic_SambaUserName == null)
    		{
				String label = bundle.getString("UserInShareWizardACLItemDataContainer.SambaUserName");
				String binding = expressionPrefix + "users["+ index +"]._SambaUserName.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_SambaUserName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)ic_SambaUserName).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_SambaUserName;
    	}
			/**
		* relates to<br> Linux_SambaReadListForShare<br> Linux_SambaWriteListForShare<br> Linux_SambaInvalidUsersForShare<br> Linux_SambaValidUsersForShare<br> 
		* DataType UNSIGNED_INT16
		* UIType RADIOBUTTON
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_AccessTypeVI() {
    		if (ic_usr_AccessTypeVI == null)
    		{
				String label = bundle.getString("UserInShareWizardACLItemDataContainer.accessTypeVI");
				String binding = expressionPrefix + "users["+ index +"]._usr_AccessTypeVI.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_usr_AccessTypeVI = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)ic_usr_AccessTypeVI).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_usr_AccessTypeVI;
    	}
			/**
		* relates to<br> Linux_SambaReadListForShare<br> Linux_SambaWriteListForShare<br> Linux_SambaInvalidUsersForShare<br> Linux_SambaValidUsersForShare<br> 
		* DataType UNSIGNED_INT16
		* UIType RADIOBUTTON
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_AccessTypeRW() {
    		if (ic_usr_AccessTypeRW == null)
    		{
				String label = bundle.getString("UserInShareWizardACLItemDataContainer.accessTypeRW");
				String binding = expressionPrefix + "users["+ index +"]._usr_AccessTypeRW.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_usr_AccessTypeRW = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)ic_usr_AccessTypeRW).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_usr_AccessTypeRW;
    	}
			/**
		* relates to Linux_SambaAdminUsersForShare
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Admin() {
    		if (ic_usr_Admin == null)
    		{
				String label = bundle.getString("UserInShareWizardACLItemDataContainer.admin");
				String binding = expressionPrefix + "users["+ index +"]._usr_Admin.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Admin = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)ic_usr_Admin).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_usr_Admin;
    	}
		

	/**
	 * @return all the Components
	 */
	public LabeledJSFInputComponent[] getComponents() {
		return new LabeledJSFInputComponent[]{
						(LabeledJSFInputComponent)get_SambaUserName(),
						(LabeledJSFInputComponent)get_usr_AccessTypeVI(),
						(LabeledJSFInputComponent)get_usr_AccessTypeRW(),
						(LabeledJSFInputComponent)get_usr_Admin(),
					};
	}
	
	
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_SambaUserName != null)
    		{
				ic_SambaUserName.setLabelText(bundle.getString("UserInShareWizardACLItemDataContainer.SambaUserName"));
    		}
	    		if (ic_usr_AccessTypeVI != null)
    		{
				ic_usr_AccessTypeVI.setLabelText(bundle.getString("UserInShareWizardACLItemDataContainer.accessTypeVI"));
    		}
	    		if (ic_usr_AccessTypeRW != null)
    		{
				ic_usr_AccessTypeRW.setLabelText(bundle.getString("UserInShareWizardACLItemDataContainer.accessTypeRW"));
    		}
	    		if (ic_usr_Admin != null)
    		{
				ic_usr_Admin.setLabelText(bundle.getString("UserInShareWizardACLItemDataContainer.admin"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesSamba"};
	}
	
	protected String getOrientationOfColumnAsCss(int column) {
		return orientationOfColumnAsCss[column];
	}
	

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    				fields.add(get_SambaUserName());
    				fields.add(get_usr_AccessTypeVI());
    				fields.add(get_usr_AccessTypeRW());
    				fields.add(get_usr_Admin());
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
	    		       UserInShareWizardACLItemDataContainer_AsUsers_InShareWizardPage4Impl source = (UserInShareWizardACLItemDataContainer_AsUsers_InShareWizardPage4Impl)sourceContainer;
		    		    
    	    		   get_SambaUserName().copyFrom(source.get_SambaUserName());
		        		   get_usr_AccessTypeVI().copyFrom(source.get_usr_AccessTypeVI());
		        		   get_usr_AccessTypeRW().copyFrom(source.get_usr_AccessTypeRW());
		        		   get_usr_Admin().copyFrom(source.get_usr_Admin());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
	
	
	
}