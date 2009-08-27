/** 
  * PrinterWizardPage5Impl.java
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

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainer;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;

public class PrinterWizardPage5Impl extends org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel implements org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage5
			, org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainerHeader		
	{
			private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_AllOrOne;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SambaPrinterName;

    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_SystemPrinterName;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Path;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Comment;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_SeenByEverybody;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_EnableGuest;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_CupsOptions;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_PrintCommand;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_ForceUser;

    			
				private java.util.List<UserInPrinterWizardACLItemDataContainer> icUsers = new java.util.ArrayList<UserInPrinterWizardACLItemDataContainer>();
		
		private MultiLinePanel usersPanel;
		private int usersCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_SambaUserName;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_AccessTypeVI;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_AccessTypeRW;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_Admin;
				
	
		
	
	public PrinterWizardPage5Impl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "PrinterWizardPage5.caption","PrinterWizardPage5.subTitle",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_AllOrOne());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_SambaPrinterName());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_SystemPrinterName());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_Path());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_Comment());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_SeenByEverybody());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_EnableGuest());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_CupsOptions());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_PrintCommand());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_ForceUser());
        					
		setFooter(getPanelForCustomLayout(),"PrinterWizardPage5.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType RADIOBUTTON
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_AllOrOne() {
    		if (ic_usr_AllOrOne == null)
    		{
				String label = bundle.getString("PrinterWizardPage5.allOrOne");
				String binding = expressionPrefix + "_usr_AllOrOne.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = true;
    			ic_usr_AllOrOne = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_AllOrOne;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SambaPrinterName() {
    		if (ic_SambaPrinterName == null)
    		{
				String label = bundle.getString("PrinterWizardPage5.SambaPrinterName");
				String binding = expressionPrefix + "_SambaPrinterName.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_SambaPrinterName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_SambaPrinterName;
    	}
			/**
		* maps to Linux_SambaPrinterOptions.get_SystemPrinterName
		* DataType UNSIGNED_INT16
		* UIType COMBOBOX
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_SystemPrinterName() {
    		if (ic_usr_SystemPrinterName == null)
    		{
				String label = bundle.getString("PrinterWizardPage5.SystemPrinterName");
				String binding = expressionPrefix + "_usr_SystemPrinterName.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = true;
    			ic_usr_SystemPrinterName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFComboBoxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_SystemPrinterName;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Path() {
    		if (ic_Path == null)
    		{
				String label = bundle.getString("PrinterWizardPage5.Path");
				String binding = expressionPrefix + "_Path.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_Path = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_Path;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Comment() {
    		if (ic_Comment == null)
    		{
				String label = bundle.getString("PrinterWizardPage5.Comment");
				String binding = expressionPrefix + "_Comment.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_Comment = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_Comment;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_SeenByEverybody() {
    		if (ic_usr_SeenByEverybody == null)
    		{
				String label = bundle.getString("PrinterWizardPage5.seenByEverybody");
				String binding = expressionPrefix + "_usr_SeenByEverybody.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_usr_SeenByEverybody = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_SeenByEverybody;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_EnableGuest() {
    		if (ic_usr_EnableGuest == null)
    		{
				String label = bundle.getString("PrinterWizardPage5.enableGuest");
				String binding = expressionPrefix + "_usr_EnableGuest.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_usr_EnableGuest = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_EnableGuest;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_CupsOptions() {
    		if (ic_CupsOptions == null)
    		{
				String label = bundle.getString("PrinterWizardPage5.CupsOptions");
				String binding = expressionPrefix + "_CupsOptions.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_CupsOptions = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_CupsOptions;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_PrintCommand() {
    		if (ic_PrintCommand == null)
    		{
				String label = bundle.getString("PrinterWizardPage5.PrintCommand");
				String binding = expressionPrefix + "_PrintCommand.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_PrintCommand = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_PrintCommand;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_ForceUser() {
    		if (ic_usr_ForceUser == null)
    		{
				String label = bundle.getString("PrinterWizardPage5.forceUser");
				String binding = expressionPrefix + "_usr_ForceUser.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_usr_ForceUser = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_ForceUser;
    	}
		
			
				
		/**
		* 
		* linked container UserInPrinterWizardACLItemDataContainer
		*/
				public java.util.List<UserInPrinterWizardACLItemDataContainer> getUsers()
				{
						return icUsers;
		}
		
		public MultiLinePanel getUsersPanel()
		{
			if (usersPanel == null)
			{
  			   usersPanel = new UsersPanel(adapter,expressionPrefix, // the prefix for binding values
							  "#{" +  expressionPrefix + "usersPanel", // binding for Title
							  "UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage5.caption", //Key for title
							  org.sblim.wbemsmt.jsf.samba.container.wizard.UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage5Impl.COLS);
			  addUsersHeader();							  
			}		
			
			return usersPanel;
		}

		static class UsersPanel extends MultiLinePanel
		{
			public UsersPanel(AbstractBaseCimAdapter adapter, String expressionPrefix, String bindigForTitle, String keyForTitle, int cols) {
				super(adapter, expressionPrefix, bindigForTitle, keyForTitle, "users", cols);
			}
	
			protected String getOrientationOfColumnAsCss(int column) {
				return org.sblim.wbemsmt.jsf.samba.container.wizard.UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage5Impl.orientationOfColumnAsCss[column];
			}
		}

	private void addUsers(org.sblim.wbemsmt.jsf.samba.container.wizard.UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage5Impl child) {

		getUsers().add(child);
		getUsersPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getUsers_SambaUserNameHeader()).getDependentChildFields().add(child.get_SambaUserName());
					//((LabeledJSFInputComponent)getUsers_usr_AccessTypeVIHeader()).getDependentChildFields().add(child.get_usr_AccessTypeVI());
					//((LabeledJSFInputComponent)getUsers_usr_AccessTypeRWHeader()).getDependentChildFields().add(child.get_usr_AccessTypeRW());
					//((LabeledJSFInputComponent)getUsers_usr_AdminHeader()).getDependentChildFields().add(child.get_usr_Admin());
			}
	
	private void clearUsers() {
		getUsers().clear();
	}

	/**
	* 
	* Get the Users for the UI repesentation
	*/
	public java.util.List<UserInPrinterWizardACLItemDataContainer> getUsersForUI()
	{
				
		List<UserInPrinterWizardACLItemDataContainer> result = new ArrayList<UserInPrinterWizardACLItemDataContainer>();
		result.addAll(icUsers);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.jsf.samba.container.wizard.UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage5Impl item = new org.sblim.wbemsmt.jsf.samba.container.wizard.UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage5Impl((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)adapter,expressionPrefix, result.size());
				DataContainerUtil.setVisibilityOfFields(item,false);
				result.add(item);
			} catch (WbemsmtException e) {
				e.printStackTrace();
			}
		}
		
		usersPanel.setList(result);
		
		return result;
	}		
		
		
	/**
	 * manages the style for whole footer which is displayed if there are no entries in the table or if there is a custom panel in it
	 * @return
	 */
	public String getUsersFooterClass()
	{
		return "multiLineRowHeader center "  
		+ (icUsers.size() == 0 || getUsersPanel().isHavingCustomFooter() ?  "visible " : "hidden ");
	}
	
	/**
	 * manages the style for the label which is displayed if there are no entries in the table
	 * @return
	 */
	public String getUsersAvailableFooterClass()
	{
		return icUsers.size() > 0 ? " hidden " : " visible ";
	}
	
	private void addUsersHeader() {
		getUsersPanel().setHeader(getUsersHeaderComponents(),getUsersFieldNames());
	}
	
	private LabeledJSFInputComponent[] getUsersHeaderComponents() {
		return new LabeledJSFInputComponent[]{
							(LabeledJSFInputComponent)getUsersHeader_SambaUserName(),
							(LabeledJSFInputComponent)getUsersHeader_usr_AccessTypeVI(),
							(LabeledJSFInputComponent)getUsersHeader_usr_AccessTypeRW(),
							(LabeledJSFInputComponent)getUsersHeader_usr_Admin(),
						};
	}

	private String[] getUsersFieldNames() {
		return new String[]{
							"_SambaUserName",
							"_usr_AccessTypeVI",
							"_usr_AccessTypeRW",
							"_usr_Admin",
						};
	}

	   /**
		* Header for:
		* 
		* linked container UserInPrinterWizardACLItemDataContainer
		*/
		public org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainerHeader getUsersHeader()
		{
			return this;
		}
		
				/**
   		 * Header for field SambaUserName
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_SambaUserName() {
    		if (icUsersHeader_SambaUserName == null)
    		{
				String label = bundle.getString("UserInPrinterWizardACLItemDataContainer.SambaUserName");
				String binding = expressionPrefix + "usersHeader_SambaUserName.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			icUsersHeader_SambaUserName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icUsersHeader_SambaUserName).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icUsersHeader_SambaUserName).setHeader(true);
			
    		return icUsersHeader_SambaUserName;
    	}
				/**
   		 * Header for field accessTypeVI
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_AccessTypeVI() {
    		if (icUsersHeader_usr_AccessTypeVI == null)
    		{
				String label = bundle.getString("UserInPrinterWizardACLItemDataContainer.accessTypeVI");
				String binding = expressionPrefix + "usersHeader_usr_AccessTypeVI.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			icUsersHeader_usr_AccessTypeVI = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)icUsersHeader_usr_AccessTypeVI).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)icUsersHeader_usr_AccessTypeVI).setHeader(true);
			
    		return icUsersHeader_usr_AccessTypeVI;
    	}
				/**
   		 * Header for field accessTypeRW
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_AccessTypeRW() {
    		if (icUsersHeader_usr_AccessTypeRW == null)
    		{
				String label = bundle.getString("UserInPrinterWizardACLItemDataContainer.accessTypeRW");
				String binding = expressionPrefix + "usersHeader_usr_AccessTypeRW.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			icUsersHeader_usr_AccessTypeRW = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)icUsersHeader_usr_AccessTypeRW).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)icUsersHeader_usr_AccessTypeRW).setHeader(true);
			
    		return icUsersHeader_usr_AccessTypeRW;
    	}
				/**
   		 * Header for field admin
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_Admin() {
    		if (icUsersHeader_usr_Admin == null)
    		{
				String label = bundle.getString("UserInPrinterWizardACLItemDataContainer.admin");
				String binding = expressionPrefix + "usersHeader_usr_Admin.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icUsersHeader_usr_Admin = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icUsersHeader_usr_Admin).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icUsersHeader_usr_Admin).setHeader(true);
			
    		return icUsersHeader_usr_Admin;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_AllOrOne != null)
    		{
				ic_usr_AllOrOne.setLabelText(bundle.getString("PrinterWizardPage5.allOrOne"));
    		}
	    		if (ic_SambaPrinterName != null)
    		{
				ic_SambaPrinterName.setLabelText(bundle.getString("PrinterWizardPage5.SambaPrinterName"));
    		}
	    		if (ic_usr_SystemPrinterName != null)
    		{
				ic_usr_SystemPrinterName.setLabelText(bundle.getString("PrinterWizardPage5.SystemPrinterName"));
    		}
	    		if (ic_Path != null)
    		{
				ic_Path.setLabelText(bundle.getString("PrinterWizardPage5.Path"));
    		}
	    		if (ic_Comment != null)
    		{
				ic_Comment.setLabelText(bundle.getString("PrinterWizardPage5.Comment"));
    		}
	    		if (ic_usr_SeenByEverybody != null)
    		{
				ic_usr_SeenByEverybody.setLabelText(bundle.getString("PrinterWizardPage5.seenByEverybody"));
    		}
	    		if (ic_usr_EnableGuest != null)
    		{
				ic_usr_EnableGuest.setLabelText(bundle.getString("PrinterWizardPage5.enableGuest"));
    		}
	    		if (ic_CupsOptions != null)
    		{
				ic_CupsOptions.setLabelText(bundle.getString("PrinterWizardPage5.CupsOptions"));
    		}
	    		if (ic_PrintCommand != null)
    		{
				ic_PrintCommand.setLabelText(bundle.getString("PrinterWizardPage5.PrintCommand"));
    		}
	    		if (ic_usr_ForceUser != null)
    		{
				ic_usr_ForceUser.setLabelText(bundle.getString("PrinterWizardPage5.forceUser"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesSamba"};
	}

	public void countAndCreateChildren() throws WbemsmtException {
	
    			try
		{
			int count = adapter.count("users",org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainer.class, this);
	        if (count != usersCount)
	        {
	           usersCount = count;
	           clearUsers();
			   for (int i=0; i < count ; i++) {
	    			addUsers(new org.sblim.wbemsmt.jsf.samba.container.wizard.UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage5Impl((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)adapter,expressionPrefix, i));
			   }
	        }
			getUsersPanel().setList(getUsers());				   
		} catch (WbemsmtException e) {
			throw new WbemsmtException(WbemsmtException.ERR_INIT_CONTAINER,e);
		}
    		}


	/**
	 * count and create childrens
	 * @throws WbemsmtException
	 */
	public void updateControls() throws WbemsmtException {
			   countAndCreateChildren();
			   adapter.updateControls(this);
		
			   				      getUsersPanel().updateRows();				
			   		}

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    				fields.add(get_usr_AllOrOne());
    				fields.add(get_SambaPrinterName());
    				fields.add(get_usr_SystemPrinterName());
    				fields.add(get_Path());
    				fields.add(get_Comment());
    				fields.add(get_usr_SeenByEverybody());
    				fields.add(get_usr_EnableGuest());
    				fields.add(get_CupsOptions());
    				fields.add(get_PrintCommand());
    				fields.add(get_usr_ForceUser());
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    		childs.addAll(getUsers());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       PrinterWizardPage5Impl source = (PrinterWizardPage5Impl)sourceContainer;
		    		    
    	    		   get_usr_AllOrOne().copyFrom(source.get_usr_AllOrOne());
		        		   get_SambaPrinterName().copyFrom(source.get_SambaPrinterName());
		        		   get_usr_SystemPrinterName().copyFrom(source.get_usr_SystemPrinterName());
		        		   get_Path().copyFrom(source.get_Path());
		        		   get_Comment().copyFrom(source.get_Comment());
		        		   get_usr_SeenByEverybody().copyFrom(source.get_usr_SeenByEverybody());
		        		   get_usr_EnableGuest().copyFrom(source.get_usr_EnableGuest());
		        		   get_CupsOptions().copyFrom(source.get_CupsOptions());
		        		   get_PrintCommand().copyFrom(source.get_PrintCommand());
		        		   get_usr_ForceUser().copyFrom(source.get_usr_ForceUser());
		    		
    	    		   List<UserInPrinterWizardACLItemDataContainer> targetListForUsers = getUsers();
    		   List<UserInPrinterWizardACLItemDataContainer> sourceListForUsers = source.getUsers();
    		   if (sourceListForUsers.size() != targetListForUsers.size())
    		   {
    			      throw new WbemsmtException(WbemsmtException.ERR_FAILED,"The Lists are not from same size. Source is " + sourceListForUsers.size() + " and target is " + targetListForUsers.size() );
    		   }
			       for (int ii=0; ii < sourceListForUsers.size(); ii++)
			       {
				          ((DataContainer) targetListForUsers.get(ii)).copyFrom(((DataContainer) sourceListForUsers.get(ii)));
			        }
			
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}