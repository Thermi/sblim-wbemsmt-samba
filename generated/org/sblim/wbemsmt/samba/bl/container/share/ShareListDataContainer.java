/** 
  * ShareListDataContainer.java
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
  * Description: List with shares
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.container.share;

public interface ShareListDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer
{
	/** 
	 * Constants for Fields and Roles
	 **/
				public static final String ROLE_SHARES = "shares";
	
	
	/** 
	 * Defined Fields
	 **/
	
	
	/** 
	 * Linked DataContainers
	 **/
			
				
		/**
		* 
		* linked container ShareListItemDataContainer
		*/

				
		public java.util.List<ShareListItemDataContainer> getShares();
		
		
	   		
	   /**
		* Header for:
		* 
		* linked container ShareListItemDataContainer
		*/
		public  org.sblim.wbemsmt.samba.bl.container.share.ShareListItemDataContainerHeader getSharesHeader();
		
			
}