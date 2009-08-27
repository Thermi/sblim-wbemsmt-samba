 /** 
  * CreateSambaUserLoader.java
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
  * Description: Loader for loading the Service to create a user
  * 
  */
package org.sblim.wbemsmt.cli.samba.listener;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3;
import org.sblim.wbemsmt.tools.cli.CliDataLoader;
import org.sblim.wbemsmt.tools.cli.CliUtil;
import org.sblim.wbemsmt.tools.cli.OptionDefinition;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class CreateSambaUserLoader extends SambaServiceLoader  implements CliDataLoader {

	protected OptionDefinition getServiceNameKey() {
		return CreateSambaUser.KEY_GLOBAL_serviceName;
	}


	public void loadTracingObject(WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, UserWizardPage3 page3) throws WbemsmtException {
		String serviceName = CliUtil.getOption(commandValues,CreateSambaShare.KEY_GLOBAL_serviceName);
		String name = (String) page3.get_SambaUserName().getConvertedControlValue();
		
		selectUser(bundle, adapter, serviceName, name);
	}
}
