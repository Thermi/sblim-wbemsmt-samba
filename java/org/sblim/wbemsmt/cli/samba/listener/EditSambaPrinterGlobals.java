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
  * @template: ./tools-dcg/templates/cmd/editCommand.vm
  *
  * Contributors: 
  * 
  * Description: Class for editing objects
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.listener;

import org.apache.commons.cli.*;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimAdapterFactory;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.cli.*;

public class EditSambaPrinterGlobals extends CimCommand {

			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition("hostname",null,"EditSambaPrinterGlobals.hostname.argValue",true,false,"EditSambaPrinterGlobals.hostname.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition("port","5988","EditSambaPrinterGlobals.port.argValue",false,false,"EditSambaPrinterGlobals.port.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition("namespace","/root/cimv2","EditSambaPrinterGlobals.namespace.argValue",false,false,"EditSambaPrinterGlobals.namespace.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition("user",null,"EditSambaPrinterGlobals.user.argValue",true,false,"EditSambaPrinterGlobals.user.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition("password",null,"EditSambaPrinterGlobals.password.argValue",true,false,"EditSambaPrinterGlobals.password.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition("publickeyfile","none","EditSambaPrinterGlobals.publickeyfile.argValue",false,false,"EditSambaPrinterGlobals.publickeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition("privatekeyfile","none","EditSambaPrinterGlobals.privatekeyfile.argValue",false,false,"EditSambaPrinterGlobals.privatekeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition("serviceName",null,"EditSambaPrinterGlobals.serviceName.argValue",true,false,"EditSambaPrinterGlobals.serviceName.argDescription");
	
			/**
		 * 
		 */
		public static final OptionDefinition KEY_printcapCacheTime = new OptionDefinition("printcapCacheTime",null,"PrintingGlobalsDataContainer.PrintcapCacheTime.argValue",false,false,"PrintingGlobalsDataContainer.PrintcapCacheTime.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_systemPrinterName = new OptionDefinition("systemPrinterName",null,"PrintingGlobalsDataContainer.SystemPrinterName.argValue",false,false,"PrintingGlobalsDataContainer.SystemPrinterName.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_cupsOptions = new OptionDefinition("cupsOptions",null,"PrintingGlobalsDataContainer.CupsOptions.argValue",false,false,"PrintingGlobalsDataContainer.CupsOptions.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_defaultDevMode = new OptionDefinition("defaultDevMode",null,"PrintingGlobalsDataContainer.DefaultDevMode.argValue",false,false,"PrintingGlobalsDataContainer.DefaultDevMode.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_maxPrintjobs = new OptionDefinition("maxPrintjobs",null,"PrintingGlobalsDataContainer.MaxPrintjobs.argValue",false,false,"PrintingGlobalsDataContainer.MaxPrintjobs.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_maxReportedPrintjobs = new OptionDefinition("maxReportedPrintjobs",null,"PrintingGlobalsDataContainer.MaxReportedPrintjobs.argValue",false,false,"PrintingGlobalsDataContainer.MaxReportedPrintjobs.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_printCommand = new OptionDefinition("printCommand",null,"PrintingGlobalsDataContainer.PrintCommand.argValue",false,false,"PrintingGlobalsDataContainer.PrintCommand.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_useClientDriver = new OptionDefinition("useClientDriver",null,"PrintingGlobalsDataContainer.UseClientDriver.argValue",false,false,"PrintingGlobalsDataContainer.UseClientDriver.argDescription");
		
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
    	    	    	KEY_printcapCacheTime,
    	    	KEY_systemPrinterName,
    	    	KEY_cupsOptions,
    	    	KEY_defaultDevMode,
    	    	KEY_maxPrintjobs,
    	    	KEY_maxReportedPrintjobs,
    	    	KEY_printCommand,
    	    	KEY_useClientDriver,
    			KEY_locale,
	};

		
 
 CommandLine cmd = null;
	AbstractBaseCimAdapter adapter = null;

	
	public EditSambaPrinterGlobals(java.util.Locale locale)
	{
		super("EditSambaPrinterGlobals", new String[]{"messages","messagesSamba"},locale);
	}
	
	public void execute(String[] args) throws WbemSmtException {
		
	    Options options = createOptions(OPTIONS, bundle);

		if (args.length == 1 && (args[0].equalsIgnoreCase("--help") || args[0].equalsIgnoreCase("-h") ))
		{
			showUsage(options);
			return;
		}
		
		//do the real processing
		System.out.println("\n" + bundle.getString("editing",new Object[]{bundle.getString("PrintingGlobalsDataContainer.caption")}));
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
			
			CliDataLoader loader = new EditSambaPrinterGlobalsLoader();
			loader.load(bundle,adapter, cmd);
			
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
			
			System.out.println("\n" + bundle.getString("before.edit"));
			dc.trace(System.out);

			setValues(cmd,adapter,dc);
			
			MessageList result = MessageList.init(dc);

			if (result.hasErrors())
			{
				traceErrors("save.error",result);
				return;
			}
			else
			{
				traceMessages("additional.messages",result);
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
					traceErrors("save.error",result);
				}
				else if (result.hasWarning())
				{
					traceErrors("save.warning",result);
				}
				else if (result.hasInfo())
				{
					traceErrors("save.info",result);
				}
			}
			else
			{
					traceErrors("validation.error",result);
					return;
			}
			System.out.println("\n" + bundle.getString("edited", new Object[]{bundle.getString("PrintingGlobalsDataContainer.caption")}));

			adapter.updateControls(dc);

			System.out.println("\n" + bundle.getString("after.edit"));
			dc.trace(System.out);
		
		}
		catch (Exception e)
		{
			super.handleException(e,args,options,KEY_GLOBAL_password);
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
}