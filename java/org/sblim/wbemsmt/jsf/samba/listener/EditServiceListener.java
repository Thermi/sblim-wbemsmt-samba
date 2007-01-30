/** 
  * EditServiceListener.java
  *

 
 * (C) Copyright IBM Corp. 2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE COMMON PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Common Public License from
  * http://www.opensource.org/licenses/cpl1.0.php
  *
  * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
  * @template: ./tools-dcg/templates/jsf/editListener.vm
  *
  * Contributors: 
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.listener;

import java.util.*;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.tasklauncher.event.jsf.*;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEvent;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.jsf.*;
import org.sblim.wbemsmt.tools.resources.*;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.webapp.jsf.ObjectActionControllerBean;

public class EditServiceListener extends JsfEditListener {

	private List editBeans = new ArrayList();

	public String processEvent(TaskLauncherTreeNodeEvent event) throws WbemSmtException {

			ITaskLauncherTreeNode treeNode = event.getTreeNode();

			
			FacesContext fc = FacesContext.getCurrentInstance();
			Locale locale = LocaleManager.getCurrent(FacesContext.getCurrentInstance()).getCurrentLocale();
        	bundle = ResourceBundleManager.getResourceBundle(new String[]{"messages","messagesSamba"},locale);
            final ObjectActionControllerBean oac = (ObjectActionControllerBean)BeanNameConstants.OBJECT_ACTION_CONTROLLER.asValueBinding(fc).getValue(fc);
			EditBean bean = null;

			if (oac.getCurrentEditListener() != null)
			{
				oac.getCurrentEditListener().revert(false);
			}

    		oac.clearEditBeans();
			
			
							TabbedPane tabbedPane = new TabbedPane(bundle);
				String bundleKey;
						
			
	        
							
				//ADD THE CONTAINERS IN TAB tabServiceOptions			
    			bean = new org.sblim.wbemsmt.jsf.samba.listener.EditServiceListenerEditBeanTabServiceOptions();
				editBeans.add(bean);
    			bean.edit(treeNode);
    			oac.addEditBean("tabServiceOptions",bean);
        		bundleKey = "tab.tabServiceOptions";
        		tabbedPane.addTab("tabServiceOptions",bundleKey,bean.getPanel());
    						
				//ADD THE CONTAINERS IN TAB tabSecurity			
    			bean = new org.sblim.wbemsmt.jsf.samba.listener.EditServiceListenerEditBeanTabSecurity();
				editBeans.add(bean);
    			bean.edit(treeNode);
    			oac.addEditBean("tabSecurity",bean);
        		bundleKey = "tab.tabSecurity";
        		tabbedPane.addTab("tabSecurity",bundleKey,bean.getPanel());
    						
				//ADD THE CONTAINERS IN TAB tabOperations			
    			bean = new org.sblim.wbemsmt.jsf.samba.listener.EditServiceListenerEditBeanTabOperations();
				editBeans.add(bean);
    			bean.edit(treeNode);
    			oac.addEditBean("tabOperations",bean);
        		bundleKey = "tab.tabOperations";
        		tabbedPane.addTab("tabOperations",bundleKey,bean.getPanel());
    		    			
							boolean createOKRevertButtons = ! false && true;
    			tabbedPane.create(createOKRevertButtons);
				oac.setCurrentEditor(tabbedPane.getPanel());
    			oac.setSelectedTabIndex(0);
				oac.setTabbedPane(tabbedPane);
						oac.setCurrentEditListener(this);
			
			return "editPage";		
	}
}