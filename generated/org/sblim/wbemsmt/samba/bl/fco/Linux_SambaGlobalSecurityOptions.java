/** 
  * Linux_SambaGlobalSecurityOptions.java
  *
  * 
  * Â© Copyright IBM Corp.  2009,2006,2007
  *
  * THIS FILE IS PROVIDED UNDER THE TER	MS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm
  *
  * Contributors:
  *    Prashanth Karnam<prkarnam@in.ibm.com> 
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.fco;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
   import org.sblim.wbemsmt.exception.impl.*;
	   import org.sblim.wbemsmt.exception.impl.userobject.*;


import org.sblim.wbemsmt.schema.cim221.*;



import java.lang.reflect.*;
import javax.wbem.*;
public class Linux_SambaGlobalSecurityOptions extends  CIM_SettingData {



   public final static String CIM_CLASS_NAME = "Linux_SambaGlobalSecurityOptions";
   public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    
    /**
     * 
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGLOBALSECURITYFORGLOBAL = "Linux_SambaGlobalSecurityForGlobal";
    
    
    
	    /**
	     * Constants of property AuthMethods
     * 
     */
    public static class PROPERTY_AUTHMETHODS
    {
       /**
        * name of the property AuthMethods
        */
       public final static String NAME = "AuthMethods";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property EncryptPasswords
     * 
     */
    public static class PROPERTY_ENCRYPTPASSWORDS
    {
       /**
        * name of the property EncryptPasswords
        */
       public final static String NAME = "EncryptPasswords";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property MinPasswordLength
     * 
     */
    public static class PROPERTY_MINPASSWORDLENGTH
    {
       /**
        * name of the property MinPasswordLength
        */
       public final static String NAME = "MinPasswordLength";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property Name
     * 
     */
    public static class PROPERTY_NAME
    {
       /**
        * name of the property Name
        */
       public final static String NAME = "Name";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property NullPasswords
     * 
     */
    public static class PROPERTY_NULLPASSWORDS
    {
       /**
        * name of the property NullPasswords
        */
       public final static String NAME = "NullPasswords";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property PassdbBackend
     * 
     */
    public static class PROPERTY_PASSDBBACKEND
    {
       /**
        * name of the property PassdbBackend
        */
       public final static String NAME = "PassdbBackend";                  

	    	
    

              
       		
          /**
           * constant for value map entry smbpasswd
           */ 
		          
          public final static String VALUE_MAP_ENTRY_smbpasswd_FOR_VALUE_ENTRY_0 
                              = new String("0");
	          	
                       /**
              * constant for value entry 0 (corresponds to mapEntry smbpasswd )
              */
             public final static String VALUE_ENTRY_0 
                              = "smbpasswd";
                    
       		
          /**
           * constant for value map entry tdbsam
           */ 
		          
          public final static String VALUE_MAP_ENTRY_tdbsam_FOR_VALUE_ENTRY_1 
                              = new String("1");
	          	
                       /**
              * constant for value entry 1 (corresponds to mapEntry tdbsam )
              */
             public final static String VALUE_ENTRY_1 
                              = "tdbsam";
                    
       		
          /**
           * constant for value map entry ldapsam
           */ 
		          
          public final static String VALUE_MAP_ENTRY_ldapsam_FOR_VALUE_ENTRY_2 
                              = new String("2");
	          	
                       /**
              * constant for value entry 2 (corresponds to mapEntry ldapsam )
              */
             public final static String VALUE_ENTRY_2 
                              = "ldapsam";
                    
       		
          /**
           * constant for value map entry nisplussam
           */ 
		          
          public final static String VALUE_MAP_ENTRY_nisplussam_FOR_VALUE_ENTRY_3 
                              = new String("3");
	          	
                       /**
              * constant for value entry 3 (corresponds to mapEntry nisplussam )
              */
             public final static String VALUE_ENTRY_3 
                              = "nisplussam";
                    
       		
          /**
           * constant for value map entry mysql
           */ 
		          
          public final static String VALUE_MAP_ENTRY_mysql_FOR_VALUE_ENTRY_4 
                              = new String("4");
	          	
                       /**
              * constant for value entry 4 (corresponds to mapEntry mysql )
              */
             public final static String VALUE_ENTRY_4 
                              = "mysql";
                    
                                        
                /**
                 * get the ValueMapEntry of the given value
                 * @param value the value to find the ValueMapEntry for
                 * @return the ValueMap entry or null if not found
                 */
                public static String getValueMapEntry(String value)
                {
                                         if (VALUE_ENTRY_0.equals(value))
                      {
                         return VALUE_MAP_ENTRY_smbpasswd_FOR_VALUE_ENTRY_0;
                      }
                                         if (VALUE_ENTRY_1.equals(value))
                      {
                         return VALUE_MAP_ENTRY_tdbsam_FOR_VALUE_ENTRY_1;
                      }
                                         if (VALUE_ENTRY_2.equals(value))
                      {
                         return VALUE_MAP_ENTRY_ldapsam_FOR_VALUE_ENTRY_2;
                      }
                                         if (VALUE_ENTRY_3.equals(value))
                      {
                         return VALUE_MAP_ENTRY_nisplussam_FOR_VALUE_ENTRY_3;
                      }
                                         if (VALUE_ENTRY_4.equals(value))
                      {
                         return VALUE_MAP_ENTRY_mysql_FOR_VALUE_ENTRY_4;
                      }
                                      return null;
                }
                
                /**
                 * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
                 * @param indexInPulldown the index within the pulldown element, the list etc
                 * @return the ValueMap entry from the displayed values
                 */
                public static String getValueMapEntryFromDisplayedValue(Number indexInPulldown)
                {
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
                public static int getIndexForDisplay(String currentValue)
                {
                   String valueEntry = getValueEntry(currentValue);
                   if (valueEntry != null)
                   {
                      for (int i=0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++)
                      {
                         if (VALUE_ENTRIES_FOR_DISPLAY[	i].equals(valueEntry))
                         {
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

                public static String getValueEntry(String valueMapEntry)
                {
                                         if (VALUE_MAP_ENTRY_smbpasswd_FOR_VALUE_ENTRY_0.equals(valueMapEntry))
                      {
                         return VALUE_ENTRY_0;
                      }
                                         if (VALUE_MAP_ENTRY_tdbsam_FOR_VALUE_ENTRY_1.equals(valueMapEntry))
                      {
                         return VALUE_ENTRY_1;
                      }
                                         if (VALUE_MAP_ENTRY_ldapsam_FOR_VALUE_ENTRY_2.equals(valueMapEntry))
                      {
                         return VALUE_ENTRY_2;
                      }
                                         if (VALUE_MAP_ENTRY_nisplussam_FOR_VALUE_ENTRY_3.equals(valueMapEntry))
                      {
                         return VALUE_ENTRY_3;
                      }
                                         if (VALUE_MAP_ENTRY_mysql_FOR_VALUE_ENTRY_4.equals(valueMapEntry))
                      {
                         return VALUE_ENTRY_4;
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
       * Value Map for the property PassdbBackend   
       */
      public final static String[] VALUE_MAP_ENTRIES = { 
	         	                              VALUE_MAP_ENTRY_smbpasswd_FOR_VALUE_ENTRY_0
                     	                            ,  VALUE_MAP_ENTRY_tdbsam_FOR_VALUE_ENTRY_1
                     	                            ,  VALUE_MAP_ENTRY_ldapsam_FOR_VALUE_ENTRY_2
                     	                            ,  VALUE_MAP_ENTRY_nisplussam_FOR_VALUE_ENTRY_3
                     	                            ,  VALUE_MAP_ENTRY_mysql_FOR_VALUE_ENTRY_4
                           };
    	
	           /**
        * Values
        * Contains all values even those having an integer value range representation within the valueMap
        * Value Map for the property PassdbBackend   
        */
       public final static String[] VALUE_ENTRIES = { 
                                                   VALUE_ENTRY_0
                                                                 ,  VALUE_ENTRY_1
                                                                 ,  VALUE_ENTRY_2
                                                                 ,  VALUE_ENTRY_3
                                                                 ,  VALUE_ENTRY_4
                                    };

              /**
        * Values for displaying within pulldown elements, lists, radio buttons etc
        * Contains no values that having an integer value range representation within the valueMap
        * 
        * Value Map for the property PassdbBackend   
        */
       public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { 
                                                   VALUE_ENTRY_0
                                                                 ,  VALUE_ENTRY_1
                                                                 ,  VALUE_ENTRY_2
                                                                 ,  VALUE_ENTRY_3
                                                                 ,  VALUE_ENTRY_4
                                    };

        
		    
	
	    
	    }
	    
	    /**
	     * Constants of property SMBPasswdFile
     * 
     */
    public static class PROPERTY_SMBPASSWDFILE
    {
       /**
        * name of the property SMBPasswdFile
        */
       public final static String NAME = "SMBPasswdFile";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property Security
     * 
     */
    public static class PROPERTY_SECURITY
    {
       /**
        * name of the property Security
        */
       public final static String NAME = "Security";                  

	    	
    

              
       		
          /**
           * constant for value map entry User
           */ 
		          
          public final static javax.cim.UnsignedInteger8 VALUE_MAP_ENTRY_User_FOR_VALUE_ENTRY_0 
                              = new javax.cim.UnsignedInteger8("0");
	          	
                       /**
              * constant for value entry 0 (corresponds to mapEntry User )
              */
             public final static String VALUE_ENTRY_0 
                              = "User";
                    
       		
          /**
           * constant for value map entry Share
           */ 
		          
          public final static javax.cim.UnsignedInteger8 VALUE_MAP_ENTRY_Share_FOR_VALUE_ENTRY_1 
                              = new javax.cim.UnsignedInteger8("1");
	          	
                       /**
              * constant for value entry 1 (corresponds to mapEntry Share )
              */
             public final static String VALUE_ENTRY_1 
                              = "Share";
                    
       		
          /**
           * constant for value map entry Server
           */ 
		          
          public final static javax.cim.UnsignedInteger8 VALUE_MAP_ENTRY_Server_FOR_VALUE_ENTRY_2 
                              = new javax.cim.UnsignedInteger8("2");
	          	
                       /**
              * constant for value entry 2 (corresponds to mapEntry Server )
              */
             public final static String VALUE_ENTRY_2 
                              = "Server";
                    
       		
          /**
           * constant for value map entry Domain
           */ 
		          
          public final static javax.cim.UnsignedInteger8 VALUE_MAP_ENTRY_Domain_FOR_VALUE_ENTRY_3 
                              = new javax.cim.UnsignedInteger8("3");
	          	
                       /**
              * constant for value entry 3 (corresponds to mapEntry Domain )
              */
             public final static String VALUE_ENTRY_3 
                              = "Domain";
                    
       		
          /**
           * constant for value map entry ADS
           */ 
		          
          public final static javax.cim.UnsignedInteger8 VALUE_MAP_ENTRY_ADS_FOR_VALUE_ENTRY_4 
                              = new javax.cim.UnsignedInteger8("4");
	          	
                       /**
              * constant for value entry 4 (corresponds to mapEntry ADS )
              */
             public final static String VALUE_ENTRY_4 
                              = "ADS";
                    
                                        /**
                 * get the ValueMapEntry of the given value
                 * @param value the value to find the ValueMapEntry for
                 * @return the ValueMap entry or null if not found
                 */
                public static javax.cim.UnsignedInteger8 getValueMapEntry(String value)
                {
                                                
	                                               if (VALUE_ENTRY_0.equals(value))
                         {
                            return VALUE_MAP_ENTRY_User_FOR_VALUE_ENTRY_0;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_1.equals(value))
                         {
                            return VALUE_MAP_ENTRY_Share_FOR_VALUE_ENTRY_1;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_2.equals(value))
                         {
                            return VALUE_MAP_ENTRY_Server_FOR_VALUE_ENTRY_2;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_3.equals(value))
                         {
                            return VALUE_MAP_ENTRY_Domain_FOR_VALUE_ENTRY_3;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_4.equals(value))
                         {
                            return VALUE_MAP_ENTRY_ADS_FOR_VALUE_ENTRY_4;
                         }
	                      	                   	                                         return null;
                                   
                }
                
                /**
                 * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
                 * @param indexInPulldown the index within the pulldown element, the list etc
                 * @return the ValueMap entry from the displayed values
                 */
                public static javax.cim.UnsignedInteger8 getValueMapEntryFromDisplayedValue(Number indexInPulldown)
                {
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
                public static int getIndexForDisplay(javax.cim.UnsignedInteger8 currentValue)
                {
                   String valueEntry = getValueEntry(currentValue);
                   if (valueEntry != null)
                   {
                      for (int i=0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++)
                      {
                         if (VALUE_ENTRIES_FOR_DISPLAY[	i].equals(valueEntry))
                         {
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
                
                public static String getValueEntry(javax.cim.UnsignedInteger8 value)
                {
                   int iValue = value.intValue();
                                                                                     
                         if (iValue == VALUE_MAP_ENTRY_User_FOR_VALUE_ENTRY_0.intValue())
                         {
                            return VALUE_ENTRY_0;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_Share_FOR_VALUE_ENTRY_1.intValue())
                         {
                            return VALUE_ENTRY_1;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_Server_FOR_VALUE_ENTRY_2.intValue())
                         {
                            return VALUE_ENTRY_2;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_Domain_FOR_VALUE_ENTRY_3.intValue())
                         {
                            return VALUE_ENTRY_3;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_ADS_FOR_VALUE_ENTRY_4.intValue())
                         {
                            return VALUE_ENTRY_4;
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
       * Value Map for the property Security   
       */
      public final static javax.cim.UnsignedInteger8[] VALUE_MAP_ENTRIES = { 
	         	                              VALUE_MAP_ENTRY_User_FOR_VALUE_ENTRY_0
                     	                            ,  VALUE_MAP_ENTRY_Share_FOR_VALUE_ENTRY_1
                     	                            ,  VALUE_MAP_ENTRY_Server_FOR_VALUE_ENTRY_2
                     	                            ,  VALUE_MAP_ENTRY_Domain_FOR_VALUE_ENTRY_3
                     	                            ,  VALUE_MAP_ENTRY_ADS_FOR_VALUE_ENTRY_4
                           };
    	
	           /**
        * Values
        * Contains all values even those having an integer value range representation within the valueMap
        * Value Map for the property Security   
        */
       public final static String[] VALUE_ENTRIES = { 
                                                   VALUE_ENTRY_0
                                                                 ,  VALUE_ENTRY_1
                                                                 ,  VALUE_ENTRY_2
                                                                 ,  VALUE_ENTRY_3
                                                                 ,  VALUE_ENTRY_4
                                    };

              /**
        * Values for displaying within pulldown elements, lists, radio buttons etc
        * Contains no values that having an integer value range representation within the valueMap
        * 
        * Value Map for the property Security   
        */
       public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { 
                                                   VALUE_ENTRY_0
                                                                 ,  VALUE_ENTRY_1
                                                                 ,  VALUE_ENTRY_2
                                                                 ,  VALUE_ENTRY_3
                                                                 ,  VALUE_ENTRY_4
                                    };

        
		    
	
	    
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
    *       *   <br>
    *   
    *   @param client the CIM Client
    *   @param namespace the target namespace
    */  

      
   public Linux_SambaGlobalSecurityOptions(WBEMClient client, String namespace) throws WbemsmtException
   {
       CIMClass cls = getClass(client,namespace);
       setFromServer(false);
       init(cls.newInstance(),true);
   }
        
   /**
    *   Class constructor
    * 
    *       *   <br>
    *   
    *   @param cimInstance the instance that is used to create the Object
    */  
   
   public Linux_SambaGlobalSecurityOptions(CIMInstance cimInstance)  throws WbemsmtException { 
        
       if (cimInstance == null) {
           throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, "The cimInstance parameter does not contain a valid reference.");
       }
       setFromServer(true);
       init(cimInstance,false);
   }
   
   /**
    * Default constructor
    */
   protected Linux_SambaGlobalSecurityOptions()
   {	
   }
   
   /**
    * initializes the FCO
    *
    *   @param cimInstance the instance that is used to create the Object
    *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
    */
   protected void init(CIMInstance cimInstance,boolean overwrite) throws WbemsmtException
   {
              propertiesToCheck.put("AuthMethods",new CIMProperty("AuthMethods",CIMDataType.STRING_T,null));
              propertiesToCheck.put("EncryptPasswords",new CIMProperty("EncryptPasswords",CIMDataType.BOOLEAN_T,null));
              propertiesToCheck.put("MinPasswordLength",new CIMProperty("MinPasswordLength",CIMDataType.UINT8_T,null));
              propertiesToCheck.put("Name",new CIMProperty("Name",CIMDataType.STRING_T,null));
              propertiesToCheck.put("NullPasswords",new CIMProperty("NullPasswords",CIMDataType.BOOLEAN_T,null));
              propertiesToCheck.put("PassdbBackend",new CIMProperty("PassdbBackend",CIMDataType.STRING_T,null));
              propertiesToCheck.put("SMBPasswdFile",new CIMProperty("SMBPasswdFile",CIMDataType.STRING_T,null));
              propertiesToCheck.put("Security",new CIMProperty("Security",CIMDataType.UINT8_T,null));
       	
	       super.init(cimInstance,overwrite);
	       
	       
	       //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
	       //we overwrite the dataType by setting null for every embeddedObject/Instance property
	       if (overwrite)
	       {
			                                                                                                                                                                          
       }
   }

//**********************************************************************
// Properties get/set     
//**********************************************************************


   
   
   /**
    * Get the property AuthMethods
    *     * <br>
    * 
    *     */

      

               
   public String get_AuthMethods()    {
       CIMProperty currentProperty = getProperty(PROPERTY_AUTHMETHODS.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_AUTHMETHODS.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property AuthMethods
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_AuthMethods(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_AUTHMETHODS.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_AuthMethods(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_AUTHMETHODS.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property AuthMethods by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AuthMethods(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        Linux_SambaGlobalSecurityOptions fco = new Linux_SambaGlobalSecurityOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_AUTHMETHODS.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_AuthMethods(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_AUTHMETHODS.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property AuthMethods
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_AuthMethods(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property EncryptPasswords
    *     * <br>
    * 
    *     */

      

               
   public Boolean get_EncryptPasswords()    {
       CIMProperty currentProperty = getProperty(PROPERTY_ENCRYPTPASSWORDS.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_ENCRYPTPASSWORDS.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (Boolean)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property EncryptPasswords
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_EncryptPasswords(Boolean newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_ENCRYPTPASSWORDS.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_EncryptPasswords(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_ENCRYPTPASSWORDS.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property EncryptPasswords by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_EncryptPasswords(WBEMClient client, String namespace, Boolean newValue) throws WbemsmtException {
        Linux_SambaGlobalSecurityOptions fco = new Linux_SambaGlobalSecurityOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ENCRYPTPASSWORDS.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_EncryptPasswords(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_ENCRYPTPASSWORDS.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property EncryptPasswords
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_EncryptPasswords(CIMProperty currentProperty, Boolean newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property MinPasswordLength
    *     * <br>
    * 
    *     */

      

               
   public javax.cim.UnsignedInteger8 get_MinPasswordLength()    {
       CIMProperty currentProperty = getProperty(PROPERTY_MINPASSWORDLENGTH.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_MINPASSWORDLENGTH.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger8)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property MinPasswordLength
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_MinPasswordLength(javax.cim.UnsignedInteger8 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_MINPASSWORDLENGTH.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_MinPasswordLength(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_MINPASSWORDLENGTH.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property MinPasswordLength by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MinPasswordLength(WBEMClient client, String namespace, javax.cim.UnsignedInteger8 newValue) throws WbemsmtException {
        Linux_SambaGlobalSecurityOptions fco = new Linux_SambaGlobalSecurityOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MINPASSWORDLENGTH.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_MinPasswordLength(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_MINPASSWORDLENGTH.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property MinPasswordLength
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_MinPasswordLength(CIMProperty currentProperty, javax.cim.UnsignedInteger8 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Name
    *     * <br>
    * 
    *     */

      

               
   public String get_key_Name()    {
       CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Name
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_key_Name(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_key_Name(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance " + getCimObjectPath());
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

    public static CIMProperty create_key_Name(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        Linux_SambaGlobalSecurityOptions fco = new Linux_SambaGlobalSecurityOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAME.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_key_Name(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Name
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_key_Name(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property NullPasswords
    *     * <br>
    * 
    *     */

      

               
   public Boolean get_NullPasswords()    {
       CIMProperty currentProperty = getProperty(PROPERTY_NULLPASSWORDS.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_NULLPASSWORDS.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (Boolean)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property NullPasswords
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_NullPasswords(Boolean newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_NULLPASSWORDS.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_NullPasswords(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_NULLPASSWORDS.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property NullPasswords by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NullPasswords(WBEMClient client, String namespace, Boolean newValue) throws WbemsmtException {
        Linux_SambaGlobalSecurityOptions fco = new Linux_SambaGlobalSecurityOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NULLPASSWORDS.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_NullPasswords(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_NULLPASSWORDS.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property NullPasswords
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_NullPasswords(CIMProperty currentProperty, Boolean newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property PassdbBackend
    *     * <br>
    * 
    *     */

      

               
   public String get_PassdbBackend()    {
       CIMProperty currentProperty = getProperty(PROPERTY_PASSDBBACKEND.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_PASSDBBACKEND.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property PassdbBackend
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_PassdbBackend(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_PASSDBBACKEND.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_PassdbBackend(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_PASSDBBACKEND.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property PassdbBackend by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PassdbBackend(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        Linux_SambaGlobalSecurityOptions fco = new Linux_SambaGlobalSecurityOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PASSDBBACKEND.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_PassdbBackend(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_PASSDBBACKEND.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property PassdbBackend
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_PassdbBackend(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property SMBPasswdFile
    *     * <br>
    * 
    *     */

      

               
   public String get_SMBPasswdFile()    {
       CIMProperty currentProperty = getProperty(PROPERTY_SMBPASSWDFILE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_SMBPASSWDFILE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property SMBPasswdFile
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_SMBPasswdFile(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_SMBPASSWDFILE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_SMBPasswdFile(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_SMBPASSWDFILE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property SMBPasswdFile by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SMBPasswdFile(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        Linux_SambaGlobalSecurityOptions fco = new Linux_SambaGlobalSecurityOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SMBPASSWDFILE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_SMBPasswdFile(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_SMBPASSWDFILE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property SMBPasswdFile
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_SMBPasswdFile(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Security
    *     * <br>
    * 
    *     */

      

               
   public javax.cim.UnsignedInteger8 get_Security()    {
       CIMProperty currentProperty = getProperty(PROPERTY_SECURITY.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_SECURITY.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger8)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Security
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_Security(javax.cim.UnsignedInteger8 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_SECURITY.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_Security(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_SECURITY.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property Security by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Security(WBEMClient client, String namespace, javax.cim.UnsignedInteger8 newValue) throws WbemsmtException {
        Linux_SambaGlobalSecurityOptions fco = new Linux_SambaGlobalSecurityOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SECURITY.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_Security(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_SECURITY.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Security
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_Security(CIMProperty currentProperty, javax.cim.UnsignedInteger8 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
    
//**********************************************************************
// Associators methods     
//**********************************************************************



    
                    
                                        
                            
                                        
        
    /**
     * Get the list with Linux_SambaGlobalOptions objects associated by the association Linux_SambaGlobalSecurityForGlobal
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGLOBALSECURITYFORGLOBAL as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<Linux_SambaGlobalOptions> getAssociated_Linux_SambaGlobalOptions_Linux_SambaGlobalSecurityForGlobals(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_Linux_SambaGlobalOptions_Linux_SambaGlobalSecurityForGlobals(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGLOBALSECURITYFORGLOBAL,
     	                Linux_SambaGlobalOptions.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with Linux_SambaGlobalOptions objects associated by the association Linux_SambaGlobalSecurityForGlobal
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGLOBALSECURITYFORGLOBAL or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGLOBALSECURITYFORGLOBAL as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<Linux_SambaGlobalOptions> getAssociated_Linux_SambaGlobalOptions_Linux_SambaGlobalSecurityForGlobals(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_Linux_SambaGlobalOptions_Linux_SambaGlobalSecurityForGlobals(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGLOBALSECURITYFORGLOBAL,
     	                resultClass,
     	                role,
     	                resultRole,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with Linux_SambaGlobalOptions objects associated by the association Linux_SambaGlobalSecurityForGlobal
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGLOBALSECURITYFORGLOBAL or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<Linux_SambaGlobalOptions> getAssociated_Linux_SambaGlobalOptions_Linux_SambaGlobalSecurityForGlobals(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

         if (cimClient == null) {
             throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
         }

         java.util.List<Linux_SambaGlobalOptions> result = new java.util.ArrayList<Linux_SambaGlobalOptions>();
         CloseableIterator enumeration = null;

         try {
             enumeration = cimClient.associators(
                 this.getCimObjectPath(),
                 associationClass, 
                 resultClass,
                 role,resultRole, 
                 includeQualifiers,
                 includeClassOrigin,
                 propertyList);
         } catch (WBEMException e) {
         	  throw new AssociatorException(e, new AssociatorUserObject(
                 this.getCimObjectPath(),
                 associationClass, 
                 resultClass,
                 role,resultRole, 
                 includeQualifiers,
                 includeClassOrigin,
                 propertyList));	
         }
         
         try {
	             while (enumeration.hasNext()) {
                 Linux_SambaGlobalSecurityOptionsHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 Linux_SambaGlobalSecurityOptionsHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = Linux_SambaGlobalSecurityOptionsHelper.findClass(cimClient, cimInstance);
                    
                     if (clazz == null) {
                         System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                         result.add(new Linux_SambaGlobalOptions(cimInstance));
                         continue;
                     }

                     Class<?>[] constParams = new Class[1];
                     constParams[0] = CIMInstance.class;
                     Constructor<?> cons = null;
                     try {
                         cons = clazz.getConstructor(constParams);
                     } catch(NoSuchMethodException e) {
                         System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                         result.add(new Linux_SambaGlobalOptions(cimInstance));
                         continue;
                     }

                     try {
                         Object[] actargs = new Object[] {cimInstance};
                         Object dataObj = cons.newInstance(actargs);
                         result.add((Linux_SambaGlobalOptions)dataObj);
                     } catch (Exception e) {
                         System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                         result.add(new Linux_SambaGlobalOptions(cimInstance));
                         continue;
                     }
                 }
             }
             Linux_SambaGlobalSecurityOptionsHelper.checkException(enumeration);
         } finally {
         try {
             if (enumeration != null) {
                 enumeration.close();
             }
         } catch(Exception e) {
             throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
         }
     }

     return result;
   }
    
   /**
    * Get the list of CIMObjectPath items of the objects associated by the association Linux_SambaGlobalSecurityForGlobal
    * @param cimClient the WBEMClient for the communication
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGLOBALSECURITYFORGLOBAL as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_Linux_SambaGlobalOptions_Linux_SambaGlobalSecurityForGlobalNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_Linux_SambaGlobalOptions_Linux_SambaGlobalSecurityForGlobalNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGLOBALSECURITYFORGLOBAL,
    	                             Linux_SambaGlobalOptions.CIM_CLASS_NAME,
    	                             null,
    	                             null);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association Linux_SambaGlobalSecurityForGlobal
    * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGLOBALSECURITYFORGLOBAL or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGLOBALSECURITYFORGLOBAL as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_Linux_SambaGlobalOptions_Linux_SambaGlobalSecurityForGlobalNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_Linux_SambaGlobalOptions_Linux_SambaGlobalSecurityForGlobalNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGLOBALSECURITYFORGLOBAL,
    	                             resultClass,
    	                             role,
    	                             resultRole);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association Linux_SambaGlobalSecurityForGlobal
    * @param cimClient the WBEMClient for the communication
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_Linux_SambaGlobalOptions_Linux_SambaGlobalSecurityForGlobalNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associatorNames(
                this.getCimObjectPath(),
                associationClass, 
                resultClass,
                role,resultRole);
		        
         } catch (WBEMException e) {
         	  throw new AssociatorNamesException(e, new AssociatorNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGLOBALSECURITYFORGLOBAL, 
                Linux_SambaGlobalOptions.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                Linux_SambaGlobalSecurityOptionsHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                Linux_SambaGlobalSecurityOptionsHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_SambaGlobalOptions.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            Linux_SambaGlobalSecurityOptionsHelper.checkException(enumeration);
        } finally {
        try {
            if (enumeration != null) {
                    enumeration.close();
            }
        } catch(Exception e) {
               throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
        }
      }
      return result;
   }
    
   /**
    * Get the list with Linux_SambaGlobalSecurityForGlobal associations
    *
    * @param cimClient the WBEMClient for the communication
    * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
    * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
    *
    * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
    **/
                        
                        
   public java.util.List<Linux_SambaGlobalSecurityForGlobal> getAssociations_Linux_SambaGlobalSecurityForGlobal(WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin, String role,java.lang.String[] propertyList) throws WbemsmtException {

       if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
       }

       java.util.List<Linux_SambaGlobalSecurityForGlobal> result = new java.util.ArrayList<Linux_SambaGlobalSecurityForGlobal>();
       CloseableIterator enumeration = null;

       try {
          enumeration = cimClient.references(
             this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGLOBALSECURITYFORGLOBAL, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList);
        } catch (WBEMException e) {
         	  throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGLOBALSECURITYFORGLOBAL, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList));	
        }
         
        try {
          while (enumeration.hasNext()) {
             Linux_SambaGlobalSecurityOptionsHelper.checkException(enumeration);
             Object obj = enumeration.next();
             Linux_SambaGlobalSecurityOptionsHelper.checkException(enumeration);

             if (obj instanceof CIMInstance) {
                CIMInstance cimInstance = (CIMInstance)obj;
                Class<?> clazz = Linux_SambaGlobalSecurityForGlobalHelper.findClass(cimClient, cimInstance);
                    
                if (clazz == null) {
                   System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                   result.add(new Linux_SambaGlobalSecurityForGlobal(cimInstance));
                   continue;
                }

                Class<?>[] constParams = new Class[1];
                constParams[0] = CIMInstance.class;
                Constructor<?> cons = null;
                try {
                   cons = clazz.getConstructor(constParams);
                } catch(NoSuchMethodException e) {
                   System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                   result.add(new Linux_SambaGlobalSecurityForGlobal(cimInstance));
                   continue;
                }

                try {
                   Object[] actargs = new Object[] {cimInstance};
                   Object dataObj = cons.newInstance(actargs);
                   result.add((Linux_SambaGlobalSecurityForGlobal)dataObj);
                } catch (Exception e) {
                   System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                   result.add(new Linux_SambaGlobalSecurityForGlobal(cimInstance));
                   continue;
                }
              }
           }
           Linux_SambaGlobalSecurityOptionsHelper.checkException(enumeration);
        } finally {
           try {
              if (enumeration != null) {
                 enumeration.close();
              }
           } catch(Exception e) {
              throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
           }
       }

       return result;
   }
    
   /**
    * Get a list of CIMObjectPath items of the associations Linux_SambaGlobalSecurityForGlobal
    *
    * @param cimClient the WBEMClient for the communication
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociationNames_Linux_SambaGlobalSecurityForGlobal(WBEMClient cimClient,String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(
                this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGLOBALSECURITYFORGLOBAL, 
                role);
        } catch (WBEMException e) {
         	  throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGLOBALSECURITYFORGLOBAL, 
                role));	
        }
         
        try {
                while (enumeration.hasNext()) {
                   Linux_SambaGlobalSecurityOptionsHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   Linux_SambaGlobalSecurityOptionsHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_SambaGlobalSecurityForGlobal.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                Linux_SambaGlobalSecurityOptionsHelper.checkException(enumeration);
        } finally {
        try {
            if (enumeration != null) {
                    enumeration.close();
            }
        } catch(Exception e) {
               throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
        }
     }
     return result;
   }
    
               
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
    public String getObjectName()
    {
    	    return Linux_SambaGlobalSecurityOptions.CIM_CLASS_NAME;
    }



}