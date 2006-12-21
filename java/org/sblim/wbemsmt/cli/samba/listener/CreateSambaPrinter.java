/** 
  * CreateSambaPrinter.java
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

public class CreateSambaPrinter extends CimCommand implements ContainerUpdater {

			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition("hostname",null,"CreateSambaPrinter.hostname.argValue",true,false,"CreateSambaPrinter.hostname.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition("port","5988","CreateSambaPrinter.port.argValue",false,false,"CreateSambaPrinter.port.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition("namespace","/root/cimv2","CreateSambaPrinter.namespace.argValue",false,false,"CreateSambaPrinter.namespace.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition("user",null,"CreateSambaPrinter.user.argValue",true,false,"CreateSambaPrinter.user.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition("password",null,"CreateSambaPrinter.password.argValue",true,false,"CreateSambaPrinter.password.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition("publickeyfile","none","CreateSambaPrinter.publickeyfile.argValue",false,false,"CreateSambaPrinter.publickeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition("privatekeyfile","none","CreateSambaPrinter.privatekeyfile.argValue",false,false,"CreateSambaPrinter.privatekeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition("serviceName",null,"CreateSambaPrinter.serviceName.argValue",true,false,"CreateSambaPrinter.serviceName.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_allOrOne = new OptionDefinition("allOrOne",null,"PrinterWizardPage1.allOrOne.argValue",true,false,"PrinterWizardPage1.allOrOne.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_sambaPrinterName = new OptionDefinition("sambaPrinterName",null,"PrinterWizardPage2.SambaPrinterName.argValue",true,false,"PrinterWizardPage2.SambaPrinterName.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_systemPrintername = new OptionDefinition("systemPrintername",null,"PrinterWizardPage2.SystemPrinterName.argValue",true,false,"PrinterWizardPage2.SystemPrinterName.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_path = new OptionDefinition("path",null,"PrinterWizardPage2.Path.argValue",true,false,"PrinterWizardPage2.Path.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_comment = new OptionDefinition("comment",null,"PrinterWizardPage2.Comment.argValue",false,false,"PrinterWizardPage2.Comment.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_seenByEverybody = new OptionDefinition("seenByEverybody",null,"PrinterWizardPage3.seenByEverybody.argValue",false,false,"PrinterWizardPage3.seenByEverybody.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_enableGuest = new OptionDefinition("enableGuest",null,"PrinterWizardPage3.enableGuest.argValue",false,false,"PrinterWizardPage3.enableGuest.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_enableAllUsers = new OptionDefinition("enableAllUsers",null,"PrinterWizardPage3.enableAllUsers.argValue",false,false,"PrinterWizardPage3.enableAllUsers.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_forceUser = new OptionDefinition("forceUser",null,"PrinterWizardPage3.forceUser.argValue",false,false,"PrinterWizardPage3.forceUser.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_cupsOptions = new OptionDefinition("cupsOptions",null,"PrinterWizardPage4.CupsOptions.argValue",false,false,"PrinterWizardPage4.CupsOptions.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_printCommand = new OptionDefinition("printCommand",null,"PrinterWizardPage4.PrintCommand.argValue",false,false,"PrinterWizardPage4.PrintCommand.argDescription");
		
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
    	    	KEY_allOrOne,
    	    	KEY_sambaPrinterName,
    	    	KEY_systemPrintername,
    	    	KEY_path,
    	    	KEY_comment,
    	    	KEY_seenByEverybody,
    	    	KEY_enableGuest,
    	    	KEY_enableAllUsers,
    	    	KEY_forceUser,
    	    	KEY_cupsOptions,
    	    	KEY_printCommand,
    			KEY_locale,
	};

	
	
 
 CommandLine cmd = null;
	AbstractBaseCimAdapter adapter = null;

	
	public CreateSambaPrinter(java.util.Locale locale)
	{
		super("CreateSambaPrinter", new String[]{"messages","messagesSamba"},locale);
	}

	public void execute(String[] args) throws WbemSmtException {

	    Options options = createOptions(OPTIONS, bundle);
		if (args.length == 1 && (args[0].equalsIgnoreCase("--help") || args[0].equalsIgnoreCase("-h") ))
		{
			showUsage(options);
			return;
		}
		
		System.out.println("\n" + bundle.getString("creating", new Object[]{bundle.getString("printerWizard.caption")}));
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
			
			CliDataLoader loader = new CreateSambaPrinterLoader();
			loader.load(bundle,adapter, cmd);
			
			org.sblim.wbemsmt.cli.samba.wizard.PrinterWizard wizard = new org.sblim.wbemsmt.cli.samba.wizard.PrinterWizard((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter) adapter);
			wizard.startWizard();
			
			while (!wizard.getContainer().isLast(wizard.getContainer().getCurrentPageName()))
			{
				BaseDataContainer dataContainer = wizard.getCurrentPanel();
				if (true == false);
								else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage1) setCommandLineValues(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage1)dataContainer);
								else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage2) setCommandLineValues(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage2)dataContainer);
								else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage3) setCommandLineValues(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage3)dataContainer);
								else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage4) setCommandLineValues(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage4)dataContainer);
								else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage5) setCommandLineValues(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage5)dataContainer);
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
						else if (lastPanel instanceof org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage5) ((CreateSambaPrinterLoader)loader).loadTracingObject(bundle,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage5)lastPanel);
						else {
				logger.severe("Cannot loadTracingObject for " + lastPanel.getClass().getName());
				throw new WbemSmtException(bundle.getString("internal.error"));
			}
			
			org.sblim.wbemsmt.cli.samba.container.wizard.PrinterWizardPage5Impl dc = new org.sblim.wbemsmt.cli.samba.container.wizard.PrinterWizardPage5Impl(adapter);

						int count = 0;
						
        	    		
			count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainer.class);
			dc.getUsers().clear();
			for (int i=0; i < count; i++) {
				org.sblim.wbemsmt.cli.samba.container.wizard.UserInPrinterWizardACLItemDataContainerImpl child = new org.sblim.wbemsmt.cli.samba.container.wizard.UserInPrinterWizardACLItemDataContainerImpl(adapter);
				dc.getUsers().add(child);
			}
        				
			adapter.updateControls(dc);
			System.out.println("\n" + bundle.getString("createdObject") + ":\n");
			dc.trace(System.out);
			
		System.out.println("\n" + bundle.getString("created", new Object[]{bundle.getString("printerWizard.caption")}));
		
		}
		catch (Exception e)
		{
			super.handleException(e,args,options,KEY_GLOBAL_password);
		}
	}
    
	public void prepareForUpdateControls(DataContainer dataContainer) throws UpdateControlsException
	{
		if (true == false);
				else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage1) updateContainerChilds(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage1)dataContainer);
				else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage2) updateContainerChilds(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage2)dataContainer);
				else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage3) updateContainerChilds(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage3)dataContainer);
				else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage4) updateContainerChilds(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage4)dataContainer);
				else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage5) updateContainerChilds(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage5)dataContainer);
				else {

				logger.severe("Cannot setValues for Container " + dataContainer.getClass().getName());
				throw new UpdateControlsException("Cannot setValues for Container " + dataContainer.getClass().getName());
		}
	}
	
			
	private void updateContainerChilds(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage1 dc) throws UpdateControlsException {
		
		try
		{
    		//update the child-containers
    		
			    		
        			}
		catch (Exception e)
		{
				throw new UpdateControlsException(bundle.getString("internal.error"),e);
		}
		
		
	}
	
	private void setCommandLineValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage1 dc) throws WbemSmtException {
		//set the values
																	setMultiValue(adapter.getBundle(),cmd,dc.get_usr_AllOrOne(),KEY_allOrOne);
									
		//The Buttons
    												
	}	

			
	private void updateContainerChilds(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage2 dc) throws UpdateControlsException {
		
		try
		{
    		//update the child-containers
    		
			    		
        			}
		catch (Exception e)
		{
				throw new UpdateControlsException(bundle.getString("internal.error"),e);
		}
		
		
	}
	
	private void setCommandLineValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage2 dc) throws WbemSmtException {
		//set the values
											setValue(cmd,dc.get_SambaPrinterName(),KEY_sambaPrinterName);
																												setMultiValue(adapter.getBundle(),cmd,dc.get_usr_SystemPrinterName(),KEY_systemPrintername);
																setValue(cmd,dc.get_Path(),KEY_path);
																						setValue(cmd,dc.get_Comment(),KEY_comment);
															
		//The Buttons
    																																							
	}	

			
	private void updateContainerChilds(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage3 dc) throws UpdateControlsException {
		
		try
		{
    		//update the child-containers
    		
						int count = 0;
			    		
        	    		
    		count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainer.class);
    		dc.getUsers().clear();
    		for (int i=0; i < count; i++) {
    			org.sblim.wbemsmt.cli.samba.container.wizard.UserInPrinterWizardACLItemDataContainerImpl child = new org.sblim.wbemsmt.cli.samba.container.wizard.UserInPrinterWizardACLItemDataContainerImpl(adapter);
    			dc.getUsers().add(child);
    		}
					}
		catch (Exception e)
		{
				throw new UpdateControlsException(bundle.getString("internal.error"),e);
		}
		
		
	}
	
	private void setCommandLineValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage3 dc) throws WbemSmtException {
		//set the values
														setCheckboxValue(cmd,dc.get_usr_SeenByEverybody(),KEY_seenByEverybody);
																						setCheckboxValue(cmd,dc.get_usr_EnableGuest(),KEY_enableGuest);
																						setCheckboxValue(cmd,dc.get_usr_EnableAllUsers(),KEY_enableAllUsers);
																									setMultiValue(adapter.getBundle(),cmd,dc.get_usr_ForceUser(),KEY_forceUser);
									
		//The Buttons
    																												if (!pressButton(cmd,adapter,dc,dc.get_usr_EnableAllUsers(),KEY_enableAllUsers)) return;
																		
	}	

			
	private void updateContainerChilds(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage4 dc) throws UpdateControlsException {
		
		try
		{
    		//update the child-containers
    		
			    		
        			}
		catch (Exception e)
		{
				throw new UpdateControlsException(bundle.getString("internal.error"),e);
		}
		
		
	}
	
	private void setCommandLineValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage4 dc) throws WbemSmtException {
		//set the values
											setValue(cmd,dc.get_CupsOptions(),KEY_cupsOptions);
																						setValue(cmd,dc.get_PrintCommand(),KEY_printCommand);
															
		//The Buttons
    																					
	}	

			
	private void updateContainerChilds(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage5 dc) throws UpdateControlsException {
		
		try
		{
    		//update the child-containers
    		
						int count = 0;
			    		
        	    		
    		count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainer.class);
    		dc.getUsers().clear();
    		for (int i=0; i < count; i++) {
    			org.sblim.wbemsmt.cli.samba.container.wizard.UserInPrinterWizardACLItemDataContainerImpl child = new org.sblim.wbemsmt.cli.samba.container.wizard.UserInPrinterWizardACLItemDataContainerImpl(adapter);
    			dc.getUsers().add(child);
    		}
					}
		catch (Exception e)
		{
				throw new UpdateControlsException(bundle.getString("internal.error"),e);
		}
		
		
	}
	
	private void setCommandLineValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage5 dc) throws WbemSmtException {
		//set the values
				
		//The Buttons
    			
	}	

	}