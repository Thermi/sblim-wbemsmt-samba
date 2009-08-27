/** 
  * UserWizardPage2.java
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

				
		public java.util.List<ShareInUserWizardACLItemDataContainer> getShares();
		
		
	   		
	   /**
		* Header for:
		* 
		* linked container ShareInUserWizardACLItemDataContainer
		*/
		public  org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainerHeader getSharesHeader();
		
					
				
		/**
		* 
		* linked container PrinterInUserWizardACLItemDataContainer
		*/

				
		public java.util.List<PrinterInUserWizardACLItemDataContainer> getPrinters();
		
		
	   		
	   /**
		* Header for:
		* 
		* linked container PrinterInUserWizardACLItemDataContainer
		*/
		public  org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainerHeader getPrintersHeader();
		
			
}