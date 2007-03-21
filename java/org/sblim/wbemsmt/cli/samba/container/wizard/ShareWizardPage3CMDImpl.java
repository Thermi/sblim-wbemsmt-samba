/** 
  * ShareWizardPage3CMDImpl.java
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
  * Description: page 3 of the share wizard for the CLI
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.container.wizard;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;


public class ShareWizardPage3CMDImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3CMD {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_CreateMask;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DirectoryMask;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DirectorySecurityMask;
    	
		
	public ShareWizardPage3CMDImpl(AbstractBaseCimAdapter adapter) throws InitContainerException {
		super();
		setAdapter(adapter);
    			adapter.initContainer(this);
	}

			/**
		* the Default Create Mask
		* DataType UNSIGNED_INT16
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_CreateMask() {
    		if (ic_CreateMask == null)
    		{
				String label = getAdapter().getBundle().getString("ShareWizardPage3CMD.CreateMask");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
    			ic_CreateMask = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_CreateMask;
    	}
			/**
		* The directory Mask
		* DataType UNSIGNED_INT16
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DirectoryMask() {
    		if (ic_DirectoryMask == null)
    		{
				String label = getAdapter().getBundle().getString("ShareWizardPage3CMD.DirectoryMask");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
    			ic_DirectoryMask = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_DirectoryMask;
    	}
			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DirectorySecurityMask() {
    		if (ic_DirectorySecurityMask == null)
    		{
				String label = getAdapter().getBundle().getString("ShareWizardPage3CMD.DirectorySecurityMask");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
    			ic_DirectorySecurityMask = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_DirectorySecurityMask;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("ShareWizardPage3CMD.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
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
    				fields.add(get_CreateMask());
    				fields.add(get_DirectoryMask());
    				fields.add(get_DirectorySecurityMask());
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
		ShareWizardPage3CMDImpl source = (ShareWizardPage3CMDImpl)sourceContainer;
	
    	    		get_CreateMask().setValue(source.get_CreateMask().getValue());
		    		get_DirectoryMask().setValue(source.get_DirectoryMask().getValue());
		    		get_DirectorySecurityMask().setValue(source.get_DirectorySecurityMask().getValue());
				
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}