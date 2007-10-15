 /** 
  * DeleteSambaHostLoader.java
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
  * Description: Loader to select the the Service for deleting a host
  * 
  */
package org.sblim.wbemsmt.cli.samba.listener;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.exception.ObjectNotFoundException;
import org.sblim.wbemsmt.tools.cli.CimCommandValues;
import org.sblim.wbemsmt.tools.cli.CliDataLoader;
import org.sblim.wbemsmt.tools.cli.CliUtil;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class DeleteSambaHostLoader extends SambaLoader  implements CliDataLoader {

	public void load(WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, CimCommandValues commandValues) throws ObjectNotFoundException {
		
		String serviceName = CliUtil.getOption(commandValues,DeleteSambaHost.KEY_GLOBAL_serviceName);
		String hostName = CliUtil.getOption(commandValues,DeleteSambaHost.KEY_sambaHostname);
		selectHost(bundle, adapter, serviceName, hostName);
		
	}


}
