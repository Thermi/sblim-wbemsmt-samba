/** 
  * SambaCimAdapterIf.java
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
  * @template: org/sblim/wbemsmt/dcg/templates/adapterInterface.vm
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
	 * This is the interface containing all Methods
	 **/

public interface SambaCimAdapterIf extends SambaCimAdapterCountIf, SambaCimAdapterCreateIf, SambaCimAdapterDeleteIf, SambaCimAdapterInstallValidatorsIf, SambaCimAdapterSaveIf, SambaCimAdapterRevertIf, SambaCimAdapterUpdateControlsIf, SambaCimAdapterUpdateModelIf, SambaCimAdapterInitWizardIf, SambaCimAdapterInitContainerIf
{

	public static final String[] RESOURCE_BUNDLE_NAMES = new String[]{"messages","messagesSamba"};

	/** 
	 * Create-Methods
	 **/
	public void createImpl(org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage2 container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public void createImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage5 container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public void createImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4 container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public void createImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3 container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	
	/** 
	 * Save-Methods
	 **/
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobals container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.share.CMDShareFileAttributes container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.global.CMDShareGlobalsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.share.GUIShareFileAttributes container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.global.GUIShareGlobalsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.host.HostDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterAllowHostSecurityDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterDenyHostSecurityDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.user.PrinterInUserACLDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterOptionsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.global.PrintingGlobalsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrintingOptionsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceAllowHostSecurityDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceDenyHostDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceGlobalSecurityOptionsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceLoggingDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceOperationsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceOptionsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceScriptingDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceUserSecurityOptionsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceWinsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareACLItemDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareAllowHostSecurityDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareDenyHostSecurityDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareFileAttributes container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.global.ShareGlobalsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.user.ShareInUserACLDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareOptionsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinter container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForService container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.share.UserACLItemDataContainerForShare container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.user.UserDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.printer.UserInPrinterACLDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.share.UserInShareACLDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.global.UserIsAdminItem container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	
	/** 
	 * Save-Methods for Lists
	 **/
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobals container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinter container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForService container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterOptions fco)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareACLItemDataContainer container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareOptions fco)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.samba.bl.container.share.UserACLItemDataContainerForShare container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	
	/** 
	 * Revert-Methods
	 **/
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobals container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.share.CMDShareFileAttributes container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.global.CMDShareGlobalsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.share.GUIShareFileAttributes container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.global.GUIShareGlobalsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.host.HostDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterAllowHostSecurityDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterDenyHostSecurityDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.user.PrinterInUserACLDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterOptionsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.global.PrintingGlobalsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrintingOptionsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceAllowHostSecurityDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceDenyHostDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceGlobalSecurityOptionsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceLoggingDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceOperationsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceOptionsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceScriptingDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceUserSecurityOptionsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceWinsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareACLItemDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareAllowHostSecurityDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareDenyHostSecurityDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareFileAttributes container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.global.ShareGlobalsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.user.ShareInUserACLDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareOptionsDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinter container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForService container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.share.UserACLItemDataContainerForShare container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.user.UserDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.printer.UserInPrinterACLDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.share.UserInShareACLDataContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.global.UserIsAdminItem container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	
	/** 
	 * Revert-Methods for Lists
	 **/
	
	
	/** 
	 * UpdateModel-Methods
	 **/
	public void updateModelImpl(org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage1 container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterAllowHostSecurityDataContainer container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterDenyHostSecurityDataContainer container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainer container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage1 container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage2 container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage3 container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage4 container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceAllowHostSecurityDataContainer container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceDenyHostDataContainer container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceOperationsDataContainer container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareAllowHostSecurityDataContainer container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareDenyHostSecurityDataContainer container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainer container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1 container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2 container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3CMD container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3GUI container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainer container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1 container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2 container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
		
	/** 
	 * UpdateControls-Methods
	 **/
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobals container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.share.CMDShareFileAttributes container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.global.CMDShareGlobalsDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.share.GUIShareFileAttributes container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.global.GUIShareGlobalsDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.host.HostDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage1 container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage2 container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterAllowHostSecurityDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterDenyHostSecurityDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.user.PrinterInUserACLDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterListDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterListItemDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterOptionsDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage1 container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage2 container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage3 container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage4 container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage5 container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.global.PrintingGlobalsDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrintingOptionsDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceAllowHostSecurityDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceDenyHostDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceGlobalSecurityOptionsDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceLoggingDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceOperationsDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceOptionsDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceScriptingDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceUserSecurityOptionsDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.service.ServiceWinsDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareACLItemDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareAllowHostSecurityDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareDenyHostSecurityDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareFileAttributes container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.global.ShareGlobalsDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.user.ShareInUserACLDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareListDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareListItemDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareOptionsDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1 container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2 container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3CMD container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3GUI container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4 container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinter container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForService container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.share.UserACLItemDataContainerForShare container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.user.UserDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.printer.UserInPrinterACLDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.share.UserInShareACLDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.global.UserIsAdminItem container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.user.UserListDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.user.UserListItemDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1 container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2 container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3 container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.welcome.WelcomeDataContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco)  throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobals container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco)  throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterListItemDataContainer container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterOptions fco)  throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinter container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco)  throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForService container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco)  throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterOptions fco)  throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareACLItemDataContainer container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareOptions fco)  throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareListItemDataContainer container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareOptions fco)  throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.share.UserACLItemDataContainerForShare container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco)  throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.user.UserListItemDataContainer container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco)  throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainer container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterOptions fco)  throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainer container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareOptions fco)  throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainer container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco)  throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco)  throws org.sblim.wbemsmt.exception.UpdateControlsException;
		
	/** 
	 * Delete-Methods
	 **/
	public void deleteImpl(org.sblim.wbemsmt.samba.bl.fco.Linux_SambaHost fco) throws org.sblim.wbemsmt.exception.ObjectDeletionException;
	public void deleteImpl(org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterOptions fco) throws org.sblim.wbemsmt.exception.ObjectDeletionException;
	public void deleteImpl(org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareOptions fco) throws org.sblim.wbemsmt.exception.ObjectDeletionException;
	public void deleteImpl(org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco) throws org.sblim.wbemsmt.exception.ObjectDeletionException;
			
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
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterListDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.printer.PrinterListItemDataContainer container);
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
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareListDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareListItemDataContainer container);
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
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.user.UserListDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.user.UserListItemDataContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1 container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2 container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3 container);
	public void installValidatorsImpl(org.sblim.wbemsmt.samba.bl.container.welcome.WelcomeDataContainer container);
			
}