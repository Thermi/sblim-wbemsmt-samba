/** 
  * UserWizard.java
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
  * @template: org/sblim/wbemsmt/dcg/templates/jsf/wizardClass.vm
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

import org.sblim.wbemsmt.tools.resources.LocaleManager;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.wizard.adapter.IPageWizardAdapter;
import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;
import org.sblim.wbemsmt.tools.wizard.jsf.JSFWizardBase;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.bl.adapter.DataContainer;

public class UserWizard extends JSFWizardBase implements IPageWizardAdapter {

	private org.sblim.wbemsmt.samba.wizard.UserWizardContainer container = null;
	
	String binding = "objectActionController.currentWizard.currentPanel.";
	
		org.sblim.wbemsmt.jsf.samba.container.wizard.UserWizardPage1Impl panel1 = null;
		org.sblim.wbemsmt.jsf.samba.container.wizard.UserWizardPage2Impl panel2 = null;
		org.sblim.wbemsmt.jsf.samba.container.wizard.UserWizardPage3Impl panel3 = null;
		
	final org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter;
	
	public UserWizard(final org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter) {
		super(adapter,ResourceBundleManager.getResourceBundle(new String[]{"messages","messagesSamba"},LocaleManager.getCurrent(FacesContext.getCurrentInstance()).getCurrentLocale()),"UserWizard.title");
		this.adapter = adapter;
		this.container = new org.sblim.wbemsmt.samba.wizard.UserWizardContainer (adapter,new org.sblim.wbemsmt.samba.wizard.UserWizardContainerPanels()
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
							    						panel1= new org.sblim.wbemsmt.jsf.samba.container.wizard.UserWizardPage1Impl(adapter,binding);
                            
    						HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
            				childEditFields.setStyleClass("childTable");
                			
            
            				//add the single childs
            				            				
            				//add the childs with occurence list
                        	            				panel1.getChildPanel().getChildren().add(childEditFields);
							
							
        					return panel1;
						}
						catch (Exception e)
						{
							throw new WbemSmtException("Cannot process Wizard userWizard",e);
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
							    						panel2= new org.sblim.wbemsmt.jsf.samba.container.wizard.UserWizardPage2Impl(adapter,binding);
                            								
								count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainer.class);
								
                    			panel2.clearShares();
                    			panel2.addSharesHeader();

                                for (int i=0; i < count; i++) {
                                    panel2.addShares(new org.sblim.wbemsmt.jsf.samba.container.wizard.ShareInUserWizardACLItemDataContainer_AsShares_InUserWizardPage2Impl(adapter,binding, i));
									
                                }
                    			panel2.getSharesPanel().setList(panel2.getShares());
                            								
								count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainer.class);
								
                    			panel2.clearPrinters();
                    			panel2.addPrintersHeader();

                                for (int i=0; i < count; i++) {
                                    panel2.addPrinters(new org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterInUserWizardACLItemDataContainer_AsPrinters_InUserWizardPage2Impl(adapter,binding, i));
									
                                }
                    			panel2.getPrintersPanel().setList(panel2.getPrinters());
                            
    						HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
            				childEditFields.setStyleClass("childTable");
                			
            
            				//add the single childs
            				            				
            				//add the childs with occurence list
                        	                        	    {
                        	    
								HtmlPanelGrid childPanel = panel2.getSharesPanel().getOuterPanel();
								childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent.asJsfId("page2Child_shares"));
			    				childEditFields.getChildren().add(childPanel); 	
                				}
							                        	    {
                        	    
								HtmlPanelGrid childPanel = panel2.getPrintersPanel().getOuterPanel();
								childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent.asJsfId("page2Child_printers"));
			    				childEditFields.getChildren().add(childPanel); 	
                				}
							            				panel2.getChildPanel().getChildren().add(childEditFields);
							
							
        					return panel2;
						}
						catch (Exception e)
						{
							throw new WbemSmtException("Cannot process Wizard userWizard",e);
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
							    						panel3= new org.sblim.wbemsmt.jsf.samba.container.wizard.UserWizardPage3Impl(adapter,binding);
                            								
								count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainer.class);
								
                    			panel3.clearShares();
                    			panel3.addSharesHeader();

                                for (int i=0; i < count; i++) {
                                    panel3.addShares(new org.sblim.wbemsmt.jsf.samba.container.wizard.ShareInUserWizardACLItemDataContainer_AsShares_InUserWizardPage3Impl(adapter,binding, i));
									
                                }
                    			panel3.getSharesPanel().setList(panel3.getShares());
                            								
								count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainer.class);
								
                    			panel3.clearPrinters();
                    			panel3.addPrintersHeader();

                                for (int i=0; i < count; i++) {
                                    panel3.addPrinters(new org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterInUserWizardACLItemDataContainer_AsPrinters_InUserWizardPage3Impl(adapter,binding, i));
									
                                }
                    			panel3.getPrintersPanel().setList(panel3.getPrinters());
                            
    						HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
            				childEditFields.setStyleClass("childTable");
                			
            
            				//add the single childs
            				            				
            				//add the childs with occurence list
                        	                        	    {
                        	    
								HtmlPanelGrid childPanel = panel3.getSharesPanel().getOuterPanel();
								childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent.asJsfId("page3Child_shares"));
			    				childEditFields.getChildren().add(childPanel); 	
                				}
							                        	    {
                        	    
								HtmlPanelGrid childPanel = panel3.getPrintersPanel().getOuterPanel();
								childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent.asJsfId("page3Child_printers"));
			    				childEditFields.getChildren().add(childPanel); 	
                				}
							            				panel3.getChildPanel().getChildren().add(childEditFields);
							
							
        					return panel3;
						}
						catch (Exception e)
						{
							throw new WbemSmtException("Cannot process Wizard userWizard",e);
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
            						if (dataContainer instanceof org.sblim.wbemsmt.jsf.samba.container.wizard.UserWizardPage1Impl)
					{
        				    					//update the child objects
        										try
						{
							
                            							adapter.updateControls(panel1);
    					
    						HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
            				childEditFields.setStyleClass("childTable");
                			
            				//add the childs with occurence list
                        								panel1.getChildPanel().getChildren().clear();
            				panel1.getChildPanel().getChildren().add(childEditFields);
						}
						catch (Exception e)
						{
							throw new UpdateControlsException("Cannot process Wizard userWizard",e);
						}
    				}
            						if (dataContainer instanceof org.sblim.wbemsmt.jsf.samba.container.wizard.UserWizardPage2Impl)
					{
        				    					//update the child objects
        										try
						{
														int count = 0;
							
                            								
								count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainer.class);

                    			panel2.clearShares();
                    			panel2.addSharesHeader();

                                for (int i=0; i < count; i++) {
                                    panel2.addShares(new org.sblim.wbemsmt.jsf.samba.container.wizard.ShareInUserWizardACLItemDataContainer_AsShares_InUserWizardPage2Impl(adapter,binding, i));
									
                                }
                    			panel2.getSharesPanel().setList(panel2.getShares());
                            								
								count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainer.class);

                    			panel2.clearPrinters();
                    			panel2.addPrintersHeader();

                                for (int i=0; i < count; i++) {
                                    panel2.addPrinters(new org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterInUserWizardACLItemDataContainer_AsPrinters_InUserWizardPage2Impl(adapter,binding, i));
									
                                }
                    			panel2.getPrintersPanel().setList(panel2.getPrinters());
                            							adapter.updateControls(panel2);
    					
    						HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
            				childEditFields.setStyleClass("childTable");
                			
            				//add the childs with occurence list
                        	                        	    {
                        	    
								HtmlPanelGrid childPanel = panel2.getSharesPanel().getOuterPanel();
								childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent.asJsfId("page2Child_shares"));
			    				childEditFields.getChildren().add(childPanel); 	
                				}
							                        	    {
                        	    
								HtmlPanelGrid childPanel = panel2.getPrintersPanel().getOuterPanel();
								childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent.asJsfId("page2Child_printers"));
			    				childEditFields.getChildren().add(childPanel); 	
                				}
														panel2.getChildPanel().getChildren().clear();
            				panel2.getChildPanel().getChildren().add(childEditFields);
						}
						catch (Exception e)
						{
							throw new UpdateControlsException("Cannot process Wizard userWizard",e);
						}
    				}
            						if (dataContainer instanceof org.sblim.wbemsmt.jsf.samba.container.wizard.UserWizardPage3Impl)
					{
        				    					//update the child objects
        										try
						{
														int count = 0;
							
                            								
								count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainer.class);

                    			panel3.clearShares();
                    			panel3.addSharesHeader();

                                for (int i=0; i < count; i++) {
                                    panel3.addShares(new org.sblim.wbemsmt.jsf.samba.container.wizard.ShareInUserWizardACLItemDataContainer_AsShares_InUserWizardPage3Impl(adapter,binding, i));
									
                                }
                    			panel3.getSharesPanel().setList(panel3.getShares());
                            								
								count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainer.class);

                    			panel3.clearPrinters();
                    			panel3.addPrintersHeader();

                                for (int i=0; i < count; i++) {
                                    panel3.addPrinters(new org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterInUserWizardACLItemDataContainer_AsPrinters_InUserWizardPage3Impl(adapter,binding, i));
									
                                }
                    			panel3.getPrintersPanel().setList(panel3.getPrinters());
                            							adapter.updateControls(panel3);
    					
    						HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
            				childEditFields.setStyleClass("childTable");
                			
            				//add the childs with occurence list
                        	                        	    {
                        	    
								HtmlPanelGrid childPanel = panel3.getSharesPanel().getOuterPanel();
								childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent.asJsfId("page3Child_shares"));
			    				childEditFields.getChildren().add(childPanel); 	
                				}
							                        	    {
                        	    
								HtmlPanelGrid childPanel = panel3.getPrintersPanel().getOuterPanel();
								childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent.asJsfId("page3Child_printers"));
			    				childEditFields.getChildren().add(childPanel); 	
                				}
														panel3.getChildPanel().getChildren().clear();
            				panel3.getChildPanel().getChildren().add(childEditFields);
						}
						catch (Exception e)
						{
							throw new UpdateControlsException("Cannot process Wizard userWizard",e);
						}
    				}
            		}   
	
	public String getFinishText()
	{
		return bundle.getString("UserWizard.finishText",bundle.getString("wizard.finishText"));
	}
	
	public String getJavaScriptWaitStatement()
	{
		String text = bundle.getString("UserWizard.createWaitText",bundle.getString("wizard.createWaitText"));
		return org.sblim.wbemsmt.tools.jsf.JavascriptUtil.getShowWaitCall(text);
	}
}