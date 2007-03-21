/** 
  * UserListItemDataContainerImpl.java
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
  * @template: ./tools-dcg/templates/cmd/containerImpl.vm
  *
  * Contributors: 
  * 
  * Description: user within a list of users
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.container.user;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;


public class UserListItemDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.user.UserListItemDataContainer {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SambaUserName;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SystemUserName;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_IsGuest;
    	
		
	public UserListItemDataContainerImpl(AbstractBaseCimAdapter adapter) throws InitContainerException {
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
				String label = getAdapter().getBundle().getString("UserListItemDataContainer.SambaUserName");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_SambaUserName = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_SambaUserName;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SystemUserName() {
    		if (ic_SystemUserName == null)
    		{
				String label = getAdapter().getBundle().getString("UserListItemDataContainer.SystemUserName");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_SystemUserName = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_SystemUserName;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_IsGuest() {
    		if (ic_usr_IsGuest == null)
    		{
				String label = getAdapter().getBundle().getString("UserListItemDataContainer.isGuest");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_IsGuest = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_IsGuest;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("UserListItemDataContainer.caption"));
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
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer)
	{
		UserListItemDataContainerImpl source = (UserListItemDataContainerImpl)sourceContainer;
	
    	    		get_SambaUserName().setValue(source.get_SambaUserName().getValue());
		    		get_SystemUserName().setValue(source.get_SystemUserName().getValue());
		    		get_usr_IsGuest().setValue(source.get_usr_IsGuest().getValue());
				
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}