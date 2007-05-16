/** 
  * ShareListDataContainerImpl.java
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
  * @template: org/sblim/wbemsmt/dcg/templates/cmd/containerImpl.vm
  *
  * Contributors: 
  * 
  * Description: List with shares
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.container.share;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;


public class ShareListDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.share.ShareListDataContainer {

				private java.util.List icShares = new java.util.ArrayList();
	
		
	public ShareListDataContainerImpl(AbstractBaseCimAdapter adapter) throws InitContainerException {
		super();
		setAdapter(adapter);
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

	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("ShareListDataContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
					}

		if (showChilds(listOptions))
		{
			traceChilds(printStream,listOptions,title);
		}
	}
	
	public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title)
	{
    		        		List listshares = getShares();
        		printStream.println();
        		printStream.println(getAdapter().getBundle().getString("ShareListDataContainer.role.shares") + " " + getAdapter().getBundle().getString("items.found", new Object[]{new Integer(listshares.size())}));
        		for (int i = 0; i < listshares.size(); i++) {
        			BaseDataContainer child = (BaseDataContainer)listshares.get(i);
        			printStream.println();
        			printStream.println(getAdapter().getBundle().getString("item") + ": " + (i+1) + " " + getAdapter().getBundle().getString("of") + " " + listshares.size());
        			child.trace(printStream,listOptions,false);
        		}
    			
			
	}
	
	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List getFields()
	{
		List fields = new ArrayList();
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List getChildContainers()
	{
		List childs = new ArrayList();
    	    		childs.addAll(getShares());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer)
	{
		ShareListDataContainerImpl source = (ShareListDataContainerImpl)sourceContainer;
	
    			
    	    		List targetListForShares = (List) getShares();
    		List sourceListForShares = (List) source.getShares();
    		if (sourceListForShares.size() != targetListForShares.size())
    		{
    			throw new IllegalArgumentException("The Lists are not from same size. Source is " + sourceListForShares.size() + " and target is " + targetListForShares.size() );
    		}
			for (int ii=0; ii < sourceListForShares.size(); ii++)
			{
				((DataContainer) targetListForShares.get(ii)).copyFrom(((DataContainer) sourceListForShares.get(ii)));
			}
			
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}