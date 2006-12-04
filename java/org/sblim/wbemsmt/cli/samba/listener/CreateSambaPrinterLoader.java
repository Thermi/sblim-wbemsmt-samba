 /** 
  * CreateSambaPrinterLoader.java
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
  * Description: Loader for loading the Service to create a printer
  * 
  */
package org.sblim.wbemsmt.cli.samba.listener;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.exception.ObjectNotFoundException;
import org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage5;
import org.sblim.wbemsmt.tools.cli.CliDataLoader;
import org.sblim.wbemsmt.tools.cli.CliUtil;
import org.sblim.wbemsmt.tools.cli.OptionDefinition;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class CreateSambaPrinterLoader extends SambaServiceLoader  implements CliDataLoader {

	protected OptionDefinition getServiceNameKey() {
		return CreateSambaPrinter.KEY_GLOBAL_serviceName;
	}


	public void loadTracingObject(WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, PrinterWizardPage5 page5) throws ObjectNotFoundException {
		//trace not more than an service because more than one printer can be created
		String serviceName = CliUtil.getOption(cmd,CreateSambaShare.KEY_GLOBAL_serviceName);
		try {
			selectService(bundle, adapter, serviceName);
		} catch (ObjectNotFoundException e) {
			throw new ObjectNotFoundException(bundle.getString("service.not.found",new Object[]{serviceName}),e);
		}
	}

}
