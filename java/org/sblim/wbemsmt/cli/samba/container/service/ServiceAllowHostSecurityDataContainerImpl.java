/** 
 * ServiceAllowHostSecurityDataContainerImpl.java
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
 * Description: Container to define AllowHosts
 * 
 * generated Class
 */

package org.sblim.wbemsmt.cli.samba.container.service;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class ServiceAllowHostSecurityDataContainerImpl extends BaseDataContainer implements
        org.sblim.wbemsmt.samba.bl.container.service.ServiceAllowHostSecurityDataContainer {
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_AllowedHosts;
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_HostsToAllow;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_AddHost;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_RemoveHost;

    public ServiceAllowHostSecurityDataContainerImpl(AbstractBaseCimAdapter adapter)
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

    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_AllowedHosts() {
        if (ic_usr_AllowedHosts == null) {
            String label = getAdapter().getBundle().getString(
                    "ServiceAllowHostSecurityDataContainer.allowedHosts");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            ic_usr_AllowedHosts = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, "", converter);
        }
        return ic_usr_AllowedHosts;
    }

    /**
     * 
     * DataType UNSIGNED_INT16
     * UIType LIST
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_HostsToAllow() {
        if (ic_usr_HostsToAllow == null) {
            String label = getAdapter().getBundle().getString(
                    "ServiceAllowHostSecurityDataContainer.hostsToAllow");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            ic_usr_HostsToAllow = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, "", converter);
        }
        return ic_usr_HostsToAllow;
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
                    "ServiceAllowHostSecurityDataContainer.addHost");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_AddHost = new org.sblim.wbemsmt.tools.input.test.LabeledTestActionComponent(
                    this, label, "", converter);
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
                    "ServiceAllowHostSecurityDataContainer.removeHost");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_RemoveHost = new org.sblim.wbemsmt.tools.input.test.LabeledTestActionComponent(
                    this, label, "", converter);
        }
        return ic_usr_RemoveHost;
    }

    public void trace(java.io.PrintWriter printStream, String listOptions, boolean title) {
        if (title) {
            printStream.println(getAdapter().getBundle().getString(
                    "ServiceAllowHostSecurityDataContainer.caption"));
        }

        if (showKey(listOptions)) {
            String key = getKey() != null ? getKey().toString() : "-";
            printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
        }

        if (showInstance(listOptions)) {
            if (get_usr_AllowedHosts().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_AllowedHosts())
                        .getValue();
                printStream.println(get_usr_AllowedHosts().getLabelText() + ": " + value);
            }
            if (get_usr_HostsToAllow().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_HostsToAllow())
                        .getValue();
                printStream.println(get_usr_HostsToAllow().getLabelText() + ": " + value);
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
        fields.add(get_usr_AllowedHosts());
        fields.add(get_usr_HostsToAllow());
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
        ServiceAllowHostSecurityDataContainerImpl source = (ServiceAllowHostSecurityDataContainerImpl) sourceContainer;

        get_usr_AllowedHosts().setValue(source.get_usr_AllowedHosts().getValue());
        get_usr_HostsToAllow().setValue(source.get_usr_HostsToAllow().getValue());
        get_usr_AddHost().setValue(source.get_usr_AddHost().getValue());
        get_usr_RemoveHost().setValue(source.get_usr_RemoveHost().getValue());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }
}