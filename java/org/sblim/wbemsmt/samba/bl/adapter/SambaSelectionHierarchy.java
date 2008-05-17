 /** 
  * SambaSelectionHierarchy.java
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
  * Description: Selection Hierarchy of Samba Objects
  * 
  */
package org.sblim.wbemsmt.samba.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.SelectionHierarchy;
import org.sblim.wbemsmt.samba.bl.fco.*;
import org.sblim.wbemsmt.samba.bl.wrapper.*;

public class SambaSelectionHierarchy extends SelectionHierarchy {

	private SambaCimAdapter adapter;

	public Linux_SambaShareOptions getLinux_SambaShareOptions() {
		return (Linux_SambaShareOptions) get(1);
	}

	public Linux_SambaPrinterOptions getLinux_SambaPrinterOptions() {
		return (Linux_SambaPrinterOptions) get(1);
	}

	public Linux_SambaUser getLinux_SambaUser() {
		return (Linux_SambaUser) get(1);
	}

	public Linux_SambaHost getLinux_SambaHost() {
		return (Linux_SambaHost) get(1);
	}
	
	public Linux_SambaService getLinux_SambaService() {
		return (Linux_SambaService) get(0);
	}

	public void add(Share share) {
		cleanup(1);
		adapter.setSelectedShare(share);
		push(share.getShare());
	}

	public void add(Printer printer) {
		cleanup(1);
		adapter.setSelectedPrinter(printer);
		push(printer.getPrinter());
	}

	public void add(User user) {
		cleanup(1);
		adapter.setSelectedUser(user);
		push(user.getUser());
	}

	public void add(Host host) {
		cleanup(1);
		adapter.setSelectedHost(host);
		push(host.getHost());
	}

	private void cleanup(int currentLevel) {
		while (size() > currentLevel)
		{
			pop();
		}
	}


	public void add(Service service) {
		clear();
		adapter.setSelectedService(service);
		adapter.setSelectedShare(null);
		push(service.getService());
	}

	public void setAdapter(SambaCimAdapter adapter) {
		this.adapter = adapter;
	}

}
