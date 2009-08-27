/**
 * ServiceOptionsDataContainer.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE
 * TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS
 * FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the
 * Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Container for Setting Options on the Samba
 *            Service generated Class
 */

package org.sblim.wbemsmt.samba.bl.container.service;

public interface ServiceOptionsDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer {
    /** 
     * Constants for Fields and Roles
     **/
    public static final String FIELD_BINDINTERFACESONLY = "BindInterfacesOnly";
    public static final String FIELD_INTERFACES = "Interfaces";
    public static final String FIELD_NETBIOSALIAS = "NetbiosAlias";
    public static final String FIELD_NETBIOSNAME = "NetbiosName";
    public static final String FIELD_SERVERSTRING = "ServerString";
    public static final String FIELD_WORKGROUP = "Workgroup";
    public static final String FIELD_CONFIGURATIONFILE = "ConfigurationFile";

    /** 
     * Defined Fields
     **/

    /**
     * <br>
     * DataType BOOLEAN<br>
     * UIType CHECKBOX<br>
     * Relation to FCO: Linux_SambaGlobalOptions.get_BindInterfacesOnly<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_BindInterfacesOnly();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaGlobalOptions.get_Interfaces<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Interfaces();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaGlobalOptions.get_NetbiosAlias<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_NetbiosAlias();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaGlobalOptions.get_NetbiosName<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_NetbiosName();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaGlobalOptions.get_ServerString<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_ServerString();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaGlobalOptions.get_Workgroup<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Workgroup();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_SambaServiceConfiguration.get_ConfigurationFile<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_ConfigurationFile();

    /** 
     * Linked DataContainers
     **/

}