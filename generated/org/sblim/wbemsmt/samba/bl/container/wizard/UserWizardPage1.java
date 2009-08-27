/**
 * UserWizardPage1.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS OF
 * THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.samba.bl.container.wizard;

public interface UserWizardPage1 extends org.sblim.wbemsmt.bl.adapter.DataContainer {
    /** 
     * Constants for Fields and Roles
     **/
    public static final String FIELD_SAMBAUSERNAME = "SambaUserName";
    public static final String FIELD_SYSTEMUSERNAME = "SystemUserName";
    public static final String FIELD_SAMBAUSERPASSWORD = "SambaUserPassword";
    public static final String FIELD_SAMBAUSERPASSWORD2 = "SambaUserPassword2";
    public static final String FIELD_USR_ISGUEST = "usr_IsGuest";

    /** 
     * Defined Fields
     **/

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaUser.get_SambaUserName<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SambaUserName();

    /**
     * <br>
     * DataType UNSIGNED_INT16<br>
     * UIType LIST<br>
     * Relation to FCO: Linux_SambaUser.get_SystemUserName<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_SystemUserName();

    /**
     * <br>
     * DataType STRING<br>
     * UIType PASSWORD<br>
     * Relation to FCO: Linux_SambaUser.get_SambaUserPassword<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SambaUserPassword();

    /**
     * <br>
     * DataType STRING<br>
     * UIType PASSWORD<br>
     * Relation to FCO: Linux_SambaUser.get_SambaUserPassword<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SambaUserPassword2();

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