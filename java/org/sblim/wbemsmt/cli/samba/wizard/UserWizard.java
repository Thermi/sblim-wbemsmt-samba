/** 
 * UserWizard.java
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
 * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/cmd/wizardClass.vm
 *
 * Contributors: 
 *   michael.bauschert@de.ibm.com
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.cli.samba.wizard;

import java.util.*;
import java.util.logging.Logger;

import org.sblim.wbemsmt.bl.adapter.DataContainer;

import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.wizard.adapter.IPageWizardAdapter;
import org.sblim.wbemsmt.tools.wizard.cli.*;
import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;
import org.sblim.wbemsmt.exception.WbemsmtException;

public class UserWizard extends CliWizardBase implements IPageWizardAdapter {

    static Logger logger = Logger.getLogger(UserWizard.class.getName());
    private org.sblim.wbemsmt.samba.wizard.UserWizardContainer container = null;

    public UserWizard(final org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter) {
        super(adapter, ResourceBundleManager.getResourceBundle(new String[] { "messages",
                "messagesSamba" }, Locale.getDefault()));
        this.container = new org.sblim.wbemsmt.samba.wizard.UserWizardContainer(adapter,
                new org.sblim.wbemsmt.samba.wizard.UserWizardContainerPanels() {
                    public Object getPage1() throws WbemsmtException {
                        DataContainer dc = new org.sblim.wbemsmt.cli.samba.container.wizard.UserWizardPage1Impl(
                                adapter);
                        return dc;
                    }

                    public Object getPage2() throws WbemsmtException {
                        DataContainer dc = new org.sblim.wbemsmt.cli.samba.container.wizard.UserWizardPage2Impl(
                                adapter);
                        return dc;
                    }

                    public Object getPage3() throws WbemsmtException {
                        DataContainer dc = new org.sblim.wbemsmt.cli.samba.container.wizard.UserWizardPage3Impl(
                                adapter);
                        return dc;
                    }
                });
        super.initialize();
        try {
            super.initWizard((IWizardContainer) container, this);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return;
        }
        logger.fine("Wizard initialized");
    }

    public void cleanUPPage(String panelName) {
        //cleanup is done in the adapter
    }

    public IWizardContainer getWizardContainer() {
        return container;
    }
}