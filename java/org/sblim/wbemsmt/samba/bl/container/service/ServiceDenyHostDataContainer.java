/** 
  * ServiceDenyHostDataContainer.java
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
  * Description: Container to define DenyHosts
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.container.service;

public interface ServiceDenyHostDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer
{
	/** 
	 * Constants for Fields and Roles
	 **/
			public static final String FIELD_USR_DENIEDHOSTS = "usr_DeniedHosts" ;
			public static final String FIELD_USR_HOSTSTODENY = "usr_HostsToDeny" ;
			public static final String FIELD_USR_ADDHOST = "usr_AddHost" ;
			public static final String FIELD_USR_REMOVEHOST = "usr_RemoveHost" ;
		
	
	/** 
	 * Defined Fields
	 **/
			
		/**
		* <br>
		* DataType UNSIGNED_INT16<br>
		* UIType LIST<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_DeniedHosts();
			
		/**
		* <br>
		* DataType UNSIGNED_INT16<br>
		* UIType LIST<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_HostsToDeny();
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType BUTTON<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_AddHost();
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType BUTTON<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_RemoveHost();
	
	
	/** 
	 * Linked DataContainers
	 **/
	 
	
	
}