/** 
 * PrinterWizardPage4.java
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

package org.sblim.wbemsmt.samba.bl.container.wizard;

public interface PrinterWizardPage4 extends org.sblim.wbemsmt.bl.adapter.DataContainer {
    /** 
     * Constants for Fields and Roles
     **/
    public static final String FIELD_CUPSOPTIONS = "CupsOptions";
    public static final String FIELD_PRINTCOMMAND = "PrintCommand";

    /** 
     * Defined Fields
     **/

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaPrinterPrintingOptions.get_CupsOptions<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_CupsOptions();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaPrinterPrintingOptions.get_PrintCommand<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_PrintCommand();

    /** 
     * Linked DataContainers
     **/

}