/** 
  * PrinterWizard.java
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

public class PrinterWizard extends JSFWizardBase implements IPageWizardAdapter {

	private org.sblim.wbemsmt.samba.wizard.PrinterWizardContainer container = null;
	
	String binding = "objectActionController.currentWizard.currentPanel.";
	
		org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterWizardPage1Impl panel1 = null;
		org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterWizardPage2Impl panel2 = null;
		org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterWizardPage3Impl panel3 = null;
		org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterWizardPage4Impl panel4 = null;
		org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterWizardPage5Impl panel5 = null;
		
	final org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter;
	
	public PrinterWizard(final org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter) {
		super(adapter,ResourceBundleManager.getResourceBundle(new String[]{"messages","messagesSamba"},LocaleManager.getCurrent(FacesContext.getCurrentInstance()).getCurrentLocale()),"PrinterWizard.title");
		this.adapter = adapter;
		this.container = new org.sblim.wbemsmt.samba.wizard.PrinterWizardContainer (adapter,new org.sblim.wbemsmt.samba.wizard.PrinterWizardContainerPanels()
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
							    						panel1= new org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterWizardPage1Impl(adapter,binding);
                                					
    						HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
            				childEditFields.setStyleClass("childTable");
                			
            
            				//add the single childs
            				            				
            				//add the childs with occurence list
                        	            				panel1.getChildPanel().getChildren().add(childEditFields);
							
															panel1.getLayouter().layout(panel1.getPanelForCustomLayout(), panel1 ,bundle);
							
        					return panel1;
						}
						catch (Exception e)
						{
							throw new WbemSmtException("Cannot process Wizard printerWizard",e);
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
							    						panel2= new org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterWizardPage2Impl(adapter,binding);
                                					
    						HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
            				childEditFields.setStyleClass("childTable");
                			
            
            				//add the single childs
            				            				
            				//add the childs with occurence list
                        	            				panel2.getChildPanel().getChildren().add(childEditFields);
							
							
        					return panel2;
						}
						catch (Exception e)
						{
							throw new WbemSmtException("Cannot process Wizard printerWizard",e);
						}
    				}
            						//update the child objects
    				
					public Object getPage3() throws WbemSmtException
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
							    						panel3= new org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterWizardPage3Impl(adapter,binding);
                                                            count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainer.class);
                                panel3.getUsers().clear();
                                for (int i=0; i < count; i++) {
                                	HtmlPanelGrid grid = i==0 ? null :((org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel)panel3.getUsers().get(0)).getInputFieldContainer();
                                	org.sblim.wbemsmt.jsf.samba.container.wizard.UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage3Impl child = new org.sblim.wbemsmt.jsf.samba.container.wizard.UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage3Impl(adapter,binding, i,grid);
                                	panel3.getUsers().add(child);
                                }
                                if (count > 0)
                                {
                                	((org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel)panel3.getUsers().get(0)).updateRows(count);
                                }
								
                                					
    						HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
            				childEditFields.setStyleClass("childTable");
                			
            
            				//add the single childs
            				            				
            				//add the childs with occurence list
                        	            					
                			if (panel3.getUsers().size() > 0) {
                				HtmlPanelGrid childPanel = ((org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel)panel3.getUsers().get(0)).getOuterPanel();
            					childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent.asJsfId("page3Child_users"));
                				childEditFields.getChildren().add(childPanel); 	
                			}
                			            				panel3.getChildPanel().getChildren().add(childEditFields);
							
							
        					return panel3;
						}
						catch (Exception e)
						{
							throw new WbemSmtException("Cannot process Wizard printerWizard",e);
						}
    				}
            						//update the child objects
    				
					public Object getPage4() throws WbemSmtException
					{
						//Workaround for Bug https://issues.apache.org/jira/browse/MYFACES-1438
						//Create the panel everytime the panel is needed 
						//if (panel4!= null)
						//{
						//	return panel4;
						//}
					
						try
						{
							    						panel4= new org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterWizardPage4Impl(adapter,binding);
                                					
    						HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
            				childEditFields.setStyleClass("childTable");
                			
            
            				//add the single childs
            				            				
            				//add the childs with occurence list
                        	            				panel4.getChildPanel().getChildren().add(childEditFields);
							
							
        					return panel4;
						}
						catch (Exception e)
						{
							throw new WbemSmtException("Cannot process Wizard printerWizard",e);
						}
    				}
            						//update the child objects
    				
					public Object getPage5() throws WbemSmtException
					{
						//Workaround for Bug https://issues.apache.org/jira/browse/MYFACES-1438
						//Create the panel everytime the panel is needed 
						//if (panel5!= null)
						//{
						//	return panel5;
						//}
					
						try
						{
														int count = 0;
							    						panel5= new org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterWizardPage5Impl(adapter,binding);
                                                            count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainer.class);
                                panel5.getUsers().clear();
                                for (int i=0; i < count; i++) {
                                	HtmlPanelGrid grid = i==0 ? null :((org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel)panel5.getUsers().get(0)).getInputFieldContainer();
                                	org.sblim.wbemsmt.jsf.samba.container.wizard.UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage5Impl child = new org.sblim.wbemsmt.jsf.samba.container.wizard.UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage5Impl(adapter,binding, i,grid);
                                	panel5.getUsers().add(child);
                                }
                                if (count > 0)
                                {
                                	((org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel)panel5.getUsers().get(0)).updateRows(count);
                                }
								
                                					
    						HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
            				childEditFields.setStyleClass("childTable");
                			
            
            				//add the single childs
            				            				
            				//add the childs with occurence list
                        	            					
                			if (panel5.getUsers().size() > 0) {
                				HtmlPanelGrid childPanel = ((org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel)panel5.getUsers().get(0)).getOuterPanel();
            					childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent.asJsfId("page5Child_users"));
                				childEditFields.getChildren().add(childPanel); 	
                			}
                			            				panel5.getChildPanel().getChildren().add(childEditFields);
							
							
        					return panel5;
						}
						catch (Exception e)
						{
							throw new WbemSmtException("Cannot process Wizard printerWizard",e);
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

   
   //Workaround for a bug within myFaces - Everytime a new panel is created the childs are created also
   
	public void countAndCreateChilds(DataContainer dataContainer) throws UpdateControlsException {
            						if (dataContainer instanceof org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterWizardPage1Impl)
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
							throw new UpdateControlsException("Cannot process Wizard printerWizard",e);
						}
    				}
            						if (dataContainer instanceof org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterWizardPage2Impl)
					{
        				    					//update the child objects
        										try
						{
							
                                					
    						HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
            				childEditFields.setStyleClass("childTable");
                			
            				//add the childs with occurence list
                        								panel2.getChildPanel().getChildren().clear();
            				panel2.getChildPanel().getChildren().add(childEditFields);
						}
						catch (Exception e)
						{
							throw new UpdateControlsException("Cannot process Wizard printerWizard",e);
						}
    				}
            						if (dataContainer instanceof org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterWizardPage3Impl)
					{
        				    					//update the child objects
        										try
						{
														int count = 0;
							
                            								
                                count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainer.class);
                                panel3.getUsers().clear();
                                for (int i=0; i < count; i++) {
                                	HtmlPanelGrid grid = i==0 ? null :((org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel)panel3.getUsers().get(0)).getInputFieldContainer();
                                	org.sblim.wbemsmt.jsf.samba.container.wizard.UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage3Impl child = new org.sblim.wbemsmt.jsf.samba.container.wizard.UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage3Impl(adapter,binding, i,grid);
                                	panel3.getUsers().add(child);
                                }
								
                                if (count > 0)
                                {
                                	((org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel)panel3.getUsers().get(0)).updateRows(count);
                                }
								
                                					
    						HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
            				childEditFields.setStyleClass("childTable");
                			
            				//add the childs with occurence list
                        	            					
                			if (panel3.getUsers().size() > 0) {
                				HtmlPanelGrid childPanel = ((org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel)panel3.getUsers().get(0)).getOuterPanel();
            					childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent.asJsfId("page3Child_users"));
                				childEditFields.getChildren().add(childPanel); 	
                			}
														panel3.getChildPanel().getChildren().clear();
            				panel3.getChildPanel().getChildren().add(childEditFields);
						}
						catch (Exception e)
						{
							throw new UpdateControlsException("Cannot process Wizard printerWizard",e);
						}
    				}
            						if (dataContainer instanceof org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterWizardPage4Impl)
					{
        				    					//update the child objects
        										try
						{
							
                                					
    						HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
            				childEditFields.setStyleClass("childTable");
                			
            				//add the childs with occurence list
                        								panel4.getChildPanel().getChildren().clear();
            				panel4.getChildPanel().getChildren().add(childEditFields);
						}
						catch (Exception e)
						{
							throw new UpdateControlsException("Cannot process Wizard printerWizard",e);
						}
    				}
            						if (dataContainer instanceof org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterWizardPage5Impl)
					{
        				    					//update the child objects
        										try
						{
														int count = 0;
							
                            								
                                count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainer.class);
                                panel5.getUsers().clear();
                                for (int i=0; i < count; i++) {
                                	HtmlPanelGrid grid = i==0 ? null :((org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel)panel5.getUsers().get(0)).getInputFieldContainer();
                                	org.sblim.wbemsmt.jsf.samba.container.wizard.UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage5Impl child = new org.sblim.wbemsmt.jsf.samba.container.wizard.UserInPrinterWizardACLItemDataContainer_AsUsers_InPrinterWizardPage5Impl(adapter,binding, i,grid);
                                	panel5.getUsers().add(child);
                                }
								
                                if (count > 0)
                                {
                                	((org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel)panel5.getUsers().get(0)).updateRows(count);
                                }
								
                                					
    						HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
            				childEditFields.setStyleClass("childTable");
                			
            				//add the childs with occurence list
                        	            					
                			if (panel5.getUsers().size() > 0) {
                				HtmlPanelGrid childPanel = ((org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel)panel5.getUsers().get(0)).getOuterPanel();
            					childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent.asJsfId("page5Child_users"));
                				childEditFields.getChildren().add(childPanel); 	
                			}
														panel5.getChildPanel().getChildren().clear();
            				panel5.getChildPanel().getChildren().add(childEditFields);
						}
						catch (Exception e)
						{
							throw new UpdateControlsException("Cannot process Wizard printerWizard",e);
						}
    				}
            		}   
	
	public String getFinishText()
	{
		return bundle.getString("PrinterWizard.finishText",bundle.getString("wizard.finishText"));
	}
}