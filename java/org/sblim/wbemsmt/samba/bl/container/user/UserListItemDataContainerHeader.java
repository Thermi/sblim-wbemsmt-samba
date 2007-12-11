/** 
  * UserListDataContainer.java
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
  * @template: org/sblim/wbemsmt/dcg/templates/headerClass.vm
  *
  * Contributors: 
  * 
  * Description: List with users
  * 
  * Header for:
 * 
 * linked container UserListItemDataContainer
  */

package org.sblim.wbemsmt.samba.bl.container.user;


public interface UserListItemDataContainerHeader
{
		/**
	* Header for
	* <br>
	* DataType STRING<br>
	* UIType LABEL<br>
	* Relation to FCO: Linux_SambaUser.get_SambaUserName<br>
	*/
	public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_SambaUserName();
		/**
	* Header for
	* <br>
	* DataType STRING<br>
	* UIType LABEL<br>
	* Relation to FCO: Linux_SambaUser.get_SystemUserName<br>
	*/
	public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_SystemUserName();
		/**
	* Header for
	* <br>
	* DataType BOOLEAN<br>
	* UIType CHECKBOX<br>
	* Relation to FCO: userdefined<br>
	*/
	public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_IsGuest();
	}