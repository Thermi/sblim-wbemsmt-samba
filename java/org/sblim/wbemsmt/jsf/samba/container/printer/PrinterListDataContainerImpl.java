/** 
  * PrinterListDataContainerImpl.java
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
  * Description: List with printers
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.printer;

import org.sblim.wbemsmt.exception.*;
import java.util.*;

//imports for that field of a linked container with occurence = MANY
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class PrinterListDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.printer.PrinterListDataContainer {

				
				private java.util.List icPrinters = new java.util.ArrayList();
		
		private MultiLinePanel printersPanel;
		private int printersCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icPrinters_NameHeader;
				private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf icPrinters_usr_SystemPrinterNameHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icPrinters_PathHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icPrinters_CommentHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icPrinters_AvailableHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icPrinters_GuestOKHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icPrinters_GuestOnlyHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icPrinters_HostsAllowHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icPrinters_HostsDenyHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icPrinters_ReadOnlyHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icPrinters_BrowsableHeader;
				
	
		
	
	public PrinterListDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {

			
				super(adapter,bindingPrefix, "PrinterListDataContainer.caption",false);
				
				
		
				
    			
    	    						
		setFooter(getPanelForCustomLayout(),"PrinterListDataContainer.footerText");
		adapter.initContainer(this);
	}
	

		
			
				
		/**
		* 
		* linked container PrinterListItemDataContainer
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
							  "PrinterListItemDataContainer_AsPrinters_InPrinterListDataContainer.caption", //Key for title
							  org.sblim.wbemsmt.jsf.samba.container.share.PrinterListItemDataContainer_AsPrinters_InPrinterListDataContainerImpl.COLS);
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
				return org.sblim.wbemsmt.jsf.samba.container.share.PrinterListItemDataContainer_AsPrinters_InPrinterListDataContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	private void addPrinters(org.sblim.wbemsmt.jsf.samba.container.share.PrinterListItemDataContainer_AsPrinters_InPrinterListDataContainerImpl child) {

		getPrinters().add(child);
		getPrintersPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getPrinters_NameHeader()).getDependentChildFields().add(child.get_Name());
					//((LabeledJSFInputComponent)getPrinters_usr_SystemPrinterNameHeader()).getDependentChildFields().add(child.get_usr_SystemPrinterName());
					//((LabeledJSFInputComponent)getPrinters_PathHeader()).getDependentChildFields().add(child.get_Path());
					//((LabeledJSFInputComponent)getPrinters_CommentHeader()).getDependentChildFields().add(child.get_Comment());
					//((LabeledJSFInputComponent)getPrinters_AvailableHeader()).getDependentChildFields().add(child.get_Available());
					//((LabeledJSFInputComponent)getPrinters_GuestOKHeader()).getDependentChildFields().add(child.get_GuestOK());
					//((LabeledJSFInputComponent)getPrinters_GuestOnlyHeader()).getDependentChildFields().add(child.get_GuestOnly());
					//((LabeledJSFInputComponent)getPrinters_HostsAllowHeader()).getDependentChildFields().add(child.get_HostsAllow());
					//((LabeledJSFInputComponent)getPrinters_HostsDenyHeader()).getDependentChildFields().add(child.get_HostsDeny());
					//((LabeledJSFInputComponent)getPrinters_ReadOnlyHeader()).getDependentChildFields().add(child.get_ReadOnly());
					//((LabeledJSFInputComponent)getPrinters_BrowsableHeader()).getDependentChildFields().add(child.get_Browsable());
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
				org.sblim.wbemsmt.jsf.samba.container.share.PrinterListItemDataContainer_AsPrinters_InPrinterListDataContainerImpl item = new org.sblim.wbemsmt.jsf.samba.container.share.PrinterListItemDataContainer_AsPrinters_InPrinterListDataContainerImpl((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)adapter,bindingPrefix, result.size());
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
							(LabeledJSFInputComponent)getPrinters_NameHeader(),
							(LabeledJSFInputComponent)getPrinters_usr_SystemPrinterNameHeader(),
							(LabeledJSFInputComponent)getPrinters_PathHeader(),
							(LabeledJSFInputComponent)getPrinters_CommentHeader(),
							(LabeledJSFInputComponent)getPrinters_AvailableHeader(),
							(LabeledJSFInputComponent)getPrinters_GuestOKHeader(),
							(LabeledJSFInputComponent)getPrinters_GuestOnlyHeader(),
							(LabeledJSFInputComponent)getPrinters_HostsAllowHeader(),
							(LabeledJSFInputComponent)getPrinters_HostsDenyHeader(),
							(LabeledJSFInputComponent)getPrinters_ReadOnlyHeader(),
							(LabeledJSFInputComponent)getPrinters_BrowsableHeader(),
						};
	}

	private String[] getPrintersFieldNames() {
		return new String[]{
							"_Name",
							"_usr_SystemPrinterName",
							"_Path",
							"_Comment",
							"_Available",
							"_GuestOK",
							"_GuestOnly",
							"_HostsAllow",
							"_HostsDeny",
							"_ReadOnly",
							"_Browsable",
						};
	}

			/**
   		 * Header for field Name
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getPrinters_NameHeader() {
    		if (icPrinters_NameHeader == null)
    		{
				String label = bundle.getString("PrinterListItemDataContainer.Name");
				String binding = bindingPrefix + "printers_NameHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			icPrinters_NameHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icPrinters_NameHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icPrinters_NameHeader).setHeader(true);
			
    		return icPrinters_NameHeader;
    	}
			/**
   		 * Header for field SystemPrinterName
		 */
		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf getPrinters_usr_SystemPrinterNameHeader() {
    		if (icPrinters_usr_SystemPrinterNameHeader == null)
    		{
				String label = bundle.getString("PrinterListItemDataContainer.SystemPrinterName");
				String binding = bindingPrefix + "printers_usr_SystemPrinterNameHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			icPrinters_usr_SystemPrinterNameHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFComboBoxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFComboBoxComponent)icPrinters_usr_SystemPrinterNameHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFComboBoxComponent)icPrinters_usr_SystemPrinterNameHeader).setHeader(true);
			
    		return icPrinters_usr_SystemPrinterNameHeader;
    	}
			/**
   		 * Header for field Path
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getPrinters_PathHeader() {
    		if (icPrinters_PathHeader == null)
    		{
				String label = bundle.getString("PrinterListItemDataContainer.Path");
				String binding = bindingPrefix + "printers_PathHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icPrinters_PathHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icPrinters_PathHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icPrinters_PathHeader).setHeader(true);
			
    		return icPrinters_PathHeader;
    	}
			/**
   		 * Header for field Comment
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getPrinters_CommentHeader() {
    		if (icPrinters_CommentHeader == null)
    		{
				String label = bundle.getString("PrinterListItemDataContainer.Comment");
				String binding = bindingPrefix + "printers_CommentHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icPrinters_CommentHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icPrinters_CommentHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icPrinters_CommentHeader).setHeader(true);
			
    		return icPrinters_CommentHeader;
    	}
			/**
   		 * Header for field Available
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getPrinters_AvailableHeader() {
    		if (icPrinters_AvailableHeader == null)
    		{
				String label = bundle.getString("PrinterListItemDataContainer.Available");
				String binding = bindingPrefix + "printers_AvailableHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icPrinters_AvailableHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icPrinters_AvailableHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icPrinters_AvailableHeader).setHeader(true);
			
    		return icPrinters_AvailableHeader;
    	}
			/**
   		 * Header for field GuestOK
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getPrinters_GuestOKHeader() {
    		if (icPrinters_GuestOKHeader == null)
    		{
				String label = bundle.getString("PrinterListItemDataContainer.GuestOK");
				String binding = bindingPrefix + "printers_GuestOKHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icPrinters_GuestOKHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icPrinters_GuestOKHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icPrinters_GuestOKHeader).setHeader(true);
			
    		return icPrinters_GuestOKHeader;
    	}
			/**
   		 * Header for field GuestOnly
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getPrinters_GuestOnlyHeader() {
    		if (icPrinters_GuestOnlyHeader == null)
    		{
				String label = bundle.getString("PrinterListItemDataContainer.GuestOnly");
				String binding = bindingPrefix + "printers_GuestOnlyHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icPrinters_GuestOnlyHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icPrinters_GuestOnlyHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icPrinters_GuestOnlyHeader).setHeader(true);
			
    		return icPrinters_GuestOnlyHeader;
    	}
			/**
   		 * Header for field HostsAllow
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getPrinters_HostsAllowHeader() {
    		if (icPrinters_HostsAllowHeader == null)
    		{
				String label = bundle.getString("PrinterListItemDataContainer.HostsAllow");
				String binding = bindingPrefix + "printers_HostsAllowHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icPrinters_HostsAllowHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icPrinters_HostsAllowHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icPrinters_HostsAllowHeader).setHeader(true);
			
    		return icPrinters_HostsAllowHeader;
    	}
			/**
   		 * Header for field HostsDeny
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getPrinters_HostsDenyHeader() {
    		if (icPrinters_HostsDenyHeader == null)
    		{
				String label = bundle.getString("PrinterListItemDataContainer.HostsDeny");
				String binding = bindingPrefix + "printers_HostsDenyHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icPrinters_HostsDenyHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icPrinters_HostsDenyHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icPrinters_HostsDenyHeader).setHeader(true);
			
    		return icPrinters_HostsDenyHeader;
    	}
			/**
   		 * Header for field ReadOnly
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getPrinters_ReadOnlyHeader() {
    		if (icPrinters_ReadOnlyHeader == null)
    		{
				String label = bundle.getString("PrinterListItemDataContainer.ReadOnly");
				String binding = bindingPrefix + "printers_ReadOnlyHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icPrinters_ReadOnlyHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icPrinters_ReadOnlyHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icPrinters_ReadOnlyHeader).setHeader(true);
			
    		return icPrinters_ReadOnlyHeader;
    	}
			/**
   		 * Header for field Browsable
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getPrinters_BrowsableHeader() {
    		if (icPrinters_BrowsableHeader == null)
    		{
				String label = bundle.getString("PrinterListItemDataContainer.Browsable");
				String binding = bindingPrefix + "printers_BrowsableHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icPrinters_BrowsableHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icPrinters_BrowsableHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icPrinters_BrowsableHeader).setHeader(true);
			
    		return icPrinters_BrowsableHeader;
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
			int count = adapter.count(org.sblim.wbemsmt.samba.bl.container.printer.PrinterListItemDataContainer.class);
	        if (count != printersCount)
	        {
	           printersCount = count;
	           clearPrinters();
			   for (int i=0; i < count ; i++) {
	    			addPrinters(new org.sblim.wbemsmt.jsf.samba.container.share.PrinterListItemDataContainer_AsPrinters_InPrinterListDataContainerImpl((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)adapter,bindingPrefix, i));
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
		PrinterListDataContainerImpl source = (PrinterListDataContainerImpl)sourceContainer;
	
    			
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