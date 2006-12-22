/** 
  * ListSambaPrinterGlobals.java
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
  * @template: ./tools-dcg/templates/cmd/listCommand.vm
  *
  * Contributors: 
  * 
  * Description: Class for listing objects
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
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.tools.cli.*;

public class ListSambaPrinterGlobals extends CimCommand {

			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition("hostname",null,"ListSambaPrinterGlobals.hostname.argValue",true,true,"ListSambaPrinterGlobals.hostname.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition("port","5988","ListSambaPrinterGlobals.port.argValue",false,true,"ListSambaPrinterGlobals.port.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition("namespace","/root/cimv2","ListSambaPrinterGlobals.namespace.argValue",false,true,"ListSambaPrinterGlobals.namespace.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition("user",null,"ListSambaPrinterGlobals.user.argValue",true,true,"ListSambaPrinterGlobals.user.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition("password",null,"ListSambaPrinterGlobals.password.argValue",true,true,"ListSambaPrinterGlobals.password.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition("publickeyfile","none","ListSambaPrinterGlobals.publickeyfile.argValue",false,true,"ListSambaPrinterGlobals.publickeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition("privatekeyfile","none","ListSambaPrinterGlobals.privatekeyfile.argValue",false,true,"ListSambaPrinterGlobals.privatekeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition("serviceName",null,"ListSambaPrinterGlobals.serviceName.argValue",true,true,"ListSambaPrinterGlobals.serviceName.argDescription");
	
	/**
	 * 
	 */
	public static final OptionDefinition KEY_list = new OptionDefinition("list", "INSTANCE_WITH_CHILDS",BaseDataContainer.LIST_OPTION_KEY + "|" + BaseDataContainer.LIST_OPTION_INSTANCE + "|" + BaseDataContainer.LIST_OPTION_INSTANCE_WITH_CHILDS,false,true,"listoption");
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
    			KEY_list,
		KEY_locale,
	};

		
 
 CommandLine cmd = null;
	AbstractBaseCimAdapter adapter = null;

	
	public ListSambaPrinterGlobals(java.util.Locale locale)
	{
		super("ListSambaPrinterGlobals", new String[]{"messages","messagesSamba"},locale);
	}

	public void execute(String[] args) throws WbemSmtException {
		
    	
	    Options options = createOptions(OPTIONS, bundle);

		if (args.length == 1 && (args[0].equalsIgnoreCase("--help") || args[0].equalsIgnoreCase("-h") ))
		{
			showUsage(options);
			return;
		}

		//do the real processing
		System.out.println("\n" + bundle.getString("listing", new Object[]{bundle.getString("PrintingGlobalsDataContainer.caption")}));
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
			CliDataLoader loader = new ListSambaPrinterGlobalsLoader();
			loader.load(bundle,adapter, cmd);
			
			org.sblim.wbemsmt.cli.samba.container.global.PrintingGlobalsDataContainerImpl dc = new org.sblim.wbemsmt.cli.samba.container.global.PrintingGlobalsDataContainerImpl(adapter);
			
			
			
        	    					int 
						count = adapter.count(org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals.class);
			dc.getUsers().clear();
			for (int i=0; i < count; i++) {
				org.sblim.wbemsmt.cli.samba.container.global.AdminUsersInPrinterGlobalsImpl child = new org.sblim.wbemsmt.cli.samba.container.global.AdminUsersInPrinterGlobalsImpl(adapter);
				dc.getUsers().add(child);
			}
        				
			setKeyValues(cmd,adapter,dc);
			adapter.updateControls(dc);
			
			String listOption = getOptionValue(cmd,KEY_list);

			if (BaseDataContainer.listOptionIsValid(listOption))
			{
									dc.trace(System.out,listOption);
							}
			else
			{
				System.err.println(bundle.getString("listingOptionNotValid"));
    			showUsage(options);
    			return;
			}

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
		
}