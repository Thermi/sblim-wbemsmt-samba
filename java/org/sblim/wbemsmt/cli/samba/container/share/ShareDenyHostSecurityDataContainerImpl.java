/** 
 * ShareDenyHostSecurityDataContainerImpl.java
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
 * Description: Container for DenyHosts within a share
 * 
 * generated Class
 */

package org.sblim.wbemsmt.cli.samba.container.share;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class ShareDenyHostSecurityDataContainerImpl extends BaseDataContainer implements
        org.sblim.wbemsmt.samba.bl.container.share.ShareDenyHostSecurityDataContainer {
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_DeniedHosts;
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_HostsToDeny;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_AddHost;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_RemoveHost;

    public ShareDenyHostSecurityDataContainerImpl(AbstractBaseCimAdapter adapter)
            throws WbemsmtException {
        super();
        setAdapter(adapter);
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType UNSIGNED_INT16
     * UIType LIST
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_DeniedHosts() {
        if (ic_usr_DeniedHosts == null) {
            String label = getAdapter().getBundle().getString(
                    "ShareDenyHostSecurityDataContainer.deniedHosts");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            ic_usr_DeniedHosts = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, null, converter);
        }
        return ic_usr_DeniedHosts;
    }

    /**
     * 
     * DataType UNSIGNED_INT16
     * UIType LIST
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_HostsToDeny() {
        if (ic_usr_HostsToDeny == null) {
            String label = getAdapter().getBundle().getString(
                    "ShareDenyHostSecurityDataContainer.hostsToDeny");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            ic_usr_HostsToDeny = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, null, converter);
        }
        return ic_usr_HostsToDeny;
    }

    /**
     * 
     * DataType ACTION
     * UIType BUTTON
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_AddHost() {
        if (ic_usr_AddHost == null) {
            String label = getAdapter().getBundle().getString(
                    "ShareDenyHostSecurityDataContainer.addHost");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_AddHost = new org.sblim.wbemsmt.tools.input.test.LabeledTestActionComponent(
                    this, label, null, converter);
        }
        return ic_usr_AddHost;
    }

    /**
     * 
     * DataType ACTION
     * UIType BUTTON
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_RemoveHost() {
        if (ic_usr_RemoveHost == null) {
            String label = getAdapter().getBundle().getString(
                    "ShareDenyHostSecurityDataContainer.removeHost");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_RemoveHost = new org.sblim.wbemsmt.tools.input.test.LabeledTestActionComponent(
                    this, label, null, converter);
        }
        return ic_usr_RemoveHost;
    }

    public void trace(java.io.PrintWriter printStream, String listOptions, boolean title) {
        if (title) {
            printStream.println(getAdapter().getBundle().getString(
                    "ShareDenyHostSecurityDataContainer.caption"));
        }

        if (showKey(listOptions)) {
            String key = getKey() != null ? getKey().toString() : "-";
            printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
        }

        if (showInstance(listOptions)) {
            if (get_usr_DeniedHosts().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_DeniedHosts())
                        .getValue();
                printStream.println(get_usr_DeniedHosts().getLabelText() + ": " + value);
            }
            if (get_usr_HostsToDeny().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_HostsToDeny())
                        .getValue();
                printStream.println(get_usr_HostsToDeny().getLabelText() + ": " + value);
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
        fields.add(get_usr_DeniedHosts());
        fields.add(get_usr_HostsToDeny());
        fields.add(get_usr_AddHost());
        fields.add(get_usr_RemoveHost());
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
        ShareDenyHostSecurityDataContainerImpl source = (ShareDenyHostSecurityDataContainerImpl) sourceContainer;

        get_usr_DeniedHosts().copyFrom(source.get_usr_DeniedHosts());
        get_usr_HostsToDeny().copyFrom(source.get_usr_HostsToDeny());
        get_usr_AddHost().copyFrom(source.get_usr_AddHost());
        get_usr_RemoveHost().copyFrom(source.get_usr_RemoveHost());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }
}