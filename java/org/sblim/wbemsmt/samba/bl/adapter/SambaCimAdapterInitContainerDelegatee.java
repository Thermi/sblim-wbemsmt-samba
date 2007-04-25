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

import org.sblim.wbemsmt.exception.InitContainerException;
import org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals;
import org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobals;
import org.sblim.wbemsmt.samba.bl.container.global.CMDShareGlobalsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.global.GUIShareGlobalsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.global.PrintingGlobalsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.global.ShareGlobalsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.global.UserIsAdminItem;
import org.sblim.wbemsmt.samba.bl.container.host.HostDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.PrinterAllowHostSecurityDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.PrinterDenyHostSecurityDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.PrinterListDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.PrinterListItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.PrinterOptionsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.PrintingOptionsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinter;
import org.sblim.wbemsmt.samba.bl.container.printer.UserInPrinterACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceAllowHostSecurityDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceDenyHostDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceGlobalSecurityOptionsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceLoggingDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceOperationsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceOptionsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceScriptingDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceUserSecurityOptionsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceWinsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForService;
import org.sblim.wbemsmt.samba.bl.container.share.CMDShareFileAttributes;
import org.sblim.wbemsmt.samba.bl.container.share.GUIShareFileAttributes;
import org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.ShareACLItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.ShareAllowHostSecurityDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.ShareDenyHostSecurityDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.ShareFileAttributes;
import org.sblim.wbemsmt.samba.bl.container.share.ShareListDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.ShareListItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.ShareOptionsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.UserACLItemDataContainerForShare;
import org.sblim.wbemsmt.samba.bl.container.share.UserInShareACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.PrinterInUserACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.ShareInUserACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.UserDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.UserListDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.UserListItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.welcome.WelcomeDataContainer;
import org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage1;
import org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage2;
import org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage1;
import org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage2;
import org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage3;
import org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage4;
import org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage5;
import org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1;
import org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2;
import org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3CMD;
import org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3GUI;
import org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4;
import org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1;
import org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2;
import org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3;

public class SambaCimAdapterInitContainerDelegatee implements
		SambaCimAdapterInitContainerIf {

	public SambaCimAdapterInitContainerDelegatee(SambaCimAdapter adapter) {
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals)
	 */
	public void initContainerImpl(AdminUsersInPrinterGlobals container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobals)
	 */
	public void initContainerImpl(AdminUsersInShareGlobals container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.CMDShareFileAttributes)
	 */
	public void initContainerImpl(CMDShareFileAttributes container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.global.CMDShareGlobalsDataContainer)
	 */
	public void initContainerImpl(CMDShareGlobalsDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.GUIShareFileAttributes)
	 */
	public void initContainerImpl(GUIShareFileAttributes container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.global.GUIShareGlobalsDataContainer)
	 */
	public void initContainerImpl(GUIShareGlobalsDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.host.HostDataContainer)
	 */
	public void initContainerImpl(HostDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage1)
	 */
	public void initContainerImpl(HostWizardPage1 container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage2)
	 */
	public void initContainerImpl(HostWizardPage2 container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer)
	 */
	public void initContainerImpl(PrinterACLItemDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterAllowHostSecurityDataContainer)
	 */
	public void initContainerImpl(
			PrinterAllowHostSecurityDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterDenyHostSecurityDataContainer)
	 */
	public void initContainerImpl(PrinterDenyHostSecurityDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.user.PrinterInUserACLDataContainer)
	 */
	public void initContainerImpl(PrinterInUserACLDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainer)
	 */
	public void initContainerImpl(
			PrinterInUserWizardACLItemDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterListDataContainer)
	 */
	public void initContainerImpl(PrinterListDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterListItemDataContainer)
	 */
	public void initContainerImpl(PrinterListItemDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterOptionsDataContainer)
	 */
	public void initContainerImpl(PrinterOptionsDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage1)
	 */
	public void initContainerImpl(PrinterWizardPage1 container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage2)
	 */
	public void initContainerImpl(PrinterWizardPage2 container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage3)
	 */
	public void initContainerImpl(PrinterWizardPage3 container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage4)
	 */
	public void initContainerImpl(PrinterWizardPage4 container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage5)
	 */
	public void initContainerImpl(PrinterWizardPage5 container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.global.PrintingGlobalsDataContainer)
	 */
	public void initContainerImpl(PrintingGlobalsDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrintingOptionsDataContainer)
	 */
	public void initContainerImpl(PrintingOptionsDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceAllowHostSecurityDataContainer)
	 */
	public void initContainerImpl(
			ServiceAllowHostSecurityDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceDenyHostDataContainer)
	 */
	public void initContainerImpl(ServiceDenyHostDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceGlobalSecurityOptionsDataContainer)
	 */
	public void initContainerImpl(
			ServiceGlobalSecurityOptionsDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceLoggingDataContainer)
	 */
	public void initContainerImpl(ServiceLoggingDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceOperationsDataContainer)
	 */
	public void initContainerImpl(ServiceOperationsDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceOptionsDataContainer)
	 */
	public void initContainerImpl(ServiceOptionsDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceScriptingDataContainer)
	 */
	public void initContainerImpl(ServiceScriptingDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceUserSecurityOptionsDataContainer)
	 */
	public void initContainerImpl(
			ServiceUserSecurityOptionsDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceWinsDataContainer)
	 */
	public void initContainerImpl(ServiceWinsDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareACLItemDataContainer)
	 */
	public void initContainerImpl(ShareACLItemDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareAllowHostSecurityDataContainer)
	 */
	public void initContainerImpl(ShareAllowHostSecurityDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareDenyHostSecurityDataContainer)
	 */
	public void initContainerImpl(ShareDenyHostSecurityDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareFileAttributes)
	 */
	public void initContainerImpl(ShareFileAttributes container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.global.ShareGlobalsDataContainer)
	 */
	public void initContainerImpl(ShareGlobalsDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.user.ShareInUserACLDataContainer)
	 */
	public void initContainerImpl(ShareInUserACLDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainer)
	 */
	public void initContainerImpl(
			ShareInUserWizardACLItemDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareListDataContainer)
	 */
	public void initContainerImpl(ShareListDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareListItemDataContainer)
	 */
	public void initContainerImpl(ShareListItemDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareOptionsDataContainer)
	 */
	public void initContainerImpl(ShareOptionsDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1)
	 */
	public void initContainerImpl(ShareWizardPage1 container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2)
	 */
	public void initContainerImpl(ShareWizardPage2 container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3CMD)
	 */
	public void initContainerImpl(ShareWizardPage3CMD container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3GUI)
	 */
	public void initContainerImpl(ShareWizardPage3GUI container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4)
	 */
	public void initContainerImpl(ShareWizardPage4 container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinter)
	 */
	public void initContainerImpl(UserACLItemDataContainerForPrinter container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForService)
	 */
	public void initContainerImpl(UserACLItemDataContainerForService container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.UserACLItemDataContainerForShare)
	 */
	public void initContainerImpl(UserACLItemDataContainerForShare container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.user.UserDataContainer)
	 */
	public void initContainerImpl(UserDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.UserInPrinterACLDataContainer)
	 */
	public void initContainerImpl(UserInPrinterACLDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainer)
	 */
	public void initContainerImpl(
			UserInPrinterWizardACLItemDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.UserInShareACLDataContainer)
	 */
	public void initContainerImpl(UserInShareACLDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer)
	 */
	public void initContainerImpl(
			UserInShareWizardACLItemDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.global.UserIsAdminItem)
	 */
	public void initContainerImpl(UserIsAdminItem container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.user.UserListDataContainer)
	 */
	public void initContainerImpl(UserListDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.user.UserListItemDataContainer)
	 */
	public void initContainerImpl(UserListItemDataContainer container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1)
	 */
	public void initContainerImpl(UserWizardPage1 container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2)
	 */
	public void initContainerImpl(UserWizardPage2 container)
			throws InitContainerException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitContainerIf#initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3)
	 */
	public void initContainerImpl(UserWizardPage3 container)
			throws InitContainerException {
		
	}

	public void initContainerImpl(WelcomeDataContainer container) throws InitContainerException {
		// TODO Auto-generated method stub
		
	}

}
