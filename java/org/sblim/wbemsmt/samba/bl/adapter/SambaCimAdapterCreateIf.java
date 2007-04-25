/** 
  * SambaCimAdapterCreateIf.java
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
  * @template: ./tools-dcg/templates/adapterInterfaceCreate.vm
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
	 * This is the interface containing only the Create-Methods for the delegate
	 **/

public interface SambaCimAdapterCreateIf extends CreateDelegatee
{

	public static final String[] RESOURCE_BUNDLE_NAMES = new String[]{"messages","messagesSamba"};

	/** 
	 * Create-Methods
	 **/
	public void createImpl(org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage2 container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public void createImpl(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage5 container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public void createImpl(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4 container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public void createImpl(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3 container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	
		
}