 /** 
  * PrinterWizardContainerUtil.java
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
  * Description: Defining the wizard panel order for creating printers
  * 
  */
package org.sblim.wbemsmt.samba.wizard;

import java.util.Map;

import org.sblim.wbemsmt.tools.wizard.WizardContainerUtil;

public class PrinterWizardContainerUtil extends WizardContainerUtil {

	static final String[] panelNames = new String[]{
		PrinterWizardContainer.WIZARD_PANEL_PAGE1,
		PrinterWizardContainer.WIZARD_PANEL_PAGE2,
		PrinterWizardContainer.WIZARD_PANEL_PAGE3,
		PrinterWizardContainer.WIZARD_PANEL_PAGE4,
		PrinterWizardContainer.WIZARD_PANEL_PAGE5
	};
	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.wizard.WizardContainerUtil#getNextPanel(java.lang.String)
	 */
	public String getNextPanel(String currentPageName, Map hmPages) {
//		TODO enable special handling if "create for all printers" is enabled again
//		if (currentPageName.equals(PrinterWizardContainer.WIZARD_PANEL_PAGE1))
//		{
//			PrinterWizardPage1 page1 = (PrinterWizardPage1) hmPages.get(currentPageName);
//			UnsignedInt16 index = (UnsignedInt16) page1.get_usr_AllOrOne().getConvertedControlValue();
//			return index.intValue() == 0 ? PrinterWizardContainer.WIZARD_PANEL_PAGE3 : PrinterWizardContainer.WIZARD_PANEL_PAGE2;
//		}
//		else
//		{
			return getNextPanelDefault(currentPageName,panelNames);
//		}
	}

}
