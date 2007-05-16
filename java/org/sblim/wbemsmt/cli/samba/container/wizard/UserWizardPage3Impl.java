/** 
  * UserWizardPage3Impl.java
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
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.container.wizard;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;


public class UserWizardPage3Impl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3 {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SambaUserName;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SystemUserName;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_IsGuest;
    			private java.util.List icShares = new java.util.ArrayList();
			private java.util.List icPrinters = new java.util.ArrayList();
	
		
	public UserWizardPage3Impl(AbstractBaseCimAdapter adapter) throws InitContainerException {
		super();
		setAdapter(adapter);
    			adapter.initContainer(this);
	}

			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SambaUserName() {
    		if (ic_SambaUserName == null)
    		{
				String label = getAdapter().getBundle().getString("UserWizardPage3.SambaUserName");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_SambaUserName = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_SambaUserName;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SystemUserName() {
    		if (ic_SystemUserName == null)
    		{
				String label = getAdapter().getBundle().getString("UserWizardPage3.SystemUserName");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_SystemUserName = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_SystemUserName;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_IsGuest() {
    		if (ic_usr_IsGuest == null)
    		{
				String label = getAdapter().getBundle().getString("UserWizardPage3.isGuest");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_IsGuest = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_IsGuest;
    	}
		
			
		/**
		* 
		* linked container ShareInUserWizardACLItemDataContainer
		*/
		public java.util.List getShares()
		{
			return icShares;
		}

			
		/**
		* 
		* linked container PrinterInUserWizardACLItemDataContainer
		*/
		public java.util.List getPrinters()
		{
			return icPrinters;
		}

	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("UserWizardPage3.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_SambaUserName().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_SambaUserName()).getValue();
        				printStream.println(get_SambaUserName().getLabelText() + ": " + value);
   			}
   			   			   			if (get_SystemUserName().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_SystemUserName()).getValue();
        				printStream.println(get_SystemUserName().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_IsGuest().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_IsGuest()).getValue();
        				printStream.println(get_usr_IsGuest().getLabelText() + ": " + value);
   			}
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
        		printStream.println(getAdapter().getBundle().getString("UserWizardPage3.role.shares") + " " + getAdapter().getBundle().getString("items.found", new Object[]{new Integer(listshares.size())}));
        		for (int i = 0; i < listshares.size(); i++) {
        			BaseDataContainer child = (BaseDataContainer)listshares.get(i);
        			printStream.println();
        			printStream.println(getAdapter().getBundle().getString("item") + ": " + (i+1) + " " + getAdapter().getBundle().getString("of") + " " + listshares.size());
        			child.trace(printStream,listOptions,false);
        		}
    		        		List listprinters = getPrinters();
        		printStream.println();
        		printStream.println(getAdapter().getBundle().getString("UserWizardPage3.role.printers") + " " + getAdapter().getBundle().getString("items.found", new Object[]{new Integer(listprinters.size())}));
        		for (int i = 0; i < listprinters.size(); i++) {
        			BaseDataContainer child = (BaseDataContainer)listprinters.get(i);
        			printStream.println();
        			printStream.println(getAdapter().getBundle().getString("item") + ": " + (i+1) + " " + getAdapter().getBundle().getString("of") + " " + listprinters.size());
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
    				fields.add(get_SambaUserName());
    				fields.add(get_SystemUserName());
    				fields.add(get_usr_IsGuest());
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
    	    		childs.addAll(getPrinters());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer)
	{
		UserWizardPage3Impl source = (UserWizardPage3Impl)sourceContainer;
	
    	    		get_SambaUserName().setValue(source.get_SambaUserName().getValue());
		    		get_SystemUserName().setValue(source.get_SystemUserName().getValue());
		    		get_usr_IsGuest().setValue(source.get_usr_IsGuest().getValue());
				
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
			
    	    		List targetListForPrinters = (List) getPrinters();
    		List sourceListForPrinters = (List) source.getPrinters();
    		if (sourceListForPrinters.size() != targetListForPrinters.size())
    		{
    			throw new IllegalArgumentException("The Lists are not from same size. Source is " + sourceListForPrinters.size() + " and target is " + targetListForPrinters.size() );
    		}
			for (int ii=0; ii < sourceListForPrinters.size(); ii++)
			{
				((DataContainer) targetListForPrinters.get(ii)).copyFrom(((DataContainer) sourceListForPrinters.get(ii)));
			}
			
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}