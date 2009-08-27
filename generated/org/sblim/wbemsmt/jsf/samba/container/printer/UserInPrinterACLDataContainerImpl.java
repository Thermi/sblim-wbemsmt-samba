/** 
  * UserInPrinterACLDataContainerImpl.java
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

package org.sblim.wbemsmt.jsf.samba.container.printer;

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinter;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;

public class UserInPrinterACLDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.printer.UserInPrinterACLDataContainer
			, org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinterHeader		
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_CurrentForceUser;

    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_NewForceUser;

    			
				private java.util.List<UserACLItemDataContainerForPrinter> icUsers = new java.util.ArrayList<UserACLItemDataContainerForPrinter>();
		
		private MultiLinePanel usersPanel;
		private int usersCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_SambaUserName;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_AccessTypeVI;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_AccessTypeRW;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_Admin;
				
	
		
	
	public UserInPrinterACLDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "UserInPrinterACLDataContainer.caption",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_CurrentForceUser());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_NewForceUser());
        					
		setFooter(getPanelForCustomLayout(),"UserInPrinterACLDataContainer.footerText");
		adapter.initContainer(this);
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
				String label = bundle.getString("UserInPrinterACLDataContainer.currentForceUser");
				String binding = expressionPrefix + "_usr_CurrentForceUser.item";
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
				String label = bundle.getString("UserInPrinterACLDataContainer.newForceUser");
				String binding = expressionPrefix + "_usr_NewForceUser.item";
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
		* linked container UserACLItemDataContainerForPrinter
		*/
				public java.util.List<UserACLItemDataContainerForPrinter> getUsers()
				{
						return icUsers;
		}
		
		public MultiLinePanel getUsersPanel()
		{
			if (usersPanel == null)
			{
  			   usersPanel = new UsersPanel(adapter,expressionPrefix, // the prefix for binding values
							  "#{" +  expressionPrefix + "usersPanel", // binding for Title
							  "UserACLItemDataContainerForPrinter_AsUsers_InUserInPrinterACLDataContainer.caption", //Key for title
							  org.sblim.wbemsmt.jsf.samba.container.printer.UserACLItemDataContainerForPrinter_AsUsers_InUserInPrinterACLDataContainerImpl.COLS);
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
				return org.sblim.wbemsmt.jsf.samba.container.printer.UserACLItemDataContainerForPrinter_AsUsers_InUserInPrinterACLDataContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	private void addUsers(org.sblim.wbemsmt.jsf.samba.container.printer.UserACLItemDataContainerForPrinter_AsUsers_InUserInPrinterACLDataContainerImpl child) {

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
	public java.util.List<UserACLItemDataContainerForPrinter> getUsersForUI()
	{
				
		List<UserACLItemDataContainerForPrinter> result = new ArrayList<UserACLItemDataContainerForPrinter>();
		result.addAll(icUsers);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.jsf.samba.container.printer.UserACLItemDataContainerForPrinter_AsUsers_InUserInPrinterACLDataContainerImpl item = new org.sblim.wbemsmt.jsf.samba.container.printer.UserACLItemDataContainerForPrinter_AsUsers_InUserInPrinterACLDataContainerImpl((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)adapter,expressionPrefix, result.size());
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
		* linked container UserACLItemDataContainerForPrinter
		*/
		public org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinterHeader getUsersHeader()
		{
			return this;
		}
		
				/**
   		 * Header for field SambaUserName
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_SambaUserName() {
    		if (icUsersHeader_SambaUserName == null)
    		{
				String label = bundle.getString("UserACLItemDataContainerForPrinter.SambaUserName");
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
				String label = bundle.getString("UserACLItemDataContainerForPrinter.accessTypeVI");
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
				String label = bundle.getString("UserACLItemDataContainerForPrinter.accessTypeRW");
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
				String label = bundle.getString("UserACLItemDataContainerForPrinter.admin");
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
	    		if (ic_usr_CurrentForceUser != null)
    		{
				ic_usr_CurrentForceUser.setLabelText(bundle.getString("UserInPrinterACLDataContainer.currentForceUser"));
    		}
	    		if (ic_usr_NewForceUser != null)
    		{
				ic_usr_NewForceUser.setLabelText(bundle.getString("UserInPrinterACLDataContainer.newForceUser"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesSamba"};
	}

	public void countAndCreateChildren() throws WbemsmtException {
	
    			try
		{
			int count = adapter.count("users",org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinter.class, this);
	        if (count != usersCount)
	        {
	           usersCount = count;
	           clearUsers();
			   for (int i=0; i < count ; i++) {
	    			addUsers(new org.sblim.wbemsmt.jsf.samba.container.printer.UserACLItemDataContainerForPrinter_AsUsers_InUserInPrinterACLDataContainerImpl((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)adapter,expressionPrefix, i));
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
    				fields.add(get_usr_CurrentForceUser());
    				fields.add(get_usr_NewForceUser());
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
	    		       UserInPrinterACLDataContainerImpl source = (UserInPrinterACLDataContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_CurrentForceUser().copyFrom(source.get_usr_CurrentForceUser());
		        		   get_usr_NewForceUser().copyFrom(source.get_usr_NewForceUser());
		    		
    	    		   List<UserACLItemDataContainerForPrinter> targetListForUsers = getUsers();
    		   List<UserACLItemDataContainerForPrinter> sourceListForUsers = source.getUsers();
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