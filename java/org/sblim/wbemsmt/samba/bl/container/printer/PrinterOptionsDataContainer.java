/** 
  * PrinterOptionsDataContainer.java
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
  * Description: Container for a printer's options
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.container.printer;

public interface PrinterOptionsDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer
{
	/** 
	 * Constants for Fields and Roles
	 **/
			public static final String FIELD_NAME = "Name" ;
			public static final String FIELD_USR_SYSTEMPRINTERNAME = "usr_SystemPrinterName" ;
			public static final String FIELD_PATH = "Path" ;
			public static final String FIELD_COMMENT = "Comment" ;
			public static final String FIELD_AVAILABLE = "Available" ;
			public static final String FIELD_GUESTOK = "GuestOK" ;
			public static final String FIELD_GUESTONLY = "GuestOnly" ;
			public static final String FIELD_HOSTSALLOW = "HostsAllow" ;
			public static final String FIELD_HOSTSDENY = "HostsDeny" ;
			public static final String FIELD_READONLY = "ReadOnly" ;
			public static final String FIELD_BROWSABLE = "Browsable" ;
		
	
	/** 
	 * Defined Fields
	 **/
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType LABEL<br>
		* Relation to FCO: Linux_SambaPrinterOptions.get_Name<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Name();
			
		/**
		* <br>
		* DataType UNSIGNED_INT16<br>
		* UIType COMBOBOX<br>
		* Relation to FCO: Linux_SambaPrinterOptions.get_SystemPrinterName<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_SystemPrinterName();
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType TEXTFIELD<br>
		* Relation to FCO: Linux_SambaPrinterOptions.get_Path<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Path();
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType TEXTFIELD<br>
		* Relation to FCO: Linux_SambaPrinterOptions.get_Comment<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Comment();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaPrinterOptions.get_Available<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Available();
			
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
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaSharePrinterBrowseOptions.get_Browsable<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Browsable();
	
	
	/** 
	 * Linked DataContainers
	 **/
	
}