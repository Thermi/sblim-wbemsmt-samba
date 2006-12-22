/** 
  * ShareOptionsDataContainer.java
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
  * Description: Container for Share Options
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.container.share;

public interface ShareOptionsDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer
{
	/** 
	 * Constants for Fields and Roles
	 **/
			public static final String FIELD_NAME = "Name" ;
			public static final String FIELD_AVAILABLE = "Available" ;
			public static final String FIELD_COMMENT = "Comment" ;
			public static final String FIELD_PATH = "Path" ;
			public static final String FIELD_BROWSABLE = "Browsable" ;
			public static final String FIELD_GUESTOK = "GuestOK" ;
			public static final String FIELD_GUESTONLY = "GuestOnly" ;
			public static final String FIELD_HOSTSALLOW = "HostsAllow" ;
			public static final String FIELD_HOSTSDENY = "HostsDeny" ;
			public static final String FIELD_READONLY = "ReadOnly" ;
		
	
	/** 
	 * Defined Fields
	 **/
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType LABEL<br>
		* Relation to FCO: Linux_SambaShareOptions.get_Name<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Name();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaShareOptions.get_Available<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Available();
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType TEXTFIELD<br>
		* Relation to FCO: Linux_SambaShareOptions.get_Comment<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Comment();
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType TEXTFIELD<br>
		* Relation to FCO: Linux_SambaShareOptions.get_Path<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Path();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaSharePrinterBrowseOptions.get_Browsable<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Browsable();
			
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
	 * Linked DataContainers
	 **/
	 
	
	
}