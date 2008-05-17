/** 
 * PrinterWizardContainer.java
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
 * @author: org.sblim.wbemsmt.dcg.generator.WizardGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/wizardContainer.vm
 *
 * Contributors: 
 *   michael.bauschert@de.ibm.com
 * 
 * Description: WizardContainer for 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.samba.wizard;

import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Logger;

import org.sblim.wbemsmt.tools.wizard.WizardStepList;
import org.sblim.wbemsmt.tools.wizard.container.AbstractWizardContainerBase;
import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;

public class PrinterWizardContainer extends AbstractWizardContainerBase implements IWizardContainer {

    org.sblim.wbemsmt.tools.wizard.WizardContainerUtil util = new PrinterWizardContainerUtil();
    static Logger logger = Logger.getLogger(PrinterWizardContainer.class.getName());

    public static final String WIZARD_PANEL_PAGE1 = "page1";
    public static final String WIZARD_PANEL_PAGE2 = "page2";
    public static final String WIZARD_PANEL_PAGE3 = "page3";
    public static final String WIZARD_PANEL_PAGE4 = "page4";
    public static final String WIZARD_PANEL_PAGE5 = "page5";

    private final PrinterWizardContainerPanels panels;

    public PrinterWizardContainer(AbstractBaseCimAdapter adapter,
            PrinterWizardContainerPanels panels) {
        super(adapter);
        this.panels = panels;
        hmPages = new HashMap();
        stepList = new WizardStepList();
    }

    public void initWizardContainer() throws WbemsmtException {
        logger.fine("initWizardContainer");

        hmPages.put(WIZARD_PANEL_PAGE1, panels.getPage1());
        hmPages.put(WIZARD_PANEL_PAGE2, panels.getPage2());
        hmPages.put(WIZARD_PANEL_PAGE3, panels.getPage3());
        hmPages.put(WIZARD_PANEL_PAGE4, panels.getPage4());
        hmPages.put(WIZARD_PANEL_PAGE5, panels.getPage5());
        util.addInitialWizardSteps(this, stepList, hmPages);
    }

    public String getNextWizardPageName() {
        String nextPanelName = util.getNextPanel(getCurrentPageName(), hmPages);
        util.updateWizardStepList(nextPanelName, stepList);
        return nextPanelName;
    }

    public boolean isLast(String pageName) {
        if (pageName.equals(WIZARD_PANEL_PAGE5)) {
            return true;
        }
        else
            return false;
    }

    public boolean isFirst(String pageName) {
        if (pageName.equals(WIZARD_PANEL_PAGE1)) {
            return true;
        }
        else
            return false;
    }

    public void cleanUP(String pageName) {
        //cleanup is done in the adapter
    }

    public boolean isValid(String propertyName, Object value, Vector result) {
        //validation is done in the adapter
        return true;
    }

    protected void buildSummaryText() {
        //wizard has no summary - fields are updated in the adapter
    }

    public void postWizardFinish() {

    }

    public void preWizardFinish() throws Exception {

    }

    public Object getPage(String actualPanelName) throws WbemsmtException {

        if (WIZARD_PANEL_PAGE1.equals(actualPanelName)) {
            return panels.getPage1();
        }
        if (WIZARD_PANEL_PAGE2.equals(actualPanelName)) {
            return panels.getPage2();
        }
        if (WIZARD_PANEL_PAGE3.equals(actualPanelName)) {
            return panels.getPage3();
        }
        if (WIZARD_PANEL_PAGE4.equals(actualPanelName)) {
            return panels.getPage4();
        }
        if (WIZARD_PANEL_PAGE5.equals(actualPanelName)) {
            return panels.getPage5();
        }

        throw new WbemsmtException(WbemsmtException.ERR_WIZARD_LOGIC, "For WizardPage "
                + actualPanelName + " no Implementation was found");
    }

}