/** 
  * ServiceUserSecurityOptionsDataContainerImpl.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
  * @template: ./tools-dcg/templates/cmd/containerImpl.vm
  *
  * Contributors: 
  * 
  * Description: Container for defining user related security options
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.container.service;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
//import org.sblim.wbemsmt.tools.converter.*;
//import org.sblim.wbemsmt.tools.converter.test.*;
//import org.sblim.wbemsmt.tools.input.*;
//import org.sblim.wbemsmt.tools.input.test.*;
import org.sblim.wbemsmt.tools.resources.*;
import org.sblim.wbemsmt.exception.*;

public class ServiceUserSecurityOptionsDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.service.ServiceUserSecurityOptionsDataContainer {

	protected static WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(new String[]{"messages","messagesSamba"},Locale.getDefault());

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_GuestUser;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_CurrentForceUser;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_NewForceUser;
    			private java.util.List icUserRights = new java.util.ArrayList();
	
		
	public ServiceUserSecurityOptionsDataContainerImpl(AbstractBaseCimAdapter adapter) throws InitContainerException {
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_GuestUser() {
    		if (ic_usr_GuestUser == null)
    		{
				String label = bundle.getString("ServiceUserSecurityOptionsDataContainer.guestUser");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_GuestUser = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_GuestUser;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_CurrentForceUser() {
    		if (ic_usr_CurrentForceUser == null)
    		{
				String label = bundle.getString("ServiceUserSecurityOptionsDataContainer.currentForceUser");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_CurrentForceUser = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_CurrentForceUser;
    	}
			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType COMBOBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_NewForceUser() {
    		if (ic_usr_NewForceUser == null)
    		{
				String label = bundle.getString("ServiceUserSecurityOptionsDataContainer.newForceUser");
				org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
    			ic_usr_NewForceUser = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(this,label,"",converter);
    		}
    		return ic_usr_NewForceUser;
    	}
		
			
		/**
		* 
		* linked container UserACLItemDataContainerForService
		*/
		public java.util.List getUserRights()
		{
			return icUserRights;
		}

	
		
	public void trace(java.io.PrintStream printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(bundle.getString("ServiceUserSecurityOptionsDataContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
						if (get_usr_GuestUser().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_GuestUser()).getValue();
				printStream.println(get_usr_GuestUser().getLabelText() + ": " + value);
			}
						if (get_usr_CurrentForceUser().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_CurrentForceUser()).getValue();
				printStream.println(get_usr_CurrentForceUser().getLabelText() + ": " + value);
			}
						if (get_usr_NewForceUser().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_NewForceUser()).getValue();
				printStream.println(get_usr_NewForceUser().getLabelText() + ": " + value);
			}
					}

		if (showChilds(listOptions))
		{
			traceChilds(printStream,listOptions,title);
		}
	}
	
	public void traceChilds(java.io.PrintStream printStream, String listOptions, boolean title)
	{
    		        		printStream.println();
        		printStream.println(bundle.getString("ServiceUserSecurityOptionsDataContainer.role.userRights"));
        		List listuserRights = getUserRights();
        		for (int i = 0; i < listuserRights.size(); i++) {
        			BaseDataContainer child = (BaseDataContainer)listuserRights.get(i);
        			printStream.println();
        			printStream.println(bundle.getString("item") + ": " + (i+1) + " " + bundle.getString("of") + " " + listuserRights.size());
        			child.trace(printStream,listOptions,false);
        		}
    			
			
	}
	
}