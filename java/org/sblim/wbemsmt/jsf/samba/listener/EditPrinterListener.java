/** 
  * EditPrinterListener.java
  *

 
 * � Copyright IBM Corp. 2005
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
import org.sblim.wbemsmt.bl.help.HelpManager;

public class EditPrinterListener extends JsfEditListener {

	private List editBeans = new ArrayList();

	public String processEvent(TaskLauncherTreeNodeEvent event) throws WbemSmtException {

			ITaskLauncherTreeNode treeNode = event.getTreeNode();

			
			FacesContext fc = FacesContext.getCurrentInstance();
			Locale locale = LocaleManager.getCurrent(FacesContext.getCurrentInstance()).getCurrentLocale();
        	bundle = ResourceBundleManager.getResourceBundle(new String[]{"messages","messagesSamba"},locale);
            final ObjectActionControllerBean oac = (ObjectActionControllerBean)BeanNameConstants.OBJECT_ACTION_CONTROLLER.asValueBinding(fc).getValue(fc);
			
			//set the currentListener as topic for the help
            final HelpManager helpManager = (HelpManager)BeanNameConstants.HELP_MANAGER.asValueBinding(fc).getValue(fc);
			helpManager.setMode(HelpManager.MODE_EDIT);
			helpManager.setCurrentTopic("SAMBA","EditPrinterListener");
			
			EditBean bean = null;

			if (oac.getCurrentEditListener() != null)
			{
				oac.getCurrentEditListener().revert(false);
			}

    		oac.clearEditBeans();
			
			
							TabbedPane tabbedPane = new TabbedPane(bundle);
				String bundleKey;
						
			
	        
							
				//ADD THE CONTAINERS IN TAB printerGeneral			
    			bean = new org.sblim.wbemsmt.jsf.samba.listener.EditPrinterListenerEditBeanPrinterGeneral();
				editBeans.add(bean);
    			bean.edit(treeNode);
    			oac.addEditBean("printerGeneral",bean);
        		bundleKey = "tab.printerGeneral";
        		tabbedPane.addTab("printerGeneral",bundleKey,bean.getPanel());
    						
				//ADD THE CONTAINERS IN TAB printerAcl			
    			bean = new org.sblim.wbemsmt.jsf.samba.listener.EditPrinterListenerEditBeanPrinterAcl();
				editBeans.add(bean);
    			bean.edit(treeNode);
    			oac.addEditBean("printerAcl",bean);
        		bundleKey = "tab.printerAcl";
        		tabbedPane.addTab("printerAcl",bundleKey,bean.getPanel());
    		    			
							boolean createOKRevertButtons = ! false && true;
    			tabbedPane.create(createOKRevertButtons);
				oac.setCurrentEditor(tabbedPane.getPanel());
    			oac.setSelectedTabIndex(0);
				oac.setTabbedPane(tabbedPane);
						oac.setCurrentEditListener(this);
			
			return "editPage";		
	}
}