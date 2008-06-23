/** 
 * EditShareGlobalsListener.java
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
 * @template: org/sblim/wbemsmt/dcg/templates/jsf/editListener.vm
 *
 * Contributors: 
 *   michael.bauschert@de.ibm.com
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.jsf.samba.listener;

import java.util.*;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.tasklauncher.event.jsf.*;
import org.sblim.wbemsmt.bl.tree.*;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.jsf.*;
import org.sblim.wbemsmt.tools.resources.*;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.webapp.jsf.ObjectActionControllerBean;
import org.sblim.wbemsmt.bl.help.HelpManager;

public class EditShareGlobalsListener extends JsfEditListener {

    public String processEvent(TaskLauncherTreeNodeEvent event) throws WbemsmtException {

        ITaskLauncherTreeNode treeNode = event.getTreeNode();

        FacesContext fc = FacesContext.getCurrentInstance();
        Locale locale = LocaleManager.getCurrent(FacesContext.getCurrentInstance())
                .getCurrentLocale();
        bundle = ResourceBundleManager.getResourceBundle(
                new String[] { "messages", "messagesSamba" }, locale);
        final ObjectActionControllerBean oac = (ObjectActionControllerBean) BeanNameConstants.OBJECT_ACTION_CONTROLLER
                .asValueBinding(fc).getValue(fc);

        //set the currentListener as topic for the help
        final HelpManager helpManager = (HelpManager) BeanNameConstants.HELP_MANAGER
                .asValueBinding(fc).getValue(fc);
        helpManager.setMode(HelpManager.MODE_EDIT);
        helpManager.setCurrentTopic("SAMBA", "EditShareGlobalsListener");

        EditBean bean = null;

        Boolean revert = event.getBooleanParameter(TaskLauncherTreeNodeEvent.PARAM_REVERT);

        if (oac.getCurrentEditListener() != null && revert != null && revert.booleanValue()) {
            oac.getCurrentEditListener().revert(false);
        }

        oac.clearEditBeans();

        //ADD THE CONTAINERS WITH NO TAB			
        bean = new org.sblim.wbemsmt.jsf.samba.listener.EditShareGlobalsListenerEditBeanFieldTab();
        editBeans.add(bean);
        bean.edit(treeNode);
        oac.addEditBean("fieldTab", bean);
        oac.setCurrentEditor(bean.getPanel());

        oac.setCurrentEditListener(this);

        return "editPage";
    }
}