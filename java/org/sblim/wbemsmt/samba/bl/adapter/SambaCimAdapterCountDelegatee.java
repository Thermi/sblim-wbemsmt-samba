 /** 
  * SambaCimAdapterCountDelegatee.java
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
  * Description: Delegatee for Counting list items
  * 
  */
package org.sblim.wbemsmt.samba.bl.adapter;

import org.sblim.wbemsmt.exception.CountException;
import org.sblim.wbemsmt.samba.bl.wrapper.Service;

public class SambaCimAdapterCountDelegatee extends SambaDelegatee implements SambaCimAdapterCountIf {

	public SambaCimAdapterCountDelegatee(SambaCimAdapter adapter) {
		super(adapter);
	}

	public int countImpl_UserACLItemDataContainerForShare() throws CountException {
		Service selectedService = adapter.getSelectedService();

		if (adapter.getSelectionHierarchy().size() == 2 
				 && adapter.getSelectedShare() != null)
		{
			return selectedService.getUsers().size();
		}
		return 0;
	}

	public int countImpl_UserACLItemDataContainerForPrinter() throws CountException {
		Service selectedService = adapter.getSelectedService();

		if (adapter.getSelectionHierarchy().size() == 2 
				 && adapter.getSelectedPrinter() != null)
		{
			return selectedService.getUsers().size();
		}
		return 0;
	}

	public int countImpl_UserACLItemDataContainerForService() throws CountException {
		Service selectedService = adapter.getSelectedService();

		if (adapter.getSelectionHierarchy().size() == 1)
		{
			return selectedService.getUsers().size();
		}
		return 0;
	}

	public int countImpl_PrinterACLItemDataContainer() throws CountException {
		return getSelectedService().getPrinters().size();
	}

	public int countImpl_ShareACLItemDataContainer() throws CountException {
		return getSelectedService().getShares().size();
	}

	public int countImpl_UserInPrinterWizardACLItemDataContainer() throws CountException {
		return getSelectedService().getUsers().size();
	}

	public int countImpl_ShareInUserWizardACLItemDataContainer() throws CountException {
		return getSelectedService().getShares().size();
	}

	public int countImpl_PrinterInUserWizardACLItemDataContainer() throws CountException {
		return getSelectedService().getPrinters().size();
	}

	public int countImpl_UserInShareWizardACLItemDataContainer() throws CountException {
		return getSelectedService().getUsers().size();
	}

	public int countImpl_AdminUsersInPrinterGlobals() throws CountException {
		return adapter.getSelectedService().getUsers().size();
	}

	public int countImpl_AdminUsersInShareGlobals() throws CountException {
		return adapter.getSelectedService().getUsers().size();
	}

	public int countImpl_ShareListItemDataContainer() throws CountException {
		return adapter.getSelectedService().getShares().size();
	}

	public int countImpl_PrinterListItemDataContainer() throws CountException {
		return adapter.getSelectedService().getPrinters().size();
	}

	public int countImpl_UserListItemDataContainer() throws CountException {
		return adapter.getSelectedService().getUsers().size();
	}

}
