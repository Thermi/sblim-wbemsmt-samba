/** 
 * Linux_SambaUser.java
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
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;



/**
 * 
 */
public class Linux_SambaUser extends CIM_ManagedElement  {
	
	public final static String CIM_CLASS_NAME = "Linux_SambaUser"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAADMINUSERSFORGLOBAL = "Linux_SambaAdminUsersForGlobal"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAADMINUSERSFORSHARE = "Linux_SambaAdminUsersForShare"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAFORCEUSERFORGLOBAL = "Linux_SambaForceUserForGlobal"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAFORCEUSERFORPRINTER = "Linux_SambaForceUserForPrinter"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAFORCEUSERFORSHARE = "Linux_SambaForceUserForShare"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGROUPFORUSER = "Linux_SambaGroupForUser"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGUESTACCOUNTFORGLOBAL = "Linux_SambaGuestAccountForGlobal"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAINVALIDUSERSFORGLOBAL = "Linux_SambaInvalidUsersForGlobal"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAINVALIDUSERSFORPRINTER = "Linux_SambaInvalidUsersForPrinter"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAINVALIDUSERSFORSHARE = "Linux_SambaInvalidUsersForShare"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAPRINTERADMINFORGLOBAL = "Linux_SambaPrinterAdminForGlobal"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAPRINTERADMINFORPRINTER = "Linux_SambaPrinterAdminForPrinter"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAREADLISTFORGLOBAL = "Linux_SambaReadListForGlobal"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAREADLISTFORPRINTER = "Linux_SambaReadListForPrinter"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAREADLISTFORSHARE = "Linux_SambaReadListForShare"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAUSERSFORSERVICE = "Linux_SambaUsersForService"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAVALIDUSERSFORGLOBAL = "Linux_SambaValidUsersForGlobal"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAVALIDUSERSFORPRINTER = "Linux_SambaValidUsersForPrinter"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAVALIDUSERSFORSHARE = "Linux_SambaValidUsersForShare"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAWRITELISTFORGLOBAL = "Linux_SambaWriteListForGlobal"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAWRITELISTFORPRINTER = "Linux_SambaWriteListForPrinter"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAWRITELISTFORSHARE = "Linux_SambaWriteListForShare"; //$NON-NLS-1$
	
	
	/**
	*	
	*/
	public final static String CIM_PROPERTY_SAMBAUSERNAME = "SambaUserName"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_SAMBAUSERPASSWORD = "SambaUserPassword"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_SYSTEMUSERNAME = "SystemUserName"; //$NON-NLS-1$
	
	
	/**
	*	
	*/
	public final static String CIM_METHOD_GETALLSYSTEMGROUPS = "getAllSystemGroups";
	/**
	*	
	*/
	public final static String CIM_METHOD_GETALLSYSTEMUSERS = "getAllSystemUsers";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_SAMBAUSERNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SAMBAUSERPASSWORD);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSTEMUSERNAME);
				
		for (int i = 0; i < CIM_ManagedElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SAMBAUSERNAME)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SAMBAUSERPASSWORD)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSTEMUSERNAME)){
				continue;
			}
			
			Linux_SambaUser.CIM_PropertyNameList.add(CIM_ManagedElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SAMBAUSERNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SAMBAUSERPASSWORD, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSTEMUSERNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_ManagedElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SAMBAUSERNAME)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SAMBAUSERPASSWORD)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSTEMUSERNAME)){
				continue;
			}
			
			Linux_SambaUser.CIM_PropertyList.add(CIM_ManagedElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.samba.bl.fco");
				
		for (int i = 0; i < CIM_ManagedElement.Java_Package_List.size(); i++) {
			if (((String)CIM_ManagedElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.samba.bl.fco")){
				continue;
			}
			
			Java_Package_List.add(CIM_ManagedElement.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public Linux_SambaUser() {

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
	public Linux_SambaUser(Vector keyProperties){ 
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
	public Linux_SambaUser(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_SambaUserName = this.cimInstance.getProperty(CIM_PROPERTY_SAMBAUSERNAME);
		
		if (CIMProperty_SambaUserName == null || CIMProperty_SambaUserName.getValue().isEmpty() || CIMProperty_SambaUserName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_SAMBAUSERNAME, "Key"});
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
	    
	    if (!(object instanceof Linux_SambaUser)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((Linux_SambaUser)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((Linux_SambaUser)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((Linux_SambaUser)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((Linux_SambaUser)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((Linux_SambaUser)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((Linux_SambaUser)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((Linux_SambaUser)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((Linux_SambaUser)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((Linux_SambaUser)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_Linux_SambaGlobalOptions_Linux_SambaAdminUsersForGlobals(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAADMINUSERSFORGLOBAL, 
					Linux_SambaGlobalOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaUser.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaUser.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaUser.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaUser.Java_Package_List.setElementAt((String)(Linux_SambaUser.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaUser.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_Linux_SambaGlobalOptions_Linux_SambaAdminUsersForGlobal_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAADMINUSERSFORGLOBAL, 
					Linux_SambaGlobalOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
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

	public ArrayList getAssociated_Linux_SambaShareOptions_Linux_SambaAdminUsersForShares(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAADMINUSERSFORSHARE, 
					Linux_SambaShareOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaUser.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaUser.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaUser.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaUser.Java_Package_List.setElementAt((String)(Linux_SambaUser.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaUser.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaShareOptions(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new Linux_SambaShareOptions(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaShareOptions(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_Linux_SambaShareOptions_Linux_SambaAdminUsersForShare_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAADMINUSERSFORSHARE, 
					Linux_SambaShareOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_SambaShareOptions.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_Linux_SambaGlobalOptions_Linux_SambaForceUserForGlobals(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAFORCEUSERFORGLOBAL, 
					Linux_SambaGlobalOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaUser.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaUser.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaUser.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaUser.Java_Package_List.setElementAt((String)(Linux_SambaUser.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaUser.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_Linux_SambaGlobalOptions_Linux_SambaForceUserForGlobal_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAFORCEUSERFORGLOBAL, 
					Linux_SambaGlobalOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
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

	public ArrayList getAssociated_Linux_SambaPrinterOptions_Linux_SambaForceUserForPrinters(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAFORCEUSERFORPRINTER, 
					Linux_SambaPrinterOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaUser.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaUser.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaUser.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaUser.Java_Package_List.setElementAt((String)(Linux_SambaUser.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaUser.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaPrinterOptions(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new Linux_SambaPrinterOptions(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaPrinterOptions(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_Linux_SambaPrinterOptions_Linux_SambaForceUserForPrinter_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAFORCEUSERFORPRINTER, 
					Linux_SambaPrinterOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_SambaPrinterOptions.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_Linux_SambaShareOptions_Linux_SambaForceUserForShares(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAFORCEUSERFORSHARE, 
					Linux_SambaShareOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaUser.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaUser.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaUser.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaUser.Java_Package_List.setElementAt((String)(Linux_SambaUser.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaUser.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaShareOptions(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new Linux_SambaShareOptions(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaShareOptions(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_Linux_SambaShareOptions_Linux_SambaForceUserForShare_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAFORCEUSERFORSHARE, 
					Linux_SambaShareOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_SambaShareOptions.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_Linux_SambaGroup_Linux_SambaGroupForUsers(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGROUPFORUSER, 
					Linux_SambaGroup.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaUser.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaUser.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaUser.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaUser.Java_Package_List.setElementAt((String)(Linux_SambaUser.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaUser.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaGroup(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new Linux_SambaGroup(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaGroup(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_Linux_SambaGroup_Linux_SambaGroupForUser_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGROUPFORUSER, 
					Linux_SambaGroup.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_SambaGroup.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_Linux_SambaGlobalOptions_Linux_SambaGuestAccountForGlobals(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGUESTACCOUNTFORGLOBAL, 
					Linux_SambaGlobalOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaUser.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaUser.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaUser.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaUser.Java_Package_List.setElementAt((String)(Linux_SambaUser.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaUser.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_Linux_SambaGlobalOptions_Linux_SambaGuestAccountForGlobal_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAGUESTACCOUNTFORGLOBAL, 
					Linux_SambaGlobalOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
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

	public ArrayList getAssociated_Linux_SambaGlobalOptions_Linux_SambaInvalidUsersForGlobals(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAINVALIDUSERSFORGLOBAL, 
					Linux_SambaGlobalOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaUser.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaUser.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaUser.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaUser.Java_Package_List.setElementAt((String)(Linux_SambaUser.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaUser.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_Linux_SambaGlobalOptions_Linux_SambaInvalidUsersForGlobal_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAINVALIDUSERSFORGLOBAL, 
					Linux_SambaGlobalOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
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

	public ArrayList getAssociated_Linux_SambaPrinterOptions_Linux_SambaInvalidUsersForPrinters(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAINVALIDUSERSFORPRINTER, 
					Linux_SambaPrinterOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaUser.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaUser.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaUser.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaUser.Java_Package_List.setElementAt((String)(Linux_SambaUser.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaUser.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaPrinterOptions(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new Linux_SambaPrinterOptions(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaPrinterOptions(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_Linux_SambaPrinterOptions_Linux_SambaInvalidUsersForPrinter_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAINVALIDUSERSFORPRINTER, 
					Linux_SambaPrinterOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_SambaPrinterOptions.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_Linux_SambaShareOptions_Linux_SambaInvalidUsersForShares(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAINVALIDUSERSFORSHARE, 
					Linux_SambaShareOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaUser.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaUser.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaUser.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaUser.Java_Package_List.setElementAt((String)(Linux_SambaUser.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaUser.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaShareOptions(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new Linux_SambaShareOptions(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaShareOptions(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_Linux_SambaShareOptions_Linux_SambaInvalidUsersForShare_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAINVALIDUSERSFORSHARE, 
					Linux_SambaShareOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_SambaShareOptions.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_Linux_SambaGlobalOptions_Linux_SambaPrinterAdminForGlobals(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAPRINTERADMINFORGLOBAL, 
					Linux_SambaGlobalOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaUser.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaUser.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaUser.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaUser.Java_Package_List.setElementAt((String)(Linux_SambaUser.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaUser.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_Linux_SambaGlobalOptions_Linux_SambaPrinterAdminForGlobal_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAPRINTERADMINFORGLOBAL, 
					Linux_SambaGlobalOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
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

	public ArrayList getAssociated_Linux_SambaPrinterOptions_Linux_SambaPrinterAdminForPrinters(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAPRINTERADMINFORPRINTER, 
					Linux_SambaPrinterOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaUser.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaUser.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaUser.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaUser.Java_Package_List.setElementAt((String)(Linux_SambaUser.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaUser.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaPrinterOptions(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new Linux_SambaPrinterOptions(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaPrinterOptions(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_Linux_SambaPrinterOptions_Linux_SambaPrinterAdminForPrinter_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAPRINTERADMINFORPRINTER, 
					Linux_SambaPrinterOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_SambaPrinterOptions.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_Linux_SambaGlobalOptions_Linux_SambaReadListForGlobals(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAREADLISTFORGLOBAL, 
					Linux_SambaGlobalOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaUser.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaUser.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaUser.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaUser.Java_Package_List.setElementAt((String)(Linux_SambaUser.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaUser.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_Linux_SambaGlobalOptions_Linux_SambaReadListForGlobal_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAREADLISTFORGLOBAL, 
					Linux_SambaGlobalOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
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

	public ArrayList getAssociated_Linux_SambaPrinterOptions_Linux_SambaReadListForPrinters(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAREADLISTFORPRINTER, 
					Linux_SambaPrinterOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaUser.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaUser.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaUser.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaUser.Java_Package_List.setElementAt((String)(Linux_SambaUser.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaUser.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaPrinterOptions(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new Linux_SambaPrinterOptions(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaPrinterOptions(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_Linux_SambaPrinterOptions_Linux_SambaReadListForPrinter_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAREADLISTFORPRINTER, 
					Linux_SambaPrinterOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_SambaPrinterOptions.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_Linux_SambaShareOptions_Linux_SambaReadListForShares(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAREADLISTFORSHARE, 
					Linux_SambaShareOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaUser.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaUser.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaUser.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaUser.Java_Package_List.setElementAt((String)(Linux_SambaUser.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaUser.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaShareOptions(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new Linux_SambaShareOptions(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaShareOptions(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_Linux_SambaShareOptions_Linux_SambaReadListForShare_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAREADLISTFORSHARE, 
					Linux_SambaShareOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_SambaShareOptions.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_Linux_SambaService_Linux_SambaUsersForServices(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAUSERSFORSERVICE, 
					Linux_SambaService.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaUser.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaUser.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaUser.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaUser.Java_Package_List.setElementAt((String)(Linux_SambaUser.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaUser.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaService(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new Linux_SambaService(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaService(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_Linux_SambaService_Linux_SambaUsersForService_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAUSERSFORSERVICE, 
					Linux_SambaService.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_SambaService.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_Linux_SambaGlobalOptions_Linux_SambaValidUsersForGlobals(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAVALIDUSERSFORGLOBAL, 
					Linux_SambaGlobalOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaUser.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaUser.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaUser.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaUser.Java_Package_List.setElementAt((String)(Linux_SambaUser.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaUser.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_Linux_SambaGlobalOptions_Linux_SambaValidUsersForGlobal_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAVALIDUSERSFORGLOBAL, 
					Linux_SambaGlobalOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
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

	public ArrayList getAssociated_Linux_SambaPrinterOptions_Linux_SambaValidUsersForPrinters(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAVALIDUSERSFORPRINTER, 
					Linux_SambaPrinterOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaUser.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaUser.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaUser.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaUser.Java_Package_List.setElementAt((String)(Linux_SambaUser.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaUser.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaPrinterOptions(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new Linux_SambaPrinterOptions(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaPrinterOptions(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_Linux_SambaPrinterOptions_Linux_SambaValidUsersForPrinter_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAVALIDUSERSFORPRINTER, 
					Linux_SambaPrinterOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_SambaPrinterOptions.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_Linux_SambaShareOptions_Linux_SambaValidUsersForShares(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAVALIDUSERSFORSHARE, 
					Linux_SambaShareOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaUser.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaUser.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaUser.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaUser.Java_Package_List.setElementAt((String)(Linux_SambaUser.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaUser.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaShareOptions(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new Linux_SambaShareOptions(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaShareOptions(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_Linux_SambaShareOptions_Linux_SambaValidUsersForShare_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAVALIDUSERSFORSHARE, 
					Linux_SambaShareOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_SambaShareOptions.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_Linux_SambaGlobalOptions_Linux_SambaWriteListForGlobals(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAWRITELISTFORGLOBAL, 
					Linux_SambaGlobalOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaUser.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaUser.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaUser.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaUser.Java_Package_List.setElementAt((String)(Linux_SambaUser.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaUser.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_Linux_SambaGlobalOptions_Linux_SambaWriteListForGlobal_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAWRITELISTFORGLOBAL, 
					Linux_SambaGlobalOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
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

	public ArrayList getAssociated_Linux_SambaPrinterOptions_Linux_SambaWriteListForPrinters(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAWRITELISTFORPRINTER, 
					Linux_SambaPrinterOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaUser.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaUser.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaUser.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaUser.Java_Package_List.setElementAt((String)(Linux_SambaUser.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaUser.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaPrinterOptions(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new Linux_SambaPrinterOptions(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaPrinterOptions(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_Linux_SambaPrinterOptions_Linux_SambaWriteListForPrinter_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAWRITELISTFORPRINTER, 
					Linux_SambaPrinterOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_SambaPrinterOptions.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_Linux_SambaShareOptions_Linux_SambaWriteListForShares(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAWRITELISTFORSHARE, 
					Linux_SambaShareOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < Linux_SambaUser.Java_Package_List.size(); i++) {
						if (!((String)(Linux_SambaUser.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(Linux_SambaUser.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							Linux_SambaUser.Java_Package_List.setElementAt((String)(Linux_SambaUser.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (Linux_SambaUser.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaShareOptions(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new Linux_SambaShareOptions(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new Linux_SambaShareOptions(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_Linux_SambaShareOptions_Linux_SambaWriteListForShare_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_LINUX_SAMBAWRITELISTFORSHARE, 
					Linux_SambaShareOptions.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_SambaShareOptions.CIM_CLASS_NAME)) {
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
	
	// Attribute SambaUserName
	
	public String get_SambaUserName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaUser.CIM_PROPERTY_SAMBAUSERNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaUser.CIM_PROPERTY_SAMBAUSERNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaUser.CIM_PROPERTY_SAMBAUSERNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SambaUserName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaUser.CIM_PROPERTY_SAMBAUSERNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + Linux_SambaUser.CIM_PROPERTY_SAMBAUSERNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaUser.CIM_PROPERTY_SAMBAUSERNAME + " could not be found");
    		
		} else if (!Linux_SambaUserHelper.isValid_SambaUserName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + Linux_SambaUser.CIM_PROPERTY_SAMBAUSERNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaUser.CIM_PROPERTY_SAMBAUSERNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SambaUserPassword
	    
			
	public void set_SambaUserPassword(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaUser.CIM_PROPERTY_SAMBAUSERPASSWORD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaUser.CIM_PROPERTY_SAMBAUSERPASSWORD + " could not be found");
    		
		} else if (!Linux_SambaUserHelper.isValid_SambaUserPassword(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + Linux_SambaUser.CIM_PROPERTY_SAMBAUSERPASSWORD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaUser.CIM_PROPERTY_SAMBAUSERPASSWORD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SystemUserName
	
	public String get_SystemUserName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaUser.CIM_PROPERTY_SYSTEMUSERNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaUser.CIM_PROPERTY_SYSTEMUSERNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaUser.CIM_PROPERTY_SYSTEMUSERNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SystemUserName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(Linux_SambaUser.CIM_PROPERTY_SYSTEMUSERNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + Linux_SambaUser.CIM_PROPERTY_SYSTEMUSERNAME + " could not be found");
    		
		} else if (!Linux_SambaUserHelper.isValid_SystemUserName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + Linux_SambaUser.CIM_PROPERTY_SYSTEMUSERNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + Linux_SambaUser.CIM_PROPERTY_SYSTEMUSERNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public String invoke_getAllSystemGroups(CIMClient cimClient) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				Linux_SambaUser.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	
	  	
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_GETALLSYSTEMGROUPS,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					Linux_SambaUser.CIM_METHOD_GETALLSYSTEMGROUPS + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					Linux_SambaUser.CIM_METHOD_GETALLSYSTEMGROUPS + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + Linux_SambaUser.CIM_METHOD_GETALLSYSTEMGROUPS + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");		
		}

		return (String)returnValue.getValue(); 		  	
	  }

	
	public static String invoke_getAllSystemUsers(CIMClient cimClient) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(new CIMObjectPath(CIM_CLASS_NAME), 
				  									  CIM_METHOD_GETALLSYSTEMUSERS,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					Linux_SambaUser.CIM_METHOD_GETALLSYSTEMUSERS + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					Linux_SambaUser.CIM_METHOD_GETALLSYSTEMUSERS + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + Linux_SambaUser.CIM_METHOD_GETALLSYSTEMUSERS + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");		
		}

		return (String)returnValue.getValue(); 		  	
	  }
}
