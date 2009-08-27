/** 
  * PrinterWizardPage3.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.container.wizard;

public interface PrinterWizardPage3 extends org.sblim.wbemsmt.bl.adapter.DataContainer
{
	/** 
	 * Constants for Fields and Roles
	 **/
			public static final String FIELD_USR_SEENBYEVERYBODY = "usr_SeenByEverybody" ;
			public static final String FIELD_USR_ENABLEGUEST = "usr_EnableGuest" ;
			public static final String FIELD_USR_ENABLEALLUSERS = "usr_EnableAllUsers" ;
			public static final String FIELD_USR_FORCEUSER = "usr_ForceUser" ;
				public static final String ROLE_USERS = "users";
	
	
	/** 
	 * Defined Fields
	 **/
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_SeenByEverybody();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_EnableGuest();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX_WITH_CLICKEVENT<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_EnableAllUsers();
			
		/**
		* <br>
		* DataType UNSIGNED_INT16<br>
		* UIType COMBOBOX<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_ForceUser();
	
	
	/** 
	 * Linked DataContainers
	 **/
			
				
		/**
		* 
		* linked container UserInPrinterWizardACLItemDataContainer
		*/

				
		public java.util.List<UserInPrinterWizardACLItemDataContainer> getUsers();
		
		
	   		
	   /**
		* Header for:
		* 
		* linked container UserInPrinterWizardACLItemDataContainer
		*/
		public  org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainerHeader getUsersHeader();
		
			
}