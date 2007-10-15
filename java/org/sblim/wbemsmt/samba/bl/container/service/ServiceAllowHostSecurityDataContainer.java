/** 
  * ServiceAllowHostSecurityDataContainer.java
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
  * Description: Container to define AllowHosts
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.container.service;

public interface ServiceAllowHostSecurityDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer
{
	/** 
	 * Constants for Fields and Roles
	 **/
			public static final String FIELD_USR_ALLOWEDHOSTS = "usr_AllowedHosts" ;
			public static final String FIELD_USR_HOSTSTOALLOW = "usr_HostsToAllow" ;
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
		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_AllowedHosts();
			
		/**
		* <br>
		* DataType UNSIGNED_INT16<br>
		* UIType LIST<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_HostsToAllow();
			
		/**
		* <br>
		* DataType ACTION<br>
		* UIType BUTTON<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_AddHost();
			
		/**
		* <br>
		* DataType ACTION<br>
		* UIType BUTTON<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_RemoveHost();
	
	
	/** 
	 * Linked DataContainers
	 **/
	
}