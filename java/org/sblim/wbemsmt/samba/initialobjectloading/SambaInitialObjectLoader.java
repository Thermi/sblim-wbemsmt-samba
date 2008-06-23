 /** 
  * SambaInitialObjectLoader.java
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
  * Description: Class for initially loading the SambaObjects for the tree
  * 
  */
package org.sblim.wbemsmt.samba.initialobjectloading;

import java.util.Iterator;
import java.util.List;

import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.tree.CIMClassNode;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaService;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaServiceHelper;
import org.sblim.wbemsmt.tasklauncher.initialobjectloading.WbemsmtInitialObjectLoader;

/**
 * @author BAUSCHER
 *
 */
public class SambaInitialObjectLoader extends WbemsmtInitialObjectLoader {

	private WBEMClient cimClient;

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tasklauncher.initialobjectloading.WbemsmtInitialObjectLoader#getChangedCimClient()
	 */
	public WBEMClient getChangedCimClient() {
		return cimClient;
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tasklauncher.initialobjectloading.WbemsmtInitialObjectLoader#load(org.sblim.wbem.client.CIMClient)
	 */
	public void load(CIMClassNode cimClassNode) throws WbemsmtException {
		this.cimClient = cimClassNode.getCimClient();

		List list = Linux_SambaServiceHelper.enumerateInstances(cimClient,cimClassNode.getNamespace(), true);
        for (Iterator iter = list.iterator(); iter.hasNext();) {
        	Linux_SambaService service = (Linux_SambaService) iter.next();
        	addInitialObject(service.getCimInstance());
        }
	}

}
