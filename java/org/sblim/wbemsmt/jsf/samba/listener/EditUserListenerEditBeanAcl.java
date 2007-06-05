/** 
  * EditUserListenerEditBeanAcl.java
  *

 
  * © Copyright IBM Corp. 2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE COMMON PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Common Public License from
  * http://www.opensource.org/licenses/cpl1.0.php
  *
  * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/jsf/editBean.vm
  *
  * Contributors: 
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.listener;

import javax.faces.component.*;
import javax.faces.component.html.*;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.jsf.*;
import org.sblim.wbemsmt.tools.resources.*;
//import org.sblim.wbemsmt.tools.input.jsf.*;
import org.sblim.wbemsmt.bl.adapter.*;

import org.apache.myfaces.custom.div.Div;


public class EditUserListenerEditBeanAcl extends EditBean {
	
	    
					
		private org.sblim.wbemsmt.jsf.samba.container.user.ShareInUserACLDataContainerImpl currentEditContainer1;
		
		private	org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter1 = null;
		
		
					
		private org.sblim.wbemsmt.jsf.samba.container.user.PrinterInUserACLDataContainerImpl currentEditContainer2;
		
		private	org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter2 = null;
		
		
		private HtmlPanelGrid panel;
	   
	    public EditUserListenerEditBeanAcl()
		{
			super(ResourceBundleManager.getResourceBundle(new String[]{"messages","messagesSamba"},LocaleManager.getCurrent(FacesContext.getCurrentInstance()).getCurrentLocale()));		
		}

		public String save() throws ValidationException, ObjectSaveException, UpdateControlsException
		{
			saveResult = new MessageList();
						MessageList result = null;
						
			
			
								int successCount = 0;
								
									
					//Saving Container ShareInUserACLDataContainer
    				if (!saveResult.hasErrors())
    				{
        				adapter1.validateValues(currentEditContainer1);
        				result = currentEditContainer1.getMessagesList();
    					    					
        				if (!result.hasErrors())
        				{
        					successCount++;
            				adapter1.save(currentEditContainer1);
							//update the container and children objects
							currentEditContainer1.updateControls();
            			}
        				
						//Get the infos afte storing the values
        				result = currentEditContainer1.getMessagesList();
    					
    					    					
        				saveResult.addAll(result);
    				}
							
								
									
					//Saving Container PrinterInUserACLDataContainer
    				if (!saveResult.hasErrors())
    				{
        				adapter2.validateValues(currentEditContainer2);
        				result = currentEditContainer2.getMessagesList();
    					    					
        				if (!result.hasErrors())
        				{
        					successCount++;
            				adapter2.save(currentEditContainer2);
							//update the container and children objects
							currentEditContainer2.updateControls();
            			}
        				
						//Get the infos afte storing the values
        				result = currentEditContainer2.getMessagesList();
    					
    					    					
        				saveResult.addAll(result);
    				}
										
						reloadAdapters();
			
			super.clearEditBeansModified();
			return PAGE_EDIT;
		}
		
		public void edit(ITaskLauncherTreeNode treeNode) throws ObjectNotFoundException, UpdateControlsException, CountException, InitContainerException
		{
		
			String bindingPrefix = null;
			HtmlPanelGrid childEditFields = null;
			Div div = null;
			panel = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);			
			panel.setWidth("100%");
			panel.setCellspacing("0");
			panel.setCellpadding("0");

			UIComponentBase addToThis = panel;
			
						TaskLauncherTreeNodeSelector selector = null;
			//CimObjectKey key = null;
			HtmlPanelGrid containerPanel = null;
			org.sblim.wbem.client.CIMClient cimClient = null;

			//This panel is added to container representing the tab. It's the ajaxPanel or the Panel containing the container and it's childs
			UIPanel panelToAdd= null;
			
								
				cimClient = treeNode.getCimClient();
				
				adapter1 = 
					(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)CimAdapterFactory.getInstance()
					.getAdapter(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter.class,FacesContext.getCurrentInstance(),cimClient);

				selector = new org.sblim.wbemsmt.bl.tree.CurrentTaskLauncherTreeNodeSelector();
				selector.select(treeNode,adapter1,"shareACL");

				adapter1 .setActiveModule(AbstractBaseCimAdapter.ACTIVE_EDIT);				
				
				//ADD THE FIELDS FOR CONTAINER ShareInUserACLDataContainer in EditPanel ${editPanel.getId()}
				
				
				bindingPrefix = "objectActionController.editBeans['acl'].containers[0].";
				

				//create cotainner
    			currentEditContainer1 = new org.sblim.wbemsmt.jsf.samba.container.user.ShareInUserACLDataContainerImpl(adapter1,bindingPrefix);
				currentEditContainer1.getPanelForCustomLayout().setStyleClass("mainTable");
				containerPanel = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
				containerPanel.getChildren().add(currentEditContainer1.getInputFieldContainer());
				containerPanel.setWidth("100%");
    			containerPanel.setCellspacing("0");
    			containerPanel.setCellpadding("0");
    			
				//update the child objects
								
				//update the container and children objects
				currentEditContainer1.updateControls();

    			childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
				childEditFields.setStyleClass("childTable");
    			
				//add the single childs
								
				//add the childs with occurence list
            						{
					HtmlPanelGrid childPanel = currentEditContainer1.getSharesPanel().getOuterPanel();
					childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent.asJsfId("shareACLChild_shares"));
    				childEditFields.getChildren().add(childPanel); 	
    				}
    			    			

				div = (Div) FacesContext.getCurrentInstance().getApplication().createComponent(Div.COMPONENT_TYPE);
				div.setStyleClass("divWrappingChildTable");
				div.getChildren().add(childEditFields);
				
				containerPanel.getChildren().add(div);

									panelToAdd = containerPanel;
								
				addToThis.getChildren().add(panelToAdd);

				containers.add(currentEditContainer1);
				
            					
				addFooter(panel,"objectActionController.editBeans['acl'].");
				
			
								
				cimClient = treeNode.getCimClient();
				
				adapter2 = 
					(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)CimAdapterFactory.getInstance()
					.getAdapter(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter.class,FacesContext.getCurrentInstance(),cimClient);

				selector = new org.sblim.wbemsmt.bl.tree.CurrentTaskLauncherTreeNodeSelector();
				selector.select(treeNode,adapter2,"printerACL");

				adapter2 .setActiveModule(AbstractBaseCimAdapter.ACTIVE_EDIT);				
				
				//ADD THE FIELDS FOR CONTAINER PrinterInUserACLDataContainer in EditPanel ${editPanel.getId()}
				
				
				bindingPrefix = "objectActionController.editBeans['acl'].containers[1].";
				

				//create cotainner
    			currentEditContainer2 = new org.sblim.wbemsmt.jsf.samba.container.user.PrinterInUserACLDataContainerImpl(adapter2,bindingPrefix);
				currentEditContainer2.getPanelForCustomLayout().setStyleClass("mainTable");
				containerPanel = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
				containerPanel.getChildren().add(currentEditContainer2.getInputFieldContainer());
				containerPanel.setWidth("100%");
    			containerPanel.setCellspacing("0");
    			containerPanel.setCellpadding("0");
    			
				//update the child objects
								
				//update the container and children objects
				currentEditContainer2.updateControls();

    			childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
				childEditFields.setStyleClass("childTable");
    			
				//add the single childs
								
				//add the childs with occurence list
            						{
					HtmlPanelGrid childPanel = currentEditContainer2.getPrintersPanel().getOuterPanel();
					childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent.asJsfId("printerACLChild_printers"));
    				childEditFields.getChildren().add(childPanel); 	
    				}
    			    			

				div = (Div) FacesContext.getCurrentInstance().getApplication().createComponent(Div.COMPONENT_TYPE);
				div.setStyleClass("divWrappingChildTable");
				div.getChildren().add(childEditFields);
				
				containerPanel.getChildren().add(div);

									panelToAdd = containerPanel;
								
				addToThis.getChildren().add(panelToAdd);

				containers.add(currentEditContainer2);
				
            					
				addFooter(panel,"objectActionController.editBeans['acl'].");
				
			
						//Creating no OK/Cancel-Button because saving single Tabs is disabled (EditAction.saveSinglePanels)
						
		}
		
		public HtmlPanelGrid getPanel()
		{
			return panel;
		}        

		//do nothing but to fullfill the java beans properties convention
		public void setPanel(HtmlPanelGrid grid)
		{
		}
		
       public void reload()
       {
	       super.reload();
       }
}