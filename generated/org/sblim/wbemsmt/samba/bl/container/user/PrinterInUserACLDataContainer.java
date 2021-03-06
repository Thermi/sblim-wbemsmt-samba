/** 
  * PrinterInUserACLDataContainer.java
  *
  * 
  * Â© Copyright IBM Corp.  2009,2006,2007
  *
  * THIS FILE IS PROVIDED UNDER THE TER	MS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: Container for the printer-related acl within a user
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.container.user;

import org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer;

public interface PrinterInUserACLDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer
{
	/** 
	 * Constants for Fields and Roles
	 **/
				public static final String ROLE_PRINTERS = "printers";
	
	
	/** 
	 * Defined Fields
	 **/
	
	
	/** 
	 * Linked DataContainers
	 **/
			
				
		/**
		* 
		* linked container PrinterACLItemDataContainer
		*/

				
		public java.util.List<PrinterACLItemDataContainer> getPrinters();
		
		
	   		
	   /**
		* Header for:
		* 
		* linked container PrinterACLItemDataContainer
		*/
		public  org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainerHeader getPrintersHeader();
		
			
}