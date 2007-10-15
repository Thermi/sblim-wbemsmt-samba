/** 
  * UserInPrinterACLDataContainer.java
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
  * Description: 
  * 
  * Header for:
 * 
 * linked container UserACLItemDataContainerForPrinter
  */

package org.sblim.wbemsmt.samba.bl.container.printer;


public interface UserACLItemDataContainerForPrinterHeader
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
	* relates to<br> Linux_SambaReadListForShare<br> Linux_SambaWriteListForShare<br> Linux_SambaInvalidUsersForShare<br> Linux_SambaValidUsersForShare<br> <br>
	* DataType UNSIGNED_INT16<br>
	* UIType RADIOBUTTON<br>
	* Relation to FCO: userdefined<br>
	*/
	public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_AccessTypeVI();
		/**
	* Header for
	* relates to<br> Linux_SambaReadListForShare<br> Linux_SambaWriteListForShare<br> Linux_SambaInvalidUsersForShare<br> Linux_SambaValidUsersForShare<br> <br>
	* DataType UNSIGNED_INT16<br>
	* UIType RADIOBUTTON<br>
	* Relation to FCO: userdefined<br>
	*/
	public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_AccessTypeRW();
		/**
	* Header for
	* relates to Linux_SambaAdminUsersForShare<br>
	* DataType BOOLEAN<br>
	* UIType CHECKBOX<br>
	* Relation to FCO: userdefined<br>
	*/
	public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_Admin();
	}