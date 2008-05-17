 /** 
  * SambaCimAdapterCreateDelegatee.java
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
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Delegatee for Creating objects
  * 
  */
package org.sblim.wbemsmt.samba.bl.adapter;

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage2;
import org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage5;
import org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4;
import org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3;

public class SambaCimAdapterCreateDelegatee extends SambaDelegatee implements SambaCimAdapterCreateIf {

	public SambaCimAdapterCreateDelegatee(SambaCimAdapter adapter) {
		super(adapter);
	}

	public void createImpl(HostWizardPage2 container) throws WbemsmtException {
		adapter.getHostWizard().create(container);
	}

	public void createImpl(PrinterWizardPage5 container) throws WbemsmtException {
		adapter.getPrinterWizard().create(container);
	}

	public void createImpl(UserWizardPage3 container) throws WbemsmtException {
		adapter.getUserWizard().create(container);
	}

	public void createImpl(ShareWizardPage4 container) throws WbemsmtException {
		adapter.getShareWizard().create(container);
	}

}
