/** 
 * ShareInUserACLDataContainerImpl.java
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
 * Description: Container for the share-related acl within a user
 * 
 * generated Class
 */

package org.sblim.wbemsmt.jsf.samba.container.user;

import org.sblim.wbemsmt.exception.*;
import java.util.*;

//imports for that field of a linked container with occurence = MANY
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class ShareInUserACLDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel
        implements org.sblim.wbemsmt.samba.bl.container.user.ShareInUserACLDataContainer,
        org.sblim.wbemsmt.samba.bl.container.share.ShareACLItemDataContainerHeader {

    private java.util.List icShares = new java.util.ArrayList();

    private MultiLinePanel sharesPanel;
    private int sharesCount;

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_ShareName;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_usr_AccessTypeVI;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_usr_AccessTypeRW;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_usr_Admin;

    public ShareInUserACLDataContainerImpl(
            org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter, String bindingPrefix)
            throws WbemsmtException {

        super(adapter, bindingPrefix, "ShareInUserACLDataContainer.caption", false);

        setFooter(getPanelForCustomLayout(), "ShareInUserACLDataContainer.footerText");
        adapter.initContainer(this);
    }

    /**
     * 
     * linked container ShareACLItemDataContainer
     */
    public java.util.List getShares() {
        return icShares;
    }

    public MultiLinePanel getSharesPanel() {
        if (sharesPanel == null) {
            sharesPanel = new SharesPanel(adapter,
                    bindingPrefix, // the prefix for binding values
                    "#{" + bindingPrefix + "sharesPanel", // binding for Title
                    "ShareACLItemDataContainer_AsShares_InShareInUserACLDataContainer.caption", //Key for title
                    org.sblim.wbemsmt.jsf.samba.container.share.ShareACLItemDataContainer_AsShares_InShareInUserACLDataContainerImpl.COLS);
            addSharesHeader();
        }

        return sharesPanel;
    }

    static class SharesPanel extends MultiLinePanel {
        public SharesPanel(AbstractBaseCimAdapter adapter, String bindingPrefix,
                String bindigForTitle, String keyForTitle, int cols) {
            super(adapter, bindingPrefix, bindigForTitle, keyForTitle, "shares", cols);
        }

        protected String getOrientationOfColumnAsCss(int column) {
            return org.sblim.wbemsmt.jsf.samba.container.share.ShareACLItemDataContainer_AsShares_InShareInUserACLDataContainerImpl.orientationOfColumnAsCss[column];
        }
    }

    private void addShares(
            org.sblim.wbemsmt.jsf.samba.container.share.ShareACLItemDataContainer_AsShares_InShareInUserACLDataContainerImpl child) {

        getShares().add(child);
        getSharesPanel().addComponents(child.getComponents());

        //((LabeledJSFInputComponent)getShares_ShareNameHeader()).getDependentChildFields().add(child.get_ShareName());
        //((LabeledJSFInputComponent)getShares_usr_AccessTypeVIHeader()).getDependentChildFields().add(child.get_usr_AccessTypeVI());
        //((LabeledJSFInputComponent)getShares_usr_AccessTypeRWHeader()).getDependentChildFields().add(child.get_usr_AccessTypeRW());
        //((LabeledJSFInputComponent)getShares_usr_AdminHeader()).getDependentChildFields().add(child.get_usr_Admin());
    }

    private void clearShares() {
        getShares().clear();
    }

    /**
     * 
     * Get the Shares for the UI repesentation
     */
    public java.util.List getSharesForUI() {

        List result = new ArrayList();
        result.addAll(icShares);

        while (result.size() < MIN_TABLE_LENGTH) {
            try {
                org.sblim.wbemsmt.jsf.samba.container.share.ShareACLItemDataContainer_AsShares_InShareInUserACLDataContainerImpl item = new org.sblim.wbemsmt.jsf.samba.container.share.ShareACLItemDataContainer_AsShares_InShareInUserACLDataContainerImpl(
                        (org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter) adapter,
                        bindingPrefix, result.size());
                DataContainerUtil.setVisibilityOfFields(item, false);
                result.add(item);
            }
            catch (WbemsmtException e) {
                e.printStackTrace();
            }
        }

        sharesPanel.setList(result);

        return result;
    }

    /**
     * manages the style for whole footer which is displayed if there are no entries in the table or if there is a custom panel in it
     * @return
     */
    public String getSharesFooterClass() {
        return "multiLineRowHeader center "
                + (icShares.size() == 0 || getSharesPanel().isHavingCustomFooter() ? "visible "
                        : "hidden ");
    }

    /**
     * manages the style for the label which is displayed if there are no entries in the table
     * @return
     */
    public String getSharesAvailableFooterClass() {
        return icShares.size() > 0 ? " hidden " : " visible ";
    }

    private void addSharesHeader() {
        getSharesPanel().setHeader(getSharesHeaderComponents(), getSharesFieldNames());
    }

    private LabeledJSFInputComponent[] getSharesHeaderComponents() {
        return new LabeledJSFInputComponent[] {
                (LabeledJSFInputComponent) getSharesHeader_ShareName(),
                (LabeledJSFInputComponent) getSharesHeader_usr_AccessTypeVI(),
                (LabeledJSFInputComponent) getSharesHeader_usr_AccessTypeRW(),
                (LabeledJSFInputComponent) getSharesHeader_usr_Admin(), };
    }

    private String[] getSharesFieldNames() {
        return new String[] { "_ShareName", "_usr_AccessTypeVI", "_usr_AccessTypeRW", "_usr_Admin", };
    }

    /**
     * Header for:
     * 
     * linked container ShareACLItemDataContainer
     */
    public org.sblim.wbemsmt.samba.bl.container.share.ShareACLItemDataContainerHeader getSharesHeader() {
        return this;
    }

    /**
     * Header for field shareName
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_ShareName() {
        if (icSharesHeader_ShareName == null) {
            String label = bundle.getString("ShareACLItemDataContainer.shareName");
            String binding = bindingPrefix + "sharesHeader_ShareName.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icSharesHeader_ShareName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icSharesHeader_ShareName)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icSharesHeader_ShareName)
                .setHeader(true);

        return icSharesHeader_ShareName;
    }

    /**
     * Header for field accessTypeVI
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_usr_AccessTypeVI() {
        if (icSharesHeader_usr_AccessTypeVI == null) {
            String label = bundle.getString("ShareACLItemDataContainer.accessTypeVI");
            String binding = bindingPrefix + "sharesHeader_usr_AccessTypeVI.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
            boolean readOnly = false;
            icSharesHeader_usr_AccessTypeVI = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent) icSharesHeader_usr_AccessTypeVI)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent) icSharesHeader_usr_AccessTypeVI)
                .setHeader(true);

        return icSharesHeader_usr_AccessTypeVI;
    }

    /**
     * Header for field accessTypeRW
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_usr_AccessTypeRW() {
        if (icSharesHeader_usr_AccessTypeRW == null) {
            String label = bundle.getString("ShareACLItemDataContainer.accessTypeRW");
            String binding = bindingPrefix + "sharesHeader_usr_AccessTypeRW.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
            boolean readOnly = false;
            icSharesHeader_usr_AccessTypeRW = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent) icSharesHeader_usr_AccessTypeRW)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent) icSharesHeader_usr_AccessTypeRW)
                .setHeader(true);

        return icSharesHeader_usr_AccessTypeRW;
    }

    /**
     * Header for field admin
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_usr_Admin() {
        if (icSharesHeader_usr_Admin == null) {
            String label = bundle.getString("ShareACLItemDataContainer.admin");
            String binding = bindingPrefix + "sharesHeader_usr_Admin.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icSharesHeader_usr_Admin = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icSharesHeader_usr_Admin)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icSharesHeader_usr_Admin)
                .setHeader(true);

        return icSharesHeader_usr_Admin;
    }

    public void reload() {
        super.reload();
    }

    public String[] getResourceBundleNames() {
        return new String[] { "messages", "messagesSamba" };
    }

    public void countAndCreateChildren() throws WbemsmtException {

        try {
            int count = adapter.count("shares",
                    org.sblim.wbemsmt.samba.bl.container.share.ShareACLItemDataContainer.class,
                    this);
            if (count != sharesCount) {
                sharesCount = count;
                clearShares();
                for (int i = 0; i < count; i++) {
                    addShares(new org.sblim.wbemsmt.jsf.samba.container.share.ShareACLItemDataContainer_AsShares_InShareInUserACLDataContainerImpl(
                            (org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter) adapter,
                            bindingPrefix, i));
                }
            }
            getSharesPanel().setList(getShares());
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

        getSharesPanel().updateRows();
    }

    /**
     * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
     * @return
     */
    public List getFields() {
        List fields = new ArrayList();
        return fields;
    }

    /**
     * Return a list of all associated childContainers. A childContainer is a DataContainer
     * @return
     */
    public List getChildContainers() {
        List childs = new ArrayList();
        childs.addAll(getShares());
        return childs;

    }

    public void copyFrom(DataContainer sourceContainer) throws WbemsmtException {
        ShareInUserACLDataContainerImpl source = (ShareInUserACLDataContainerImpl) sourceContainer;

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

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }

}