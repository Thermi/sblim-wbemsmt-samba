/**
 * UserACLItemDataContainerForPrinter.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED
 * UNDER THE TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR
 * DISTRIBUTION OF THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a
 * current copy of the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Container representing a user's acl within a
 *            printer generated Class
 */

package org.sblim.wbemsmt.samba.bl.container.printer;

public interface UserACLItemDataContainerForPrinter extends
        org.sblim.wbemsmt.bl.adapter.DataContainer {
    /** 
     * Constants for Fields and Roles
     **/
    public static final String FIELD_SAMBAUSERNAME = "SambaUserName";
    public static final String FIELD_USR_ACCESSTYPEVI = "usr_AccessTypeVI";
    public static final String FIELD_USR_ACCESSTYPERW = "usr_AccessTypeRW";
    public static final String FIELD_USR_ADMIN = "usr_Admin";

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
     * relates to<br> Linux_SambaReadListForShare<br> Linux_SambaWriteListForShare<br> Linux_SambaInvalidUsersForShare<br> Linux_SambaValidUsersForShare<br> <br>
     * DataType UNSIGNED_INT16<br>
     * UIType RADIOBUTTON<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_AccessTypeVI();

    /**
     * relates to<br> Linux_SambaReadListForShare<br> Linux_SambaWriteListForShare<br> Linux_SambaInvalidUsersForShare<br> Linux_SambaValidUsersForShare<br> <br>
     * DataType UNSIGNED_INT16<br>
     * UIType RADIOBUTTON<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_AccessTypeRW();

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