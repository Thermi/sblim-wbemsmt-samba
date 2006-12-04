/** 
  * EditSambaServiceGlobalSecurity.java
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

public class EditSambaServiceGlobalSecurity extends CimCommand {

			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition("hostname",null,"EditSambaServiceGlobalSecurity.hostname.argValue",true,false,"EditSambaServiceGlobalSecurity.hostname.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition("port","5988","EditSambaServiceGlobalSecurity.port.argValue",false,false,"EditSambaServiceGlobalSecurity.port.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition("namespace","/root/cimv2","EditSambaServiceGlobalSecurity.namespace.argValue",false,false,"EditSambaServiceGlobalSecurity.namespace.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition("user",null,"EditSambaServiceGlobalSecurity.user.argValue",true,false,"EditSambaServiceGlobalSecurity.user.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition("password",null,"EditSambaServiceGlobalSecurity.password.argValue",true,false,"EditSambaServiceGlobalSecurity.password.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition("publickeyfile","none","EditSambaServiceGlobalSecurity.publickeyfile.argValue",false,false,"EditSambaServiceGlobalSecurity.publickeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition("privatekeyfile","none","EditSambaServiceGlobalSecurity.privatekeyfile.argValue",false,false,"EditSambaServiceGlobalSecurity.privatekeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition("serviceName",null,"EditSambaServiceGlobalSecurity.serviceName.argValue",true,false,"EditSambaServiceGlobalSecurity.serviceName.argDescription");
	
			/**
		 * 
		 */
		public static final OptionDefinition KEY_authMethods = new OptionDefinition("authMethods",null,"ServiceGlobalSecurityOptionsDataContainer.AuthMethods.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.AuthMethods.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_encryptPasswords = new OptionDefinition("encryptPasswords",null,"ServiceGlobalSecurityOptionsDataContainer.EncryptPasswords.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.EncryptPasswords.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_minLength = new OptionDefinition("minLength",null,"ServiceGlobalSecurityOptionsDataContainer.MinPasswordLength.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.MinPasswordLength.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_nullPasswords = new OptionDefinition("nullPasswords",null,"ServiceGlobalSecurityOptionsDataContainer.NullPasswords.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.NullPasswords.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_passdbBackend = new OptionDefinition("passdbBackend",null,"ServiceGlobalSecurityOptionsDataContainer.PassdbBackend.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.PassdbBackend.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_smbPasswdFile = new OptionDefinition("smbPasswdFile",null,"ServiceGlobalSecurityOptionsDataContainer.SMBPasswdFile.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.SMBPasswdFile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_security = new OptionDefinition("security",null,"ServiceGlobalSecurityOptionsDataContainer.Security.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.Security.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_guestOK = new OptionDefinition("guestOK",null,"ServiceGlobalSecurityOptionsDataContainer.GuestOK.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.GuestOK.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_guestOnly = new OptionDefinition("guestOnly",null,"ServiceGlobalSecurityOptionsDataContainer.GuestOnly.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.GuestOnly.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_hostAllow = new OptionDefinition("hostAllow",null,"ServiceGlobalSecurityOptionsDataContainer.HostsAllow.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.HostsAllow.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_hostDeny = new OptionDefinition("hostDeny",null,"ServiceGlobalSecurityOptionsDataContainer.HostsDeny.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.HostsDeny.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_readOnly = new OptionDefinition("readOnly",null,"ServiceGlobalSecurityOptionsDataContainer.ReadOnly.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.ReadOnly.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_domainMaster = new OptionDefinition("domainMaster",null,"ServiceGlobalSecurityOptionsDataContainer.DomainMaster.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.DomainMaster.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_browsable = new OptionDefinition("browsable",null,"ServiceGlobalSecurityOptionsDataContainer.Browsable.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.Browsable.argDescription");
		
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
    	    	    	KEY_authMethods,
    	    	KEY_encryptPasswords,
    	    	KEY_minLength,
    	    	KEY_nullPasswords,
    	    	KEY_passdbBackend,
    	    	KEY_smbPasswdFile,
    	    	KEY_security,
    	    	KEY_guestOK,
    	    	KEY_guestOnly,
    	    	KEY_hostAllow,
    	    	KEY_hostDeny,
    	    	KEY_readOnly,
    	    	KEY_domainMaster,
    	    	KEY_browsable,
    			KEY_locale,
	};

		
 
 CommandLine cmd = null;
	AbstractBaseCimAdapter adapter = null;

	
	public EditSambaServiceGlobalSecurity(java.util.Locale locale)
	{
		super("EditSambaServiceGlobalSecurity", new String[]{"messages","messagesSamba"},locale);
	}
	
	public void execute(String[] args) throws WbemSmtException {
		
	    Options options = createOptions(OPTIONS, bundle);

		if (args.length == 1 && (args[0].equalsIgnoreCase("--help") || args[0].equalsIgnoreCase("-h") ))
		{
			showUsage(options);
			return;
		}
		
		//do the real processing
		System.out.println("\n" + bundle.getString("editing",new Object[]{bundle.getString("ServiceGlobalSecurityOptionsDataContainer.caption")}));
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
			
			CliDataLoader loader = new EditSambaServiceGlobalSecurityLoader();
			loader.load(bundle,adapter, cmd);
			
			org.sblim.wbemsmt.cli.samba.container.service.ServiceGlobalSecurityOptionsDataContainerImpl dc = new org.sblim.wbemsmt.cli.samba.container.service.ServiceGlobalSecurityOptionsDataContainerImpl(adapter);
						
        				
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
			System.out.println("\n" + bundle.getString("edited", new Object[]{bundle.getString("ServiceGlobalSecurityOptionsDataContainer.caption")}));

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
	private void setKeyValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.service.ServiceGlobalSecurityOptionsDataContainer dc) throws WbemSmtException {
    	    				    				    				    				    				    				    				    				    				    				    				    				    				    					}	
	
	/**
	 * Set all Values that are not read-Only
	 **/
	private void setValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.service.ServiceGlobalSecurityOptionsDataContainer dc) throws WbemSmtException {
    										setValue(cmd,dc.get_AuthMethods(),KEY_authMethods);
																									setCheckboxValue(cmd,dc.get_EncryptPasswords(),KEY_encryptPasswords);
																			setValue(cmd,dc.get_MinPasswordLength(),KEY_minLength);
																									setCheckboxValue(cmd,dc.get_NullPasswords(),KEY_nullPasswords);
																									setMultiValue(adapter.getBundle(),cmd,dc.get_usr_PassdbBackend(),KEY_passdbBackend);
																setValue(cmd,dc.get_SMBPasswdFile(),KEY_smbPasswdFile);
																												setMultiValue(adapter.getBundle(),cmd,dc.get_Security(),KEY_security);
																			setCheckboxValue(cmd,dc.get_GuestOK(),KEY_guestOK);
																						setCheckboxValue(cmd,dc.get_GuestOnly(),KEY_guestOnly);
																			setValue(cmd,dc.get_HostsAllow(),KEY_hostAllow);
																						setValue(cmd,dc.get_HostsDeny(),KEY_hostDeny);
																									setCheckboxValue(cmd,dc.get_ReadOnly(),KEY_readOnly);
																									setMultiValue(adapter.getBundle(),cmd,dc.get_DomainMaster(),KEY_domainMaster);
																			setCheckboxValue(cmd,dc.get_Browsable(),KEY_browsable);
												
		//The Buttons
    																																																																																																																																}	
}