/** 
  * SambaCimAdapterInitContainerIf.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
  * @template: ./tools-dcg/templates/adapterInterfaceInitContainer.vm
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
	 * This is the interface containing only the UpdateControls-Methods for the delegate
	 **/

public interface SambaCimAdapterInitContainerIf extends InitContainerDelegatee
{

	/** 
	 * InitContainer-Methods
	 **/
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobals container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.CMDShareFileAttributes container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.global.CMDShareGlobalsDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.GUIShareFileAttributes container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.global.GUIShareGlobalsDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.host.HostDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage1 container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage2 container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterAllowHostSecurityDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterDenyHostSecurityDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.user.PrinterInUserACLDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterListDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterListItemDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterOptionsDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage1 container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage2 container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage3 container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage4 container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage5 container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.global.PrintingGlobalsDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrintingOptionsDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceAllowHostSecurityDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceDenyHostDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceGlobalSecurityOptionsDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceLoggingDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceOperationsDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceOptionsDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceScriptingDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceUserSecurityOptionsDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceWinsDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareACLItemDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareAllowHostSecurityDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareDenyHostSecurityDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareFileAttributes container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.global.ShareGlobalsDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.user.ShareInUserACLDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareListDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareListItemDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareOptionsDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1 container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2 container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3CMD container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3GUI container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4 container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinter container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForService container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.UserACLItemDataContainerForShare container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.user.UserDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.printer.UserInPrinterACLDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.share.UserInShareACLDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.global.UserIsAdminItem container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.user.UserListDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.user.UserListItemDataContainer container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1 container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2 container) throws org.sblim.wbemsmt.exception.InitContainerException;
	public void initContainerImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3 container) throws org.sblim.wbemsmt.exception.InitContainerException;
	}