/** 
  * EditSambaShare.java
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

public class EditSambaShare extends CimCommand {

			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition("hostname",null,"EditSambaShare.hostname.argValue",true,false,"EditSambaShare.hostname.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition("port","5988","EditSambaShare.port.argValue",false,false,"EditSambaShare.port.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition("namespace","/root/cimv2","EditSambaShare.namespace.argValue",false,false,"EditSambaShare.namespace.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition("user",null,"EditSambaShare.user.argValue",true,false,"EditSambaShare.user.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition("password",null,"EditSambaShare.password.argValue",true,false,"EditSambaShare.password.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition("publickeyfile","none","EditSambaShare.publickeyfile.argValue",false,false,"EditSambaShare.publickeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition("privatekeyfile","none","EditSambaShare.privatekeyfile.argValue",false,false,"EditSambaShare.privatekeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition("serviceName",null,"EditSambaShare.serviceName.argValue",true,false,"EditSambaShare.serviceName.argDescription");
	
			/**
		 * 
		 */
		public static final OptionDefinition KEY_sharename = new OptionDefinition("sharename",null,"ShareOptionsDataContainer.Name.argValue",true,true,"ShareOptionsDataContainer.Name.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_available = new OptionDefinition("available",null,"ShareOptionsDataContainer.Available.argValue",false,false,"ShareOptionsDataContainer.Available.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_comment = new OptionDefinition("comment",null,"ShareOptionsDataContainer.Comment.argValue",false,false,"ShareOptionsDataContainer.Comment.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_path = new OptionDefinition("path",null,"ShareOptionsDataContainer.Path.argValue",false,false,"ShareOptionsDataContainer.Path.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_browsable = new OptionDefinition("browsable",null,"ShareOptionsDataContainer.Browsable.argValue",false,false,"ShareOptionsDataContainer.Browsable.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_guestok = new OptionDefinition("guestok",null,"ShareOptionsDataContainer.GuestOK.argValue",false,false,"ShareOptionsDataContainer.GuestOK.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_guestOnly = new OptionDefinition("guestOnly",null,"ShareOptionsDataContainer.GuestOnly.argValue",false,false,"ShareOptionsDataContainer.GuestOnly.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_hostsAllow = new OptionDefinition("hostsAllow",null,"ShareOptionsDataContainer.HostsAllow.argValue",false,false,"ShareOptionsDataContainer.HostsAllow.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_hostsDeny = new OptionDefinition("hostsDeny",null,"ShareOptionsDataContainer.HostsDeny.argValue",false,false,"ShareOptionsDataContainer.HostsDeny.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_readOnly = new OptionDefinition("readOnly",null,"ShareOptionsDataContainer.ReadOnly.argValue",false,false,"ShareOptionsDataContainer.ReadOnly.argDescription");
		
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
    	    	    	KEY_sharename,
    	    	KEY_available,
    	    	KEY_comment,
    	    	KEY_path,
    	    	KEY_browsable,
    	    	KEY_guestok,
    	    	KEY_guestOnly,
    	    	KEY_hostsAllow,
    	    	KEY_hostsDeny,
    	    	KEY_readOnly,
    			KEY_locale,
	};

		
 
 CommandLine cmd = null;
	AbstractBaseCimAdapter adapter = null;

	
	public EditSambaShare(java.util.Locale locale)
	{
		super("EditSambaShare", new String[]{"messages","messagesSamba"},locale);
	}
	
	public void execute(String[] args) throws WbemSmtException {
		
	    Options options = createOptions(OPTIONS, bundle);

		if (args.length == 1 && (args[0].equalsIgnoreCase("--help") || args[0].equalsIgnoreCase("-h") ))
		{
			showUsage(options);
			return;
		}
		
		//do the real processing
		System.out.println("\n" + bundle.getString("editing",new Object[]{bundle.getString("ShareOptionsDataContainer.caption")}));
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
			
			CliDataLoader loader = new EditSambaShareLoader();
			loader.load(bundle,adapter, cmd);
			
			org.sblim.wbemsmt.cli.samba.container.share.ShareOptionsDataContainerImpl dc = new org.sblim.wbemsmt.cli.samba.container.share.ShareOptionsDataContainerImpl(adapter);
						
        				
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
			System.out.println("\n" + bundle.getString("edited", new Object[]{bundle.getString("ShareOptionsDataContainer.caption")}));

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
	private void setKeyValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.share.ShareOptionsDataContainer dc) throws WbemSmtException {
    	    		    			    				setValue(cmd,dc.get_Name(),KEY_sharename);
    			    			    			    				    				    				    				    				    				    				    				    				    					}	
	
	/**
	 * Set all Values that are not read-Only
	 **/
	private void setValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.share.ShareOptionsDataContainer dc) throws WbemSmtException {
    																	setCheckboxValue(cmd,dc.get_Available(),KEY_available);
																			setValue(cmd,dc.get_Comment(),KEY_comment);
																						setValue(cmd,dc.get_Path(),KEY_path);
																									setCheckboxValue(cmd,dc.get_Browsable(),KEY_browsable);
																						setCheckboxValue(cmd,dc.get_GuestOK(),KEY_guestok);
																						setCheckboxValue(cmd,dc.get_GuestOnly(),KEY_guestOnly);
																			setValue(cmd,dc.get_HostsAllow(),KEY_hostsAllow);
																						setValue(cmd,dc.get_HostsDeny(),KEY_hostsDeny);
																									setCheckboxValue(cmd,dc.get_ReadOnly(),KEY_readOnly);
												
		//The Buttons
    																																																																																							}	
}