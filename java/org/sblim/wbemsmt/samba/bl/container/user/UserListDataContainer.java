/** 
 * UserListDataContainer.java
 *
 * 
 * © Copyright IBM Corp. 2006,2007
 *
 * THIS FILE IS PROVIDED UNDER THE TER	MS OF THE COMMON PUBLIC LICENSE
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Common Public License from
 * http://www.opensource.org/licenses/cpl1.0.php
 *
 * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm
 *
 * Contributors: 
 *   michael.bauschert@de.ibm.com
 * 
 * Description: List with users
 * 
 * generated Class
 */

package org.sblim.wbemsmt.samba.bl.container.user;

public interface UserListDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer {
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

    public java.util.List getUsers();

    /**
     * Header for:
     * 
     * linked container UserListItemDataContainer
     */
    public org.sblim.wbemsmt.samba.bl.container.user.UserListItemDataContainerHeader getUsersHeader();

}