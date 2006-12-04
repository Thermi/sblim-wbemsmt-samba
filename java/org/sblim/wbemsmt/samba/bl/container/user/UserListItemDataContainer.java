/** 
  * UserListItemDataContainer.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
  * @template: ./tools-dcg/templates/containerClass.vm
  *
  * Contributors: 
  * 
  * Description: user within a list of users
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.container.user;

public interface UserListItemDataContainer extends org.sblim.wbemsmt.samba.bl.container.user.UserDataContainer
{
	/** 
	 * Constants for Fields and Roles
	 **/
			public static final String FIELD_SAMBAUSERNAME = "SambaUserName" ;
			public static final String FIELD_SYSTEMUSERNAME = "SystemUserName" ;
			public static final String FIELD_USR_ISGUEST = "usr_IsGuest" ;
		
	
	/** 
	 * Defined Fields
	 **/
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType LABEL<br>
		* Relation to FCO: Linux_SambaUser.get_SambaUserName<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SambaUserName();
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType LABEL<br>
		* Relation to FCO: Linux_SambaUser.get_SystemUserName<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SystemUserName();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_IsGuest();
	
	
	/** 
	 * Linked DataContainers
	 **/
	 
	
	
}