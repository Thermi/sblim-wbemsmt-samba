/** 
  * Commands.java
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
  * @template: ./tools-dcg/templates/cmd/commands.vm
  *
  * Contributors: 
  * 
  * Description: Class containing the mapping between Commands and the Commandlet
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.listener;

public class Commands extends org.sblim.wbemsmt.tools.cli.Commands {
	
	public Commands()
	{
    			
		addCommand("DeleteSambaShare",org.sblim.wbemsmt.cli.samba.listener.DeleteSambaShare.class);    			
		addCommand("DeleteSambaPrinter",org.sblim.wbemsmt.cli.samba.listener.DeleteSambaPrinter.class);    			
		addCommand("DeleteSambaUser",org.sblim.wbemsmt.cli.samba.listener.DeleteSambaUser.class);    			
		addCommand("DeleteSambaHost",org.sblim.wbemsmt.cli.samba.listener.DeleteSambaHost.class);    			
		addCommand("ListSambaShares",org.sblim.wbemsmt.cli.samba.listener.ListSambaShares.class);    			
		addCommand("ListSambaShareDetails",org.sblim.wbemsmt.cli.samba.listener.ListSambaShareDetails.class);    			
		addCommand("ListSambaShareFileAttributes",org.sblim.wbemsmt.cli.samba.listener.ListSambaShareFileAttributes.class);    			
		addCommand("ListSambaPrinters",org.sblim.wbemsmt.cli.samba.listener.ListSambaPrinters.class);    			
		addCommand("ListSambaPrinterDetails",org.sblim.wbemsmt.cli.samba.listener.ListSambaPrinterDetails.class);    			
		addCommand("ListSambaPrintingOptions",org.sblim.wbemsmt.cli.samba.listener.ListSambaPrintingOptions.class);    			
		addCommand("ListSambaUsers",org.sblim.wbemsmt.cli.samba.listener.ListSambaUsers.class);    			
		addCommand("ListSambaPrinterAclOfUser",org.sblim.wbemsmt.cli.samba.listener.ListSambaPrinterAclOfUser.class);    			
		addCommand("ListSambaShareAclOfUser",org.sblim.wbemsmt.cli.samba.listener.ListSambaShareAclOfUser.class);    			
		addCommand("ListSambaServiceOptions",org.sblim.wbemsmt.cli.samba.listener.ListSambaServiceOptions.class);    			
		addCommand("ListSambaGlobalSecurity",org.sblim.wbemsmt.cli.samba.listener.ListSambaGlobalSecurity.class);    			
		addCommand("ListSambaServiceUserSecurity",org.sblim.wbemsmt.cli.samba.listener.ListSambaServiceUserSecurity.class);    			
		addCommand("ListSambaService",org.sblim.wbemsmt.cli.samba.listener.ListSambaService.class);    			
		addCommand("ListSambaPrinterGlobals",org.sblim.wbemsmt.cli.samba.listener.ListSambaPrinterGlobals.class);    			
		addCommand("ListSambaShareGlobals",org.sblim.wbemsmt.cli.samba.listener.ListSambaShareGlobals.class);    			
		addCommand("ListSambaUserAclInService",org.sblim.wbemsmt.cli.samba.listener.ListSambaUserAclInService.class);    			
		addCommand("ListSambaGlobalPrinterAdmin",org.sblim.wbemsmt.cli.samba.listener.ListSambaGlobalPrinterAdmin.class);    			
		addCommand("ListSambaGlobalShareAdmin",org.sblim.wbemsmt.cli.samba.listener.ListSambaGlobalShareAdmin.class);    			
		addCommand("CreateSambaShare",org.sblim.wbemsmt.cli.samba.listener.CreateSambaShare.class);    			
		addCommand("CreateSambaPrinter",org.sblim.wbemsmt.cli.samba.listener.CreateSambaPrinter.class);    			
		addCommand("CreateSambaUser",org.sblim.wbemsmt.cli.samba.listener.CreateSambaUser.class);    			
		addCommand("CreateSambaHost",org.sblim.wbemsmt.cli.samba.listener.CreateSambaHost.class);    			
		addCommand("EditSambaShare",org.sblim.wbemsmt.cli.samba.listener.EditSambaShare.class);    			
		addCommand("EditSambaShareFileAttributes",org.sblim.wbemsmt.cli.samba.listener.EditSambaShareFileAttributes.class);    			
		addCommand("EditSambaServiceOptions",org.sblim.wbemsmt.cli.samba.listener.EditSambaServiceOptions.class);    			
		addCommand("EditSambaServiceGlobalSecurity",org.sblim.wbemsmt.cli.samba.listener.EditSambaServiceGlobalSecurity.class);    			
		addCommand("EditSambaServiceUserSecurity",org.sblim.wbemsmt.cli.samba.listener.EditSambaServiceUserSecurity.class);    			
		addCommand("EditSambaService",org.sblim.wbemsmt.cli.samba.listener.EditSambaService.class);    			
		addCommand("EditSambaPrinterGlobals",org.sblim.wbemsmt.cli.samba.listener.EditSambaPrinterGlobals.class);    			
		addCommand("EditSambaShareGlobals",org.sblim.wbemsmt.cli.samba.listener.EditSambaShareGlobals.class);    			
		addCommand("EditSambaPrinter",org.sblim.wbemsmt.cli.samba.listener.EditSambaPrinter.class);    			
		addCommand("EditSambaPrintingOptions",org.sblim.wbemsmt.cli.samba.listener.EditSambaPrintingOptions.class);    			
		addCommand("EditSambaUser",org.sblim.wbemsmt.cli.samba.listener.EditSambaUser.class);    			
		addCommand("EditSambaShareAclOfUser",org.sblim.wbemsmt.cli.samba.listener.EditSambaShareAclOfUser.class);    			
		addCommand("EditSambaPrinterAclOfUser",org.sblim.wbemsmt.cli.samba.listener.EditSambaPrinterAclOfUser.class);    			
		addCommand("EditSambaUserAclInService",org.sblim.wbemsmt.cli.samba.listener.EditSambaUserAclInService.class);    			
		addCommand("EditSambaGlobalPrinterAdmin",org.sblim.wbemsmt.cli.samba.listener.EditSambaGlobalPrinterAdmin.class);    			
		addCommand("EditSambaGlobalShareAdmin",org.sblim.wbemsmt.cli.samba.listener.EditSambaGlobalShareAdmin.class);    			
	}
}