/** 
  * SambaCimAdapterInitWizardIf.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
  * @template: ./tools-dcg/templates/adapterInterfaceInitWizard.vm
  *
  * Contributors: 
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.*;

	/** 
	 * This is the interface containing only the initWizard-Methods for the delegate
	 **/

public interface SambaCimAdapterInitWizardIf extends InitWizardDelegatee
{

	public static final String[] RESOURCE_BUNDLE_NAMES = new String[]{"messages","messagesSamba"};

	/** 
	 * UpdateControls-Methods
	 **/
			
public void initWizardImpl(org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage1 container,org.sblim.wbemsmt.samba.wizard.HostWizardContainer wizardContainer, String currentPagename) throws org.sblim.wbemsmt.exception.InitWizardException;
			
public void initWizardImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage1 container,org.sblim.wbemsmt.samba.wizard.PrinterWizardContainer wizardContainer, String currentPagename) throws org.sblim.wbemsmt.exception.InitWizardException;
			
public void initWizardImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1 container,org.sblim.wbemsmt.samba.wizard.ShareWizardContainer wizardContainer, String currentPagename) throws org.sblim.wbemsmt.exception.InitWizardException;
			
public void initWizardImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1 container,org.sblim.wbemsmt.samba.wizard.UserWizardContainer wizardContainer, String currentPagename) throws org.sblim.wbemsmt.exception.InitWizardException;
	}