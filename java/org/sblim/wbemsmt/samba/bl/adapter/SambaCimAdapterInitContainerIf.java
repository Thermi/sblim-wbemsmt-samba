/** 
 * SambaCimAdapterInitContainerIf.java
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
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceInitContainer.vm
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
 * This is the interface containing only the UpdateControls-Methods for the delegate
 **/

public interface SambaCimAdapterInitContainerIf extends InitContainerDelegatee {

    /** 
     * InitContainer-Methods
     **/
    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobals container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.share.CMDShareFileAttributes container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.global.CMDShareGlobalsDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.share.GUIShareFileAttributes container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.global.GUIShareGlobalsDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.host.HostDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage1 container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage2 container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.printer.PrinterAllowHostSecurityDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.printer.PrinterDenyHostSecurityDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.user.PrinterInUserACLDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.printer.PrinterListDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.printer.PrinterListItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.printer.PrinterOptionsDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage1 container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage2 container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage3 container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage4 container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage5 container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.global.PrintingGlobalsDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.printer.PrintingOptionsDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.service.ServiceAllowHostSecurityDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.service.ServiceDenyHostDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.service.ServiceGlobalSecurityOptionsDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.service.ServiceLoggingDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.service.ServiceOperationsDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.service.ServiceOptionsDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.service.ServiceScriptingDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.service.ServiceUserSecurityOptionsDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.service.ServiceWinsDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.share.ShareACLItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.share.ShareAllowHostSecurityDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.share.ShareDenyHostSecurityDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.share.ShareFileAttributes container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.global.ShareGlobalsDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.user.ShareInUserACLDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.share.ShareListDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.share.ShareListItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.share.ShareOptionsDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1 container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2 container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3CMD container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3GUI container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4 container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinter container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForService container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.share.UserACLItemDataContainerForShare container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.user.UserDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.printer.UserInPrinterACLDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.share.UserInShareACLDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.global.UserIsAdminItem container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.user.UserListDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.user.UserListItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1 container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2 container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3 container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.samba.bl.container.welcome.WelcomeDataContainer container)
            throws WbemsmtException;
}