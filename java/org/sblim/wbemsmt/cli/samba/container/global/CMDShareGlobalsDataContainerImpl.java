/** 
 * CMDShareGlobalsDataContainerImpl.java
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
 * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/cmd/containerImpl.vm
 *
 * Contributors: 
 *   michael.bauschert@de.ibm.com
 * 
 * Description: Container with CLI-extension for global share settings
 * 
 * generated Class
 */

package org.sblim.wbemsmt.cli.samba.container.global;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class CMDShareGlobalsDataContainerImpl extends BaseDataContainer implements
        org.sblim.wbemsmt.samba.bl.container.global.CMDShareGlobalsDataContainer {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_CaseSensitive;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DosFiletimes;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_HideDotFiles;
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_AclCompatibility;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_EASupport;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_NTACLSupport;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_CreateMask;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DirectoryMask;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DirectorySecurityMask;

    public CMDShareGlobalsDataContainerImpl(AbstractBaseCimAdapter adapter) throws WbemsmtException {
        super();
        setAdapter(adapter);
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
            String label = getAdapter().getBundle().getString(
                    "CMDShareGlobalsDataContainer.CaseSensitive");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
            ic_CaseSensitive = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_CaseSensitive;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DosFiletimes() {
        if (ic_DosFiletimes == null) {
            String label = getAdapter().getBundle().getString(
                    "CMDShareGlobalsDataContainer.DosFiletimes");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
            ic_DosFiletimes = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_DosFiletimes;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_HideDotFiles() {
        if (ic_HideDotFiles == null) {
            String label = getAdapter().getBundle().getString(
                    "CMDShareGlobalsDataContainer.HideDotFiles");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
            ic_HideDotFiles = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_HideDotFiles;
    }

    /**
     * 
     * DataType UNSIGNED_INT8
     * UIType COMBOBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_AclCompatibility() {
        if (ic_AclCompatibility == null) {
            String label = getAdapter().getBundle().getString(
                    "CMDShareGlobalsDataContainer.AclCompatibility");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt8StringArrayConverter();
            ic_AclCompatibility = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, null, converter);
        }
        return ic_AclCompatibility;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_EASupport() {
        if (ic_EASupport == null) {
            String label = getAdapter().getBundle().getString(
                    "CMDShareGlobalsDataContainer.EASupport");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
            ic_EASupport = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,
                    label, null, converter);
        }
        return ic_EASupport;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_NTACLSupport() {
        if (ic_NTACLSupport == null) {
            String label = getAdapter().getBundle().getString(
                    "CMDShareGlobalsDataContainer.NTACLSupport");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
            ic_NTACLSupport = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_NTACLSupport;
    }

    /**
     * the Default Create Mask
     * DataType UNSIGNED_INT16
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_CreateMask() {
        if (ic_CreateMask == null) {
            String label = getAdapter().getBundle().getString(
                    "CMDShareGlobalsDataContainer.CreateMask");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
            ic_CreateMask = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,
                    label, null, converter);
        }
        return ic_CreateMask;
    }

    /**
     * The directory Mask
     * DataType UNSIGNED_INT16
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DirectoryMask() {
        if (ic_DirectoryMask == null) {
            String label = getAdapter().getBundle().getString(
                    "CMDShareGlobalsDataContainer.DirectoryMask");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
            ic_DirectoryMask = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_DirectoryMask;
    }

    /**
     * 
     * DataType UNSIGNED_INT16
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DirectorySecurityMask() {
        if (ic_DirectorySecurityMask == null) {
            String label = getAdapter().getBundle().getString(
                    "CMDShareGlobalsDataContainer.DirectorySecurityMask");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
            ic_DirectorySecurityMask = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_DirectorySecurityMask;
    }

    public void trace(java.io.PrintWriter printStream, String listOptions, boolean title) {
        if (title) {
            printStream.println(getAdapter().getBundle().getString(
                    "CMDShareGlobalsDataContainer.caption"));
        }

        if (showKey(listOptions)) {
            String key = getKey() != null ? getKey().toString() : "-";
            printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
        }

        if (showInstance(listOptions)) {
            if (get_CaseSensitive().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_CaseSensitive())
                        .getValue();
                printStream.println(get_CaseSensitive().getLabelText() + ": " + value);
            }
            if (get_DosFiletimes().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_DosFiletimes())
                        .getValue();
                printStream.println(get_DosFiletimes().getLabelText() + ": " + value);
            }
            if (get_HideDotFiles().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_HideDotFiles())
                        .getValue();
                printStream.println(get_HideDotFiles().getLabelText() + ": " + value);
            }
            if (get_AclCompatibility().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_AclCompatibility())
                        .getValue();
                printStream.println(get_AclCompatibility().getLabelText() + ": " + value);
            }
            if (get_EASupport().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_EASupport())
                        .getValue();
                printStream.println(get_EASupport().getLabelText() + ": " + value);
            }
            if (get_NTACLSupport().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_NTACLSupport())
                        .getValue();
                printStream.println(get_NTACLSupport().getLabelText() + ": " + value);
            }
            if (get_CreateMask().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_CreateMask())
                        .getValue();
                printStream.println(get_CreateMask().getLabelText() + ": " + value);
            }
            if (get_DirectoryMask().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_DirectoryMask())
                        .getValue();
                printStream.println(get_DirectoryMask().getLabelText() + ": " + value);
            }
            if (get_DirectorySecurityMask().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_DirectorySecurityMask())
                        .getValue();
                printStream.println(get_DirectorySecurityMask().getLabelText() + ": " + value);
            }
        }

        if (showChilds(listOptions)) {
            traceChilds(printStream, listOptions, title);
        }
    }

    public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title) {

    }

    /**
     * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
     * @return
     */
    public List getFields() {
        List fields = new ArrayList();
        fields.add(get_CaseSensitive());
        fields.add(get_DosFiletimes());
        fields.add(get_HideDotFiles());
        fields.add(get_AclCompatibility());
        fields.add(get_EASupport());
        fields.add(get_NTACLSupport());
        fields.add(get_CreateMask());
        fields.add(get_DirectoryMask());
        fields.add(get_DirectorySecurityMask());
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
        CMDShareGlobalsDataContainerImpl source = (CMDShareGlobalsDataContainerImpl) sourceContainer;

        get_CaseSensitive().copyFrom(source.get_CaseSensitive());
        get_DosFiletimes().copyFrom(source.get_DosFiletimes());
        get_HideDotFiles().copyFrom(source.get_HideDotFiles());
        get_AclCompatibility().copyFrom(source.get_AclCompatibility());
        get_EASupport().copyFrom(source.get_EASupport());
        get_NTACLSupport().copyFrom(source.get_NTACLSupport());
        get_CreateMask().copyFrom(source.get_CreateMask());
        get_DirectoryMask().copyFrom(source.get_DirectoryMask());
        get_DirectorySecurityMask().copyFrom(source.get_DirectorySecurityMask());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }
}