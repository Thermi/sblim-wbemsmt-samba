/** 
  * PrinterInUserACLDataContainerImpl.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/jsf/containerImpl.vm
  *
  * Contributors: 
  * 
  * Description: Container for the printer-related acl within a user
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.user;

import org.sblim.wbemsmt.exception.*;
import java.util.*;

//imports for that field of a linked container with occurence = MANY
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class PrinterInUserACLDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.user.PrinterInUserACLDataContainer
			, org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainerHeader		
	{
				
				private java.util.List icPrinters = new java.util.ArrayList();
		
		private MultiLinePanel printersPanel;
		private int printersCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_PrinterName;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_usr_AccessTypeVI;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_usr_AccessTypeRW;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_usr_Admin;
				
	
		
	
	public PrinterInUserACLDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {

			
				super(adapter,bindingPrefix, "PrinterInUserACLDataContainer.caption",false);
				
				
		
				
    			
    	    						
		setFooter(getPanelForCustomLayout(),"PrinterInUserACLDataContainer.footerText");
		adapter.initContainer(this);
	}
	

		
			
				
		/**
		* 
		* linked container PrinterACLItemDataContainer
		*/
		public java.util.List getPrinters()
		{
						return icPrinters;
		}
		
		public MultiLinePanel getPrintersPanel()
		{
			if (printersPanel == null)
			{
  			   printersPanel = new PrintersPanel(adapter,bindingPrefix, // the prefix for binding values
							  "#{" +  bindingPrefix + "printersPanel", // binding for Title
							  "PrinterACLItemDataContainer_AsPrinters_InPrinterInUserACLDataContainer.caption", //Key for title
							  org.sblim.wbemsmt.jsf.samba.container.share.PrinterACLItemDataContainer_AsPrinters_InPrinterInUserACLDataContainerImpl.COLS);
			  addPrintersHeader();							  
			}		
			
			return printersPanel;
		}

		static class PrintersPanel extends MultiLinePanel
		{
			public PrintersPanel(AbstractBaseCimAdapter adapter, String bindingPrefix, String bindigForTitle, String keyForTitle, int cols) {
				super(adapter, bindingPrefix, bindigForTitle, keyForTitle, "printers", cols);
			}
	
			protected String getOrientationOfColumnAsCss(int column) {
				return org.sblim.wbemsmt.jsf.samba.container.share.PrinterACLItemDataContainer_AsPrinters_InPrinterInUserACLDataContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	private void addPrinters(org.sblim.wbemsmt.jsf.samba.container.share.PrinterACLItemDataContainer_AsPrinters_InPrinterInUserACLDataContainerImpl child) {

		getPrinters().add(child);
		getPrintersPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getPrinters_PrinterNameHeader()).getDependentChildFields().add(child.get_PrinterName());
					//((LabeledJSFInputComponent)getPrinters_usr_AccessTypeVIHeader()).getDependentChildFields().add(child.get_usr_AccessTypeVI());
					//((LabeledJSFInputComponent)getPrinters_usr_AccessTypeRWHeader()).getDependentChildFields().add(child.get_usr_AccessTypeRW());
					//((LabeledJSFInputComponent)getPrinters_usr_AdminHeader()).getDependentChildFields().add(child.get_usr_Admin());
			}
	
	private void clearPrinters() {
		getPrinters().clear();
	}

	/**
	* 
	* Get the Printers for the UI repesentation
	*/
	public java.util.List getPrintersForUI()
	{
				
		List result = new ArrayList();
		result.addAll(icPrinters);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.jsf.samba.container.share.PrinterACLItemDataContainer_AsPrinters_InPrinterInUserACLDataContainerImpl item = new org.sblim.wbemsmt.jsf.samba.container.share.PrinterACLItemDataContainer_AsPrinters_InPrinterInUserACLDataContainerImpl((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)adapter,bindingPrefix, result.size());
				DataContainerUtil.setVisibilityOfFields(item,false);
				result.add(item);
			} catch (InitContainerException e) {
				e.printStackTrace();
			}
		}
		
		printersPanel.setList(result);
		
		return result;
	}		
		
		
	/**
	 * manages the style for whole footer which is displayed if there are no entries in the table or if there is a custom panel in it
	 * @return
	 */
	public String getPrintersFooterClass()
	{
		return "multiLineRowHeader center "  
		+ (icPrinters.size() == 0 || getPrintersPanel().isHavingCustomFooter() ?  "visible " : "hidden ");
	}
	
	/**
	 * manages the style for the label which is displayed if there are no entries in the table
	 * @return
	 */
	public String getPrintersAvailableFooterClass()
	{
		return icPrinters.size() > 0 ? " hidden " : " visible ";
	}
	
	private void addPrintersHeader() {
		getPrintersPanel().setHeader(getPrintersHeaderComponents(),getPrintersFieldNames());
	}
	
	private LabeledJSFInputComponent[] getPrintersHeaderComponents() {
		return new LabeledJSFInputComponent[]{
							(LabeledJSFInputComponent)getPrintersHeader_PrinterName(),
							(LabeledJSFInputComponent)getPrintersHeader_usr_AccessTypeVI(),
							(LabeledJSFInputComponent)getPrintersHeader_usr_AccessTypeRW(),
							(LabeledJSFInputComponent)getPrintersHeader_usr_Admin(),
						};
	}

	private String[] getPrintersFieldNames() {
		return new String[]{
							"_PrinterName",
							"_usr_AccessTypeVI",
							"_usr_AccessTypeRW",
							"_usr_Admin",
						};
	}

	   /**
		* Header for:
		* 
		* linked container PrinterACLItemDataContainer
		*/
		public org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainerHeader getPrintersHeader()
		{
			return this;
		}
		
				/**
   		 * Header for field PrinterName
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_PrinterName() {
    		if (icPrintersHeader_PrinterName == null)
    		{
				String label = bundle.getString("PrinterACLItemDataContainer.PrinterName");
				String binding = bindingPrefix + "printersHeader_PrinterName.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			icPrintersHeader_PrinterName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icPrintersHeader_PrinterName).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icPrintersHeader_PrinterName).setHeader(true);
			
    		return icPrintersHeader_PrinterName;
    	}
				/**
   		 * Header for field accessTypeVI
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_usr_AccessTypeVI() {
    		if (icPrintersHeader_usr_AccessTypeVI == null)
    		{
				String label = bundle.getString("PrinterACLItemDataContainer.accessTypeVI");
				String binding = bindingPrefix + "printersHeader_usr_AccessTypeVI.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			icPrintersHeader_usr_AccessTypeVI = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)icPrintersHeader_usr_AccessTypeVI).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)icPrintersHeader_usr_AccessTypeVI).setHeader(true);
			
    		return icPrintersHeader_usr_AccessTypeVI;
    	}
				/**
   		 * Header for field accessTypeRW
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_usr_AccessTypeRW() {
    		if (icPrintersHeader_usr_AccessTypeRW == null)
    		{
				String label = bundle.getString("PrinterACLItemDataContainer.accessTypeRW");
				String binding = bindingPrefix + "printersHeader_usr_AccessTypeRW.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			icPrintersHeader_usr_AccessTypeRW = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)icPrintersHeader_usr_AccessTypeRW).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)icPrintersHeader_usr_AccessTypeRW).setHeader(true);
			
    		return icPrintersHeader_usr_AccessTypeRW;
    	}
				/**
   		 * Header for field admin
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_usr_Admin() {
    		if (icPrintersHeader_usr_Admin == null)
    		{
				String label = bundle.getString("PrinterACLItemDataContainer.admin");
				String binding = bindingPrefix + "printersHeader_usr_Admin.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icPrintersHeader_usr_Admin = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icPrintersHeader_usr_Admin).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icPrintersHeader_usr_Admin).setHeader(true);
			
    		return icPrintersHeader_usr_Admin;
    	}
		
	
		
	public void reload()
	{
		super.reload();
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesSamba"};
	}

	public void countAndCreateChildren() throws InitContainerException {
	
    			try
		{
			int count = adapter.count(org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer.class);
	        if (count != printersCount)
	        {
	           printersCount = count;
	           clearPrinters();
			   for (int i=0; i < count ; i++) {
	    			addPrinters(new org.sblim.wbemsmt.jsf.samba.container.share.PrinterACLItemDataContainer_AsPrinters_InPrinterInUserACLDataContainerImpl((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)adapter,bindingPrefix, i));
			   }
	        }
			getPrintersPanel().setList(getPrinters());				   
		} catch (WbemSmtException e) {
			throw new InitContainerException(e);
		}
    		}


	/**
	 * count and create childrens
	 * @throws UpdateControlsException
	 */
	public void updateControls() throws UpdateControlsException {
		try {
			countAndCreateChildren();
			adapter.updateControls(this);
		
							getPrintersPanel().updateRows();				
					} catch (InitContainerException e) {
			throw new UpdateControlsException(e);
		}
	}

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List getFields()
	{
		List fields = new ArrayList();
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List getChildContainers()
	{
		List childs = new ArrayList();
    	    		childs.addAll(getPrinters());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer)
	{
		PrinterInUserACLDataContainerImpl source = (PrinterInUserACLDataContainerImpl)sourceContainer;
	
    			
    	    		List targetListForPrinters = (List) getPrinters();
    		List sourceListForPrinters = (List) source.getPrinters();
    		if (sourceListForPrinters.size() != targetListForPrinters.size())
    		{
    			throw new IllegalArgumentException("The Lists are not from same size. Source is " + sourceListForPrinters.size() + " and target is " + targetListForPrinters.size() );
    		}
			for (int ii=0; ii < sourceListForPrinters.size(); ii++)
			{
				((DataContainer) targetListForPrinters.get(ii)).copyFrom(((DataContainer) sourceListForPrinters.get(ii)));
			}
			
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}