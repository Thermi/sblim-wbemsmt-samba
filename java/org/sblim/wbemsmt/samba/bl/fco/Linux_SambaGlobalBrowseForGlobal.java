/** 
 * Linux_SambaGlobalBrowseForGlobal.java
 *
 * © Copyright IBM Corp. 2005
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

import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbemsmt.schema.cim29.CIM_ElementSettingData;


/**
 * 
 */
public class Linux_SambaGlobalBrowseForGlobal extends CIM_ElementSettingData  {
	
	public final static String CIM_CLASS_NAME = "Linux_SambaGlobalBrowseForGlobal"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_PROPERTY_LINUX_SAMBAGLOBALBROWSEOPTIONS = "SettingData"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_LINUX_SAMBAGLOBALOPTIONS = "ManagedElement"; //$NON-NLS-1$
	
	
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_LINUX_SAMBAGLOBALBROWSEOPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_LINUX_SAMBAGLOBALOPTIONS);
				
		for (int i = 0; i < CIM_ElementSettingData.CIM_PropertyNameList.size(); i++) {
			
			Linux_SambaGlobalBrowseForGlobal.CIM_PropertyNameList.add(CIM_ElementSettingData.CIM_PropertyNameList.elementAt(i));
		}
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LINUX_SAMBAGLOBALBROWSEOPTIONS, new CIMValue(null, new CIMDataType(Linux_SambaGlobalBrowseOptions.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LINUX_SAMBAGLOBALOPTIONS, new CIMValue(null, new CIMDataType(Linux_SambaGlobalOptions.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_ElementSettingData.CIM_PropertyList.size(); i++) {
			
			Linux_SambaGlobalBrowseForGlobal.CIM_PropertyList.add(CIM_ElementSettingData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.samba.bl.fco");
				
		for (int i = 0; i < CIM_ElementSettingData.Java_Package_List.size(); i++) {
			if (((String)CIM_ElementSettingData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.samba.bl.fco")){
				continue;
			}
			
			Java_Package_List.add(CIM_ElementSettingData.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public Linux_SambaGlobalBrowseForGlobal() {

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
	public Linux_SambaGlobalBrowseForGlobal(Vector keyProperties){ 
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
	public Linux_SambaGlobalBrowseForGlobal(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof Linux_SambaGlobalBrowseForGlobal)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((Linux_SambaGlobalBrowseForGlobal)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((Linux_SambaGlobalBrowseForGlobal)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((Linux_SambaGlobalBrowseForGlobal)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((Linux_SambaGlobalBrowseForGlobal)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((Linux_SambaGlobalBrowseForGlobal)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((Linux_SambaGlobalBrowseForGlobal)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((Linux_SambaGlobalBrowseForGlobal)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((Linux_SambaGlobalBrowseForGlobal)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((Linux_SambaGlobalBrowseForGlobal)object).cimObjectPath)) {
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
	
	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute Linux_SambaGlobalBrowseOptions
	
	public CIMObjectPath get_Linux_SambaGlobalBrowseOptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaGlobalBrowseForGlobal.CIM_PROPERTY_LINUX_SAMBAGLOBALBROWSEOPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaGlobalBrowseForGlobal.CIM_PROPERTY_LINUX_SAMBAGLOBALBROWSEOPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(Linux_SambaGlobalBrowseOptions.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaGlobalBrowseForGlobal.CIM_PROPERTY_LINUX_SAMBAGLOBALBROWSEOPTIONS + " is not of expected type Linux_SambaGlobalBrowseOptions.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Linux_SambaGlobalBrowseOptions(Linux_SambaGlobalBrowseOptions newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaGlobalBrowseForGlobal.CIM_PROPERTY_LINUX_SAMBAGLOBALBROWSEOPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaGlobalBrowseForGlobal.CIM_PROPERTY_LINUX_SAMBAGLOBALBROWSEOPTIONS + " could not be found");
    		
		} else if (!Linux_SambaGlobalBrowseForGlobalHelper.isValid_Linux_SambaGlobalBrowseOptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + Linux_SambaGlobalBrowseForGlobal.CIM_PROPERTY_LINUX_SAMBAGLOBALBROWSEOPTIONS);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(Linux_SambaGlobalBrowseOptions.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaGlobalBrowseForGlobal.CIM_PROPERTY_LINUX_SAMBAGLOBALBROWSEOPTIONS + " is not of expected type Linux_SambaGlobalBrowseOptions.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(Linux_SambaGlobalBrowseOptions.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Linux_SambaGlobalOptions
	
	public CIMObjectPath get_Linux_SambaGlobalOptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaGlobalBrowseForGlobal.CIM_PROPERTY_LINUX_SAMBAGLOBALOPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaGlobalBrowseForGlobal.CIM_PROPERTY_LINUX_SAMBAGLOBALOPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(Linux_SambaGlobalOptions.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaGlobalBrowseForGlobal.CIM_PROPERTY_LINUX_SAMBAGLOBALOPTIONS + " is not of expected type Linux_SambaGlobalOptions.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Linux_SambaGlobalOptions(Linux_SambaGlobalOptions newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaGlobalBrowseForGlobal.CIM_PROPERTY_LINUX_SAMBAGLOBALOPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaGlobalBrowseForGlobal.CIM_PROPERTY_LINUX_SAMBAGLOBALOPTIONS + " could not be found");
    		
		} else if (!Linux_SambaGlobalBrowseForGlobalHelper.isValid_Linux_SambaGlobalOptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + Linux_SambaGlobalBrowseForGlobal.CIM_PROPERTY_LINUX_SAMBAGLOBALOPTIONS);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(Linux_SambaGlobalOptions.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaGlobalBrowseForGlobal.CIM_PROPERTY_LINUX_SAMBAGLOBALOPTIONS + " is not of expected type Linux_SambaGlobalOptions.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(Linux_SambaGlobalOptions.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
