/** 
  * HostWizard.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
  * @template: ./tools-dcg/templates/cmd/wizardClass.vm
  *
  * Contributors: 
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.wizard;

import java.util.*;
import java.util.logging.Logger;

import org.sblim.wbemsmt.bl.adapter.DataContainer;

import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.wizard.adapter.IPageWizardAdapter;
import org.sblim.wbemsmt.tools.wizard.cli.*;
import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;
import org.sblim.wbemsmt.exception.WbemSmtException;

public class HostWizard extends CliWizardBase implements IPageWizardAdapter {

	static Logger logger = Logger.getLogger(HostWizard.class.getName());
	private org.sblim.wbemsmt.samba.wizard.HostWizardContainer container = null;
	
	public HostWizard(final org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter) {
		super(adapter,ResourceBundleManager.getResourceBundle(new String[]{"messages","messagesSamba"},Locale.getDefault()));
		this.container = new org.sblim.wbemsmt.samba.wizard.HostWizardContainer (adapter, new org.sblim.wbemsmt.samba.wizard.HostWizardContainerPanels()
 			{
            					public Object getPage1()  throws WbemSmtException {
					DataContainer dc = new org.sblim.wbemsmt.cli.samba.container.wizard.HostWizardPage1Impl(adapter);
					return dc;
				}
            					public Object getPage2()  throws WbemSmtException {
					DataContainer dc = new org.sblim.wbemsmt.cli.samba.container.wizard.HostWizardPage2Impl(adapter);
					return dc;
				}
            	 			});
		super.initialize();
 		try {
 			super.initWizard((IWizardContainer)container, this);
 		} catch (Exception ex) {
 			ex.printStackTrace();
 			return;
 		}
 		logger.fine("Wizard initialized");
	}
	
	public void cleanUPPage(String panelName) {
		//cleanup is done in the adapter
	}
	
	public IWizardContainer getWizardContainer()
	{
		return container;
	}
}