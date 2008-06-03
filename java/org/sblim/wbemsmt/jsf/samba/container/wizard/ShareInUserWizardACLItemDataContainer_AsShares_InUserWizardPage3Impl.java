/** 
 * ShareInUserWizardACLItemDataContainer_AsShares_InUserWizardPage3Impl.java
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
 * Description: Defines a share-related acl within the user wizard
 * 
 * generated Class
 */

package org.sblim.wbemsmt.jsf.samba.container.wizard;

import java.util.*;
import org.sblim.wbemsmt.tools.input.jsf.*;
import org.sblim.wbemsmt.exception.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class ShareInUserWizardACLItemDataContainer_AsShares_InUserWizardPage3Impl extends
        org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel2 implements
        org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainer {

    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_ShareName;
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_AccessTypeVI;
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_AccessTypeRW;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Admin;

    public static final int COLS = 4;

    public static String[] orientationOfColumnAsCss = new String[] { "left", "left", "left",
            "left",

    };

    public ShareInUserWizardACLItemDataContainer_AsShares_InUserWizardPage3Impl(
            org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter, String bindingPrefix,
            int index) throws WbemsmtException {
        super(adapter, bindingPrefix, index);
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly false
     * Orientation LEFT
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_ShareName() {
        if (ic_ShareName == null) {
            String label = bundle.getString("ShareInUserWizardACLItemDataContainer.shareName");
            String binding = bindingPrefix + "shares[" + index + "]._ShareName.item";
            logger.fine("Using binding " + binding);
            DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_ShareName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,
                    label, binding, converter, readOnly);
            ;
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) ic_ShareName)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }

        return ic_ShareName;
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
            String label = bundle.getString("ShareInUserWizardACLItemDataContainer.accessTypeVI");
            String binding = bindingPrefix + "shares[" + index + "]._usr_AccessTypeVI.item";
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
            String label = bundle.getString("ShareInUserWizardACLItemDataContainer.accessTypeRW");
            String binding = bindingPrefix + "shares[" + index + "]._usr_AccessTypeRW.item";
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
            String label = bundle.getString("ShareInUserWizardACLItemDataContainer.admin");
            String binding = bindingPrefix + "shares[" + index + "]._usr_Admin.item";
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
        return new LabeledJSFInputComponent[] { (LabeledJSFInputComponent) get_ShareName(),
                (LabeledJSFInputComponent) get_usr_AccessTypeVI(),
                (LabeledJSFInputComponent) get_usr_AccessTypeRW(),
                (LabeledJSFInputComponent) get_usr_Admin(), };
    }

    public void reload() {
        super.reload();
        if (ic_ShareName != null) {
            ic_ShareName.setLabelText(bundle
                    .getString("ShareInUserWizardACLItemDataContainer.shareName"));
        }
        if (ic_usr_AccessTypeVI != null) {
            ic_usr_AccessTypeVI.setLabelText(bundle
                    .getString("ShareInUserWizardACLItemDataContainer.accessTypeVI"));
        }
        if (ic_usr_AccessTypeRW != null) {
            ic_usr_AccessTypeRW.setLabelText(bundle
                    .getString("ShareInUserWizardACLItemDataContainer.accessTypeRW"));
        }
        if (ic_usr_Admin != null) {
            ic_usr_Admin.setLabelText(bundle
                    .getString("ShareInUserWizardACLItemDataContainer.admin"));
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
        fields.add(get_ShareName());
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
        ShareInUserWizardACLItemDataContainer_AsShares_InUserWizardPage3Impl source = (ShareInUserWizardACLItemDataContainer_AsShares_InUserWizardPage3Impl) sourceContainer;

        get_ShareName().copyFrom(source.get_ShareName());
        get_usr_AccessTypeVI().copyFrom(source.get_usr_AccessTypeVI());
        get_usr_AccessTypeRW().copyFrom(source.get_usr_AccessTypeRW());
        get_usr_Admin().copyFrom(source.get_usr_Admin());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }

}