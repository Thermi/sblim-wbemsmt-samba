/** 
  * AdminUsersInPrinterGlobalsImpl.java
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
  * Description: container for admin Users in global printer settings
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.container.global;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;


public class AdminUsersInPrinterGlobalsImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_SambaUserName;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Admin;
    	
		
	public AdminUsersInPrinterGlobalsImpl(AbstractBaseCimAdapter adapter) throws InitContainerException {
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_SambaUserName() {
    		if (ic_usr_SambaUserName == null)
    		{
				String label = getAdapter().getBundle().getString("AdminUsersInPrinterGlobals.SambaUserName");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_SambaUserName = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_SambaUserName;
    	}
			/**
		* relates to Linux_SambaAdminUsersForShare
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Admin() {
    		if (ic_usr_Admin == null)
    		{
				String label = getAdapter().getBundle().getString("AdminUsersInPrinterGlobals.admin");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Admin = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_Admin;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("AdminUsersInPrinterGlobals.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_usr_SambaUserName().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_SambaUserName()).getValue();
        				printStream.println(get_usr_SambaUserName().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Admin().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Admin()).getValue();
        				printStream.println(get_usr_Admin().getLabelText() + ": " + value);
   			}
   					}

		if (showChilds(listOptions))
		{
			traceChilds(printStream,listOptions,title);
		}
	}
	
	public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title)
	{
    			
			
	}
	
	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List getFields()
	{
		List fields = new ArrayList();
    				fields.add(get_usr_SambaUserName());
    				fields.add(get_usr_Admin());
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List getChildContainers()
	{
		List childs = new ArrayList();
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer)
	{
		AdminUsersInPrinterGlobalsImpl source = (AdminUsersInPrinterGlobalsImpl)sourceContainer;
	
    	    		get_usr_SambaUserName().setValue(source.get_usr_SambaUserName().getValue());
		    		get_usr_Admin().setValue(source.get_usr_Admin().getValue());
				
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}