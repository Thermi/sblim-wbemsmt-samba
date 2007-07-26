/** 
  * SambaCimAdapterInstallValidatorsIf.java
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
  * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceInstallValidators.vm
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
	 * This is the interface containing only the InstallValidator-Methods for the delegate
	 **/

public interface SambaCimAdapterInstallValidatorsIf extends InstallValidatorsDelegatee
{

	public static final String[] RESOURCE_BUNDLE_NAMES = new String[]{"messages","messagesSamba"};

	/** 
	 * InstallValidator-Methods
	 **/
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobals container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.share.CMDShareFileAttributes container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.global.CMDShareGlobalsDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.share.GUIShareFileAttributes container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.global.GUIShareGlobalsDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.host.HostDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage1 container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage2 container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterAllowHostSecurityDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterDenyHostSecurityDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.user.PrinterInUserACLDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterOptionsDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage1 container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage2 container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage3 container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage4 container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage5 container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.global.PrintingGlobalsDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrintingOptionsDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceAllowHostSecurityDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceDenyHostDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceGlobalSecurityOptionsDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceLoggingDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceOperationsDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceOptionsDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceScriptingDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceUserSecurityOptionsDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceWinsDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareACLItemDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareAllowHostSecurityDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareDenyHostSecurityDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareFileAttributes container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.global.ShareGlobalsDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.user.ShareInUserACLDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareOptionsDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1 container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2 container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3CMD container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3GUI container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4 container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinter container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForService container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.share.UserACLItemDataContainerForShare container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.user.UserDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.printer.UserInPrinterACLDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.share.UserInShareACLDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.global.UserIsAdminItem container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1 container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2 container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3 container);
			
}