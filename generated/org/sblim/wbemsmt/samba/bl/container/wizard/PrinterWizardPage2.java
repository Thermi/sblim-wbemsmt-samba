/**
 * PrinterWizardPage2.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS
 * OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.samba.bl.container.wizard;

public interface PrinterWizardPage2 extends org.sblim.wbemsmt.bl.adapter.DataContainer {
    /** 
     * Constants for Fields and Roles
     **/
    public static final String FIELD_SAMBAPRINTERNAME = "SambaPrinterName";
    public static final String FIELD_USR_SYSTEMPRINTERNAME = "usr_SystemPrinterName";
    public static final String FIELD_PATH = "Path";
    public static final String FIELD_COMMENT = "Comment";

    /** 
     * Defined Fields
     **/

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaPrinterOptions.get_Name<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SambaPrinterName();

    /**
     * maps to Linux_SambaPrinterOptions.get_SystemPrinterName<br>
     * DataType UNSIGNED_INT16<br>
     * UIType COMBOBOX<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_SystemPrinterName();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaPrinterOptions.get_Path<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Path();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaPrinterOptions.get_Comment<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Comment();

    /** 
     * Linked DataContainers
     **/

}