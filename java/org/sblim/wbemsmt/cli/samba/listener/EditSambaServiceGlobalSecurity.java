/** 
  * EditSambaServiceGlobalSecurity.java
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

public class EditSambaServiceGlobalSecurity extends CimCommand {

	
 
 
	//All Options that are local and defined for this command
			/**
		 * 
		 */
		public static final OptionDefinition KEY_authMethods = new OptionDefinition(null,"authMethods","noDefaultValue","ServiceGlobalSecurityOptionsDataContainer.AuthMethods.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.AuthMethods.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_encryptPasswords = new OptionDefinition(null,"encryptPasswords","noDefaultValue","ServiceGlobalSecurityOptionsDataContainer.EncryptPasswords.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.EncryptPasswords.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_minLength = new OptionDefinition(null,"minLength","noDefaultValue","ServiceGlobalSecurityOptionsDataContainer.MinPasswordLength.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.MinPasswordLength.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_nullPasswords = new OptionDefinition(null,"nullPasswords","noDefaultValue","ServiceGlobalSecurityOptionsDataContainer.NullPasswords.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.NullPasswords.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_passdbBackend = new OptionDefinition(null,"passdbBackend","noDefaultValue","ServiceGlobalSecurityOptionsDataContainer.PassdbBackend.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.PassdbBackend.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_smbPasswdFile = new OptionDefinition(null,"smbPasswdFile","noDefaultValue","ServiceGlobalSecurityOptionsDataContainer.SMBPasswdFile.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.SMBPasswdFile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_security = new OptionDefinition(null,"security","noDefaultValue","ServiceGlobalSecurityOptionsDataContainer.Security.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.Security.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_guestOK = new OptionDefinition(null,"guestOK","noDefaultValue","ServiceGlobalSecurityOptionsDataContainer.GuestOK.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.GuestOK.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_guestOnly = new OptionDefinition(null,"guestOnly","noDefaultValue","ServiceGlobalSecurityOptionsDataContainer.GuestOnly.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.GuestOnly.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_hostAllow = new OptionDefinition(null,"hostAllow","noDefaultValue","ServiceGlobalSecurityOptionsDataContainer.HostsAllow.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.HostsAllow.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_hostDeny = new OptionDefinition(null,"hostDeny","noDefaultValue","ServiceGlobalSecurityOptionsDataContainer.HostsDeny.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.HostsDeny.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_readOnly = new OptionDefinition(null,"readOnly","noDefaultValue","ServiceGlobalSecurityOptionsDataContainer.ReadOnly.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.ReadOnly.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_domainMaster = new OptionDefinition(null,"domainMaster","noDefaultValue","ServiceGlobalSecurityOptionsDataContainer.DomainMaster.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.DomainMaster.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_browsable = new OptionDefinition(null,"browsable","noDefaultValue","ServiceGlobalSecurityOptionsDataContainer.Browsable.argValue",false,false,"ServiceGlobalSecurityOptionsDataContainer.Browsable.argDescription");
		
	//All Options that are global and task-related
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition(null,"serviceName","noDefaultValue","serviceName.argValue",true,false,"serviceName.argDescription");
	
	// Global Communication Options
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition(null,"hostname",null,"hostname.argValue",false,false,"hostname.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition(null,"port","5988","port.argValue",false,false,"port.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition(null,"namespace","/root/cimv2","namespace.argValue",false,false,"namespace.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition(null,"user",null,"user.argValue",false,false,"user.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition(null,"password",null,"password.argValue",false,false,"password.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition(null,"publickeyfile",null,"publickeyfile.argValue",false,false,"publickeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition(null,"privatekeyfile",null,"privatekeyfile.argValue",false,false,"privatekeyfile.argDescription");
	
	// Global Common Options
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_QUESTION_MARK_ = new OptionDefinition("?",null,null,null,false,false,"?.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_help = new OptionDefinition("h","help",null,null,false,false,"help.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_locale = new OptionDefinition("L","locale","en","locale.argValue",false,false,"locale.argDescription");
	
	private static final OptionDefinition[] LOCAL_OPTIONS = new OptionDefinition []
	{
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
    		};

	private static final OptionDefinition[] GLOBAL_TASK_OPTIONS = new OptionDefinition []
	{
    	    	KEY_GLOBAL_serviceName,
    		};

	private static final OptionDefinition[] GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS = new OptionDefinition []
	{
    	    	KEY_GLOBAL_hostname,
    	    	KEY_GLOBAL_port,
    	    	KEY_GLOBAL_namespace,
    	    	KEY_GLOBAL_user,
    	    	KEY_GLOBAL_password,
    	    	KEY_GLOBAL_publickeyfile,
    	    	KEY_GLOBAL_privatekeyfile,
    		};

	private static final OptionDefinition[] GLOBAL_WBEMSMT_COMMON_OPTIONS = new OptionDefinition []
	{
    	    	KEY_GLOBAL_QUESTION_MARK_,
    	    	KEY_GLOBAL_help,
    	    	KEY_GLOBAL_locale,
    		};

		
 
 CommandLine cmd = null;
	AbstractBaseCimAdapter adapter = null;

	
	public EditSambaServiceGlobalSecurity(java.util.Locale locale)
	{
		super("EditSambaServiceGlobalSecurity", new String[]{"messages","messagesSamba"},locale);
	}
	
	public void execute(CimCommandValues values) throws WbemSmtException {
		
		//do the real processing
		try {
			
 
			commandValues = values;
			cmd = values.getCommandLine();

			Options options = values.getOptions();
			
			//first handle the help options and then the parseException
			//if the user wants help parsing the args will fail (due to missing required args)
			//and so the helpOptions should be handled first
			
    		if (   hasOption(values.getArgs(), "-" + KEY_GLOBAL_QUESTION_MARK_.getShortKey())
			    || hasOption(values.getArgs(), "-" + KEY_GLOBAL_help.getShortKey()) )
    		{
    			showUsage(values.getOut(), options);
    			return;
    		}			
    		else if ( hasOption(values.getArgs(), "--" + KEY_GLOBAL_help.getLongKey()) )
    		{
				//TODO add extendedHelp by loading a manpage or sth else
    			showUsage(values.getOut(), options);
    			return;
    		}			

			else if (values.getParseException() != null)
			{
				handleParseException(values,KEY_GLOBAL_password);
				return;
			}
			adapter = 
					(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)CimAdapterFactory.getInstance()
					.getAdapter(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter.class,this);
			adapter.setBundle(bundle);
			adapter.setCimClient(values.getCimClient());
				
			adapter.loadInitial(adapter.getCimClient());
			
			values.getOut().println("\n" + bundle.getString("editing",new Object[]{bundle.getString("ServiceGlobalSecurityOptionsDataContainer.caption")}));

        	CliDataLoader loader = new EditSambaServiceGlobalSecurityLoader();
			loader.load(bundle,adapter, cmd);
			
			org.sblim.wbemsmt.cli.samba.container.service.ServiceGlobalSecurityOptionsDataContainerImpl dc = new org.sblim.wbemsmt.cli.samba.container.service.ServiceGlobalSecurityOptionsDataContainerImpl(adapter);
						
        				
			setKeyValues(cmd,adapter,dc);

			adapter.updateControls(dc);
			adapter.setActiveModule(AbstractBaseCimAdapter.ACTIVE_EDIT);
			
			values.getOut().println("\n" + bundle.getString("before.edit"));
			dc.trace(values.getOut());

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
			values.getOut().println("\n" + bundle.getString("edited", new Object[]{bundle.getString("ServiceGlobalSecurityOptionsDataContainer.caption")}));

			adapter.updateControls(dc);

			values.getOut().println("\n" + bundle.getString("after.edit"));
			dc.trace(values.getOut());
		
		}
		catch (Exception e)
		{
			super.handleException(e,values.getArgs(),values.getOptions(),KEY_GLOBAL_password);
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
    			
		//The Buttons
    		}	
	
	
 
			
	protected LoginOptionValues getLoginOptions() {
		return new LoginOptionValues(KEY_GLOBAL_hostname,KEY_GLOBAL_user,KEY_GLOBAL_password);
	}

	protected CimClientOptionValues getCimClientOptions() {
		
		return new CimClientOptionValues(KEY_GLOBAL_hostname,
				KEY_GLOBAL_port,
				KEY_GLOBAL_namespace,
				KEY_GLOBAL_user,
				KEY_GLOBAL_password,
				KEY_GLOBAL_publickeyfile,
				KEY_GLOBAL_privatekeyfile);
	}
	
	public Options getOptions() throws WbemSmtException {
		Options options = super.createOptions(LOCAL_OPTIONS, bundle);
		super.createOptions(options, GLOBAL_TASK_OPTIONS, bundle);
		super.createOptions(options, GLOBAL_WBEMSMT_COMMON_OPTIONS, bundle);
		super.createOptions(options, GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS, bundle);
		return options;
	}
	
	public Options getLocalOptions() throws WbemSmtException {
		Options options = super.createOptions(LOCAL_OPTIONS, bundle);
		return options;
	}

	public Options getGlobalWbemsmtCommonOptions() throws WbemSmtException {
		Options options = super.createOptions(GLOBAL_WBEMSMT_COMMON_OPTIONS, bundle);
		return options;
	}

	public Options getGlobalWbemsmtCommunicationOptions() throws WbemSmtException {
		Options options = super.createOptions(GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS, bundle);
		return options;
	}

	public Options getGlobalTaskOptions() throws WbemSmtException {
		Options options = super.createOptions(GLOBAL_TASK_OPTIONS, bundle);
		return options;
	}
	
}