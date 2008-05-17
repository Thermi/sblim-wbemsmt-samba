 /** 
  * SambaCimAdapterUpdateModelDelegatee.java
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
  * Description: Delegatee for Updating the model
  * 
  */
package org.sblim.wbemsmt.samba.bl.adapter;

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.container.global.PrintingGlobalsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.PrinterAllowHostSecurityDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.PrinterDenyHostSecurityDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceAllowHostSecurityDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceDenyHostDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceOperationsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.ShareAllowHostSecurityDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.ShareDenyHostSecurityDataContainer;
import org.sblim.wbemsmt.samba.bl.container.wizard.*;
import org.sblim.wbemsmt.samba.bl.wrapper.Printer;
import org.sblim.wbemsmt.samba.bl.wrapper.PrinterGlobals;
import org.sblim.wbemsmt.samba.bl.wrapper.Service;
import org.sblim.wbemsmt.samba.bl.wrapper.Share;

	public class SambaCimAdapterUpdateModelDelegatee extends SambaDelegatee implements
		SambaCimAdapterUpdateModelIf {

		public SambaCimAdapterUpdateModelDelegatee(SambaCimAdapter adapter) {
			super(adapter);
		}



	public void updateModelImpl(ServiceOperationsDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		selectedService.updateModel(container);
	}

	public void updateModelImpl(ServiceAllowHostSecurityDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		selectedService.updateModel(container);
	}

	public void updateModelImpl(ServiceDenyHostDataContainer container) throws WbemsmtException {
		Service selectedService = getSelectedService();
		selectedService.updateModel(container);
	}

	/***************
	 * Printer Globals
	 **************/
	
	public void updateModelImpl(PrintingGlobalsDataContainer container) throws WbemsmtException {

		PrinterGlobals printerGlobals = super.getSelectedPrinterGlobals();
		printerGlobals.updateModel(container);
		
	}

	/***************
	 * Shares
	 **************/
	
	public void updateModelImpl(ShareDenyHostSecurityDataContainer container) throws WbemsmtException {
		Share share = getSelectedShare();
		share.updateModel(container);
	}

	public void updateModelImpl(ShareAllowHostSecurityDataContainer container) throws WbemsmtException {
		Share share = getSelectedShare();
		share.updateModel(container);
	}

	/***************
	 * Printers
	 **************/

	public void updateModelImpl(PrinterDenyHostSecurityDataContainer container) throws WbemsmtException {
		Printer printer = getSelectedPrinter();
		printer.updateModel(container);
	}
	public void updateModelImpl(PrinterAllowHostSecurityDataContainer container) throws WbemsmtException {
		Printer printer = getSelectedPrinter();
		printer.updateModel(container);
	}



	public void updateModelImpl(PrinterWizardPage1 container) throws WbemsmtException {
		adapter.getPrinterWizard().updateModel(container);
	}



	public void updateModelImpl(ShareWizardPage3CMD container) throws WbemsmtException {
		adapter.getShareWizard().updateModel(container);
	}



	public void updateModelImpl(PrinterWizardPage2 container) throws WbemsmtException {
		adapter.getPrinterWizard().updateModel(container);
	}



	public void updateModelImpl(HostWizardPage1 container) throws WbemsmtException {
		adapter.getHostWizard().updateModel(container);
	}



	public void updateModelImpl(ShareWizardPage3GUI container) throws WbemsmtException {
		adapter.getShareWizard().updateModel(container);
	}



	public void updateModelImpl(PrinterWizardPage3 container) throws WbemsmtException {
		adapter.getPrinterWizard().updateModel(container);
		
	}



	public void updateModelImpl(UserWizardPage1 container) throws WbemsmtException {
		adapter.getUserWizard().updateModel(container);
	}



	public void updateModelImpl(PrinterWizardPage4 container) throws WbemsmtException {
		adapter.getPrinterWizard().updateModel(container);
	}



	public void updateModelImpl(ShareWizardPage1 container) throws WbemsmtException {
		adapter.getShareWizard().updateModel(container);
	}



	public void updateModelImpl(ShareWizardPage2 container) throws WbemsmtException {
		adapter.getShareWizard().updateModel(container);
	}



	public void updateModelImpl(UserWizardPage2 container) throws WbemsmtException {
		adapter.getUserWizard().updateModel(container);
	}



	public void updateModelImpl(ShareInUserWizardACLItemDataContainer container) throws WbemsmtException {
		
		
	}



	public void updateModelImpl(PrinterInUserWizardACLItemDataContainer container) throws WbemsmtException {
		
		
	}



	public void updateModelImpl(UserInPrinterWizardACLItemDataContainer container) throws WbemsmtException {
		
		
	}



	public void updateModelImpl(UserInShareWizardACLItemDataContainer container) throws WbemsmtException {
		
		
	}
}
