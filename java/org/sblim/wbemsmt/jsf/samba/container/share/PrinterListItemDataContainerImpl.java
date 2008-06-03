/** 
 * PrinterListItemDataContainerImpl.java
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
 * Description: printer within a list of printers
 * 
 * generated Class
 */

package org.sblim.wbemsmt.jsf.samba.container.share;

import org.sblim.wbemsmt.exception.*;
import java.util.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class PrinterListItemDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel
        implements org.sblim.wbemsmt.samba.bl.container.printer.PrinterListItemDataContainer {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Name;
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_SystemPrinterName;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Path;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Comment;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Available;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_GuestOK;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_GuestOnly;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_HostsAllow;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_HostsDeny;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_ReadOnly;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Browsable;

    public PrinterListItemDataContainerImpl(
            org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter, String bindingPrefix)
            throws WbemsmtException {

        super(adapter, bindingPrefix, "PrinterListItemDataContainer.caption", false);

        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_Name());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_SystemPrinterName());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_Path());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_Comment());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_Available());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_GuestOK());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_GuestOnly());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_HostsAllow());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_HostsDeny());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_ReadOnly());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_Browsable());

        setFooter(getPanelForCustomLayout(), "PrinterListItemDataContainer.footerText");
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly true
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Name() {
        if (ic_Name == null) {
            String label = bundle.getString("PrinterListItemDataContainer.Name");
            String binding = bindingPrefix + "_Name.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = true;
            ic_Name = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent, label,
                    binding, converter, readOnly);
            ;
        }

        return ic_Name;
    }

    /**
     * 
     * DataType UNSIGNED_INT16
     * UIType COMBOBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_SystemPrinterName() {
        if (ic_usr_SystemPrinterName == null) {
            String label = bundle.getString("PrinterListItemDataContainer.SystemPrinterName");
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

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Path() {
        if (ic_Path == null) {
            String label = bundle.getString("PrinterListItemDataContainer.Path");
            String binding = bindingPrefix + "_Path.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_Path = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,
                    label, binding, converter, readOnly);
            ;
        }

        return ic_Path;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Comment() {
        if (ic_Comment == null) {
            String label = bundle.getString("PrinterListItemDataContainer.Comment");
            String binding = bindingPrefix + "_Comment.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_Comment = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_Comment;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Available() {
        if (ic_Available == null) {
            String label = bundle.getString("PrinterListItemDataContainer.Available");
            String binding = bindingPrefix + "_Available.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_Available = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_Available;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_GuestOK() {
        if (ic_GuestOK == null) {
            String label = bundle.getString("PrinterListItemDataContainer.GuestOK");
            String binding = bindingPrefix + "_GuestOK.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_GuestOK = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,
                    label, binding, converter, readOnly);
            ;
        }

        return ic_GuestOK;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_GuestOnly() {
        if (ic_GuestOnly == null) {
            String label = bundle.getString("PrinterListItemDataContainer.GuestOnly");
            String binding = bindingPrefix + "_GuestOnly.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_GuestOnly = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_GuestOnly;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_HostsAllow() {
        if (ic_HostsAllow == null) {
            String label = bundle.getString("PrinterListItemDataContainer.HostsAllow");
            String binding = bindingPrefix + "_HostsAllow.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_HostsAllow = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_HostsAllow;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_HostsDeny() {
        if (ic_HostsDeny == null) {
            String label = bundle.getString("PrinterListItemDataContainer.HostsDeny");
            String binding = bindingPrefix + "_HostsDeny.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_HostsDeny = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_HostsDeny;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_ReadOnly() {
        if (ic_ReadOnly == null) {
            String label = bundle.getString("PrinterListItemDataContainer.ReadOnly");
            String binding = bindingPrefix + "_ReadOnly.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_ReadOnly = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,
                    label, binding, converter, readOnly);
            ;
        }

        return ic_ReadOnly;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Browsable() {
        if (ic_Browsable == null) {
            String label = bundle.getString("PrinterListItemDataContainer.Browsable");
            String binding = bindingPrefix + "_Browsable.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_Browsable = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_Browsable;
    }

    public void reload() {
        super.reload();
        if (ic_Name != null) {
            ic_Name.setLabelText(bundle.getString("PrinterListItemDataContainer.Name"));
        }
        if (ic_usr_SystemPrinterName != null) {
            ic_usr_SystemPrinterName.setLabelText(bundle
                    .getString("PrinterListItemDataContainer.SystemPrinterName"));
        }
        if (ic_Path != null) {
            ic_Path.setLabelText(bundle.getString("PrinterListItemDataContainer.Path"));
        }
        if (ic_Comment != null) {
            ic_Comment.setLabelText(bundle.getString("PrinterListItemDataContainer.Comment"));
        }
        if (ic_Available != null) {
            ic_Available.setLabelText(bundle.getString("PrinterListItemDataContainer.Available"));
        }
        if (ic_GuestOK != null) {
            ic_GuestOK.setLabelText(bundle.getString("PrinterListItemDataContainer.GuestOK"));
        }
        if (ic_GuestOnly != null) {
            ic_GuestOnly.setLabelText(bundle.getString("PrinterListItemDataContainer.GuestOnly"));
        }
        if (ic_HostsAllow != null) {
            ic_HostsAllow.setLabelText(bundle.getString("PrinterListItemDataContainer.HostsAllow"));
        }
        if (ic_HostsDeny != null) {
            ic_HostsDeny.setLabelText(bundle.getString("PrinterListItemDataContainer.HostsDeny"));
        }
        if (ic_ReadOnly != null) {
            ic_ReadOnly.setLabelText(bundle.getString("PrinterListItemDataContainer.ReadOnly"));
        }
        if (ic_Browsable != null) {
            ic_Browsable.setLabelText(bundle.getString("PrinterListItemDataContainer.Browsable"));
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
        fields.add(get_Name());
        fields.add(get_usr_SystemPrinterName());
        fields.add(get_Path());
        fields.add(get_Comment());
        fields.add(get_Available());
        fields.add(get_GuestOK());
        fields.add(get_GuestOnly());
        fields.add(get_HostsAllow());
        fields.add(get_HostsDeny());
        fields.add(get_ReadOnly());
        fields.add(get_Browsable());
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
        PrinterListItemDataContainerImpl source = (PrinterListItemDataContainerImpl) sourceContainer;

        get_Name().copyFrom(source.get_Name());
        get_usr_SystemPrinterName().copyFrom(source.get_usr_SystemPrinterName());
        get_Path().copyFrom(source.get_Path());
        get_Comment().copyFrom(source.get_Comment());
        get_Available().copyFrom(source.get_Available());
        get_GuestOK().copyFrom(source.get_GuestOK());
        get_GuestOnly().copyFrom(source.get_GuestOnly());
        get_HostsAllow().copyFrom(source.get_HostsAllow());
        get_HostsDeny().copyFrom(source.get_HostsDeny());
        get_ReadOnly().copyFrom(source.get_ReadOnly());
        get_Browsable().copyFrom(source.get_Browsable());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }

}