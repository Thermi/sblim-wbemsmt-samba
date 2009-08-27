/**
 * SambaCimAdapterUpdateModelIf.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER
 * THE TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF
 * THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of
 * the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceUpdateModel.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.samba.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.*;

import org.sblim.wbemsmt.exception.WbemsmtException;

/*
 * * This is the interface containing only the updateModel-Methods for the delegate
 */

public interface SambaCimAdapterUpdateModelIf extends UpdateModelDelegatee {

    public static final String[] RESOURCE_BUNDLE_NAMES = new String[] { "messages", "messagesSamba" };

    /** 
     * UpdateModel-Methods
     **/
    public void updateModelImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage1 container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.samba.bl.container.printer.PrinterAllowHostSecurityDataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.samba.bl.container.printer.PrinterDenyHostSecurityDataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage1 container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage2 container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage3 container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage4 container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.samba.bl.container.service.ServiceAllowHostSecurityDataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.samba.bl.container.service.ServiceDenyHostDataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.samba.bl.container.service.ServiceOperationsDataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.samba.bl.container.share.ShareAllowHostSecurityDataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.samba.bl.container.share.ShareDenyHostSecurityDataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1 container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2 container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3CMD container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3GUI container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1 container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2 container)
            throws WbemsmtException;

}