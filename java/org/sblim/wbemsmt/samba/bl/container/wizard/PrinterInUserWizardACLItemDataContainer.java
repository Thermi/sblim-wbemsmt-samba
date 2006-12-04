/** 
  * PrinterInUserWizardACLItemDataContainer.java
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
  * Description: Defines a printer-related acl within the user wizard
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.container.wizard;

public interface PrinterInUserWizardACLItemDataContainer extends org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer
{
	/** 
	 * Constants for Fields and Roles
	 **/
			public static final String FIELD_PRINTERNAME = "PrinterName" ;
			public static final String FIELD_USR_ACCESSTYPEVI = "usr_AccessTypeVI" ;
			public static final String FIELD_USR_ACCESSTYPERW = "usr_AccessTypeRW" ;
			public static final String FIELD_USR_ADMIN = "usr_Admin" ;
		
	
	/** 
	 * Defined Fields
	 **/
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType LABEL<br>
		* Relation to FCO: Linux_SambaPrinterOptions.get_Name<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_PrinterName();
			
		/**
		* relates to<br> Linux_SambaReadListForShare<br> Linux_SambaWriteListForShare<br> Linux_SambaInvalidUsersForShare<br> Linux_SambaValidUsersForShare<br> <br>
		* DataType UNSIGNED_INT16<br>
		* UIType RADIOBUTTON<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_AccessTypeVI();
			
		/**
		* relates to<br> Linux_SambaReadListForShare<br> Linux_SambaWriteListForShare<br> Linux_SambaInvalidUsersForShare<br> Linux_SambaValidUsersForShare<br> <br>
		* DataType UNSIGNED_INT16<br>
		* UIType RADIOBUTTON<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_AccessTypeRW();
			
		/**
		* relates to Linux_SambaAdminUsersForShare<br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Admin();
	
	
	/** 
	 * Linked DataContainers
	 **/
	 
	
	
}