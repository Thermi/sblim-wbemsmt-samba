/** 
  * ServiceOperationsDataContainerImpl.java
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
  * Description: Container for Operations on the Service Object
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.container.service;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;


public class ServiceOperationsDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.service.ServiceOperationsDataContainer {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Started;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_invoke_StartService;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_invoke_StopService;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_RestartService;
    	
		
	public ServiceOperationsDataContainerImpl(AbstractBaseCimAdapter adapter) throws InitContainerException {
		super();
		setAdapter(adapter);
    			adapter.initContainer(this);
	}

			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Started() {
    		if (ic_Started == null)
    		{
				String label = getAdapter().getBundle().getString("ServiceOperationsDataContainer.Started");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_Started = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_Started;
    	}
			/**
		* 
		* DataType ACTION
		* UIType BUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_invoke_StartService() {
    		if (ic_invoke_StartService == null)
    		{
				String label = getAdapter().getBundle().getString("ServiceOperationsDataContainer.startService");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_invoke_StartService = new org.sblim.wbemsmt.tools.input.test.LabeledTestActionComponent(this,label,"",converter);
    		}
    		return ic_invoke_StartService;
    	}
			/**
		* 
		* DataType ACTION
		* UIType BUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_invoke_StopService() {
    		if (ic_invoke_StopService == null)
    		{
				String label = getAdapter().getBundle().getString("ServiceOperationsDataContainer.stopService");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_invoke_StopService = new org.sblim.wbemsmt.tools.input.test.LabeledTestActionComponent(this,label,"",converter);
    		}
    		return ic_invoke_StopService;
    	}
			/**
		* 
		* DataType ACTION
		* UIType BUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_RestartService() {
    		if (ic_usr_RestartService == null)
    		{
				String label = getAdapter().getBundle().getString("ServiceOperationsDataContainer.restartService");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_RestartService = new org.sblim.wbemsmt.tools.input.test.LabeledTestActionComponent(this,label,"",converter);
    		}
    		return ic_usr_RestartService;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("ServiceOperationsDataContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_Started().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_Started()).getValue();
        				printStream.println(get_Started().getLabelText() + ": " + value);
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
    				fields.add(get_Started());
    				fields.add(get_invoke_StartService());
    				fields.add(get_invoke_StopService());
    				fields.add(get_usr_RestartService());
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
		ServiceOperationsDataContainerImpl source = (ServiceOperationsDataContainerImpl)sourceContainer;
	
    	    		get_Started().setValue(source.get_Started().getValue());
		    		get_invoke_StartService().setValue(source.get_invoke_StartService().getValue());
		    		get_invoke_StopService().setValue(source.get_invoke_StopService().getValue());
		    		get_usr_RestartService().setValue(source.get_usr_RestartService().getValue());
				
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}