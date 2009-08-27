/** 
  * UserListDataContainer.java
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
  * Description: List with users
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.container.user;

public interface UserListDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer
{
	/** 
	 * Constants for Fields and Roles
	 **/
				public static final String ROLE_USERS = "users";
	
	
	/** 
	 * Defined Fields
	 **/
	
	
	/** 
	 * Linked DataContainers
	 **/
			
				
		/**
		* 
		* linked container UserListItemDataContainer
		*/

				
		public java.util.List<UserListItemDataContainer> getUsers();
		
		
	   		
	   /**
		* Header for:
		* 
		* linked container UserListItemDataContainer
		*/
		public  org.sblim.wbemsmt.samba.bl.container.user.UserListItemDataContainerHeader getUsersHeader();
		
			
}