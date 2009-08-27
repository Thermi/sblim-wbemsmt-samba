/**
 * PrinterListDataContainer.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE
 * TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS
 * FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the
 * Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/headerClass.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: List with printers Header for: linked
 *            container PrinterListItemDataContainer
 */

package org.sblim.wbemsmt.samba.bl.container.printer;

public interface PrinterListItemDataContainerHeader {
    /**
     * Header for
     * <br>
     * DataType STRING<br>
     * UIType LABEL<br>
     * Relation to FCO: Linux_SambaPrinterOptions.get_Name<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_Name();

    /**
     * Header for
     * <br>
     * DataType UNSIGNED_INT16<br>
     * UIType COMBOBOX<br>
     * Relation to FCO: Linux_SambaPrinterOptions.get_SystemPrinterName<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_usr_SystemPrinterName();

    /**
     * Header for
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaPrinterOptions.get_Path<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_Path();

    /**
     * Header for
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaPrinterOptions.get_Comment<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_Comment();

    /**
     * Header for
     * <br>
     * DataType BOOLEAN<br>
     * UIType CHECKBOX<br>
     * Relation to FCO: Linux_SambaPrinterOptions.get_Available<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_Available();

    /**
     * Header for
     * <br>
     * DataType BOOLEAN<br>
     * UIType CHECKBOX<br>
     * Relation to FCO: Linux_SambaCommonSecurityOptions.get_GuestOK<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_GuestOK();

    /**
     * Header for
     * <br>
     * DataType BOOLEAN<br>
     * UIType CHECKBOX<br>
     * Relation to FCO: Linux_SambaCommonSecurityOptions.get_GuestOnly<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_GuestOnly();

    /**
     * Header for
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaCommonSecurityOptions.get_HostsAllow<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_HostsAllow();

    /**
     * Header for
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaCommonSecurityOptions.get_HostsDeny<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_HostsDeny();

    /**
     * Header for
     * <br>
     * DataType BOOLEAN<br>
     * UIType CHECKBOX<br>
     * Relation to FCO: Linux_SambaCommonSecurityOptions.get_ReadOnly<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_ReadOnly();

    /**
     * Header for
     * <br>
     * DataType BOOLEAN<br>
     * UIType CHECKBOX<br>
     * Relation to FCO: Linux_SambaSharePrinterBrowseOptions.get_Browsable<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_Browsable();
}