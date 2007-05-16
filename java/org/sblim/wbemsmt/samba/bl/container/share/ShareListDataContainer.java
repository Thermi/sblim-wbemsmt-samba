/** 
  * ShareListDataContainer.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm
  *
  * Contributors: 
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

		public java.util.List getShares();

	
}