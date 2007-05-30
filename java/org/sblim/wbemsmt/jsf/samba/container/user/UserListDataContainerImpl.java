/** 
  * UserListDataContainerImpl.java
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
  * Description: List with users
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.user;

import org.sblim.wbemsmt.exception.*;
import java.util.*;

//imports for that field of a linked container with occurence = MANY
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class UserListDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.user.UserListDataContainer {

				
				private java.util.List icUsers = new java.util.ArrayList();
		
		private MultiLinePanel usersPanel;

				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icUsers_SambaUserNameHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icUsers_SystemUserNameHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icUsers_usr_IsGuestHeader;
				
	
		
	
	public UserListDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {

			
				super(adapter,bindingPrefix, "UserListDataContainer.caption",false);
				
				
		
				
    			
    	    						
		setFooter(getPanelForCustomLayout(),"UserListDataContainer.footerText");
		adapter.initContainer(this);
	}
	

		
			
				
		/**
		* 
		* linked container UserListItemDataContainer
		*/
		public java.util.List getUsers()
		{
						return icUsers;
		}
		
		public MultiLinePanel getUsersPanel()
		{
			if (usersPanel == null)
			{
  			   usersPanel = new UsersPanel(adapter,bindingPrefix, // the prefix for binding values
							  "#{" +  bindingPrefix + "usersPanel", // binding for Title
							  "UserListItemDataContainer_AsUsers_InUserListDataContainer.caption", //Key for title
							  org.sblim.wbemsmt.jsf.samba.container.user.UserListItemDataContainer_AsUsers_InUserListDataContainerImpl.COLS);
			}		
			
			return usersPanel;
		}

		static class UsersPanel extends MultiLinePanel
		{
			public UsersPanel(AbstractBaseCimAdapter adapter, String bindingPrefix, String bindigForTitle, String keyForTitle, int cols) {
				super(adapter, bindingPrefix, bindigForTitle, keyForTitle, cols);
			}
	
			protected String getOrientationOfColumnAsCss(int column) {
				return org.sblim.wbemsmt.jsf.samba.container.user.UserListItemDataContainer_AsUsers_InUserListDataContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	public void addUsers(org.sblim.wbemsmt.jsf.samba.container.user.UserListItemDataContainer_AsUsers_InUserListDataContainerImpl child) {

		getUsers().add(child);
		getUsersPanel().addComponents(child.getComponents());
		
					((LabeledJSFInputComponent)getUsers_SambaUserNameHeader()).getDependentChildFields().add(child.get_SambaUserName());
					((LabeledJSFInputComponent)getUsers_SystemUserNameHeader()).getDependentChildFields().add(child.get_SystemUserName());
					((LabeledJSFInputComponent)getUsers_usr_IsGuestHeader()).getDependentChildFields().add(child.get_usr_IsGuest());
		
		
	}

	public void clearUsers() {
		getUsers().clear();
		getUsersPanel().getInputFieldContainer().getChildren().clear();
					((LabeledJSFInputComponent)getUsers_SambaUserNameHeader()).getDependentChildFields().clear();
					((LabeledJSFInputComponent)getUsers_SystemUserNameHeader()).getDependentChildFields().clear();
					((LabeledJSFInputComponent)getUsers_usr_IsGuestHeader()).getDependentChildFields().clear();
			}

	public void addUsersHeader() {
		getUsersPanel().setHeader(getUsersHeaderComponents());
	}
	
	private LabeledJSFInputComponent[] getUsersHeaderComponents() {
		return new LabeledJSFInputComponent[]{
							(LabeledJSFInputComponent)getUsers_SambaUserNameHeader(),
							(LabeledJSFInputComponent)getUsers_SystemUserNameHeader(),
							(LabeledJSFInputComponent)getUsers_usr_IsGuestHeader(),
						};
	}

			/**
   		 * Header for field SambaUserName
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getUsers_SambaUserNameHeader() {
    		if (icUsers_SambaUserNameHeader == null)
    		{
				String label = bundle.getString("UserListItemDataContainer.SambaUserName");
				String binding = bindingPrefix + "users_SambaUserNameHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			icUsers_SambaUserNameHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icUsers_SambaUserNameHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icUsers_SambaUserNameHeader).setHeader(true);
			
    		return icUsers_SambaUserNameHeader;
    	}
			/**
   		 * Header for field SystemUserName
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getUsers_SystemUserNameHeader() {
    		if (icUsers_SystemUserNameHeader == null)
    		{
				String label = bundle.getString("UserListItemDataContainer.SystemUserName");
				String binding = bindingPrefix + "users_SystemUserNameHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			icUsers_SystemUserNameHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icUsers_SystemUserNameHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icUsers_SystemUserNameHeader).setHeader(true);
			
    		return icUsers_SystemUserNameHeader;
    	}
			/**
   		 * Header for field isGuest
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getUsers_usr_IsGuestHeader() {
    		if (icUsers_usr_IsGuestHeader == null)
    		{
				String label = bundle.getString("UserListItemDataContainer.isGuest");
				String binding = bindingPrefix + "users_usr_IsGuestHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icUsers_usr_IsGuestHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icUsers_usr_IsGuestHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icUsers_usr_IsGuestHeader).setHeader(true);
			
    		return icUsers_usr_IsGuestHeader;
    	}
	
	
		
	public void reload()
	{
		super.reload();
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
	
	public void copyFrom(DataContainer sourceContainer)
	{
		UserListDataContainerImpl source = (UserListDataContainerImpl)sourceContainer;
	
    			
    	    		List targetListForUsers = (List) getUsers();
    		List sourceListForUsers = (List) source.getUsers();
    		if (sourceListForUsers.size() != targetListForUsers.size())
    		{
    			throw new IllegalArgumentException("The Lists are not from same size. Source is " + sourceListForUsers.size() + " and target is " + targetListForUsers.size() );
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