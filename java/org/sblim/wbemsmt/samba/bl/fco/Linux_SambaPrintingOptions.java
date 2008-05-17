/** 
 * Linux_SambaPrintingOptions.java
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

public class Linux_SambaPrintingOptions extends CIM_SettingData {

    public final static String CIM_CLASS_NAME = "Linux_SambaPrintingOptions";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property CupsOptions
     * 
     */
    public static class PROPERTY_CUPSOPTIONS {
        /**
         * name of the property CupsOptions
         */
        public final static String NAME = "CupsOptions";

    }

    /**
     * Constants of property DefaultDevMode
     * 
     */
    public static class PROPERTY_DEFAULTDEVMODE {
        /**
         * name of the property DefaultDevMode
         */
        public final static String NAME = "DefaultDevMode";

    }

    /**
     * Constants of property MaxPrintjobs
     * 
     */
    public static class PROPERTY_MAXPRINTJOBS {
        /**
         * name of the property MaxPrintjobs
         */
        public final static String NAME = "MaxPrintjobs";

    }

    /**
     * Constants of property MaxReportedPrintjobs
     * 
     */
    public static class PROPERTY_MAXREPORTEDPRINTJOBS {
        /**
         * name of the property MaxReportedPrintjobs
         */
        public final static String NAME = "MaxReportedPrintjobs";

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

    /**
     * Constants of property PrintCommand
     * 
     */
    public static class PROPERTY_PRINTCOMMAND {
        /**
         * name of the property PrintCommand
         */
        public final static String NAME = "PrintCommand";

    }

    /**
     * Constants of property UseClientDriver
     * 
     */
    public static class PROPERTY_USECLIENTDRIVER {
        /**
         * name of the property UseClientDriver
         */
        public final static String NAME = "UseClientDriver";

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

    protected Linux_SambaPrintingOptions(WBEMClient client, String namespace)
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

    protected Linux_SambaPrintingOptions(CIMInstance cimInstance) throws WbemsmtException {

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
    protected Linux_SambaPrintingOptions() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("CupsOptions", new CIMProperty("CupsOptions", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("DefaultDevMode", new CIMProperty("DefaultDevMode",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("MaxPrintjobs", new CIMProperty("MaxPrintjobs", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("MaxReportedPrintjobs", new CIMProperty("MaxReportedPrintjobs",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Name", new CIMProperty("Name", CIMDataType.STRING_T, null));
        propertiesToCheck.put("PrintCommand", new CIMProperty("PrintCommand", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("UseClientDriver", new CIMProperty("UseClientDriver",
                CIMDataType.BOOLEAN_T, null));

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
     * Get the property CupsOptions
     *     * <br>
     * 
     *     */

    public String get_CupsOptions() {
        CIMProperty currentProperty = getProperty(PROPERTY_CUPSOPTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CUPSOPTIONS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property CupsOptions
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CupsOptions(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CUPSOPTIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CupsOptions(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CUPSOPTIONS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CupsOptions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CupsOptions(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        Linux_SambaPrintingOptions fco = new Linux_SambaPrintingOptions(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CUPSOPTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_CupsOptions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CUPSOPTIONS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CupsOptions
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_CupsOptions(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property DefaultDevMode
     *     * <br>
     * 
     *     */

    public Boolean get_DefaultDevMode() {
        CIMProperty currentProperty = getProperty(PROPERTY_DEFAULTDEVMODE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEFAULTDEVMODE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property DefaultDevMode
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DefaultDevMode(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEFAULTDEVMODE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_DefaultDevMode(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEFAULTDEVMODE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DefaultDevMode by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DefaultDevMode(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        Linux_SambaPrintingOptions fco = new Linux_SambaPrintingOptions(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEFAULTDEVMODE.NAME);
        if (property != null) {
            property = setPropertyValue_DefaultDevMode(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEFAULTDEVMODE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DefaultDevMode
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_DefaultDevMode(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MaxPrintjobs
     *     * <br>
     * 
     *     */

    public javax.cim.UnsignedInteger64 get_MaxPrintjobs() {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXPRINTJOBS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MAXPRINTJOBS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property MaxPrintjobs
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MaxPrintjobs(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXPRINTJOBS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MaxPrintjobs(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MAXPRINTJOBS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MaxPrintjobs by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MaxPrintjobs(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        Linux_SambaPrintingOptions fco = new Linux_SambaPrintingOptions(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAXPRINTJOBS.NAME);
        if (property != null) {
            property = setPropertyValue_MaxPrintjobs(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MAXPRINTJOBS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MaxPrintjobs
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_MaxPrintjobs(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MaxReportedPrintjobs
     *     * <br>
     * 
     *     */

    public javax.cim.UnsignedInteger64 get_MaxReportedPrintjobs() {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXREPORTEDPRINTJOBS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MAXREPORTEDPRINTJOBS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property MaxReportedPrintjobs
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MaxReportedPrintjobs(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXREPORTEDPRINTJOBS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MaxReportedPrintjobs(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MAXREPORTEDPRINTJOBS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MaxReportedPrintjobs by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MaxReportedPrintjobs(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        Linux_SambaPrintingOptions fco = new Linux_SambaPrintingOptions(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAXREPORTEDPRINTJOBS.NAME);
        if (property != null) {
            property = setPropertyValue_MaxReportedPrintjobs(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MAXREPORTEDPRINTJOBS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MaxReportedPrintjobs
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_MaxReportedPrintjobs(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
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
            currentProperty = setPropertyValue_key_Name(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
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
        Linux_SambaPrintingOptions fco = new Linux_SambaPrintingOptions(client, namespace);
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

    /**
     * Get the property PrintCommand
     *     * <br>
     * 
     *     */

    public String get_PrintCommand() {
        CIMProperty currentProperty = getProperty(PROPERTY_PRINTCOMMAND.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PRINTCOMMAND.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property PrintCommand
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PrintCommand(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PRINTCOMMAND.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PrintCommand(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PRINTCOMMAND.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PrintCommand by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PrintCommand(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        Linux_SambaPrintingOptions fco = new Linux_SambaPrintingOptions(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PRINTCOMMAND.NAME);
        if (property != null) {
            property = setPropertyValue_PrintCommand(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PRINTCOMMAND.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PrintCommand
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_PrintCommand(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UseClientDriver
     *     * <br>
     * 
     *     */

    public Boolean get_UseClientDriver() {
        CIMProperty currentProperty = getProperty(PROPERTY_USECLIENTDRIVER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_USECLIENTDRIVER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property UseClientDriver
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UseClientDriver(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_USECLIENTDRIVER.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_UseClientDriver(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_USECLIENTDRIVER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UseClientDriver by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UseClientDriver(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        Linux_SambaPrintingOptions fco = new Linux_SambaPrintingOptions(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_USECLIENTDRIVER.NAME);
        if (property != null) {
            property = setPropertyValue_UseClientDriver(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_USECLIENTDRIVER.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UseClientDriver
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_UseClientDriver(CIMProperty currentProperty,
            Boolean newValue) {
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
        return Linux_SambaPrintingOptions.CIM_CLASS_NAME;
    }

}