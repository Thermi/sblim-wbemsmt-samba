 /** 
  * SambaCimAdapterUpdateControlsDelegatee.java
  *
  * © Copyright IBM Corp.  2009,2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Delegatee for Updating Controls
  * 
  */
package org.sblim.wbemsmt.samba.bl.adapter;

import org.sblim.wbemsmt.bl.fielddata.LinkData;
import org.sblim.wbemsmt.bl.fielddata.MemoData;
import org.sblim.wbemsmt.bl.fielddata.PictureData;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.container.global.*;
import org.sblim.wbemsmt.samba.bl.container.host.HostDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.*;
import org.sblim.wbemsmt.samba.bl.container.service.*;
import org.sblim.wbemsmt.samba.bl.container.share.*;
import org.sblim.wbemsmt.samba.bl.container.user.*;
import org.sblim.wbemsmt.samba.bl.container.welcome.WelcomeDataContainer;
import org.sblim.wbemsmt.samba.bl.container.wizard.*;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser;
import org.sblim.wbemsmt.samba.bl.wrapper.*;
import org.sblim.wbemsmt.samba.listener.CreatePrinterListener;
import org.sblim.wbemsmt.samba.listener.CreateShareListener;
import org.sblim.wbemsmt.samba.listener.CreateUserListener;

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
	
	public void updateControlsImpl(ServiceOperationsDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		selectedService.updateControls(container);
	}

	public void updateControlsImpl(ServiceOptionsDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		selectedService.updateControls(container);
	}

	public void updateControlsImpl(ServiceLoggingDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		selectedService.updateControls(container);
	}

	public void updateControlsImpl(ServiceGlobalSecurityOptionsDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		selectedService.updateControls(container);
	}

	public void updateControlsImpl(ServiceUserSecurityOptionsDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
        selectedService.updateControls(container);
        adapter.updateControls(container.getUserRights(),selectedService.getUsers().getFCOs());
	}

	public void updateControlsImpl(ServiceAllowHostSecurityDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		selectedService.updateControls(container);
	}

	public void updateControlsImpl(ServiceDenyHostDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		selectedService.updateControls(container);
	}

	public void updateControlsImpl(ServiceScriptingDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		selectedService.updateControls(container);
	}

	public void updateControlsImpl(ServiceWinsDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		selectedService.updateControls(container);
	}

	/******************************
	 *  
	 * SHARE (smbd etc.) TAB
	 * 
	 ******************************/	
	
	public void updateControlsImpl(ShareAllowHostSecurityDataContainer container) throws WbemsmtException {
		Share share = super.getSelectedShare();
		share.updateControls(container);
	}

	public void updateControlsImpl(ShareDenyHostSecurityDataContainer container) throws WbemsmtException {
		Share share = super.getSelectedShare();
		share.updateControls(container);
	}

	public void updateControlsImpl(ShareOptionsDataContainer container) throws WbemsmtException {
		Share share = super.getSelectedShare();
		share.updateControls(container);
	}
	
	public void updateControlsImpl(CMDShareFileAttributes container) throws WbemsmtException {
		Share share = super.getSelectedShare();
		share.updateControls(container);
	}

	public void updateControlsImpl(GUIShareFileAttributes container) throws WbemsmtException {
		Share share = super.getSelectedShare();
		share.updateControls(container);
	}

	public void updateControlsImpl(UserInShareACLDataContainer container) throws WbemsmtException {
		Share share = super.getSelectedShare();
		share.updateControls(container);
	}

	/******************************
	 *  
	 * SHARE-WIZARD (smbd etc.) TAB
	 * 
	 ******************************/	
	public void updateControlsImpl(ShareWizardPage1 container) throws WbemsmtException {
		adapter.getShareWizard().updateControls(container);
	}
	
	public void updateControlsImpl(ShareWizardPage2 container) throws WbemsmtException {
		adapter.getShareWizard().updateControls(container);
	}

	public void updateControlsImpl(ShareWizardPage3GUI container) throws WbemsmtException {
		adapter.getShareWizard().updateControls(container);
	}

	public void updateControlsImpl(ShareWizardPage4 container) throws WbemsmtException {
		adapter.getShareWizard().updateControls(container);
	}

	public void updateControlsImpl(ShareWizardPage3CMD container) throws WbemsmtException {
		adapter.getShareWizard().updateControls(container);
	}

	public void updateControlsImpl(UserInShareWizardACLItemDataContainer container) throws WbemsmtException {
		//do nothing
	}

	public void updateControlsImpl(UserInShareWizardACLItemDataContainer container, Linux_SambaUser fco) throws WbemsmtException {
		adapter.getShareWizard().updateControls(container,fco);
	}

	/****************
	 * Share Globals 
	 ***************/

	public void updateControlsImpl(ShareGlobalsDataContainer container) throws WbemsmtException {
	}
	
	public void updateControlsImpl(CMDShareGlobalsDataContainer container) throws WbemsmtException {
		ShareGlobals shareGlobals = getSelectedShareGlobals();
		shareGlobals.updateControls(container);
	}

	public void updateControlsImpl(GUIShareGlobalsDataContainer container) throws WbemsmtException {
		ShareGlobals shareGlobals = getSelectedShareGlobals();
		shareGlobals.updateControls(container);
	}


	/****************
	 * Printing Globals
	 ***************/
	public void updateControlsImpl(PrintingGlobalsDataContainer container) throws WbemsmtException {
		PrinterGlobals printerGlobals = getSelectedPrinterGlobals();
		printerGlobals.updateControls(container);
	}

	/****************
	 * Printer-Wizard
	 ***************/
	
	public void updateControlsImpl(PrinterWizardPage1 container) throws WbemsmtException {
		adapter.getPrinterWizard().updateControls(container);
	}

	public void updateControlsImpl(PrinterWizardPage2 container) throws WbemsmtException {
		adapter.getPrinterWizard().updateControls(container);
	}

	public void updateControlsImpl(PrinterWizardPage3 container) throws WbemsmtException {
		adapter.getPrinterWizard().updateControls(container);
	}

	public void updateControlsImpl(PrinterWizardPage4 container) throws WbemsmtException {
		adapter.getPrinterWizard().updateControls(container);
	}

	public void updateControlsImpl(PrinterWizardPage5 container) throws WbemsmtException {
		adapter.getPrinterWizard().updateControls(container);
	}


	public void updateControlsImpl(UserInPrinterWizardACLItemDataContainer container) throws WbemsmtException {
		adapter.getPrinterWizard().updateControls(container);
	}

	public void updateControlsImpl(UserInPrinterWizardACLItemDataContainer container, Linux_SambaUser fco) throws WbemsmtException {
		adapter.getPrinterWizard().updateControls(container,fco);
	}


	/****************
	 * User-Wizard
	 ***************/
	public void updateControlsImpl(UserWizardPage1 container) throws WbemsmtException {
		adapter.getUserWizard().updateControls(container);
	}

	public void updateControlsImpl(UserWizardPage2 container) throws WbemsmtException {
		adapter.getUserWizard().updateControls(container);
	}

	public void updateControlsImpl(UserWizardPage3 container) throws WbemsmtException {
		adapter.getUserWizard().updateControls(container);
	}

	public void updateControlsImpl(PrinterInUserWizardACLItemDataContainer container) throws WbemsmtException {
		//not called because n-childs
	}

	public void updateControlsImpl(ShareInUserWizardACLItemDataContainer container) throws WbemsmtException {
		//not called because n-childs
	}

	public void updateControlsImpl(ShareInUserWizardACLItemDataContainer container, Linux_SambaShareOptions fco) throws WbemsmtException {
		adapter.getUserWizard().updateControls(container,fco);
	}

	public void updateControlsImpl(PrinterInUserWizardACLItemDataContainer container, Linux_SambaPrinterOptions fco) throws WbemsmtException {
		adapter.getUserWizard().updateControls(container,fco);
	}
	/****************
	 * Host-Wizard
	 ***************/
	public void updateControlsImpl(HostWizardPage1 container) throws WbemsmtException {
		adapter.getHostWizard().updateControls(container);
	}

	public void updateControlsImpl(HostWizardPage2 container) throws WbemsmtException {
		adapter.getHostWizard().updateControls(container);
	}

	/****************
	 * Printer
	 ***************/

	
	public void updateControlsImpl(PrinterOptionsDataContainer container) throws WbemsmtException {
		Printer printer = super.getSelectedPrinter();
		printer.updateControls(container);
	}

	public void updateControlsImpl(PrintingOptionsDataContainer container) throws WbemsmtException {
		Printer printer = super.getSelectedPrinter();
		printer.updateControls(container);
	}

	public void updateControlsImpl(PrinterAllowHostSecurityDataContainer container) throws WbemsmtException {
		Printer printer = super.getSelectedPrinter();
		printer.updateControls(container);
	}

	public void updateControlsImpl(PrinterDenyHostSecurityDataContainer container) throws WbemsmtException {
		Printer printer = super.getSelectedPrinter();
		printer.updateControls(container);
	}

	public void updateControlsImpl(UserInPrinterACLDataContainer container) throws WbemsmtException {
		Printer printer = getSelectedPrinter();
		printer.updateControls(container);
	}

	
	
	public void updateControlsImpl(HostDataContainer container) throws WbemsmtException {
		
		
	}

	public void updateControlsImpl(UserDataContainer container) throws WbemsmtException {
		User user = getSelectedUser();
		user.updateControls(container);
	}

	public void updateControlsImpl(ShareFileAttributes container) throws WbemsmtException {
		//not used because the gui variants are used CMD/GUI
		
	}

	/**
	 * The UserACLDataContainer is misused to store the user-printer acl
	 * @param container
	 * @param fco
	 * @throws WbemsmtException
	 */
	public void updateControlsImpl(PrinterACLItemDataContainer container, Linux_SambaPrinterOptions fco) throws WbemsmtException {
			User selectedUser = getSelectedUser();
			selectedUser.updateControls(container,fco);
	}
	
	/**
	 * The UserACLDataContainer is misused to store the user-share acl
	 * @param container
	 * @param fco
	 * @throws WbemsmtException
	 */
	public void updateControlsImpl(ShareACLItemDataContainer container, Linux_SambaShareOptions fco) throws WbemsmtException {
		User selectedUser = getSelectedUser();
		selectedUser.updateControls(container,fco);
	}

	public void updateControlsImpl(UserACLItemDataContainerForService container) throws WbemsmtException {
		if (adapter.getSelectionHierarchy().size() == 1)
		{
			getSelectedService().updateControls(container);
		}
	}

	
	public void updateControlsImpl(UserACLItemDataContainerForShare container) throws WbemsmtException {
		if (adapter.getSelectionHierarchy().size() == 2 
				 && adapter.getSelectedShare() != null)
		{
			getSelectedShare().updateControls(container);
		}
	}

	public void updateControlsImpl(UserACLItemDataContainerForPrinter container) throws WbemsmtException {
		if (adapter.getSelectionHierarchy().size() == 2 
				 && adapter.getSelectedPrinter() != null)
		{
			getSelectedPrinter().updateControls(container);
		}
	}

	public void updateControlsImpl(PrinterACLItemDataContainer container) throws WbemsmtException {
		User selectedUser = getSelectedUser();
		selectedUser.updateControls(container);
	}

	public void updateControlsImpl(ShareACLItemDataContainer container) throws WbemsmtException {
		User selectedUser = getSelectedUser();
		selectedUser.updateControls(container);
	}

	public void updateControlsImpl(PrinterInUserACLDataContainer container) throws WbemsmtException {
		User selectedUser = getSelectedUser();
		selectedUser.updateControls(container);
	}

	public void updateControlsImpl(ShareInUserACLDataContainer container) throws WbemsmtException {
		User selectedUser = getSelectedUser();
		selectedUser.updateControls(container);
	}

	public void updateControlsImpl(UserACLItemDataContainerForService container, Linux_SambaUser fco) throws WbemsmtException {
		if (adapter.getSelectionHierarchy().size() == 1)
		{
			getSelectedService().updateControls(container,fco);
		}
	}

	public void updateControlsImpl(UserACLItemDataContainerForShare container, Linux_SambaUser fco) throws WbemsmtException {
		if (adapter.getSelectionHierarchy().size() == 2 
				 && adapter.getSelectedShare() != null)
		{
			getSelectedShare().updateControls(container,fco);
		}
	}

	public void updateControlsImpl(UserACLItemDataContainerForPrinter container, Linux_SambaUser fco) throws WbemsmtException {
		if (adapter.getSelectionHierarchy().size() == 2 
				 && adapter.getSelectedPrinter() != null)
		{
			getSelectedPrinter().updateControls(container,fco);
		}
	}

	public void updateControlsImpl(UserIsAdminItem container) throws WbemsmtException {
		// do nothing it's just the baseclass
		
	}

	public void updateControlsImpl(AdminUsersInPrinterGlobals container) throws WbemsmtException {
		adapter.getSelectedService().getPrinterGlobals().updateControls(container);
		
	}

	public void updateControlsImpl(AdminUsersInShareGlobals container) throws WbemsmtException {
		adapter.getSelectedService().getShareGlobals().updateControls(container);
	}

	public void updateControlsImpl(AdminUsersInPrinterGlobals container, Linux_SambaUser fco) throws WbemsmtException {
		adapter.getSelectedService().getPrinterGlobals().updateControls(container,fco);
	}

	public void updateControlsImpl(AdminUsersInShareGlobals container, Linux_SambaUser fco) throws WbemsmtException {
		adapter.getSelectedService().getShareGlobals().updateControls(container,fco);
	}

	public void updateControlsImpl(ShareListDataContainer container) throws WbemsmtException {
		adapter.updateControls(container.getShares(),adapter.getSelectedService().getShares().getFCOs());
	}

	public void updateControlsImpl(ShareListItemDataContainer container) throws WbemsmtException {
	}

	public void updateControlsImpl(ShareListItemDataContainer container, Linux_SambaShareOptions fco) throws WbemsmtException {
		adapter.getSelectedService().getShares().getShareByName(fco.get_key_Name()).updateControls(container);
	}

	public void updateControlsImpl(PrinterListDataContainer container) throws WbemsmtException {
		adapter.updateControls(container.getPrinters(),adapter.getSelectedService().getPrinters().getFCOs());
	}

	public void updateControlsImpl(PrinterListItemDataContainer container) throws WbemsmtException {
		// never used as root container
		
	}

	public void updateControlsImpl(UserListDataContainer container) throws WbemsmtException {
		adapter.updateControls(container.getUsers(),adapter.getSelectedService().getUsers().getFCOs());
		
	}

	public void updateControlsImpl(UserListItemDataContainer container) throws WbemsmtException {
		// never used as root container
	}

	public void updateControlsImpl(PrinterListItemDataContainer container, Linux_SambaPrinterOptions fco) throws WbemsmtException {
		adapter.getSelectedService().getPrinters().getPrinterByName(fco.get_key_Name()).updateControls(container);
		
	}

	public void updateControlsImpl(UserListItemDataContainer container, Linux_SambaUser fco) throws WbemsmtException {
		adapter.getSelectedService().getUsers().getUserByName(fco.get_key_SambaUserName()).updateControls(container);
	}

	public void updateControlsImpl(WelcomeDataContainer container) throws WbemsmtException {
		
		container.get_usr_WelcomeText().setControlValue(container.getAdapter().getBundle().getString("samba.welcome.objects"));
		container.get_usr_SharePicture().setControlValue(new PictureData("/org/sblim/wbemsmt/samba/images/share.gif"));
		container.get_usr_LinkCreateShare().setControlValue(new LinkData(new CreateShareListener(),container.getAdapter().getBundle().getString("tree.menu.createShare")));
		container.get_usr_LinkCreatePrinter().setControlValue(new LinkData(new CreatePrinterListener(),container.getAdapter().getBundle().getString("tree.menu.createPrinter")));
		container.get_usr_LinkCreateUser().setControlValue(new LinkData(new CreateUserListener(),container.getAdapter().getBundle().getString("tree.menu.createUser")));
		container.get_usr_Memo().setControlValue(new MemoData(container.getAdapter().getBundle().getString("samba.welcome.additional.info")));
		
		
	}
	
}
