 /** 
  * LookupServerTask.java
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
  * Description: Lookup class to check if the samba implementation is available on the cim server
  * 
  */
package org.sblim.wbemsmt.samba.lookup;

import java.util.logging.Logger;

import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.lookup.Lookup;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaService;

public class LookupServerTask implements Lookup {

	static Logger logger = Logger.getLogger(LookupServerTask.class.getName()); 
	
	public boolean lookup(WBEMClient cimClient, String namespace) {
		
		try {
			new Linux_SambaService(cimClient,namespace);
			return true;
		} catch (WbemsmtException e) {
			logger.severe("Cannot lookup samba task on server " + namespace + " Exception " + e.getMessage());
			return false;
		}
	}

}
