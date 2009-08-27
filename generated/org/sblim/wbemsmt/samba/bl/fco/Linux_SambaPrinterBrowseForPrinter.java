/**
 * Linux_SambaPrinterBrowseForPrinter.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED
 * UNDER THE TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR
 * DISTRIBUTION OF THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a
 * current copy of the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.samba.bl.fco;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

import org.sblim.wbemsmt.schema.cim221.*;

public class Linux_SambaPrinterBrowseForPrinter extends CIM_ElementSettingData {

    public final static String CIM_CLASS_NAME = "Linux_SambaPrinterBrowseForPrinter";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ManagedElement
     * 
     */
    public static class PROPERTY_MANAGEDELEMENT_LINUX_SAMBAPRINTEROPTIONS {
        /**
         * name of the property ManagedElement
         */
        public final static String NAME = "ManagedElement";

    }

    /**
     * Constants of property SettingData
     * 
     */
    public static class PROPERTY_SETTINGDATA_LINUX_SAMBAPRINTERBROWSEOPTIONS {
        /**
         * name of the property SettingData
         */
        public final static String NAME = "SettingData";

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

    public Linux_SambaPrinterBrowseForPrinter(WBEMClient client, String namespace)
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

    public Linux_SambaPrinterBrowseForPrinter(CIMInstance cimInstance) throws WbemsmtException {

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
    protected Linux_SambaPrinterBrowseForPrinter() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ManagedElement", new CIMProperty("ManagedElement", new CIMDataType(
                Linux_SambaPrinterOptions.CIM_CLASS_NAME), null));
        propertiesToCheck.put("SettingData", new CIMProperty("SettingData", new CIMDataType(
                Linux_SambaPrinterBrowseOptions.CIM_CLASS_NAME), null));

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
     * Get the property ManagedElement
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public Linux_SambaPrinterOptions get_ManagedElement_Linux_SambaPrinterOptions(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_MANAGEDELEMENT_LINUX_SAMBAPRINTEROPTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_LINUX_SAMBAPRINTEROPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return Linux_SambaPrinterOptionsHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property ManagedElement
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ManagedElement_Linux_SambaPrinterOptions(Linux_SambaPrinterOptions newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MANAGEDELEMENT_LINUX_SAMBAPRINTEROPTIONS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ManagedElement_Linux_SambaPrinterOptions(currentProperty,
                    newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_LINUX_SAMBAPRINTEROPTIONS.NAME
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

    public static CIMProperty create_ManagedElement_Linux_SambaPrinterOptions(WBEMClient client,
            String namespace, Linux_SambaPrinterOptions newValue) throws WbemsmtException {
        Linux_SambaPrinterBrowseForPrinter fco = new Linux_SambaPrinterBrowseForPrinter(client,
                namespace);
        CIMProperty property = fco
                .getProperty(PROPERTY_MANAGEDELEMENT_LINUX_SAMBAPRINTEROPTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_ManagedElement_Linux_SambaPrinterOptions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_LINUX_SAMBAPRINTEROPTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ManagedElement
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_ManagedElement_Linux_SambaPrinterOptions(
            CIMProperty currentProperty, Linux_SambaPrinterOptions newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SettingData
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public Linux_SambaPrinterBrowseOptions get_SettingData_Linux_SambaPrinterBrowseOptions(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_SETTINGDATA_LINUX_SAMBAPRINTERBROWSEOPTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SETTINGDATA_LINUX_SAMBAPRINTERBROWSEOPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return Linux_SambaPrinterBrowseOptionsHelper.getInstance(client,
                (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property SettingData
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SettingData_Linux_SambaPrinterBrowseOptions(
            Linux_SambaPrinterBrowseOptions newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SETTINGDATA_LINUX_SAMBAPRINTERBROWSEOPTIONS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_SettingData_Linux_SambaPrinterBrowseOptions(
                    currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SETTINGDATA_LINUX_SAMBAPRINTERBROWSEOPTIONS.NAME
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

    public static CIMProperty create_SettingData_Linux_SambaPrinterBrowseOptions(WBEMClient client,
            String namespace, Linux_SambaPrinterBrowseOptions newValue) throws WbemsmtException {
        Linux_SambaPrinterBrowseForPrinter fco = new Linux_SambaPrinterBrowseForPrinter(client,
                namespace);
        CIMProperty property = fco
                .getProperty(PROPERTY_SETTINGDATA_LINUX_SAMBAPRINTERBROWSEOPTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_SettingData_Linux_SambaPrinterBrowseOptions(property,
                    newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SETTINGDATA_LINUX_SAMBAPRINTERBROWSEOPTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SettingData
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_SettingData_Linux_SambaPrinterBrowseOptions(
            CIMProperty currentProperty, Linux_SambaPrinterBrowseOptions newValue) {
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
        return Linux_SambaPrinterBrowseForPrinter.CIM_CLASS_NAME;
    }

}