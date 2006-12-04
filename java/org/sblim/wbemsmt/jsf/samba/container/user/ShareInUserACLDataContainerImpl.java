/** 
  * ShareInUserACLDataContainerImpl.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
  * @template: ./tools-dcg/templates/jsf/containerImpl.vm
  *
  * Contributors: 
  * 
  * Description: Container for the share-related acl within a user
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.user;

import org.sblim.wbemsmt.exception.*;

public class ShareInUserACLDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.user.ShareInUserACLDataContainer {

				private java.util.List icShares = new java.util.ArrayList();
	
		
	
	public ShareInUserACLDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {
		super(adapter,bindingPrefix, "ShareInUserACLDataContainer.caption");
		
				
    			
    	    						
		setFooter(getInputFieldContainer(),"ShareInUserACLDataContainer.footerText");
		adapter.initContainer(this);
	}
	

		
			
		/**
		* 
		* linked container ShareACLItemDataContainer
		*/
		public java.util.List getShares()
		{
			return icShares;
		}

	
		
	public void reload()
	{
		super.reload();
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesSamba"};
	}

	
}