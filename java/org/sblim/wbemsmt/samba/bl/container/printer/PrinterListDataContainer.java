/** 
 * PrinterListDataContainer.java
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
 * Description: List with printers
 * 
 * generated Class
 */

package org.sblim.wbemsmt.samba.bl.container.printer;

public interface PrinterListDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer {
    /** 
     * Constants for Fields and Roles
     **/
    public static final String ROLE_PRINTERS = "printers";

    /** 
     * Defined Fields
     **/

    /** 
     * Linked DataContainers
     **/

    /**
     * 
     * linked container PrinterListItemDataContainer
     */

    public java.util.List getPrinters();

    /**
     * Header for:
     * 
     * linked container PrinterListItemDataContainer
     */
    public org.sblim.wbemsmt.samba.bl.container.printer.PrinterListItemDataContainerHeader getPrintersHeader();

}