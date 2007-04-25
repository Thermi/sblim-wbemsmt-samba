/** 
  * ServiceGlobalSecurityOptionsDataContainer.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
  * @template: ./tools-dcg/templates/containerClass.vm
  *
  * Contributors: 
  * 
  * Description: Container for defining Security Options
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.container.service;

public interface ServiceGlobalSecurityOptionsDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer
{
	/** 
	 * Constants for Fields and Roles
	 **/
			public static final String FIELD_AUTHMETHODS = "AuthMethods" ;
			public static final String FIELD_ENCRYPTPASSWORDS = "EncryptPasswords" ;
			public static final String FIELD_MINPASSWORDLENGTH = "MinPasswordLength" ;
			public static final String FIELD_NULLPASSWORDS = "NullPasswords" ;
			public static final String FIELD_USR_PASSDBBACKEND = "usr_PassdbBackend" ;
			public static final String FIELD_SMBPASSWDFILE = "SMBPasswdFile" ;
			public static final String FIELD_SECURITY = "Security" ;
			public static final String FIELD_GUESTOK = "GuestOK" ;
			public static final String FIELD_GUESTONLY = "GuestOnly" ;
			public static final String FIELD_HOSTSALLOW = "HostsAllow" ;
			public static final String FIELD_HOSTSDENY = "HostsDeny" ;
			public static final String FIELD_READONLY = "ReadOnly" ;
			public static final String FIELD_DOMAINMASTER = "DomainMaster" ;
			public static final String FIELD_BROWSABLE = "Browsable" ;
		
	
	/** 
	 * Defined Fields
	 **/
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType TEXTFIELD<br>
		* Relation to FCO: Linux_SambaGlobalSecurityOptions.get_AuthMethods<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_AuthMethods();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaGlobalSecurityOptions.get_EncryptPasswords<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_EncryptPasswords();
			
		/**
		* <br>
		* DataType UNSIGNED_INT8<br>
		* UIType TEXTFIELD<br>
		* Relation to FCO: Linux_SambaGlobalSecurityOptions.get_MinPasswordLength<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_MinPasswordLength();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaGlobalSecurityOptions.get_NullPasswords<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_NullPasswords();
			
		/**
		* <br>
		* DataType UNSIGNED_INT16<br>
		* UIType COMBOBOX<br>
		* Relation to FCO: Linux_SambaGlobalSecurityOptions.get_PassdbBackend<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_PassdbBackend();
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType TEXTFIELD<br>
		* Relation to FCO: Linux_SambaGlobalSecurityOptions.get_SMBPasswdFile<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SMBPasswdFile();
			
		/**
		* <br>
		* DataType UNSIGNED_INT8<br>
		* UIType COMBOBOX<br>
		* Relation to FCO: Linux_SambaGlobalSecurityOptions.get_Security<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_Security();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaCommonSecurityOptions.get_GuestOK<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_GuestOK();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaCommonSecurityOptions.get_GuestOnly<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_GuestOnly();
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType TEXTFIELD<br>
		* Relation to FCO: Linux_SambaCommonSecurityOptions.get_HostsAllow<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_HostsAllow();
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType TEXTFIELD<br>
		* Relation to FCO: Linux_SambaCommonSecurityOptions.get_HostsDeny<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_HostsDeny();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaCommonSecurityOptions.get_ReadOnly<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_ReadOnly();
			
		/**
		* <br>
		* DataType UNSIGNED_INT16<br>
		* UIType COMBOBOX<br>
		* Relation to FCO: Linux_SambaGlobalBrowseOptions.get_DomainMaster<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_DomainMaster();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaGlobalBrowseOptions.get_Browsable<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Browsable();
	
	
	/** 
	 * Linked DataContainers
	 **/
	 
	
	
}