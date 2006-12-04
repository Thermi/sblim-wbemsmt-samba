/** 
  * EditSambaPrinter.java
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

public class EditSambaPrinter extends CimCommand {

			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition("hostname",null,"EditSambaPrinter.hostname.argValue",true,false,"EditSambaPrinter.hostname.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition("port","5988","EditSambaPrinter.port.argValue",false,false,"EditSambaPrinter.port.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition("namespace","/root/cimv2","EditSambaPrinter.namespace.argValue",false,false,"EditSambaPrinter.namespace.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition("user",null,"EditSambaPrinter.user.argValue",true,false,"EditSambaPrinter.user.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition("password",null,"EditSambaPrinter.password.argValue",true,false,"EditSambaPrinter.password.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition("publickeyfile","none","EditSambaPrinter.publickeyfile.argValue",false,false,"EditSambaPrinter.publickeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition("privatekeyfile","none","EditSambaPrinter.privatekeyfile.argValue",false,false,"EditSambaPrinter.privatekeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition("serviceName",null,"EditSambaPrinter.serviceName.argValue",true,false,"EditSambaPrinter.serviceName.argDescription");
	
			/**
		 * 
		 */
		public static final OptionDefinition KEY_sambaPrintername = new OptionDefinition("sambaPrintername",null,"PrinterOptionsDataContainer.Name.argValue",true,true,"PrinterOptionsDataContainer.Name.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_systemPrinterName = new OptionDefinition("systemPrinterName",null,"PrinterOptionsDataContainer.SystemPrinterName.argValue",false,false,"PrinterOptionsDataContainer.SystemPrinterName.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_path = new OptionDefinition("path",null,"PrinterOptionsDataContainer.Path.argValue",false,false,"PrinterOptionsDataContainer.Path.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_comment = new OptionDefinition("comment",null,"PrinterOptionsDataContainer.Comment.argValue",false,false,"PrinterOptionsDataContainer.Comment.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_available = new OptionDefinition("available",null,"PrinterOptionsDataContainer.Available.argValue",false,false,"PrinterOptionsDataContainer.Available.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_guestOK = new OptionDefinition("guestOK",null,"PrinterOptionsDataContainer.GuestOK.argValue",false,false,"PrinterOptionsDataContainer.GuestOK.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_guestOnly = new OptionDefinition("guestOnly",null,"PrinterOptionsDataContainer.GuestOnly.argValue",false,false,"PrinterOptionsDataContainer.GuestOnly.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_hostAllow = new OptionDefinition("hostAllow",null,"PrinterOptionsDataContainer.HostsAllow.argValue",false,false,"PrinterOptionsDataContainer.HostsAllow.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_hostDeny = new OptionDefinition("hostDeny",null,"PrinterOptionsDataContainer.HostsDeny.argValue",false,false,"PrinterOptionsDataContainer.HostsDeny.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_readOnly = new OptionDefinition("readOnly",null,"PrinterOptionsDataContainer.ReadOnly.argValue",false,false,"PrinterOptionsDataContainer.ReadOnly.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_browsable = new OptionDefinition("browsable",null,"PrinterOptionsDataContainer.Browsable.argValue",false,false,"PrinterOptionsDataContainer.Browsable.argDescription");
		
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
    	    	KEY_systemPrinterName,
    	    	KEY_path,
    	    	KEY_comment,
    	    	KEY_available,
    	    	KEY_guestOK,
    	    	KEY_guestOnly,
    	    	KEY_hostAllow,
    	    	KEY_hostDeny,
    	    	KEY_readOnly,
    	    	KEY_browsable,
    			KEY_locale,
	};

		
 
 CommandLine cmd = null;
	AbstractBaseCimAdapter adapter = null;

	
	public EditSambaPrinter(java.util.Locale locale)
	{
		super("EditSambaPrinter", new String[]{"messages","messagesSamba"},locale);
	}
	
	public void execute(String[] args) throws WbemSmtException {
		
	    Options options = createOptions(OPTIONS, bundle);

		if (args.length == 1 && (args[0].equalsIgnoreCase("--help") || args[0].equalsIgnoreCase("-h") ))
		{
			showUsage(options);
			return;
		}
		
		//do the real processing
		System.out.println("\n" + bundle.getString("editing",new Object[]{bundle.getString("PrinterOptionsDataContainer.caption")}));
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
			
			CliDataLoader loader = new EditSambaPrinterLoader();
			loader.load(bundle,adapter, cmd);
			
			org.sblim.wbemsmt.cli.samba.container.printer.PrinterOptionsDataContainerImpl dc = new org.sblim.wbemsmt.cli.samba.container.printer.PrinterOptionsDataContainerImpl(adapter);
						
        				
			setKeyValues(cmd,adapter,dc);

			adapter.updateControls(dc);
			
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
			System.out.println("\n" + bundle.getString("edited", new Object[]{bundle.getString("PrinterOptionsDataContainer.caption")}));

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
	private void setKeyValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.printer.PrinterOptionsDataContainer dc) throws WbemSmtException {
    	    		    			    				setValue(cmd,dc.get_Name(),KEY_sambaPrintername);
    			    			    			    				    				    				    				    				    				    				    				    				    				    					}	
	
	/**
	 * Set all Values that are not read-Only
	 **/
	private void setValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.printer.PrinterOptionsDataContainer dc) throws WbemSmtException {
    																				setMultiValue(adapter.getBundle(),cmd,dc.get_usr_SystemPrinterName(),KEY_systemPrinterName);
																setValue(cmd,dc.get_Path(),KEY_path);
																						setValue(cmd,dc.get_Comment(),KEY_comment);
																									setCheckboxValue(cmd,dc.get_Available(),KEY_available);
																						setCheckboxValue(cmd,dc.get_GuestOK(),KEY_guestOK);
																						setCheckboxValue(cmd,dc.get_GuestOnly(),KEY_guestOnly);
																			setValue(cmd,dc.get_HostsAllow(),KEY_hostAllow);
																						setValue(cmd,dc.get_HostsDeny(),KEY_hostDeny);
																									setCheckboxValue(cmd,dc.get_ReadOnly(),KEY_readOnly);
																						setCheckboxValue(cmd,dc.get_Browsable(),KEY_browsable);
												
		//The Buttons
    																																																																																																}	
}