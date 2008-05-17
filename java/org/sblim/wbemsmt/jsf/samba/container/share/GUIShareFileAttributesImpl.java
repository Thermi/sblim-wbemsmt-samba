/** 
 * GUIShareFileAttributesImpl.java
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
 * Description: UI extensions for FileAttributres for a share
 * 
 * generated Class
 */

package org.sblim.wbemsmt.jsf.samba.container.share;

import org.sblim.wbemsmt.exception.*;
import java.util.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class GUIShareFileAttributesImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements
        org.sblim.wbemsmt.samba.bl.container.share.GUIShareFileAttributes {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_CaseSensitive;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_HideDotFiles;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DosFiletimes;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_EASupport;
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_AclCompatibility;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_NTACLSupport;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_u;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_g;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_s;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_user_r;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_user_w;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_user_x;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_group_r;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_group_w;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_group_x;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_other_r;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_other_w;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_other_x;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_u;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_g;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_s;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_user_r;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_user_w;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_user_x;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_group_r;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_group_w;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_group_x;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_other_r;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_other_w;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_other_x;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_u;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_g;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_s;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_user_r;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_user_w;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_user_x;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_group_r;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_group_w;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_group_x;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_other_r;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_other_w;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_other_x;

    GUIShareFileAttributesImplLayouter layouter = null;

    public GUIShareFileAttributesImplLayouter getLayouter() {
        return layouter;
    }

    public GUIShareFileAttributesImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,
            String bindingPrefix) throws WbemsmtException {

        super(adapter, bindingPrefix, "GUIShareFileAttributes.caption", false);

        layouter = new GUIShareFileAttributesImplLayouter();
        //layout is done in the edit-method of the Editbean
        //layouter.layout(getPanelForCustomLayout(),this,bundle);

        setFooter(getPanelForCustomLayout(), "GUIShareFileAttributes.footerText");
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_CaseSensitive() {
        if (ic_CaseSensitive == null) {
            String label = bundle.getString("GUIShareFileAttributes.CaseSensitive");
            String binding = bindingPrefix + "_CaseSensitive.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_CaseSensitive = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_CaseSensitive;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_HideDotFiles() {
        if (ic_HideDotFiles == null) {
            String label = bundle.getString("GUIShareFileAttributes.HideDotFiles");
            String binding = bindingPrefix + "_HideDotFiles.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_HideDotFiles = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_HideDotFiles;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DosFiletimes() {
        if (ic_DosFiletimes == null) {
            String label = bundle.getString("GUIShareFileAttributes.DosFiletimes");
            String binding = bindingPrefix + "_DosFiletimes.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_DosFiletimes = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_DosFiletimes;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_EASupport() {
        if (ic_EASupport == null) {
            String label = bundle.getString("GUIShareFileAttributes.EASupport");
            String binding = bindingPrefix + "_EASupport.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_EASupport = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_EASupport;
    }

    /**
     * 
     * DataType UNSIGNED_INT8
     * UIType COMBOBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_AclCompatibility() {
        if (ic_AclCompatibility == null) {
            String label = bundle.getString("GUIShareFileAttributes.AclCompatibility");
            String binding = bindingPrefix + "_AclCompatibility.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt8StringConverter();
            boolean readOnly = false;
            ic_AclCompatibility = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFComboBoxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_AclCompatibility;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_NTACLSupport() {
        if (ic_NTACLSupport == null) {
            String label = bundle.getString("GUIShareFileAttributes.NTACLSupport");
            String binding = bindingPrefix + "_NTACLSupport.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_NTACLSupport = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_NTACLSupport;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_u() {
        if (ic_usr_Create_u == null) {
            String label = bundle.getString("GUIShareFileAttributes.create_u");
            String binding = bindingPrefix + "_usr_Create_u.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Create_u = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Create_u;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_g() {
        if (ic_usr_Create_g == null) {
            String label = bundle.getString("GUIShareFileAttributes.create_g");
            String binding = bindingPrefix + "_usr_Create_g.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Create_g = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Create_g;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_s() {
        if (ic_usr_Create_s == null) {
            String label = bundle.getString("GUIShareFileAttributes.create_s");
            String binding = bindingPrefix + "_usr_Create_s.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Create_s = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Create_s;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_user_r() {
        if (ic_usr_Create_user_r == null) {
            String label = bundle.getString("GUIShareFileAttributes.create_user_r");
            String binding = bindingPrefix + "_usr_Create_user_r.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Create_user_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Create_user_r;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_user_w() {
        if (ic_usr_Create_user_w == null) {
            String label = bundle.getString("GUIShareFileAttributes.create_user_w");
            String binding = bindingPrefix + "_usr_Create_user_w.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Create_user_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Create_user_w;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_user_x() {
        if (ic_usr_Create_user_x == null) {
            String label = bundle.getString("GUIShareFileAttributes.create_user_x");
            String binding = bindingPrefix + "_usr_Create_user_x.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Create_user_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Create_user_x;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_group_r() {
        if (ic_usr_Create_group_r == null) {
            String label = bundle.getString("GUIShareFileAttributes.create_group_r");
            String binding = bindingPrefix + "_usr_Create_group_r.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Create_group_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Create_group_r;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_group_w() {
        if (ic_usr_Create_group_w == null) {
            String label = bundle.getString("GUIShareFileAttributes.create_group_w");
            String binding = bindingPrefix + "_usr_Create_group_w.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Create_group_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Create_group_w;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_group_x() {
        if (ic_usr_Create_group_x == null) {
            String label = bundle.getString("GUIShareFileAttributes.create_group_x");
            String binding = bindingPrefix + "_usr_Create_group_x.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Create_group_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Create_group_x;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_other_r() {
        if (ic_usr_Create_other_r == null) {
            String label = bundle.getString("GUIShareFileAttributes.create_other_r");
            String binding = bindingPrefix + "_usr_Create_other_r.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Create_other_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Create_other_r;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_other_w() {
        if (ic_usr_Create_other_w == null) {
            String label = bundle.getString("GUIShareFileAttributes.create_other_w");
            String binding = bindingPrefix + "_usr_Create_other_w.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Create_other_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Create_other_w;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_other_x() {
        if (ic_usr_Create_other_x == null) {
            String label = bundle.getString("GUIShareFileAttributes.create_other_x");
            String binding = bindingPrefix + "_usr_Create_other_x.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Create_other_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Create_other_x;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_u() {
        if (ic_usr_Directory_u == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_u");
            String binding = bindingPrefix + "_usr_Directory_u.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_u = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_u;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_g() {
        if (ic_usr_Directory_g == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_g");
            String binding = bindingPrefix + "_usr_Directory_g.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_g = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_g;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_s() {
        if (ic_usr_Directory_s == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_s");
            String binding = bindingPrefix + "_usr_Directory_s.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_s = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_s;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_user_r() {
        if (ic_usr_Directory_user_r == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_user_r");
            String binding = bindingPrefix + "_usr_Directory_user_r.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_user_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_user_r;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_user_w() {
        if (ic_usr_Directory_user_w == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_user_w");
            String binding = bindingPrefix + "_usr_Directory_user_w.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_user_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_user_w;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_user_x() {
        if (ic_usr_Directory_user_x == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_user_x");
            String binding = bindingPrefix + "_usr_Directory_user_x.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_user_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_user_x;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_group_r() {
        if (ic_usr_Directory_group_r == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_group_r");
            String binding = bindingPrefix + "_usr_Directory_group_r.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_group_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_group_r;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_group_w() {
        if (ic_usr_Directory_group_w == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_group_w");
            String binding = bindingPrefix + "_usr_Directory_group_w.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_group_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_group_w;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_group_x() {
        if (ic_usr_Directory_group_x == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_group_x");
            String binding = bindingPrefix + "_usr_Directory_group_x.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_group_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_group_x;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_other_r() {
        if (ic_usr_Directory_other_r == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_other_r");
            String binding = bindingPrefix + "_usr_Directory_other_r.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_other_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_other_r;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_other_w() {
        if (ic_usr_Directory_other_w == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_other_w");
            String binding = bindingPrefix + "_usr_Directory_other_w.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_other_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_other_w;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_other_x() {
        if (ic_usr_Directory_other_x == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_other_x");
            String binding = bindingPrefix + "_usr_Directory_other_x.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_other_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_other_x;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_u() {
        if (ic_usr_Directory_security_u == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_security_u");
            String binding = bindingPrefix + "_usr_Directory_security_u.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_security_u = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_security_u;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_g() {
        if (ic_usr_Directory_security_g == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_security_g");
            String binding = bindingPrefix + "_usr_Directory_security_g.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_security_g = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_security_g;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_s() {
        if (ic_usr_Directory_security_s == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_security_s");
            String binding = bindingPrefix + "_usr_Directory_security_s.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_security_s = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_security_s;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_user_r() {
        if (ic_usr_Directory_security_user_r == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_security_user_r");
            String binding = bindingPrefix + "_usr_Directory_security_user_r.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_security_user_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_security_user_r;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_user_w() {
        if (ic_usr_Directory_security_user_w == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_security_user_w");
            String binding = bindingPrefix + "_usr_Directory_security_user_w.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_security_user_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_security_user_w;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_user_x() {
        if (ic_usr_Directory_security_user_x == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_security_user_x");
            String binding = bindingPrefix + "_usr_Directory_security_user_x.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_security_user_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_security_user_x;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_group_r() {
        if (ic_usr_Directory_security_group_r == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_security_group_r");
            String binding = bindingPrefix + "_usr_Directory_security_group_r.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_security_group_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_security_group_r;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_group_w() {
        if (ic_usr_Directory_security_group_w == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_security_group_w");
            String binding = bindingPrefix + "_usr_Directory_security_group_w.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_security_group_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_security_group_w;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_group_x() {
        if (ic_usr_Directory_security_group_x == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_security_group_x");
            String binding = bindingPrefix + "_usr_Directory_security_group_x.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_security_group_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_security_group_x;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_other_r() {
        if (ic_usr_Directory_security_other_r == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_security_other_r");
            String binding = bindingPrefix + "_usr_Directory_security_other_r.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_security_other_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_security_other_r;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_other_w() {
        if (ic_usr_Directory_security_other_w == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_security_other_w");
            String binding = bindingPrefix + "_usr_Directory_security_other_w.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_security_other_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_security_other_w;
    }

    /**
     * only one part of the bitmask
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_other_x() {
        if (ic_usr_Directory_security_other_x == null) {
            String label = bundle.getString("GUIShareFileAttributes.directory_security_other_x");
            String binding = bindingPrefix + "_usr_Directory_security_other_x.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Directory_security_other_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Directory_security_other_x;
    }

    public void reload() {
        super.reload();
        if (ic_CaseSensitive != null) {
            ic_CaseSensitive.setLabelText(bundle.getString("GUIShareFileAttributes.CaseSensitive"));
        }
        if (ic_HideDotFiles != null) {
            ic_HideDotFiles.setLabelText(bundle.getString("GUIShareFileAttributes.HideDotFiles"));
        }
        if (ic_DosFiletimes != null) {
            ic_DosFiletimes.setLabelText(bundle.getString("GUIShareFileAttributes.DosFiletimes"));
        }
        if (ic_EASupport != null) {
            ic_EASupport.setLabelText(bundle.getString("GUIShareFileAttributes.EASupport"));
        }
        if (ic_AclCompatibility != null) {
            ic_AclCompatibility.setLabelText(bundle
                    .getString("GUIShareFileAttributes.AclCompatibility"));
        }
        if (ic_NTACLSupport != null) {
            ic_NTACLSupport.setLabelText(bundle.getString("GUIShareFileAttributes.NTACLSupport"));
        }
        if (ic_usr_Create_u != null) {
            ic_usr_Create_u.setLabelText(bundle.getString("GUIShareFileAttributes.create_u"));
        }
        if (ic_usr_Create_g != null) {
            ic_usr_Create_g.setLabelText(bundle.getString("GUIShareFileAttributes.create_g"));
        }
        if (ic_usr_Create_s != null) {
            ic_usr_Create_s.setLabelText(bundle.getString("GUIShareFileAttributes.create_s"));
        }
        if (ic_usr_Create_user_r != null) {
            ic_usr_Create_user_r.setLabelText(bundle
                    .getString("GUIShareFileAttributes.create_user_r"));
        }
        if (ic_usr_Create_user_w != null) {
            ic_usr_Create_user_w.setLabelText(bundle
                    .getString("GUIShareFileAttributes.create_user_w"));
        }
        if (ic_usr_Create_user_x != null) {
            ic_usr_Create_user_x.setLabelText(bundle
                    .getString("GUIShareFileAttributes.create_user_x"));
        }
        if (ic_usr_Create_group_r != null) {
            ic_usr_Create_group_r.setLabelText(bundle
                    .getString("GUIShareFileAttributes.create_group_r"));
        }
        if (ic_usr_Create_group_w != null) {
            ic_usr_Create_group_w.setLabelText(bundle
                    .getString("GUIShareFileAttributes.create_group_w"));
        }
        if (ic_usr_Create_group_x != null) {
            ic_usr_Create_group_x.setLabelText(bundle
                    .getString("GUIShareFileAttributes.create_group_x"));
        }
        if (ic_usr_Create_other_r != null) {
            ic_usr_Create_other_r.setLabelText(bundle
                    .getString("GUIShareFileAttributes.create_other_r"));
        }
        if (ic_usr_Create_other_w != null) {
            ic_usr_Create_other_w.setLabelText(bundle
                    .getString("GUIShareFileAttributes.create_other_w"));
        }
        if (ic_usr_Create_other_x != null) {
            ic_usr_Create_other_x.setLabelText(bundle
                    .getString("GUIShareFileAttributes.create_other_x"));
        }
        if (ic_usr_Directory_u != null) {
            ic_usr_Directory_u.setLabelText(bundle.getString("GUIShareFileAttributes.directory_u"));
        }
        if (ic_usr_Directory_g != null) {
            ic_usr_Directory_g.setLabelText(bundle.getString("GUIShareFileAttributes.directory_g"));
        }
        if (ic_usr_Directory_s != null) {
            ic_usr_Directory_s.setLabelText(bundle.getString("GUIShareFileAttributes.directory_s"));
        }
        if (ic_usr_Directory_user_r != null) {
            ic_usr_Directory_user_r.setLabelText(bundle
                    .getString("GUIShareFileAttributes.directory_user_r"));
        }
        if (ic_usr_Directory_user_w != null) {
            ic_usr_Directory_user_w.setLabelText(bundle
                    .getString("GUIShareFileAttributes.directory_user_w"));
        }
        if (ic_usr_Directory_user_x != null) {
            ic_usr_Directory_user_x.setLabelText(bundle
                    .getString("GUIShareFileAttributes.directory_user_x"));
        }
        if (ic_usr_Directory_group_r != null) {
            ic_usr_Directory_group_r.setLabelText(bundle
                    .getString("GUIShareFileAttributes.directory_group_r"));
        }
        if (ic_usr_Directory_group_w != null) {
            ic_usr_Directory_group_w.setLabelText(bundle
                    .getString("GUIShareFileAttributes.directory_group_w"));
        }
        if (ic_usr_Directory_group_x != null) {
            ic_usr_Directory_group_x.setLabelText(bundle
                    .getString("GUIShareFileAttributes.directory_group_x"));
        }
        if (ic_usr_Directory_other_r != null) {
            ic_usr_Directory_other_r.setLabelText(bundle
                    .getString("GUIShareFileAttributes.directory_other_r"));
        }
        if (ic_usr_Directory_other_w != null) {
            ic_usr_Directory_other_w.setLabelText(bundle
                    .getString("GUIShareFileAttributes.directory_other_w"));
        }
        if (ic_usr_Directory_other_x != null) {
            ic_usr_Directory_other_x.setLabelText(bundle
                    .getString("GUIShareFileAttributes.directory_other_x"));
        }
        if (ic_usr_Directory_security_u != null) {
            ic_usr_Directory_security_u.setLabelText(bundle
                    .getString("GUIShareFileAttributes.directory_security_u"));
        }
        if (ic_usr_Directory_security_g != null) {
            ic_usr_Directory_security_g.setLabelText(bundle
                    .getString("GUIShareFileAttributes.directory_security_g"));
        }
        if (ic_usr_Directory_security_s != null) {
            ic_usr_Directory_security_s.setLabelText(bundle
                    .getString("GUIShareFileAttributes.directory_security_s"));
        }
        if (ic_usr_Directory_security_user_r != null) {
            ic_usr_Directory_security_user_r.setLabelText(bundle
                    .getString("GUIShareFileAttributes.directory_security_user_r"));
        }
        if (ic_usr_Directory_security_user_w != null) {
            ic_usr_Directory_security_user_w.setLabelText(bundle
                    .getString("GUIShareFileAttributes.directory_security_user_w"));
        }
        if (ic_usr_Directory_security_user_x != null) {
            ic_usr_Directory_security_user_x.setLabelText(bundle
                    .getString("GUIShareFileAttributes.directory_security_user_x"));
        }
        if (ic_usr_Directory_security_group_r != null) {
            ic_usr_Directory_security_group_r.setLabelText(bundle
                    .getString("GUIShareFileAttributes.directory_security_group_r"));
        }
        if (ic_usr_Directory_security_group_w != null) {
            ic_usr_Directory_security_group_w.setLabelText(bundle
                    .getString("GUIShareFileAttributes.directory_security_group_w"));
        }
        if (ic_usr_Directory_security_group_x != null) {
            ic_usr_Directory_security_group_x.setLabelText(bundle
                    .getString("GUIShareFileAttributes.directory_security_group_x"));
        }
        if (ic_usr_Directory_security_other_r != null) {
            ic_usr_Directory_security_other_r.setLabelText(bundle
                    .getString("GUIShareFileAttributes.directory_security_other_r"));
        }
        if (ic_usr_Directory_security_other_w != null) {
            ic_usr_Directory_security_other_w.setLabelText(bundle
                    .getString("GUIShareFileAttributes.directory_security_other_w"));
        }
        if (ic_usr_Directory_security_other_x != null) {
            ic_usr_Directory_security_other_x.setLabelText(bundle
                    .getString("GUIShareFileAttributes.directory_security_other_x"));
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
        fields.add(get_CaseSensitive());
        fields.add(get_HideDotFiles());
        fields.add(get_DosFiletimes());
        fields.add(get_EASupport());
        fields.add(get_AclCompatibility());
        fields.add(get_NTACLSupport());
        fields.add(get_usr_Create_u());
        fields.add(get_usr_Create_g());
        fields.add(get_usr_Create_s());
        fields.add(get_usr_Create_user_r());
        fields.add(get_usr_Create_user_w());
        fields.add(get_usr_Create_user_x());
        fields.add(get_usr_Create_group_r());
        fields.add(get_usr_Create_group_w());
        fields.add(get_usr_Create_group_x());
        fields.add(get_usr_Create_other_r());
        fields.add(get_usr_Create_other_w());
        fields.add(get_usr_Create_other_x());
        fields.add(get_usr_Directory_u());
        fields.add(get_usr_Directory_g());
        fields.add(get_usr_Directory_s());
        fields.add(get_usr_Directory_user_r());
        fields.add(get_usr_Directory_user_w());
        fields.add(get_usr_Directory_user_x());
        fields.add(get_usr_Directory_group_r());
        fields.add(get_usr_Directory_group_w());
        fields.add(get_usr_Directory_group_x());
        fields.add(get_usr_Directory_other_r());
        fields.add(get_usr_Directory_other_w());
        fields.add(get_usr_Directory_other_x());
        fields.add(get_usr_Directory_security_u());
        fields.add(get_usr_Directory_security_g());
        fields.add(get_usr_Directory_security_s());
        fields.add(get_usr_Directory_security_user_r());
        fields.add(get_usr_Directory_security_user_w());
        fields.add(get_usr_Directory_security_user_x());
        fields.add(get_usr_Directory_security_group_r());
        fields.add(get_usr_Directory_security_group_w());
        fields.add(get_usr_Directory_security_group_x());
        fields.add(get_usr_Directory_security_other_r());
        fields.add(get_usr_Directory_security_other_w());
        fields.add(get_usr_Directory_security_other_x());
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
        GUIShareFileAttributesImpl source = (GUIShareFileAttributesImpl) sourceContainer;

        get_CaseSensitive().setValue(source.get_CaseSensitive().getValue());
        get_HideDotFiles().setValue(source.get_HideDotFiles().getValue());
        get_DosFiletimes().setValue(source.get_DosFiletimes().getValue());
        get_EASupport().setValue(source.get_EASupport().getValue());
        get_AclCompatibility().setValue(source.get_AclCompatibility().getValue());
        get_NTACLSupport().setValue(source.get_NTACLSupport().getValue());
        get_usr_Create_u().setValue(source.get_usr_Create_u().getValue());
        get_usr_Create_g().setValue(source.get_usr_Create_g().getValue());
        get_usr_Create_s().setValue(source.get_usr_Create_s().getValue());
        get_usr_Create_user_r().setValue(source.get_usr_Create_user_r().getValue());
        get_usr_Create_user_w().setValue(source.get_usr_Create_user_w().getValue());
        get_usr_Create_user_x().setValue(source.get_usr_Create_user_x().getValue());
        get_usr_Create_group_r().setValue(source.get_usr_Create_group_r().getValue());
        get_usr_Create_group_w().setValue(source.get_usr_Create_group_w().getValue());
        get_usr_Create_group_x().setValue(source.get_usr_Create_group_x().getValue());
        get_usr_Create_other_r().setValue(source.get_usr_Create_other_r().getValue());
        get_usr_Create_other_w().setValue(source.get_usr_Create_other_w().getValue());
        get_usr_Create_other_x().setValue(source.get_usr_Create_other_x().getValue());
        get_usr_Directory_u().setValue(source.get_usr_Directory_u().getValue());
        get_usr_Directory_g().setValue(source.get_usr_Directory_g().getValue());
        get_usr_Directory_s().setValue(source.get_usr_Directory_s().getValue());
        get_usr_Directory_user_r().setValue(source.get_usr_Directory_user_r().getValue());
        get_usr_Directory_user_w().setValue(source.get_usr_Directory_user_w().getValue());
        get_usr_Directory_user_x().setValue(source.get_usr_Directory_user_x().getValue());
        get_usr_Directory_group_r().setValue(source.get_usr_Directory_group_r().getValue());
        get_usr_Directory_group_w().setValue(source.get_usr_Directory_group_w().getValue());
        get_usr_Directory_group_x().setValue(source.get_usr_Directory_group_x().getValue());
        get_usr_Directory_other_r().setValue(source.get_usr_Directory_other_r().getValue());
        get_usr_Directory_other_w().setValue(source.get_usr_Directory_other_w().getValue());
        get_usr_Directory_other_x().setValue(source.get_usr_Directory_other_x().getValue());
        get_usr_Directory_security_u().setValue(source.get_usr_Directory_security_u().getValue());
        get_usr_Directory_security_g().setValue(source.get_usr_Directory_security_g().getValue());
        get_usr_Directory_security_s().setValue(source.get_usr_Directory_security_s().getValue());
        get_usr_Directory_security_user_r().setValue(
                source.get_usr_Directory_security_user_r().getValue());
        get_usr_Directory_security_user_w().setValue(
                source.get_usr_Directory_security_user_w().getValue());
        get_usr_Directory_security_user_x().setValue(
                source.get_usr_Directory_security_user_x().getValue());
        get_usr_Directory_security_group_r().setValue(
                source.get_usr_Directory_security_group_r().getValue());
        get_usr_Directory_security_group_w().setValue(
                source.get_usr_Directory_security_group_w().getValue());
        get_usr_Directory_security_group_x().setValue(
                source.get_usr_Directory_security_group_x().getValue());
        get_usr_Directory_security_other_r().setValue(
                source.get_usr_Directory_security_other_r().getValue());
        get_usr_Directory_security_other_w().setValue(
                source.get_usr_Directory_security_other_w().getValue());
        get_usr_Directory_security_other_x().setValue(
                source.get_usr_Directory_security_other_x().getValue());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }

}