 /** 
  * Host.java
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
  * Description: Class for wrapping the Host business object and the related-actions
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper;

import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaObject;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaHost;

public class Host extends SambaObject {

	private Linux_SambaHost host;

	public Host(Service service, Linux_SambaHost hostFco, CIMClient cimClient) {
		
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaObject#loadChilds(org.sblim.wbem.client.CIMClient)
	 */
	public void loadChilds(CIMClient cimClient) throws ModelLoadException {
		

	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaObject#getCimObjectKey()
	 */
	public CimObjectKey getCimObjectKey() {
		
		return null;
	}

	public Linux_SambaHost getHost() {
		return host;
	}


}
