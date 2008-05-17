/** 
 * ServiceWinsDataContainer.java
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
 * Description: Container for WINS Options
 * 
 * generated Class
 */

package org.sblim.wbemsmt.samba.bl.container.service;

public interface ServiceWinsDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer {
    /** 
     * Constants for Fields and Roles
     **/
    public static final String FIELD_DNS_PROXY = "DNS_Proxy";
    public static final String FIELD_WINSHOOK = "WINSHook";
    public static final String FIELD_WINSPROXY = "WINSProxy";
    public static final String FIELD_WINSSERVER = "WINSServer";
    public static final String FIELD_WINSSUPPORT = "WINSSupport";

    /** 
     * Defined Fields
     **/

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaWinsOptions.get_DNS_Proxy<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DNS_Proxy();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaWinsOptions.get_WINSHook<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_WINSHook();

    /**
     * <br>
     * DataType BOOLEAN<br>
     * UIType CHECKBOX<br>
     * Relation to FCO: Linux_SambaWinsOptions.get_WINSProxy<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_WINSProxy();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaWinsOptions.get_WINSServer<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_WINSServer();

    /**
     * <br>
     * DataType BOOLEAN<br>
     * UIType CHECKBOX<br>
     * Relation to FCO: Linux_SambaWinsOptions.get_WINSSupport<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_WINSSupport();

    /** 
     * Linked DataContainers
     **/

}