 /** 
  * CreateSambaShareLoader.java
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
  * Description: Description: Loader for loading the Service to create a share
  * 
  */
package org.sblim.wbemsmt.cli.samba.listener;


import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.exception.ObjectNotFoundException;
import org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4;
import org.sblim.wbemsmt.tools.cli.CliDataLoader;
import org.sblim.wbemsmt.tools.cli.CliUtil;
import org.sblim.wbemsmt.tools.cli.OptionDefinition;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class CreateSambaShareLoader extends SambaServiceLoader  implements CliDataLoader  {

	protected OptionDefinition getServiceNameKey() {
		return CreateSambaShare.KEY_GLOBAL_serviceName;
	}


	public void loadTracingObject(WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, ShareWizardPage4 page4) throws ObjectNotFoundException {
		String serviceName = CliUtil.getOption(cmd,CreateSambaShare.KEY_GLOBAL_serviceName);
		String shareName = (String) page4.get_Name().getConvertedControlValue();
		
		selectShare(bundle, adapter, serviceName, shareName);
	}

}
