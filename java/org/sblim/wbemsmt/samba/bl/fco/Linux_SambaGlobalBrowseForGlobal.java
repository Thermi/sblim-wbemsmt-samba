/** 
 * Linux_SambaGlobalBrowseForGlobal.java
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
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm
 *
 * Contributors:
 *    michael.bauschert@de.ibm.com 
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.samba.bl.fco;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

import org.sblim.wbemsmt.schema.cim29.*;

public class Linux_SambaGlobalBrowseForGlobal extends CIM_ElementSettingData {

    public final static String CIM_CLASS_NAME = "Linux_SambaGlobalBrowseForGlobal";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property SettingData
     * 
     */
    public static class PROPERTY_SETTINGDATA_LINUX_SAMBAGLOBALBROWSEOPTIONS {
        /**
         * name of the property SettingData
         */
        public final static String NAME = "SettingData";

    }

    /**
     * Constants of property ManagedElement
     * 
     */
    public static class PROPERTY_MANAGEDELEMENT_LINUX_SAMBAGLOBALOPTIONS {
        /**
         * name of the property ManagedElement
         */
        public final static String NAME = "ManagedElement";

    }

    static {
        addPackage("org.sblim.wbemsmt.samba.bl.fco");
        String[] parentClassPackageList = CIM_ElementSettingData.getPackages();

        for (int i = 0; i < parentClassPackageList.length; i++) {
            addPackage(parentClassPackageList[i]);
        }

    };

    //**********************************************************************
    // Constructors     
    //**********************************************************************

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public Linux_SambaGlobalBrowseForGlobal(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   
     *   @param cimInstance the instance that is used to create the Object
     */

    public Linux_SambaGlobalBrowseForGlobal(CIMInstance cimInstance) throws WbemsmtException {

        if (cimInstance == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimInstance parameter does not contain a valid reference.");
        }
        setFromServer(true);
        init(cimInstance, false);
    }

    /**
     * Default constructor
     */
    protected Linux_SambaGlobalBrowseForGlobal() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("SettingData", new CIMProperty("SettingData", new CIMDataType(
                Linux_SambaGlobalBrowseOptions.CIM_CLASS_NAME), null));
        propertiesToCheck.put("ManagedElement", new CIMProperty("ManagedElement", new CIMDataType(
                Linux_SambaGlobalOptions.CIM_CLASS_NAME), null));

        super.init(cimInstance, overwrite);

        //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
        //we overwrite the dataType by setting null for every embeddedObject/Instance property
        if (overwrite) {

        }
    }

    //**********************************************************************
    // Properties get/set     
    //**********************************************************************

    /**
     * Get the property SettingData
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public Linux_SambaGlobalBrowseOptions get_SettingData_Linux_SambaGlobalBrowseOptions(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_SETTINGDATA_LINUX_SAMBAGLOBALBROWSEOPTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SETTINGDATA_LINUX_SAMBAGLOBALBROWSEOPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return Linux_SambaGlobalBrowseOptionsHelper.getInstance(client,
                (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property SettingData
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SettingData_Linux_SambaGlobalBrowseOptions(
            Linux_SambaGlobalBrowseOptions newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SETTINGDATA_LINUX_SAMBAGLOBALBROWSEOPTIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SettingData_Linux_SambaGlobalBrowseOptions(
                    currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SETTINGDATA_LINUX_SAMBAGLOBALBROWSEOPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SettingData by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SettingData_Linux_SambaGlobalBrowseOptions(WBEMClient client,
            String namespace, Linux_SambaGlobalBrowseOptions newValue) throws WbemsmtException {
        Linux_SambaGlobalBrowseForGlobal fco = new Linux_SambaGlobalBrowseForGlobal(client,
                namespace);
        CIMProperty property = fco
                .getProperty(PROPERTY_SETTINGDATA_LINUX_SAMBAGLOBALBROWSEOPTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_SettingData_Linux_SambaGlobalBrowseOptions(property,
                    newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SETTINGDATA_LINUX_SAMBAGLOBALBROWSEOPTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SettingData
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_SettingData_Linux_SambaGlobalBrowseOptions(
            CIMProperty currentProperty, Linux_SambaGlobalBrowseOptions newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ManagedElement
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public Linux_SambaGlobalOptions get_ManagedElement_Linux_SambaGlobalOptions(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_MANAGEDELEMENT_LINUX_SAMBAGLOBALOPTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_LINUX_SAMBAGLOBALOPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return Linux_SambaGlobalOptionsHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property ManagedElement
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ManagedElement_Linux_SambaGlobalOptions(Linux_SambaGlobalOptions newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MANAGEDELEMENT_LINUX_SAMBAGLOBALOPTIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ManagedElement_Linux_SambaGlobalOptions(
                    currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_LINUX_SAMBAGLOBALOPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ManagedElement by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ManagedElement_Linux_SambaGlobalOptions(WBEMClient client,
            String namespace, Linux_SambaGlobalOptions newValue) throws WbemsmtException {
        Linux_SambaGlobalBrowseForGlobal fco = new Linux_SambaGlobalBrowseForGlobal(client,
                namespace);
        CIMProperty property = fco
                .getProperty(PROPERTY_MANAGEDELEMENT_LINUX_SAMBAGLOBALOPTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_ManagedElement_Linux_SambaGlobalOptions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_LINUX_SAMBAGLOBALOPTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ManagedElement
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_ManagedElement_Linux_SambaGlobalOptions(
            CIMProperty currentProperty, Linux_SambaGlobalOptions newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    //**********************************************************************
    // Associators methods     
    //**********************************************************************

    //**********************************************************************
    // Extrinsic Method invocations     
    //**********************************************************************                         

    //**********************************************************************
    // utility methods     
    //**********************************************************************                         

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return Linux_SambaGlobalBrowseForGlobal.CIM_CLASS_NAME;
    }

}