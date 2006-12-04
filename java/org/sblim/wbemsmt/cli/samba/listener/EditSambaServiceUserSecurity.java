/** 
  * EditSambaServiceUserSecurity.java
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

public class EditSambaServiceUserSecurity extends CimCommand {

			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition("hostname",null,"EditSambaServiceUserSecurity.hostname.argValue",true,false,"EditSambaServiceUserSecurity.hostname.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition("port","5988","EditSambaServiceUserSecurity.port.argValue",false,false,"EditSambaServiceUserSecurity.port.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition("namespace","/root/cimv2","EditSambaServiceUserSecurity.namespace.argValue",false,false,"EditSambaServiceUserSecurity.namespace.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition("user",null,"EditSambaServiceUserSecurity.user.argValue",true,false,"EditSambaServiceUserSecurity.user.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition("password",null,"EditSambaServiceUserSecurity.password.argValue",true,false,"EditSambaServiceUserSecurity.password.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition("publickeyfile","none","EditSambaServiceUserSecurity.publickeyfile.argValue",false,false,"EditSambaServiceUserSecurity.publickeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition("privatekeyfile","none","EditSambaServiceUserSecurity.privatekeyfile.argValue",false,false,"EditSambaServiceUserSecurity.privatekeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition("serviceName",null,"EditSambaServiceUserSecurity.serviceName.argValue",true,false,"EditSambaServiceUserSecurity.serviceName.argDescription");
	
			/**
		 * 
		 */
		public static final OptionDefinition KEY_newForceUser = new OptionDefinition("newForceUser",null,"ServiceUserSecurityOptionsDataContainer.newForceUser.argValue",false,false,"ServiceUserSecurityOptionsDataContainer.newForceUser.argDescription");
		
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
    	    	    	KEY_newForceUser,
    			KEY_locale,
	};

		
 
 CommandLine cmd = null;
	AbstractBaseCimAdapter adapter = null;

	
	public EditSambaServiceUserSecurity(java.util.Locale locale)
	{
		super("EditSambaServiceUserSecurity", new String[]{"messages","messagesSamba"},locale);
	}
	
	public void execute(String[] args) throws WbemSmtException {
		
	    Options options = createOptions(OPTIONS, bundle);

		if (args.length == 1 && (args[0].equalsIgnoreCase("--help") || args[0].equalsIgnoreCase("-h") ))
		{
			showUsage(options);
			return;
		}
		
		//do the real processing
		System.out.println("\n" + bundle.getString("editing",new Object[]{bundle.getString("ServiceUserSecurityOptionsDataContainer.caption")}));
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
			
			CliDataLoader loader = new EditSambaServiceUserSecurityLoader();
			loader.load(bundle,adapter, cmd);
			
			org.sblim.wbemsmt.cli.samba.container.service.ServiceUserSecurityOptionsDataContainerImpl dc = new org.sblim.wbemsmt.cli.samba.container.service.ServiceUserSecurityOptionsDataContainerImpl(adapter);
						int count = 0;
						
        	    		
			count = adapter.count(org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForService.class);
			dc.getUserRights().clear();
			for (int i=0; i < count; i++) {
				org.sblim.wbemsmt.cli.samba.container.service.UserACLItemDataContainerForServiceImpl child = new org.sblim.wbemsmt.cli.samba.container.service.UserACLItemDataContainerForServiceImpl(adapter);
				dc.getUserRights().add(child);
			}
        				
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
			System.out.println("\n" + bundle.getString("edited", new Object[]{bundle.getString("ServiceUserSecurityOptionsDataContainer.caption")}));

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
	private void setKeyValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.service.ServiceUserSecurityOptionsDataContainer dc) throws WbemSmtException {
    	    					}	
	
	/**
	 * Set all Values that are not read-Only
	 **/
	private void setValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.service.ServiceUserSecurityOptionsDataContainer dc) throws WbemSmtException {
    																setMultiValue(adapter.getBundle(),cmd,dc.get_usr_NewForceUser(),KEY_newForceUser);
									
		//The Buttons
    											}	
}