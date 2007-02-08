/** 
  * EditSambaPrinterAclOfUser.java
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

public class EditSambaPrinterAclOfUser extends CimCommand {

			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition("hostname",null,"EditSambaPrinterAclOfUser.hostname.argValue",true,false,"EditSambaPrinterAclOfUser.hostname.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition("port","5988","EditSambaPrinterAclOfUser.port.argValue",false,false,"EditSambaPrinterAclOfUser.port.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition("namespace","/root/cimv2","EditSambaPrinterAclOfUser.namespace.argValue",false,false,"EditSambaPrinterAclOfUser.namespace.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition("user",null,"EditSambaPrinterAclOfUser.user.argValue",true,false,"EditSambaPrinterAclOfUser.user.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition("password",null,"EditSambaPrinterAclOfUser.password.argValue",true,false,"EditSambaPrinterAclOfUser.password.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition("publickeyfile","none","EditSambaPrinterAclOfUser.publickeyfile.argValue",false,false,"EditSambaPrinterAclOfUser.publickeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition("privatekeyfile","none","EditSambaPrinterAclOfUser.privatekeyfile.argValue",false,false,"EditSambaPrinterAclOfUser.privatekeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition("serviceName",null,"EditSambaPrinterAclOfUser.serviceName.argValue",true,false,"EditSambaPrinterAclOfUser.serviceName.argDescription");
			/**
		 * username to change acl of
		 */
		public static final OptionDefinition KEY_sambaUsername = new OptionDefinition("sambaUsername",null,"EditSambaPrinterAclOfUser.sambaUsername.argValue",true,false,"EditSambaPrinterAclOfUser.sambaUsername.argDescription");
	
			/**
		 * 
		 */
		public static final OptionDefinition KEY_sambaPrintername = new OptionDefinition("sambaPrintername",null,"PrinterACLItemDataContainer.PrinterName.argValue",true,true,"PrinterACLItemDataContainer.PrinterName.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_access = new OptionDefinition("access",null,"PrinterACLItemDataContainer.accessTypeVI.argValue",false,false,"PrinterACLItemDataContainer.accessTypeVI.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_accessTypeRW = new OptionDefinition("accessTypeRW",null,"PrinterACLItemDataContainer.accessTypeRW.argValue",false,false,"PrinterACLItemDataContainer.accessTypeRW.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_admin = new OptionDefinition("admin",null,"PrinterACLItemDataContainer.admin.argValue",false,false,"PrinterACLItemDataContainer.admin.argDescription");
		
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
    	    	KEY_sambaUsername,
    	    	    	KEY_sambaPrintername,
    	    	KEY_access,
    	    	KEY_accessTypeRW,
    	    	KEY_admin,
    			KEY_locale,
	};

		
 
 CommandLine cmd = null;
	AbstractBaseCimAdapter adapter = null;

	
	public EditSambaPrinterAclOfUser(java.util.Locale locale)
	{
		super("EditSambaPrinterAclOfUser", new String[]{"messages","messagesSamba"},locale);
	}
	
	public void execute(String[] args) throws WbemSmtException {
		
	    Options options = createOptions(OPTIONS, bundle);

		if (args.length == 1 && (args[0].equalsIgnoreCase("--help") || args[0].equalsIgnoreCase("-h") ))
		{
			showUsage(options);
			return;
		}
		
		//do the real processing
		System.out.println("\n" + bundle.getString("editing",new Object[]{bundle.getString("PrinterACLItemDataContainer.caption")}));
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
			
			CliDataLoader loader = new EditSambaPrinterAclOfUserLoader();
			loader.load(bundle,adapter, cmd);
			
			org.sblim.wbemsmt.cli.samba.container.share.PrinterACLItemDataContainerImpl dc = new org.sblim.wbemsmt.cli.samba.container.share.PrinterACLItemDataContainerImpl(adapter);
						
        				
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
			System.out.println("\n" + bundle.getString("edited", new Object[]{bundle.getString("PrinterACLItemDataContainer.caption")}));

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
	private void setKeyValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer dc) throws WbemSmtException {
    	    		    			    				setValue(cmd,dc.get_PrinterName(),KEY_sambaPrintername);
    			    			    			    				    				    				    					}	
	
	/**
	 * Set all Values that are not read-Only
	 **/
	private void setValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer dc) throws WbemSmtException {
    																				setMultiValue(adapter.getBundle(),cmd,dc.get_usr_AccessTypeVI(),KEY_access);
																						setMultiValue(adapter.getBundle(),cmd,dc.get_usr_AccessTypeRW(),KEY_accessTypeRW);
																			setCheckboxValue(cmd,dc.get_usr_Admin(),KEY_admin);
												
		//The Buttons
    																																	}	
}