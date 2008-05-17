/** 
 * WelcomeDataContainer.java
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
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.samba.bl.container.welcome;

public interface WelcomeDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer {
    /** 
     * Constants for Fields and Roles
     **/
    public static final String FIELD_USR_WELCOMETEXT = "usr_WelcomeText";
    public static final String FIELD_USR_SHAREPICTURE = "usr_SharePicture";
    public static final String FIELD_USR_LINKCREATESHARE = "usr_LinkCreateShare";
    public static final String FIELD_USR_MEMO = "usr_Memo";
    public static final String FIELD_USR_LINKCREATEPRINTER = "usr_LinkCreatePrinter";
    public static final String FIELD_USR_LINKCREATEUSER = "usr_LinkCreateUser";
    public static final String FIELD_USR_ACTIONS = "usr_Actions";

    /** 
     * Defined Fields
     **/

    /**
     * <br>
     * DataType STRING<br>
     * UIType LABEL<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_WelcomeText();

    /**
     * <br>
     * DataType PICTUREDATA<br>
     * UIType PICTURE<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_SharePicture();

    /**
     * <br>
     * DataType LINKDATA<br>
     * UIType LINK<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_LinkCreateShare();

    /**
     * <br>
     * DataType MEMODATA<br>
     * UIType MEMO<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Memo();

    /**
     * <br>
     * DataType LINKDATA<br>
     * UIType LINK<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_LinkCreatePrinter();

    /**
     * <br>
     * DataType LINKDATA<br>
     * UIType LINK<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_LinkCreateUser();

    /**
     * <br>
     * DataType STRING<br>
     * UIType LABEL<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Actions();

    /** 
     * Linked DataContainers
     **/

}