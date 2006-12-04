/** 
  * ShareListDataContainerImpl.java
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
  * Description: List with shares
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.share;

import org.sblim.wbemsmt.exception.*;

public class ShareListDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.share.ShareListDataContainer {

				private java.util.List icShares = new java.util.ArrayList();
	
		
	
	public ShareListDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {
		super(adapter,bindingPrefix, "ShareListDataContainer.caption");
		
				
    			
    	    						
		setFooter(getInputFieldContainer(),"ShareListDataContainer.footerText");
		adapter.initContainer(this);
	}
	

		
			
		/**
		* 
		* linked container ShareListItemDataContainer
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