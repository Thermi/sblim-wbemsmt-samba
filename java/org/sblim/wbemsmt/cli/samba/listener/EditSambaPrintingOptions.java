/** 
  * EditSambaPrintingOptions.java
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

public class EditSambaPrintingOptions extends CimCommand {

			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition("hostname",null,"EditSambaPrintingOptions.hostname.argValue",true,false,"EditSambaPrintingOptions.hostname.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition("port","5988","EditSambaPrintingOptions.port.argValue",false,false,"EditSambaPrintingOptions.port.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition("namespace","/root/cimv2","EditSambaPrintingOptions.namespace.argValue",false,false,"EditSambaPrintingOptions.namespace.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition("user",null,"EditSambaPrintingOptions.user.argValue",true,false,"EditSambaPrintingOptions.user.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition("password",null,"EditSambaPrintingOptions.password.argValue",true,false,"EditSambaPrintingOptions.password.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition("publickeyfile","none","EditSambaPrintingOptions.publickeyfile.argValue",false,false,"EditSambaPrintingOptions.publickeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition("privatekeyfile","none","EditSambaPrintingOptions.privatekeyfile.argValue",false,false,"EditSambaPrintingOptions.privatekeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition("serviceName",null,"EditSambaPrintingOptions.serviceName.argValue",true,false,"EditSambaPrintingOptions.serviceName.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_sambaPrintername = new OptionDefinition("sambaPrintername",null,"EditSambaPrintingOptions.sambaPrintername.argValue",true,false,"EditSambaPrintingOptions.sambaPrintername.argDescription");
	
			/**
		 * 
		 */
		public static final OptionDefinition KEY_cupsOptions = new OptionDefinition("cupsOptions",null,"PrintingOptionsDataContainer.CupsOptions.argValue",false,false,"PrintingOptionsDataContainer.CupsOptions.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_defaultDevMode = new OptionDefinition("defaultDevMode",null,"PrintingOptionsDataContainer.DefaultDevMode.argValue",false,false,"PrintingOptionsDataContainer.DefaultDevMode.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_maxPrintjobs = new OptionDefinition("maxPrintjobs",null,"PrintingOptionsDataContainer.MaxPrintjobs.argValue",false,false,"PrintingOptionsDataContainer.MaxPrintjobs.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_maxReportedPrintjobs = new OptionDefinition("maxReportedPrintjobs",null,"PrintingOptionsDataContainer.MaxReportedPrintjobs.argValue",false,false,"PrintingOptionsDataContainer.MaxReportedPrintjobs.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_printCommand = new OptionDefinition("printCommand",null,"PrintingOptionsDataContainer.PrintCommand.argValue",false,false,"PrintingOptionsDataContainer.PrintCommand.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_useClientDriver = new OptionDefinition("useClientDriver",null,"PrintingOptionsDataContainer.UseClientDriver.argValue",false,false,"PrintingOptionsDataContainer.UseClientDriver.argDescription");
		
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
    	    	KEY_sambaPrintername,
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

	
	public EditSambaPrintingOptions(java.util.Locale locale)
	{
		super("EditSambaPrintingOptions", new String[]{"messages","messagesSamba"},locale);
	}
	
	public void execute(String[] args) throws WbemSmtException {
		
	    Options options = createOptions(OPTIONS, bundle);

		if (args.length == 1 && (args[0].equalsIgnoreCase("--help") || args[0].equalsIgnoreCase("-h") ))
		{
			showUsage(options);
			return;
		}
		
		//do the real processing
		System.out.println("\n" + bundle.getString("editing",new Object[]{bundle.getString("PrintingOptionsDataContainer.caption")}));
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
			
			CliDataLoader loader = new EditSambaPrintingOptionsLoader();
			loader.load(bundle,adapter, cmd);
			
			org.sblim.wbemsmt.cli.samba.container.printer.PrintingOptionsDataContainerImpl dc = new org.sblim.wbemsmt.cli.samba.container.printer.PrintingOptionsDataContainerImpl(adapter);
						
        				
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
			System.out.println("\n" + bundle.getString("edited", new Object[]{bundle.getString("PrintingOptionsDataContainer.caption")}));

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
	private void setKeyValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.printer.PrintingOptionsDataContainer dc) throws WbemSmtException {
    	    				    				    				    				    				    					}	
	
	/**
	 * Set all Values that are not read-Only
	 **/
	private void setValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.printer.PrintingOptionsDataContainer dc) throws WbemSmtException {
    										setValue(cmd,dc.get_CupsOptions(),KEY_cupsOptions);
																									setCheckboxValue(cmd,dc.get_DefaultDevMode(),KEY_defaultDevMode);
																			setValue(cmd,dc.get_MaxPrintjobs(),KEY_maxPrintjobs);
																						setValue(cmd,dc.get_MaxReportedPrintjobs(),KEY_maxReportedPrintjobs);
																						setValue(cmd,dc.get_PrintCommand(),KEY_printCommand);
																									setCheckboxValue(cmd,dc.get_UseClientDriver(),KEY_useClientDriver);
												
		//The Buttons
    																																																								}	
}