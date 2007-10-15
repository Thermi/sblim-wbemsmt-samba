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

public class ShareListDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.share.ShareListDataContainer
			, org.sblim.wbemsmt.samba.bl.container.share.ShareListItemDataContainerHeader		
	{
				
		
		private java.util.List icShares = new java.util.ArrayList();

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_Name;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_Available;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_Comment;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_Path;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_Browsable;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_GuestOK;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_GuestOnly;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_HostsAllow;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_HostsDeny;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_ReadOnly;
		
	
		
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

   	       /**
		* Header for:
		* 
		* linked container ShareListItemDataContainer
		*/
		public org.sblim.wbemsmt.samba.bl.container.share.ShareListItemDataContainerHeader getSharesHeader()
		{
			return this;
		}

				/**
   		 * Header for field Name
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_Name() {
    		if (icSharesHeader_Name == null)
    		{
    			String label = getAdapter().getBundle().getString("ShareListItemDataContainer.Name");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			icSharesHeader_Name = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icSharesHeader_Name;
    	    }
				/**
   		 * Header for field Available
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_Available() {
    		if (icSharesHeader_Available == null)
    		{
    			String label = getAdapter().getBundle().getString("ShareListItemDataContainer.Available");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			icSharesHeader_Available = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icSharesHeader_Available;
    	    }
				/**
   		 * Header for field Comment
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_Comment() {
    		if (icSharesHeader_Comment == null)
    		{
    			String label = getAdapter().getBundle().getString("ShareListItemDataContainer.Comment");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			icSharesHeader_Comment = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icSharesHeader_Comment;
    	    }
				/**
   		 * Header for field Path
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_Path() {
    		if (icSharesHeader_Path == null)
    		{
    			String label = getAdapter().getBundle().getString("ShareListItemDataContainer.Path");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			icSharesHeader_Path = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icSharesHeader_Path;
    	    }
				/**
   		 * Header for field Browsable
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_Browsable() {
    		if (icSharesHeader_Browsable == null)
    		{
    			String label = getAdapter().getBundle().getString("ShareListItemDataContainer.Browsable");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			icSharesHeader_Browsable = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icSharesHeader_Browsable;
    	    }
				/**
   		 * Header for field GuestOK
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_GuestOK() {
    		if (icSharesHeader_GuestOK == null)
    		{
    			String label = getAdapter().getBundle().getString("ShareListItemDataContainer.GuestOK");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			icSharesHeader_GuestOK = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icSharesHeader_GuestOK;
    	    }
				/**
   		 * Header for field GuestOnly
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_GuestOnly() {
    		if (icSharesHeader_GuestOnly == null)
    		{
    			String label = getAdapter().getBundle().getString("ShareListItemDataContainer.GuestOnly");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			icSharesHeader_GuestOnly = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icSharesHeader_GuestOnly;
    	    }
				/**
   		 * Header for field HostsAllow
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_HostsAllow() {
    		if (icSharesHeader_HostsAllow == null)
    		{
    			String label = getAdapter().getBundle().getString("ShareListItemDataContainer.HostsAllow");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			icSharesHeader_HostsAllow = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icSharesHeader_HostsAllow;
    	    }
				/**
   		 * Header for field HostsDeny
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_HostsDeny() {
    		if (icSharesHeader_HostsDeny == null)
    		{
    			String label = getAdapter().getBundle().getString("ShareListItemDataContainer.HostsDeny");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			icSharesHeader_HostsDeny = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icSharesHeader_HostsDeny;
    	    }
				/**
   		 * Header for field ReadOnly
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_ReadOnly() {
    		if (icSharesHeader_ReadOnly == null)
    		{
    			String label = getAdapter().getBundle().getString("ShareListItemDataContainer.ReadOnly");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			icSharesHeader_ReadOnly = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icSharesHeader_ReadOnly;
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