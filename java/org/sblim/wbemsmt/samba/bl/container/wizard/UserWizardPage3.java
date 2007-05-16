/** 
  * UserWizardPage3.java
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
  * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm
  *
  * Contributors: 
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.container.wizard;

public interface UserWizardPage3 extends org.sblim.wbemsmt.bl.adapter.DataContainer
{
	/** 
	 * Constants for Fields and Roles
	 **/
			public static final String FIELD_SAMBAUSERNAME = "SambaUserName" ;
			public static final String FIELD_SYSTEMUSERNAME = "SystemUserName" ;
			public static final String FIELD_USR_ISGUEST = "usr_IsGuest" ;
				public static final String ROLE_SHARES = "shares";
			public static final String ROLE_PRINTERS = "printers";
	
	
	/** 
	 * Defined Fields
	 **/
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType LABEL<br>
		* Relation to FCO: Linux_SambaUser.get_SambaUserName<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SambaUserName();
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType LABEL<br>
		* Relation to FCO: Linux_SambaUser.get_SystemUserName<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SystemUserName();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_IsGuest();
	
	
	/** 
	 * Linked DataContainers
	 **/
	 
	
			
		/**
		* 
		* linked container ShareInUserWizardACLItemDataContainer
		*/

		public java.util.List getShares();

			
		/**
		* 
		* linked container PrinterInUserWizardACLItemDataContainer
		*/

		public java.util.List getPrinters();

	
}