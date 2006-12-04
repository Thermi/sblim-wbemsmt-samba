/** 
  * EditSambaShareFileAttributes.java
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

public class EditSambaShareFileAttributes extends CimCommand {

			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition("hostname",null,"EditSambaShareFileAttributes.hostname.argValue",true,false,"EditSambaShareFileAttributes.hostname.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition("port","5988","EditSambaShareFileAttributes.port.argValue",false,false,"EditSambaShareFileAttributes.port.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition("namespace","/root/cimv2","EditSambaShareFileAttributes.namespace.argValue",false,false,"EditSambaShareFileAttributes.namespace.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition("user",null,"EditSambaShareFileAttributes.user.argValue",true,false,"EditSambaShareFileAttributes.user.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition("password",null,"EditSambaShareFileAttributes.password.argValue",true,false,"EditSambaShareFileAttributes.password.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition("publickeyfile","none","EditSambaShareFileAttributes.publickeyfile.argValue",false,false,"EditSambaShareFileAttributes.publickeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition("privatekeyfile","none","EditSambaShareFileAttributes.privatekeyfile.argValue",false,false,"EditSambaShareFileAttributes.privatekeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition("serviceName",null,"EditSambaShareFileAttributes.serviceName.argValue",true,false,"EditSambaShareFileAttributes.serviceName.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_sambaSharename = new OptionDefinition("sambaSharename",null,"EditSambaShareFileAttributes.sambaSharename.argValue",true,false,"EditSambaShareFileAttributes.sambaSharename.argDescription");
	
			/**
		 * the Default Create Mask
		 */
		public static final OptionDefinition KEY_createMask = new OptionDefinition("createMask",null,"CMDShareFileAttributes.CreateMask.argValue",true,false,"CMDShareFileAttributes.CreateMask.argDescription");
			/**
		 * The directory Mask
		 */
		public static final OptionDefinition KEY_directoryMask = new OptionDefinition("directoryMask",null,"CMDShareFileAttributes.DirectoryMask.argValue",true,false,"CMDShareFileAttributes.DirectoryMask.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_directorySecurityMask = new OptionDefinition("directorySecurityMask",null,"CMDShareFileAttributes.DirectorySecurityMask.argValue",true,false,"CMDShareFileAttributes.DirectorySecurityMask.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_caseSensitive = new OptionDefinition("caseSensitive",null,"ShareFileAttributes.CaseSensitive.argValue",false,false,"ShareFileAttributes.CaseSensitive.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_hideDotFiles = new OptionDefinition("hideDotFiles",null,"ShareFileAttributes.HideDotFiles.argValue",false,false,"ShareFileAttributes.HideDotFiles.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_dosFiletimes = new OptionDefinition("dosFiletimes",null,"ShareFileAttributes.DosFiletimes.argValue",false,false,"ShareFileAttributes.DosFiletimes.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_eaSupport = new OptionDefinition("eaSupport",null,"ShareFileAttributes.EASupport.argValue",false,false,"ShareFileAttributes.EASupport.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_aclCompatibility = new OptionDefinition("aclCompatibility",null,"ShareFileAttributes.AclCompatibility.argValue",false,false,"ShareFileAttributes.AclCompatibility.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_ntaclSupport = new OptionDefinition("ntaclSupport",null,"ShareFileAttributes.NTACLSupport.argValue",false,false,"ShareFileAttributes.NTACLSupport.argDescription");
		
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
    	    	KEY_sambaSharename,
    	    	    	KEY_createMask,
    	    	KEY_directoryMask,
    	    	KEY_directorySecurityMask,
    	    	KEY_caseSensitive,
    	    	KEY_hideDotFiles,
    	    	KEY_dosFiletimes,
    	    	KEY_eaSupport,
    	    	KEY_aclCompatibility,
    	    	KEY_ntaclSupport,
    			KEY_locale,
	};

		
 
 CommandLine cmd = null;
	AbstractBaseCimAdapter adapter = null;

	
	public EditSambaShareFileAttributes(java.util.Locale locale)
	{
		super("EditSambaShareFileAttributes", new String[]{"messages","messagesSamba"},locale);
	}
	
	public void execute(String[] args) throws WbemSmtException {
		
	    Options options = createOptions(OPTIONS, bundle);

		if (args.length == 1 && (args[0].equalsIgnoreCase("--help") || args[0].equalsIgnoreCase("-h") ))
		{
			showUsage(options);
			return;
		}
		
		//do the real processing
		System.out.println("\n" + bundle.getString("editing",new Object[]{bundle.getString("CMDShareFileAttributes.caption")}));
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
			
			CliDataLoader loader = new EditSambaShareFileAttributesLoader();
			loader.load(bundle,adapter, cmd);
			
			org.sblim.wbemsmt.cli.samba.container.share.CMDShareFileAttributesImpl dc = new org.sblim.wbemsmt.cli.samba.container.share.CMDShareFileAttributesImpl(adapter);
						
        				
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
			System.out.println("\n" + bundle.getString("edited", new Object[]{bundle.getString("CMDShareFileAttributes.caption")}));

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
	private void setKeyValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.share.CMDShareFileAttributes dc) throws WbemSmtException {
    	    				    				    				    				    				    				    				    				    					}	
	
	/**
	 * Set all Values that are not read-Only
	 **/
	private void setValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.share.CMDShareFileAttributes dc) throws WbemSmtException {
    										setValue(cmd,dc.get_CreateMask(),KEY_createMask);
																						setValue(cmd,dc.get_DirectoryMask(),KEY_directoryMask);
																						setValue(cmd,dc.get_DirectorySecurityMask(),KEY_directorySecurityMask);
																									setCheckboxValue(cmd,dc.get_CaseSensitive(),KEY_caseSensitive);
																						setCheckboxValue(cmd,dc.get_HideDotFiles(),KEY_hideDotFiles);
																						setCheckboxValue(cmd,dc.get_DosFiletimes(),KEY_dosFiletimes);
																						setCheckboxValue(cmd,dc.get_EASupport(),KEY_eaSupport);
																									setMultiValue(adapter.getBundle(),cmd,dc.get_AclCompatibility(),KEY_aclCompatibility);
																			setCheckboxValue(cmd,dc.get_NTACLSupport(),KEY_ntaclSupport);
												
		//The Buttons
    																																																																																			}	
}