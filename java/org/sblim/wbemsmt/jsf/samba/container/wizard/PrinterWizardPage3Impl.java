/** 
 * PrinterWizardPage3Impl.java
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

//imports for that field of a linked container with occurence = MANY
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class PrinterWizardPage3Impl extends org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel
        implements org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage3,
        org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainerHeader {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_SeenByEverybody;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_EnableGuest;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_EnableAllUsers;
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_ForceUser;

    private java.util.List icUsers = new java.util.ArrayList();

    private MultiLinePanel usersPanel;
    private int usersCount;

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_SambaUserName;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_AccessTypeVI;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_AccessTypeRW;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_Admin;

    public PrinterWizardPage3Impl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,
            String bindingPrefix) throws WbemsmtException {

        super(adapter, bindingPrefix, "PrinterWizardPage3.caption", "PrinterWizardPage3.subTitle",
                false);

        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_SeenByEverybody());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_EnableGuest());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_EnableAllUsers());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_ForceUser());

        setFooter(getPanelForCustomLayout(), "PrinterWizardPage3.footerText");
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
            String label = bundle.getString("PrinterWizardPage3.seenByEverybody");
            String binding = bindingPrefix + "_usr_SeenByEverybody.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_SeenByEverybody = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
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
            String label = bundle.getString("PrinterWizardPage3.enableGuest");
            String binding = bindingPrefix + "_usr_EnableGuest.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_EnableGuest = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
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
            String label = bundle.getString("PrinterWizardPage3.enableAllUsers");
            String binding = bindingPrefix + "_usr_EnableAllUsers.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_EnableAllUsers = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxActionComponent(
                    parent, label, binding, converter, readOnly);
            ;
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
            String label = bundle.getString("PrinterWizardPage3.forceUser");
            String binding = bindingPrefix + "_usr_ForceUser.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
            boolean readOnly = false;
            ic_usr_ForceUser = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFComboBoxComponent(
                    parent, label, binding, converter, readOnly);
            ;
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

    public MultiLinePanel getUsersPanel() {
        if (usersPanel == null) {
            usersPanel = new UsersPanel(adapter,
                    bindingPrefix, // the prefix for binding values
                    "#{" + bindingPrefix + "usersPanel", // binding for Title
                    "UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage3.caption", //Key for title
                    org.sblim.wbemsmt.jsf.samba.container.wizard.UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage3Impl.COLS);
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
            return org.sblim.wbemsmt.jsf.samba.container.wizard.UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage3Impl.orientationOfColumnAsCss[column];
        }
    }

    private void addUsers(
            org.sblim.wbemsmt.jsf.samba.container.wizard.UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage3Impl child) {

        getUsers().add(child);
        getUsersPanel().addComponents(child.getComponents());

        //((LabeledJSFInputComponent)getUsers_SambaUserNameHeader()).getDependentChildFields().add(child.get_SambaUserName());
        //((LabeledJSFInputComponent)getUsers_usr_AccessTypeVIHeader()).getDependentChildFields().add(child.get_usr_AccessTypeVI());
        //((LabeledJSFInputComponent)getUsers_usr_AccessTypeRWHeader()).getDependentChildFields().add(child.get_usr_AccessTypeRW());
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
                org.sblim.wbemsmt.jsf.samba.container.wizard.UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage3Impl item = new org.sblim.wbemsmt.jsf.samba.container.wizard.UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage3Impl(
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
                (LabeledJSFInputComponent) getUsersHeader_SambaUserName(),
                (LabeledJSFInputComponent) getUsersHeader_usr_AccessTypeVI(),
                (LabeledJSFInputComponent) getUsersHeader_usr_AccessTypeRW(),
                (LabeledJSFInputComponent) getUsersHeader_usr_Admin(), };
    }

    private String[] getUsersFieldNames() {
        return new String[] { "_SambaUserName", "_usr_AccessTypeVI", "_usr_AccessTypeRW",
                "_usr_Admin", };
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
            String label = bundle
                    .getString("UserInPrinterWizardACLItemDataContainer.SambaUserName");
            String binding = bindingPrefix + "usersHeader_SambaUserName.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = true;
            icUsersHeader_SambaUserName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icUsersHeader_SambaUserName)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icUsersHeader_SambaUserName)
                .setHeader(true);

        return icUsersHeader_SambaUserName;
    }

    /**
     * Header for field accessTypeVI
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_AccessTypeVI() {
        if (icUsersHeader_usr_AccessTypeVI == null) {
            String label = bundle.getString("UserInPrinterWizardACLItemDataContainer.accessTypeVI");
            String binding = bindingPrefix + "usersHeader_usr_AccessTypeVI.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
            boolean readOnly = false;
            icUsersHeader_usr_AccessTypeVI = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent) icUsersHeader_usr_AccessTypeVI)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent) icUsersHeader_usr_AccessTypeVI)
                .setHeader(true);

        return icUsersHeader_usr_AccessTypeVI;
    }

    /**
     * Header for field accessTypeRW
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_AccessTypeRW() {
        if (icUsersHeader_usr_AccessTypeRW == null) {
            String label = bundle.getString("UserInPrinterWizardACLItemDataContainer.accessTypeRW");
            String binding = bindingPrefix + "usersHeader_usr_AccessTypeRW.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
            boolean readOnly = false;
            icUsersHeader_usr_AccessTypeRW = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent) icUsersHeader_usr_AccessTypeRW)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent) icUsersHeader_usr_AccessTypeRW)
                .setHeader(true);

        return icUsersHeader_usr_AccessTypeRW;
    }

    /**
     * Header for field admin
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_Admin() {
        if (icUsersHeader_usr_Admin == null) {
            String label = bundle.getString("UserInPrinterWizardACLItemDataContainer.admin");
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
        if (ic_usr_SeenByEverybody != null) {
            ic_usr_SeenByEverybody.setLabelText(bundle
                    .getString("PrinterWizardPage3.seenByEverybody"));
        }
        if (ic_usr_EnableGuest != null) {
            ic_usr_EnableGuest.setLabelText(bundle.getString("PrinterWizardPage3.enableGuest"));
        }
        if (ic_usr_EnableAllUsers != null) {
            ic_usr_EnableAllUsers.setLabelText(bundle
                    .getString("PrinterWizardPage3.enableAllUsers"));
        }
        if (ic_usr_ForceUser != null) {
            ic_usr_ForceUser.setLabelText(bundle.getString("PrinterWizardPage3.forceUser"));
        }
    }

    public String[] getResourceBundleNames() {
        return new String[] { "messages", "messagesSamba" };
    }

    public void countAndCreateChildren() throws WbemsmtException {

        try {
            int count = adapter
                    .count(
                            "users",
                            org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainer.class,
                            this);
            if (count != usersCount) {
                usersCount = count;
                clearUsers();
                for (int i = 0; i < count; i++) {
                    addUsers(new org.sblim.wbemsmt.jsf.samba.container.wizard.UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage3Impl(
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

        get_usr_SeenByEverybody().copyFrom(source.get_usr_SeenByEverybody());
        get_usr_EnableGuest().copyFrom(source.get_usr_EnableGuest());
        get_usr_EnableAllUsers().copyFrom(source.get_usr_EnableAllUsers());
        get_usr_ForceUser().copyFrom(source.get_usr_ForceUser());

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