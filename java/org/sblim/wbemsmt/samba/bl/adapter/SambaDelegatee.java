 /** 
  * SambaDelegatee.java
  *
  * © Copyright IBM Corp.  2009,2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Base class for all SambaDelegatee
  * 
  */
package org.sblim.wbemsmt.samba.bl.adapter;

import org.sblim.wbemsmt.samba.bl.wrapper.*;

public class SambaDelegatee {

	protected final SambaCimAdapter adapter;

	protected SambaDelegatee(SambaCimAdapter adapter) {
		this.adapter = adapter;
	}

	protected Service getSelectedService() {
		return adapter.getSelectedService();
	}

	protected PrinterGlobals getSelectedPrinterGlobals() {
		PrinterGlobals printerGlobals;
		Service selectedService = adapter.getSelectedService();
		printerGlobals = selectedService.getPrinterGlobals();
		return printerGlobals;
	}
	
	protected ShareGlobals getSelectedShareGlobals() {
		ShareGlobals shareGlobals;
		Service selectedService = adapter.getSelectedService();
		shareGlobals = selectedService.getShareGlobals();
		return shareGlobals;
	}

	public Share getSelectedShare() {
		Share share = adapter.getSelectedShare();
		return share;
	}
	
	public Printer getSelectedPrinter() {
		Printer printer = adapter.getSelectedPrinter();
		return printer;
	}

	public User getSelectedUser() {
		User user = adapter.getSelectedUser();
		return user;
	}

	public Host getSelectedHost() {
		Host host = adapter.getSelectedHost();
		return host;
	}
}
