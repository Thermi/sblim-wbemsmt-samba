 /** 
  * SambaCimAdapterSaveDelegatee.java
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
import org.sblim.wbemsmt.exception.ObjectSaveException;
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

public class SambaCimAdapterSaveDelegatee extends SambaDelegatee implements SambaCimAdapterSaveIf {

	public SambaCimAdapterSaveDelegatee(SambaCimAdapter adapter) {
		super(adapter);
	}

	public MessageList saveImpl(ServiceOperationsDataContainer container) throws ObjectSaveException {
		//do nothing
		return null;
	}

	public MessageList saveImpl(ServiceLoggingDataContainer container) throws ObjectSaveException {
		Service selectedService = getSelectedService();
		return selectedService.saveImpl(container);
	}

	public MessageList saveImpl(ServiceGlobalSecurityOptionsDataContainer container) throws ObjectSaveException {
		Service selectedService = getSelectedService();
		return selectedService.saveImpl(container);
	}

	public MessageList saveImpl(ServiceUserSecurityOptionsDataContainer container) throws ObjectSaveException {
		Service selectedService = getSelectedService();
		return selectedService.saveImpl(container);
	}

	public MessageList saveImpl(ServiceAllowHostSecurityDataContainer container) throws ObjectSaveException {
		Service selectedService = getSelectedService();
		return selectedService.saveImpl(container);
	}

	public MessageList saveImpl(ServiceDenyHostDataContainer container) throws ObjectSaveException {
		Service selectedService = getSelectedService();
		return selectedService.saveImpl(container);
	}

	public MessageList saveImpl(ServiceScriptingDataContainer container) throws ObjectSaveException {
		Service selectedService = getSelectedService();
		return selectedService.saveImpl(container);
	}

	public MessageList saveImpl(ServiceWinsDataContainer container) throws ObjectSaveException {
		Service selectedService = getSelectedService();
		return selectedService.saveImpl(container);
	}


	public MessageList saveImpl(ServiceOptionsDataContainer container) throws ObjectSaveException {
		Service selectedService = getSelectedService();
		return selectedService.saveImpl(container);
	}

	/************************
	 * Share Globals
	 *****************/
	public MessageList saveImpl(GUIShareGlobalsDataContainer container) throws ObjectSaveException {
		return getSelectedShareGlobals().save(container);
	}

	public MessageList saveImpl(CMDShareGlobalsDataContainer container) throws ObjectSaveException {
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
	public MessageList saveImpl(PrintingGlobalsDataContainer container) throws ObjectSaveException {
		PrinterGlobals selectedPrinterGlobals = getSelectedPrinterGlobals();
		return selectedPrinterGlobals.save(container);
	}

	/*********************
	 * Share
	 ********************/
	
	
	public MessageList saveImpl(ShareFileAttributes container) throws ObjectSaveException {
		// Not called is extended by GUIShareFileAttributes and CMDShareFileAttributes containers 
		return null;
	}

	public MessageList saveImpl(ShareDenyHostSecurityDataContainer container) throws ObjectSaveException {
		Share share = getSelectedShare();
		return share.save(container);
	}

	public MessageList saveImpl(ShareAllowHostSecurityDataContainer container) throws ObjectSaveException {
		Share share = getSelectedShare();
		return share.save(container);
	}
	public MessageList saveImpl(ShareOptionsDataContainer container) throws ObjectSaveException {
		Share share = getSelectedShare();
		return share.save(container);
	}

	public MessageList saveImpl(GUIShareFileAttributes container) throws ObjectSaveException {
		Share share = getSelectedShare();
		return share.save(container);
	}

	public MessageList saveImpl(CMDShareFileAttributes container) throws ObjectSaveException {
		Share share = getSelectedShare();
		return share.save(container);
	}

	public MessageList saveImpl(UserInShareACLDataContainer container) throws ObjectSaveException {
		Share share = getSelectedShare();
		return share.save(container);
	}
	
	/*********************
	 * Printer
	 ********************/
	
	public MessageList saveImpl(PrinterOptionsDataContainer container) throws ObjectSaveException {
		Printer printer = getSelectedPrinter();
		return printer.save(container);
	}

	public MessageList saveImpl(PrinterAllowHostSecurityDataContainer container) throws ObjectSaveException {
		Printer printer = getSelectedPrinter();
		return printer.save(container);
	}


	public MessageList saveImpl(PrintingOptionsDataContainer container) throws ObjectSaveException {
		Printer printer = getSelectedPrinter();
		return printer.save(container);
	}

	public MessageList saveImpl(UserInPrinterACLDataContainer container) throws ObjectSaveException {
		Printer printer = getSelectedPrinter();
		return printer.save(container);
	}


	public MessageList saveImpl(PrinterDenyHostSecurityDataContainer container) throws ObjectSaveException {
		Printer printer = getSelectedPrinter();
		return printer.save(container);
	}

	public MessageList saveImpl(HostDataContainer container) throws ObjectSaveException {
		return null;
	}


	public MessageList saveImpl(UserACLItemDataContainerForShare container) throws ObjectSaveException {
		if (adapter.getSelectionHierarchy().size() == 2 && adapter.getSelectedShare() != null)
		{
			Share share = getSelectedShare();
			return share.save(container);
		}
		return null;
	}

	public MessageList saveImpl(UserACLItemDataContainerForService container) throws ObjectSaveException {
		if (adapter.getSelectionHierarchy().size() == 1)
		{
			Service selectedService = getSelectedService();
			return selectedService.save(container);
		}
		return null;
	}

	public MessageList saveImpl(UserACLItemDataContainerForPrinter container) throws ObjectSaveException {
		if (adapter.getSelectionHierarchy().size() == 2 && adapter.getSelectedPrinter() != null)
		{
			Printer printer = getSelectedPrinter();
			return printer.save(container);
		}
		return null;
	}

	public MessageList saveImpl(ShareGlobalsDataContainer container) throws ObjectSaveException {
		getSelectedService().getShareGlobals().saveShareGlobals(container);
		return null;
	}

	public MessageList saveImpl(UserACLItemDataContainerForShare container, Linux_SambaUser fco) throws ObjectSaveException {
		if (adapter.getSelectionHierarchy().size() == 2 && adapter.getSelectedShare() != null)
		{
			Share share = getSelectedShare();
			return share.save(container,fco);
		}
		return null;
	}

	public MessageList saveImpl(UserACLItemDataContainerForService container, Linux_SambaUser fco) throws ObjectSaveException {
		if (adapter.getSelectionHierarchy().size() == 1)
		{
			Service selectedService = getSelectedService();
			return selectedService.save(container,fco);
		}
		return null;
	}
	
	public MessageList saveImpl(UserACLItemDataContainerForPrinter container, Linux_SambaUser fco) throws ObjectSaveException {
		if (adapter.getSelectionHierarchy().size() == 2 && adapter.getSelectedPrinter() != null)
		{
			Printer printer = getSelectedPrinter();
			return printer.save(container,fco);
		}
		return null;
	}

	public MessageList saveImpl(UserDataContainer container) throws ObjectSaveException {
		User user = getSelectedUser();
		return user.save(container);
	}

	public MessageList saveImpl(PrinterInUserACLDataContainer container) throws ObjectSaveException {
		User user = getSelectedUser();
		return user.save(container);
	}

	public MessageList saveImpl(ShareInUserACLDataContainer container) throws ObjectSaveException {
		User user = getSelectedUser();
		return user.save(container);
	}

	public MessageList saveImpl(ShareACLItemDataContainer container) throws ObjectSaveException {
		User user = getSelectedUser();
		return user.save(container);
	}

	public MessageList saveImpl(PrinterACLItemDataContainer container) throws ObjectSaveException {
		User user = getSelectedUser();
		return user.save(container);
	}

	public MessageList saveImpl(ShareACLItemDataContainer container, Linux_SambaShareOptions fco) throws ObjectSaveException {
		User user = getSelectedUser();
		return user.save(container,fco);
	}

	public MessageList saveImpl(PrinterACLItemDataContainer container, Linux_SambaPrinterOptions fco) throws ObjectSaveException {
		User user = getSelectedUser();
		return user.save(container,fco);
	}

	public MessageList saveImpl(AdminUsersInShareGlobals container) throws ObjectSaveException {
		return adapter.getSelectedService().getShareGlobals().save(container);
	}

	public MessageList saveImpl(UserIsAdminItem container) throws ObjectSaveException {
		//do nothing it's just a baseclass
		return null;
	}

	public MessageList saveImpl(AdminUsersInPrinterGlobals container) throws ObjectSaveException {
		return adapter.getSelectedService().getPrinterGlobals().save(container);
	}

	public MessageList saveImpl(AdminUsersInPrinterGlobals container, Linux_SambaUser fco) throws ObjectSaveException {
		return adapter.getSelectedService().getPrinterGlobals().save(container,fco);
	}
	
	public MessageList saveImpl(AdminUsersInShareGlobals container, Linux_SambaUser fco) throws ObjectSaveException {
		return adapter.getSelectedService().getShareGlobals().save(container,fco);
	}
}
