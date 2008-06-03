/** 
 * PrintingGlobalsDataContainerImpl.java
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
 * Description: Container for Global printer settings
 * 
 * generated Class
 */

package org.sblim.wbemsmt.jsf.samba.container.global;

import org.sblim.wbemsmt.exception.*;
import java.util.*;

//imports for that field of a linked container with occurence = MANY
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class PrintingGlobalsDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel
        implements org.sblim.wbemsmt.samba.bl.container.global.PrintingGlobalsDataContainer,
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

    private MultiLinePanel usersPanel;
    private int usersCount;

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_SambaUserName;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_Admin;

    public PrintingGlobalsDataContainerImpl(
            org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter, String bindingPrefix)
            throws WbemsmtException {

        super(adapter, bindingPrefix, "PrintingGlobalsDataContainer.caption", false);

        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_PrintcapCacheTime());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_SystemPrinterName());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_CupsOptions());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_DefaultDevMode());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_MaxPrintjobs());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_MaxReportedPrintjobs());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_PrintCommand());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_UseClientDriver());

        setFooter(getPanelForCustomLayout(), "PrintingGlobalsDataContainer.footerText");
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
            String label = bundle.getString("PrintingGlobalsDataContainer.PrintcapCacheTime");
            String binding = bindingPrefix + "_PrintcapCacheTime.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt64StringConverter();
            boolean readOnly = false;
            ic_PrintcapCacheTime = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
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
            String label = bundle.getString("PrintingGlobalsDataContainer.SystemPrinterName");
            String binding = bindingPrefix + "_usr_SystemPrinterName.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
            boolean readOnly = false;
            ic_usr_SystemPrinterName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFComboBoxComponent(
                    parent, label, binding, converter, readOnly);
            ;
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
            String label = bundle.getString("PrintingGlobalsDataContainer.CupsOptions");
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
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DefaultDevMode() {
        if (ic_DefaultDevMode == null) {
            String label = bundle.getString("PrintingGlobalsDataContainer.DefaultDevMode");
            String binding = bindingPrefix + "_DefaultDevMode.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_DefaultDevMode = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
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
            String label = bundle.getString("PrintingGlobalsDataContainer.MaxPrintjobs");
            String binding = bindingPrefix + "_MaxPrintjobs.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt64StringConverter();
            boolean readOnly = false;
            ic_MaxPrintjobs = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
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
            String label = bundle.getString("PrintingGlobalsDataContainer.MaxReportedPrintjobs");
            String binding = bindingPrefix + "_MaxReportedPrintjobs.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt64StringConverter();
            boolean readOnly = false;
            ic_MaxReportedPrintjobs = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
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
            String label = bundle.getString("PrintingGlobalsDataContainer.PrintCommand");
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

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_UseClientDriver() {
        if (ic_UseClientDriver == null) {
            String label = bundle.getString("PrintingGlobalsDataContainer.UseClientDriver");
            String binding = bindingPrefix + "_UseClientDriver.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_UseClientDriver = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
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

    public MultiLinePanel getUsersPanel() {
        if (usersPanel == null) {
            usersPanel = new UsersPanel(adapter,
                    bindingPrefix, // the prefix for binding values
                    "#{" + bindingPrefix + "usersPanel", // binding for Title
                    "AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainer.caption", //Key for title
                    org.sblim.wbemsmt.jsf.samba.container.global.AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainerImpl.COLS);
            addUsersHeader();
        }

        return usersPanel;
    }

    static class UsersPanel extends MultiLinePanel {
        public UsersPanel(AbstractBaseCimAdapter adapter, String bindingPrefix,
                String bindigForTitle, String keyForTitle, int cols) {
            super(adapter, bindingPrefix, bindigForTitle, keyForTitle, "users", cols);
        }

        protected String getOrientationOfColumnAsCss(int column) {
            return org.sblim.wbemsmt.jsf.samba.container.global.AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainerImpl.orientationOfColumnAsCss[column];
        }
    }

    private void addUsers(
            org.sblim.wbemsmt.jsf.samba.container.global.AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainerImpl child) {

        getUsers().add(child);
        getUsersPanel().addComponents(child.getComponents());

        //((LabeledJSFInputComponent)getUsers_usr_SambaUserNameHeader()).getDependentChildFields().add(child.get_usr_SambaUserName());
        //((LabeledJSFInputComponent)getUsers_usr_AdminHeader()).getDependentChildFields().add(child.get_usr_Admin());
    }

    private void clearUsers() {
        getUsers().clear();
    }

    /**
     * 
     * Get the Users for the UI repesentation
     */
    public java.util.List getUsersForUI() {

        List result = new ArrayList();
        result.addAll(icUsers);

        while (result.size() < MIN_TABLE_LENGTH) {
            try {
                org.sblim.wbemsmt.jsf.samba.container.global.AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainerImpl item = new org.sblim.wbemsmt.jsf.samba.container.global.AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainerImpl(
                        (org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter) adapter,
                        bindingPrefix, result.size());
                DataContainerUtil.setVisibilityOfFields(item, false);
                result.add(item);
            }
            catch (WbemsmtException e) {
                e.printStackTrace();
            }
        }

        usersPanel.setList(result);

        return result;
    }

    /**
     * manages the style for whole footer which is displayed if there are no entries in the table or if there is a custom panel in it
     * @return
     */
    public String getUsersFooterClass() {
        return "multiLineRowHeader center "
                + (icUsers.size() == 0 || getUsersPanel().isHavingCustomFooter() ? "visible "
                        : "hidden ");
    }

    /**
     * manages the style for the label which is displayed if there are no entries in the table
     * @return
     */
    public String getUsersAvailableFooterClass() {
        return icUsers.size() > 0 ? " hidden " : " visible ";
    }

    private void addUsersHeader() {
        getUsersPanel().setHeader(getUsersHeaderComponents(), getUsersFieldNames());
    }

    private LabeledJSFInputComponent[] getUsersHeaderComponents() {
        return new LabeledJSFInputComponent[] {
                (LabeledJSFInputComponent) getUsersHeader_usr_SambaUserName(),
                (LabeledJSFInputComponent) getUsersHeader_usr_Admin(), };
    }

    private String[] getUsersFieldNames() {
        return new String[] { "_usr_SambaUserName", "_usr_Admin", };
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
            String label = bundle.getString("AdminUsersInPrinterGlobals.SambaUserName");
            String binding = bindingPrefix + "usersHeader_usr_SambaUserName.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = true;
            icUsersHeader_usr_SambaUserName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icUsersHeader_usr_SambaUserName)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icUsersHeader_usr_SambaUserName)
                .setHeader(true);

        return icUsersHeader_usr_SambaUserName;
    }

    /**
     * Header for field admin
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_Admin() {
        if (icUsersHeader_usr_Admin == null) {
            String label = bundle.getString("AdminUsersInPrinterGlobals.admin");
            String binding = bindingPrefix + "usersHeader_usr_Admin.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icUsersHeader_usr_Admin = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icUsersHeader_usr_Admin)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icUsersHeader_usr_Admin)
                .setHeader(true);

        return icUsersHeader_usr_Admin;
    }

    public void reload() {
        super.reload();
        if (ic_PrintcapCacheTime != null) {
            ic_PrintcapCacheTime.setLabelText(bundle
                    .getString("PrintingGlobalsDataContainer.PrintcapCacheTime"));
        }
        if (ic_usr_SystemPrinterName != null) {
            ic_usr_SystemPrinterName.setLabelText(bundle
                    .getString("PrintingGlobalsDataContainer.SystemPrinterName"));
        }
        if (ic_CupsOptions != null) {
            ic_CupsOptions.setLabelText(bundle
                    .getString("PrintingGlobalsDataContainer.CupsOptions"));
        }
        if (ic_DefaultDevMode != null) {
            ic_DefaultDevMode.setLabelText(bundle
                    .getString("PrintingGlobalsDataContainer.DefaultDevMode"));
        }
        if (ic_MaxPrintjobs != null) {
            ic_MaxPrintjobs.setLabelText(bundle
                    .getString("PrintingGlobalsDataContainer.MaxPrintjobs"));
        }
        if (ic_MaxReportedPrintjobs != null) {
            ic_MaxReportedPrintjobs.setLabelText(bundle
                    .getString("PrintingGlobalsDataContainer.MaxReportedPrintjobs"));
        }
        if (ic_PrintCommand != null) {
            ic_PrintCommand.setLabelText(bundle
                    .getString("PrintingGlobalsDataContainer.PrintCommand"));
        }
        if (ic_UseClientDriver != null) {
            ic_UseClientDriver.setLabelText(bundle
                    .getString("PrintingGlobalsDataContainer.UseClientDriver"));
        }
    }

    public String[] getResourceBundleNames() {
        return new String[] { "messages", "messagesSamba" };
    }

    public void countAndCreateChildren() throws WbemsmtException {

        try {
            int count = adapter.count("users",
                    org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals.class,
                    this);
            if (count != usersCount) {
                usersCount = count;
                clearUsers();
                for (int i = 0; i < count; i++) {
                    addUsers(new org.sblim.wbemsmt.jsf.samba.container.global.AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainerImpl(
                            (org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter) adapter,
                            bindingPrefix, i));
                }
            }
            getUsersPanel().setList(getUsers());
        }
        catch (WbemsmtException e) {
            throw new WbemsmtException(WbemsmtException.ERR_INIT_CONTAINER, e);
        }
    }

    /**
     * count and create childrens
     * @throws WbemsmtException
     */
    public void updateControls() throws WbemsmtException {
        countAndCreateChildren();
        adapter.updateControls(this);

        getUsersPanel().updateRows();
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