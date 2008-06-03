/** 
 * UserACLItemDataContainerForPrinter_AsUsers_InUserInPrinterACLDataContainerImpl.java
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
 * @template: org/sblim/wbemsmt/dcg/templates/jsf/containerImplMultiLine.vm
 *
 * Contributors: 
 *   michael.bauschert@de.ibm.com
 * 
 * Description: Container representing a user's acl within a printer
 * 
 * generated Class
 */

package org.sblim.wbemsmt.jsf.samba.container.printer;

import java.util.*;
import org.sblim.wbemsmt.tools.input.jsf.*;
import org.sblim.wbemsmt.exception.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class UserACLItemDataContainerForPrinter_AsUsers_InUserInPrinterACLDataContainerImpl extends
        org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel2 implements
        org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinter {

    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SambaUserName;
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_AccessTypeVI;
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_AccessTypeRW;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Admin;

    public static final int COLS = 4;

    public static String[] orientationOfColumnAsCss = new String[] { "left", "left", "left",
            "left",

    };

    public UserACLItemDataContainerForPrinter_AsUsers_InUserInPrinterACLDataContainerImpl(
            org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter, String bindingPrefix,
            int index) throws WbemsmtException {
        super(adapter, bindingPrefix, index);
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly true
     * Orientation LEFT
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SambaUserName() {
        if (ic_SambaUserName == null) {
            String label = bundle.getString("UserACLItemDataContainerForPrinter.SambaUserName");
            String binding = bindingPrefix + "users[" + index + "]._SambaUserName.item";
            logger.fine("Using binding " + binding);
            DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = true;
            ic_SambaUserName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ;
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) ic_SambaUserName)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }

        return ic_SambaUserName;
    }

    /**
     * relates to<br> Linux_SambaReadListForShare<br> Linux_SambaWriteListForShare<br> Linux_SambaInvalidUsersForShare<br> Linux_SambaValidUsersForShare<br> 
     * DataType UNSIGNED_INT16
     * UIType RADIOBUTTON
     * ReadOnly false
     * Orientation LEFT
     */

    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_AccessTypeVI() {
        if (ic_usr_AccessTypeVI == null) {
            String label = bundle.getString("UserACLItemDataContainerForPrinter.accessTypeVI");
            String binding = bindingPrefix + "users[" + index + "]._usr_AccessTypeVI.item";
            logger.fine("Using binding " + binding);
            DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
            boolean readOnly = false;
            ic_usr_AccessTypeVI = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(
                    parent, label, binding, converter, readOnly);
            ;
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent) ic_usr_AccessTypeVI)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }

        return ic_usr_AccessTypeVI;
    }

    /**
     * relates to<br> Linux_SambaReadListForShare<br> Linux_SambaWriteListForShare<br> Linux_SambaInvalidUsersForShare<br> Linux_SambaValidUsersForShare<br> 
     * DataType UNSIGNED_INT16
     * UIType RADIOBUTTON
     * ReadOnly false
     * Orientation LEFT
     */

    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_AccessTypeRW() {
        if (ic_usr_AccessTypeRW == null) {
            String label = bundle.getString("UserACLItemDataContainerForPrinter.accessTypeRW");
            String binding = bindingPrefix + "users[" + index + "]._usr_AccessTypeRW.item";
            logger.fine("Using binding " + binding);
            DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
            boolean readOnly = false;
            ic_usr_AccessTypeRW = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(
                    parent, label, binding, converter, readOnly);
            ;
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent) ic_usr_AccessTypeRW)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }

        return ic_usr_AccessTypeRW;
    }

    /**
     * relates to Linux_SambaAdminUsersForShare
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     * Orientation LEFT
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Admin() {
        if (ic_usr_Admin == null) {
            String label = bundle.getString("UserACLItemDataContainerForPrinter.admin");
            String binding = bindingPrefix + "users[" + index + "]._usr_Admin.item";
            logger.fine("Using binding " + binding);
            DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Admin = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent) ic_usr_Admin)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }

        return ic_usr_Admin;
    }

    /**
     * @return all the Components
     */
    public LabeledJSFInputComponent[] getComponents() {
        return new LabeledJSFInputComponent[] { (LabeledJSFInputComponent) get_SambaUserName(),
                (LabeledJSFInputComponent) get_usr_AccessTypeVI(),
                (LabeledJSFInputComponent) get_usr_AccessTypeRW(),
                (LabeledJSFInputComponent) get_usr_Admin(), };
    }

    public void reload() {
        super.reload();
        if (ic_SambaUserName != null) {
            ic_SambaUserName.setLabelText(bundle
                    .getString("UserACLItemDataContainerForPrinter.SambaUserName"));
        }
        if (ic_usr_AccessTypeVI != null) {
            ic_usr_AccessTypeVI.setLabelText(bundle
                    .getString("UserACLItemDataContainerForPrinter.accessTypeVI"));
        }
        if (ic_usr_AccessTypeRW != null) {
            ic_usr_AccessTypeRW.setLabelText(bundle
                    .getString("UserACLItemDataContainerForPrinter.accessTypeRW"));
        }
        if (ic_usr_Admin != null) {
            ic_usr_Admin.setLabelText(bundle.getString("UserACLItemDataContainerForPrinter.admin"));
        }
    }

    public String[] getResourceBundleNames() {
        return new String[] { "messages", "messagesSamba" };
    }

    protected String getOrientationOfColumnAsCss(int column) {
        return orientationOfColumnAsCss[column];
    }

    /**
     * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
     * @return
     */
    public List getFields() {
        List fields = new ArrayList();
        fields.add(get_SambaUserName());
        fields.add(get_usr_AccessTypeVI());
        fields.add(get_usr_AccessTypeRW());
        fields.add(get_usr_Admin());
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
        UserACLItemDataContainerForPrinter_AsUsers_InUserInPrinterACLDataContainerImpl source = (UserACLItemDataContainerForPrinter_AsUsers_InUserInPrinterACLDataContainerImpl) sourceContainer;

        get_SambaUserName().copyFrom(source.get_SambaUserName());
        get_usr_AccessTypeVI().copyFrom(source.get_usr_AccessTypeVI());
        get_usr_AccessTypeRW().copyFrom(source.get_usr_AccessTypeRW());
        get_usr_Admin().copyFrom(source.get_usr_Admin());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }

}