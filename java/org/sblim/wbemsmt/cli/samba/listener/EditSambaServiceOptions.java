/** 
  * EditSambaServiceOptions.java
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

public class EditSambaServiceOptions extends CimCommand {

			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition("hostname",null,"EditSambaServiceOptions.hostname.argValue",true,false,"EditSambaServiceOptions.hostname.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition("port","5988","EditSambaServiceOptions.port.argValue",false,false,"EditSambaServiceOptions.port.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition("namespace","/root/cimv2","EditSambaServiceOptions.namespace.argValue",false,false,"EditSambaServiceOptions.namespace.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition("user",null,"EditSambaServiceOptions.user.argValue",true,false,"EditSambaServiceOptions.user.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition("password",null,"EditSambaServiceOptions.password.argValue",true,false,"EditSambaServiceOptions.password.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition("publickeyfile","none","EditSambaServiceOptions.publickeyfile.argValue",false,false,"EditSambaServiceOptions.publickeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition("privatekeyfile","none","EditSambaServiceOptions.privatekeyfile.argValue",false,false,"EditSambaServiceOptions.privatekeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition("serviceName",null,"EditSambaServiceOptions.serviceName.argValue",true,false,"EditSambaServiceOptions.serviceName.argDescription");
	
			/**
		 * 
		 */
		public static final OptionDefinition KEY_bindInterfaces = new OptionDefinition("bindInterfaces",null,"ServiceOptionsDataContainer.BindInterfacesOnly.argValue",false,false,"ServiceOptionsDataContainer.BindInterfacesOnly.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_interfaces = new OptionDefinition("interfaces",null,"ServiceOptionsDataContainer.Interfaces.argValue",false,false,"ServiceOptionsDataContainer.Interfaces.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_netbiosAlias = new OptionDefinition("netbiosAlias",null,"ServiceOptionsDataContainer.NetbiosAlias.argValue",false,false,"ServiceOptionsDataContainer.NetbiosAlias.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_netbiosName = new OptionDefinition("netbiosName",null,"ServiceOptionsDataContainer.NetbiosName.argValue",false,false,"ServiceOptionsDataContainer.NetbiosName.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_serverString = new OptionDefinition("serverString",null,"ServiceOptionsDataContainer.ServerString.argValue",false,false,"ServiceOptionsDataContainer.ServerString.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_workgroup = new OptionDefinition("workgroup",null,"ServiceOptionsDataContainer.Workgroup.argValue",false,false,"ServiceOptionsDataContainer.Workgroup.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_configurationFile = new OptionDefinition("configurationFile",null,"ServiceOptionsDataContainer.ConfigurationFile.argValue",false,false,"ServiceOptionsDataContainer.ConfigurationFile.argDescription");
		
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
    	    	    	KEY_bindInterfaces,
    	    	KEY_interfaces,
    	    	KEY_netbiosAlias,
    	    	KEY_netbiosName,
    	    	KEY_serverString,
    	    	KEY_workgroup,
    	    	KEY_configurationFile,
    			KEY_locale,
	};

		
 
 CommandLine cmd = null;
	AbstractBaseCimAdapter adapter = null;

	
	public EditSambaServiceOptions(java.util.Locale locale)
	{
		super("EditSambaServiceOptions", new String[]{"messages","messagesSamba"},locale);
	}
	
	public void execute(String[] args) throws WbemSmtException {
		
	    Options options = createOptions(OPTIONS, bundle);

		if (args.length == 1 && (args[0].equalsIgnoreCase("--help") || args[0].equalsIgnoreCase("-h") ))
		{
			showUsage(options);
			return;
		}
		
		//do the real processing
		System.out.println("\n" + bundle.getString("editing",new Object[]{bundle.getString("ServiceOptionsDataContainer.caption")}));
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
			
			CliDataLoader loader = new EditSambaServiceOptionsLoader();
			loader.load(bundle,adapter, cmd);
			
			org.sblim.wbemsmt.cli.samba.container.service.ServiceOptionsDataContainerImpl dc = new org.sblim.wbemsmt.cli.samba.container.service.ServiceOptionsDataContainerImpl(adapter);
						
        				
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
			System.out.println("\n" + bundle.getString("edited", new Object[]{bundle.getString("ServiceOptionsDataContainer.caption")}));

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
	private void setKeyValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.service.ServiceOptionsDataContainer dc) throws WbemSmtException {
    	    				    				    				    				    				    				    					}	
	
	/**
	 * Set all Values that are not read-Only
	 **/
	private void setValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.service.ServiceOptionsDataContainer dc) throws WbemSmtException {
    													setCheckboxValue(cmd,dc.get_BindInterfacesOnly(),KEY_bindInterfaces);
																			setValue(cmd,dc.get_Interfaces(),KEY_interfaces);
																						setValue(cmd,dc.get_NetbiosAlias(),KEY_netbiosAlias);
																						setValue(cmd,dc.get_NetbiosName(),KEY_netbiosName);
																						setValue(cmd,dc.get_ServerString(),KEY_serverString);
																						setValue(cmd,dc.get_Workgroup(),KEY_workgroup);
																						setValue(cmd,dc.get_ConfigurationFile(),KEY_configurationFile);
															
		//The Buttons
    																																																																	}	
}