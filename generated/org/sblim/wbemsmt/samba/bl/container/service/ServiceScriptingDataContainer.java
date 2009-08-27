/**
 * ServiceScriptingDataContainer.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER
 * THE TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF
 * THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of
 * the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Container to Scripting Options generated
 *            Class
 */

package org.sblim.wbemsmt.samba.bl.container.service;

public interface ServiceScriptingDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer {
    /** 
     * Constants for Fields and Roles
     **/
    public static final String FIELD_ADDGROUPSCRIPT = "AddGroupScript";
    public static final String FIELD_ADDPRINTERCOMMAND = "AddPrinterCommand";
    public static final String FIELD_ADDSHARECOMMAND = "AddShareCommand";
    public static final String FIELD_ADDUSERSCRIPT = "AddUserScript";
    public static final String FIELD_ADDUSERTOGROUPSCRIPT = "AddUsertoGroupScript";
    public static final String FIELD_DELETEGROUPSCRIPT = "DeleteGroupScript";
    public static final String FIELD_DELETEUSERSCRIPT = "DeleteUserScript";
    public static final String FIELD_DELETEUSERFROMGROUPSCRIPT = "DeleteUserfromGroupScript";
    public static final String FIELD_SETPRIMARYGROUPSCRIPT = "SetPrimaryGroupScript";

    /** 
     * Defined Fields
     **/

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaScriptingOptions.get_AddGroupScript<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_AddGroupScript();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaScriptingOptions.get_AddPrinterCommand<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_AddPrinterCommand();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaScriptingOptions.get_AddShareCommand<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_AddShareCommand();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaScriptingOptions.get_AddUserScript<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_AddUserScript();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaScriptingOptions.get_AddUsertoGroupScript<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_AddUsertoGroupScript();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaScriptingOptions.get_DeleteGrouprScript<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DeleteGroupScript();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaScriptingOptions.get_DeleteUserScript<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DeleteUserScript();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaScriptingOptions.get_DeleteUserfromGroupScript<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DeleteUserfromGroupScript();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaScriptingOptions.get_SetPrimaryGroupScript<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SetPrimaryGroupScript();

    /** 
     * Linked DataContainers
     **/

}