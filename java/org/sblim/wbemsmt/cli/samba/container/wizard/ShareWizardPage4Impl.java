/** 
  * ShareWizardPage4Impl.java
  *

 
 * � Copyright IBM Corp. 2005
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


public class ShareWizardPage4Impl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4 {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Name;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Path;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Comment;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_SeenByEverybody;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_EnableGuest;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_CreateMask;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DirectoryMask;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DirectorySecurityMask;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_ForceUser;
    			private java.util.List icUsers = new java.util.ArrayList();
	
		
	public ShareWizardPage4Impl(AbstractBaseCimAdapter adapter) throws InitContainerException {
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Name() {
    		if (ic_Name == null)
    		{
				String label = getAdapter().getBundle().getString("ShareWizardPage4.Name");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_Name = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_Name;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Path() {
    		if (ic_Path == null)
    		{
				String label = getAdapter().getBundle().getString("ShareWizardPage4.Path");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_Path = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_Path;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Comment() {
    		if (ic_Comment == null)
    		{
				String label = getAdapter().getBundle().getString("ShareWizardPage4.Comment");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_Comment = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_Comment;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_SeenByEverybody() {
    		if (ic_usr_SeenByEverybody == null)
    		{
				String label = getAdapter().getBundle().getString("ShareWizardPage4.seenByEverybody");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_SeenByEverybody = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_SeenByEverybody;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_EnableGuest() {
    		if (ic_usr_EnableGuest == null)
    		{
				String label = getAdapter().getBundle().getString("ShareWizardPage4.enableGuest");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_EnableGuest = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_EnableGuest;
    	}
			/**
		* the Default Create Mask
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_CreateMask() {
    		if (ic_CreateMask == null)
    		{
				String label = getAdapter().getBundle().getString("ShareWizardPage4.CreateMask");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_CreateMask = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_CreateMask;
    	}
			/**
		* The directory Mask
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DirectoryMask() {
    		if (ic_DirectoryMask == null)
    		{
				String label = getAdapter().getBundle().getString("ShareWizardPage4.DirectoryMask");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_DirectoryMask = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_DirectoryMask;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DirectorySecurityMask() {
    		if (ic_DirectorySecurityMask == null)
    		{
				String label = getAdapter().getBundle().getString("ShareWizardPage4.DirectorySecurityMask");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_DirectorySecurityMask = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_DirectorySecurityMask;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_ForceUser() {
    		if (ic_usr_ForceUser == null)
    		{
				String label = getAdapter().getBundle().getString("ShareWizardPage4.forceUser");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_ForceUser = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_ForceUser;
    	}
		
			
		/**
		* 
		* linked container UserInShareWizardACLItemDataContainer
		*/
		public java.util.List getUsers()
		{
			return icUsers;
		}

	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("ShareWizardPage4.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
						if (get_Name().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_Name()).getValue();
				printStream.println(get_Name().getLabelText() + ": " + value);
			}
						if (get_Path().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_Path()).getValue();
				printStream.println(get_Path().getLabelText() + ": " + value);
			}
						if (get_Comment().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_Comment()).getValue();
				printStream.println(get_Comment().getLabelText() + ": " + value);
			}
						if (get_usr_SeenByEverybody().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_SeenByEverybody()).getValue();
				printStream.println(get_usr_SeenByEverybody().getLabelText() + ": " + value);
			}
						if (get_usr_EnableGuest().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_EnableGuest()).getValue();
				printStream.println(get_usr_EnableGuest().getLabelText() + ": " + value);
			}
						if (get_CreateMask().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_CreateMask()).getValue();
				printStream.println(get_CreateMask().getLabelText() + ": " + value);
			}
						if (get_DirectoryMask().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_DirectoryMask()).getValue();
				printStream.println(get_DirectoryMask().getLabelText() + ": " + value);
			}
						if (get_DirectorySecurityMask().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_DirectorySecurityMask()).getValue();
				printStream.println(get_DirectorySecurityMask().getLabelText() + ": " + value);
			}
						if (get_usr_ForceUser().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_ForceUser()).getValue();
				printStream.println(get_usr_ForceUser().getLabelText() + ": " + value);
			}
					}

		if (showChilds(listOptions))
		{
			traceChilds(printStream,listOptions,title);
		}
	}
	
	public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title)
	{
    		        		printStream.println();
        		printStream.println(getAdapter().getBundle().getString("ShareWizardPage4.role.users"));
        		List listusers = getUsers();
        		for (int i = 0; i < listusers.size(); i++) {
        			BaseDataContainer child = (BaseDataContainer)listusers.get(i);
        			printStream.println();
        			printStream.println(getAdapter().getBundle().getString("item") + ": " + (i+1) + " " + getAdapter().getBundle().getString("of") + " " + listusers.size());
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
    				fields.add(get_Name());
    				fields.add(get_Path());
    				fields.add(get_Comment());
    				fields.add(get_usr_SeenByEverybody());
    				fields.add(get_usr_EnableGuest());
    				fields.add(get_CreateMask());
    				fields.add(get_DirectoryMask());
    				fields.add(get_DirectorySecurityMask());
    				fields.add(get_usr_ForceUser());
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List getChildContainers()
	{
		List childs = new ArrayList();
    	    		childs.addAll(getUsers());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer)
	{
		ShareWizardPage4Impl source = (ShareWizardPage4Impl)sourceContainer;
	
    	    		get_Name().setValue(source.get_Name().getValue());
		    		get_Path().setValue(source.get_Path().getValue());
		    		get_Comment().setValue(source.get_Comment().getValue());
		    		get_usr_SeenByEverybody().setValue(source.get_usr_SeenByEverybody().getValue());
		    		get_usr_EnableGuest().setValue(source.get_usr_EnableGuest().getValue());
		    		get_CreateMask().setValue(source.get_CreateMask().getValue());
		    		get_DirectoryMask().setValue(source.get_DirectoryMask().getValue());
		    		get_DirectorySecurityMask().setValue(source.get_DirectorySecurityMask().getValue());
		    		get_usr_ForceUser().setValue(source.get_usr_ForceUser().getValue());
				
    	    		List targetListForUsers = (List) getUsers();
    		List sourceListForUsers = (List) source.getUsers();
    		if (sourceListForUsers.size() != targetListForUsers.size())
    		{
    			throw new IllegalArgumentException("The Lists are not from same size. Source is " + sourceListForUsers.size() + " and target is " + targetListForUsers.size() );
    		}
			for (int ii=0; ii < sourceListForUsers.size(); ii++)
			{
				((DataContainer) targetListForUsers.get(ii)).copyFrom(((DataContainer) sourceListForUsers.get(ii)));
			}
			
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}