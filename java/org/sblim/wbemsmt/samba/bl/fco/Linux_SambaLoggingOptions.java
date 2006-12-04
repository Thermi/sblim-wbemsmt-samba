/** 
 * Linux_SambaLoggingOptions.java
 *
 * (C) Copyright IBM Corp. 2005
 *
 * THIS FILE IS PROVIDED UNDER THE TERMS OF THE COMMON PUBLIC LICENSE
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Common Public License from
 * http://www.opensource.org/licenses/cpl1.0.php
 *
 * @author:	ECCG 0.9.7 generated 
 * 			(author should be changed, e.g. First and Last Name <xxx@cc.ibm.com>)
 *
 * Contributors:
 *
 *
 * Description: 
 * 
 */

package org.sblim.wbemsmt.samba.bl.fco;

import java.lang.reflect.Constructor;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt32;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;
import org.sblim.wbemsmt.schema.cim29.CIM_SettingData;



/**
 * 
 */
public class Linux_SambaLoggingOptions extends CIM_SettingData  {
	
	public final static String CIM_CLASS_NAME = "Linux_SambaLoggingOptions"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBALOGGINGFORGLOBAL = "Linux_SambaLoggingForGlobal"; //$NON-NLS-1$
	
	
	/**
	*	
	*/
	public final static String CIM_PROPERTY_DEBUGHIRESTIMESTAMP = "DebugHiresTimestamp"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_DEBUGPID = "DebugPID"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_DEBUGTIMESTAMP = "DebugTimestamp"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_DEBUGUID = "DebugUID"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_LOGFILE = "LogFile"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_LOGLEVEL = "LogLevel"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_MAXLOGSIZE = "MaxLogSize"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_SYSLOG = "SysLog"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_SYSLOGONLY = "SysLogOnly"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DEBUGHIRESTIMESTAMP);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEBUGPID);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEBUGTIMESTAMP);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEBUGUID);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOGFILE);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOGLEVEL);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXLOGSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSLOG);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSLOGONLY);
				
		for (int i = 0; i < CIM_SettingData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEBUGHIRESTIMESTAMP)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEBUGPID)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEBUGTIMESTAMP)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEBUGUID)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOGFILE)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOGLEVEL)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXLOGSIZE)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSLOG)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSLOGONLY)){
				continue;
			}
			
			Linux_SambaLoggingOptions.CIM_PropertyNameList.add(CIM_SettingData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEBUGHIRESTIMESTAMP, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEBUGPID, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEBUGTIMESTAMP, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEBUGUID, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOGFILE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOGLEVEL, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXLOGSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSLOG, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSLOGONLY, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_SettingData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEBUGHIRESTIMESTAMP)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEBUGPID)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEBUGTIMESTAMP)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEBUGUID)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOGFILE)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOGLEVEL)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXLOGSIZE)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSLOG)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSLOGONLY)){
				continue;
			}
			
			Linux_SambaLoggingOptions.CIM_PropertyList.add(CIM_SettingData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.samba.bl.fco");
				
		for (int i = 0; i < CIM_SettingData.Java_Package_List.size(); i++) {
			if (((String)CIM_SettingData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.samba.bl.fco")){
				continue;
			}
			
			Java_Package_List.add(CIM_SettingData.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_SYSLOG = {"LOG_ERR","LOG_WARNING","LOG_NOTICE","LOG_INFO","LOG_DEBUG"};
	
	
	public final static int SYSLOG_LOG_ERR = 0;
	public final static int SYSLOG_LOG_WARNING = 1;
	public final static int SYSLOG_LOG_NOTICE = 2;
	public final static int SYSLOG_LOG_INFO = 3;
	public final static int SYSLOG_LOG_DEBUG = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public Linux_SambaLoggingOptions() {

		this.cimInstance	= new CIMInstance();
		
		for (int i = 0; i < CIM_PropertyList.size(); i++) {
			this.cimInstance.addProperty((CIMProperty)((CIMProperty)CIM_PropertyList.get(i)).clone());
		}
		
		this.cimObjectPath 	= new CIMObjectPath(CIM_CLASS_NAME);
		this.cimInstance.setObjectPath(this.cimObjectPath);

		this.original_cimInstance	= (CIMInstance)this.cimInstance.clone();

		setValidCimInstance(false);
	}


	/**
	*	Class constructor
	*/	
	public Linux_SambaLoggingOptions(Vector keyProperties){ 
		this();
		
		if (keyProperties == null) {
			throw new InvalidParameterException("The keyProperties parameter does not contain a valid reference.");
		
		}
		
		Iterator iter = keyProperties.iterator();
		while (iter.hasNext()) {
			Object property = iter.next();
			
			if (property instanceof CIMProperty) {
				CIMProperty keyProperty = (CIMProperty)property;
				this.cimObjectPath.addKey(keyProperty);
				
				if (this.cimInstance.getProperty(keyProperty.getName()) != null) {
					this.cimInstance.removeProperty(keyProperty.getName());
				}
				this.cimInstance.addProperty(keyProperty);
				
			} else {
				throw new InvalidParameterException("The keyProperties parameter should only contain objects of class CIMProperty.");
				
			}
		}
		
		setValidCimInstance(false);
	}

	
	/**
	*	Class constructor
	*/	
	public Linux_SambaLoggingOptions(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
		if (cimInstance == null) {
			throw new InvalidParameterException("The cimInstance parameter does not contain a valid reference.");
		
		} else if (cimObjectPath == null){
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");		
		
		} else if (!CIM_CLASS_NAME.equals(cimInstance.getClassName())) {
			throw new InvalidParameterException("The class of the cimInstance must be of type " + CIM_CLASS_NAME + ".");
		}
		
		setCimInstance(cimInstance);
		this.original_cimInstance = (CIMInstance)cimInstance.clone();
		this.cimObjectPath        = cimObjectPath;
		setValidCimInstance(true);
	}

	
	/**
	*	The method returns the display name of the class
	*/	
	public String getClassDisplayName(){
		return CIM_CLASS_DISPLAYNAME;
	}
	
	//**********************************************************************
	// Instance methods
	//**********************************************************************

	/**
	*	no description
	*/	
	public boolean isDataValid(Vector invalidProperties) {
		boolean result = true;
		
		if (invalidProperties == null) {
			invalidProperties = new Vector();
		} else {
			invalidProperties.removeAllElements();
		}
		
		CIMProperty CIMProperty_Name = this.cimInstance.getProperty(CIM_PROPERTY_NAME);
		
		if (CIMProperty_Name == null || CIMProperty_Name.getValue().isEmpty() || CIMProperty_Name.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_NAME, "Key"});
			result = false;
		}
		
		return result;
	}
	
	/**
	 * @return Returns the validCimInstance.
	 */
	public boolean isValidCimInstance() {
		return this.validCimInstance;
	}
	
	/**
	 * @param validCimInstance The validCimInstance to set.
	 */
	private void setValidCimInstance(boolean isValidCimInstance) {

		this.validCimInstance = isValidCimInstance;
	}
	
	
	/**
	*	The method returns this CIM instance
	*/
	public CIMInstance getCimInstance() {
		
		return this.cimInstance;
	}
	
	
	/**
	*	The method sets this CIM instance
	*/
	public void setCimInstance(CIMInstance cimInstance) {
		
		this.cimInstance = cimInstance;
	}
	
		
	/**
	*	The method returns this CIM object path
	*/
	public CIMObjectPath getCimObjectPath() {
		return this.cimObjectPath;
	}
	
	
	/**
	*	The method checks if the cimInstance has been modified
	*/
	public boolean isModified() {
	    
	    if (!this.original_cimInstance.equals(this.cimInstance)) 
	        return true;
	    
	    return false;
	}
	
	
	/**
	*	The method resets the values of the cimInstance
	*/	
	public void resetValues() {
	    this.cimInstance = (CIMInstance)this.original_cimInstance.clone();
	}
	
	
	/**
	*	The method checks if the cimInstance equals an other cimInstance
	*/	
	public boolean equals(Object object) {
	    
	    if (!(object instanceof Linux_SambaLoggingOptions)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((Linux_SambaLoggingOptions)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((Linux_SambaLoggingOptions)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((Linux_SambaLoggingOptions)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((Linux_SambaLoggingOptions)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((Linux_SambaLoggingOptions)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((Linux_SambaLoggingOptions)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((Linux_SambaLoggingOptions)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((Linux_SambaLoggingOptions)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((Linux_SambaLoggingOptions)object).cimObjectPath)) {
	        return false;
	        
	    } 
	    
	    return true;
	}
	
	/**
	*	The method return this method as a string
	*/	
	public String toString() {
		return this.cimInstance.toString();
	}

	//*****************************************************
	// Associators methods
	//*****************************************************
	
	public ArrayList getAssociated_Linux_SambaGlobalOptions_Linux_SambaLoggingForGlobals(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBALOGGINGFORGLOBAL, 
					Linux_SambaGlobalOptions.CIM_CLASS_NAME, 
					"SettingData", //$NON-NLS-1$
					"ManagedElement", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaLoggingOptions.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaLoggingOptions.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaLoggingOptions.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaLoggingOptions.Java_Package_List.setElementAt((String)(Linux_SambaLoggingOptions.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaLoggingOptions.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaGlobalOptions(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
					
					Class[] constParams = new Class[2];
					constParams[0] = CIMObjectPath.class;
					constParams[1] = CIMInstance.class;
					Constructor cons = null;
					try {
						cons = clazz.getConstructor(constParams);
						
					} catch(NoSuchMethodException e) {
						System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaGlobalOptions(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaGlobalOptions(cimInstance.getObjectPath(), cimInstance));
						continue;
					}

				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	public ArrayList getAssociated_Linux_SambaGlobalOptions_Linux_SambaLoggingForGlobal_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBALOGGINGFORGLOBAL, 
					Linux_SambaGlobalOptions.CIM_CLASS_NAME, 
					"SettingData", //$NON-NLS-1$
					"ManagedElement"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_SambaGlobalOptions.CIM_CLASS_NAME)) {
						resultArrayList.add(obj);
					}
				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute DebugHiresTimestamp
	
	public Boolean get_DebugHiresTimestamp() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGHIRESTIMESTAMP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGHIRESTIMESTAMP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGHIRESTIMESTAMP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DebugHiresTimestamp(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGHIRESTIMESTAMP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGHIRESTIMESTAMP + " could not be found");
    		
		} else if (!Linux_SambaLoggingOptionsHelper.isValid_DebugHiresTimestamp(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGHIRESTIMESTAMP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGHIRESTIMESTAMP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DebugPID
	
	public Boolean get_DebugPID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGPID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGPID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGPID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DebugPID(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGPID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGPID + " could not be found");
    		
		} else if (!Linux_SambaLoggingOptionsHelper.isValid_DebugPID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGPID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGPID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DebugTimestamp
	
	public Boolean get_DebugTimestamp() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGTIMESTAMP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGTIMESTAMP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGTIMESTAMP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DebugTimestamp(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGTIMESTAMP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGTIMESTAMP + " could not be found");
    		
		} else if (!Linux_SambaLoggingOptionsHelper.isValid_DebugTimestamp(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGTIMESTAMP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGTIMESTAMP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DebugUID
	
	public Boolean get_DebugUID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGUID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGUID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGUID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DebugUID(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGUID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGUID + " could not be found");
    		
		} else if (!Linux_SambaLoggingOptionsHelper.isValid_DebugUID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGUID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_DEBUGUID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LogFile
	
	public String get_LogFile() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaLoggingOptions.CIM_PROPERTY_LOGFILE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_LOGFILE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_LOGFILE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LogFile(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaLoggingOptions.CIM_PROPERTY_LOGFILE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_LOGFILE + " could not be found");
    		
		} else if (!Linux_SambaLoggingOptionsHelper.isValid_LogFile(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + Linux_SambaLoggingOptions.CIM_PROPERTY_LOGFILE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_LOGFILE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LogLevel
	
	public String get_LogLevel() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaLoggingOptions.CIM_PROPERTY_LOGLEVEL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_LOGLEVEL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_LOGLEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LogLevel(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaLoggingOptions.CIM_PROPERTY_LOGLEVEL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_LOGLEVEL + " could not be found");
    		
		} else if (!Linux_SambaLoggingOptionsHelper.isValid_LogLevel(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + Linux_SambaLoggingOptions.CIM_PROPERTY_LOGLEVEL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_LOGLEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxLogSize
	
	public UnsignedInt32 get_MaxLogSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaLoggingOptions.CIM_PROPERTY_MAXLOGSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_MAXLOGSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_MAXLOGSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxLogSize(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaLoggingOptions.CIM_PROPERTY_MAXLOGSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_MAXLOGSIZE + " could not be found");
    		
		} else if (!Linux_SambaLoggingOptionsHelper.isValid_MaxLogSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + Linux_SambaLoggingOptions.CIM_PROPERTY_MAXLOGSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_MAXLOGSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaLoggingOptions.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaLoggingOptions.CIM_PROPERTY_NAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_NAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!Linux_SambaLoggingOptionsHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + Linux_SambaLoggingOptions.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SysLog
	
	public UnsignedInt16 get_SysLog() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaLoggingOptions.CIM_PROPERTY_SYSLOG);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_SYSLOG + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_SYSLOG + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SysLog(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaLoggingOptions.CIM_PROPERTY_SYSLOG);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_SYSLOG + " could not be found");
    		
		} else if (!Linux_SambaLoggingOptionsHelper.isValid_SysLog(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + Linux_SambaLoggingOptions.CIM_PROPERTY_SYSLOG);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_SYSLOG + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SysLogOnly
	
	public Boolean get_SysLogOnly() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaLoggingOptions.CIM_PROPERTY_SYSLOGONLY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_SYSLOGONLY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_SYSLOGONLY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SysLogOnly(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaLoggingOptions.CIM_PROPERTY_SYSLOGONLY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_SYSLOGONLY + " could not be found");
    		
		} else if (!Linux_SambaLoggingOptionsHelper.isValid_SysLogOnly(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + Linux_SambaLoggingOptions.CIM_PROPERTY_SYSLOGONLY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaLoggingOptions.CIM_PROPERTY_SYSLOGONLY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
