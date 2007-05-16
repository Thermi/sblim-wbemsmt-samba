/** 
  * EditPrinterListenerEditBeanPrinterAcl.java
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

public class EditPrinterListenerEditBeanPrinterAcl extends EditBean {
	
	    
					
		private org.sblim.wbemsmt.jsf.samba.container.printer.UserInPrinterACLDataContainerImpl currentEditContainer1;
		
		private	org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter1 = null;
		
		
		private HtmlPanelGrid panel;
	   
	    public EditPrinterListenerEditBeanPrinterAcl()
		{
			super(ResourceBundleManager.getResourceBundle(new String[]{"messages","messagesSamba"},LocaleManager.getCurrent(FacesContext.getCurrentInstance()).getCurrentLocale()));		
		}

		public String save() throws ValidationException, ObjectSaveException
		{
			saveResult = new MessageList();
						MessageList result = null;
						
			
			
								int successCount = 0;
								
									
					//Saving Container UserInPrinterACLDataContainer
    				if (!saveResult.hasErrors())
    				{
        				adapter1.validateValues(currentEditContainer1);
        				result = currentEditContainer1.getMessagesList();
    					    					
        				if (!result.hasErrors())
        				{
        					successCount++;
            				adapter1.save(currentEditContainer1);
    						try {
                				//update the child objects
                				                				
                            	                        		
    							String bindingPrefix = "objectActionController.editBeans['printerAcl'].containers[0].";
                    			int count = adapter1.count(org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinter.class);

                    			currentEditContainer1.clearUsers();
                    			currentEditContainer1.addUsersHeader();
                    			
                    			for (int i=0; i < count; i++) {
	                    			currentEditContainer1.addUsers(new org.sblim.wbemsmt.jsf.samba.container.printer.UserACLItemDataContainerForPrinter_AsUsers_InUserInPrinterACLDataContainerImpl(adapter1,bindingPrefix, i));
                    			}

                    			currentEditContainer1.getUsersPanel().setList(currentEditContainer1.getUsers());
								
                            	    							adapter1.updateControls(currentEditContainer1);
    							
                            		                    			currentEditContainer1.getUsersPanel().updateRows();
								    							
    						} catch (Exception e) {
    							throw new ObjectSaveException("Canot update Model after saving data",e);
    						}
            			}
        				
						//Get the infos afte storing the values
        				result = currentEditContainer1.getMessagesList();
    					
    					    					
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
				selector.select(treeNode,adapter1,"editPrinterAcl");

				adapter1 .setActiveModule(AbstractBaseCimAdapter.ACTIVE_EDIT);				
				
				//ADD THE FIELDS FOR CONTAINER UserInPrinterACLDataContainer in EditPanel ${editPanel.getId()}
				
				
				bindingPrefix = "objectActionController.editBeans['printerAcl'].containers[0].";
				

				//create cotainner
    			currentEditContainer1 = new org.sblim.wbemsmt.jsf.samba.container.printer.UserInPrinterACLDataContainerImpl(adapter1,bindingPrefix);
				currentEditContainer1.getPanelForCustomLayout().setStyleClass("mainTable");
				containerPanel = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
				containerPanel.getChildren().add(currentEditContainer1.getInputFieldContainer());
				containerPanel.setWidth("100%");
    			containerPanel.setCellspacing("0");
    			containerPanel.setCellpadding("0");
    			
				//update the child objects
								
            					{
	    		
	    			int count = adapter1.count(org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinter.class);
	    			
        			currentEditContainer1.clearUsers();
        			currentEditContainer1.addUsersHeader();
	    			
        			for (int i=0; i < count; i++) {
            			currentEditContainer1.addUsers(new org.sblim.wbemsmt.jsf.samba.container.printer.UserACLItemDataContainerForPrinter_AsUsers_InUserInPrinterACLDataContainerImpl(adapter1,bindingPrefix, i));
        			}

        			currentEditContainer1.getUsersPanel().setList(currentEditContainer1.getUsers());
				}
            					adapter1.updateControls(currentEditContainer1);

            	        			currentEditContainer1.getUsersPanel().updateRows();
				    			
    			childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
				childEditFields.setStyleClass("childTable");
    			

				//add the single childs
								
				//add the childs with occurence list
            						{
					HtmlPanelGrid childPanel = currentEditContainer1.getUsersPanel().getOuterPanel();
					childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent.asJsfId("editPrinterAclChild_users"));
    				childEditFields.getChildren().add(childPanel); 	
    				}
    							
				containerPanel.getChildren().add(childEditFields);

									panelToAdd = containerPanel;
								
				addToThis.getChildren().add(panelToAdd);

				containers.add(currentEditContainer1);
				
            					
				addFooter(panel,"objectActionController.editBeans['printerAcl'].");
				
			
						
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