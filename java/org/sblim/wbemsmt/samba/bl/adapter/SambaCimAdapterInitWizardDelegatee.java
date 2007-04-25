 /** 
  * SambaCimAdapterInitWizardDelegatee.java
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
  * Description: Delegatee for initializing wizards
  * 
  */
package org.sblim.wbemsmt.samba.bl.adapter;

import org.sblim.wbemsmt.exception.InitWizardException;
import org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage1;
import org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage1;
import org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1;
import org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1;
import org.sblim.wbemsmt.samba.wizard.HostWizardContainer;
import org.sblim.wbemsmt.samba.wizard.PrinterWizardContainer;
import org.sblim.wbemsmt.samba.wizard.ShareWizardContainer;
import org.sblim.wbemsmt.samba.wizard.UserWizardContainer;

public class SambaCimAdapterInitWizardDelegatee implements
		SambaCimAdapterInitWizardIf {

	public SambaCimAdapterInitWizardDelegatee(SambaCimAdapter adapter) {
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitWizardIf#initWizardImpl(org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage1, org.sblim.wbemsmt.samba.wizard.HostWizardContainer, java.lang.String)
	 */
	public void initWizardImpl(HostWizardPage1 container,
			HostWizardContainer wizardContainer, String currentPagename)
			throws InitWizardException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitWizardIf#initWizardImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage1, org.sblim.wbemsmt.samba.wizard.PrinterWizardContainer, java.lang.String)
	 */
	public void initWizardImpl(PrinterWizardPage1 container,
			PrinterWizardContainer wizardContainer, String currentPagename)
			throws InitWizardException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitWizardIf#initWizardImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1, org.sblim.wbemsmt.samba.wizard.ShareWizardContainer, java.lang.String)
	 */
	public void initWizardImpl(ShareWizardPage1 container,
			ShareWizardContainer wizardContainer, String currentPagename)
			throws InitWizardException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterInitWizardIf#initWizardImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1, org.sblim.wbemsmt.samba.wizard.UserWizardContainer, java.lang.String)
	 */
	public void initWizardImpl(UserWizardPage1 container,
			UserWizardContainer wizardContainer, String currentPagename)
			throws InitWizardException {
		

	}

}
