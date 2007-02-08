/** 
  * EditSambaShareGlobals.java
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

public class EditSambaShareGlobals extends CimCommand {

			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition("hostname",null,"EditSambaShareGlobals.hostname.argValue",true,false,"EditSambaShareGlobals.hostname.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition("port","5988","EditSambaShareGlobals.port.argValue",false,false,"EditSambaShareGlobals.port.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition("namespace","/root/cimv2","EditSambaShareGlobals.namespace.argValue",false,false,"EditSambaShareGlobals.namespace.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition("user",null,"EditSambaShareGlobals.user.argValue",true,false,"EditSambaShareGlobals.user.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition("password",null,"EditSambaShareGlobals.password.argValue",true,false,"EditSambaShareGlobals.password.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition("publickeyfile","none","EditSambaShareGlobals.publickeyfile.argValue",false,false,"EditSambaShareGlobals.publickeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition("privatekeyfile","none","EditSambaShareGlobals.privatekeyfile.argValue",false,false,"EditSambaShareGlobals.privatekeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition("serviceName",null,"EditSambaShareGlobals.serviceName.argValue",true,false,"EditSambaShareGlobals.serviceName.argDescription");
	
			/**
		 * the Default Create Mask
		 */
		public static final OptionDefinition KEY_createMask = new OptionDefinition("createMask",null,"CMDShareGlobalsDataContainer.CreateMask.argValue",false,false,"CMDShareGlobalsDataContainer.CreateMask.argDescription");
			/**
		 * The directory Mask
		 */
		public static final OptionDefinition KEY_directoryMask = new OptionDefinition("directoryMask",null,"CMDShareGlobalsDataContainer.DirectoryMask.argValue",false,false,"CMDShareGlobalsDataContainer.DirectoryMask.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_directorySecurityMask = new OptionDefinition("directorySecurityMask",null,"CMDShareGlobalsDataContainer.DirectorySecurityMask.argValue",false,false,"CMDShareGlobalsDataContainer.DirectorySecurityMask.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_caseSensitive = new OptionDefinition("caseSensitive",null,"ShareGlobalsDataContainer.CaseSensitive.argValue",false,false,"ShareGlobalsDataContainer.CaseSensitive.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_dosFiletimes = new OptionDefinition("dosFiletimes",null,"ShareGlobalsDataContainer.DosFiletimes.argValue",false,false,"ShareGlobalsDataContainer.DosFiletimes.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_hideDotFiles = new OptionDefinition("hideDotFiles",null,"ShareGlobalsDataContainer.HideDotFiles.argValue",false,false,"ShareGlobalsDataContainer.HideDotFiles.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_aclCompatibility = new OptionDefinition("aclCompatibility",null,"ShareGlobalsDataContainer.AclCompatibility.argValue",false,false,"ShareGlobalsDataContainer.AclCompatibility.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_eaSupport = new OptionDefinition("eaSupport",null,"ShareGlobalsDataContainer.EASupport.argValue",false,false,"ShareGlobalsDataContainer.EASupport.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_ntaclSupport = new OptionDefinition("ntaclSupport",null,"ShareGlobalsDataContainer.NTACLSupport.argValue",false,false,"ShareGlobalsDataContainer.NTACLSupport.argDescription");
		
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
    	    	    	KEY_createMask,
    	    	KEY_directoryMask,
    	    	KEY_directorySecurityMask,
    	    	KEY_caseSensitive,
    	    	KEY_dosFiletimes,
    	    	KEY_hideDotFiles,
    	    	KEY_aclCompatibility,
    	    	KEY_eaSupport,
    	    	KEY_ntaclSupport,
    			KEY_locale,
	};

		
 
 CommandLine cmd = null;
	AbstractBaseCimAdapter adapter = null;

	
	public EditSambaShareGlobals(java.util.Locale locale)
	{
		super("EditSambaShareGlobals", new String[]{"messages","messagesSamba"},locale);
	}
	
	public void execute(String[] args) throws WbemSmtException {
		
	    Options options = createOptions(OPTIONS, bundle);

		if (args.length == 1 && (args[0].equalsIgnoreCase("--help") || args[0].equalsIgnoreCase("-h") ))
		{
			showUsage(options);
			return;
		}
		
		//do the real processing
		System.out.println("\n" + bundle.getString("editing",new Object[]{bundle.getString("CMDShareGlobalsDataContainer.caption")}));
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
			
			CliDataLoader loader = new EditSambaShareGlobalsLoader();
			loader.load(bundle,adapter, cmd);
			
			org.sblim.wbemsmt.cli.samba.container.global.CMDShareGlobalsDataContainerImpl dc = new org.sblim.wbemsmt.cli.samba.container.global.CMDShareGlobalsDataContainerImpl(adapter);
						
        				
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
			System.out.println("\n" + bundle.getString("edited", new Object[]{bundle.getString("CMDShareGlobalsDataContainer.caption")}));

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
	private void setKeyValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.global.CMDShareGlobalsDataContainer dc) throws WbemSmtException {
    	    				    				    				    				    				    				    				    				    					}	
	
	/**
	 * Set all Values that are not read-Only
	 **/
	private void setValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.global.CMDShareGlobalsDataContainer dc) throws WbemSmtException {
    										setValue(cmd,dc.get_CreateMask(),KEY_createMask);
																						setValue(cmd,dc.get_DirectoryMask(),KEY_directoryMask);
																						setValue(cmd,dc.get_DirectorySecurityMask(),KEY_directorySecurityMask);
																									setCheckboxValue(cmd,dc.get_CaseSensitive(),KEY_caseSensitive);
																						setCheckboxValue(cmd,dc.get_DosFiletimes(),KEY_dosFiletimes);
																						setCheckboxValue(cmd,dc.get_HideDotFiles(),KEY_hideDotFiles);
																									setMultiValue(adapter.getBundle(),cmd,dc.get_AclCompatibility(),KEY_aclCompatibility);
																			setCheckboxValue(cmd,dc.get_EASupport(),KEY_eaSupport);
																						setCheckboxValue(cmd,dc.get_NTACLSupport(),KEY_ntaclSupport);
												
		//The Buttons
    																																																																																			}	
}