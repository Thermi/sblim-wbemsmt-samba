/** 
  * UserListDataContainerImpl.java
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
  * Description: List with users
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.user;

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.container.user.UserListItemDataContainer;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;

public class UserListDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.user.UserListDataContainer
			, org.sblim.wbemsmt.samba.bl.container.user.UserListItemDataContainerHeader		
	{
				
				private java.util.List<UserListItemDataContainer> icUsers = new java.util.ArrayList<UserListItemDataContainer>();
		
		private MultiLinePanel usersPanel;
		private int usersCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_SambaUserName;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_SystemUserName;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_IsGuest;
				
	
		
	
	public UserListDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "UserListDataContainer.caption",false);
				
				
		
				
    			
    	    						
		setFooter(getPanelForCustomLayout(),"UserListDataContainer.footerText");
		adapter.initContainer(this);
	}
	

		
			
				
		/**
		* 
		* linked container UserListItemDataContainer
		*/
				public java.util.List<UserListItemDataContainer> getUsers()
				{
						return icUsers;
		}
		
		public MultiLinePanel getUsersPanel()
		{
			if (usersPanel == null)
			{
  			   usersPanel = new UsersPanel(adapter,expressionPrefix, // the prefix for binding values
							  "#{" +  expressionPrefix + "usersPanel", // binding for Title
							  "UserListItemDataContainer_AsUsers_InUserListDataContainer.caption", //Key for title
							  org.sblim.wbemsmt.jsf.samba.container.user.UserListItemDataContainer_AsUsers_InUserListDataContainerImpl.COLS);
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
				return org.sblim.wbemsmt.jsf.samba.container.user.UserListItemDataContainer_AsUsers_InUserListDataContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	private void addUsers(org.sblim.wbemsmt.jsf.samba.container.user.UserListItemDataContainer_AsUsers_InUserListDataContainerImpl child) {

		getUsers().add(child);
		getUsersPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getUsers_SambaUserNameHeader()).getDependentChildFields().add(child.get_SambaUserName());
					//((LabeledJSFInputComponent)getUsers_SystemUserNameHeader()).getDependentChildFields().add(child.get_SystemUserName());
					//((LabeledJSFInputComponent)getUsers_usr_IsGuestHeader()).getDependentChildFields().add(child.get_usr_IsGuest());
			}
	
	private void clearUsers() {
		getUsers().clear();
	}

	/**
	* 
	* Get the Users for the UI repesentation
	*/
	public java.util.List<UserListItemDataContainer> getUsersForUI()
	{
				
		List<UserListItemDataContainer> result = new ArrayList<UserListItemDataContainer>();
		result.addAll(icUsers);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.jsf.samba.container.user.UserListItemDataContainer_AsUsers_InUserListDataContainerImpl item = new org.sblim.wbemsmt.jsf.samba.container.user.UserListItemDataContainer_AsUsers_InUserListDataContainerImpl((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)adapter,expressionPrefix, result.size());
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
							(LabeledJSFInputComponent)getUsersHeader_SystemUserName(),
							(LabeledJSFInputComponent)getUsersHeader_usr_IsGuest(),
						};
	}

	private String[] getUsersFieldNames() {
		return new String[]{
							"_SambaUserName",
							"_SystemUserName",
							"_usr_IsGuest",
						};
	}

	   /**
		* Header for:
		* 
		* linked container UserListItemDataContainer
		*/
		public org.sblim.wbemsmt.samba.bl.container.user.UserListItemDataContainerHeader getUsersHeader()
		{
			return this;
		}
		
				/**
   		 * Header for field SambaUserName
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_SambaUserName() {
    		if (icUsersHeader_SambaUserName == null)
    		{
				String label = bundle.getString("UserListItemDataContainer.SambaUserName");
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
   		 * Header for field SystemUserName
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_SystemUserName() {
    		if (icUsersHeader_SystemUserName == null)
    		{
				String label = bundle.getString("UserListItemDataContainer.SystemUserName");
				String binding = expressionPrefix + "usersHeader_SystemUserName.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			icUsersHeader_SystemUserName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icUsersHeader_SystemUserName).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icUsersHeader_SystemUserName).setHeader(true);
			
    		return icUsersHeader_SystemUserName;
    	}
				/**
   		 * Header for field isGuest
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_IsGuest() {
    		if (icUsersHeader_usr_IsGuest == null)
    		{
				String label = bundle.getString("UserListItemDataContainer.isGuest");
				String binding = expressionPrefix + "usersHeader_usr_IsGuest.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icUsersHeader_usr_IsGuest = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icUsersHeader_usr_IsGuest).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icUsersHeader_usr_IsGuest).setHeader(true);
			
    		return icUsersHeader_usr_IsGuest;
    	}
		
	
		
	public void reload()
	{
		super.reload();
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesSamba"};
	}

	public void countAndCreateChildren() throws WbemsmtException {
	
    			try
		{
			int count = adapter.count("users",org.sblim.wbemsmt.samba.bl.container.user.UserListItemDataContainer.class, this);
	        if (count != usersCount)
	        {
	           usersCount = count;
	           clearUsers();
			   for (int i=0; i < count ; i++) {
	    			addUsers(new org.sblim.wbemsmt.jsf.samba.container.user.UserListItemDataContainer_AsUsers_InUserListDataContainerImpl((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)adapter,expressionPrefix, i));
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
	    		       UserListDataContainerImpl source = (UserListDataContainerImpl)sourceContainer;
		    		    
    			
    	    		   List<UserListItemDataContainer> targetListForUsers = getUsers();
    		   List<UserListItemDataContainer> sourceListForUsers = source.getUsers();
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