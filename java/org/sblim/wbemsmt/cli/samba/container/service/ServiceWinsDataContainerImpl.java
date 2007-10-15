/** 
  * ServiceWinsDataContainerImpl.java
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
  * Description: Container for WINS Options
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.container.service;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class ServiceWinsDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.service.ServiceWinsDataContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DNS_Proxy;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_WINSHook;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_WINSProxy;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_WINSServer;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_WINSSupport;
    	
		
	public ServiceWinsDataContainerImpl(AbstractBaseCimAdapter adapter) throws InitContainerException {
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DNS_Proxy() {
    		if (ic_DNS_Proxy == null)
    		{
				String label = getAdapter().getBundle().getString("ServiceWinsDataContainer.DNS_Proxy");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_DNS_Proxy = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_DNS_Proxy;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_WINSHook() {
    		if (ic_WINSHook == null)
    		{
				String label = getAdapter().getBundle().getString("ServiceWinsDataContainer.WINSHook");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_WINSHook = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_WINSHook;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_WINSProxy() {
    		if (ic_WINSProxy == null)
    		{
				String label = getAdapter().getBundle().getString("ServiceWinsDataContainer.WINSProxy");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_WINSProxy = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_WINSProxy;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_WINSServer() {
    		if (ic_WINSServer == null)
    		{
				String label = getAdapter().getBundle().getString("ServiceWinsDataContainer.WINSServer");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_WINSServer = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_WINSServer;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_WINSSupport() {
    		if (ic_WINSSupport == null)
    		{
				String label = getAdapter().getBundle().getString("ServiceWinsDataContainer.WINSSupport");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_WINSSupport = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_WINSSupport;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("ServiceWinsDataContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_DNS_Proxy().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_DNS_Proxy()).getValue();
        				printStream.println(get_DNS_Proxy().getLabelText() + ": " + value);
   			}
   			   			   			if (get_WINSHook().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_WINSHook()).getValue();
        				printStream.println(get_WINSHook().getLabelText() + ": " + value);
   			}
   			   			   			if (get_WINSProxy().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_WINSProxy()).getValue();
        				printStream.println(get_WINSProxy().getLabelText() + ": " + value);
   			}
   			   			   			if (get_WINSServer().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_WINSServer()).getValue();
        				printStream.println(get_WINSServer().getLabelText() + ": " + value);
   			}
   			   			   			if (get_WINSSupport().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_WINSSupport()).getValue();
        				printStream.println(get_WINSSupport().getLabelText() + ": " + value);
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
    				fields.add(get_DNS_Proxy());
    				fields.add(get_WINSHook());
    				fields.add(get_WINSProxy());
    				fields.add(get_WINSServer());
    				fields.add(get_WINSSupport());
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
		ServiceWinsDataContainerImpl source = (ServiceWinsDataContainerImpl)sourceContainer;
	
    	    		get_DNS_Proxy().setValue(source.get_DNS_Proxy().getValue());
		    		get_WINSHook().setValue(source.get_WINSHook().getValue());
		    		get_WINSProxy().setValue(source.get_WINSProxy().getValue());
		    		get_WINSServer().setValue(source.get_WINSServer().getValue());
		    		get_WINSSupport().setValue(source.get_WINSSupport().getValue());
				
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}