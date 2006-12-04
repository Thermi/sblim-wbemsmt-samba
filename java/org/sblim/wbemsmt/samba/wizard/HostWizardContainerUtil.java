 /** 
  * HostWizardContainerUtil.java
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
  * Description: Defining the wizard panel order for creating hosts
  * 
  */
package org.sblim.wbemsmt.samba.wizard;

import java.util.Map;

import org.sblim.wbemsmt.tools.wizard.WizardContainerUtil;

public class HostWizardContainerUtil extends WizardContainerUtil {

	static final String[] panelNames = new String[]{
		HostWizardContainer.WIZARD_PANEL_PAGE1,
		HostWizardContainer.WIZARD_PANEL_PAGE2
	};
	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.wizard.WizardContainerUtil#getNextPanel(java.lang.String)
	 */
	public String getNextPanel(String currentPageName, Map hmPages) {
		return getNextPanelDefault(currentPageName,panelNames);
	}

}
