/** 
  * AdminUsersInShareGlobals.java
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
  * Description: container for admin Users in global share settings
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.container.global;

public interface AdminUsersInShareGlobals extends org.sblim.wbemsmt.samba.bl.container.global.UserIsAdminItem
{
	/** 
	 * Constants for Fields and Roles
	 **/
			public static final String FIELD_USR_SAMBAUSERNAME = "usr_SambaUserName" ;
			public static final String FIELD_USR_ADMIN = "usr_Admin" ;
		
	
	/** 
	 * Defined Fields
	 **/
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType LABEL<br>
		* Relation to FCO: Linux_SambaUser.get_SambaUserName<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_SambaUserName();
			
		/**
		* relates to Linux_SambaAdminUsersForShare<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Admin();
	
	
	/** 
	 * Linked DataContainers
	 **/
	 
	
	
}