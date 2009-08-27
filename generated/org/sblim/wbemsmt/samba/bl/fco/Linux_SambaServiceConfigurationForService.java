/**
 * Linux_SambaServiceConfigurationForService.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS
 * PROVIDED UNDER THE TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR
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

public class Linux_SambaServiceConfigurationForService extends CIM_ElementConfiguration {

    public final static String CIM_CLASS_NAME = "Linux_SambaServiceConfigurationForService";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Configuration
     * 
     */
    public static class PROPERTY_CONFIGURATION_LINUX_SAMBASERVICECONFIGURATION {
        /**
         * name of the property Configuration
         */
        public final static String NAME = "Configuration";

    }

    /**
     * Constants of property Element
     * 
     */
    public static class PROPERTY_ELEMENT_LINUX_SAMBASERVICE {
        /**
         * name of the property Element
         */
        public final static String NAME = "Element";

    }

    static {
        addPackage("org.sblim.wbemsmt.samba.bl.fco");
        String[] parentClassPackageList = CIM_ElementConfiguration.getPackages();

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

    public Linux_SambaServiceConfigurationForService(WBEMClient client, String namespace)
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

    public Linux_SambaServiceConfigurationForService(CIMInstance cimInstance)
            throws WbemsmtException {

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
    protected Linux_SambaServiceConfigurationForService() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Configuration", new CIMProperty("Configuration", new CIMDataType(
                Linux_SambaServiceConfiguration.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Element", new CIMProperty("Element", new CIMDataType(
                Linux_SambaService.CIM_CLASS_NAME), null));

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
     * Get the property Configuration
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public Linux_SambaServiceConfiguration get_Configuration_Linux_SambaServiceConfiguration(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_CONFIGURATION_LINUX_SAMBASERVICECONFIGURATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property "
                    + PROPERTY_CONFIGURATION_LINUX_SAMBASERVICECONFIGURATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return Linux_SambaServiceConfigurationHelper.getInstance(client,
                (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property Configuration
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Configuration_Linux_SambaServiceConfiguration(
            Linux_SambaServiceConfiguration newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CONFIGURATION_LINUX_SAMBASERVICECONFIGURATION.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Configuration_Linux_SambaServiceConfiguration(
                    currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property "
                    + PROPERTY_CONFIGURATION_LINUX_SAMBASERVICECONFIGURATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Configuration by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Configuration_Linux_SambaServiceConfiguration(
            WBEMClient client, String namespace, Linux_SambaServiceConfiguration newValue)
            throws WbemsmtException {
        Linux_SambaServiceConfigurationForService fco = new Linux_SambaServiceConfigurationForService(
                client, namespace);
        CIMProperty property = fco
                .getProperty(PROPERTY_CONFIGURATION_LINUX_SAMBASERVICECONFIGURATION.NAME);
        if (property != null) {
            property = setPropertyValue_Configuration_Linux_SambaServiceConfiguration(property,
                    newValue);
        }
        else {
            logger.warning("Property "
                    + PROPERTY_CONFIGURATION_LINUX_SAMBASERVICECONFIGURATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Configuration
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Configuration_Linux_SambaServiceConfiguration(
            CIMProperty currentProperty, Linux_SambaServiceConfiguration newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Element
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public Linux_SambaService get_Element_Linux_SambaService(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_ELEMENT_LINUX_SAMBASERVICE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ELEMENT_LINUX_SAMBASERVICE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return Linux_SambaServiceHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Element
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Element_Linux_SambaService(Linux_SambaService newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ELEMENT_LINUX_SAMBASERVICE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Element_Linux_SambaService(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ELEMENT_LINUX_SAMBASERVICE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Element by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Element_Linux_SambaService(WBEMClient client,
            String namespace, Linux_SambaService newValue) throws WbemsmtException {
        Linux_SambaServiceConfigurationForService fco = new Linux_SambaServiceConfigurationForService(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ELEMENT_LINUX_SAMBASERVICE.NAME);
        if (property != null) {
            property = setPropertyValue_Element_Linux_SambaService(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ELEMENT_LINUX_SAMBASERVICE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Element
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Element_Linux_SambaService(
            CIMProperty currentProperty, Linux_SambaService newValue) {
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
        return Linux_SambaServiceConfigurationForService.CIM_CLASS_NAME;
    }

}