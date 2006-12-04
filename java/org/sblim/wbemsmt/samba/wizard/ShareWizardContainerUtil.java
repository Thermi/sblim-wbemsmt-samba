 /** 
  * ShareWizardContainerUtil.java
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
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Defining the wizard panel order for creating shares
  * 
  */
package org.sblim.wbemsmt.samba.wizard;

import java.util.Map;

import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.tools.wizard.WizardContainerUtil;

public class ShareWizardContainerUtil extends WizardContainerUtil {

	
	static final String[] panelNamesCMD = new String[]{
		ShareWizardContainer.WIZARD_PANEL_PAGE1,
		ShareWizardContainer.WIZARD_PANEL_PAGE2,
//		ShareWizardContainer.WIZARD_PANEL_PAGE3CMD,
		ShareWizardContainer.WIZARD_PANEL_PAGE4
	};
	
	static final String[] panelNamesGUI = new String[]{
		ShareWizardContainer.WIZARD_PANEL_PAGE1,
		ShareWizardContainer.WIZARD_PANEL_PAGE2,
//		ShareWizardContainer.WIZARD_PANEL_PAGE3GUI,
		ShareWizardContainer.WIZARD_PANEL_PAGE4
	};

	/**
	 * 
	 */
	public ShareWizardContainerUtil() {
		super();
		
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.wizard.WizardContainerUtil#getNextPanel(java.lang.String)
	 */
	public String getNextPanel(String currentPageName, Map hmPages) {

		if (RuntimeUtil.getInstance().isCommandline())
		{
			return getNextPanelDefault(currentPageName,panelNamesCMD);	
		}
		else
		{
			return getNextPanelDefault(currentPageName,panelNamesGUI);	
		}
	}

}
