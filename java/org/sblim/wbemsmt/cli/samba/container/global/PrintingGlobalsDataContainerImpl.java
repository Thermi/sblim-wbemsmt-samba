/** 
 * PrintingGlobalsDataContainerImpl.java
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
 * Description: Container for Global printer settings
 * 
 * generated Class
 */

package org.sblim.wbemsmt.cli.samba.container.global;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class PrintingGlobalsDataContainerImpl extends BaseDataContainer implements
        org.sblim.wbemsmt.samba.bl.container.global.PrintingGlobalsDataContainer,
        org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobalsHeader {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_PrintcapCacheTime;
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_SystemPrinterName;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_CupsOptions;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DefaultDevMode;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_MaxPrintjobs;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_MaxReportedPrintjobs;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_PrintCommand;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_UseClientDriver;

    private java.util.List icUsers = new java.util.ArrayList();

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_SambaUserName;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_Admin;

    public PrintingGlobalsDataContainerImpl(AbstractBaseCimAdapter adapter) throws WbemsmtException {
        super();
        setAdapter(adapter);
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType UNSIGNED_INT64
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_PrintcapCacheTime() {
        if (ic_PrintcapCacheTime == null) {
            String label = getAdapter().getBundle().getString(
                    "PrintingGlobalsDataContainer.PrintcapCacheTime");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt64StringConverter();
            ic_PrintcapCacheTime = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_PrintcapCacheTime;
    }

    /**
     * 
     * DataType UNSIGNED_INT16
     * UIType COMBOBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_SystemPrinterName() {
        if (ic_usr_SystemPrinterName == null) {
            String label = getAdapter().getBundle().getString(
                    "PrintingGlobalsDataContainer.SystemPrinterName");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            ic_usr_SystemPrinterName = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, null, converter);
        }
        return ic_usr_SystemPrinterName;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_CupsOptions() {
        if (ic_CupsOptions == null) {
            String label = getAdapter().getBundle().getString(
                    "PrintingGlobalsDataContainer.CupsOptions");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_CupsOptions = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,
                    label, null, converter);
        }
        return ic_CupsOptions;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DefaultDevMode() {
        if (ic_DefaultDevMode == null) {
            String label = getAdapter().getBundle().getString(
                    "PrintingGlobalsDataContainer.DefaultDevMode");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
            ic_DefaultDevMode = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_DefaultDevMode;
    }

    /**
     * 
     * DataType UNSIGNED_INT64
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_MaxPrintjobs() {
        if (ic_MaxPrintjobs == null) {
            String label = getAdapter().getBundle().getString(
                    "PrintingGlobalsDataContainer.MaxPrintjobs");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt64StringConverter();
            ic_MaxPrintjobs = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_MaxPrintjobs;
    }

    /**
     * 
     * DataType UNSIGNED_INT64
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_MaxReportedPrintjobs() {
        if (ic_MaxReportedPrintjobs == null) {
            String label = getAdapter().getBundle().getString(
                    "PrintingGlobalsDataContainer.MaxReportedPrintjobs");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt64StringConverter();
            ic_MaxReportedPrintjobs = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_MaxReportedPrintjobs;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_PrintCommand() {
        if (ic_PrintCommand == null) {
            String label = getAdapter().getBundle().getString(
                    "PrintingGlobalsDataContainer.PrintCommand");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_PrintCommand = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_PrintCommand;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_UseClientDriver() {
        if (ic_UseClientDriver == null) {
            String label = getAdapter().getBundle().getString(
                    "PrintingGlobalsDataContainer.UseClientDriver");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
            ic_UseClientDriver = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_UseClientDriver;
    }

    /**
     * 
     * linked container AdminUsersInPrinterGlobals
     */
    public java.util.List getUsers() {
        return icUsers;
    }

    /**
     * Header for:
     * 
     * linked container AdminUsersInPrinterGlobals
     */
    public org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobalsHeader getUsersHeader() {
        return this;
    }

    /**
     * Header for field SambaUserName
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_SambaUserName() {
        if (icUsersHeader_usr_SambaUserName == null) {
            String label = getAdapter().getBundle().getString(
                    "AdminUsersInPrinterGlobals.SambaUserName");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icUsersHeader_usr_SambaUserName = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icUsersHeader_usr_SambaUserName;
    }

    /**
     * Header for field admin
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_Admin() {
        if (icUsersHeader_usr_Admin == null) {
            String label = getAdapter().getBundle().getString("AdminUsersInPrinterGlobals.admin");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
            icUsersHeader_usr_Admin = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icUsersHeader_usr_Admin;
    }

    public void trace(java.io.PrintWriter printStream, String listOptions, boolean title) {
        if (title) {
            printStream.println(getAdapter().getBundle().getString(
                    "PrintingGlobalsDataContainer.caption"));
        }

        if (showKey(listOptions)) {
            String key = getKey() != null ? getKey().toString() : "-";
            printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
        }

        if (showInstance(listOptions)) {
            if (get_PrintcapCacheTime().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_PrintcapCacheTime())
                        .getValue();
                printStream.println(get_PrintcapCacheTime().getLabelText() + ": " + value);
            }
            if (get_usr_SystemPrinterName().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_SystemPrinterName())
                        .getValue();
                printStream.println(get_usr_SystemPrinterName().getLabelText() + ": " + value);
            }
            if (get_CupsOptions().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_CupsOptions())
                        .getValue();
                printStream.println(get_CupsOptions().getLabelText() + ": " + value);
            }
            if (get_DefaultDevMode().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_DefaultDevMode())
                        .getValue();
                printStream.println(get_DefaultDevMode().getLabelText() + ": " + value);
            }
            if (get_MaxPrintjobs().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_MaxPrintjobs())
                        .getValue();
                printStream.println(get_MaxPrintjobs().getLabelText() + ": " + value);
            }
            if (get_MaxReportedPrintjobs().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_MaxReportedPrintjobs())
                        .getValue();
                printStream.println(get_MaxReportedPrintjobs().getLabelText() + ": " + value);
            }
            if (get_PrintCommand().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_PrintCommand())
                        .getValue();
                printStream.println(get_PrintCommand().getLabelText() + ": " + value);
            }
            if (get_UseClientDriver().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_UseClientDriver())
                        .getValue();
                printStream.println(get_UseClientDriver().getLabelText() + ": " + value);
            }
        }

        if (showChilds(listOptions)) {
            traceChilds(printStream, listOptions, title);
        }
    }

    public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title) {
        List listusers = getUsers();
        printStream.println();
        printStream.println(getAdapter().getBundle().getString(
                "PrintingGlobalsDataContainer.role.users")
                + " "
                + getAdapter().getBundle().getString("items.found",
                        new Object[] { new Integer(listusers.size()) }));
        for (int i = 0; i < listusers.size(); i++) {
            BaseDataContainer child = (BaseDataContainer) listusers.get(i);
            printStream.println();
            printStream.println(getAdapter().getBundle().getString("item") + ": " + (i + 1) + " "
                    + getAdapter().getBundle().getString("of") + " " + listusers.size());
            child.trace(printStream, listOptions, false);
        }

    }

    /**
     * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
     * @return
     */
    public List getFields() {
        List fields = new ArrayList();
        fields.add(get_PrintcapCacheTime());
        fields.add(get_usr_SystemPrinterName());
        fields.add(get_CupsOptions());
        fields.add(get_DefaultDevMode());
        fields.add(get_MaxPrintjobs());
        fields.add(get_MaxReportedPrintjobs());
        fields.add(get_PrintCommand());
        fields.add(get_UseClientDriver());
        return fields;
    }

    /**
     * Return a list of all associated childContainers. A childContainer is a DataContainer
     * @return
     */
    public List getChildContainers() {
        List childs = new ArrayList();
        childs.addAll(getUsers());
        return childs;

    }

    public void copyFrom(DataContainer sourceContainer) throws WbemsmtException {
        PrintingGlobalsDataContainerImpl source = (PrintingGlobalsDataContainerImpl) sourceContainer;

        get_PrintcapCacheTime().copyFrom(source.get_PrintcapCacheTime());
        get_usr_SystemPrinterName().copyFrom(source.get_usr_SystemPrinterName());
        get_CupsOptions().copyFrom(source.get_CupsOptions());
        get_DefaultDevMode().copyFrom(source.get_DefaultDevMode());
        get_MaxPrintjobs().copyFrom(source.get_MaxPrintjobs());
        get_MaxReportedPrintjobs().copyFrom(source.get_MaxReportedPrintjobs());
        get_PrintCommand().copyFrom(source.get_PrintCommand());
        get_UseClientDriver().copyFrom(source.get_UseClientDriver());

        List targetListForUsers = (List) getUsers();
        List sourceListForUsers = (List) source.getUsers();
        if (sourceListForUsers.size() != targetListForUsers.size()) {
            throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                    "The Lists are not from same size. Source is " + sourceListForUsers.size()
                            + " and target is " + targetListForUsers.size());
        }
        for (int ii = 0; ii < sourceListForUsers.size(); ii++) {
            ((DataContainer) targetListForUsers.get(ii))
                    .copyFrom(((DataContainer) sourceListForUsers.get(ii)));
        }

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }
}