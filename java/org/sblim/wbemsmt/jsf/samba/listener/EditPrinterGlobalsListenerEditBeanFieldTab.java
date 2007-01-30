/** 
  * EditPrinterGlobalsListenerEditBeanFieldTab.java
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
  * @template: ./tools-dcg/templates/jsf/editBean.vm
  *
  * Contributors: 
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.listener;

import javax.faces.component.html.*;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.jsf.*;
import org.sblim.wbemsmt.tools.resources.*;
//import org.sblim.wbemsmt.tools.input.jsf.*;
import org.sblim.wbemsmt.bl.adapter.*;

public class EditPrinterGlobalsListenerEditBeanFieldTab extends EditBean {
	
	    
					
		private org.sblim.wbemsmt.jsf.samba.container.global.PrintingGlobalsDataContainerImpl currentEditContainer1;
		
		private	org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter1 = null;
		
		
		private HtmlPanelGrid panel;
	   
	    public EditPrinterGlobalsListenerEditBeanFieldTab()
		{
			super(ResourceBundleManager.getResourceBundle(new String[]{"messages","messagesSamba"},LocaleManager.getCurrent(FacesContext.getCurrentInstance()).getCurrentLocale()));		
		}

		public String save() throws ValidationException, ObjectSaveException
		{
			saveResult = new MessageList();
						MessageList result = null;
						
			
			
								int successCount = 0;
								
									
					//Saving Container PrintingGlobalsDataContainer
    				if (!saveResult.hasErrors())
    				{
        				adapter1.validateValues(currentEditContainer1);
        				result = currentEditContainer1.getMessagesList();
    					        				addValidationErrors(result,bundle);
    					    					
        				if (!result.hasErrors())
        				{
        					successCount++;
            				adapter1.save(currentEditContainer1);
    						try {
                				//update the child objects
                				                				
                            	                        		
    							String bindingPrefix = "objectActionController.editBeans['fieldTab'].containers[0].";
                    			int count = adapter1.count(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals.class);
                    			currentEditContainer1.getUsers().clear();
                    			for (int i=0; i < count; i++) {
                    				HtmlPanelGrid grid = i==0 ? null :((MultiLineBasePanel)currentEditContainer1.getUsers().get(0)).getInputFieldContainer();
                    				org.sblim.wbemsmt.jsf.samba.container.global.AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainerImpl child = new org.sblim.wbemsmt.jsf.samba.container.global.AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainerImpl(adapter1,bindingPrefix, i,grid);
                    				currentEditContainer1.getUsers().add(child);
									((MultiLineBasePanel)child).setFirst((MultiLineBasePanel)currentEditContainer1.getUsers().get(0));
                    			}
                    			if (count > 0) {
                					((MultiLineBasePanel)currentEditContainer1.getUsers().get(0)).setList(currentEditContainer1.getUsers());
                					((MultiLineBasePanel)currentEditContainer1.getUsers().get(0)).updateRows();
                				}
								
                            	    							adapter1.updateControls(currentEditContainer1);
    						} catch (Exception e) {
    							throw new ObjectSaveException("Canot update Model after saving data",e);
    						}
            			}
        				
						//Get the infos afte storing the values
        				result = currentEditContainer1.getMessagesList();
    					
    					            				if (result.hasErrors())
            				{
            					addSaveError(result,bundle);
            				}
            				else if (result.hasWarning())
            				{
            					addSaveWarning(result,bundle);
            				}
            				else if (result.hasInfo())
            				{
            					addSaveInfo(result,bundle);

            				}
    					    					
        				saveResult.addAll(result);
    				}
										    			
				if (successCount == 1)
    			{
        				addSaveSuccess(bundle);
    			}
			
						
			super.clearEditBeansModified();
			return PAGE_EDIT;
		}
		
		public void edit(ITaskLauncherTreeNode treeNode) throws ObjectNotFoundException, UpdateControlsException, CountException, InitContainerException
		{
		
			String bindingPrefix = null;
			HtmlPanelGrid childEditFields = null;
						int count = 0;
						panel = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);			
			panel.setWidth("100%");
			panel.setCellspacing("0");
			panel.setCellpadding("0");
			
			UIComponentBase addToThis = panel;
			
							panel.setStyleClass("editPanelNoTabs");
						TaskLauncherTreeNodeSelector selector = null;
			//CimObjectKey key = null;
			HtmlPanelGrid containerPanel = null;
			org.sblim.wbem.client.CIMClient cimClient = null;
	
			
								
				cimClient = treeNode.getCimClient();
				
				adapter1 = 
					(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)CimAdapterFactory.getInstance()
					.getAdapter(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter.class,FacesContext.getCurrentInstance(),cimClient);

				selector = new org.sblim.wbemsmt.bl.tree.CurrentTaskLauncherTreeNodeSelector();
				selector.select(treeNode,adapter1,"EditPrinterGlobals");

				adapter1 .setActiveModule(AbstractBaseCimAdapter.ACTIVE_EDIT);				
				
				//ADD THE FIELDS FOR CONTAINER PrintingGlobalsDataContainer in EditPanel ${editPanel.getId()}
				
				
				bindingPrefix = "objectActionController.editBeans['fieldTab'].containers[0].";

				//create cotainner
    			currentEditContainer1 = new org.sblim.wbemsmt.jsf.samba.container.global.PrintingGlobalsDataContainerImpl(adapter1,bindingPrefix);
				currentEditContainer1.getInputFieldContainer().setStyleClass("mainTable");
				containerPanel = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
				containerPanel.getChildren().add(currentEditContainer1.getInputFieldContainer());
				containerPanel.setWidth("100%");
    			containerPanel.setCellspacing("0");
    			containerPanel.setCellpadding("0");
    			    				containerPanel.setStyleClass("editPanelNoTabsOnlyContainers");
    			
				//update the child objects
								
            	    			count = adapter1.count(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals.class);
    			currentEditContainer1.getUsers().clear();
    			for (int i=0; i < count; i++) {
    				HtmlPanelGrid grid = i==0 ? null :((MultiLineBasePanel)currentEditContainer1.getUsers().get(0)).getInputFieldContainer();
    				org.sblim.wbemsmt.jsf.samba.container.global.AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainerImpl child = new org.sblim.wbemsmt.jsf.samba.container.global.AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainerImpl(adapter1,bindingPrefix, i,grid);
    				currentEditContainer1.getUsers().add(child);
					((MultiLineBasePanel)child).setFirst((MultiLineBasePanel)currentEditContainer1.getUsers().get(0));
    			}
    			if (count > 0) {
					((MultiLineBasePanel)currentEditContainer1.getUsers().get(0)).setList(currentEditContainer1.getUsers());
					((MultiLineBasePanel)currentEditContainer1.getUsers().get(0)).updateRows();
				}
            	    			
				
    			adapter1.updateControls(currentEditContainer1);
    			
    			childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
				childEditFields.setStyleClass("childTable");
    			

				//add the single childs
								
				//add the childs with occurence list
            						
    			if (currentEditContainer1.getUsers().size() > 0) {
    				HtmlPanelGrid childPanel = ((MultiLineBasePanel)currentEditContainer1.getUsers().get(0)).getOuterPanel();
					childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent.asJsfId("EditPrinterGlobalsChild_users"));
    				childEditFields.getChildren().add(childPanel); 	
    			}
    							
				addToThis.getChildren().add(containerPanel);
				containerPanel.getChildren().add(childEditFields);
				containers.add(currentEditContainer1);
				
            					
				addFooter(panel,"objectActionController.editBeans['fieldTab'].");
				
			
						addOKRevert(addToThis,"objectActionController.editBeans['fieldTab'].");
						
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