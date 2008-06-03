/** 
 * UserWizardPage2Impl.java
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
 * @template: org/sblim/wbemsmt/dcg/templates/cmd/containerImpl.vm
 *
 * Contributors: 
 *   michael.bauschert@de.ibm.com
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.cli.samba.container.wizard;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class UserWizardPage2Impl extends BaseDataContainer implements
        org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2,
        org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainerHeader,
        org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainerHeader {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_AccessToAll;

    private java.util.List icShares = new java.util.ArrayList();

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_ShareName;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_usr_AccessTypeVI;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_usr_AccessTypeRW;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_usr_Admin;

    private java.util.List icPrinters = new java.util.ArrayList();

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_PrinterName;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_usr_AccessTypeVI;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_usr_AccessTypeRW;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_usr_Admin;

    public UserWizardPage2Impl(AbstractBaseCimAdapter adapter) throws WbemsmtException {
        super();
        setAdapter(adapter);
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX_WITH_CLICKEVENT
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_AccessToAll() {
        if (ic_usr_AccessToAll == null) {
            String label = getAdapter().getBundle().getString("UserWizardPage2.accessToAll");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
            ic_usr_AccessToAll = new org.sblim.wbemsmt.tools.input.test.LabeledTestActionComponent(
                    this, label, null, converter);
        }
        return ic_usr_AccessToAll;
    }

    /**
     * 
     * linked container ShareInUserWizardACLItemDataContainer
     */
    public java.util.List getShares() {
        return icShares;
    }

    /**
     * Header for:
     * 
     * linked container ShareInUserWizardACLItemDataContainer
     */
    public org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainerHeader getSharesHeader() {
        return this;
    }

    /**
     * Header for field shareName
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_ShareName() {
        if (icSharesHeader_ShareName == null) {
            String label = getAdapter().getBundle().getString(
                    "ShareInUserWizardACLItemDataContainer.shareName");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icSharesHeader_ShareName = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icSharesHeader_ShareName;
    }

    /**
     * Header for field accessTypeVI
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_usr_AccessTypeVI() {
        if (icSharesHeader_usr_AccessTypeVI == null) {
            String label = getAdapter().getBundle().getString(
                    "ShareInUserWizardACLItemDataContainer.accessTypeVI");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            icSharesHeader_usr_AccessTypeVI = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, "", converter);
        }
        return icSharesHeader_usr_AccessTypeVI;
    }

    /**
     * Header for field accessTypeRW
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_usr_AccessTypeRW() {
        if (icSharesHeader_usr_AccessTypeRW == null) {
            String label = getAdapter().getBundle().getString(
                    "ShareInUserWizardACLItemDataContainer.accessTypeRW");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            icSharesHeader_usr_AccessTypeRW = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, "", converter);
        }
        return icSharesHeader_usr_AccessTypeRW;
    }

    /**
     * Header for field admin
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_usr_Admin() {
        if (icSharesHeader_usr_Admin == null) {
            String label = getAdapter().getBundle().getString(
                    "ShareInUserWizardACLItemDataContainer.admin");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
            icSharesHeader_usr_Admin = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icSharesHeader_usr_Admin;
    }

    /**
     * 
     * linked container PrinterInUserWizardACLItemDataContainer
     */
    public java.util.List getPrinters() {
        return icPrinters;
    }

    /**
     * Header for:
     * 
     * linked container PrinterInUserWizardACLItemDataContainer
     */
    public org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainerHeader getPrintersHeader() {
        return this;
    }

    /**
     * Header for field PrinterName
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_PrinterName() {
        if (icPrintersHeader_PrinterName == null) {
            String label = getAdapter().getBundle().getString(
                    "PrinterInUserWizardACLItemDataContainer.PrinterName");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icPrintersHeader_PrinterName = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icPrintersHeader_PrinterName;
    }

    /**
     * Header for field accessTypeVI
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_usr_AccessTypeVI() {
        if (icPrintersHeader_usr_AccessTypeVI == null) {
            String label = getAdapter().getBundle().getString(
                    "PrinterInUserWizardACLItemDataContainer.accessTypeVI");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            icPrintersHeader_usr_AccessTypeVI = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, "", converter);
        }
        return icPrintersHeader_usr_AccessTypeVI;
    }

    /**
     * Header for field accessTypeRW
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_usr_AccessTypeRW() {
        if (icPrintersHeader_usr_AccessTypeRW == null) {
            String label = getAdapter().getBundle().getString(
                    "PrinterInUserWizardACLItemDataContainer.accessTypeRW");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            icPrintersHeader_usr_AccessTypeRW = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, "", converter);
        }
        return icPrintersHeader_usr_AccessTypeRW;
    }

    /**
     * Header for field admin
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_usr_Admin() {
        if (icPrintersHeader_usr_Admin == null) {
            String label = getAdapter().getBundle().getString(
                    "PrinterInUserWizardACLItemDataContainer.admin");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
            icPrintersHeader_usr_Admin = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icPrintersHeader_usr_Admin;
    }

    public void trace(java.io.PrintWriter printStream, String listOptions, boolean title) {
        if (title) {
            printStream.println(getAdapter().getBundle().getString("UserWizardPage2.caption"));
        }

        if (showKey(listOptions)) {
            String key = getKey() != null ? getKey().toString() : "-";
            printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
        }

        if (showInstance(listOptions)) {
            if (get_usr_AccessToAll().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_AccessToAll())
                        .getValue();
                printStream.println(get_usr_AccessToAll().getLabelText() + ": " + value);
            }
        }

        if (showChilds(listOptions)) {
            traceChilds(printStream, listOptions, title);
        }
    }

    public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title) {
        List listshares = getShares();
        printStream.println();
        printStream.println(getAdapter().getBundle().getString("UserWizardPage2.role.shares")
                + " "
                + getAdapter().getBundle().getString("items.found",
                        new Object[] { new Integer(listshares.size()) }));
        for (int i = 0; i < listshares.size(); i++) {
            BaseDataContainer child = (BaseDataContainer) listshares.get(i);
            printStream.println();
            printStream.println(getAdapter().getBundle().getString("item") + ": " + (i + 1) + " "
                    + getAdapter().getBundle().getString("of") + " " + listshares.size());
            child.trace(printStream, listOptions, false);
        }
        List listprinters = getPrinters();
        printStream.println();
        printStream.println(getAdapter().getBundle().getString("UserWizardPage2.role.printers")
                + " "
                + getAdapter().getBundle().getString("items.found",
                        new Object[] { new Integer(listprinters.size()) }));
        for (int i = 0; i < listprinters.size(); i++) {
            BaseDataContainer child = (BaseDataContainer) listprinters.get(i);
            printStream.println();
            printStream.println(getAdapter().getBundle().getString("item") + ": " + (i + 1) + " "
                    + getAdapter().getBundle().getString("of") + " " + listprinters.size());
            child.trace(printStream, listOptions, false);
        }

    }

    /**
     * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
     * @return
     */
    public List getFields() {
        List fields = new ArrayList();
        fields.add(get_usr_AccessToAll());
        return fields;
    }

    /**
     * Return a list of all associated childContainers. A childContainer is a DataContainer
     * @return
     */
    public List getChildContainers() {
        List childs = new ArrayList();
        childs.addAll(getShares());
        childs.addAll(getPrinters());
        return childs;

    }

    public void copyFrom(DataContainer sourceContainer) throws WbemsmtException {
        UserWizardPage2Impl source = (UserWizardPage2Impl) sourceContainer;

        get_usr_AccessToAll().copyFrom(source.get_usr_AccessToAll());

        List targetListForShares = (List) getShares();
        List sourceListForShares = (List) source.getShares();
        if (sourceListForShares.size() != targetListForShares.size()) {
            throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                    "The Lists are not from same size. Source is " + sourceListForShares.size()
                            + " and target is " + targetListForShares.size());
        }
        for (int ii = 0; ii < sourceListForShares.size(); ii++) {
            ((DataContainer) targetListForShares.get(ii))
                    .copyFrom(((DataContainer) sourceListForShares.get(ii)));
        }

        List targetListForPrinters = (List) getPrinters();
        List sourceListForPrinters = (List) source.getPrinters();
        if (sourceListForPrinters.size() != targetListForPrinters.size()) {
            throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                    "The Lists are not from same size. Source is " + sourceListForPrinters.size()
                            + " and target is " + targetListForPrinters.size());
        }
        for (int ii = 0; ii < sourceListForPrinters.size(); ii++) {
            ((DataContainer) targetListForPrinters.get(ii))
                    .copyFrom(((DataContainer) sourceListForPrinters.get(ii)));
        }

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }
}