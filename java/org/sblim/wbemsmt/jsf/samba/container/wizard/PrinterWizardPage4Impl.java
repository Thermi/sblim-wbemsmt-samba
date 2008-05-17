/** 
 * PrinterWizardPage4Impl.java
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
 * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/jsf/containerImpl.vm
 *
 * Contributors: 
 *   michael.bauschert@de.ibm.com
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.jsf.samba.container.wizard;

import org.sblim.wbemsmt.exception.*;
import java.util.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class PrinterWizardPage4Impl extends org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel
        implements org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage4 {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_CupsOptions;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_PrintCommand;

    public PrinterWizardPage4Impl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,
            String bindingPrefix) throws WbemsmtException {

        super(adapter, bindingPrefix, "PrinterWizardPage4.caption", "PrinterWizardPage4.subTitle",
                false);

        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_CupsOptions());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_PrintCommand());

        setFooter(getPanelForCustomLayout(), "PrinterWizardPage4.footerText");
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_CupsOptions() {
        if (ic_CupsOptions == null) {
            String label = bundle.getString("PrinterWizardPage4.CupsOptions");
            String binding = bindingPrefix + "_CupsOptions.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_CupsOptions = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_CupsOptions;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_PrintCommand() {
        if (ic_PrintCommand == null) {
            String label = bundle.getString("PrinterWizardPage4.PrintCommand");
            String binding = bindingPrefix + "_PrintCommand.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_PrintCommand = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_PrintCommand;
    }

    public void reload() {
        super.reload();
        if (ic_CupsOptions != null) {
            ic_CupsOptions.setLabelText(bundle.getString("PrinterWizardPage4.CupsOptions"));
        }
        if (ic_PrintCommand != null) {
            ic_PrintCommand.setLabelText(bundle.getString("PrinterWizardPage4.PrintCommand"));
        }
    }

    public String[] getResourceBundleNames() {
        return new String[] { "messages", "messagesSamba" };
    }

    public void countAndCreateChildren() throws WbemsmtException {

    }

    /**
     * count and create childrens
     * @throws WbemsmtException
     */
    public void updateControls() throws WbemsmtException {
        countAndCreateChildren();
        adapter.updateControls(this);

    }

    /**
     * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
     * @return
     */
    public List getFields() {
        List fields = new ArrayList();
        fields.add(get_CupsOptions());
        fields.add(get_PrintCommand());
        return fields;
    }

    /**
     * Return a list of all associated childContainers. A childContainer is a DataContainer
     * @return
     */
    public List getChildContainers() {
        List childs = new ArrayList();
        return childs;

    }

    public void copyFrom(DataContainer sourceContainer) throws WbemsmtException {
        PrinterWizardPage4Impl source = (PrinterWizardPage4Impl) sourceContainer;

        get_CupsOptions().setValue(source.get_CupsOptions().getValue());
        get_PrintCommand().setValue(source.get_PrintCommand().getValue());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }

}