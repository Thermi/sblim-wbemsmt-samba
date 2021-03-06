/** 
  * SambaCimAdapterCountIf.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceCount.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.*;

import org.sblim.wbemsmt.exception.WbemsmtException;

	/** 
	 * This is the interface containing only the Count-Methods for the delegate
	 **/

public interface SambaCimAdapterCountIf extends CountDelegatee
{

	public static final String[] RESOURCE_BUNDLE_NAMES = new String[]{"messages","messagesSamba"};

	/** 
	 * Count-Methods
	 **/
	public int countImpl_Users(Class<?> childClass, org.sblim.wbemsmt.samba.bl.container.global.PrintingGlobalsDataContainer parent ) throws WbemsmtException;
	public int countImpl_Users(Class<?> childClass, org.sblim.wbemsmt.samba.bl.container.global.GUIShareGlobalsDataContainer parent ) throws WbemsmtException;
	public int countImpl_Printers(Class<?> childClass, org.sblim.wbemsmt.samba.bl.container.printer.PrinterListDataContainer parent ) throws WbemsmtException;
	public int countImpl_Users(Class<?> childClass, org.sblim.wbemsmt.samba.bl.container.printer.UserInPrinterACLDataContainer parent ) throws WbemsmtException;
	public int countImpl_UserRights(Class<?> childClass, org.sblim.wbemsmt.samba.bl.container.service.ServiceUserSecurityOptionsDataContainer parent ) throws WbemsmtException;
	public int countImpl_Printers(Class<?> childClass, org.sblim.wbemsmt.samba.bl.container.user.PrinterInUserACLDataContainer parent ) throws WbemsmtException;
	public int countImpl_Shares(Class<?> childClass, org.sblim.wbemsmt.samba.bl.container.user.ShareInUserACLDataContainer parent ) throws WbemsmtException;
	public int countImpl_Shares(Class<?> childClass, org.sblim.wbemsmt.samba.bl.container.share.ShareListDataContainer parent ) throws WbemsmtException;
	public int countImpl_Users(Class<?> childClass, org.sblim.wbemsmt.samba.bl.container.share.UserInShareACLDataContainer parent ) throws WbemsmtException;
	public int countImpl_Users(Class<?> childClass, org.sblim.wbemsmt.samba.bl.container.user.UserListDataContainer parent ) throws WbemsmtException;
	public int countImpl_Printers(Class<?> childClass, org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2 parent ) throws WbemsmtException;
	public int countImpl_Printers(Class<?> childClass, org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3 parent ) throws WbemsmtException;
	public int countImpl_Shares(Class<?> childClass, org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2 parent ) throws WbemsmtException;
	public int countImpl_Shares(Class<?> childClass, org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3 parent ) throws WbemsmtException;
	public int countImpl_Users(Class<?> childClass, org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage3 parent ) throws WbemsmtException;
	public int countImpl_Users(Class<?> childClass, org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage5 parent ) throws WbemsmtException;
	public int countImpl_Users(Class<?> childClass, org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2 parent ) throws WbemsmtException;
	public int countImpl_Users(Class<?> childClass, org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4 parent ) throws WbemsmtException;
			
}