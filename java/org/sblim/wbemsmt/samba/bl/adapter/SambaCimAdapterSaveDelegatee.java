 /** 
  * SambaCimAdapterSaveDelegatee.java
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

public class SambaCimAdapterSaveDelegatee extends SambaDelegatee implements SambaCimAdapterSaveIf {

	public SambaCimAdapterSaveDelegatee(SambaCimAdapter adapter) {
		super(adapter);
	}

	public MessageList saveImpl(ServiceOperationsDataContainer container) throws WbemsmtException {
		//do nothing
		return null;
	}

	public MessageList saveImpl(ServiceLoggingDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		return selectedService.saveImpl(container);
	}

	public MessageList saveImpl(ServiceGlobalSecurityOptionsDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		return selectedService.saveImpl(container);
	}

	public MessageList saveImpl(ServiceUserSecurityOptionsDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		return selectedService.saveImpl(container);
	}

	public MessageList saveImpl(ServiceAllowHostSecurityDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		return selectedService.saveImpl(container);
	}

	public MessageList saveImpl(ServiceDenyHostDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		return selectedService.saveImpl(container);
	}

	public MessageList saveImpl(ServiceScriptingDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		return selectedService.saveImpl(container);
	}

	public MessageList saveImpl(ServiceWinsDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		return selectedService.saveImpl(container);
	}


	public MessageList saveImpl(ServiceOptionsDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		return selectedService.saveImpl(container);
	}

	/************************
	 * Share Globals
	 *****************/
	public MessageList saveImpl(GUIShareGlobalsDataContainer container) throws WbemsmtException {
		return getSelectedShareGlobals().save(container);
	}

	public MessageList saveImpl(CMDShareGlobalsDataContainer container) throws WbemsmtException {
		return getSelectedShareGlobals().save(container);
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
	public MessageList saveImpl(PrintingGlobalsDataContainer container) throws WbemsmtException {
		PrinterGlobals selectedPrinterGlobals = getSelectedPrinterGlobals();
		return selectedPrinterGlobals.save(container);
	}

	/*********************
	 * Share
	 ********************/
	
	
	public MessageList saveImpl(ShareFileAttributes container) throws WbemsmtException {
		// Not called is extended by GUIShareFileAttributes and CMDShareFileAttributes containers 
		return null;
	}

	public MessageList saveImpl(ShareDenyHostSecurityDataContainer container) throws WbemsmtException {
		Share share = getSelectedShare();
		return share.save(container);
	}

	public MessageList saveImpl(ShareAllowHostSecurityDataContainer container) throws WbemsmtException {
		Share share = getSelectedShare();
		return share.save(container);
	}
	public MessageList saveImpl(ShareOptionsDataContainer container) throws WbemsmtException {
		Share share = getSelectedShare();
		return share.save(container);
	}

	public MessageList saveImpl(GUIShareFileAttributes container) throws WbemsmtException {
		Share share = getSelectedShare();
		return share.save(container);
	}

	public MessageList saveImpl(CMDShareFileAttributes container) throws WbemsmtException {
		Share share = getSelectedShare();
		return share.save(container);
	}

	public MessageList saveImpl(UserInShareACLDataContainer container) throws WbemsmtException {
		Share share = getSelectedShare();
		return share.save(container);
	}
	
	/*********************
	 * Printer
	 ********************/
	
	public MessageList saveImpl(PrinterOptionsDataContainer container) throws WbemsmtException {
		Printer printer = getSelectedPrinter();
		return printer.save(container);
	}

	public MessageList saveImpl(PrinterAllowHostSecurityDataContainer container) throws WbemsmtException {
		Printer printer = getSelectedPrinter();
		return printer.save(container);
	}


	public MessageList saveImpl(PrintingOptionsDataContainer container) throws WbemsmtException {
		Printer printer = getSelectedPrinter();
		return printer.save(container);
	}

	public MessageList saveImpl(UserInPrinterACLDataContainer container) throws WbemsmtException {
		Printer printer = getSelectedPrinter();
		return printer.save(container);
	}


	public MessageList saveImpl(PrinterDenyHostSecurityDataContainer container) throws WbemsmtException {
		Printer printer = getSelectedPrinter();
		return printer.save(container);
	}

	public MessageList saveImpl(HostDataContainer container) throws WbemsmtException {
		return null;
	}


	public MessageList saveImpl(UserACLItemDataContainerForShare container) throws WbemsmtException {
		if (adapter.getSelectionHierarchy().size() == 2 && adapter.getSelectedShare() != null)
		{
			Share share = getSelectedShare();
			return share.save(container);
		}
		return null;
	}

	public MessageList saveImpl(UserACLItemDataContainerForService container) throws WbemsmtException {
		if (adapter.getSelectionHierarchy().size() == 1)
		{
			Service selectedService = getSelectedService();
			return selectedService.save(container);
		}
		return null;
	}

	public MessageList saveImpl(UserACLItemDataContainerForPrinter container) throws WbemsmtException {
		if (adapter.getSelectionHierarchy().size() == 2 && adapter.getSelectedPrinter() != null)
		{
			Printer printer = getSelectedPrinter();
			return printer.save(container);
		}
		return null;
	}

	public MessageList saveImpl(ShareGlobalsDataContainer container) throws WbemsmtException {
		getSelectedService().getShareGlobals().saveShareGlobals(container);
		return null;
	}

	public MessageList saveImpl(UserACLItemDataContainerForShare container, Linux_SambaUser fco) throws WbemsmtException {
		if (adapter.getSelectionHierarchy().size() == 2 && adapter.getSelectedShare() != null)
		{
			Share share = getSelectedShare();
			return share.save(container,fco);
		}
		return null;
	}

	public MessageList saveImpl(UserACLItemDataContainerForService container, Linux_SambaUser fco) throws WbemsmtException {
		if (adapter.getSelectionHierarchy().size() == 1)
		{
			Service selectedService = getSelectedService();
			return selectedService.save(container,fco);
		}
		return null;
	}
	
	public MessageList saveImpl(UserACLItemDataContainerForPrinter container, Linux_SambaUser fco) throws WbemsmtException {
		if (adapter.getSelectionHierarchy().size() == 2 && adapter.getSelectedPrinter() != null)
		{
			Printer printer = getSelectedPrinter();
			return printer.save(container,fco);
		}
		return null;
	}

	public MessageList saveImpl(UserDataContainer container) throws WbemsmtException {
		User user = getSelectedUser();
		return user.save(container);
	}

	public MessageList saveImpl(PrinterInUserACLDataContainer container) throws WbemsmtException {
		User user = getSelectedUser();
		return user.save(container);
	}

	public MessageList saveImpl(ShareInUserACLDataContainer container) throws WbemsmtException {
		User user = getSelectedUser();
		return user.save(container);
	}

	public MessageList saveImpl(ShareACLItemDataContainer container) throws WbemsmtException {
		User user = getSelectedUser();
		return user.save(container);
	}

	public MessageList saveImpl(PrinterACLItemDataContainer container) throws WbemsmtException {
		User user = getSelectedUser();
		return user.save(container);
	}

	public MessageList saveImpl(ShareACLItemDataContainer container, Linux_SambaShareOptions fco) throws WbemsmtException {
		User user = getSelectedUser();
		return user.save(container,fco);
	}

	public MessageList saveImpl(PrinterACLItemDataContainer container, Linux_SambaPrinterOptions fco) throws WbemsmtException {
		User user = getSelectedUser();
		return user.save(container,fco);
	}

	public MessageList saveImpl(AdminUsersInShareGlobals container) throws WbemsmtException {
		return adapter.getSelectedService().getShareGlobals().save(container);
	}

	public MessageList saveImpl(UserIsAdminItem container) throws WbemsmtException {
		//do nothing it's just a baseclass
		return null;
	}

	public MessageList saveImpl(AdminUsersInPrinterGlobals container) throws WbemsmtException {
		return adapter.getSelectedService().getPrinterGlobals().save(container);
	}

	public MessageList saveImpl(AdminUsersInPrinterGlobals container, Linux_SambaUser fco) throws WbemsmtException {
		return adapter.getSelectedService().getPrinterGlobals().save(container,fco);
	}
	
	public MessageList saveImpl(AdminUsersInShareGlobals container, Linux_SambaUser fco) throws WbemsmtException {
		return adapter.getSelectedService().getShareGlobals().save(container,fco);
	}
}
