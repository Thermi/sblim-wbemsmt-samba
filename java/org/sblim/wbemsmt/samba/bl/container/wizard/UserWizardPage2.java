/** 
  * UserWizardPage2.java
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
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.container.wizard;

public interface UserWizardPage2 extends org.sblim.wbemsmt.bl.adapter.DataContainer
{
	/** 
	 * Constants for Fields and Roles
	 **/
			public static final String FIELD_USR_ACCESSTOALL = "usr_AccessToAll" ;
				public static final String ROLE_SHARES = "shares";
			public static final String ROLE_PRINTERS = "printers";
	
	
	/** 
	 * Defined Fields
	 **/
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX_WITH_CLICKEVENT<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_AccessToAll();
	
	
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