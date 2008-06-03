/** 
 * ServiceUserSecurityOptionsDataContainerImpl.java
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
 * Description: Container for defining user related security options
 * 
 * generated Class
 */

package org.sblim.wbemsmt.jsf.samba.container.service;

import org.sblim.wbemsmt.exception.*;
import java.util.*;

//imports for that field of a linked container with occurence = MANY
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class ServiceUserSecurityOptionsDataContainerImpl extends
        org.sblim.wbemsmt.tools.jsf.EditBasePanel implements
        org.sblim.wbemsmt.samba.bl.container.service.ServiceUserSecurityOptionsDataContainer,
        org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForServiceHeader {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_GuestUser;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_CurrentForceUser;
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_NewForceUser;

    private java.util.List icUserRights = new java.util.ArrayList();

    private MultiLinePanel userRightsPanel;
    private int userRightsCount;

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUserRightsHeader_SambaUserName;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUserRightsHeader_usr_AccessTypeVI;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUserRightsHeader_usr_AccessTypeRW;

    public ServiceUserSecurityOptionsDataContainerImpl(
            org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter, String bindingPrefix)
            throws WbemsmtException {

        super(adapter, bindingPrefix, "ServiceUserSecurityOptionsDataContainer.caption", false);

        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_GuestUser());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_CurrentForceUser());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_NewForceUser());

        setFooter(getPanelForCustomLayout(), "ServiceUserSecurityOptionsDataContainer.footerText");
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly true
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_GuestUser() {
        if (ic_usr_GuestUser == null) {
            String label = bundle.getString("ServiceUserSecurityOptionsDataContainer.guestUser");
            String binding = bindingPrefix + "_usr_GuestUser.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = true;
            ic_usr_GuestUser = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_GuestUser;
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly true
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_CurrentForceUser() {
        if (ic_usr_CurrentForceUser == null) {
            String label = bundle
                    .getString("ServiceUserSecurityOptionsDataContainer.currentForceUser");
            String binding = bindingPrefix + "_usr_CurrentForceUser.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = true;
            ic_usr_CurrentForceUser = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_CurrentForceUser;
    }

    /**
     * 
     * DataType UNSIGNED_INT16
     * UIType COMBOBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_NewForceUser() {
        if (ic_usr_NewForceUser == null) {
            String label = bundle.getString("ServiceUserSecurityOptionsDataContainer.newForceUser");
            String binding = bindingPrefix + "_usr_NewForceUser.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
            boolean readOnly = false;
            ic_usr_NewForceUser = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFComboBoxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_NewForceUser;
    }

    /**
     * 
     * linked container UserACLItemDataContainerForService
     */
    public java.util.List getUserRights() {
        return icUserRights;
    }

    public MultiLinePanel getUserRightsPanel() {
        if (userRightsPanel == null) {
            userRightsPanel = new UserRightsPanel(
                    adapter,
                    bindingPrefix, // the prefix for binding values
                    "#{" + bindingPrefix + "userRightsPanel", // binding for Title
                    "UserACLItemDataContainerForService_AsUserRights_InServiceUserSecurityOptionsDataContainer.caption", //Key for title
                    org.sblim.wbemsmt.jsf.samba.container.service.UserACLItemDataContainerForService_AsUserRights_InServiceUserSecurityOptionsDataContainerImpl.COLS);
            addUserRightsHeader();
        }

        return userRightsPanel;
    }

    static class UserRightsPanel extends MultiLinePanel {
        public UserRightsPanel(AbstractBaseCimAdapter adapter, String bindingPrefix,
                String bindigForTitle, String keyForTitle, int cols) {
            super(adapter, bindingPrefix, bindigForTitle, keyForTitle, "userRights", cols);
        }

        protected String getOrientationOfColumnAsCss(int column) {
            return org.sblim.wbemsmt.jsf.samba.container.service.UserACLItemDataContainerForService_AsUserRights_InServiceUserSecurityOptionsDataContainerImpl.orientationOfColumnAsCss[column];
        }
    }

    private void addUserRights(
            org.sblim.wbemsmt.jsf.samba.container.service.UserACLItemDataContainerForService_AsUserRights_InServiceUserSecurityOptionsDataContainerImpl child) {

        getUserRights().add(child);
        getUserRightsPanel().addComponents(child.getComponents());

        //((LabeledJSFInputComponent)getUserRights_SambaUserNameHeader()).getDependentChildFields().add(child.get_SambaUserName());
        //((LabeledJSFInputComponent)getUserRights_usr_AccessTypeVIHeader()).getDependentChildFields().add(child.get_usr_AccessTypeVI());
        //((LabeledJSFInputComponent)getUserRights_usr_AccessTypeRWHeader()).getDependentChildFields().add(child.get_usr_AccessTypeRW());
    }

    private void clearUserRights() {
        getUserRights().clear();
    }

    /**
     * 
     * Get the UserRights for the UI repesentation
     */
    public java.util.List getUserRightsForUI() {

        List result = new ArrayList();
        result.addAll(icUserRights);

        while (result.size() < MIN_TABLE_LENGTH) {
            try {
                org.sblim.wbemsmt.jsf.samba.container.service.UserACLItemDataContainerForService_AsUserRights_InServiceUserSecurityOptionsDataContainerImpl item = new org.sblim.wbemsmt.jsf.samba.container.service.UserACLItemDataContainerForService_AsUserRights_InServiceUserSecurityOptionsDataContainerImpl(
                        (org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter) adapter,
                        bindingPrefix, result.size());
                DataContainerUtil.setVisibilityOfFields(item, false);
                result.add(item);
            }
            catch (WbemsmtException e) {
                e.printStackTrace();
            }
        }

        userRightsPanel.setList(result);

        return result;
    }

    /**
     * manages the style for whole footer which is displayed if there are no entries in the table or if there is a custom panel in it
     * @return
     */
    public String getUserRightsFooterClass() {
        return "multiLineRowHeader center "
                + (icUserRights.size() == 0 || getUserRightsPanel().isHavingCustomFooter() ? "visible "
                        : "hidden ");
    }

    /**
     * manages the style for the label which is displayed if there are no entries in the table
     * @return
     */
    public String getUserRightsAvailableFooterClass() {
        return icUserRights.size() > 0 ? " hidden " : " visible ";
    }

    private void addUserRightsHeader() {
        getUserRightsPanel().setHeader(getUserRightsHeaderComponents(), getUserRightsFieldNames());
    }

    private LabeledJSFInputComponent[] getUserRightsHeaderComponents() {
        return new LabeledJSFInputComponent[] {
                (LabeledJSFInputComponent) getUserRightsHeader_SambaUserName(),
                (LabeledJSFInputComponent) getUserRightsHeader_usr_AccessTypeVI(),
                (LabeledJSFInputComponent) getUserRightsHeader_usr_AccessTypeRW(), };
    }

    private String[] getUserRightsFieldNames() {
        return new String[] { "_SambaUserName", "_usr_AccessTypeVI", "_usr_AccessTypeRW", };
    }

    /**
     * Header for:
     * 
     * linked container UserACLItemDataContainerForService
     */
    public org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForServiceHeader getUserRightsHeader() {
        return this;
    }

    /**
     * Header for field SambaUserName
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUserRightsHeader_SambaUserName() {
        if (icUserRightsHeader_SambaUserName == null) {
            String label = bundle.getString("UserACLItemDataContainerForService.SambaUserName");
            String binding = bindingPrefix + "userRightsHeader_SambaUserName.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = true;
            icUserRightsHeader_SambaUserName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icUserRightsHeader_SambaUserName)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icUserRightsHeader_SambaUserName)
                .setHeader(true);

        return icUserRightsHeader_SambaUserName;
    }

    /**
     * Header for field accessTypeVI
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUserRightsHeader_usr_AccessTypeVI() {
        if (icUserRightsHeader_usr_AccessTypeVI == null) {
            String label = bundle.getString("UserACLItemDataContainerForService.accessTypeVI");
            String binding = bindingPrefix + "userRightsHeader_usr_AccessTypeVI.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
            boolean readOnly = false;
            icUserRightsHeader_usr_AccessTypeVI = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent) icUserRightsHeader_usr_AccessTypeVI)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent) icUserRightsHeader_usr_AccessTypeVI)
                .setHeader(true);

        return icUserRightsHeader_usr_AccessTypeVI;
    }

    /**
     * Header for field accessTypeRW
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUserRightsHeader_usr_AccessTypeRW() {
        if (icUserRightsHeader_usr_AccessTypeRW == null) {
            String label = bundle.getString("UserACLItemDataContainerForService.accessTypeRW");
            String binding = bindingPrefix + "userRightsHeader_usr_AccessTypeRW.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
            boolean readOnly = false;
            icUserRightsHeader_usr_AccessTypeRW = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent) icUserRightsHeader_usr_AccessTypeRW)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent) icUserRightsHeader_usr_AccessTypeRW)
                .setHeader(true);

        return icUserRightsHeader_usr_AccessTypeRW;
    }

    public void reload() {
        super.reload();
        if (ic_usr_GuestUser != null) {
            ic_usr_GuestUser.setLabelText(bundle
                    .getString("ServiceUserSecurityOptionsDataContainer.guestUser"));
        }
        if (ic_usr_CurrentForceUser != null) {
            ic_usr_CurrentForceUser.setLabelText(bundle
                    .getString("ServiceUserSecurityOptionsDataContainer.currentForceUser"));
        }
        if (ic_usr_NewForceUser != null) {
            ic_usr_NewForceUser.setLabelText(bundle
                    .getString("ServiceUserSecurityOptionsDataContainer.newForceUser"));
        }
    }

    public String[] getResourceBundleNames() {
        return new String[] { "messages", "messagesSamba" };
    }

    public void countAndCreateChildren() throws WbemsmtException {

        try {
            int count = adapter
                    .count(
                            "userRights",
                            org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForService.class,
                            this);
            if (count != userRightsCount) {
                userRightsCount = count;
                clearUserRights();
                for (int i = 0; i < count; i++) {
                    addUserRights(new org.sblim.wbemsmt.jsf.samba.container.service.UserACLItemDataContainerForService_AsUserRights_InServiceUserSecurityOptionsDataContainerImpl(
                            (org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter) adapter,
                            bindingPrefix, i));
                }
            }
            getUserRightsPanel().setList(getUserRights());
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

        getUserRightsPanel().updateRows();
    }

    /**
     * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
     * @return
     */
    public List getFields() {
        List fields = new ArrayList();
        fields.add(get_usr_GuestUser());
        fields.add(get_usr_CurrentForceUser());
        fields.add(get_usr_NewForceUser());
        return fields;
    }

    /**
     * Return a list of all associated childContainers. A childContainer is a DataContainer
     * @return
     */
    public List getChildContainers() {
        List childs = new ArrayList();
        childs.addAll(getUserRights());
        return childs;

    }

    public void copyFrom(DataContainer sourceContainer) throws WbemsmtException {
        ServiceUserSecurityOptionsDataContainerImpl source = (ServiceUserSecurityOptionsDataContainerImpl) sourceContainer;

        get_usr_GuestUser().copyFrom(source.get_usr_GuestUser());
        get_usr_CurrentForceUser().copyFrom(source.get_usr_CurrentForceUser());
        get_usr_NewForceUser().copyFrom(source.get_usr_NewForceUser());

        List targetListForUserRights = (List) getUserRights();
        List sourceListForUserRights = (List) source.getUserRights();
        if (sourceListForUserRights.size() != targetListForUserRights.size()) {
            throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                    "The Lists are not from same size. Source is " + sourceListForUserRights.size()
                            + " and target is " + targetListForUserRights.size());
        }
        for (int ii = 0; ii < sourceListForUserRights.size(); ii++) {
            ((DataContainer) targetListForUserRights.get(ii))
                    .copyFrom(((DataContainer) sourceListForUserRights.get(ii)));
        }

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }

}