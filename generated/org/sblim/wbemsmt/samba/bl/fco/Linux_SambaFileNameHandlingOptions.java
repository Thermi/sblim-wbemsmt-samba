/**
 * Linux_SambaFileNameHandlingOptions.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED
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

public class Linux_SambaFileNameHandlingOptions extends CIM_SettingData {

    public final static String CIM_CLASS_NAME = "Linux_SambaFileNameHandlingOptions";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property CaseSensitive
     * 
     */
    public static class PROPERTY_CASESENSITIVE {
        /**
         * name of the property CaseSensitive
         */
        public final static String NAME = "CaseSensitive";

    }

    /**
     * Constants of property DosFiletimes
     * 
     */
    public static class PROPERTY_DOSFILETIMES {
        /**
         * name of the property DosFiletimes
         */
        public final static String NAME = "DosFiletimes";

    }

    /**
     * Constants of property HideDotFiles
     * 
     */
    public static class PROPERTY_HIDEDOTFILES {
        /**
         * name of the property HideDotFiles
         */
        public final static String NAME = "HideDotFiles";

    }

    /**
     * Constants of property Name
     * 
     */
    public static class PROPERTY_NAME {
        /**
         * name of the property Name
         */
        public final static String NAME = "Name";

    }

    static {
        addPackage("org.sblim.wbemsmt.samba.bl.fco");
        String[] parentClassPackageList = CIM_SettingData.getPackages();

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
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    protected Linux_SambaFileNameHandlingOptions(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   
     *   @param cimInstance the instance that is used to create the Object
     */

    protected Linux_SambaFileNameHandlingOptions(CIMInstance cimInstance) throws WbemsmtException {

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
    protected Linux_SambaFileNameHandlingOptions() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("CaseSensitive", new CIMProperty("CaseSensitive",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("DosFiletimes", new CIMProperty("DosFiletimes",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("HideDotFiles", new CIMProperty("HideDotFiles",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("Name", new CIMProperty("Name", CIMDataType.STRING_T, null));

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
     * Get the property CaseSensitive
     *     * <br>
     * 
     *     */

    public Boolean get_CaseSensitive() {
        CIMProperty currentProperty = getProperty(PROPERTY_CASESENSITIVE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CASESENSITIVE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property CaseSensitive
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CaseSensitive(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CASESENSITIVE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_CaseSensitive(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CASESENSITIVE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CaseSensitive by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CaseSensitive(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        Linux_SambaFileNameHandlingOptions fco = new Linux_SambaFileNameHandlingOptions(client,
                namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CASESENSITIVE.NAME);
        if (property != null) {
            property = setPropertyValue_CaseSensitive(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CASESENSITIVE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CaseSensitive
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_CaseSensitive(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property DosFiletimes
     *     * <br>
     * 
     *     */

    public Boolean get_DosFiletimes() {
        CIMProperty currentProperty = getProperty(PROPERTY_DOSFILETIMES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DOSFILETIMES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property DosFiletimes
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DosFiletimes(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DOSFILETIMES.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_DosFiletimes(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DOSFILETIMES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DosFiletimes by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DosFiletimes(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        Linux_SambaFileNameHandlingOptions fco = new Linux_SambaFileNameHandlingOptions(client,
                namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DOSFILETIMES.NAME);
        if (property != null) {
            property = setPropertyValue_DosFiletimes(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DOSFILETIMES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DosFiletimes
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_DosFiletimes(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property HideDotFiles
     *     * <br>
     * 
     *     */

    public Boolean get_HideDotFiles() {
        CIMProperty currentProperty = getProperty(PROPERTY_HIDEDOTFILES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_HIDEDOTFILES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property HideDotFiles
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_HideDotFiles(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_HIDEDOTFILES.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_HideDotFiles(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_HIDEDOTFILES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property HideDotFiles by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_HideDotFiles(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        Linux_SambaFileNameHandlingOptions fco = new Linux_SambaFileNameHandlingOptions(client,
                namespace);
        CIMProperty property = fco.getProperty(PROPERTY_HIDEDOTFILES.NAME);
        if (property != null) {
            property = setPropertyValue_HideDotFiles(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_HIDEDOTFILES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property HideDotFiles
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_HideDotFiles(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Name
     *     * <br>
     * 
     *     */

    public String get_key_Name() {
        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Name
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_Name(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_key_Name(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Name by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_Name(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        Linux_SambaFileNameHandlingOptions fco = new Linux_SambaFileNameHandlingOptions(client,
                namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_Name(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Name
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_key_Name(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

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
        return Linux_SambaFileNameHandlingOptions.CIM_CLASS_NAME;
    }

}