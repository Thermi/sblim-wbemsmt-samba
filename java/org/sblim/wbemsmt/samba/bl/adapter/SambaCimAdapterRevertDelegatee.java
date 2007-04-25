 /** 
  * SambaCimAdapterRevertDelegatee.java
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
  * Description: Delegatee for Saving objects
  * 
  */
package org.sblim.wbemsmt.samba.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.exception.ObjectRevertException;
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
import org.sblim.wbemsmt.samba.bl.container.share.ShareOptionsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.UserACLItemDataContainerForShare;
import org.sblim.wbemsmt.samba.bl.container.share.UserInShareACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.PrinterInUserACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.ShareInUserACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.UserDataContainer;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser;
import org.sblim.wbemsmt.samba.bl.wrapper.Printer;
import org.sblim.wbemsmt.samba.bl.wrapper.PrinterGlobals;
import org.sblim.wbemsmt.samba.bl.wrapper.Service;
import org.sblim.wbemsmt.samba.bl.wrapper.Share;
import org.sblim.wbemsmt.samba.bl.wrapper.ShareGlobals;
import org.sblim.wbemsmt.samba.bl.wrapper.User;

public class SambaCimAdapterRevertDelegatee extends SambaDelegatee implements SambaCimAdapterRevertIf {

	public SambaCimAdapterRevertDelegatee(SambaCimAdapter adapter) {
		super(adapter);
	}

	public MessageList revertImpl(ServiceOperationsDataContainer container) throws ObjectRevertException {
		//do nothing
		return null;
	}

	public MessageList revertImpl(ServiceLoggingDataContainer container) throws ObjectRevertException {
		Service selectedService = getSelectedService();
		return selectedService.revertImpl(container);
	}

	public MessageList revertImpl(ServiceGlobalSecurityOptionsDataContainer container) throws ObjectRevertException {
		Service selectedService = getSelectedService();
		return selectedService.revertImpl(container);
	}

	public MessageList revertImpl(ServiceUserSecurityOptionsDataContainer container) throws ObjectRevertException {
		Service selectedService = getSelectedService();
		return selectedService.revertImpl(container);
	}

	public MessageList revertImpl(ServiceAllowHostSecurityDataContainer container) throws ObjectRevertException {
		Service selectedService = getSelectedService();
		return selectedService.revertImpl(container);
	}

	public MessageList revertImpl(ServiceDenyHostDataContainer container) throws ObjectRevertException {
		Service selectedService = getSelectedService();
		return selectedService.revertImpl(container);
	}

	public MessageList revertImpl(ServiceScriptingDataContainer container) throws ObjectRevertException {
		Service selectedService = getSelectedService();
		return selectedService.revertImpl(container);
	}

	public MessageList revertImpl(ServiceWinsDataContainer container) throws ObjectRevertException {
		Service selectedService = getSelectedService();
		return selectedService.revertImpl(container);
	}


	public MessageList revertImpl(ServiceOptionsDataContainer container) throws ObjectRevertException {
		Service selectedService = getSelectedService();
		return selectedService.revertImpl(container);
	}

	/************************
	 * Share Globals
	 *****************/
	public MessageList revertImpl(GUIShareGlobalsDataContainer container) throws ObjectRevertException {
		return getSelectedShareGlobals().revert(container);
	}

	public MessageList revertImpl(CMDShareGlobalsDataContainer container) throws ObjectRevertException {
		return getSelectedShareGlobals().revert(container);
	}

	public ShareGlobals getSelectedShareGlobals() {
		ShareGlobals shareGlobals;
		Service selectedService = adapter.getSelectedService();
		shareGlobals = selectedService.getShareGlobals();
		return shareGlobals;
	}

	/****************************
	 *  PrinterGlobals
	 ********************/
	public MessageList revertImpl(PrintingGlobalsDataContainer container) throws ObjectRevertException {
		PrinterGlobals selectedPrinterGlobals = getSelectedPrinterGlobals();
		return selectedPrinterGlobals.revert(container);
	}

	/*********************
	 * Share
	 ********************/
	
	
	public MessageList revertImpl(ShareFileAttributes container) throws ObjectRevertException {
		// Not called is extended by GUIShareFileAttributes and CMDShareFileAttributes containers 
		return null;
	}

	public MessageList revertImpl(ShareDenyHostSecurityDataContainer container) throws ObjectRevertException {
		Share share = getSelectedShare();
		return share.revert(container);
	}

	public MessageList revertImpl(ShareAllowHostSecurityDataContainer container) throws ObjectRevertException {
		Share share = getSelectedShare();
		return share.revert(container);
	}
	public MessageList revertImpl(ShareOptionsDataContainer container) throws ObjectRevertException {
		Share share = getSelectedShare();
		return share.revert(container);
	}

	public MessageList revertImpl(GUIShareFileAttributes container) throws ObjectRevertException {
		Share share = getSelectedShare();
		return share.revert(container);
	}

	public MessageList revertImpl(CMDShareFileAttributes container) throws ObjectRevertException {
		Share share = getSelectedShare();
		return share.revert(container);
	}

	public MessageList revertImpl(UserInShareACLDataContainer container) throws ObjectRevertException {
		Share share = getSelectedShare();
		return share.revert(container);
	}
	
	/*********************
	 * Printer
	 ********************/
	
	public MessageList revertImpl(PrinterOptionsDataContainer container) throws ObjectRevertException {
		Printer printer = getSelectedPrinter();
		return printer.revert(container);
	}

	public MessageList revertImpl(PrinterAllowHostSecurityDataContainer container) throws ObjectRevertException {
		Printer printer = getSelectedPrinter();
		return printer.revert(container);
	}


	public MessageList revertImpl(PrintingOptionsDataContainer container) throws ObjectRevertException {
		Printer printer = getSelectedPrinter();
		return printer.revert(container);
	}

	public MessageList revertImpl(UserInPrinterACLDataContainer container) throws ObjectRevertException {
		Printer printer = getSelectedPrinter();
		return printer.revert(container);
	}


	public MessageList revertImpl(PrinterDenyHostSecurityDataContainer container) throws ObjectRevertException {
		Printer printer = getSelectedPrinter();
		return printer.revert(container);
	}

	public MessageList revertImpl(HostDataContainer container) throws ObjectRevertException {
		return null;
	}


	public MessageList revertImpl(UserACLItemDataContainerForShare container) throws ObjectRevertException {
		if (adapter.getSelectionHierarchy().size() == 2 && adapter.getSelectedShare() != null)
		{
			Share share = getSelectedShare();
			return share.revert(container);
		}
		return null;
	}

	public MessageList revertImpl(UserACLItemDataContainerForService container) throws ObjectRevertException {
		if (adapter.getSelectionHierarchy().size() == 1)
		{
			Service selectedService = getSelectedService();
			return selectedService.revert(container);
		}
		return null;
	}

	public MessageList revertImpl(UserACLItemDataContainerForPrinter container) throws ObjectRevertException {
		if (adapter.getSelectionHierarchy().size() == 2 && adapter.getSelectedPrinter() != null)
		{
			Printer printer = getSelectedPrinter();
			return printer.revert(container);
		}
		return null;
	}

	public MessageList revertImpl(ShareGlobalsDataContainer container) throws ObjectRevertException {
		getSelectedService().getShareGlobals().revertShareGlobals(container);
		return null;
	}

	public MessageList revertImpl(UserACLItemDataContainerForShare container, Linux_SambaUser fco) throws ObjectRevertException {
		return null;
	}

	public MessageList revertImpl(UserACLItemDataContainerForService container, Linux_SambaUser fco) throws ObjectRevertException {
		return null;
	}
	
	public MessageList revertImpl(UserACLItemDataContainerForPrinter container, Linux_SambaUser fco) throws ObjectRevertException {
		return null;
	}

	public MessageList revertImpl(UserDataContainer container) throws ObjectRevertException {
		User user = getSelectedUser();
		return user.revert(container);
	}

	public MessageList revertImpl(PrinterInUserACLDataContainer container) throws ObjectRevertException {
		User user = getSelectedUser();
		return user.revert(container);
	}

	public MessageList revertImpl(ShareInUserACLDataContainer container) throws ObjectRevertException {
		User user = getSelectedUser();
		return user.revert(container);
	}

	public MessageList revertImpl(ShareACLItemDataContainer container) throws ObjectRevertException {
		User user = getSelectedUser();
		return user.revert(container);
	}

	public MessageList revertImpl(PrinterACLItemDataContainer container) throws ObjectRevertException {
		User user = getSelectedUser();
		return user.revert(container);
	}

	public MessageList revertImpl(ShareACLItemDataContainer container, Linux_SambaShareOptions fco) throws ObjectRevertException {
		User user = getSelectedUser();
		return user.revert(container,fco);
	}

	public MessageList revertImpl(PrinterACLItemDataContainer container, Linux_SambaPrinterOptions fco) throws ObjectRevertException {
		User user = getSelectedUser();
		return user.revert(container,fco);
	}

	public MessageList revertImpl(AdminUsersInShareGlobals container) throws ObjectRevertException {
		return adapter.getSelectedService().getShareGlobals().revert(container);
	}

	public MessageList revertImpl(UserIsAdminItem container) throws ObjectRevertException {
		//do nothing it's just a baseclass
		return null;
	}

	public MessageList revertImpl(AdminUsersInPrinterGlobals container) throws ObjectRevertException {
		return adapter.getSelectedService().getPrinterGlobals().revert(container);
	}

	public MessageList revertImpl(AdminUsersInPrinterGlobals container, Linux_SambaUser fco) throws ObjectRevertException {
		return adapter.getSelectedService().getPrinterGlobals().revert(container,fco);
	}
	
	public MessageList revertImpl(AdminUsersInShareGlobals container, Linux_SambaUser fco) throws ObjectRevertException {
		return adapter.getSelectedService().getShareGlobals().revert(container,fco);
	}
}
