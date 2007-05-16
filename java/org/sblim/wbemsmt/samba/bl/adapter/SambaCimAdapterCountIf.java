/** 
  * SambaCimAdapterCountIf.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceCount.vm
  *
  * Contributors: 
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.*;

	/** 
	 * This is the interface containing only the Count-Methods for the delegate
	 **/

public interface SambaCimAdapterCountIf extends CountDelegatee
{

	public static final String[] RESOURCE_BUNDLE_NAMES = new String[]{"messages","messagesSamba"};

	/** 
	 * Count-Methods
	 **/
	public int countImpl_AdminUsersInPrinterGlobals() throws org.sblim.wbemsmt.exception.CountException;
	public int countImpl_AdminUsersInShareGlobals() throws org.sblim.wbemsmt.exception.CountException;
	public int countImpl_PrinterACLItemDataContainer() throws org.sblim.wbemsmt.exception.CountException;
	public int countImpl_PrinterInUserWizardACLItemDataContainer() throws org.sblim.wbemsmt.exception.CountException;
	public int countImpl_PrinterListItemDataContainer() throws org.sblim.wbemsmt.exception.CountException;
	public int countImpl_ShareACLItemDataContainer() throws org.sblim.wbemsmt.exception.CountException;
	public int countImpl_ShareInUserWizardACLItemDataContainer() throws org.sblim.wbemsmt.exception.CountException;
	public int countImpl_ShareListItemDataContainer() throws org.sblim.wbemsmt.exception.CountException;
	public int countImpl_UserACLItemDataContainerForPrinter() throws org.sblim.wbemsmt.exception.CountException;
	public int countImpl_UserACLItemDataContainerForService() throws org.sblim.wbemsmt.exception.CountException;
	public int countImpl_UserACLItemDataContainerForShare() throws org.sblim.wbemsmt.exception.CountException;
	public int countImpl_UserInPrinterWizardACLItemDataContainer() throws org.sblim.wbemsmt.exception.CountException;
	public int countImpl_UserInShareWizardACLItemDataContainer() throws org.sblim.wbemsmt.exception.CountException;
	public int countImpl_UserListItemDataContainer() throws org.sblim.wbemsmt.exception.CountException;
			
}