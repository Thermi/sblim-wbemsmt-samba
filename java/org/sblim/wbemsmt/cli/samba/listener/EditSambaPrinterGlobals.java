/** 
  * EditSambaPrinterGlobals.java
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
  * @template: org/sblim/wbemsmt/dcg/templates/cmd/editCommand.vm
  *
  * Contributors: 
  * 
  * Description: Class for editing objects
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.listener;

import org.apache.commons.cli.*;
import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.bl.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.cli.*;

public class EditSambaPrinterGlobals extends CimCommand {

	
 
 
	//All Options that are local and defined for this command
			/**
   		 *  --printcapCacheTime
		 */
		public static final OptionDefinition KEY_printcapCacheTime = new OptionDefinition(null,"printcapCacheTime",null,"PrintingGlobalsDataContainer.PrintcapCacheTime.argValue",false,false,"PrintingGlobalsDataContainer.PrintcapCacheTime.argDescription");
			/**
   		 *  --systemPrinterName
		 */
		public static final OptionDefinition KEY_systemPrinterName = new OptionDefinition(null,"systemPrinterName",null,"PrintingGlobalsDataContainer.SystemPrinterName.argValue",false,false,"PrintingGlobalsDataContainer.SystemPrinterName.argDescription");
			/**
   		 *  --cupsOptions
		 */
		public static final OptionDefinition KEY_cupsOptions = new OptionDefinition(null,"cupsOptions",null,"PrintingGlobalsDataContainer.CupsOptions.argValue",false,false,"PrintingGlobalsDataContainer.CupsOptions.argDescription");
			/**
   		 *  --defaultDevMode
		 */
		public static final OptionDefinition KEY_defaultDevMode = new OptionDefinition(null,"defaultDevMode",null,"PrintingGlobalsDataContainer.DefaultDevMode.argValue",false,false,"PrintingGlobalsDataContainer.DefaultDevMode.argDescription");
			/**
   		 *  --maxPrintjobs
		 */
		public static final OptionDefinition KEY_maxPrintjobs = new OptionDefinition(null,"maxPrintjobs",null,"PrintingGlobalsDataContainer.MaxPrintjobs.argValue",false,false,"PrintingGlobalsDataContainer.MaxPrintjobs.argDescription");
			/**
   		 *  --maxReportedPrintjobs
		 */
		public static final OptionDefinition KEY_maxReportedPrintjobs = new OptionDefinition(null,"maxReportedPrintjobs",null,"PrintingGlobalsDataContainer.MaxReportedPrintjobs.argValue",false,false,"PrintingGlobalsDataContainer.MaxReportedPrintjobs.argDescription");
			/**
   		 *  --printCommand
		 */
		public static final OptionDefinition KEY_printCommand = new OptionDefinition(null,"printCommand",null,"PrintingGlobalsDataContainer.PrintCommand.argValue",false,false,"PrintingGlobalsDataContainer.PrintCommand.argDescription");
			/**
   		 *  --useClientDriver
		 */
		public static final OptionDefinition KEY_useClientDriver = new OptionDefinition(null,"useClientDriver",null,"PrintingGlobalsDataContainer.UseClientDriver.argValue",false,false,"PrintingGlobalsDataContainer.UseClientDriver.argDescription");
		
	//All Options that are global and task-related
			/**
   		 * required, used for selection:  --serviceName
		 */
		public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition(null,"serviceName",null,"serviceName.argValue",true,false,"serviceName.argDescription");
	
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
    	    	KEY_printcapCacheTime,
    	    	KEY_systemPrinterName,
    	    	KEY_cupsOptions,
    	    	KEY_defaultDevMode,
    	    	KEY_maxPrintjobs,
    	    	KEY_maxReportedPrintjobs,
    	    	KEY_printCommand,
    	    	KEY_useClientDriver,
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

	
	public EditSambaPrinterGlobals(java.util.Locale locale)
	{
		super("EditSambaPrinterGlobals", new String[]{"messages","messagesSamba"},locale);
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
			
			values.getOut().println("\n" + bundle.getString("editing",new Object[]{bundle.getString("PrintingGlobalsDataContainer.caption")}));

        	CliDataLoader loader = new EditSambaPrinterGlobalsLoader();
			loader.load(bundle,adapter, commandValues);
			
			org.sblim.wbemsmt.cli.samba.container.global.PrintingGlobalsDataContainerImpl dc = new org.sblim.wbemsmt.cli.samba.container.global.PrintingGlobalsDataContainerImpl(adapter);
						int count = 0;
						
        	    		
			count = adapter.count(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals.class);
			dc.getUsers().clear();
			for (int i=0; i < count; i++) {
				org.sblim.wbemsmt.cli.samba.container.global.AdminUsersInPrinterGlobalsImpl child = new org.sblim.wbemsmt.cli.samba.container.global.AdminUsersInPrinterGlobalsImpl(adapter);
				dc.getUsers().add(child);
			}
        				
			setKeyValues(cmd,adapter,dc);

			adapter.updateControls(dc);
			adapter.setActiveModule(AbstractBaseCimAdapter.ACTIVE_EDIT);
			
			values.getOut().println("\n" + bundle.getString("before.edit"));
			dc.trace(values.getOut());

			setValues(cmd,adapter,dc);
			
			MessageList result = MessageList.init(dc);

			if (result.hasErrors())
			{
				Message caption = Message.create(ErrCodes.MSG_SAVE_ERROR, Message.ERROR,bundle, "save.error");
				traceMessages(caption,result);
				return;
			}
			else
			{
				Message caption = Message.create(ErrCodes.MSG_ADDITIONAL_MESSAGES, Message.ERROR,bundle, "additional.messages");
				traceMessages(caption,result);
				result.clear();
			}
							

			adapter.validateValues(dc);
			result = dc.getMessagesList();
			if (!result.hasErrors())
			{
				adapter.save(dc);
				//Get the infos afte storing the values
				result = dc.getMessagesList();
				if (result.hasErrors())
				{
					Message caption = Message.create(ErrCodes.MSG_SAVE_ERROR, Message.ERROR,bundle, "save.error");
					traceMessages(caption,result);
				}
				else if (result.hasWarning())
				{
					Message caption = Message.create(ErrCodes.MSG_SAVE_WARNING, Message.ERROR,bundle, "save.warning");
					traceMessages(caption,result);
				}
				else if (result.hasInfo())
				{
					Message caption = Message.create(ErrCodes.MSG_SAVE_INFO, Message.ERROR,bundle, "save.info");
					traceMessages(caption,result);
				}
			}
			else
			{
					Message caption = Message.create(ErrCodes.MSG_VALIDATION_ERROR, Message.ERROR,bundle, "validation.error");
					traceMessages(caption,result);
					return;
			}
			values.getOut().println("\n" + bundle.getString("edited", new Object[]{bundle.getString("PrintingGlobalsDataContainer.caption")}));

			adapter.updateControls(dc);

			values.getOut().println("\n" + bundle.getString("after.edit"));
			dc.trace(values.getOut());
		
		}
		catch (Exception e)
		{
			super.handleException(e,values.getArgs(),values.getOptions(),KEY_GLOBAL_password);
		}
		finally
		{
			if (adapter != null) adapter.cleanup();
		}
	}
	
	/**
	 * Set all Values that are needed for selecting the right objects. This fields are used even if they are read-only
	 **/
	private void setKeyValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.global.PrintingGlobalsDataContainer dc) throws WbemSmtException {
    	    				    				    				    				    				    				    				    					}	
	
	/**
	 * Set all Values that are not read-Only
	 **/
	private void setValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.global.PrintingGlobalsDataContainer dc) throws WbemSmtException {
    										setValue(cmd,dc.get_PrintcapCacheTime(),KEY_printcapCacheTime);
																												setMultiValue(adapter.getBundle(),cmd,dc.get_usr_SystemPrinterName(),KEY_systemPrinterName);
																setValue(cmd,dc.get_CupsOptions(),KEY_cupsOptions);
																									setCheckboxValue(cmd,dc.get_DefaultDevMode(),KEY_defaultDevMode);
																			setValue(cmd,dc.get_MaxPrintjobs(),KEY_maxPrintjobs);
																						setValue(cmd,dc.get_MaxReportedPrintjobs(),KEY_maxReportedPrintjobs);
																						setValue(cmd,dc.get_PrintCommand(),KEY_printCommand);
																									setCheckboxValue(cmd,dc.get_UseClientDriver(),KEY_useClientDriver);
												
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