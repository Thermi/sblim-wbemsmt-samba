 /** 
  * CreateSambaPrinterHost.java
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
  * Description: DataLoader for SambaHosts
  * 
  */
package org.sblim.wbemsmt.cli.samba.listener;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage2;
import org.sblim.wbemsmt.tools.cli.CliDataLoader;
import org.sblim.wbemsmt.tools.cli.CliUtil;
import org.sblim.wbemsmt.tools.cli.OptionDefinition;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class CreateSambaHostLoader extends SambaServiceLoader  implements CliDataLoader {

	protected OptionDefinition getServiceNameKey() {
		return CreateSambaHost.KEY_GLOBAL_serviceName;
	}


	public void loadTracingObject(WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, HostWizardPage2 page2) throws WbemsmtException {
		//trace not more than an service because more than one printer can be created
		String serviceName = CliUtil.getOption(commandValues,CreateSambaHost.KEY_GLOBAL_serviceName);
		try {
			selectService(bundle, adapter, serviceName);
		} catch (WbemsmtException e) {
			throw new WbemsmtException(WbemsmtException.ERR_OBJECT_NOT_FOUND,bundle.getString("service.not.found",new Object[]{serviceName}),e);
		}
	}

}
