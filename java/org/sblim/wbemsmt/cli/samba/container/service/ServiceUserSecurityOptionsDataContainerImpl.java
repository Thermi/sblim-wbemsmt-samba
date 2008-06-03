/** 
 * ServiceUserSecurityOptionsDataContainerImpl.java
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
 * Description: Container for defining user related security options
 * 
 * generated Class
 */

package org.sblim.wbemsmt.cli.samba.container.service;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class ServiceUserSecurityOptionsDataContainerImpl extends BaseDataContainer implements
        org.sblim.wbemsmt.samba.bl.container.service.ServiceUserSecurityOptionsDataContainer,
        org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForServiceHeader {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_GuestUser;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_CurrentForceUser;
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_NewForceUser;

    private java.util.List icUserRights = new java.util.ArrayList();

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUserRightsHeader_SambaUserName;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUserRightsHeader_usr_AccessTypeVI;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUserRightsHeader_usr_AccessTypeRW;

    public ServiceUserSecurityOptionsDataContainerImpl(AbstractBaseCimAdapter adapter)
            throws WbemsmtException {
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

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_GuestUser() {
        if (ic_usr_GuestUser == null) {
            String label = getAdapter().getBundle().getString(
                    "ServiceUserSecurityOptionsDataContainer.guestUser");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_GuestUser = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_GuestUser;
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly true
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_CurrentForceUser() {
        if (ic_usr_CurrentForceUser == null) {
            String label = getAdapter().getBundle().getString(
                    "ServiceUserSecurityOptionsDataContainer.currentForceUser");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_CurrentForceUser = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_CurrentForceUser;
    }

    /**
     * 
     * DataType UNSIGNED_INT16
     * UIType COMBOBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_NewForceUser() {
        if (ic_usr_NewForceUser == null) {
            String label = getAdapter().getBundle().getString(
                    "ServiceUserSecurityOptionsDataContainer.newForceUser");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            ic_usr_NewForceUser = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, null, converter);
        }
        return ic_usr_NewForceUser;
    }

    /**
     * 
     * linked container UserACLItemDataContainerForService
     */
    public java.util.List getUserRights() {
        return icUserRights;
    }

    /**
     * Header for:
     * 
     * linked container UserACLItemDataContainerForService
     */
    public org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForServiceHeader getUserRightsHeader() {
        return this;
    }

    /**
     * Header for field SambaUserName
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUserRightsHeader_SambaUserName() {
        if (icUserRightsHeader_SambaUserName == null) {
            String label = getAdapter().getBundle().getString(
                    "UserACLItemDataContainerForService.SambaUserName");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icUserRightsHeader_SambaUserName = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icUserRightsHeader_SambaUserName;
    }

    /**
     * Header for field accessTypeVI
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUserRightsHeader_usr_AccessTypeVI() {
        if (icUserRightsHeader_usr_AccessTypeVI == null) {
            String label = getAdapter().getBundle().getString(
                    "UserACLItemDataContainerForService.accessTypeVI");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            icUserRightsHeader_usr_AccessTypeVI = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, "", converter);
        }
        return icUserRightsHeader_usr_AccessTypeVI;
    }

    /**
     * Header for field accessTypeRW
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUserRightsHeader_usr_AccessTypeRW() {
        if (icUserRightsHeader_usr_AccessTypeRW == null) {
            String label = getAdapter().getBundle().getString(
                    "UserACLItemDataContainerForService.accessTypeRW");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            icUserRightsHeader_usr_AccessTypeRW = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, "", converter);
        }
        return icUserRightsHeader_usr_AccessTypeRW;
    }

    public void trace(java.io.PrintWriter printStream, String listOptions, boolean title) {
        if (title) {
            printStream.println(getAdapter().getBundle().getString(
                    "ServiceUserSecurityOptionsDataContainer.caption"));
        }

        if (showKey(listOptions)) {
            String key = getKey() != null ? getKey().toString() : "-";
            printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
        }

        if (showInstance(listOptions)) {
            if (get_usr_GuestUser().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_GuestUser())
                        .getValue();
                printStream.println(get_usr_GuestUser().getLabelText() + ": " + value);
            }
            if (get_usr_CurrentForceUser().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_CurrentForceUser())
                        .getValue();
                printStream.println(get_usr_CurrentForceUser().getLabelText() + ": " + value);
            }
            if (get_usr_NewForceUser().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_NewForceUser())
                        .getValue();
                printStream.println(get_usr_NewForceUser().getLabelText() + ": " + value);
            }
        }

        if (showChilds(listOptions)) {
            traceChilds(printStream, listOptions, title);
        }
    }

    public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title) {
        List listuserRights = getUserRights();
        printStream.println();
        printStream.println(getAdapter().getBundle().getString(
                "ServiceUserSecurityOptionsDataContainer.role.userRights")
                + " "
                + getAdapter().getBundle().getString("items.found",
                        new Object[] { new Integer(listuserRights.size()) }));
        for (int i = 0; i < listuserRights.size(); i++) {
            BaseDataContainer child = (BaseDataContainer) listuserRights.get(i);
            printStream.println();
            printStream.println(getAdapter().getBundle().getString("item") + ": " + (i + 1) + " "
                    + getAdapter().getBundle().getString("of") + " " + listuserRights.size());
            child.trace(printStream, listOptions, false);
        }

    }

    /**
     * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
     * @return
     */
    public List getFields() {
        List fields = new ArrayList();
        fields.add(get_usr_GuestUser());
        fields.add(get_usr_CurrentForceUser());
        fields.add(get_usr_NewForceUser());
        return fields;
    }

    /**
     * Return a list of all associated childContainers. A childContainer is a DataContainer
     * @return
     */
    public List getChildContainers() {
        List childs = new ArrayList();
        childs.addAll(getUserRights());
        return childs;

    }

    public void copyFrom(DataContainer sourceContainer) throws WbemsmtException {
        ServiceUserSecurityOptionsDataContainerImpl source = (ServiceUserSecurityOptionsDataContainerImpl) sourceContainer;

        get_usr_GuestUser().copyFrom(source.get_usr_GuestUser());
        get_usr_CurrentForceUser().copyFrom(source.get_usr_CurrentForceUser());
        get_usr_NewForceUser().copyFrom(source.get_usr_NewForceUser());

        List targetListForUserRights = (List) getUserRights();
        List sourceListForUserRights = (List) source.getUserRights();
        if (sourceListForUserRights.size() != targetListForUserRights.size()) {
            throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                    "The Lists are not from same size. Source is " + sourceListForUserRights.size()
                            + " and target is " + targetListForUserRights.size());
        }
        for (int ii = 0; ii < sourceListForUserRights.size(); ii++) {
            ((DataContainer) targetListForUserRights.get(ii))
                    .copyFrom(((DataContainer) sourceListForUserRights.get(ii)));
        }

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }
}