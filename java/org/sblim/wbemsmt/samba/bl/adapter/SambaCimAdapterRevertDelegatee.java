 /** 
  * SambaCimAdapterRevertDelegatee.java
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
  * Description: Delegatee for Saving objects
  * 
  */
package org.sblim.wbemsmt.samba.bl.adapter;

import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.container.global.*;
import org.sblim.wbemsmt.samba.bl.container.host.HostDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.*;
import org.sblim.wbemsmt.samba.bl.container.service.*;
import org.sblim.wbemsmt.samba.bl.container.share.*;
import org.sblim.wbemsmt.samba.bl.container.user.PrinterInUserACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.ShareInUserACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.UserDataContainer;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser;
import org.sblim.wbemsmt.samba.bl.wrapper.*;

public class SambaCimAdapterRevertDelegatee extends SambaDelegatee implements SambaCimAdapterRevertIf {

	public SambaCimAdapterRevertDelegatee(SambaCimAdapter adapter) {
		super(adapter);
	}

	public MessageList revertImpl(ServiceOperationsDataContainer container) throws WbemsmtException {
		//do nothing
		return null;
	}

	public MessageList revertImpl(ServiceLoggingDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		return selectedService.revertImpl(container);
	}

	public MessageList revertImpl(ServiceGlobalSecurityOptionsDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		return selectedService.revertImpl(container);
	}

	public MessageList revertImpl(ServiceUserSecurityOptionsDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		return selectedService.revertImpl(container);
	}

	public MessageList revertImpl(ServiceAllowHostSecurityDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		return selectedService.revertImpl(container);
	}

	public MessageList revertImpl(ServiceDenyHostDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		return selectedService.revertImpl(container);
	}

	public MessageList revertImpl(ServiceScriptingDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		return selectedService.revertImpl(container);
	}

	public MessageList revertImpl(ServiceWinsDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		return selectedService.revertImpl(container);
	}


	public MessageList revertImpl(ServiceOptionsDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		return selectedService.revertImpl(container);
	}

	/************************
	 * Share Globals
	 *****************/
	public MessageList revertImpl(GUIShareGlobalsDataContainer container) throws WbemsmtException {
		return getSelectedShareGlobals().revert(container);
	}

	public MessageList revertImpl(CMDShareGlobalsDataContainer container) throws WbemsmtException {
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
	public MessageList revertImpl(PrintingGlobalsDataContainer container) throws WbemsmtException {
		PrinterGlobals selectedPrinterGlobals = getSelectedPrinterGlobals();
		return selectedPrinterGlobals.revert(container);
	}

	/*********************
	 * Share
	 ********************/
	
	
	public MessageList revertImpl(ShareFileAttributes container) throws WbemsmtException {
		// Not called is extended by GUIShareFileAttributes and CMDShareFileAttributes containers 
		return null;
	}

	public MessageList revertImpl(ShareDenyHostSecurityDataContainer container) throws WbemsmtException {
		Share share = getSelectedShare();
		return share.revert(container);
	}

	public MessageList revertImpl(ShareAllowHostSecurityDataContainer container) throws WbemsmtException {
		Share share = getSelectedShare();
		return share.revert(container);
	}
	public MessageList revertImpl(ShareOptionsDataContainer container) throws WbemsmtException {
		Share share = getSelectedShare();
		return share.revert(container);
	}

	public MessageList revertImpl(GUIShareFileAttributes container) throws WbemsmtException {
		Share share = getSelectedShare();
		return share.revert(container);
	}

	public MessageList revertImpl(CMDShareFileAttributes container) throws WbemsmtException {
		Share share = getSelectedShare();
		return share.revert(container);
	}

	public MessageList revertImpl(UserInShareACLDataContainer container) throws WbemsmtException {
		Share share = getSelectedShare();
		return share.revert(container);
	}
	
	/*********************
	 * Printer
	 ********************/
	
	public MessageList revertImpl(PrinterOptionsDataContainer container) throws WbemsmtException {
		Printer printer = getSelectedPrinter();
		return printer.revert(container);
	}

	public MessageList revertImpl(PrinterAllowHostSecurityDataContainer container) throws WbemsmtException {
		Printer printer = getSelectedPrinter();
		return printer.revert(container);
	}


	public MessageList revertImpl(PrintingOptionsDataContainer container) throws WbemsmtException {
		Printer printer = getSelectedPrinter();
		return printer.revert(container);
	}

	public MessageList revertImpl(UserInPrinterACLDataContainer container) throws WbemsmtException {
		Printer printer = getSelectedPrinter();
		return printer.revert(container);
	}


	public MessageList revertImpl(PrinterDenyHostSecurityDataContainer container) throws WbemsmtException {
		Printer printer = getSelectedPrinter();
		return printer.revert(container);
	}

	public MessageList revertImpl(HostDataContainer container) throws WbemsmtException {
		return null;
	}


	public MessageList revertImpl(UserACLItemDataContainerForShare container) throws WbemsmtException {
		if (adapter.getSelectionHierarchy().size() == 2 && adapter.getSelectedShare() != null)
		{
			Share share = getSelectedShare();
			return share.revert(container);
		}
		return null;
	}

	public MessageList revertImpl(UserACLItemDataContainerForService container) throws WbemsmtException {
		if (adapter.getSelectionHierarchy().size() == 1)
		{
			Service selectedService = getSelectedService();
			return selectedService.revert(container);
		}
		return null;
	}

	public MessageList revertImpl(UserACLItemDataContainerForPrinter container) throws WbemsmtException {
		if (adapter.getSelectionHierarchy().size() == 2 && adapter.getSelectedPrinter() != null)
		{
			Printer printer = getSelectedPrinter();
			return printer.revert(container);
		}
		return null;
	}

	public MessageList revertImpl(ShareGlobalsDataContainer container) throws WbemsmtException {
		getSelectedService().getShareGlobals().revertShareGlobals(container);
		return null;
	}

	public MessageList revertImpl(UserACLItemDataContainerForShare container, Linux_SambaUser fco) throws WbemsmtException {
		return null;
	}

	public MessageList revertImpl(UserACLItemDataContainerForService container, Linux_SambaUser fco) throws WbemsmtException {
		return null;
	}
	
	public MessageList revertImpl(UserACLItemDataContainerForPrinter container, Linux_SambaUser fco) throws WbemsmtException {
		return null;
	}

	public MessageList revertImpl(UserDataContainer container) throws WbemsmtException {
		User user = getSelectedUser();
		return user.revert(container);
	}

	public MessageList revertImpl(PrinterInUserACLDataContainer container) throws WbemsmtException {
		User user = getSelectedUser();
		return user.revert(container);
	}

	public MessageList revertImpl(ShareInUserACLDataContainer container) throws WbemsmtException {
		User user = getSelectedUser();
		return user.revert(container);
	}

	public MessageList revertImpl(ShareACLItemDataContainer container) throws WbemsmtException {
		User user = getSelectedUser();
		return user.revert(container);
	}

	public MessageList revertImpl(PrinterACLItemDataContainer container) throws WbemsmtException {
		User user = getSelectedUser();
		return user.revert(container);
	}

	public MessageList revertImpl(ShareACLItemDataContainer container, Linux_SambaShareOptions fco) throws WbemsmtException {
		User user = getSelectedUser();
		return user.revert(container,fco);
	}

	public MessageList revertImpl(PrinterACLItemDataContainer container, Linux_SambaPrinterOptions fco) throws WbemsmtException {
		User user = getSelectedUser();
		return user.revert(container,fco);
	}

	public MessageList revertImpl(AdminUsersInShareGlobals container) throws WbemsmtException {
		return adapter.getSelectedService().getShareGlobals().revert(container);
	}

	public MessageList revertImpl(UserIsAdminItem container) throws WbemsmtException {
		//do nothing it's just a baseclass
		return null;
	}

	public MessageList revertImpl(AdminUsersInPrinterGlobals container) throws WbemsmtException {
		return adapter.getSelectedService().getPrinterGlobals().revert(container);
	}

	public MessageList revertImpl(AdminUsersInPrinterGlobals container, Linux_SambaUser fco) throws WbemsmtException {
		return adapter.getSelectedService().getPrinterGlobals().revert(container,fco);
	}
	
	public MessageList revertImpl(AdminUsersInShareGlobals container, Linux_SambaUser fco) throws WbemsmtException {
		return adapter.getSelectedService().getShareGlobals().revert(container,fco);
	}
}
