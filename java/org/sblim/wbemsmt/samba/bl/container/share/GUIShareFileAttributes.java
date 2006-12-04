/** 
  * GUIShareFileAttributes.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
  * @template: ./tools-dcg/templates/containerClass.vm
  *
  * Contributors: 
  * 
  * Description: UI extensions for FileAttributres for a share
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.container.share;

public interface GUIShareFileAttributes extends org.sblim.wbemsmt.samba.bl.container.share.ShareFileAttributes
{
	/** 
	 * Constants for Fields and Roles
	 **/
			public static final String FIELD_CASESENSITIVE = "CaseSensitive" ;
			public static final String FIELD_HIDEDOTFILES = "HideDotFiles" ;
			public static final String FIELD_DOSFILETIMES = "DosFiletimes" ;
			public static final String FIELD_EASUPPORT = "EASupport" ;
			public static final String FIELD_ACLCOMPATIBILITY = "AclCompatibility" ;
			public static final String FIELD_NTACLSUPPORT = "NTACLSupport" ;
			public static final String FIELD_USR_CREATE_U = "usr_Create_u" ;
			public static final String FIELD_USR_CREATE_G = "usr_Create_g" ;
			public static final String FIELD_USR_CREATE_S = "usr_Create_s" ;
			public static final String FIELD_USR_CREATE_USER_R = "usr_Create_user_r" ;
			public static final String FIELD_USR_CREATE_USER_W = "usr_Create_user_w" ;
			public static final String FIELD_USR_CREATE_USER_X = "usr_Create_user_x" ;
			public static final String FIELD_USR_CREATE_GROUP_R = "usr_Create_group_r" ;
			public static final String FIELD_USR_CREATE_GROUP_W = "usr_Create_group_w" ;
			public static final String FIELD_USR_CREATE_GROUP_X = "usr_Create_group_x" ;
			public static final String FIELD_USR_CREATE_OTHER_R = "usr_Create_other_r" ;
			public static final String FIELD_USR_CREATE_OTHER_W = "usr_Create_other_w" ;
			public static final String FIELD_USR_CREATE_OTHER_X = "usr_Create_other_x" ;
			public static final String FIELD_USR_DIRECTORY_U = "usr_Directory_u" ;
			public static final String FIELD_USR_DIRECTORY_G = "usr_Directory_g" ;
			public static final String FIELD_USR_DIRECTORY_S = "usr_Directory_s" ;
			public static final String FIELD_USR_DIRECTORY_USER_R = "usr_Directory_user_r" ;
			public static final String FIELD_USR_DIRECTORY_USER_W = "usr_Directory_user_w" ;
			public static final String FIELD_USR_DIRECTORY_USER_X = "usr_Directory_user_x" ;
			public static final String FIELD_USR_DIRECTORY_GROUP_R = "usr_Directory_group_r" ;
			public static final String FIELD_USR_DIRECTORY_GROUP_W = "usr_Directory_group_w" ;
			public static final String FIELD_USR_DIRECTORY_GROUP_X = "usr_Directory_group_x" ;
			public static final String FIELD_USR_DIRECTORY_OTHER_R = "usr_Directory_other_r" ;
			public static final String FIELD_USR_DIRECTORY_OTHER_W = "usr_Directory_other_w" ;
			public static final String FIELD_USR_DIRECTORY_OTHER_X = "usr_Directory_other_x" ;
			public static final String FIELD_USR_DIRECTORY_SECURITY_U = "usr_Directory_security_u" ;
			public static final String FIELD_USR_DIRECTORY_SECURITY_G = "usr_Directory_security_g" ;
			public static final String FIELD_USR_DIRECTORY_SECURITY_S = "usr_Directory_security_s" ;
			public static final String FIELD_USR_DIRECTORY_SECURITY_USER_R = "usr_Directory_security_user_r" ;
			public static final String FIELD_USR_DIRECTORY_SECURITY_USER_W = "usr_Directory_security_user_w" ;
			public static final String FIELD_USR_DIRECTORY_SECURITY_USER_X = "usr_Directory_security_user_x" ;
			public static final String FIELD_USR_DIRECTORY_SECURITY_GROUP_R = "usr_Directory_security_group_r" ;
			public static final String FIELD_USR_DIRECTORY_SECURITY_GROUP_W = "usr_Directory_security_group_w" ;
			public static final String FIELD_USR_DIRECTORY_SECURITY_GROUP_X = "usr_Directory_security_group_x" ;
			public static final String FIELD_USR_DIRECTORY_SECURITY_OTHER_R = "usr_Directory_security_other_r" ;
			public static final String FIELD_USR_DIRECTORY_SECURITY_OTHER_W = "usr_Directory_security_other_w" ;
			public static final String FIELD_USR_DIRECTORY_SECURITY_OTHER_X = "usr_Directory_security_other_x" ;
		
	
	/** 
	 * Defined Fields
	 **/
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareFileNameHandlingOptions.get_CaseSensitive<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_CaseSensitive();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareFileNameHandlingOptions.get_HideDotFiles<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_HideDotFiles();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareFileNameHandlingOptions.get_DosFiletimes<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DosFiletimes();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareProtocolOptions.get_EASupport<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_EASupport();
			
		/**
		* <br>
		* DataType UNSIGNED_INT8<br>
		* UIType COMBOBOX<br>
		* Relation to FCO: Linux_SambaShareProtocolOptions.get_AclCompatibility<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_AclCompatibility();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareProtocolOptions.get_NTACLSupport<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_NTACLSupport();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_CreateMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_u();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_CreateMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_g();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_CreateMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_s();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_CreateMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_user_r();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_CreateMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_user_w();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_CreateMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_user_x();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_CreateMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_group_r();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_CreateMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_group_w();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_CreateMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_group_x();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_CreateMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_other_r();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_CreateMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_other_w();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_CreateMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_other_x();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectoryMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_u();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectoryMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_g();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectoryMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_s();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectoryMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_user_r();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectoryMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_user_w();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectoryMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_user_x();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectoryMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_group_r();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectoryMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_group_w();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectoryMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_group_x();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectoryMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_other_r();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectoryMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_other_w();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectoryMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_other_x();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectorySecurityMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_u();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectorySecurityMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_g();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectorySecurityMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_s();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectorySecurityMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_user_r();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectorySecurityMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_user_w();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectorySecurityMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_user_x();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectorySecurityMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_group_r();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectorySecurityMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_group_w();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectorySecurityMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_group_x();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectorySecurityMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_other_r();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectorySecurityMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_other_w();
			
		/**
		* only one part of the bitmask<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectorySecurityMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_other_x();
	
	
	/** 
	 * Linked DataContainers
	 **/
	 
	
	
}