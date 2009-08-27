/** 
  * UserInShareACLDataContainer.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.container.share;

public interface UserInShareACLDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer
{
	/** 
	 * Constants for Fields and Roles
	 **/
			public static final String FIELD_USR_NEWFORCEUSER = "usr_NewForceUser" ;
			public static final String FIELD_USR_CURRENTFORCEUSER = "usr_CurrentForceUser" ;
				public static final String ROLE_USERS = "users";
	
	
	/** 
	 * Defined Fields
	 **/
			
		/**
		* <br>
		* DataType UNSIGNED_INT16<br>
		* UIType COMBOBOX<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_NewForceUser();
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType LABEL<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_CurrentForceUser();
	
	
	/** 
	 * Linked DataContainers
	 **/
			
				
		/**
		* 
		* linked container UserACLItemDataContainerForShare
		*/

				
		public java.util.List<UserACLItemDataContainerForShare> getUsers();
		
		
	   		
	   /**
		* Header for:
		* 
		* linked container UserACLItemDataContainerForShare
		*/
		public  org.sblim.wbemsmt.samba.bl.container.share.UserACLItemDataContainerForShareHeader getUsersHeader();
		
			
}