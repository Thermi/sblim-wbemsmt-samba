 /** 
  * LookupServerTask.java
  *
  * � Copyright IBM Corp. 2005
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
  * Description: TODO
  * 
  */
package org.sblim.wbemsmt.samba.lookup;

import java.util.logging.Logger;

import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.lookup.Lookup;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaService;

public class LookupServerTask implements Lookup {

	static Logger logger = Logger.getLogger(LookupServerTask.class.getName()); 
	
	public boolean lookup(CIMClient cimClient) {
		
		try {
			cimClient.getClass(new CIMObjectPath(Linux_SambaService.CIM_CLASS_NAME));
			return true;
		} catch (CIMException e) {
			logger.severe("Cannot lookup samba task on server " + cimClient.getNameSpace().toString() + " Exception " + e.getDescription());
			return false;
		}
	}

}
