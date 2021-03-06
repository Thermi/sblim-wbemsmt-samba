/**
 * SambaCimAdapterInitWizardIf.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE
 * TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS
 * FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the
 * Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceInitWizard.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.samba.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.*;

import org.sblim.wbemsmt.exception.WbemsmtException;

/*
 * * This is the interface containing only the initWizard-Methods for the delegate
 */

public interface SambaCimAdapterInitWizardIf extends InitWizardDelegatee {

    public static final String[] RESOURCE_BUNDLE_NAMES = new String[] { "messages", "messagesSamba" };

    /** 
     * UpdateControls-Methods
     **/

    public void initWizardImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage1 container,
            org.sblim.wbemsmt.samba.wizard.HostWizardContainer wizardContainer,
            String currentPagename) throws WbemsmtException;

    public void initWizardImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage1 container,
            org.sblim.wbemsmt.samba.wizard.PrinterWizardContainer wizardContainer,
            String currentPagename) throws WbemsmtException;

    public void initWizardImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1 container,
            org.sblim.wbemsmt.samba.wizard.ShareWizardContainer wizardContainer,
            String currentPagename) throws WbemsmtException;

    public void initWizardImpl(
            org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1 container,
            org.sblim.wbemsmt.samba.wizard.UserWizardContainer wizardContainer,
            String currentPagename) throws WbemsmtException;
}