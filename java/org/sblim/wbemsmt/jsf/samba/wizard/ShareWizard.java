/** 
  * ShareWizard.java
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
  * @template: ./tools-dcg/templates/jsf/wizardClass.vm
  *
  * Contributors: 
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.wizard;

import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.context.FacesContext;

//import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
//import org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel;
import org.sblim.wbemsmt.tools.resources.LocaleManager;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.wizard.adapter.IPageWizardAdapter;
import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;
import org.sblim.wbemsmt.tools.wizard.jsf.JSFWizardBase;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.bl.adapter.DataContainer;

public class ShareWizard extends JSFWizardBase implements IPageWizardAdapter {

	private org.sblim.wbemsmt.samba.wizard.ShareWizardContainer container = null;
	
	String binding = "objectActionController.currentWizard.currentPanel.";
	
		org.sblim.wbemsmt.jsf.samba.container.wizard.ShareWizardPage1Impl panel1 = null;
		org.sblim.wbemsmt.jsf.samba.container.wizard.ShareWizardPage2Impl panel2 = null;
		org.sblim.wbemsmt.jsf.samba.container.wizard.ShareWizardPage4Impl panel3 = null;
		
	final org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter;
	
	public ShareWizard(final org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter) {
		super(adapter,ResourceBundleManager.getResourceBundle(new String[]{"messages","messagesSamba"},LocaleManager.getCurrent(FacesContext.getCurrentInstance()).getCurrentLocale()));
		this.adapter = adapter;
		this.container = new org.sblim.wbemsmt.samba.wizard.ShareWizardContainer (new org.sblim.wbemsmt.samba.wizard.ShareWizardContainerPanels()
 			{
            						//update the child objects
    				
					public Object getPage1() throws WbemSmtException
					{
						//Workaround for Bug https://issues.apache.org/jira/browse/MYFACES-1438
						//Create the panel everytime the panel is needed 
						//if (panel1!= null)
						//{
						//	return panel1;
						//}
					
						try
						{
							    						panel1= new org.sblim.wbemsmt.jsf.samba.container.wizard.ShareWizardPage1Impl(adapter,binding);
                                					
    						HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
            				childEditFields.setStyleClass("childTable");
                			
            
            				//add the single childs
            				            				
            				//add the childs with occurence list
                        	            				panel1.getChildPanel().getChildren().add(childEditFields);
							
							
        					return panel1;
						}
						catch (Exception e)
						{
							throw new WbemSmtException("Cannot process Wizard shareWizard",e);
						}
    				}
            						//update the child objects
    				
					public Object getPage2() throws WbemSmtException
					{
						//Workaround for Bug https://issues.apache.org/jira/browse/MYFACES-1438
						//Create the panel everytime the panel is needed 
						//if (panel2!= null)
						//{
						//	return panel2;
						//}
					
						try
						{
														int count = 0;
							    						panel2= new org.sblim.wbemsmt.jsf.samba.container.wizard.ShareWizardPage2Impl(adapter,binding);
                                                            count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer.class);
                                panel2.getUsers().clear();
                                for (int i=0; i < count; i++) {
                                	HtmlPanelGrid grid = i==0 ? null :((org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel)panel2.getUsers().get(0)).getInputFieldContainer();
                                	org.sblim.wbemsmt.jsf.samba.container.wizard.UserInShareWizardACLItemDataContainer_AsUsers_InShareWizardPage2Impl child = new org.sblim.wbemsmt.jsf.samba.container.wizard.UserInShareWizardACLItemDataContainer_AsUsers_InShareWizardPage2Impl(adapter,binding, i,grid);
                                	panel2.getUsers().add(child);
                                }
                                					
    						HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
            				childEditFields.setStyleClass("childTable");
                			
            
            				//add the single childs
            				            				
            				//add the childs with occurence list
                        	            					
                			if (panel2.getUsers().size() > 0) {
                				HtmlPanelGrid childPanel = ((org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel)panel2.getUsers().get(0)).getInputFieldContainer();
            					childPanel.setStyleClass("childTable");
            					childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent.asJsfId("page2Child_users"));
                				childEditFields.getChildren().add(childPanel); 	
                			}
                			            				panel2.getChildPanel().getChildren().add(childEditFields);
							
							
        					return panel2;
						}
						catch (Exception e)
						{
							throw new WbemSmtException("Cannot process Wizard shareWizard",e);
						}
    				}
            						//update the child objects
    				
					public Object getPage4() throws WbemSmtException
					{
						//Workaround for Bug https://issues.apache.org/jira/browse/MYFACES-1438
						//Create the panel everytime the panel is needed 
						//if (panel3!= null)
						//{
						//	return panel3;
						//}
					
						try
						{
														int count = 0;
							    						panel3= new org.sblim.wbemsmt.jsf.samba.container.wizard.ShareWizardPage4Impl(adapter,binding);
                                                            count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer.class);
                                panel3.getUsers().clear();
                                for (int i=0; i < count; i++) {
                                	HtmlPanelGrid grid = i==0 ? null :((org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel)panel3.getUsers().get(0)).getInputFieldContainer();
                                	org.sblim.wbemsmt.jsf.samba.container.wizard.UserInShareWizardACLItemDataContainer_AsUsers_InShareWizardPage4Impl child = new org.sblim.wbemsmt.jsf.samba.container.wizard.UserInShareWizardACLItemDataContainer_AsUsers_InShareWizardPage4Impl(adapter,binding, i,grid);
                                	panel3.getUsers().add(child);
                                }
                                					
    						HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
            				childEditFields.setStyleClass("childTable");
                			
            
            				//add the single childs
            				            				
            				//add the childs with occurence list
                        	            					
                			if (panel3.getUsers().size() > 0) {
                				HtmlPanelGrid childPanel = ((org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel)panel3.getUsers().get(0)).getInputFieldContainer();
            					childPanel.setStyleClass("childTable");
            					childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent.asJsfId("page4Child_users"));
                				childEditFields.getChildren().add(childPanel); 	
                			}
                			            				panel3.getChildPanel().getChildren().add(childEditFields);
							
							
        					return panel3;
						}
						catch (Exception e)
						{
							throw new WbemSmtException("Cannot process Wizard shareWizard",e);
						}
    				}
            	 			});
		super.initialize();
 		try {
 			super.initWizard((IWizardContainer)container, this);
 		} catch (Exception ex) {
 			ex.printStackTrace();
 			return;
 		}
 		logger.fine("Wizard initialized");
	}
	
	public void cleanUPPage(String panelName) {
		//cleanup is done in the adapter
	}

	
    public boolean savePageValues(String actualPanelName) {
    	//save pageValues is done in the JSFWizardBase.next-Method, delegating the call to the adapter
    	return true;
    }
	
	public IWizardContainer getWizardContainer()
	{
		return container;
	}
	

    public void setSummaryText(String nextPanelName) {
    	//adapter-based wizards having no SummaryText
    	//if wanted a method like getSummaryText shoule be imlemented in AbstractBaseCimAdapter
    }
    
   public String wizardComplete() {
	   //everything necessary for completion is done in the Adaper
	   return "";
   }
   
   public void reload()
   {
     //do nothing
   }
   
	public void countAndCreateChilds(DataContainer dataContainer) throws UpdateControlsException {
            						if (dataContainer instanceof org.sblim.wbemsmt.jsf.samba.container.wizard.ShareWizardPage1Impl)
					{
        				    					//update the child objects
        										try
						{
							
                                					
    						HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
            				childEditFields.setStyleClass("childTable");
                			
            				//add the childs with occurence list
                        								panel1.getChildPanel().getChildren().clear();
            				panel1.getChildPanel().getChildren().add(childEditFields);
						}
						catch (Exception e)
						{
							throw new UpdateControlsException("Cannot process Wizard shareWizard",e);
						}
    				}
            						if (dataContainer instanceof org.sblim.wbemsmt.jsf.samba.container.wizard.ShareWizardPage2Impl)
					{
        				    					//update the child objects
        										try
						{
														int count = 0;
							
                            								
                                count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer.class);
                                panel2.getUsers().clear();
                                for (int i=0; i < count; i++) {
                                	HtmlPanelGrid grid = i==0 ? null :((org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel)panel2.getUsers().get(0)).getInputFieldContainer();
                                	org.sblim.wbemsmt.jsf.samba.container.wizard.UserInShareWizardACLItemDataContainer_AsUsers_InShareWizardPage2Impl child = new org.sblim.wbemsmt.jsf.samba.container.wizard.UserInShareWizardACLItemDataContainer_AsUsers_InShareWizardPage2Impl(adapter,binding, i,grid);
                                	panel2.getUsers().add(child);
                                }
                                					
    						HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
            				childEditFields.setStyleClass("childTable");
                			
            				//add the childs with occurence list
                        	            					
                			if (panel2.getUsers().size() > 0) {
                				HtmlPanelGrid childPanel = ((org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel)panel2.getUsers().get(0)).getInputFieldContainer();
            					childPanel.setStyleClass("childTable");
            					childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent.asJsfId("page2Child_users"));
                				childEditFields.getChildren().add(childPanel); 	
                			}
														panel2.getChildPanel().getChildren().clear();
            				panel2.getChildPanel().getChildren().add(childEditFields);
						}
						catch (Exception e)
						{
							throw new UpdateControlsException("Cannot process Wizard shareWizard",e);
						}
    				}
            						if (dataContainer instanceof org.sblim.wbemsmt.jsf.samba.container.wizard.ShareWizardPage4Impl)
					{
        				    					//update the child objects
        										try
						{
														int count = 0;
							
                            								
                                count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer.class);
                                panel3.getUsers().clear();
                                for (int i=0; i < count; i++) {
                                	HtmlPanelGrid grid = i==0 ? null :((org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel)panel3.getUsers().get(0)).getInputFieldContainer();
                                	org.sblim.wbemsmt.jsf.samba.container.wizard.UserInShareWizardACLItemDataContainer_AsUsers_InShareWizardPage4Impl child = new org.sblim.wbemsmt.jsf.samba.container.wizard.UserInShareWizardACLItemDataContainer_AsUsers_InShareWizardPage4Impl(adapter,binding, i,grid);
                                	panel3.getUsers().add(child);
                                }
                                					
    						HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
            				childEditFields.setStyleClass("childTable");
                			
            				//add the childs with occurence list
                        	            					
                			if (panel3.getUsers().size() > 0) {
                				HtmlPanelGrid childPanel = ((org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel)panel3.getUsers().get(0)).getInputFieldContainer();
            					childPanel.setStyleClass("childTable");
            					childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent.asJsfId("page4Child_users"));
                				childEditFields.getChildren().add(childPanel); 	
                			}
														panel3.getChildPanel().getChildren().clear();
            				panel3.getChildPanel().getChildren().add(childEditFields);
						}
						catch (Exception e)
						{
							throw new UpdateControlsException("Cannot process Wizard shareWizard",e);
						}
    				}
            		}   
}