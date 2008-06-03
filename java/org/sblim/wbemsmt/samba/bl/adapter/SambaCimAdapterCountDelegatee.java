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

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.container.global.GUIShareGlobalsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.global.PrintingGlobalsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.PrinterListDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.UserInPrinterACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceUserSecurityOptionsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.ShareListDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.UserInShareACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.PrinterInUserACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.ShareInUserACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.UserListDataContainer;
import org.sblim.wbemsmt.samba.bl.container.wizard.*;
import org.sblim.wbemsmt.samba.bl.wrapper.Service;

public class SambaCimAdapterCountDelegatee extends SambaDelegatee implements SambaCimAdapterCountIf {

	public SambaCimAdapterCountDelegatee(SambaCimAdapter adapter) {
		super(adapter);
	}

	public int countImpl_Users(Class cls, UserInShareACLDataContainer container) throws WbemsmtException {
		Service selectedService = adapter.getSelectedService();

		if (adapter.getSelectionHierarchy().size() == 2 
				 && adapter.getSelectedShare() != null)
		{
			return selectedService.getUsers().size();
		}
		return 0;
	}

	public int countImpl_Users(Class cls, UserInPrinterACLDataContainer container) throws WbemsmtException {
		Service selectedService = adapter.getSelectedService();

		if (adapter.getSelectionHierarchy().size() == 2 
				 && adapter.getSelectedPrinter() != null)
		{
			return selectedService.getUsers().size();
		}
		return 0;
	}

	public int countImpl_UserRights(Class cls, ServiceUserSecurityOptionsDataContainer container) throws WbemsmtException {
		Service selectedService = adapter.getSelectedService();

		if (adapter.getSelectionHierarchy().size() == 1)
		{
			return selectedService.getUsers().size();
		}
		return 0;
	}

	public int countImpl_Printers(Class cls, PrinterInUserACLDataContainer container) throws WbemsmtException {
		return getSelectedService().getPrinters().size();
	}

	public int countImpl_Shares(Class cls, ShareInUserACLDataContainer container) throws WbemsmtException {
		return getSelectedService().getShares().size();
	}

	public int countImpl_Users(Class cls, PrinterWizardPage3 container) throws WbemsmtException {
		return getSelectedService().getUsers().size();
	}

	public int countImpl_Shares(Class cls, UserWizardPage2 page2) throws WbemsmtException {
		return getSelectedService().getShares().size();
	}

	public int countImpl_Printers(Class cls, UserWizardPage2 page2) throws WbemsmtException {
		return getSelectedService().getPrinters().size();
	}

	public int countImpl_Users(Class cls, ShareWizardPage2 container) throws WbemsmtException {
		return getSelectedService().getUsers().size();
	}

    public int countImpl_Users(Class cls, ShareWizardPage4 container) throws WbemsmtException {
        return getSelectedService().getUsers().size();
    }

    public int countImpl_Users(Class cls, PrintingGlobalsDataContainer container) throws WbemsmtException {
		return adapter.getSelectedService().getUsers().size();
	}

	public int countImpl_Users(Class cls, GUIShareGlobalsDataContainer parent) throws WbemsmtException {
		return adapter.getSelectedService().getUsers().size();
	}

	public int countImpl_Shares(Class cls, ShareListDataContainer container) throws WbemsmtException {
		return adapter.getSelectedService().getShares().size();
	}

	public int countImpl_Printers(Class cls, PrinterListDataContainer container) throws WbemsmtException {
		return adapter.getSelectedService().getPrinters().size();
	}

	public int countImpl_Users(Class cls, UserListDataContainer container) throws WbemsmtException {
		return adapter.getSelectedService().getUsers().size();
	}

    public int countImpl_Printers(Class childClass, UserWizardPage3 parent) throws WbemsmtException {
        return adapter.getSelectedService().getPrinters().size();
    }

    public int countImpl_Shares(Class childClass, UserWizardPage3 parent) throws WbemsmtException {
        return adapter.getSelectedService().getShares().size();
    }

    public int countImpl_Users(Class childClass, PrinterWizardPage5 parent) throws WbemsmtException {
        return adapter.getSelectedService().getUsers().size();
    }

}
