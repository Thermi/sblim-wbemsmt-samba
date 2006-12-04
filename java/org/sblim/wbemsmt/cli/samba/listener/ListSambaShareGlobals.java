/** 
  * ListSambaShareGlobals.java
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

public class ListSambaShareGlobals extends CimCommand {

			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition("hostname",null,"ListSambaShareGlobals.hostname.argValue",true,true,"ListSambaShareGlobals.hostname.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition("port","5988","ListSambaShareGlobals.port.argValue",false,true,"ListSambaShareGlobals.port.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition("namespace","/root/cimv2","ListSambaShareGlobals.namespace.argValue",false,true,"ListSambaShareGlobals.namespace.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition("user",null,"ListSambaShareGlobals.user.argValue",true,true,"ListSambaShareGlobals.user.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition("password",null,"ListSambaShareGlobals.password.argValue",true,true,"ListSambaShareGlobals.password.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition("publickeyfile","none","ListSambaShareGlobals.publickeyfile.argValue",false,true,"ListSambaShareGlobals.publickeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition("privatekeyfile","none","ListSambaShareGlobals.privatekeyfile.argValue",false,true,"ListSambaShareGlobals.privatekeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition("serviceName",null,"ListSambaShareGlobals.serviceName.argValue",true,true,"ListSambaShareGlobals.serviceName.argDescription");
	
	/**
	 * 
	 */
	public static final OptionDefinition KEY_list = new OptionDefinition("list", "INSTANCE",BaseDataContainer.LIST_OPTION_KEY + "|" + BaseDataContainer.LIST_OPTION_INSTANCE + "|" + BaseDataContainer.LIST_OPTION_INSTANCE_WITH_CHILDS,false,true,"listoption");
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

	
	public ListSambaShareGlobals(java.util.Locale locale)
	{
		super("ListSambaShareGlobals", new String[]{"messages","messagesSamba"},locale);
	}

	public void execute(String[] args) throws WbemSmtException {
		
    	
	    Options options = createOptions(OPTIONS, bundle);

		if (args.length == 1 && (args[0].equalsIgnoreCase("--help") || args[0].equalsIgnoreCase("-h") ))
		{
			showUsage(options);
			return;
		}

		//do the real processing
		System.out.println("\n" + bundle.getString("listing", new Object[]{bundle.getString("CMDShareGlobalsDataContainer.caption")}));
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
			CliDataLoader loader = new ListSambaShareGlobalsLoader();
			loader.load(bundle,adapter, cmd);
			
			org.sblim.wbemsmt.cli.samba.container.global.CMDShareGlobalsDataContainerImpl dc = new org.sblim.wbemsmt.cli.samba.container.global.CMDShareGlobalsDataContainerImpl(adapter);
			
			
			
        				
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
	private void setKeyValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.global.CMDShareGlobalsDataContainer dc) throws WbemSmtException {
    	    				    				    				    				    				    				    				    				    					}	
		
}