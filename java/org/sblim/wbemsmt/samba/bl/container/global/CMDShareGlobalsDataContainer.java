/** 
  * CMDShareGlobalsDataContainer.java
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
  * Description: Container with CLI-extension for global share settings
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.container.global;

public interface CMDShareGlobalsDataContainer extends org.sblim.wbemsmt.samba.bl.container.global.ShareGlobalsDataContainer
{
	/** 
	 * Constants for Fields and Roles
	 **/
			public static final String FIELD_CREATEMASK = "CreateMask" ;
			public static final String FIELD_DIRECTORYMASK = "DirectoryMask" ;
			public static final String FIELD_DIRECTORYSECURITYMASK = "DirectorySecurityMask" ;
		
	
	/** 
	 * Defined Fields
	 **/
			
		/**
		* the Default Create Mask<br>
		* DataType UNSIGNED_INT16<br>
		* UIType TEXTFIELD<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_CreateMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_CreateMask();
			
		/**
		* The directory Mask<br>
		* DataType UNSIGNED_INT16<br>
		* UIType TEXTFIELD<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectoryMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DirectoryMask();
			
		/**
		* <br>
		* DataType UNSIGNED_INT16<br>
		* UIType TEXTFIELD<br>
		* Relation to FCO: Linux_SambaShareSecurityOptions.get_DirectorySecurityMask<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DirectorySecurityMask();
	
	
	/** 
	 * Linked DataContainers
	 **/
	 
	
	
}