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
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Wrapper for Printer Wizard
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper.wizard;

import org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter;
import org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage1;
import org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage2;

public class HostWizard  extends SambaWizard {

	public HostWizard(SambaCimAdapter adapter) {
		super(adapter);
	}

	public void create(HostWizardPage2 container) {
		
		
	}

	public void updateControls(HostWizardPage2 container) {
		
		
	}

	public void updateControls(HostWizardPage1 container) {
		
		
	}

	public void updateModel(HostWizardPage1 container) {
		
		
	}

}
