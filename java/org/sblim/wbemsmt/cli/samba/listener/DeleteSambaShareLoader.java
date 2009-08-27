 /** 
  * DeleteSambaShareLoader.java
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
  * Description: Dataloader for Delete SambaShare Actions
  * 
  */


package org.sblim.wbemsmt.cli.samba.listener;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.cli.CimCommandValues;
import org.sblim.wbemsmt.tools.cli.CliDataLoader;
import org.sblim.wbemsmt.tools.cli.CliUtil;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class DeleteSambaShareLoader extends SambaLoader  implements CliDataLoader {

	public void load(WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, CimCommandValues commandValues) throws WbemsmtException {
		String serviceName = CliUtil.getOption(commandValues,DeleteSambaHost.KEY_GLOBAL_serviceName);
		String shareName = CliUtil.getOption(commandValues,DeleteSambaShare.KEY_sharename);

		selectShare(bundle, adapter, serviceName, shareName);
	}


}
