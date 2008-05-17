/** 
 * ShareListDataContainerImpl.java
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
 * Description: List with shares
 * 
 * generated Class
 */

package org.sblim.wbemsmt.jsf.samba.container.share;

import org.sblim.wbemsmt.exception.*;
import java.util.*;

//imports for that field of a linked container with occurence = MANY
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class ShareListDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements
        org.sblim.wbemsmt.samba.bl.container.share.ShareListDataContainer,
        org.sblim.wbemsmt.samba.bl.container.share.ShareListItemDataContainerHeader {

    private java.util.List icShares = new java.util.ArrayList();

    private MultiLinePanel sharesPanel;
    private int sharesCount;

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_Name;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_Available;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_Comment;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_Path;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_Browsable;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_GuestOK;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_GuestOnly;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_HostsAllow;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_HostsDeny;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_ReadOnly;

    public ShareListDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,
            String bindingPrefix) throws WbemsmtException {

        super(adapter, bindingPrefix, "ShareListDataContainer.caption", false);

        setFooter(getPanelForCustomLayout(), "ShareListDataContainer.footerText");
        adapter.initContainer(this);
    }

    /**
     * 
     * linked container ShareListItemDataContainer
     */
    public java.util.List getShares() {
        return icShares;
    }

    public MultiLinePanel getSharesPanel() {
        if (sharesPanel == null) {
            sharesPanel = new SharesPanel(adapter,
                    bindingPrefix, // the prefix for binding values
                    "#{" + bindingPrefix + "sharesPanel", // binding for Title
                    "ShareListItemDataContainer_AsShares_InShareListDataContainer.caption", //Key for title
                    org.sblim.wbemsmt.jsf.samba.container.share.ShareListItemDataContainer_AsShares_InShareListDataContainerImpl.COLS);
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
            return org.sblim.wbemsmt.jsf.samba.container.share.ShareListItemDataContainer_AsShares_InShareListDataContainerImpl.orientationOfColumnAsCss[column];
        }
    }

    private void addShares(
            org.sblim.wbemsmt.jsf.samba.container.share.ShareListItemDataContainer_AsShares_InShareListDataContainerImpl child) {

        getShares().add(child);
        getSharesPanel().addComponents(child.getComponents());

        //((LabeledJSFInputComponent)getShares_NameHeader()).getDependentChildFields().add(child.get_Name());
        //((LabeledJSFInputComponent)getShares_AvailableHeader()).getDependentChildFields().add(child.get_Available());
        //((LabeledJSFInputComponent)getShares_CommentHeader()).getDependentChildFields().add(child.get_Comment());
        //((LabeledJSFInputComponent)getShares_PathHeader()).getDependentChildFields().add(child.get_Path());
        //((LabeledJSFInputComponent)getShares_BrowsableHeader()).getDependentChildFields().add(child.get_Browsable());
        //((LabeledJSFInputComponent)getShares_GuestOKHeader()).getDependentChildFields().add(child.get_GuestOK());
        //((LabeledJSFInputComponent)getShares_GuestOnlyHeader()).getDependentChildFields().add(child.get_GuestOnly());
        //((LabeledJSFInputComponent)getShares_HostsAllowHeader()).getDependentChildFields().add(child.get_HostsAllow());
        //((LabeledJSFInputComponent)getShares_HostsDenyHeader()).getDependentChildFields().add(child.get_HostsDeny());
        //((LabeledJSFInputComponent)getShares_ReadOnlyHeader()).getDependentChildFields().add(child.get_ReadOnly());
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
                org.sblim.wbemsmt.jsf.samba.container.share.ShareListItemDataContainer_AsShares_InShareListDataContainerImpl item = new org.sblim.wbemsmt.jsf.samba.container.share.ShareListItemDataContainer_AsShares_InShareListDataContainerImpl(
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
        return new LabeledJSFInputComponent[] { (LabeledJSFInputComponent) getSharesHeader_Name(),
                (LabeledJSFInputComponent) getSharesHeader_Available(),
                (LabeledJSFInputComponent) getSharesHeader_Comment(),
                (LabeledJSFInputComponent) getSharesHeader_Path(),
                (LabeledJSFInputComponent) getSharesHeader_Browsable(),
                (LabeledJSFInputComponent) getSharesHeader_GuestOK(),
                (LabeledJSFInputComponent) getSharesHeader_GuestOnly(),
                (LabeledJSFInputComponent) getSharesHeader_HostsAllow(),
                (LabeledJSFInputComponent) getSharesHeader_HostsDeny(),
                (LabeledJSFInputComponent) getSharesHeader_ReadOnly(), };
    }

    private String[] getSharesFieldNames() {
        return new String[] { "_Name", "_Available", "_Comment", "_Path", "_Browsable", "_GuestOK",
                "_GuestOnly", "_HostsAllow", "_HostsDeny", "_ReadOnly", };
    }

    /**
     * Header for:
     * 
     * linked container ShareListItemDataContainer
     */
    public org.sblim.wbemsmt.samba.bl.container.share.ShareListItemDataContainerHeader getSharesHeader() {
        return this;
    }

    /**
     * Header for field Name
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_Name() {
        if (icSharesHeader_Name == null) {
            String label = bundle.getString("ShareListItemDataContainer.Name");
            String binding = bindingPrefix + "sharesHeader_Name.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = true;
            icSharesHeader_Name = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icSharesHeader_Name)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icSharesHeader_Name)
                .setHeader(true);

        return icSharesHeader_Name;
    }

    /**
     * Header for field Available
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_Available() {
        if (icSharesHeader_Available == null) {
            String label = bundle.getString("ShareListItemDataContainer.Available");
            String binding = bindingPrefix + "sharesHeader_Available.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icSharesHeader_Available = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icSharesHeader_Available)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icSharesHeader_Available)
                .setHeader(true);

        return icSharesHeader_Available;
    }

    /**
     * Header for field Comment
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_Comment() {
        if (icSharesHeader_Comment == null) {
            String label = bundle.getString("ShareListItemDataContainer.Comment");
            String binding = bindingPrefix + "sharesHeader_Comment.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icSharesHeader_Comment = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent) icSharesHeader_Comment)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent) icSharesHeader_Comment)
                .setHeader(true);

        return icSharesHeader_Comment;
    }

    /**
     * Header for field Path
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_Path() {
        if (icSharesHeader_Path == null) {
            String label = bundle.getString("ShareListItemDataContainer.Path");
            String binding = bindingPrefix + "sharesHeader_Path.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icSharesHeader_Path = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent) icSharesHeader_Path)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent) icSharesHeader_Path)
                .setHeader(true);

        return icSharesHeader_Path;
    }

    /**
     * Header for field Browsable
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_Browsable() {
        if (icSharesHeader_Browsable == null) {
            String label = bundle.getString("ShareListItemDataContainer.Browsable");
            String binding = bindingPrefix + "sharesHeader_Browsable.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icSharesHeader_Browsable = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icSharesHeader_Browsable)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icSharesHeader_Browsable)
                .setHeader(true);

        return icSharesHeader_Browsable;
    }

    /**
     * Header for field GuestOK
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_GuestOK() {
        if (icSharesHeader_GuestOK == null) {
            String label = bundle.getString("ShareListItemDataContainer.GuestOK");
            String binding = bindingPrefix + "sharesHeader_GuestOK.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icSharesHeader_GuestOK = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icSharesHeader_GuestOK)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icSharesHeader_GuestOK)
                .setHeader(true);

        return icSharesHeader_GuestOK;
    }

    /**
     * Header for field GuestOnly
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_GuestOnly() {
        if (icSharesHeader_GuestOnly == null) {
            String label = bundle.getString("ShareListItemDataContainer.GuestOnly");
            String binding = bindingPrefix + "sharesHeader_GuestOnly.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icSharesHeader_GuestOnly = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icSharesHeader_GuestOnly)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icSharesHeader_GuestOnly)
                .setHeader(true);

        return icSharesHeader_GuestOnly;
    }

    /**
     * Header for field HostsAllow
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_HostsAllow() {
        if (icSharesHeader_HostsAllow == null) {
            String label = bundle.getString("ShareListItemDataContainer.HostsAllow");
            String binding = bindingPrefix + "sharesHeader_HostsAllow.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icSharesHeader_HostsAllow = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent) icSharesHeader_HostsAllow)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent) icSharesHeader_HostsAllow)
                .setHeader(true);

        return icSharesHeader_HostsAllow;
    }

    /**
     * Header for field HostsDeny
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_HostsDeny() {
        if (icSharesHeader_HostsDeny == null) {
            String label = bundle.getString("ShareListItemDataContainer.HostsDeny");
            String binding = bindingPrefix + "sharesHeader_HostsDeny.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icSharesHeader_HostsDeny = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent) icSharesHeader_HostsDeny)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent) icSharesHeader_HostsDeny)
                .setHeader(true);

        return icSharesHeader_HostsDeny;
    }

    /**
     * Header for field ReadOnly
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_ReadOnly() {
        if (icSharesHeader_ReadOnly == null) {
            String label = bundle.getString("ShareListItemDataContainer.ReadOnly");
            String binding = bindingPrefix + "sharesHeader_ReadOnly.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icSharesHeader_ReadOnly = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icSharesHeader_ReadOnly)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icSharesHeader_ReadOnly)
                .setHeader(true);

        return icSharesHeader_ReadOnly;
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
                    org.sblim.wbemsmt.samba.bl.container.share.ShareListItemDataContainer.class,
                    this);
            if (count != sharesCount) {
                sharesCount = count;
                clearShares();
                for (int i = 0; i < count; i++) {
                    addShares(new org.sblim.wbemsmt.jsf.samba.container.share.ShareListItemDataContainer_AsShares_InShareListDataContainerImpl(
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
        ShareListDataContainerImpl source = (ShareListDataContainerImpl) sourceContainer;

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