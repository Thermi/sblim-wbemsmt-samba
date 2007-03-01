/** 
  * CreateSambaShare.java
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
import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.cli.*;
import org.sblim.wbemsmt.tools.wizard.cli.*;

public class CreateSambaShare extends CimCommand implements ContainerUpdater {

	
 
 
	//All Options that are local and defined for this command
			/**
		 * 
		 */
		public static final OptionDefinition KEY_sharename = new OptionDefinition(null,"sharename","noDefaultValue","ShareWizardPage1.Name.argValue",true,false,"ShareWizardPage1.Name.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_path = new OptionDefinition(null,"path","noDefaultValue","ShareWizardPage1.Path.argValue",true,false,"ShareWizardPage1.Path.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_comment = new OptionDefinition(null,"comment","noDefaultValue","ShareWizardPage1.Comment.argValue",false,false,"ShareWizardPage1.Comment.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_seenByEverybody = new OptionDefinition(null,"seenByEverybody","noDefaultValue","ShareWizardPage2.seenByEverybody.argValue",false,false,"ShareWizardPage2.seenByEverybody.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_forceUser = new OptionDefinition(null,"forceUser","noDefaultValue","ShareWizardPage2.forceUser.argValue",false,false,"ShareWizardPage2.forceUser.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_enableGuest = new OptionDefinition(null,"enableGuest","noDefaultValue","ShareWizardPage2.enableGuest.argValue",false,false,"ShareWizardPage2.enableGuest.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_enableAllUsers = new OptionDefinition(null,"enableAllUsers","noDefaultValue","ShareWizardPage2.enableAllUsers.argValue",false,false,"ShareWizardPage2.enableAllUsers.argDescription");
		
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
		public static final OptionDefinition KEY_GLOBAL_locale = new OptionDefinition("L","locale","en","locale.argValue",false,false,"locale.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_h = new OptionDefinition("h",null,null,null,false,false,"h.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_QUESTION_MARK_ = new OptionDefinition("?",null,null,null,false,false,"?.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_help = new OptionDefinition("h","help",null,null,false,false,"help.argDescription");
	
	private static final OptionDefinition[] LOCAL_OPTIONS = new OptionDefinition []
	{
    	    	KEY_sharename,
    	    	KEY_path,
    	    	KEY_comment,
    	    	KEY_seenByEverybody,
    	    	KEY_forceUser,
    	    	KEY_enableGuest,
    	    	KEY_enableAllUsers,
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
    	    	KEY_GLOBAL_locale,
    	    	KEY_GLOBAL_h,
    	    	KEY_GLOBAL_QUESTION_MARK_,
    	    	KEY_GLOBAL_help,
    		};

	
	
 
 CommandLine cmd = null;
	AbstractBaseCimAdapter adapter = null;

	
	public CreateSambaShare(java.util.Locale locale)
	{
		super("CreateSambaShare", new String[]{"messages","messagesSamba"},locale);
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
			    || hasOption(values.getArgs(), "-" + KEY_GLOBAL_h.getShortKey()) )
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
			
			values.getOut().println("\n" + bundle.getString("creating", new Object[]{bundle.getString("shareWizard.caption")}));
			
			CliDataLoader loader = new CreateSambaShareLoader();
			loader.load(bundle,adapter, cmd );
			
			org.sblim.wbemsmt.cli.samba.wizard.ShareWizard wizard = new org.sblim.wbemsmt.cli.samba.wizard.ShareWizard((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter) adapter);
			wizard.startWizard();
			
			while (!wizard.getContainer().isLast(wizard.getContainer().getCurrentPageName()))
			{
				BaseDataContainer dataContainer = wizard.getCurrentPanel();
				if (true == false);
								else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1) setCommandLineValues(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1)dataContainer);
								else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2) setCommandLineValues(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2)dataContainer);
								else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4) setCommandLineValues(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4)dataContainer);
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
						else if (lastPanel instanceof org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4) ((CreateSambaShareLoader)loader).loadTracingObject(bundle,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4)lastPanel);
						else {
				logger.severe("Cannot loadTracingObject for " + lastPanel.getClass().getName());
				throw new WbemSmtException(bundle.getString("internal.error"));
			}
			
			org.sblim.wbemsmt.cli.samba.container.share.ShareOptionsDataContainerImpl dc = new org.sblim.wbemsmt.cli.samba.container.share.ShareOptionsDataContainerImpl(adapter);

						
        				
			adapter.updateControls(dc);
			values.getOut().println("\n" + bundle.getString("createdObject") + ":\n");
			dc.trace(values.getOut());
			
		values.getOut().println("\n" + bundle.getString("created", new Object[]{bundle.getString("shareWizard.caption")}));
		
		}
		catch (Exception e)
		{
			super.handleException(e,values.getArgs(),values.getOptions(),KEY_GLOBAL_password);
		}
	}
    
	public void prepareForUpdateControls(DataContainer dataContainer) throws UpdateControlsException
	{
		if (true == false);
				else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1) updateContainerChilds(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1)dataContainer);
				else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2) updateContainerChilds(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2)dataContainer);
				else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4) updateContainerChilds(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4)dataContainer);
				else {

				logger.severe("Cannot setValues for Container " + dataContainer.getClass().getName());
				throw new UpdateControlsException("Cannot setValues for Container " + dataContainer.getClass().getName());
		}
	}
	
			
	private void updateContainerChilds(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1 dc) throws UpdateControlsException {
		
		try
		{
    		//update the child-containers
    		
			    		
        			}
		catch (Exception e)
		{
				throw new UpdateControlsException(bundle.getString("internal.error"),e);
		}
		
		
	}
	
	private void setCommandLineValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1 dc) throws WbemSmtException {
		//set the values
											setValue(cmd,dc.get_Name(),KEY_sharename);
																						setValue(cmd,dc.get_Path(),KEY_path);
																						setValue(cmd,dc.get_Comment(),KEY_comment);
															
		//The Buttons
    																														
	}	

			
	private void updateContainerChilds(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2 dc) throws UpdateControlsException {
		
		try
		{
    		//update the child-containers
    		
						int count = 0;
			    		
        	    		
    		count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer.class);
    		dc.getUsers().clear();
    		for (int i=0; i < count; i++) {
    			org.sblim.wbemsmt.cli.samba.container.wizard.UserInShareWizardACLItemDataContainerImpl child = new org.sblim.wbemsmt.cli.samba.container.wizard.UserInShareWizardACLItemDataContainerImpl(adapter);
    			dc.getUsers().add(child);
    		}
					}
		catch (Exception e)
		{
				throw new UpdateControlsException(bundle.getString("internal.error"),e);
		}
		
		
	}
	
	private void setCommandLineValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2 dc) throws WbemSmtException {
		//set the values
														setCheckboxValue(cmd,dc.get_usr_SeenByEverybody(),KEY_seenByEverybody);
																									setMultiValue(adapter.getBundle(),cmd,dc.get_usr_ForceUser(),KEY_forceUser);
																			setCheckboxValue(cmd,dc.get_usr_EnableGuest(),KEY_enableGuest);
																						setCheckboxValue(cmd,dc.get_usr_EnableAllUsers(),KEY_enableAllUsers);
												
		//The Buttons
    																																					if (!pressButton(cmd,adapter,dc,dc.get_usr_EnableAllUsers(),KEY_enableAllUsers)) return;
									
	}	

			
	private void updateContainerChilds(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4 dc) throws UpdateControlsException {
		
		try
		{
    		//update the child-containers
    		
						int count = 0;
			    		
        	    		
    		count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer.class);
    		dc.getUsers().clear();
    		for (int i=0; i < count; i++) {
    			org.sblim.wbemsmt.cli.samba.container.wizard.UserInShareWizardACLItemDataContainerImpl child = new org.sblim.wbemsmt.cli.samba.container.wizard.UserInShareWizardACLItemDataContainerImpl(adapter);
    			dc.getUsers().add(child);
    		}
					}
		catch (Exception e)
		{
				throw new UpdateControlsException(bundle.getString("internal.error"),e);
		}
		
		
	}
	
	private void setCommandLineValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4 dc) throws WbemSmtException {
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