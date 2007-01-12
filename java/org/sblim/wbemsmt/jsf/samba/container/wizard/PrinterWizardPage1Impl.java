/** 
  * PrinterWizardPage1Impl.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
  * @template: ./tools-dcg/templates/jsf/containerImpl.vm
  *
  * Contributors: 
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.wizard;

import org.sblim.wbemsmt.exception.*;
import java.util.*;



import org.sblim.wbemsmt.bl.adapter.DataContainer;

public class PrinterWizardPage1Impl extends org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel implements org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage1 {

			private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_AllOrOne;
    	
		
			PrinterWizardPage1ImplLayouter layouter = null;
		
		public PrinterWizardPage1ImplLayouter getLayouter()
		{
			return layouter;
		}	
	
	public PrinterWizardPage1Impl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {

				super(adapter,bindingPrefix, "PrinterWizardPage1.caption","PrinterWizardPage1.subTitle");
				
				
    			
    				layouter = new PrinterWizardPage1ImplLayouter();//.layout(getPanelForCustomLayout(),this,bundle);
				
		setFooter(getInputFieldContainer(),"PrinterWizardPage1.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType RADIOBUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_AllOrOne() {
    		if (ic_usr_AllOrOne == null)
    		{
				String label = bundle.getString("PrinterWizardPage1.allOrOne");
				String binding = bindingPrefix + "_usr_AllOrOne.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_usr_AllOrOne = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(parent,label,binding,converter, readOnly);
				;
    		}
    		return ic_usr_AllOrOne;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_AllOrOne != null)
    		{
				ic_usr_AllOrOne.setLabelText(bundle.getString("PrinterWizardPage1.allOrOne"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesSamba"};
	}

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List getFields()
	{
		List fields = new ArrayList();
    				fields.add(get_usr_AllOrOne());
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
		PrinterWizardPage1Impl source = (PrinterWizardPage1Impl)sourceContainer;
	
    	    		get_usr_AllOrOne().setValue(source.get_usr_AllOrOne().getValue());
				
    	    	
	}

	
}