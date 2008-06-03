/** 
 * WelcomeDataContainerImpl.java
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
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.cli.samba.container.welcome;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class WelcomeDataContainerImpl extends BaseDataContainer implements
        org.sblim.wbemsmt.samba.bl.container.welcome.WelcomeDataContainer {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_WelcomeText;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_SharePicture;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_LinkCreateShare;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Memo;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_LinkCreatePrinter;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_LinkCreateUser;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Actions;

    public WelcomeDataContainerImpl(AbstractBaseCimAdapter adapter) throws WbemsmtException {
        super();
        setAdapter(adapter);
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly true
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_WelcomeText() {
        if (ic_usr_WelcomeText == null) {
            String label = getAdapter().getBundle().getString("WelcomeDataContainer.welcomeText");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_WelcomeText = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_WelcomeText;
    }

    /**
     * 
     * DataType PICTUREDATA
     * UIType PICTURE
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_SharePicture() {
        if (ic_usr_SharePicture == null) {
            String label = getAdapter().getBundle().getString("WelcomeDataContainer.sharePicture");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.cli.NotSupportedConverter();
            ic_usr_SharePicture = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_SharePicture;
    }

    /**
     * 
     * DataType LINKDATA
     * UIType LINK
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_LinkCreateShare() {
        if (ic_usr_LinkCreateShare == null) {
            String label = getAdapter().getBundle().getString(
                    "WelcomeDataContainer.linkCreateShare");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.cli.NotSupportedConverter();
            ic_usr_LinkCreateShare = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_LinkCreateShare;
    }

    /**
     * 
     * DataType MEMODATA
     * UIType MEMO
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Memo() {
        if (ic_usr_Memo == null) {
            String label = getAdapter().getBundle().getString("WelcomeDataContainer.memo");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.cli.MemoDataConverter();
            ic_usr_Memo = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,
                    label, null, converter);
        }
        return ic_usr_Memo;
    }

    /**
     * 
     * DataType LINKDATA
     * UIType LINK
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_LinkCreatePrinter() {
        if (ic_usr_LinkCreatePrinter == null) {
            String label = getAdapter().getBundle().getString(
                    "WelcomeDataContainer.linkCreatePrinter");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.cli.NotSupportedConverter();
            ic_usr_LinkCreatePrinter = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_LinkCreatePrinter;
    }

    /**
     * 
     * DataType LINKDATA
     * UIType LINK
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_LinkCreateUser() {
        if (ic_usr_LinkCreateUser == null) {
            String label = getAdapter().getBundle()
                    .getString("WelcomeDataContainer.linkCreateUser");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.cli.NotSupportedConverter();
            ic_usr_LinkCreateUser = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_LinkCreateUser;
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Actions() {
        if (ic_usr_Actions == null) {
            String label = getAdapter().getBundle().getString("WelcomeDataContainer.actions");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Actions = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,
                    label, null, converter);
        }
        return ic_usr_Actions;
    }

    public void trace(java.io.PrintWriter printStream, String listOptions, boolean title) {
        if (title) {
            printStream.println(getAdapter().getBundle().getString("WelcomeDataContainer.caption"));
        }

        if (showKey(listOptions)) {
            String key = getKey() != null ? getKey().toString() : "-";
            printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
        }

        if (showInstance(listOptions)) {
            if (get_usr_WelcomeText().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_WelcomeText())
                        .getValue();
                printStream.println(get_usr_WelcomeText().getLabelText() + ": " + value);
            }
            //Field _usr_SharePicture not supported for cli
            //Field _usr_LinkCreateShare not supported for cli
            if (get_usr_Memo().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Memo())
                        .getValue();
                printStream.println(get_usr_Memo().getLabelText() + ": " + value);
            }
            //Field _usr_LinkCreatePrinter not supported for cli
            //Field _usr_LinkCreateUser not supported for cli
            if (get_usr_Actions().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Actions())
                        .getValue();
                printStream.println(get_usr_Actions().getLabelText() + ": " + value);
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
        fields.add(get_usr_WelcomeText());
        fields.add(get_usr_SharePicture());
        fields.add(get_usr_LinkCreateShare());
        fields.add(get_usr_Memo());
        fields.add(get_usr_LinkCreatePrinter());
        fields.add(get_usr_LinkCreateUser());
        fields.add(get_usr_Actions());
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
        WelcomeDataContainerImpl source = (WelcomeDataContainerImpl) sourceContainer;

        get_usr_WelcomeText().copyFrom(source.get_usr_WelcomeText());
        get_usr_SharePicture().copyFrom(source.get_usr_SharePicture());
        get_usr_LinkCreateShare().copyFrom(source.get_usr_LinkCreateShare());
        get_usr_Memo().copyFrom(source.get_usr_Memo());
        get_usr_LinkCreatePrinter().copyFrom(source.get_usr_LinkCreatePrinter());
        get_usr_LinkCreateUser().copyFrom(source.get_usr_LinkCreateUser());
        get_usr_Actions().copyFrom(source.get_usr_Actions());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }
}