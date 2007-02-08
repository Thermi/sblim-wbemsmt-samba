/** 
  * CreateSambaShare.java
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
  * @template: ./tools-dcg/templates/cmd/createCommand.vm
  *
  * Contributors: 
  * 
  * Description: Class for creating objects
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
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.exception.UpdateControlsException;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.tools.cli.*;
import org.sblim.wbemsmt.tools.wizard.cli.*;

public class CreateSambaShare extends CimCommand implements ContainerUpdater {

			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition("hostname",null,"CreateSambaShare.hostname.argValue",true,false,"CreateSambaShare.hostname.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition("port","5988","CreateSambaShare.port.argValue",false,false,"CreateSambaShare.port.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition("namespace","/root/cimv2","CreateSambaShare.namespace.argValue",false,false,"CreateSambaShare.namespace.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition("user",null,"CreateSambaShare.user.argValue",true,false,"CreateSambaShare.user.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition("password",null,"CreateSambaShare.password.argValue",true,false,"CreateSambaShare.password.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition("publickeyfile","none","CreateSambaShare.publickeyfile.argValue",false,false,"CreateSambaShare.publickeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition("privatekeyfile","none","CreateSambaShare.privatekeyfile.argValue",false,false,"CreateSambaShare.privatekeyfile.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition("serviceName",null,"CreateSambaShare.serviceName.argValue",true,false,"CreateSambaShare.serviceName.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_sharename = new OptionDefinition("sharename",null,"ShareWizardPage1.Name.argValue",true,false,"ShareWizardPage1.Name.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_path = new OptionDefinition("path",null,"ShareWizardPage1.Path.argValue",true,false,"ShareWizardPage1.Path.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_comment = new OptionDefinition("comment",null,"ShareWizardPage1.Comment.argValue",false,false,"ShareWizardPage1.Comment.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_seenByEverybody = new OptionDefinition("seenByEverybody",null,"ShareWizardPage2.seenByEverybody.argValue",false,false,"ShareWizardPage2.seenByEverybody.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_forceUser = new OptionDefinition("forceUser",null,"ShareWizardPage2.forceUser.argValue",false,false,"ShareWizardPage2.forceUser.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_enableGuest = new OptionDefinition("enableGuest",null,"ShareWizardPage2.enableGuest.argValue",false,false,"ShareWizardPage2.enableGuest.argDescription");
			/**
		 * 
		 */
		public static final OptionDefinition KEY_enableAllUsers = new OptionDefinition("enableAllUsers",null,"ShareWizardPage2.enableAllUsers.argValue",false,false,"ShareWizardPage2.enableAllUsers.argDescription");
		
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
    	    	KEY_path,
    	    	KEY_comment,
    	    	KEY_seenByEverybody,
    	    	KEY_forceUser,
    	    	KEY_enableGuest,
    	    	KEY_enableAllUsers,
    			KEY_locale,
	};

	
	
 
 CommandLine cmd = null;
	AbstractBaseCimAdapter adapter = null;

	
	public CreateSambaShare(java.util.Locale locale)
	{
		super("CreateSambaShare", new String[]{"messages","messagesSamba"},locale);
	}

	public void execute(String[] args) throws WbemSmtException {

	    Options options = createOptions(OPTIONS, bundle);
		if (args.length == 1 && (args[0].equalsIgnoreCase("--help") || args[0].equalsIgnoreCase("-h") ))
		{
			showUsage(options);
			return;
		}
		
		System.out.println("\n" + bundle.getString("creating", new Object[]{bundle.getString("shareWizard.caption")}));
		//do the real processing
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
			
			CliDataLoader loader = new CreateSambaShareLoader();
			loader.load(bundle,adapter, cmd);
			
			org.sblim.wbemsmt.cli.samba.wizard.ShareWizard wizard = new org.sblim.wbemsmt.cli.samba.wizard.ShareWizard((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter) adapter);
			wizard.startWizard();
			
			while (!wizard.getContainer().isLast(wizard.getContainer().getCurrentPageName()))
			{
				BaseDataContainer dataContainer = wizard.getCurrentPanel();
				if (true == false);
								else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1) setCommandLineValues(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1)dataContainer);
								else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2) setCommandLineValues(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2)dataContainer);
								else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4) setCommandLineValues(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4)dataContainer);
								else {
					logger.severe(dataContainer.getClass().getName() + " cannot be handled from command class "  + this.getClass().getName());
										throw new WbemSmtException(bundle.getString("internal.error"));
				}

				MessageList result = MessageList.init(dataContainer);					
				if (result.hasErrors())
				{
    					traceErrors(result);
    					return;
				}
				else
				{
					traceMessages("additional.messages",result);
					result.clear();
				}
				
				wizard.next(this);
				result = wizard.getCurrentPanel().getMessagesList();

				if (result != null)
				{
					if (result.hasErrors())
					{
    					traceErrors("validation.error",result);
    					return;
					}
					else
					{
						traceMessages("additional.messages",result);
						dataContainer.getMessagesList().clear();
					}
				}
			}			
			
			BaseDataContainer lastPanel = wizard.getCurrentPanel();
			wizard.finish();

			if (true == false);
						else if (lastPanel instanceof org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4) ((CreateSambaShareLoader)loader).loadTracingObject(bundle,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4)lastPanel);
						else {
				logger.severe("Cannot loadTracingObject for " + lastPanel.getClass().getName());
				throw new WbemSmtException(bundle.getString("internal.error"));
			}
			
			org.sblim.wbemsmt.cli.samba.container.share.ShareOptionsDataContainerImpl dc = new org.sblim.wbemsmt.cli.samba.container.share.ShareOptionsDataContainerImpl(adapter);

						
        				
			adapter.updateControls(dc);
			System.out.println("\n" + bundle.getString("createdObject") + ":\n");
			dc.trace(System.out);
			
		System.out.println("\n" + bundle.getString("created", new Object[]{bundle.getString("shareWizard.caption")}));
		
		}
		catch (Exception e)
		{
			super.handleException(e,args,options,KEY_GLOBAL_password);
		}
	}
    
	public void prepareForUpdateControls(DataContainer dataContainer) throws UpdateControlsException
	{
		if (true == false);
				else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1) updateContainerChilds(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1)dataContainer);
				else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2) updateContainerChilds(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2)dataContainer);
				else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4) updateContainerChilds(cmd,adapter,(org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4)dataContainer);
				else {

				logger.severe("Cannot setValues for Container " + dataContainer.getClass().getName());
				throw new UpdateControlsException("Cannot setValues for Container " + dataContainer.getClass().getName());
		}
	}
	
			
	private void updateContainerChilds(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1 dc) throws UpdateControlsException {
		
		try
		{
    		//update the child-containers
    		
			    		
        			}
		catch (Exception e)
		{
				throw new UpdateControlsException(bundle.getString("internal.error"),e);
		}
		
		
	}
	
	private void setCommandLineValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1 dc) throws WbemSmtException {
		//set the values
											setValue(cmd,dc.get_Name(),KEY_sharename);
																						setValue(cmd,dc.get_Path(),KEY_path);
																						setValue(cmd,dc.get_Comment(),KEY_comment);
															
		//The Buttons
    																														
	}	

			
	private void updateContainerChilds(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2 dc) throws UpdateControlsException {
		
		try
		{
    		//update the child-containers
    		
						int count = 0;
			    		
        	    		
    		count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer.class);
    		dc.getUsers().clear();
    		for (int i=0; i < count; i++) {
    			org.sblim.wbemsmt.cli.samba.container.wizard.UserInShareWizardACLItemDataContainerImpl child = new org.sblim.wbemsmt.cli.samba.container.wizard.UserInShareWizardACLItemDataContainerImpl(adapter);
    			dc.getUsers().add(child);
    		}
					}
		catch (Exception e)
		{
				throw new UpdateControlsException(bundle.getString("internal.error"),e);
		}
		
		
	}
	
	private void setCommandLineValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2 dc) throws WbemSmtException {
		//set the values
														setCheckboxValue(cmd,dc.get_usr_SeenByEverybody(),KEY_seenByEverybody);
																									setMultiValue(adapter.getBundle(),cmd,dc.get_usr_ForceUser(),KEY_forceUser);
																			setCheckboxValue(cmd,dc.get_usr_EnableGuest(),KEY_enableGuest);
																						setCheckboxValue(cmd,dc.get_usr_EnableAllUsers(),KEY_enableAllUsers);
												
		//The Buttons
    																																					if (!pressButton(cmd,adapter,dc,dc.get_usr_EnableAllUsers(),KEY_enableAllUsers)) return;
									
	}	

			
	private void updateContainerChilds(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4 dc) throws UpdateControlsException {
		
		try
		{
    		//update the child-containers
    		
						int count = 0;
			    		
        	    		
    		count = adapter.count(org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer.class);
    		dc.getUsers().clear();
    		for (int i=0; i < count; i++) {
    			org.sblim.wbemsmt.cli.samba.container.wizard.UserInShareWizardACLItemDataContainerImpl child = new org.sblim.wbemsmt.cli.samba.container.wizard.UserInShareWizardACLItemDataContainerImpl(adapter);
    			dc.getUsers().add(child);
    		}
					}
		catch (Exception e)
		{
				throw new UpdateControlsException(bundle.getString("internal.error"),e);
		}
		
		
	}
	
	private void setCommandLineValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4 dc) throws WbemSmtException {
		//set the values
				
		//The Buttons
    			
	}	

	}