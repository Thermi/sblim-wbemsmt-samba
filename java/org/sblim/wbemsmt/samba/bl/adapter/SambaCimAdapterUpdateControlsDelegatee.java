 /** 
  * SambaCimAdapterUpdateControlsDelegatee.java
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
  * Description: Delegatee for Updating Controls
  * 
  */
package org.sblim.wbemsmt.samba.bl.adapter;

import org.sblim.wbemsmt.exception.UpdateControlsException;
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
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser;
import org.sblim.wbemsmt.samba.bl.wrapper.Printer;
import org.sblim.wbemsmt.samba.bl.wrapper.PrinterGlobals;
import org.sblim.wbemsmt.samba.bl.wrapper.Service;
import org.sblim.wbemsmt.samba.bl.wrapper.Share;
import org.sblim.wbemsmt.samba.bl.wrapper.ShareGlobals;
import org.sblim.wbemsmt.samba.bl.wrapper.User;

public class SambaCimAdapterUpdateControlsDelegatee extends SambaDelegatee implements
		SambaCimAdapterUpdateControlsIf {

	public SambaCimAdapterUpdateControlsDelegatee(SambaCimAdapter adapter) {
		super(adapter);
	}

	/******************************
	 *  
	 * SERVICE (smbd etc.) TAB
	 * 
	 ******************************/
	
	public void updateControlsImpl(ServiceOperationsDataContainer container) throws UpdateControlsException {
		Service selectedService = getSelectedService();
		selectedService.updateControls(container);
	}

	public void updateControlsImpl(ServiceOptionsDataContainer container) throws UpdateControlsException {
		Service selectedService = getSelectedService();
		selectedService.updateControls(container);
	}

	public void updateControlsImpl(ServiceLoggingDataContainer container) throws UpdateControlsException {
		Service selectedService = getSelectedService();
		selectedService.updateControls(container);
	}

	public void updateControlsImpl(ServiceGlobalSecurityOptionsDataContainer container) throws UpdateControlsException {
		Service selectedService = getSelectedService();
		selectedService.updateControls(container);
	}

	public void updateControlsImpl(ServiceUserSecurityOptionsDataContainer container) throws UpdateControlsException {
		Service selectedService = getSelectedService();
		selectedService.updateControls(container);
		adapter.updateControls(container.getUserRights(),selectedService.getUsers().getFCOs());
	}

	public void updateControlsImpl(ServiceAllowHostSecurityDataContainer container) throws UpdateControlsException {
		Service selectedService = getSelectedService();
		selectedService.updateControls(container);
	}

	public void updateControlsImpl(ServiceDenyHostDataContainer container) throws UpdateControlsException {
		Service selectedService = getSelectedService();
		selectedService.updateControls(container);
	}

	public void updateControlsImpl(ServiceScriptingDataContainer container) throws UpdateControlsException {
		Service selectedService = getSelectedService();
		selectedService.updateControls(container);
	}

	public void updateControlsImpl(ServiceWinsDataContainer container) throws UpdateControlsException {
		Service selectedService = getSelectedService();
		selectedService.updateControls(container);
	}

	/******************************
	 *  
	 * SHARE (smbd etc.) TAB
	 * 
	 ******************************/	
	
	public void updateControlsImpl(ShareAllowHostSecurityDataContainer container) throws UpdateControlsException {
		Share share = super.getSelectedShare();
		share.updateControls(container);
	}

	public void updateControlsImpl(ShareDenyHostSecurityDataContainer container) throws UpdateControlsException {
		Share share = super.getSelectedShare();
		share.updateControls(container);
	}

	public void updateControlsImpl(ShareOptionsDataContainer container) throws UpdateControlsException {
		Share share = super.getSelectedShare();
		share.updateControls(container);
	}
	
	public void updateControlsImpl(CMDShareFileAttributes container) throws UpdateControlsException {
		Share share = super.getSelectedShare();
		share.updateControls(container);
	}

	public void updateControlsImpl(GUIShareFileAttributes container) throws UpdateControlsException {
		Share share = super.getSelectedShare();
		share.updateControls(container);
	}

	public void updateControlsImpl(UserInShareACLDataContainer container) throws UpdateControlsException {
		Share share = super.getSelectedShare();
		share.updateControls(container);
	}

	/******************************
	 *  
	 * SHARE-WIZARD (smbd etc.) TAB
	 * 
	 ******************************/	
	public void updateControlsImpl(ShareWizardPage1 container) throws UpdateControlsException {
		adapter.getShareWizard().updateControls(container);
	}
	
	public void updateControlsImpl(ShareWizardPage2 container) throws UpdateControlsException {
		adapter.getShareWizard().updateControls(container);
	}

	public void updateControlsImpl(ShareWizardPage3GUI container) throws UpdateControlsException {
		adapter.getShareWizard().updateControls(container);
	}

	public void updateControlsImpl(ShareWizardPage4 container) throws UpdateControlsException {
		adapter.getShareWizard().updateControls(container);
	}

	public void updateControlsImpl(ShareWizardPage3CMD container) throws UpdateControlsException {
		adapter.getShareWizard().updateControls(container);
	}

	public void updateControlsImpl(UserInShareWizardACLItemDataContainer container) throws UpdateControlsException {
		//do nothing
	}

	public void updateControlsImpl(UserInShareWizardACLItemDataContainer container, Linux_SambaUser fco) throws UpdateControlsException {
		adapter.getShareWizard().updateControls(container,fco);
	}

	/****************
	 * Share Globals 
	 ***************/

	public void updateControlsImpl(ShareGlobalsDataContainer container) throws UpdateControlsException {
	}
	
	public void updateControlsImpl(CMDShareGlobalsDataContainer container) throws UpdateControlsException {
		ShareGlobals shareGlobals = getSelectedShareGlobals();
		shareGlobals.updateControls(container);
	}

	public void updateControlsImpl(GUIShareGlobalsDataContainer container) throws UpdateControlsException {
		ShareGlobals shareGlobals = getSelectedShareGlobals();
		shareGlobals.updateControls(container);
	}


	/****************
	 * Printing Globals
	 ***************/
	public void updateControlsImpl(PrintingGlobalsDataContainer container) throws UpdateControlsException {
		PrinterGlobals printerGlobals = getSelectedPrinterGlobals();
		printerGlobals.updateControls(container);
	}

	/****************
	 * Printer-Wizard
	 ***************/
	
	public void updateControlsImpl(PrinterWizardPage1 container) throws UpdateControlsException {
		adapter.getPrinterWizard().updateControls(container);
	}

	public void updateControlsImpl(PrinterWizardPage2 container) throws UpdateControlsException {
		adapter.getPrinterWizard().updateControls(container);
	}

	public void updateControlsImpl(PrinterWizardPage3 container) throws UpdateControlsException {
		adapter.getPrinterWizard().updateControls(container);
	}

	public void updateControlsImpl(PrinterWizardPage4 container) throws UpdateControlsException {
		adapter.getPrinterWizard().updateControls(container);
	}

	public void updateControlsImpl(PrinterWizardPage5 container) throws UpdateControlsException {
		adapter.getPrinterWizard().updateControls(container);
	}


	public void updateControlsImpl(UserInPrinterWizardACLItemDataContainer container) throws UpdateControlsException {
		adapter.getPrinterWizard().updateControls(container);
	}

	public void updateControlsImpl(UserInPrinterWizardACLItemDataContainer container, Linux_SambaUser fco) throws UpdateControlsException {
		adapter.getPrinterWizard().updateControls(container,fco);
	}


	/****************
	 * User-Wizard
	 ***************/
	public void updateControlsImpl(UserWizardPage1 container) throws UpdateControlsException {
		adapter.getUserWizard().updateControls(container);
	}

	public void updateControlsImpl(UserWizardPage2 container) throws UpdateControlsException {
		adapter.getUserWizard().updateControls(container);
	}

	public void updateControlsImpl(UserWizardPage3 container) throws UpdateControlsException {
		adapter.getUserWizard().updateControls(container);
	}

	public void updateControlsImpl(PrinterInUserWizardACLItemDataContainer container) throws UpdateControlsException {
		//not called because n-childs
	}

	public void updateControlsImpl(ShareInUserWizardACLItemDataContainer container) throws UpdateControlsException {
		//not called because n-childs
	}

	public void updateControlsImpl(ShareInUserWizardACLItemDataContainer container, Linux_SambaShareOptions fco) throws UpdateControlsException {
		adapter.getUserWizard().updateControls(container,fco);
	}

	public void updateControlsImpl(PrinterInUserWizardACLItemDataContainer container, Linux_SambaPrinterOptions fco) throws UpdateControlsException {
		adapter.getUserWizard().updateControls(container,fco);
	}
	/****************
	 * Host-Wizard
	 ***************/
	public void updateControlsImpl(HostWizardPage1 container) throws UpdateControlsException {
		adapter.getHostWizard().updateControls(container);
	}

	public void updateControlsImpl(HostWizardPage2 container) throws UpdateControlsException {
		adapter.getHostWizard().updateControls(container);
	}

	/****************
	 * Printer
	 ***************/

	
	public void updateControlsImpl(PrinterOptionsDataContainer container) throws UpdateControlsException {
		Printer printer = super.getSelectedPrinter();
		printer.updateControls(container);
	}

	public void updateControlsImpl(PrintingOptionsDataContainer container) throws UpdateControlsException {
		Printer printer = super.getSelectedPrinter();
		printer.updateControls(container);
	}

	public void updateControlsImpl(PrinterAllowHostSecurityDataContainer container) throws UpdateControlsException {
		Printer printer = super.getSelectedPrinter();
		printer.updateControls(container);
	}

	public void updateControlsImpl(PrinterDenyHostSecurityDataContainer container) throws UpdateControlsException {
		Printer printer = super.getSelectedPrinter();
		printer.updateControls(container);
	}

	public void updateControlsImpl(UserInPrinterACLDataContainer container) throws UpdateControlsException {
		Printer printer = getSelectedPrinter();
		printer.updateControls(container);
	}

	
	
	public void updateControlsImpl(HostDataContainer container) throws UpdateControlsException {
		
		
	}

	public void updateControlsImpl(UserDataContainer container) throws UpdateControlsException {
		User user = getSelectedUser();
		user.updateControls(container);
	}

	public void updateControlsImpl(ShareFileAttributes container) throws UpdateControlsException {
		//not used because the gui variants are used CMD/GUI
		
	}

	/**
	 * The UserACLDataContainer is misused to store the user-printer acl
	 * @param container
	 * @param fco
	 * @throws UpdateControlsException
	 */
	public void updateControlsImpl(PrinterACLItemDataContainer container, Linux_SambaPrinterOptions fco) throws UpdateControlsException {
			User selectedUser = getSelectedUser();
			selectedUser.updateControls(container,fco);
	}
	
	/**
	 * The UserACLDataContainer is misused to store the user-share acl
	 * @param container
	 * @param fco
	 * @throws UpdateControlsException
	 */
	public void updateControlsImpl(ShareACLItemDataContainer container, Linux_SambaShareOptions fco) throws UpdateControlsException {
		User selectedUser = getSelectedUser();
		selectedUser.updateControls(container,fco);
	}

	public void updateControlsImpl(UserACLItemDataContainerForService container) throws UpdateControlsException {
		if (adapter.getSelectionHierarchy().size() == 1)
		{
			getSelectedService().updateControls(container);
		}
	}

	
	public void updateControlsImpl(UserACLItemDataContainerForShare container) throws UpdateControlsException {
		if (adapter.getSelectionHierarchy().size() == 2 
				 && adapter.getSelectedShare() != null)
		{
			getSelectedShare().updateControls(container);
		}
	}

	public void updateControlsImpl(UserACLItemDataContainerForPrinter container) throws UpdateControlsException {
		if (adapter.getSelectionHierarchy().size() == 2 
				 && adapter.getSelectedPrinter() != null)
		{
			getSelectedPrinter().updateControls(container);
		}
	}

	public void updateControlsImpl(PrinterACLItemDataContainer container) throws UpdateControlsException {
		User selectedUser = getSelectedUser();
		selectedUser.updateControls(container);
	}

	public void updateControlsImpl(ShareACLItemDataContainer container) throws UpdateControlsException {
		User selectedUser = getSelectedUser();
		selectedUser.updateControls(container);
	}

	public void updateControlsImpl(PrinterInUserACLDataContainer container) throws UpdateControlsException {
		User selectedUser = getSelectedUser();
		selectedUser.updateControls(container);
	}

	public void updateControlsImpl(ShareInUserACLDataContainer container) throws UpdateControlsException {
		User selectedUser = getSelectedUser();
		selectedUser.updateControls(container);
	}

	public void updateControlsImpl(UserACLItemDataContainerForService container, Linux_SambaUser fco) throws UpdateControlsException {
		if (adapter.getSelectionHierarchy().size() == 1)
		{
			getSelectedService().updateControls(container,fco);
		}
	}

	public void updateControlsImpl(UserACLItemDataContainerForShare container, Linux_SambaUser fco) throws UpdateControlsException {
		if (adapter.getSelectionHierarchy().size() == 2 
				 && adapter.getSelectedShare() != null)
		{
			getSelectedShare().updateControls(container,fco);
		}
	}

	public void updateControlsImpl(UserACLItemDataContainerForPrinter container, Linux_SambaUser fco) throws UpdateControlsException {
		if (adapter.getSelectionHierarchy().size() == 2 
				 && adapter.getSelectedPrinter() != null)
		{
			getSelectedPrinter().updateControls(container,fco);
		}
	}

	public void updateControlsImpl(UserIsAdminItem container) throws UpdateControlsException {
		// do nothing it's just the baseclass
		
	}

	public void updateControlsImpl(AdminUsersInPrinterGlobals container) throws UpdateControlsException {
		adapter.getSelectedService().getPrinterGlobals().updateControls(container);
		
	}

	public void updateControlsImpl(AdminUsersInShareGlobals container) throws UpdateControlsException {
		adapter.getSelectedService().getShareGlobals().updateControls(container);
	}

	public void updateControlsImpl(AdminUsersInPrinterGlobals container, Linux_SambaUser fco) throws UpdateControlsException {
		adapter.getSelectedService().getPrinterGlobals().updateControls(container,fco);
	}

	public void updateControlsImpl(AdminUsersInShareGlobals container, Linux_SambaUser fco) throws UpdateControlsException {
		adapter.getSelectedService().getShareGlobals().updateControls(container,fco);
	}

	public void updateControlsImpl(ShareListDataContainer container) throws UpdateControlsException {
		adapter.updateControls(container.getShares(),adapter.getSelectedService().getShares().getFCOs());
	}

	public void updateControlsImpl(ShareListItemDataContainer container) throws UpdateControlsException {
	}

	public void updateControlsImpl(ShareListItemDataContainer container, Linux_SambaShareOptions fco) throws UpdateControlsException {
		adapter.getSelectedService().getShares().getShareByName(fco.get_Name()).updateControls(container);
	}

	public void updateControlsImpl(PrinterListDataContainer container) throws UpdateControlsException {
		adapter.updateControls(container.getPrinters(),adapter.getSelectedService().getPrinters().getFCOs());
	}

	public void updateControlsImpl(PrinterListItemDataContainer container) throws UpdateControlsException {
		// never used as root container
		
	}

	public void updateControlsImpl(UserListDataContainer container) throws UpdateControlsException {
		adapter.updateControls(container.getUsers(),adapter.getSelectedService().getUsers().getFCOs());
		
	}

	public void updateControlsImpl(UserListItemDataContainer container) throws UpdateControlsException {
		// never used as root container
	}

	public void updateControlsImpl(PrinterListItemDataContainer container, Linux_SambaPrinterOptions fco) throws UpdateControlsException {
		adapter.getSelectedService().getPrinters().getPrinterByName(fco.get_Name()).updateControls(container);
		
	}

	public void updateControlsImpl(UserListItemDataContainer container, Linux_SambaUser fco) throws UpdateControlsException {
		adapter.getSelectedService().getUsers().getUserByName(fco.get_SambaUserName()).updateControls(container);
	}
	
}
