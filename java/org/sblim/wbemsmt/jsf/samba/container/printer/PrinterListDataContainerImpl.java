/** 
 * PrinterListDataContainerImpl.java
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
 * Description: List with printers
 * 
 * generated Class
 */

package org.sblim.wbemsmt.jsf.samba.container.printer;

import org.sblim.wbemsmt.exception.*;
import java.util.*;

//imports for that field of a linked container with occurence = MANY
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class PrinterListDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel
        implements org.sblim.wbemsmt.samba.bl.container.printer.PrinterListDataContainer,
        org.sblim.wbemsmt.samba.bl.container.printer.PrinterListItemDataContainerHeader {

    private java.util.List icPrinters = new java.util.ArrayList();

    private MultiLinePanel printersPanel;
    private int printersCount;

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_Name;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_usr_SystemPrinterName;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_Path;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_Comment;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_Available;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_GuestOK;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_GuestOnly;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_HostsAllow;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_HostsDeny;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_ReadOnly;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_Browsable;

    public PrinterListDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,
            String bindingPrefix) throws WbemsmtException {

        super(adapter, bindingPrefix, "PrinterListDataContainer.caption", false);

        setFooter(getPanelForCustomLayout(), "PrinterListDataContainer.footerText");
        adapter.initContainer(this);
    }

    /**
     * 
     * linked container PrinterListItemDataContainer
     */
    public java.util.List getPrinters() {
        return icPrinters;
    }

    public MultiLinePanel getPrintersPanel() {
        if (printersPanel == null) {
            printersPanel = new PrintersPanel(adapter,
                    bindingPrefix, // the prefix for binding values
                    "#{" + bindingPrefix + "printersPanel", // binding for Title
                    "PrinterListItemDataContainer_AsPrinters_InPrinterListDataContainer.caption", //Key for title
                    org.sblim.wbemsmt.jsf.samba.container.share.PrinterListItemDataContainer_AsPrinters_InPrinterListDataContainerImpl.COLS);
            addPrintersHeader();
        }

        return printersPanel;
    }

    static class PrintersPanel extends MultiLinePanel {
        public PrintersPanel(AbstractBaseCimAdapter adapter, String bindingPrefix,
                String bindigForTitle, String keyForTitle, int cols) {
            super(adapter, bindingPrefix, bindigForTitle, keyForTitle, "printers", cols);
        }

        protected String getOrientationOfColumnAsCss(int column) {
            return org.sblim.wbemsmt.jsf.samba.container.share.PrinterListItemDataContainer_AsPrinters_InPrinterListDataContainerImpl.orientationOfColumnAsCss[column];
        }
    }

    private void addPrinters(
            org.sblim.wbemsmt.jsf.samba.container.share.PrinterListItemDataContainer_AsPrinters_InPrinterListDataContainerImpl child) {

        getPrinters().add(child);
        getPrintersPanel().addComponents(child.getComponents());

        //((LabeledJSFInputComponent)getPrinters_NameHeader()).getDependentChildFields().add(child.get_Name());
        //((LabeledJSFInputComponent)getPrinters_usr_SystemPrinterNameHeader()).getDependentChildFields().add(child.get_usr_SystemPrinterName());
        //((LabeledJSFInputComponent)getPrinters_PathHeader()).getDependentChildFields().add(child.get_Path());
        //((LabeledJSFInputComponent)getPrinters_CommentHeader()).getDependentChildFields().add(child.get_Comment());
        //((LabeledJSFInputComponent)getPrinters_AvailableHeader()).getDependentChildFields().add(child.get_Available());
        //((LabeledJSFInputComponent)getPrinters_GuestOKHeader()).getDependentChildFields().add(child.get_GuestOK());
        //((LabeledJSFInputComponent)getPrinters_GuestOnlyHeader()).getDependentChildFields().add(child.get_GuestOnly());
        //((LabeledJSFInputComponent)getPrinters_HostsAllowHeader()).getDependentChildFields().add(child.get_HostsAllow());
        //((LabeledJSFInputComponent)getPrinters_HostsDenyHeader()).getDependentChildFields().add(child.get_HostsDeny());
        //((LabeledJSFInputComponent)getPrinters_ReadOnlyHeader()).getDependentChildFields().add(child.get_ReadOnly());
        //((LabeledJSFInputComponent)getPrinters_BrowsableHeader()).getDependentChildFields().add(child.get_Browsable());
    }

    private void clearPrinters() {
        getPrinters().clear();
    }

    /**
     * 
     * Get the Printers for the UI repesentation
     */
    public java.util.List getPrintersForUI() {

        List result = new ArrayList();
        result.addAll(icPrinters);

        while (result.size() < MIN_TABLE_LENGTH) {
            try {
                org.sblim.wbemsmt.jsf.samba.container.share.PrinterListItemDataContainer_AsPrinters_InPrinterListDataContainerImpl item = new org.sblim.wbemsmt.jsf.samba.container.share.PrinterListItemDataContainer_AsPrinters_InPrinterListDataContainerImpl(
                        (org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter) adapter,
                        bindingPrefix, result.size());
                DataContainerUtil.setVisibilityOfFields(item, false);
                result.add(item);
            }
            catch (WbemsmtException e) {
                e.printStackTrace();
            }
        }

        printersPanel.setList(result);

        return result;
    }

    /**
     * manages the style for whole footer which is displayed if there are no entries in the table or if there is a custom panel in it
     * @return
     */
    public String getPrintersFooterClass() {
        return "multiLineRowHeader center "
                + (icPrinters.size() == 0 || getPrintersPanel().isHavingCustomFooter() ? "visible "
                        : "hidden ");
    }

    /**
     * manages the style for the label which is displayed if there are no entries in the table
     * @return
     */
    public String getPrintersAvailableFooterClass() {
        return icPrinters.size() > 0 ? " hidden " : " visible ";
    }

    private void addPrintersHeader() {
        getPrintersPanel().setHeader(getPrintersHeaderComponents(), getPrintersFieldNames());
    }

    private LabeledJSFInputComponent[] getPrintersHeaderComponents() {
        return new LabeledJSFInputComponent[] {
                (LabeledJSFInputComponent) getPrintersHeader_Name(),
                (LabeledJSFInputComponent) getPrintersHeader_usr_SystemPrinterName(),
                (LabeledJSFInputComponent) getPrintersHeader_Path(),
                (LabeledJSFInputComponent) getPrintersHeader_Comment(),
                (LabeledJSFInputComponent) getPrintersHeader_Available(),
                (LabeledJSFInputComponent) getPrintersHeader_GuestOK(),
                (LabeledJSFInputComponent) getPrintersHeader_GuestOnly(),
                (LabeledJSFInputComponent) getPrintersHeader_HostsAllow(),
                (LabeledJSFInputComponent) getPrintersHeader_HostsDeny(),
                (LabeledJSFInputComponent) getPrintersHeader_ReadOnly(),
                (LabeledJSFInputComponent) getPrintersHeader_Browsable(), };
    }

    private String[] getPrintersFieldNames() {
        return new String[] { "_Name", "_usr_SystemPrinterName", "_Path", "_Comment", "_Available",
                "_GuestOK", "_GuestOnly", "_HostsAllow", "_HostsDeny", "_ReadOnly", "_Browsable", };
    }

    /**
     * Header for:
     * 
     * linked container PrinterListItemDataContainer
     */
    public org.sblim.wbemsmt.samba.bl.container.printer.PrinterListItemDataContainerHeader getPrintersHeader() {
        return this;
    }

    /**
     * Header for field Name
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_Name() {
        if (icPrintersHeader_Name == null) {
            String label = bundle.getString("PrinterListItemDataContainer.Name");
            String binding = bindingPrefix + "printersHeader_Name.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = true;
            icPrintersHeader_Name = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icPrintersHeader_Name)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icPrintersHeader_Name)
                .setHeader(true);

        return icPrintersHeader_Name;
    }

    /**
     * Header for field SystemPrinterName
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_usr_SystemPrinterName() {
        if (icPrintersHeader_usr_SystemPrinterName == null) {
            String label = bundle.getString("PrinterListItemDataContainer.SystemPrinterName");
            String binding = bindingPrefix + "printersHeader_usr_SystemPrinterName.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
            boolean readOnly = false;
            icPrintersHeader_usr_SystemPrinterName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFComboBoxComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFComboBoxComponent) icPrintersHeader_usr_SystemPrinterName)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFComboBoxComponent) icPrintersHeader_usr_SystemPrinterName)
                .setHeader(true);

        return icPrintersHeader_usr_SystemPrinterName;
    }

    /**
     * Header for field Path
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_Path() {
        if (icPrintersHeader_Path == null) {
            String label = bundle.getString("PrinterListItemDataContainer.Path");
            String binding = bindingPrefix + "printersHeader_Path.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icPrintersHeader_Path = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent) icPrintersHeader_Path)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent) icPrintersHeader_Path)
                .setHeader(true);

        return icPrintersHeader_Path;
    }

    /**
     * Header for field Comment
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_Comment() {
        if (icPrintersHeader_Comment == null) {
            String label = bundle.getString("PrinterListItemDataContainer.Comment");
            String binding = bindingPrefix + "printersHeader_Comment.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icPrintersHeader_Comment = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent) icPrintersHeader_Comment)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent) icPrintersHeader_Comment)
                .setHeader(true);

        return icPrintersHeader_Comment;
    }

    /**
     * Header for field Available
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_Available() {
        if (icPrintersHeader_Available == null) {
            String label = bundle.getString("PrinterListItemDataContainer.Available");
            String binding = bindingPrefix + "printersHeader_Available.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icPrintersHeader_Available = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icPrintersHeader_Available)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icPrintersHeader_Available)
                .setHeader(true);

        return icPrintersHeader_Available;
    }

    /**
     * Header for field GuestOK
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_GuestOK() {
        if (icPrintersHeader_GuestOK == null) {
            String label = bundle.getString("PrinterListItemDataContainer.GuestOK");
            String binding = bindingPrefix + "printersHeader_GuestOK.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icPrintersHeader_GuestOK = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icPrintersHeader_GuestOK)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icPrintersHeader_GuestOK)
                .setHeader(true);

        return icPrintersHeader_GuestOK;
    }

    /**
     * Header for field GuestOnly
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_GuestOnly() {
        if (icPrintersHeader_GuestOnly == null) {
            String label = bundle.getString("PrinterListItemDataContainer.GuestOnly");
            String binding = bindingPrefix + "printersHeader_GuestOnly.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icPrintersHeader_GuestOnly = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icPrintersHeader_GuestOnly)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icPrintersHeader_GuestOnly)
                .setHeader(true);

        return icPrintersHeader_GuestOnly;
    }

    /**
     * Header for field HostsAllow
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_HostsAllow() {
        if (icPrintersHeader_HostsAllow == null) {
            String label = bundle.getString("PrinterListItemDataContainer.HostsAllow");
            String binding = bindingPrefix + "printersHeader_HostsAllow.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icPrintersHeader_HostsAllow = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent) icPrintersHeader_HostsAllow)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent) icPrintersHeader_HostsAllow)
                .setHeader(true);

        return icPrintersHeader_HostsAllow;
    }

    /**
     * Header for field HostsDeny
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_HostsDeny() {
        if (icPrintersHeader_HostsDeny == null) {
            String label = bundle.getString("PrinterListItemDataContainer.HostsDeny");
            String binding = bindingPrefix + "printersHeader_HostsDeny.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icPrintersHeader_HostsDeny = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent) icPrintersHeader_HostsDeny)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent) icPrintersHeader_HostsDeny)
                .setHeader(true);

        return icPrintersHeader_HostsDeny;
    }

    /**
     * Header for field ReadOnly
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_ReadOnly() {
        if (icPrintersHeader_ReadOnly == null) {
            String label = bundle.getString("PrinterListItemDataContainer.ReadOnly");
            String binding = bindingPrefix + "printersHeader_ReadOnly.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icPrintersHeader_ReadOnly = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icPrintersHeader_ReadOnly)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icPrintersHeader_ReadOnly)
                .setHeader(true);

        return icPrintersHeader_ReadOnly;
    }

    /**
     * Header for field Browsable
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_Browsable() {
        if (icPrintersHeader_Browsable == null) {
            String label = bundle.getString("PrinterListItemDataContainer.Browsable");
            String binding = bindingPrefix + "printersHeader_Browsable.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icPrintersHeader_Browsable = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icPrintersHeader_Browsable)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) icPrintersHeader_Browsable)
                .setHeader(true);

        return icPrintersHeader_Browsable;
    }

    public void reload() {
        super.reload();
    }

    public String[] getResourceBundleNames() {
        return new String[] { "messages", "messagesSamba" };
    }

    public void countAndCreateChildren() throws WbemsmtException {

        try {
            int count = adapter
                    .count(
                            "printers",
                            org.sblim.wbemsmt.samba.bl.container.printer.PrinterListItemDataContainer.class,
                            this);
            if (count != printersCount) {
                printersCount = count;
                clearPrinters();
                for (int i = 0; i < count; i++) {
                    addPrinters(new org.sblim.wbemsmt.jsf.samba.container.share.PrinterListItemDataContainer_AsPrinters_InPrinterListDataContainerImpl(
                            (org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter) adapter,
                            bindingPrefix, i));
                }
            }
            getPrintersPanel().setList(getPrinters());
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

        getPrintersPanel().updateRows();
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
        childs.addAll(getPrinters());
        return childs;

    }

    public void copyFrom(DataContainer sourceContainer) throws WbemsmtException {
        PrinterListDataContainerImpl source = (PrinterListDataContainerImpl) sourceContainer;

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