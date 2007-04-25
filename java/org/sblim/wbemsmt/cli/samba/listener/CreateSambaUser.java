/** 
  * CreateSambaUser.java
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
  * @template: ./tools-dcg/templates/cmd/createCommand.vm
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

public class CreateSambaUser extends CimCommand implements ContainerUpdater {

	
 
 
	//All Options that are local and defined for this command
			/**
		 * 
		 */
		public static final OptionDefinition KEY_username = new OptionDefinition(null,"username","noDefaultValue","UserWizardPage1.SambaUserName.argValue",true,false,"UserWizardPage1.SambaUserName.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_userPassword = new OptionDefinition(null,"userPassword","noDefaultValue","UserWizardPage1.SambaUserPassword.argValue",true,false,"UserWizardPage1.SambaUserPassword.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_userPasswordVerify = new OptionDefinition(null,"userPasswordVerify","noDefaultValue","UserWizardPage1.SambaUserPassword2.argValue",true,false,"UserWizardPage1.SambaUserPassword2.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_isGuest = new OptionDefinition(null,"isGuest","noDefaultValue","UserWizardPage1.isGuest.argValue",true,false,"UserWizardPage1.isGuest.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_accessToAll = new OptionDefinition(null,"accessToAll","noDefaultValue","UserWizardPage2.accessToAll.argValue",true,false,"UserWizardPage2.accessToAll.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_systemUser = new OptionDefinition(null,"systemUser","noDefaultValue","UserWizardPage3.SystemUserName.argValue",false,false,"UserWizardPage3.SystemUserName.argDescription");
		
	//All Options that are global and task-related
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition(null,"serviceName","noDefaultValue","serviceName.argValue",true,false,"serviceName.argDescription");
	
	// Global Communication Options
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition(null,"hostname",null,"hostname.argValue",false,false,"hostname.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition(null,"port","5988","port.argValue",false,false,"port.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition(null,"namespace","/root/cimv2","namespace.argValue",false,false,"namespace.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition(null,"user",null,"user.argValue",false,false,"user.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition(null,"password",null,"password.argValue",false,false,"password.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition(null,"publickeyfile",null,"publickeyfile.argValue",false,false,"publickeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition(null,"privatekeyfile",null,"privatekeyfile.argValue",false,false,"privatekeyfile.argDescription");
	
	// Global Common Options
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_QUESTION_MARK_ = new OptionDefinition("?",null,null,null,false,false,"?.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_help = new OptionDefinition("h","help",null,null,false,false,"help.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_locale = new OptionDefinition("L","locale","en","locale.argValue",false,false,"locale.argDescription");
	
	private static final OptionDefinition[] LOCAL_OPTIONS = new OptionDefinition []
	{
    	    	KEY_username,
    	    	KEY_userPassword,
    	    	KEY_userPasswordVerify,
    	    	KEY_isGuest,
    	    	KEY_accessToAll,
    	    	KEY_systemUser,
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

	
	public CreateSambaUser(java.util.Locale locale)
	{
		super("CreateSambaUser", new String[]{"messages","messagesSamba"},locale);
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
			
			values.getOut().println("\n" + bundle.getString("creating", new Object[]{bundle.getString("userWizard.caption")}));
			
			CliDataLoader loader = new CreateSambaUserLoader();
			loader.load(bundle,adapter, cmd );
			
			org.sblim.wbemsmt.cli.samba.wizard.UserWizard wizard = new org.sblim.wbemsmt.cli.samba.wizard.UserWizard((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter) adapter);
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
						else if (lastPanel instanceof org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3) ((CreateSambaUserLoader)loader).loadTracingObject(bundle,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3)lastPanel);
						else {
				logger.severe("Cannot loadTracingObject for " + lastPanel.getClass().getName());
				throw new WbemSmtException(bundle.getString("internal.error"));
			}
			
			org.sblim.wbemsmt.cli.samba.container.user.UserDataContainerImpl dc = new org.sblim.wbemsmt.cli.samba.container.user.UserDataContainerImpl(adapter);

						
        				
			adapter.updateControls(dc);
			values.getOut().println("\n" + bundle.getString("createdObject") + ":\n");
			dc.trace(values.getOut());
			
		values.getOut().println("\n" + bundle.getString("created", new Object[]{bundle.getString("userWizard.caption")}));
		
		}
		catch (Exception e)
		{
			super.handleException(e,values.getArgs(),values.getOptions(),KEY_GLOBAL_password);
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
											setValue(cmd,dc.get_SystemUserName(),KEY_systemUser);
															
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