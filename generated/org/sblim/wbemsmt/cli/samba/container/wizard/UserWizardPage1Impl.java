/** 
  * UserWizardPage1Impl.java
  * 
  * Â© Copyright IBM Corp.  2009,2006,2007
  *
  * THIS FILE IS PROVIDED UNDER THE TER	MS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/cmd/containerImpl.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.container.wizard;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class UserWizardPage1Impl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SambaUserName;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_SystemUserName;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SambaUserPassword;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SambaUserPassword2;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_IsGuest;
    	
		
	public UserWizardPage1Impl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
		super();
		setAdapter(adapter);
    			adapter.initContainer(this);
	}

			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SambaUserName() {
    		if (ic_SambaUserName == null)
    		{
				String label = getAdapter().getBundle().getString("UserWizardPage1.SambaUserName");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_SambaUserName = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_SambaUserName;
    	}
			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType LIST
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_SystemUserName() {
    		if (ic_SystemUserName == null)
    		{
				String label = getAdapter().getBundle().getString("UserWizardPage1.SystemUserName");
				org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
    			ic_SystemUserName = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(this,label,null,converter);
    		}
    		return ic_SystemUserName;
    	}
			/**
		* 
		* DataType STRING
		* UIType PASSWORD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SambaUserPassword() {
    		if (ic_SambaUserPassword == null)
    		{
				String label = getAdapter().getBundle().getString("UserWizardPage1.SambaUserPassword");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_SambaUserPassword = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_SambaUserPassword;
    	}
			/**
		* 
		* DataType STRING
		* UIType PASSWORD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SambaUserPassword2() {
    		if (ic_SambaUserPassword2 == null)
    		{
				String label = getAdapter().getBundle().getString("UserWizardPage1.SambaUserPassword2");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_SambaUserPassword2 = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_SambaUserPassword2;
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
				String label = getAdapter().getBundle().getString("UserWizardPage1.isGuest");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_IsGuest = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_IsGuest;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("UserWizardPage1.caption"));
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
   			   			   			if (get_SambaUserPassword().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_SambaUserPassword()).getValue();
        				printStream.println(get_SambaUserPassword().getLabelText() + ": " + value);
   			}
   			   			   			if (get_SambaUserPassword2().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_SambaUserPassword2()).getValue();
        				printStream.println(get_SambaUserPassword2().getLabelText() + ": " + value);
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
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    				fields.add(get_SambaUserName());
    				fields.add(get_SystemUserName());
    				fields.add(get_SambaUserPassword());
    				fields.add(get_SambaUserPassword2());
    				fields.add(get_usr_IsGuest());
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       UserWizardPage1Impl source = (UserWizardPage1Impl)sourceContainer;
		    		    
    	    		   get_SambaUserName().copyFrom(source.get_SambaUserName());
		        		   get_SystemUserName().copyFrom(source.get_SystemUserName());
		        		   get_SambaUserPassword().copyFrom(source.get_SambaUserPassword());
		        		   get_SambaUserPassword2().copyFrom(source.get_SambaUserPassword2());
		        		   get_usr_IsGuest().copyFrom(source.get_usr_IsGuest());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}