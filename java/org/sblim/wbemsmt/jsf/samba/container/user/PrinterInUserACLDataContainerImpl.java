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

public class PrinterInUserACLDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.user.PrinterInUserACLDataContainer {

				
				private java.util.List icPrinters = new java.util.ArrayList();
		
		private MultiLinePanel printersPanel;
		private int printersCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icPrinters_PrinterNameHeader;
				private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf icPrinters_usr_AccessTypeVIHeader;
				private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf icPrinters_usr_AccessTypeRWHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icPrinters_usr_AdminHeader;
				
	
		
	
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
							(LabeledJSFInputComponent)getPrinters_PrinterNameHeader(),
							(LabeledJSFInputComponent)getPrinters_usr_AccessTypeVIHeader(),
							(LabeledJSFInputComponent)getPrinters_usr_AccessTypeRWHeader(),
							(LabeledJSFInputComponent)getPrinters_usr_AdminHeader(),
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
   		 * Header for field PrinterName
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getPrinters_PrinterNameHeader() {
    		if (icPrinters_PrinterNameHeader == null)
    		{
				String label = bundle.getString("PrinterACLItemDataContainer.PrinterName");
				String binding = bindingPrefix + "printers_PrinterNameHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			icPrinters_PrinterNameHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icPrinters_PrinterNameHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icPrinters_PrinterNameHeader).setHeader(true);
			
    		return icPrinters_PrinterNameHeader;
    	}
			/**
   		 * Header for field accessTypeVI
		 */
		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf getPrinters_usr_AccessTypeVIHeader() {
    		if (icPrinters_usr_AccessTypeVIHeader == null)
    		{
				String label = bundle.getString("PrinterACLItemDataContainer.accessTypeVI");
				String binding = bindingPrefix + "printers_usr_AccessTypeVIHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			icPrinters_usr_AccessTypeVIHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)icPrinters_usr_AccessTypeVIHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)icPrinters_usr_AccessTypeVIHeader).setHeader(true);
			
    		return icPrinters_usr_AccessTypeVIHeader;
    	}
			/**
   		 * Header for field accessTypeRW
		 */
		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf getPrinters_usr_AccessTypeRWHeader() {
    		if (icPrinters_usr_AccessTypeRWHeader == null)
    		{
				String label = bundle.getString("PrinterACLItemDataContainer.accessTypeRW");
				String binding = bindingPrefix + "printers_usr_AccessTypeRWHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			icPrinters_usr_AccessTypeRWHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)icPrinters_usr_AccessTypeRWHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)icPrinters_usr_AccessTypeRWHeader).setHeader(true);
			
    		return icPrinters_usr_AccessTypeRWHeader;
    	}
			/**
   		 * Header for field admin
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getPrinters_usr_AdminHeader() {
    		if (icPrinters_usr_AdminHeader == null)
    		{
				String label = bundle.getString("PrinterACLItemDataContainer.admin");
				String binding = bindingPrefix + "printers_usr_AdminHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icPrinters_usr_AdminHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icPrinters_usr_AdminHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icPrinters_usr_AdminHeader).setHeader(true);
			
    		return icPrinters_usr_AdminHeader;
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