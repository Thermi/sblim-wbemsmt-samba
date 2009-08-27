/** 
  * Linux_SambaLoggingOptions.java
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
public class Linux_SambaLoggingOptions extends  CIM_SettingData {



   public final static String CIM_CLASS_NAME = "Linux_SambaLoggingOptions";
   public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    
    /**
     * 
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBALOGGINGFORGLOBAL = "Linux_SambaLoggingForGlobal";
    
    
    
	    /**
	     * Constants of property DebugHiresTimestamp
     * 
     */
    public static class PROPERTY_DEBUGHIRESTIMESTAMP
    {
       /**
        * name of the property DebugHiresTimestamp
        */
       public final static String NAME = "DebugHiresTimestamp";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property DebugPID
     * 
     */
    public static class PROPERTY_DEBUGPID
    {
       /**
        * name of the property DebugPID
        */
       public final static String NAME = "DebugPID";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property DebugTimestamp
     * 
     */
    public static class PROPERTY_DEBUGTIMESTAMP
    {
       /**
        * name of the property DebugTimestamp
        */
       public final static String NAME = "DebugTimestamp";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property DebugUID
     * 
     */
    public static class PROPERTY_DEBUGUID
    {
       /**
        * name of the property DebugUID
        */
       public final static String NAME = "DebugUID";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property LogFile
     * 
     */
    public static class PROPERTY_LOGFILE
    {
       /**
        * name of the property LogFile
        */
       public final static String NAME = "LogFile";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property LogLevel
     * 
     */
    public static class PROPERTY_LOGLEVEL
    {
       /**
        * name of the property LogLevel
        */
       public final static String NAME = "LogLevel";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property MaxLogSize
     * 
     */
    public static class PROPERTY_MAXLOGSIZE
    {
       /**
        * name of the property MaxLogSize
        */
       public final static String NAME = "MaxLogSize";                  

	    	
    

    		    
	
	    
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
	     * Constants of property SysLog
     * 
     */
    public static class PROPERTY_SYSLOG
    {
       /**
        * name of the property SysLog
        */
       public final static String NAME = "SysLog";                  

	    	
    

              
       		
          /**
           * constant for value map entry 0
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_LOG_ERR 
                              = new javax.cim.UnsignedInteger16("0");
	          	
                       /**
              * constant for value entry LOG_ERR (corresponds to mapEntry 0 )
              */
             public final static String VALUE_ENTRY_LOG_ERR 
                              = "LOG_ERR";
                    
       		
          /**
           * constant for value map entry 1
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_LOG_WARNING 
                              = new javax.cim.UnsignedInteger16("1");
	          	
                       /**
              * constant for value entry LOG_WARNING (corresponds to mapEntry 1 )
              */
             public final static String VALUE_ENTRY_LOG_WARNING 
                              = "LOG_WARNING";
                    
       		
          /**
           * constant for value map entry 2
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_LOG_NOTICE 
                              = new javax.cim.UnsignedInteger16("2");
	          	
                       /**
              * constant for value entry LOG_NOTICE (corresponds to mapEntry 2 )
              */
             public final static String VALUE_ENTRY_LOG_NOTICE 
                              = "LOG_NOTICE";
                    
       		
          /**
           * constant for value map entry 3
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_LOG_INFO 
                              = new javax.cim.UnsignedInteger16("3");
	          	
                       /**
              * constant for value entry LOG_INFO (corresponds to mapEntry 3 )
              */
             public final static String VALUE_ENTRY_LOG_INFO 
                              = "LOG_INFO";
                    
       		
          /**
           * constant for value map entry 4
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_LOG_DEBUG 
                              = new javax.cim.UnsignedInteger16("4");
	          	
                       /**
              * constant for value entry LOG_DEBUG (corresponds to mapEntry 4 )
              */
             public final static String VALUE_ENTRY_LOG_DEBUG 
                              = "LOG_DEBUG";
                    
                                        /**
                 * get the ValueMapEntry of the given value
                 * @param value the value to find the ValueMapEntry for
                 * @return the ValueMap entry or null if not found
                 */
                public static javax.cim.UnsignedInteger16 getValueMapEntry(String value)
                {
                                                
	                                               if (VALUE_ENTRY_LOG_ERR.equals(value))
                         {
                            return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_LOG_ERR;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_LOG_WARNING.equals(value))
                         {
                            return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_LOG_WARNING;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_LOG_NOTICE.equals(value))
                         {
                            return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_LOG_NOTICE;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_LOG_INFO.equals(value))
                         {
                            return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_LOG_INFO;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_LOG_DEBUG.equals(value))
                         {
                            return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_LOG_DEBUG;
                         }
	                      	                   	                                         return null;
                                   
                }
                
                /**
                 * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
                 * @param indexInPulldown the index within the pulldown element, the list etc
                 * @return the ValueMap entry from the displayed values
                 */
                public static javax.cim.UnsignedInteger16 getValueMapEntryFromDisplayedValue(Number indexInPulldown)
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
                public static int getIndexForDisplay(javax.cim.UnsignedInteger16 currentValue)
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
                
                public static String getValueEntry(javax.cim.UnsignedInteger16 value)
                {
                   int iValue = value.intValue();
                                                                                     
                         if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_LOG_ERR.intValue())
                         {
                            return VALUE_ENTRY_LOG_ERR;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_LOG_WARNING.intValue())
                         {
                            return VALUE_ENTRY_LOG_WARNING;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_LOG_NOTICE.intValue())
                         {
                            return VALUE_ENTRY_LOG_NOTICE;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_LOG_INFO.intValue())
                         {
                            return VALUE_ENTRY_LOG_INFO;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_LOG_DEBUG.intValue())
                         {
                            return VALUE_ENTRY_LOG_DEBUG;
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
       * Value Map for the property SysLog   
       */
      public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = { 
	         	                              VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_LOG_ERR
                     	                            ,  VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_LOG_WARNING
                     	                            ,  VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_LOG_NOTICE
                     	                            ,  VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_LOG_INFO
                     	                            ,  VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_LOG_DEBUG
                           };
    	
	           /**
        * Values
        * Contains all values even those having an integer value range representation within the valueMap
        * Value Map for the property SysLog   
        */
       public final static String[] VALUE_ENTRIES = { 
                                                   VALUE_ENTRY_LOG_ERR
                                                                 ,  VALUE_ENTRY_LOG_WARNING
                                                                 ,  VALUE_ENTRY_LOG_NOTICE
                                                                 ,  VALUE_ENTRY_LOG_INFO
                                                                 ,  VALUE_ENTRY_LOG_DEBUG
                                    };

              /**
        * Values for displaying within pulldown elements, lists, radio buttons etc
        * Contains no values that having an integer value range representation within the valueMap
        * 
        * Value Map for the property SysLog   
        */
       public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { 
                                                   VALUE_ENTRY_LOG_ERR
                                                                 ,  VALUE_ENTRY_LOG_WARNING
                                                                 ,  VALUE_ENTRY_LOG_NOTICE
                                                                 ,  VALUE_ENTRY_LOG_INFO
                                                                 ,  VALUE_ENTRY_LOG_DEBUG
                                    };

        
		    
	
	    
	    }
	    
	    /**
	     * Constants of property SysLogOnly
     * 
     */
    public static class PROPERTY_SYSLOGONLY
    {
       /**
        * name of the property SysLogOnly
        */
       public final static String NAME = "SysLogOnly";                  

	    	
    

    		    
	
	    
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

      
   public Linux_SambaLoggingOptions(WBEMClient client, String namespace) throws WbemsmtException
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
   
   public Linux_SambaLoggingOptions(CIMInstance cimInstance)  throws WbemsmtException { 
        
       if (cimInstance == null) {
           throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, "The cimInstance parameter does not contain a valid reference.");
       }
       setFromServer(true);
       init(cimInstance,false);
   }
   
   /**
    * Default constructor
    */
   protected Linux_SambaLoggingOptions()
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
              propertiesToCheck.put("DebugHiresTimestamp",new CIMProperty("DebugHiresTimestamp",CIMDataType.BOOLEAN_T,null));
              propertiesToCheck.put("DebugPID",new CIMProperty("DebugPID",CIMDataType.BOOLEAN_T,null));
              propertiesToCheck.put("DebugTimestamp",new CIMProperty("DebugTimestamp",CIMDataType.BOOLEAN_T,null));
              propertiesToCheck.put("DebugUID",new CIMProperty("DebugUID",CIMDataType.BOOLEAN_T,null));
              propertiesToCheck.put("LogFile",new CIMProperty("LogFile",CIMDataType.STRING_T,null));
              propertiesToCheck.put("LogLevel",new CIMProperty("LogLevel",CIMDataType.STRING_T,null));
              propertiesToCheck.put("MaxLogSize",new CIMProperty("MaxLogSize",CIMDataType.UINT32_T,null));
              propertiesToCheck.put("Name",new CIMProperty("Name",CIMDataType.STRING_T,null));
              propertiesToCheck.put("SysLog",new CIMProperty("SysLog",CIMDataType.UINT16_T,null));
              propertiesToCheck.put("SysLogOnly",new CIMProperty("SysLogOnly",CIMDataType.BOOLEAN_T,null));
       	
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
    * Get the property DebugHiresTimestamp
    *     * <br>
    * 
    *     */

      

               
   public Boolean get_DebugHiresTimestamp()    {
       CIMProperty currentProperty = getProperty(PROPERTY_DEBUGHIRESTIMESTAMP.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_DEBUGHIRESTIMESTAMP.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (Boolean)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property DebugHiresTimestamp
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_DebugHiresTimestamp(Boolean newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_DEBUGHIRESTIMESTAMP.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_DebugHiresTimestamp(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_DEBUGHIRESTIMESTAMP.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property DebugHiresTimestamp by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DebugHiresTimestamp(WBEMClient client, String namespace, Boolean newValue) throws WbemsmtException {
        Linux_SambaLoggingOptions fco = new Linux_SambaLoggingOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEBUGHIRESTIMESTAMP.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_DebugHiresTimestamp(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_DEBUGHIRESTIMESTAMP.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property DebugHiresTimestamp
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_DebugHiresTimestamp(CIMProperty currentProperty, Boolean newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property DebugPID
    *     * <br>
    * 
    *     */

      

               
   public Boolean get_DebugPID()    {
       CIMProperty currentProperty = getProperty(PROPERTY_DEBUGPID.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_DEBUGPID.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (Boolean)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property DebugPID
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_DebugPID(Boolean newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_DEBUGPID.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_DebugPID(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_DEBUGPID.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property DebugPID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DebugPID(WBEMClient client, String namespace, Boolean newValue) throws WbemsmtException {
        Linux_SambaLoggingOptions fco = new Linux_SambaLoggingOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEBUGPID.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_DebugPID(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_DEBUGPID.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property DebugPID
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_DebugPID(CIMProperty currentProperty, Boolean newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property DebugTimestamp
    *     * <br>
    * 
    *     */

      

               
   public Boolean get_DebugTimestamp()    {
       CIMProperty currentProperty = getProperty(PROPERTY_DEBUGTIMESTAMP.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_DEBUGTIMESTAMP.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (Boolean)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property DebugTimestamp
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_DebugTimestamp(Boolean newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_DEBUGTIMESTAMP.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_DebugTimestamp(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_DEBUGTIMESTAMP.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property DebugTimestamp by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DebugTimestamp(WBEMClient client, String namespace, Boolean newValue) throws WbemsmtException {
        Linux_SambaLoggingOptions fco = new Linux_SambaLoggingOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEBUGTIMESTAMP.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_DebugTimestamp(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_DEBUGTIMESTAMP.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property DebugTimestamp
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_DebugTimestamp(CIMProperty currentProperty, Boolean newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property DebugUID
    *     * <br>
    * 
    *     */

      

               
   public Boolean get_DebugUID()    {
       CIMProperty currentProperty = getProperty(PROPERTY_DEBUGUID.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_DEBUGUID.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (Boolean)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property DebugUID
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_DebugUID(Boolean newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_DEBUGUID.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_DebugUID(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_DEBUGUID.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property DebugUID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DebugUID(WBEMClient client, String namespace, Boolean newValue) throws WbemsmtException {
        Linux_SambaLoggingOptions fco = new Linux_SambaLoggingOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEBUGUID.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_DebugUID(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_DEBUGUID.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property DebugUID
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_DebugUID(CIMProperty currentProperty, Boolean newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property LogFile
    *     * <br>
    * 
    *     */

      

               
   public String get_LogFile()    {
       CIMProperty currentProperty = getProperty(PROPERTY_LOGFILE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_LOGFILE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property LogFile
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_LogFile(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_LOGFILE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_LogFile(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_LOGFILE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property LogFile by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LogFile(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        Linux_SambaLoggingOptions fco = new Linux_SambaLoggingOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOGFILE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_LogFile(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_LOGFILE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property LogFile
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_LogFile(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property LogLevel
    *     * <br>
    * 
    *     */

      

               
   public String get_LogLevel()    {
       CIMProperty currentProperty = getProperty(PROPERTY_LOGLEVEL.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_LOGLEVEL.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property LogLevel
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_LogLevel(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_LOGLEVEL.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_LogLevel(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_LOGLEVEL.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property LogLevel by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LogLevel(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        Linux_SambaLoggingOptions fco = new Linux_SambaLoggingOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOGLEVEL.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_LogLevel(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_LOGLEVEL.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property LogLevel
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_LogLevel(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property MaxLogSize
    *     * <br>
    * 
    *     */

      

               
   public javax.cim.UnsignedInteger32 get_MaxLogSize()    {
       CIMProperty currentProperty = getProperty(PROPERTY_MAXLOGSIZE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_MAXLOGSIZE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger32)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property MaxLogSize
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_MaxLogSize(javax.cim.UnsignedInteger32 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_MAXLOGSIZE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_MaxLogSize(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_MAXLOGSIZE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property MaxLogSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MaxLogSize(WBEMClient client, String namespace, javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        Linux_SambaLoggingOptions fco = new Linux_SambaLoggingOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAXLOGSIZE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_MaxLogSize(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_MAXLOGSIZE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property MaxLogSize
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_MaxLogSize(CIMProperty currentProperty, javax.cim.UnsignedInteger32 newValue)
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
        Linux_SambaLoggingOptions fco = new Linux_SambaLoggingOptions(client,namespace);
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
    * Get the property SysLog
    *     * <br>
    * 
    *     */

      

               
   public javax.cim.UnsignedInteger16 get_SysLog()    {
       CIMProperty currentProperty = getProperty(PROPERTY_SYSLOG.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_SYSLOG.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property SysLog
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_SysLog(javax.cim.UnsignedInteger16 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_SYSLOG.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_SysLog(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_SYSLOG.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property SysLog by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SysLog(WBEMClient client, String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        Linux_SambaLoggingOptions fco = new Linux_SambaLoggingOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYSLOG.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_SysLog(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_SYSLOG.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property SysLog
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_SysLog(CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property SysLogOnly
    *     * <br>
    * 
    *     */

      

               
   public Boolean get_SysLogOnly()    {
       CIMProperty currentProperty = getProperty(PROPERTY_SYSLOGONLY.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_SYSLOGONLY.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (Boolean)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property SysLogOnly
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_SysLogOnly(Boolean newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_SYSLOGONLY.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_SysLogOnly(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_SYSLOGONLY.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property SysLogOnly by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SysLogOnly(WBEMClient client, String namespace, Boolean newValue) throws WbemsmtException {
        Linux_SambaLoggingOptions fco = new Linux_SambaLoggingOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYSLOGONLY.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_SysLogOnly(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_SYSLOGONLY.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property SysLogOnly
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_SysLogOnly(CIMProperty currentProperty, Boolean newValue)
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
     * Get the list with Linux_SambaGlobalOptions objects associated by the association Linux_SambaLoggingForGlobal
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBALOGGINGFORGLOBAL as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<Linux_SambaGlobalOptions> getAssociated_Linux_SambaGlobalOptions_Linux_SambaLoggingForGlobals(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_Linux_SambaGlobalOptions_Linux_SambaLoggingForGlobals(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBALOGGINGFORGLOBAL,
     	                Linux_SambaGlobalOptions.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with Linux_SambaGlobalOptions objects associated by the association Linux_SambaLoggingForGlobal
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBALOGGINGFORGLOBAL or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBALOGGINGFORGLOBAL as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<Linux_SambaGlobalOptions> getAssociated_Linux_SambaGlobalOptions_Linux_SambaLoggingForGlobals(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_Linux_SambaGlobalOptions_Linux_SambaLoggingForGlobals(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBALOGGINGFORGLOBAL,
     	                resultClass,
     	                role,
     	                resultRole,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with Linux_SambaGlobalOptions objects associated by the association Linux_SambaLoggingForGlobal
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBALOGGINGFORGLOBAL or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<Linux_SambaGlobalOptions> getAssociated_Linux_SambaGlobalOptions_Linux_SambaLoggingForGlobals(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

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
                 Linux_SambaLoggingOptionsHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 Linux_SambaLoggingOptionsHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = Linux_SambaLoggingOptionsHelper.findClass(cimClient, cimInstance);
                    
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
             Linux_SambaLoggingOptionsHelper.checkException(enumeration);
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
    * Get the list of CIMObjectPath items of the objects associated by the association Linux_SambaLoggingForGlobal
    * @param cimClient the WBEMClient for the communication
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBALOGGINGFORGLOBAL as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_Linux_SambaGlobalOptions_Linux_SambaLoggingForGlobalNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_Linux_SambaGlobalOptions_Linux_SambaLoggingForGlobalNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBALOGGINGFORGLOBAL,
    	                             Linux_SambaGlobalOptions.CIM_CLASS_NAME,
    	                             null,
    	                             null);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association Linux_SambaLoggingForGlobal
    * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBALOGGINGFORGLOBAL or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBALOGGINGFORGLOBAL as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_Linux_SambaGlobalOptions_Linux_SambaLoggingForGlobalNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_Linux_SambaGlobalOptions_Linux_SambaLoggingForGlobalNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBALOGGINGFORGLOBAL,
    	                             resultClass,
    	                             role,
    	                             resultRole);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association Linux_SambaLoggingForGlobal
    * @param cimClient the WBEMClient for the communication
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_Linux_SambaGlobalOptions_Linux_SambaLoggingForGlobalNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

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
                CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBALOGGINGFORGLOBAL, 
                Linux_SambaGlobalOptions.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                Linux_SambaLoggingOptionsHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                Linux_SambaLoggingOptionsHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_SambaGlobalOptions.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            Linux_SambaLoggingOptionsHelper.checkException(enumeration);
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
    * Get the list with Linux_SambaLoggingForGlobal associations
    *
    * @param cimClient the WBEMClient for the communication
    * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
    * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
    *
    * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
    **/
                        
                        
   public java.util.List<Linux_SambaLoggingForGlobal> getAssociations_Linux_SambaLoggingForGlobal(WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin, String role,java.lang.String[] propertyList) throws WbemsmtException {

       if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
       }

       java.util.List<Linux_SambaLoggingForGlobal> result = new java.util.ArrayList<Linux_SambaLoggingForGlobal>();
       CloseableIterator enumeration = null;

       try {
          enumeration = cimClient.references(
             this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBALOGGINGFORGLOBAL, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList);
        } catch (WBEMException e) {
         	  throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBALOGGINGFORGLOBAL, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList));	
        }
         
        try {
          while (enumeration.hasNext()) {
             Linux_SambaLoggingOptionsHelper.checkException(enumeration);
             Object obj = enumeration.next();
             Linux_SambaLoggingOptionsHelper.checkException(enumeration);

             if (obj instanceof CIMInstance) {
                CIMInstance cimInstance = (CIMInstance)obj;
                Class<?> clazz = Linux_SambaLoggingForGlobalHelper.findClass(cimClient, cimInstance);
                    
                if (clazz == null) {
                   System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                   result.add(new Linux_SambaLoggingForGlobal(cimInstance));
                   continue;
                }

                Class<?>[] constParams = new Class[1];
                constParams[0] = CIMInstance.class;
                Constructor<?> cons = null;
                try {
                   cons = clazz.getConstructor(constParams);
                } catch(NoSuchMethodException e) {
                   System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                   result.add(new Linux_SambaLoggingForGlobal(cimInstance));
                   continue;
                }

                try {
                   Object[] actargs = new Object[] {cimInstance};
                   Object dataObj = cons.newInstance(actargs);
                   result.add((Linux_SambaLoggingForGlobal)dataObj);
                } catch (Exception e) {
                   System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                   result.add(new Linux_SambaLoggingForGlobal(cimInstance));
                   continue;
                }
              }
           }
           Linux_SambaLoggingOptionsHelper.checkException(enumeration);
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
    * Get a list of CIMObjectPath items of the associations Linux_SambaLoggingForGlobal
    *
    * @param cimClient the WBEMClient for the communication
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociationNames_Linux_SambaLoggingForGlobal(WBEMClient cimClient,String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(
                this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBALOGGINGFORGLOBAL, 
                role);
        } catch (WBEMException e) {
         	  throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBALOGGINGFORGLOBAL, 
                role));	
        }
         
        try {
                while (enumeration.hasNext()) {
                   Linux_SambaLoggingOptionsHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   Linux_SambaLoggingOptionsHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_SambaLoggingForGlobal.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                Linux_SambaLoggingOptionsHelper.checkException(enumeration);
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
    	    return Linux_SambaLoggingOptions.CIM_CLASS_NAME;
    }



}