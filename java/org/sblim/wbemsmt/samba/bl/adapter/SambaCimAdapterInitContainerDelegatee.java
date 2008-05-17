 /** 
  * SambaCimAdapterInitContainerDelegatee.java
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
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: delegatee for init containe actions
  * 
  */
package org.sblim.wbemsmt.samba.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.container.global.*;
import org.sblim.wbemsmt.samba.bl.container.host.HostDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.*;
import org.sblim.wbemsmt.samba.bl.container.service.*;
import org.sblim.wbemsmt.samba.bl.container.share.*;
import org.sblim.wbemsmt.samba.bl.container.user.*;
import org.sblim.wbemsmt.samba.bl.container.welcome.WelcomeDataContainer;
import org.sblim.wbemsmt.samba.bl.container.wizard.*;

public class SambaCimAdapterInitContainerDelegatee implements
		SambaCimAdapterInitContainerIf {

	public SambaCimAdapterInitContainerDelegatee(AbstractBaseCimAdapter adapter) {
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals)
	 */
	public void initContainerImpl(AdminUsersInPrinterGlobals container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobals)
	 */
	public void initContainerImpl(AdminUsersInShareGlobals container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.CMDShareFileAttributes)
	 */
	public void initContainerImpl(CMDShareFileAttributes container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.global.CMDShareGlobalsDataContainer)
	 */
	public void initContainerImpl(CMDShareGlobalsDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.GUIShareFileAttributes)
	 */
	public void initContainerImpl(GUIShareFileAttributes container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.global.GUIShareGlobalsDataContainer)
	 */
	public void initContainerImpl(GUIShareGlobalsDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.host.HostDataContainer)
	 */
	public void initContainerImpl(HostDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage1)
	 */
	public void initContainerImpl(HostWizardPage1 container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage2)
	 */
	public void initContainerImpl(HostWizardPage2 container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer)
	 */
	public void initContainerImpl(PrinterACLItemDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterAllowHostSecurityDataContainer)
	 */
	public void initContainerImpl(
			PrinterAllowHostSecurityDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterDenyHostSecurityDataContainer)
	 */
	public void initContainerImpl(PrinterDenyHostSecurityDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.user.PrinterInUserACLDataContainer)
	 */
	public void initContainerImpl(PrinterInUserACLDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainer)
	 */
	public void initContainerImpl(
			PrinterInUserWizardACLItemDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterListDataContainer)
	 */
	public void initContainerImpl(PrinterListDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterListItemDataContainer)
	 */
	public void initContainerImpl(PrinterListItemDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterOptionsDataContainer)
	 */
	public void initContainerImpl(PrinterOptionsDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage1)
	 */
	public void initContainerImpl(PrinterWizardPage1 container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage2)
	 */
	public void initContainerImpl(PrinterWizardPage2 container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage3)
	 */
	public void initContainerImpl(PrinterWizardPage3 container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage4)
	 */
	public void initContainerImpl(PrinterWizardPage4 container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage5)
	 */
	public void initContainerImpl(PrinterWizardPage5 container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.global.PrintingGlobalsDataContainer)
	 */
	public void initContainerImpl(PrintingGlobalsDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrintingOptionsDataContainer)
	 */
	public void initContainerImpl(PrintingOptionsDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceAllowHostSecurityDataContainer)
	 */
	public void initContainerImpl(
			ServiceAllowHostSecurityDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceDenyHostDataContainer)
	 */
	public void initContainerImpl(ServiceDenyHostDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceGlobalSecurityOptionsDataContainer)
	 */
	public void initContainerImpl(
			ServiceGlobalSecurityOptionsDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceLoggingDataContainer)
	 */
	public void initContainerImpl(ServiceLoggingDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceOperationsDataContainer)
	 */
	public void initContainerImpl(ServiceOperationsDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceOptionsDataContainer)
	 */
	public void initContainerImpl(ServiceOptionsDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceScriptingDataContainer)
	 */
	public void initContainerImpl(ServiceScriptingDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceUserSecurityOptionsDataContainer)
	 */
	public void initContainerImpl(
			ServiceUserSecurityOptionsDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceWinsDataContainer)
	 */
	public void initContainerImpl(ServiceWinsDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareACLItemDataContainer)
	 */
	public void initContainerImpl(ShareACLItemDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareAllowHostSecurityDataContainer)
	 */
	public void initContainerImpl(ShareAllowHostSecurityDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareDenyHostSecurityDataContainer)
	 */
	public void initContainerImpl(ShareDenyHostSecurityDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareFileAttributes)
	 */
	public void initContainerImpl(ShareFileAttributes container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.global.ShareGlobalsDataContainer)
	 */
	public void initContainerImpl(ShareGlobalsDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.user.ShareInUserACLDataContainer)
	 */
	public void initContainerImpl(ShareInUserACLDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainer)
	 */
	public void initContainerImpl(
			ShareInUserWizardACLItemDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareListDataContainer)
	 */
	public void initContainerImpl(ShareListDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareListItemDataContainer)
	 */
	public void initContainerImpl(ShareListItemDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareOptionsDataContainer)
	 */
	public void initContainerImpl(ShareOptionsDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1)
	 */
	public void initContainerImpl(ShareWizardPage1 container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2)
	 */
	public void initContainerImpl(ShareWizardPage2 container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3CMD)
	 */
	public void initContainerImpl(ShareWizardPage3CMD container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3GUI)
	 */
	public void initContainerImpl(ShareWizardPage3GUI container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4)
	 */
	public void initContainerImpl(ShareWizardPage4 container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinter)
	 */
	public void initContainerImpl(UserACLItemDataContainerForPrinter container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForService)
	 */
	public void initContainerImpl(UserACLItemDataContainerForService container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.UserACLItemDataContainerForShare)
	 */
	public void initContainerImpl(UserACLItemDataContainerForShare container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.user.UserDataContainer)
	 */
	public void initContainerImpl(UserDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.UserInPrinterACLDataContainer)
	 */
	public void initContainerImpl(UserInPrinterACLDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainer)
	 */
	public void initContainerImpl(
			UserInPrinterWizardACLItemDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.UserInShareACLDataContainer)
	 */
	public void initContainerImpl(UserInShareACLDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer)
	 */
	public void initContainerImpl(
			UserInShareWizardACLItemDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.global.UserIsAdminItem)
	 */
	public void initContainerImpl(UserIsAdminItem container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.user.UserListDataContainer)
	 */
	public void initContainerImpl(UserListDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.user.UserListItemDataContainer)
	 */
	public void initContainerImpl(UserListItemDataContainer container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1)
	 */
	public void initContainerImpl(UserWizardPage1 container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2)
	 */
	public void initContainerImpl(UserWizardPage2 container)
			throws WbemsmtException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3)
	 */
	public void initContainerImpl(UserWizardPage3 container)
			throws WbemsmtException {
		
	}

	public void initContainerImpl(WelcomeDataContainer container) throws WbemsmtException {
	}

}
