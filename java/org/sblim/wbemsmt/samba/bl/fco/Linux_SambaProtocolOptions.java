/** 
 * Linux_SambaProtocolOptions.java
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

public class Linux_SambaProtocolOptions extends CIM_SettingData {

    public final static String CIM_CLASS_NAME = "Linux_SambaProtocolOptions";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property AclCompatibility
     * 
     */
    public static class PROPERTY_ACLCOMPATIBILITY {
        /**
         * name of the property AclCompatibility
         */
        public final static String NAME = "AclCompatibility";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger8 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Auto = new javax.cim.UnsignedInteger8(
                "0");

        /**
         * constant for value entry Auto (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Auto = "Auto";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger8 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_winnt = new javax.cim.UnsignedInteger8(
                "1");

        /**
         * constant for value entry winnt (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_winnt = "winnt";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger8 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_win2k = new javax.cim.UnsignedInteger8(
                "2");

        /**
         * constant for value entry win2k (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_win2k = "win2k";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@102b2b6
        public static javax.cim.UnsignedInteger8 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Auto.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Auto;
            }

            if (VALUE_ENTRY_winnt.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_winnt;
            }

            if (VALUE_ENTRY_win2k.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_win2k;
            }
            return null;

        }

        /**
         * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
         * @param indexInPulldown the index within the pulldown element, the list etc
         * @return the ValueMap entry from the displayed values
         */
        public static javax.cim.UnsignedInteger8 getValueMapEntryFromDisplayedValue(
                Number indexInPulldown) {
            return getValueMapEntry(VALUE_ENTRIES_FOR_DISPLAY[indexInPulldown.intValue()]);
        }

        /**
         * gets the value for the given valueMap entry (currentValue) and gives back the index of this value within the VALUE_ENTRIES_FOR_DISPLAY array
         *
         * can be used to set the correct selection index for a pulldown field
         *
         * @return -1 if for the currentValue no value within VALUE_ENTRIES_FOR_DISPLAY was found
         * @param currentValue the currentValue to get the index for
         */
        public static int getIndexForDisplay(javax.cim.UnsignedInteger8 currentValue) {
            String valueEntry = getValueEntry(currentValue);
            if (valueEntry != null) {
                for (int i = 0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++) {
                    if (VALUE_ENTRIES_FOR_DISPLAY[i].equals(valueEntry)) {
                        return i;
                    }
                }
            }
            return -1;

        }

        /**
         * get the ValueEntry of the given valueMapEntry
         * @param valueMapEntry the entry within the valueMap to find the ValueEntry for
         * @return the Value entry or null if not found
         */

        public static String getValueEntry(javax.cim.UnsignedInteger8 value) {
            int iValue = value.intValue();

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Auto.intValue()) {
                return VALUE_ENTRY_Auto;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_winnt.intValue()) {
                return VALUE_ENTRY_winnt;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_win2k.intValue()) {
                return VALUE_ENTRY_win2k;
            }
            return null;

        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property AclCompatibility   
         */
        public final static javax.cim.UnsignedInteger8[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Auto, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_winnt,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_win2k };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property AclCompatibility   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Auto, VALUE_ENTRY_winnt,
                VALUE_ENTRY_win2k };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property AclCompatibility   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Auto,
                VALUE_ENTRY_winnt, VALUE_ENTRY_win2k };

    }

    /**
     * Constants of property EASupport
     * 
     */
    public static class PROPERTY_EASUPPORT {
        /**
         * name of the property EASupport
         */
        public final static String NAME = "EASupport";

    }

    /**
     * Constants of property NTACLSupport
     * 
     */
    public static class PROPERTY_NTACLSUPPORT {
        /**
         * name of the property NTACLSupport
         */
        public final static String NAME = "NTACLSupport";

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

    protected Linux_SambaProtocolOptions(WBEMClient client, String namespace)
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

    protected Linux_SambaProtocolOptions(CIMInstance cimInstance) throws WbemsmtException {

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
    protected Linux_SambaProtocolOptions() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("AclCompatibility", new CIMProperty("AclCompatibility",
                CIMDataType.UINT8_T, null));
        propertiesToCheck.put("EASupport",
                new CIMProperty("EASupport", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("NTACLSupport", new CIMProperty("NTACLSupport",
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
     * Get the property AclCompatibility
     *     * <br>
     * 
     *     */

    public javax.cim.UnsignedInteger8 get_AclCompatibility() {
        CIMProperty currentProperty = getProperty(PROPERTY_ACLCOMPATIBILITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ACLCOMPATIBILITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger8) currentProperty.getValue();

    }

    /**
     * Set the property AclCompatibility
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AclCompatibility(javax.cim.UnsignedInteger8 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ACLCOMPATIBILITY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_AclCompatibility(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ACLCOMPATIBILITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AclCompatibility by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AclCompatibility(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger8 newValue) throws WbemsmtException {
        Linux_SambaProtocolOptions fco = new Linux_SambaProtocolOptions(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ACLCOMPATIBILITY.NAME);
        if (property != null) {
            property = setPropertyValue_AclCompatibility(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ACLCOMPATIBILITY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AclCompatibility
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_AclCompatibility(CIMProperty currentProperty,
            javax.cim.UnsignedInteger8 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property EASupport
     *     * <br>
     * 
     *     */

    public Boolean get_EASupport() {
        CIMProperty currentProperty = getProperty(PROPERTY_EASUPPORT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_EASUPPORT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property EASupport
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_EASupport(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_EASUPPORT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_EASupport(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_EASUPPORT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property EASupport by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_EASupport(WBEMClient client, String namespace, Boolean newValue)
            throws WbemsmtException {
        Linux_SambaProtocolOptions fco = new Linux_SambaProtocolOptions(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_EASUPPORT.NAME);
        if (property != null) {
            property = setPropertyValue_EASupport(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_EASUPPORT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property EASupport
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_EASupport(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NTACLSupport
     *     * <br>
     * 
     *     */

    public Boolean get_NTACLSupport() {
        CIMProperty currentProperty = getProperty(PROPERTY_NTACLSUPPORT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NTACLSUPPORT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property NTACLSupport
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NTACLSupport(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NTACLSUPPORT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_NTACLSupport(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NTACLSUPPORT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NTACLSupport by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NTACLSupport(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        Linux_SambaProtocolOptions fco = new Linux_SambaProtocolOptions(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NTACLSUPPORT.NAME);
        if (property != null) {
            property = setPropertyValue_NTACLSupport(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NTACLSUPPORT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NTACLSupport
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_NTACLSupport(CIMProperty currentProperty,
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
        Linux_SambaProtocolOptions fco = new Linux_SambaProtocolOptions(client, namespace);
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
        return Linux_SambaProtocolOptions.CIM_CLASS_NAME;
    }

}