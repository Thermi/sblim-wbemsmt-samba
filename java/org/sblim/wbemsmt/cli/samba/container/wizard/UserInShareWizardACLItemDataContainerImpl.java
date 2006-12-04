/** 
  * UserInShareWizardACLItemDataContainerImpl.java
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
  * Description: Defines a user-related acl within the share-wizard
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.container.wizard;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
//import org.sblim.wbemsmt.tools.converter.*;
//import org.sblim.wbemsmt.tools.converter.test.*;
//import org.sblim.wbemsmt.tools.input.*;
//import org.sblim.wbemsmt.tools.input.test.*;
import org.sblim.wbemsmt.tools.resources.*;
import org.sblim.wbemsmt.exception.*;

public class UserInShareWizardACLItemDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer {

	protected static WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(new String[]{"messages","messagesSamba"},Locale.getDefault());

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SambaUserName;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_AccessTypeVI;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_AccessTypeRW;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Admin;
    	
		
	public UserInShareWizardACLItemDataContainerImpl(AbstractBaseCimAdapter adapter) throws InitContainerException {
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
				String label = bundle.getString("UserInShareWizardACLItemDataContainer.SambaUserName");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_SambaUserName = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_SambaUserName;
    	}
			/**
		* relates to<br> Linux_SambaReadListForShare<br> Linux_SambaWriteListForShare<br> Linux_SambaInvalidUsersForShare<br> Linux_SambaValidUsersForShare<br> 
		* DataType UNSIGNED_INT16
		* UIType RADIOBUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_AccessTypeVI() {
    		if (ic_usr_AccessTypeVI == null)
    		{
				String label = bundle.getString("UserInShareWizardACLItemDataContainer.accessTypeVI");
				org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
    			ic_usr_AccessTypeVI = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(this,label,"",converter);
    		}
    		return ic_usr_AccessTypeVI;
    	}
			/**
		* relates to<br> Linux_SambaReadListForShare<br> Linux_SambaWriteListForShare<br> Linux_SambaInvalidUsersForShare<br> Linux_SambaValidUsersForShare<br> 
		* DataType UNSIGNED_INT16
		* UIType RADIOBUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_AccessTypeRW() {
    		if (ic_usr_AccessTypeRW == null)
    		{
				String label = bundle.getString("UserInShareWizardACLItemDataContainer.accessTypeRW");
				org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
    			ic_usr_AccessTypeRW = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(this,label,"",converter);
    		}
    		return ic_usr_AccessTypeRW;
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
				String label = bundle.getString("UserInShareWizardACLItemDataContainer.admin");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Admin = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_Admin;
    	}
		
	
		
	public void trace(java.io.PrintStream printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(bundle.getString("UserInShareWizardACLItemDataContainer.caption"));
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
						if (get_usr_AccessTypeVI().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_AccessTypeVI()).getValue();
				printStream.println(get_usr_AccessTypeVI().getLabelText() + ": " + value);
			}
						if (get_usr_AccessTypeRW().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_AccessTypeRW()).getValue();
				printStream.println(get_usr_AccessTypeRW().getLabelText() + ": " + value);
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
	
	public void traceChilds(java.io.PrintStream printStream, String listOptions, boolean title)
	{
    			
			
	}
	
}