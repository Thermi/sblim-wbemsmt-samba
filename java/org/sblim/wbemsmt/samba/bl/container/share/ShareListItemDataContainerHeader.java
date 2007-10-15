/** 
  * ShareListDataContainer.java
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
  * Description: List with shares
  * 
  * Header for:
 * 
 * linked container ShareListItemDataContainer
  */

package org.sblim.wbemsmt.samba.bl.container.share;


public interface ShareListItemDataContainerHeader
{
		/**
	* Header for
	* <br>
	* DataType STRING<br>
	* UIType LABEL<br>
	* Relation to FCO: Linux_SambaShareOptions.get_Name<br>
	*/
	public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_Name();
		/**
	* Header for
	* <br>
	* DataType BOOLEAN<br>
	* UIType CHECKBOX<br>
	* Relation to FCO: Linux_SambaShareOptions.get_Available<br>
	*/
	public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_Available();
		/**
	* Header for
	* <br>
	* DataType STRING<br>
	* UIType TEXTFIELD<br>
	* Relation to FCO: Linux_SambaShareOptions.get_Comment<br>
	*/
	public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_Comment();
		/**
	* Header for
	* <br>
	* DataType STRING<br>
	* UIType TEXTFIELD<br>
	* Relation to FCO: Linux_SambaShareOptions.get_Path<br>
	*/
	public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_Path();
		/**
	* Header for
	* <br>
	* DataType BOOLEAN<br>
	* UIType CHECKBOX<br>
	* Relation to FCO: Linux_SambaSharePrinterBrowseOptions.get_Browsable<br>
	*/
	public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_Browsable();
		/**
	* Header for
	* <br>
	* DataType BOOLEAN<br>
	* UIType CHECKBOX<br>
	* Relation to FCO: Linux_SambaCommonSecurityOptions.get_GuestOK<br>
	*/
	public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_GuestOK();
		/**
	* Header for
	* <br>
	* DataType BOOLEAN<br>
	* UIType CHECKBOX<br>
	* Relation to FCO: Linux_SambaCommonSecurityOptions.get_GuestOnly<br>
	*/
	public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_GuestOnly();
		/**
	* Header for
	* <br>
	* DataType STRING<br>
	* UIType TEXTFIELD<br>
	* Relation to FCO: Linux_SambaCommonSecurityOptions.get_HostsAllow<br>
	*/
	public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_HostsAllow();
		/**
	* Header for
	* <br>
	* DataType STRING<br>
	* UIType TEXTFIELD<br>
	* Relation to FCO: Linux_SambaCommonSecurityOptions.get_HostsDeny<br>
	*/
	public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_HostsDeny();
		/**
	* Header for
	* <br>
	* DataType BOOLEAN<br>
	* UIType CHECKBOX<br>
	* Relation to FCO: Linux_SambaCommonSecurityOptions.get_ReadOnly<br>
	*/
	public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_ReadOnly();
	}