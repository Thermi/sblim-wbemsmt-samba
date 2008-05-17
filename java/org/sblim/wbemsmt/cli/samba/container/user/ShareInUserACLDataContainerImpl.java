/** 
 * ShareInUserACLDataContainerImpl.java
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
 * Description: Container for the share-related acl within a user
 * 
 * generated Class
 */

package org.sblim.wbemsmt.cli.samba.container.user;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class ShareInUserACLDataContainerImpl extends BaseDataContainer implements
        org.sblim.wbemsmt.samba.bl.container.user.ShareInUserACLDataContainer,
        org.sblim.wbemsmt.samba.bl.container.share.ShareACLItemDataContainerHeader {

    private java.util.List icShares = new java.util.ArrayList();

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_ShareName;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_usr_AccessTypeVI;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_usr_AccessTypeRW;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_usr_Admin;

    public ShareInUserACLDataContainerImpl(AbstractBaseCimAdapter adapter) throws WbemsmtException {
        super();
        setAdapter(adapter);
        adapter.initContainer(this);
    }

    /**
     * 
     * linked container ShareACLItemDataContainer
     */
    public java.util.List getShares() {
        return icShares;
    }

    /**
     * Header for:
     * 
     * linked container ShareACLItemDataContainer
     */
    public org.sblim.wbemsmt.samba.bl.container.share.ShareACLItemDataContainerHeader getSharesHeader() {
        return this;
    }

    /**
     * Header for field shareName
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_ShareName() {
        if (icSharesHeader_ShareName == null) {
            String label = getAdapter().getBundle()
                    .getString("ShareACLItemDataContainer.shareName");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icSharesHeader_ShareName = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icSharesHeader_ShareName;
    }

    /**
     * Header for field accessTypeVI
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_usr_AccessTypeVI() {
        if (icSharesHeader_usr_AccessTypeVI == null) {
            String label = getAdapter().getBundle().getString(
                    "ShareACLItemDataContainer.accessTypeVI");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            icSharesHeader_usr_AccessTypeVI = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, "", converter);
        }
        return icSharesHeader_usr_AccessTypeVI;
    }

    /**
     * Header for field accessTypeRW
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_usr_AccessTypeRW() {
        if (icSharesHeader_usr_AccessTypeRW == null) {
            String label = getAdapter().getBundle().getString(
                    "ShareACLItemDataContainer.accessTypeRW");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            icSharesHeader_usr_AccessTypeRW = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, "", converter);
        }
        return icSharesHeader_usr_AccessTypeRW;
    }

    /**
     * Header for field admin
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_usr_Admin() {
        if (icSharesHeader_usr_Admin == null) {
            String label = getAdapter().getBundle().getString("ShareACLItemDataContainer.admin");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
            icSharesHeader_usr_Admin = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icSharesHeader_usr_Admin;
    }

    public void trace(java.io.PrintWriter printStream, String listOptions, boolean title) {
        if (title) {
            printStream.println(getAdapter().getBundle().getString(
                    "ShareInUserACLDataContainer.caption"));
        }

        if (showKey(listOptions)) {
            String key = getKey() != null ? getKey().toString() : "-";
            printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
        }

        if (showInstance(listOptions)) {
        }

        if (showChilds(listOptions)) {
            traceChilds(printStream, listOptions, title);
        }
    }

    public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title) {
        List listshares = getShares();
        printStream.println();
        printStream.println(getAdapter().getBundle().getString(
                "ShareInUserACLDataContainer.role.shares")
                + " "
                + getAdapter().getBundle().getString("items.found",
                        new Object[] { new Integer(listshares.size()) }));
        for (int i = 0; i < listshares.size(); i++) {
            BaseDataContainer child = (BaseDataContainer) listshares.get(i);
            printStream.println();
            printStream.println(getAdapter().getBundle().getString("item") + ": " + (i + 1) + " "
                    + getAdapter().getBundle().getString("of") + " " + listshares.size());
            child.trace(printStream, listOptions, false);
        }

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
        childs.addAll(getShares());
        return childs;

    }

    public void copyFrom(DataContainer sourceContainer) throws WbemsmtException {
        ShareInUserACLDataContainerImpl source = (ShareInUserACLDataContainerImpl) sourceContainer;

        List targetListForShares = (List) getShares();
        List sourceListForShares = (List) source.getShares();
        if (sourceListForShares.size() != targetListForShares.size()) {
            throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                    "The Lists are not from same size. Source is " + sourceListForShares.size()
                            + " and target is " + targetListForShares.size());
        }
        for (int ii = 0; ii < sourceListForShares.size(); ii++) {
            ((DataContainer) targetListForShares.get(ii))
                    .copyFrom(((DataContainer) sourceListForShares.get(ii)));
        }

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }
}