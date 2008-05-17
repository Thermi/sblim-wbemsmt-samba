/** 
 * PrinterWizardPage3Impl.java
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

public class PrinterWizardPage3Impl extends BaseDataContainer implements
        org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage3,
        org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainerHeader {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_SeenByEverybody;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_EnableGuest;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_EnableAllUsers;
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_ForceUser;

    private java.util.List icUsers = new java.util.ArrayList();

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_SambaUserName;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_AccessTypeVI;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_AccessTypeRW;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_Admin;

    public PrinterWizardPage3Impl(AbstractBaseCimAdapter adapter) throws WbemsmtException {
        super();
        setAdapter(adapter);
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_SeenByEverybody() {
        if (ic_usr_SeenByEverybody == null) {
            String label = getAdapter().getBundle().getString("PrinterWizardPage3.seenByEverybody");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
            ic_usr_SeenByEverybody = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return ic_usr_SeenByEverybody;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_EnableGuest() {
        if (ic_usr_EnableGuest == null) {
            String label = getAdapter().getBundle().getString("PrinterWizardPage3.enableGuest");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
            ic_usr_EnableGuest = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return ic_usr_EnableGuest;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX_WITH_CLICKEVENT
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_EnableAllUsers() {
        if (ic_usr_EnableAllUsers == null) {
            String label = getAdapter().getBundle().getString("PrinterWizardPage3.enableAllUsers");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
            ic_usr_EnableAllUsers = new org.sblim.wbemsmt.tools.input.test.LabeledTestActionComponent(
                    this, label, "", converter);
        }
        return ic_usr_EnableAllUsers;
    }

    /**
     * 
     * DataType UNSIGNED_INT16
     * UIType COMBOBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_ForceUser() {
        if (ic_usr_ForceUser == null) {
            String label = getAdapter().getBundle().getString("PrinterWizardPage3.forceUser");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            ic_usr_ForceUser = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, "", converter);
        }
        return ic_usr_ForceUser;
    }

    /**
     * 
     * linked container UserInPrinterWizardACLItemDataContainer
     */
    public java.util.List getUsers() {
        return icUsers;
    }

    /**
     * Header for:
     * 
     * linked container UserInPrinterWizardACLItemDataContainer
     */
    public org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainerHeader getUsersHeader() {
        return this;
    }

    /**
     * Header for field SambaUserName
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_SambaUserName() {
        if (icUsersHeader_SambaUserName == null) {
            String label = getAdapter().getBundle().getString(
                    "UserInPrinterWizardACLItemDataContainer.SambaUserName");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icUsersHeader_SambaUserName = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icUsersHeader_SambaUserName;
    }

    /**
     * Header for field accessTypeVI
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_AccessTypeVI() {
        if (icUsersHeader_usr_AccessTypeVI == null) {
            String label = getAdapter().getBundle().getString(
                    "UserInPrinterWizardACLItemDataContainer.accessTypeVI");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            icUsersHeader_usr_AccessTypeVI = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, "", converter);
        }
        return icUsersHeader_usr_AccessTypeVI;
    }

    /**
     * Header for field accessTypeRW
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_AccessTypeRW() {
        if (icUsersHeader_usr_AccessTypeRW == null) {
            String label = getAdapter().getBundle().getString(
                    "UserInPrinterWizardACLItemDataContainer.accessTypeRW");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            icUsersHeader_usr_AccessTypeRW = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, "", converter);
        }
        return icUsersHeader_usr_AccessTypeRW;
    }

    /**
     * Header for field admin
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_Admin() {
        if (icUsersHeader_usr_Admin == null) {
            String label = getAdapter().getBundle().getString(
                    "UserInPrinterWizardACLItemDataContainer.admin");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
            icUsersHeader_usr_Admin = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icUsersHeader_usr_Admin;
    }

    public void trace(java.io.PrintWriter printStream, String listOptions, boolean title) {
        if (title) {
            printStream.println(getAdapter().getBundle().getString("PrinterWizardPage3.caption"));
        }

        if (showKey(listOptions)) {
            String key = getKey() != null ? getKey().toString() : "-";
            printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
        }

        if (showInstance(listOptions)) {
            if (get_usr_SeenByEverybody().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_SeenByEverybody())
                        .getValue();
                printStream.println(get_usr_SeenByEverybody().getLabelText() + ": " + value);
            }
            if (get_usr_EnableGuest().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_EnableGuest())
                        .getValue();
                printStream.println(get_usr_EnableGuest().getLabelText() + ": " + value);
            }
            if (get_usr_EnableAllUsers().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_EnableAllUsers())
                        .getValue();
                printStream.println(get_usr_EnableAllUsers().getLabelText() + ": " + value);
            }
            if (get_usr_ForceUser().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_ForceUser())
                        .getValue();
                printStream.println(get_usr_ForceUser().getLabelText() + ": " + value);
            }
        }

        if (showChilds(listOptions)) {
            traceChilds(printStream, listOptions, title);
        }
    }

    public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title) {
        List listusers = getUsers();
        printStream.println();
        printStream.println(getAdapter().getBundle().getString("PrinterWizardPage3.role.users")
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
        fields.add(get_usr_SeenByEverybody());
        fields.add(get_usr_EnableGuest());
        fields.add(get_usr_EnableAllUsers());
        fields.add(get_usr_ForceUser());
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
        PrinterWizardPage3Impl source = (PrinterWizardPage3Impl) sourceContainer;

        get_usr_SeenByEverybody().setValue(source.get_usr_SeenByEverybody().getValue());
        get_usr_EnableGuest().setValue(source.get_usr_EnableGuest().getValue());
        get_usr_EnableAllUsers().setValue(source.get_usr_EnableAllUsers().getValue());
        get_usr_ForceUser().setValue(source.get_usr_ForceUser().getValue());

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