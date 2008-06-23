/** 
 * SambaCimAdapterSaveIf.java
 *
 * 
 * © Copyright IBM Corp. 2006,2007
 *
 * THIS FILE IS PROVIDED UNDER THE TER	MS OF THE COMMON PUBLIC LICENSE
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Common Public License from
 * http://www.opensource.org/licenses/cpl1.0.php
 *
 * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceSave.vm
 *
 * Contributors: 
 *   michael.bauschert@de.ibm.com
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.samba.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.*;

import org.sblim.wbemsmt.exception.WbemsmtException;

/** 
 * This is the interface containing only the Save-Methods for the delegate
 **/

public interface SambaCimAdapterSaveIf extends SaveDelegatee {

    /** 
     * Save-Methods
     **/
    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobals container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.share.CMDShareFileAttributes container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.global.CMDShareGlobalsDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.share.GUIShareFileAttributes container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.global.GUIShareGlobalsDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.host.HostDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.printer.PrinterAllowHostSecurityDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.printer.PrinterDenyHostSecurityDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.user.PrinterInUserACLDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.printer.PrinterOptionsDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.global.PrintingGlobalsDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.printer.PrintingOptionsDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.service.ServiceAllowHostSecurityDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.service.ServiceDenyHostDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.service.ServiceGlobalSecurityOptionsDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.service.ServiceLoggingDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.service.ServiceOperationsDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.service.ServiceOptionsDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.service.ServiceScriptingDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.service.ServiceUserSecurityOptionsDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.service.ServiceWinsDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.share.ShareACLItemDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.share.ShareAllowHostSecurityDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.share.ShareDenyHostSecurityDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.share.ShareFileAttributes container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.global.ShareGlobalsDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.user.ShareInUserACLDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.share.ShareOptionsDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinter container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForService container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.share.UserACLItemDataContainerForShare container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.user.UserDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.printer.UserInPrinterACLDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.share.UserInShareACLDataContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.global.UserIsAdminItem container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals container,
            org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco) throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobals container,
            org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco) throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinter container,
            org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco) throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForService container,
            org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco) throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer container,
            org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterOptions fco) throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.share.ShareACLItemDataContainer container,
            org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareOptions fco) throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList saveImpl(
            org.sblim.wbemsmt.samba.bl.container.share.UserACLItemDataContainerForShare container,
            org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser fco) throws WbemsmtException;

}