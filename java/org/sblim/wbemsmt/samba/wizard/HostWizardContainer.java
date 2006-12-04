/** 
  * HostWizardContainer.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.WizardGenerator
  * @template: ./tools-dcg/templates/wizardContainer.vm
  *
  * Contributors: 
  * 
  * Description: WizardContainer for 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.wizard;

import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Logger;

import org.sblim.wbemsmt.tools.wizard.container.AbstractWizardContainerBase;
import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;
import org.sblim.wbemsmt.exception.WbemSmtException;

	public class HostWizardContainer extends AbstractWizardContainerBase implements IWizardContainer {

	org.sblim.wbemsmt.tools.wizard.WizardContainerUtil util = new HostWizardContainerUtil();
	static Logger logger = Logger.getLogger(HostWizardContainer.class.getName());
	
			public static final String WIZARD_PANEL_PAGE1 = "page1";
    		public static final String WIZARD_PANEL_PAGE2 = "page2";
    
	private final HostWizardContainerPanels panels;
	
	public HostWizardContainer(HostWizardContainerPanels panels) {
		super();
		this.panels = panels;
		hmPages = new HashMap();
	}
	
	public void initWizardContainer() throws WbemSmtException {
		logger.fine("initWizardContainer");
		
    	    		hmPages.put(WIZARD_PANEL_PAGE1,panels.getPage1()); 
            		hmPages.put(WIZARD_PANEL_PAGE2,panels.getPage2()); 
        	}
	
	public String getNextWizardPageName()
	{
		return util.getNextPanel(getCurrentPageName(),hmPages);
	}
	
	
	public boolean isLast(String pageName) {
    			if (pageName.equals(WIZARD_PANEL_PAGE2)) {
			return true;
		}
        		else return false;
	}

	public boolean isFirst(String pageName) {
		if (pageName.equals(WIZARD_PANEL_PAGE1)) {
			return true;
		}
		else return false;
	}

	public void cleanUP(String pageName) 
	{
		//cleanup is done in the adapter
	}

	
	public boolean isValid(String propertyName, Object value, Vector result) {
		//validation is done in the adapter
		return true;
	}

	protected void buildSummaryText() {
		//wizard has no summary - fields are updated in the adapter
	}
	
	public void postWizardFinish() {
	
	}

	public void preWizardFinish() throws Exception {
		
	}

	public Object getPage(String actualPanelName) throws WbemSmtException {

    				if (WIZARD_PANEL_PAGE1.equals(actualPanelName))
			{
				return panels.getPage1();
			}
        			if (WIZARD_PANEL_PAGE2.equals(actualPanelName))
			{
				return panels.getPage2();
			}
        		
		throw new WbemSmtException("For WizardPage " + actualPanelName + " no Implementation was found");
	}
	
}