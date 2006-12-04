/** 
  * CreateSambaUser.java
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
  * @template: ./tools-dcg/templates/cmd/createCommand.vm
  *
  * Contributors: 
  * 
  * Description: Class for creating objects
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.listener;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.GnuParser;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.BaseDataContainer;
import org.sblim.wbemsmt.bl.adapter.CimAdapterFactory;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.exception.UpdateControlsException;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.tools.cli.*;
import org.sblim.wbemsmt.tools.wizard.cli.*;

public class CreateSambaUser extends CimCommand implements ContainerUpdater {

			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition("hostname",null,"CreateSambaUser.hostname.argValue",true,false,"CreateSambaUser.hostname.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition("port","5988","CreateSambaUser.port.argValue",false,false,"CreateSambaUser.port.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition("namespace","/root/cimv2","CreateSambaUser.namespace.argValue",false,false,"CreateSambaUser.namespace.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition("user",null,"CreateSambaUser.user.argValue",true,false,"CreateSambaUser.user.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition("password",null,"CreateSambaUser.password.argValue",true,false,"CreateSambaUser.password.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition("publickeyfile","none","CreateSambaUser.publickeyfile.argValue",false,false,"CreateSambaUser.publickeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition("privatekeyfile","none","CreateSambaUser.privatekeyfile.argValue",false,false,"CreateSambaUser.privatekeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition("serviceName",null,"CreateSambaUser.serviceName.argValue",true,false,"CreateSambaUser.serviceName.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_username = new OptionDefinition("username",null,"UserWizardPage1.SambaUserName.argValue",true,false,"UserWizardPage1.SambaUserName.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_systemUser = new OptionDefinition("systemUser",null,"UserWizardPage1.SystemUserName.argValue",true,false,"UserWizardPage1.SystemUserName.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_userPassword = new OptionDefinition("userPassword",null,"UserWizardPage1.SambaUserPassword.argValue",true,false,"UserWizardPage1.SambaUserPassword.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_userPasswordVerify = new OptionDefinition("userPasswordVerify",null,"UserWizardPage1.SambaUserPassword2.argValue",true,false,"UserWizardPage1.SambaUserPassword2.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_isGuest = new OptionDefinition("isGuest",null,"UserWizardPage1.isGuest.argValue",true,false,"UserWizardPage1.isGuest.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_accessToAll = new OptionDefinition("accessToAll",null,"UserWizardPage2.accessToAll.argValue",true,false,"UserWizardPage2.accessToAll.argDescription");
		
public static final OptionDefinition KEY_locale = new OptionDefinition("locale","en","locale",false,false,"locale");	
	
	private static final OptionDefinition[] OPTIONS = new OptionDefinition []
	{
    	    	KEY_GLOBAL_hostname,
    	    	KEY_GLOBAL_port,
    	    	KEY_GLOBAL_namespace,
    	    	KEY_GLOBAL_user,
    	    	KEY_GLOBAL_password,
    	    	KEY_GLOBAL_publickeyfile,
    	    	KEY_GLOBAL_privatekeyfile,
    	    	KEY_GLOBAL_serviceName,
    	    	KEY_username,
    	    	KEY_systemUser,
    	    	KEY_userPassword,
    	    	KEY_userPasswordVerify,
    	    	KEY_isGuest,
    	    	KEY_accessToAll,
    			KEY_locale,
	};

	
	
 
 CommandLine cmd = null;
	AbstractBaseCimAdapter adapter = null;

	
	public CreateSambaUser(java.util.Locale locale)
	{
		super("CreateSambaUser", new String[]{"messages","messagesSamba"},locale);
	}

	public void execute(String[] args) throws WbemSmtException {

	    Options options = createOptions(OPTIONS, bundle);
		if (args.length == 1 && (args[0].equalsIgnoreCase("--help") || args[0].equalsIgnoreCase("-h") ))
		{
			showUsage(options);
			return;
		}
		
		System.out.println("\n" + bundle.getString("creating", new Object[]{bundle.getString("userWizard.caption")}));
		//do the real processing
		try {
			
 
			
			CommandLineParser parser = new GnuParser();
			
			//check if the password is the only argument that is missing and query the user if thats the case
			args = super.checkPassword(parser,options,args,KEY_GLOBAL_hostname,KEY_GLOBAL_user,KEY_GLOBAL_password);
			
			cmd = parser.parse( options, args);
			adapter = 
					(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)CimAdapterFactory.getInstance()
					.getAdapter(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter.class,this);
			adapter.setBundle(bundle);
			adapter.setCimClient(getCimClient(cmd, 
				KEY_GLOBAL_hostname,
				KEY_GLOBAL_port,
				KEY_GLOBAL_namespace,
				KEY_GLOBAL_user,
				KEY_GLOBAL_password,
				KEY_GLOBAL_publickeyfile,
				KEY_GLOBAL_privatekeyfile));
				
			adapter.loadInitial(adapter.getCimClient());
			
			CliDataLoader loader = new CreateSambaUserLoader();
			loader.load(bundle,adapter, cmd);
			
			org.sblim.wbemsmt.cli.samba.wizard.UserWizard wizard = new org.sblim.wbemsmt.cli.samba.wizard.UserWizard((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter) adapter);
			wizard.startWizard();
			
			while (!wizard.getContainer().isLast(wizard.getContainer().getCurrentPageName()))
			{
				BaseDataContainer dataContainer = wizard.getCurrentPanel();
				if (true == false);
								else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1) setCommandLineValues(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1)dataContainer);
								else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2) setCommandLineValues(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2)dataContainer);
								else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3) setCommandLineValues(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3)dataContainer);
								else {
					logger.severe(dataContainer.getClass().getName() + " cannot be handled from command class "  + this.getClass().getName());
										throw new WbemSmtException(bundle.getString("internal.error"));
				}

				MessageList result = MessageList.init(dataContainer);					
				if (result.hasErrors())
				{
    					traceErrors(result);
    					return;
				}
				else
				{
					traceMessages("additional.messages",result);
					result.clear();
				}
				
				wizard.next(this);
				result = wizard.getCurrentPanel().getMessagesList();

				if (result != null)
				{
					if (result.hasErrors())
					{
    					traceErrors("validation.error",result);
    					return;
					}
					else
					{
						traceMessages("additional.messages",result);
						dataContainer.getMessagesList().clear();
					}
				}
			}			
			
			BaseDataContainer lastPanel = wizard.getCurrentPanel();
			wizard.finish();

			if (true == false);
						else if (lastPanel instanceof org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3) ((CreateSambaUserLoader)loader).loadTracingObject(bundle,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3)lastPanel);
						else {
				logger.severe("Cannot loadTracingObject for " + lastPanel.getClass().getName());
				throw new WbemSmtException(bundle.getString("internal.error"));
			}
			
			org.sblim.wbemsmt.cli.samba.container.user.UserDataContainerImpl dc = new org.sblim.wbemsmt.cli.samba.container.user.UserDataContainerImpl(adapter);

						
        				
			adapter.updateControls(dc);
			System.out.println("\n" + bundle.getString("createdObject") + ":\n");
			dc.trace(System.out);
			
		System.out.println("\n" + bundle.getString("created", new Object[]{bundle.getString("userWizard.caption")}));
		
		}
		catch (Exception e)
		{
			super.handleException(e,args,options,KEY_GLOBAL_password);
		}
	}
    
	public void prepareForUpdateControls(DataContainer dataContainer) throws UpdateControlsException
	{
		if (true == false);
				else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1) updateContainerChilds(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1)dataContainer);
				else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2) updateContainerChilds(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2)dataContainer);
				else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3) updateContainerChilds(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3)dataContainer);
				else {

				logger.severe("Cannot setValues for Container " + dataContainer.getClass().getName());
				throw new UpdateControlsException("Cannot setValues for Container " + dataContainer.getClass().getName());
		}
	}
	
			
	private void updateContainerChilds(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1 dc) throws UpdateControlsException {
		
		try
		{
    		//update the child-containers
    		
			    		
        			}
		catch (Exception e)
		{
				throw new UpdateControlsException(bundle.getString("internal.error"),e);
		}
		
		
	}
	
	private void setCommandLineValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1 dc) throws WbemSmtException {
		//set the values
											setValue(cmd,dc.get_SambaUserName(),KEY_username);
																												setMultiValue(adapter.getBundle(),cmd,dc.get_SystemUserName(),KEY_systemUser);
																setValue(cmd,dc.get_SambaUserPassword(),KEY_userPassword);
																						setValue(cmd,dc.get_SambaUserPassword2(),KEY_userPasswordVerify);
																									setCheckboxValue(cmd,dc.get_usr_IsGuest(),KEY_isGuest);
												
		//The Buttons
    																																																
	}	

			
	private void updateContainerChilds(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2 dc) throws UpdateControlsException {
		
		try
		{
    		//update the child-containers
    		
						int count = 0;
			    		
        	    		
    		count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainer.class);
    		dc.getShares().clear();
    		for (int i=0; i < count; i++) {
    			org.sblim.wbemsmt.cli.samba.container.wizard.ShareInUserWizardACLItemDataContainerImpl child = new org.sblim.wbemsmt.cli.samba.container.wizard.ShareInUserWizardACLItemDataContainerImpl(adapter);
    			dc.getShares().add(child);
    		}
			    		
    		count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainer.class);
    		dc.getPrinters().clear();
    		for (int i=0; i < count; i++) {
    			org.sblim.wbemsmt.cli.samba.container.wizard.PrinterInUserWizardACLItemDataContainerImpl child = new org.sblim.wbemsmt.cli.samba.container.wizard.PrinterInUserWizardACLItemDataContainerImpl(adapter);
    			dc.getPrinters().add(child);
    		}
					}
		catch (Exception e)
		{
				throw new UpdateControlsException(bundle.getString("internal.error"),e);
		}
		
		
	}
	
	private void setCommandLineValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2 dc) throws WbemSmtException {
		//set the values
														setCheckboxValue(cmd,dc.get_usr_AccessToAll(),KEY_accessToAll);
												
		//The Buttons
    										if (!pressButton(cmd,adapter,dc,dc.get_usr_AccessToAll(),KEY_accessToAll)) return;
									
	}	

			
	private void updateContainerChilds(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3 dc) throws UpdateControlsException {
		
		try
		{
    		//update the child-containers
    		
						int count = 0;
			    		
        	    		
    		count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainer.class);
    		dc.getShares().clear();
    		for (int i=0; i < count; i++) {
    			org.sblim.wbemsmt.cli.samba.container.wizard.ShareInUserWizardACLItemDataContainerImpl child = new org.sblim.wbemsmt.cli.samba.container.wizard.ShareInUserWizardACLItemDataContainerImpl(adapter);
    			dc.getShares().add(child);
    		}
			    		
    		count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainer.class);
    		dc.getPrinters().clear();
    		for (int i=0; i < count; i++) {
    			org.sblim.wbemsmt.cli.samba.container.wizard.PrinterInUserWizardACLItemDataContainerImpl child = new org.sblim.wbemsmt.cli.samba.container.wizard.PrinterInUserWizardACLItemDataContainerImpl(adapter);
    			dc.getPrinters().add(child);
    		}
					}
		catch (Exception e)
		{
				throw new UpdateControlsException(bundle.getString("internal.error"),e);
		}
		
		
	}
	
	private void setCommandLineValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3 dc) throws WbemSmtException {
		//set the values
				
		//The Buttons
    			
	}	

	}