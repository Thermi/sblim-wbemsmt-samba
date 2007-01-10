/** 
  * SambaCimAdapterRevertIf.java
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
  * @template: ./tools-dcg/templates/adapterInterfaceRevert.vm
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
	 * This is the interface containing only the Revert-Methods for the delegate
	 **/

public interface SambaCimAdapterRevertIf extends RevertDelegatee
{

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
	
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobals container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinter container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForService container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterOptions fco)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.share.ShareACLItemDataContainer container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareOptions fco)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.samba.bl.container.share.UserACLItemDataContainerForShare container, org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
		
}