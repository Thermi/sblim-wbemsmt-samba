/** 
  * Linux_SambaScriptingOptions.java
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
public class Linux_SambaScriptingOptions extends  CIM_SettingData {



   public final static String CIM_CLASS_NAME = "Linux_SambaScriptingOptions";
   public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    
    /**
     * 
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBASCRIPTINGFORGLOBAL = "Linux_SambaScriptingForGlobal";
    
    
    
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
	     * Constants of property addGroupScript
     * 
     */
    public static class PROPERTY_ADDGROUPSCRIPT
    {
       /**
        * name of the property addGroupScript
        */
       public final static String NAME = "addGroupScript";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property addPrinterCommand
     * 
     */
    public static class PROPERTY_ADDPRINTERCOMMAND
    {
       /**
        * name of the property addPrinterCommand
        */
       public final static String NAME = "addPrinterCommand";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property addShareCommand
     * 
     */
    public static class PROPERTY_ADDSHARECOMMAND
    {
       /**
        * name of the property addShareCommand
        */
       public final static String NAME = "addShareCommand";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property addUserScript
     * 
     */
    public static class PROPERTY_ADDUSERSCRIPT
    {
       /**
        * name of the property addUserScript
        */
       public final static String NAME = "addUserScript";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property addUsertoGroupScript
     * 
     */
    public static class PROPERTY_ADDUSERTOGROUPSCRIPT
    {
       /**
        * name of the property addUsertoGroupScript
        */
       public final static String NAME = "addUsertoGroupScript";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property deleteGrouprScript
     * 
     */
    public static class PROPERTY_DELETEGROUPRSCRIPT
    {
       /**
        * name of the property deleteGrouprScript
        */
       public final static String NAME = "deleteGrouprScript";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property deleteUserScript
     * 
     */
    public static class PROPERTY_DELETEUSERSCRIPT
    {
       /**
        * name of the property deleteUserScript
        */
       public final static String NAME = "deleteUserScript";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property deleteUserfromGroupScript
     * 
     */
    public static class PROPERTY_DELETEUSERFROMGROUPSCRIPT
    {
       /**
        * name of the property deleteUserfromGroupScript
        */
       public final static String NAME = "deleteUserfromGroupScript";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property setPrimaryGroupScript
     * 
     */
    public static class PROPERTY_SETPRIMARYGROUPSCRIPT
    {
       /**
        * name of the property setPrimaryGroupScript
        */
       public final static String NAME = "setPrimaryGroupScript";                  

	    	
    

    		    
	
	    
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

      
   public Linux_SambaScriptingOptions(WBEMClient client, String namespace) throws WbemsmtException
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
   
   public Linux_SambaScriptingOptions(CIMInstance cimInstance)  throws WbemsmtException { 
        
       if (cimInstance == null) {
           throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, "The cimInstance parameter does not contain a valid reference.");
       }
       setFromServer(true);
       init(cimInstance,false);
   }
   
   /**
    * Default constructor
    */
   protected Linux_SambaScriptingOptions()
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
              propertiesToCheck.put("Name",new CIMProperty("Name",CIMDataType.STRING_T,null));
              propertiesToCheck.put("addGroupScript",new CIMProperty("addGroupScript",CIMDataType.STRING_T,null));
              propertiesToCheck.put("addPrinterCommand",new CIMProperty("addPrinterCommand",CIMDataType.STRING_T,null));
              propertiesToCheck.put("addShareCommand",new CIMProperty("addShareCommand",CIMDataType.STRING_T,null));
              propertiesToCheck.put("addUserScript",new CIMProperty("addUserScript",CIMDataType.STRING_T,null));
              propertiesToCheck.put("addUsertoGroupScript",new CIMProperty("addUsertoGroupScript",CIMDataType.STRING_T,null));
              propertiesToCheck.put("deleteGrouprScript",new CIMProperty("deleteGrouprScript",CIMDataType.STRING_T,null));
              propertiesToCheck.put("deleteUserScript",new CIMProperty("deleteUserScript",CIMDataType.STRING_T,null));
              propertiesToCheck.put("deleteUserfromGroupScript",new CIMProperty("deleteUserfromGroupScript",CIMDataType.STRING_T,null));
              propertiesToCheck.put("setPrimaryGroupScript",new CIMProperty("setPrimaryGroupScript",CIMDataType.STRING_T,null));
       	
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
        Linux_SambaScriptingOptions fco = new Linux_SambaScriptingOptions(client,namespace);
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
    * Get the property addGroupScript
    *     * <br>
    * 
    *     */

      

               
   public String get_addGroupScript()    {
       CIMProperty currentProperty = getProperty(PROPERTY_ADDGROUPSCRIPT.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_ADDGROUPSCRIPT.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property addGroupScript
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_addGroupScript(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_ADDGROUPSCRIPT.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_addGroupScript(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_ADDGROUPSCRIPT.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property addGroupScript by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_addGroupScript(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        Linux_SambaScriptingOptions fco = new Linux_SambaScriptingOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ADDGROUPSCRIPT.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_addGroupScript(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_ADDGROUPSCRIPT.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property addGroupScript
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_addGroupScript(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property addPrinterCommand
    *     * <br>
    * 
    *     */

      

               
   public String get_addPrinterCommand()    {
       CIMProperty currentProperty = getProperty(PROPERTY_ADDPRINTERCOMMAND.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_ADDPRINTERCOMMAND.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property addPrinterCommand
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_addPrinterCommand(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_ADDPRINTERCOMMAND.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_addPrinterCommand(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_ADDPRINTERCOMMAND.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property addPrinterCommand by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_addPrinterCommand(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        Linux_SambaScriptingOptions fco = new Linux_SambaScriptingOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ADDPRINTERCOMMAND.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_addPrinterCommand(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_ADDPRINTERCOMMAND.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property addPrinterCommand
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_addPrinterCommand(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property addShareCommand
    *     * <br>
    * 
    *     */

      

               
   public String get_addShareCommand()    {
       CIMProperty currentProperty = getProperty(PROPERTY_ADDSHARECOMMAND.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_ADDSHARECOMMAND.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property addShareCommand
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_addShareCommand(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_ADDSHARECOMMAND.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_addShareCommand(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_ADDSHARECOMMAND.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property addShareCommand by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_addShareCommand(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        Linux_SambaScriptingOptions fco = new Linux_SambaScriptingOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ADDSHARECOMMAND.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_addShareCommand(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_ADDSHARECOMMAND.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property addShareCommand
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_addShareCommand(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property addUserScript
    *     * <br>
    * 
    *     */

      

               
   public String get_addUserScript()    {
       CIMProperty currentProperty = getProperty(PROPERTY_ADDUSERSCRIPT.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_ADDUSERSCRIPT.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property addUserScript
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_addUserScript(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_ADDUSERSCRIPT.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_addUserScript(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_ADDUSERSCRIPT.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property addUserScript by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_addUserScript(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        Linux_SambaScriptingOptions fco = new Linux_SambaScriptingOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ADDUSERSCRIPT.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_addUserScript(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_ADDUSERSCRIPT.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property addUserScript
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_addUserScript(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property addUsertoGroupScript
    *     * <br>
    * 
    *     */

      

               
   public String get_addUsertoGroupScript()    {
       CIMProperty currentProperty = getProperty(PROPERTY_ADDUSERTOGROUPSCRIPT.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_ADDUSERTOGROUPSCRIPT.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property addUsertoGroupScript
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_addUsertoGroupScript(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_ADDUSERTOGROUPSCRIPT.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_addUsertoGroupScript(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_ADDUSERTOGROUPSCRIPT.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property addUsertoGroupScript by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_addUsertoGroupScript(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        Linux_SambaScriptingOptions fco = new Linux_SambaScriptingOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ADDUSERTOGROUPSCRIPT.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_addUsertoGroupScript(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_ADDUSERTOGROUPSCRIPT.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property addUsertoGroupScript
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_addUsertoGroupScript(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property deleteGrouprScript
    *     * <br>
    * 
    *     */

      

               
   public String get_deleteGrouprScript()    {
       CIMProperty currentProperty = getProperty(PROPERTY_DELETEGROUPRSCRIPT.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_DELETEGROUPRSCRIPT.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property deleteGrouprScript
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_deleteGrouprScript(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_DELETEGROUPRSCRIPT.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_deleteGrouprScript(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_DELETEGROUPRSCRIPT.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property deleteGrouprScript by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_deleteGrouprScript(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        Linux_SambaScriptingOptions fco = new Linux_SambaScriptingOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DELETEGROUPRSCRIPT.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_deleteGrouprScript(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_DELETEGROUPRSCRIPT.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property deleteGrouprScript
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_deleteGrouprScript(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property deleteUserScript
    *     * <br>
    * 
    *     */

      

               
   public String get_deleteUserScript()    {
       CIMProperty currentProperty = getProperty(PROPERTY_DELETEUSERSCRIPT.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_DELETEUSERSCRIPT.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property deleteUserScript
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_deleteUserScript(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_DELETEUSERSCRIPT.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_deleteUserScript(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_DELETEUSERSCRIPT.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property deleteUserScript by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_deleteUserScript(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        Linux_SambaScriptingOptions fco = new Linux_SambaScriptingOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DELETEUSERSCRIPT.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_deleteUserScript(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_DELETEUSERSCRIPT.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property deleteUserScript
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_deleteUserScript(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property deleteUserfromGroupScript
    *     * <br>
    * 
    *     */

      

               
   public String get_deleteUserfromGroupScript()    {
       CIMProperty currentProperty = getProperty(PROPERTY_DELETEUSERFROMGROUPSCRIPT.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_DELETEUSERFROMGROUPSCRIPT.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property deleteUserfromGroupScript
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_deleteUserfromGroupScript(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_DELETEUSERFROMGROUPSCRIPT.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_deleteUserfromGroupScript(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_DELETEUSERFROMGROUPSCRIPT.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property deleteUserfromGroupScript by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_deleteUserfromGroupScript(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        Linux_SambaScriptingOptions fco = new Linux_SambaScriptingOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DELETEUSERFROMGROUPSCRIPT.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_deleteUserfromGroupScript(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_DELETEUSERFROMGROUPSCRIPT.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property deleteUserfromGroupScript
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_deleteUserfromGroupScript(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property setPrimaryGroupScript
    *     * <br>
    * 
    *     */

      

               
   public String get_setPrimaryGroupScript()    {
       CIMProperty currentProperty = getProperty(PROPERTY_SETPRIMARYGROUPSCRIPT.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_SETPRIMARYGROUPSCRIPT.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property setPrimaryGroupScript
    * <br>
    * 
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_setPrimaryGroupScript(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_SETPRIMARYGROUPSCRIPT.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_setPrimaryGroupScript(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_SETPRIMARYGROUPSCRIPT.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property setPrimaryGroupScript by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_setPrimaryGroupScript(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        Linux_SambaScriptingOptions fco = new Linux_SambaScriptingOptions(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SETPRIMARYGROUPSCRIPT.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_setPrimaryGroupScript(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_SETPRIMARYGROUPSCRIPT.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property setPrimaryGroupScript
    * <br>
    * 
    */
    
   private static CIMProperty setPropertyValue_setPrimaryGroupScript(CIMProperty currentProperty, String newValue)
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
     * Get the list with Linux_SambaGlobalOptions objects associated by the association Linux_SambaScriptingForGlobal
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBASCRIPTINGFORGLOBAL as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<Linux_SambaGlobalOptions> getAssociated_Linux_SambaGlobalOptions_Linux_SambaScriptingForGlobals(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_Linux_SambaGlobalOptions_Linux_SambaScriptingForGlobals(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBASCRIPTINGFORGLOBAL,
     	                Linux_SambaGlobalOptions.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with Linux_SambaGlobalOptions objects associated by the association Linux_SambaScriptingForGlobal
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBASCRIPTINGFORGLOBAL or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBASCRIPTINGFORGLOBAL as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<Linux_SambaGlobalOptions> getAssociated_Linux_SambaGlobalOptions_Linux_SambaScriptingForGlobals(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_Linux_SambaGlobalOptions_Linux_SambaScriptingForGlobals(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBASCRIPTINGFORGLOBAL,
     	                resultClass,
     	                role,
     	                resultRole,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with Linux_SambaGlobalOptions objects associated by the association Linux_SambaScriptingForGlobal
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBASCRIPTINGFORGLOBAL or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<Linux_SambaGlobalOptions> getAssociated_Linux_SambaGlobalOptions_Linux_SambaScriptingForGlobals(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

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
                 Linux_SambaScriptingOptionsHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 Linux_SambaScriptingOptionsHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = Linux_SambaScriptingOptionsHelper.findClass(cimClient, cimInstance);
                    
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
             Linux_SambaScriptingOptionsHelper.checkException(enumeration);
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
    * Get the list of CIMObjectPath items of the objects associated by the association Linux_SambaScriptingForGlobal
    * @param cimClient the WBEMClient for the communication
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBASCRIPTINGFORGLOBAL as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_Linux_SambaGlobalOptions_Linux_SambaScriptingForGlobalNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_Linux_SambaGlobalOptions_Linux_SambaScriptingForGlobalNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBASCRIPTINGFORGLOBAL,
    	                             Linux_SambaGlobalOptions.CIM_CLASS_NAME,
    	                             null,
    	                             null);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association Linux_SambaScriptingForGlobal
    * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBASCRIPTINGFORGLOBAL or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBASCRIPTINGFORGLOBAL as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_Linux_SambaGlobalOptions_Linux_SambaScriptingForGlobalNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_Linux_SambaGlobalOptions_Linux_SambaScriptingForGlobalNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBASCRIPTINGFORGLOBAL,
    	                             resultClass,
    	                             role,
    	                             resultRole);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association Linux_SambaScriptingForGlobal
    * @param cimClient the WBEMClient for the communication
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_Linux_SambaGlobalOptions_Linux_SambaScriptingForGlobalNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

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
                CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBASCRIPTINGFORGLOBAL, 
                Linux_SambaGlobalOptions.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                Linux_SambaScriptingOptionsHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                Linux_SambaScriptingOptionsHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_SambaGlobalOptions.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            Linux_SambaScriptingOptionsHelper.checkException(enumeration);
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
    * Get the list with Linux_SambaScriptingForGlobal associations
    *
    * @param cimClient the WBEMClient for the communication
    * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
    * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
    *
    * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
    **/
                        
                        
   public java.util.List<Linux_SambaScriptingForGlobal> getAssociations_Linux_SambaScriptingForGlobal(WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin, String role,java.lang.String[] propertyList) throws WbemsmtException {

       if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
       }

       java.util.List<Linux_SambaScriptingForGlobal> result = new java.util.ArrayList<Linux_SambaScriptingForGlobal>();
       CloseableIterator enumeration = null;

       try {
          enumeration = cimClient.references(
             this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBASCRIPTINGFORGLOBAL, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList);
        } catch (WBEMException e) {
         	  throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBASCRIPTINGFORGLOBAL, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList));	
        }
         
        try {
          while (enumeration.hasNext()) {
             Linux_SambaScriptingOptionsHelper.checkException(enumeration);
             Object obj = enumeration.next();
             Linux_SambaScriptingOptionsHelper.checkException(enumeration);

             if (obj instanceof CIMInstance) {
                CIMInstance cimInstance = (CIMInstance)obj;
                Class<?> clazz = Linux_SambaScriptingForGlobalHelper.findClass(cimClient, cimInstance);
                    
                if (clazz == null) {
                   System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                   result.add(new Linux_SambaScriptingForGlobal(cimInstance));
                   continue;
                }

                Class<?>[] constParams = new Class[1];
                constParams[0] = CIMInstance.class;
                Constructor<?> cons = null;
                try {
                   cons = clazz.getConstructor(constParams);
                } catch(NoSuchMethodException e) {
                   System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                   result.add(new Linux_SambaScriptingForGlobal(cimInstance));
                   continue;
                }

                try {
                   Object[] actargs = new Object[] {cimInstance};
                   Object dataObj = cons.newInstance(actargs);
                   result.add((Linux_SambaScriptingForGlobal)dataObj);
                } catch (Exception e) {
                   System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                   result.add(new Linux_SambaScriptingForGlobal(cimInstance));
                   continue;
                }
              }
           }
           Linux_SambaScriptingOptionsHelper.checkException(enumeration);
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
    * Get a list of CIMObjectPath items of the associations Linux_SambaScriptingForGlobal
    *
    * @param cimClient the WBEMClient for the communication
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociationNames_Linux_SambaScriptingForGlobal(WBEMClient cimClient,String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(
                this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBASCRIPTINGFORGLOBAL, 
                role);
        } catch (WBEMException e) {
         	  throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBASCRIPTINGFORGLOBAL, 
                role));	
        }
         
        try {
                while (enumeration.hasNext()) {
                   Linux_SambaScriptingOptionsHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   Linux_SambaScriptingOptionsHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_SambaScriptingForGlobal.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                Linux_SambaScriptingOptionsHelper.checkException(enumeration);
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
    	    return Linux_SambaScriptingOptions.CIM_CLASS_NAME;
    }



}