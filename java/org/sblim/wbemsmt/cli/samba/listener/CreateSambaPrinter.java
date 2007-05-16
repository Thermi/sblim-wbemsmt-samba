/** 
  * CreateSambaPrinter.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/cmd/createCommand.vm
  *
  * Contributors: 
  * 
  * Description: Class for creating objects
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.listener;

import org.apache.commons.cli.*;
import org.apache.commons.lang.ClassUtils;
import org.sblim.wbemsmt.bl.*;
import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.cli.*;
import org.sblim.wbemsmt.tools.wizard.cli.*;

public class CreateSambaPrinter extends CimCommand implements ContainerUpdater {

	
 
 
	//All Options that are local and defined for this command
			/**
   		 * required,  --allOrOne, default: noDefaultValue
		 */
		public static final OptionDefinition KEY_allOrOne = new OptionDefinition(null,"allOrOne","noDefaultValue","PrinterWizardPage1.allOrOne.argValue",true,false,"PrinterWizardPage1.allOrOne.argDescription");
			/**
   		 * required,  --sambaPrinterName, default: noDefaultValue
		 */
		public static final OptionDefinition KEY_sambaPrinterName = new OptionDefinition(null,"sambaPrinterName","noDefaultValue","PrinterWizardPage2.SambaPrinterName.argValue",true,false,"PrinterWizardPage2.SambaPrinterName.argDescription");
			/**
   		 * required,  --systemPrintername, default: noDefaultValue
		 */
		public static final OptionDefinition KEY_systemPrintername = new OptionDefinition(null,"systemPrintername","noDefaultValue","PrinterWizardPage2.SystemPrinterName.argValue",true,false,"PrinterWizardPage2.SystemPrinterName.argDescription");
			/**
   		 * required,  --path, default: noDefaultValue
		 */
		public static final OptionDefinition KEY_path = new OptionDefinition(null,"path","noDefaultValue","PrinterWizardPage2.Path.argValue",true,false,"PrinterWizardPage2.Path.argDescription");
			/**
   		 *  --comment, default: noDefaultValue
		 */
		public static final OptionDefinition KEY_comment = new OptionDefinition(null,"comment","noDefaultValue","PrinterWizardPage2.Comment.argValue",false,false,"PrinterWizardPage2.Comment.argDescription");
			/**
   		 *  --seenByEverybody, default: noDefaultValue
		 */
		public static final OptionDefinition KEY_seenByEverybody = new OptionDefinition(null,"seenByEverybody","noDefaultValue","PrinterWizardPage3.seenByEverybody.argValue",false,false,"PrinterWizardPage3.seenByEverybody.argDescription");
			/**
   		 *  --enableGuest, default: noDefaultValue
		 */
		public static final OptionDefinition KEY_enableGuest = new OptionDefinition(null,"enableGuest","noDefaultValue","PrinterWizardPage3.enableGuest.argValue",false,false,"PrinterWizardPage3.enableGuest.argDescription");
			/**
   		 *  --enableAllUsers, default: noDefaultValue
		 */
		public static final OptionDefinition KEY_enableAllUsers = new OptionDefinition(null,"enableAllUsers","noDefaultValue","PrinterWizardPage3.enableAllUsers.argValue",false,false,"PrinterWizardPage3.enableAllUsers.argDescription");
			/**
   		 *  --forceUser, default: noDefaultValue
		 */
		public static final OptionDefinition KEY_forceUser = new OptionDefinition(null,"forceUser","noDefaultValue","PrinterWizardPage3.forceUser.argValue",false,false,"PrinterWizardPage3.forceUser.argDescription");
			/**
   		 *  --cupsOptions, default: noDefaultValue
		 */
		public static final OptionDefinition KEY_cupsOptions = new OptionDefinition(null,"cupsOptions","noDefaultValue","PrinterWizardPage4.CupsOptions.argValue",false,false,"PrinterWizardPage4.CupsOptions.argDescription");
			/**
   		 *  --printCommand, default: noDefaultValue
		 */
		public static final OptionDefinition KEY_printCommand = new OptionDefinition(null,"printCommand","noDefaultValue","PrinterWizardPage4.PrintCommand.argValue",false,false,"PrinterWizardPage4.PrintCommand.argDescription");
		
	//All Options that are global and task-related
			/**
   		 * required, used for selection:  --serviceName, default: noDefaultValue
		 */
		public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition(null,"serviceName","noDefaultValue","serviceName.argValue",true,false,"serviceName.argDescription");
	
	// Global Communication Options
			/**
   		 *  --hostname
		 */
		public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition(null,"hostname",null,"hostname.argValue",false,false,"hostname.argDescription");
			/**
   		 *  --port, default: 5988
		 */
		public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition(null,"port","5988","port.argValue",false,false,"port.argDescription");
			/**
   		 *  --namespace, default: /root/cimv2
		 */
		public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition(null,"namespace","/root/cimv2","namespace.argValue",false,false,"namespace.argDescription");
			/**
   		 *  --user
		 */
		public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition(null,"user",null,"user.argValue",false,false,"user.argDescription");
			/**
   		 *  --password
		 */
		public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition(null,"password",null,"password.argValue",false,false,"password.argDescription");
			/**
   		 *  --publickeyfile
		 */
		public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition(null,"publickeyfile",null,"publickeyfile.argValue",false,false,"publickeyfile.argDescription");
			/**
   		 *  --privatekeyfile
		 */
		public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition(null,"privatekeyfile",null,"privatekeyfile.argValue",false,false,"privatekeyfile.argDescription");
	
	// Global Common Options
			/**
   		 *  -?
		 */
		public static final OptionDefinition KEY_GLOBAL_QUESTION_MARK_ = new OptionDefinition("?",null,null,null,false,false,"?.argDescription");
			/**
   		 *  -h --help
		 */
		public static final OptionDefinition KEY_GLOBAL_help = new OptionDefinition("h","help",null,null,false,false,"help.argDescription");
			/**
   		 *  -L --locale, default: en
		 */
		public static final OptionDefinition KEY_GLOBAL_locale = new OptionDefinition("L","locale","en","locale.argValue",false,false,"locale.argDescription");
	
	private static final OptionDefinition[] LOCAL_OPTIONS = new OptionDefinition []
	{
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
    		};

	private static final OptionDefinition[] GLOBAL_TASK_OPTIONS = new OptionDefinition []
	{
    	    	KEY_GLOBAL_serviceName,
    		};

	private static final OptionDefinition[] GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS = new OptionDefinition []
	{
    	    	KEY_GLOBAL_hostname,
    	    	KEY_GLOBAL_port,
    	    	KEY_GLOBAL_namespace,
    	    	KEY_GLOBAL_user,
    	    	KEY_GLOBAL_password,
    	    	KEY_GLOBAL_publickeyfile,
    	    	KEY_GLOBAL_privatekeyfile,
    		};

	private static final OptionDefinition[] GLOBAL_WBEMSMT_COMMON_OPTIONS = new OptionDefinition []
	{
    	    	KEY_GLOBAL_QUESTION_MARK_,
    	    	KEY_GLOBAL_help,
    	    	KEY_GLOBAL_locale,
    		};

	
	
 
 CommandLine cmd = null;
	AbstractBaseCimAdapter adapter = null;

	
	public CreateSambaPrinter(java.util.Locale locale)
	{
		super("CreateSambaPrinter", new String[]{"messages","messagesSamba"},locale);
	}

	public void execute(CimCommandValues values) throws WbemSmtException {

		//do the real processing
		try {
			
 
			commandValues = values;
			cmd = values.getCommandLine();

			Options options = values.getOptions();
			
			//first handle the help options and then the parseException
			//if the user wants help parsing the args will fail (due to missing required args)
			//and so the helpOptions should be handled first
			
    		if (   hasOption(values.getArgs(), "-" + KEY_GLOBAL_QUESTION_MARK_.getShortKey())
			    || hasOption(values.getArgs(), "-" + KEY_GLOBAL_help.getShortKey()) )
    		{
    			showUsage(values.getOut(), options);
    			return;
    		}			
    		else if ( hasOption(values.getArgs(), "--" + KEY_GLOBAL_help.getLongKey()) )
    		{
				//TODO add extendedHelp by loading a manpage or sth else
    			showUsage(values.getOut(), options);
    			return;
    		}			

			else if (values.getParseException() != null)
			{
				handleParseException(values,KEY_GLOBAL_password);
				return;
			}
			adapter = 
					(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)CimAdapterFactory.getInstance()
					.getAdapter(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter.class,this);
			adapter.setBundle(bundle);
			adapter.setCimClient(values.getCimClient());
				
			adapter.loadInitial(adapter.getCimClient());
			
			values.getOut().println("\n" + bundle.getString("printerWizard.create.start"));
			
			CliDataLoader loader = new CreateSambaPrinterLoader();
			loader.load(bundle,adapter, cmd );
			
			org.sblim.wbemsmt.cli.samba.wizard.PrinterWizard wizard = new org.sblim.wbemsmt.cli.samba.wizard.PrinterWizard((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter) adapter);
			if (!wizard.canBeExecuted())
			{
				traceErrors("error.while.execution",wizard.getMessageList());
				return;
			}
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
			
			MessageList result = wizard.finish();
			String wizardName = ClassUtils.getShortClassName(wizard.getClass());
			if (result != null && result.hasErrors())
			{
				result.addMessage(new Message(ErrCodes.MSG_CREATE_FAILED,Message.ERROR,bundle.getString(wizardName + ".create.failed")));        
			}
			else
			{
				result.addMessage(new Message(ErrCodes.MSG_CREATE_SUCCESS,Message.SUCCESS,bundle.getString(wizardName + ".create.success")));        
			}
			traceErrors(result);
			
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
			values.getOut().println("\n" + bundle.getString("createdObject") + ":\n");
			dc.trace(values.getOut());
			
   		    //values.getOut().println("\n" + bundle.getString("printerWizard.create.success"));
		
		}
		catch (Exception e)
		{
			super.handleException(e,values.getArgs(),values.getOptions(),KEY_GLOBAL_password);
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

		
	
 
			
	protected LoginOptionValues getLoginOptions() {
		return new LoginOptionValues(KEY_GLOBAL_hostname,KEY_GLOBAL_user,KEY_GLOBAL_password);
	}

	protected CimClientOptionValues getCimClientOptions() {
		
		return new CimClientOptionValues(KEY_GLOBAL_hostname,
				KEY_GLOBAL_port,
				KEY_GLOBAL_namespace,
				KEY_GLOBAL_user,
				KEY_GLOBAL_password,
				KEY_GLOBAL_publickeyfile,
				KEY_GLOBAL_privatekeyfile);
	}
	
	public Options getOptions() throws WbemSmtException {
		Options options = super.createOptions(LOCAL_OPTIONS, bundle);
		super.createOptions(options, GLOBAL_TASK_OPTIONS, bundle);
		super.createOptions(options, GLOBAL_WBEMSMT_COMMON_OPTIONS, bundle);
		super.createOptions(options, GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS, bundle);
		return options;
	}
	
	public Options getLocalOptions() throws WbemSmtException {
		Options options = super.createOptions(LOCAL_OPTIONS, bundle);
		return options;
	}

	public Options getGlobalWbemsmtCommonOptions() throws WbemSmtException {
		Options options = super.createOptions(GLOBAL_WBEMSMT_COMMON_OPTIONS, bundle);
		return options;
	}

	public Options getGlobalWbemsmtCommunicationOptions() throws WbemSmtException {
		Options options = super.createOptions(GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS, bundle);
		return options;
	}

	public Options getGlobalTaskOptions() throws WbemSmtException {
		Options options = super.createOptions(GLOBAL_TASK_OPTIONS, bundle);
		return options;
	}
	
}