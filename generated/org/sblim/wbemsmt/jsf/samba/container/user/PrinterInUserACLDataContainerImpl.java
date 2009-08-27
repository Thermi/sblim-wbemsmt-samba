/** 
  * PrinterInUserACLDataContainerImpl.java
  *
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
  * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/jsf/containerImpl.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: Container for the printer-related acl within a user
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.user;

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;

public class PrinterInUserACLDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.user.PrinterInUserACLDataContainer
			, org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainerHeader		
	{
				
				private java.util.List<PrinterACLItemDataContainer> icPrinters = new java.util.ArrayList<PrinterACLItemDataContainer>();
		
		private MultiLinePanel printersPanel;
		private int printersCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_PrinterName;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_usr_AccessTypeVI;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_usr_AccessTypeRW;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_usr_Admin;
				
	
		
	
	public PrinterInUserACLDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "PrinterInUserACLDataContainer.caption",false);
				
				
		
				
    			
    	    						
		setFooter(getPanelForCustomLayout(),"PrinterInUserACLDataContainer.footerText");
		adapter.initContainer(this);
	}
	

		
			
				
		/**
		* 
		* linked container PrinterACLItemDataContainer
		*/
				public java.util.List<PrinterACLItemDataContainer> getPrinters()
				{
						return icPrinters;
		}
		
		public MultiLinePanel getPrintersPanel()
		{
			if (printersPanel == null)
			{
  			   printersPanel = new PrintersPanel(adapter,expressionPrefix, // the prefix for binding values
							  "#{" +  expressionPrefix + "printersPanel", // binding for Title
							  "PrinterACLItemDataContainer_AsPrinters_InPrinterInUserACLDataContainer.caption", //Key for title
							  org.sblim.wbemsmt.jsf.samba.container.share.PrinterACLItemDataContainer_AsPrinters_InPrinterInUserACLDataContainerImpl.COLS);
			  addPrintersHeader();							  
			}		
			
			return printersPanel;
		}

		static class PrintersPanel extends MultiLinePanel
		{
			public PrintersPanel(AbstractBaseCimAdapter adapter, String expressionPrefix, String bindigForTitle, String keyForTitle, int cols) {
				super(adapter, expressionPrefix, bindigForTitle, keyForTitle, "printers", cols);
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
	public java.util.List<PrinterACLItemDataContainer> getPrintersForUI()
	{
				
		List<PrinterACLItemDataContainer> result = new ArrayList<PrinterACLItemDataContainer>();
		result.addAll(icPrinters);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.jsf.samba.container.share.PrinterACLItemDataContainer_AsPrinters_InPrinterInUserACLDataContainerImpl item = new org.sblim.wbemsmt.jsf.samba.container.share.PrinterACLItemDataContainer_AsPrinters_InPrinterInUserACLDataContainerImpl((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)adapter,expressionPrefix, result.size());
				DataContainerUtil.setVisibilityOfFields(item,false);
				result.add(item);
			} catch (WbemsmtException e) {
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
				String binding = expressionPrefix + "printersHeader_PrinterName.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			icPrintersHeader_PrinterName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icPrintersHeader_PrinterName).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
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
				String binding = expressionPrefix + "printersHeader_usr_AccessTypeVI.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			icPrintersHeader_usr_AccessTypeVI = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)icPrintersHeader_usr_AccessTypeVI).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
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
				String binding = expressionPrefix + "printersHeader_usr_AccessTypeRW.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			icPrintersHeader_usr_AccessTypeRW = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)icPrintersHeader_usr_AccessTypeRW).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
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
				String binding = expressionPrefix + "printersHeader_usr_Admin.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icPrintersHeader_usr_Admin = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icPrintersHeader_usr_Admin).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
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

	public void countAndCreateChildren() throws WbemsmtException {
	
    			try
		{
			int count = adapter.count("printers",org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer.class, this);
	        if (count != printersCount)
	        {
	           printersCount = count;
	           clearPrinters();
			   for (int i=0; i < count ; i++) {
	    			addPrinters(new org.sblim.wbemsmt.jsf.samba.container.share.PrinterACLItemDataContainer_AsPrinters_InPrinterInUserACLDataContainerImpl((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)adapter,expressionPrefix, i));
			   }
	        }
			getPrintersPanel().setList(getPrinters());				   
		} catch (WbemsmtException e) {
			throw new WbemsmtException(WbemsmtException.ERR_INIT_CONTAINER,e);
		}
    		}


	/**
	 * count and create childrens
	 * @throws WbemsmtException
	 */
	public void updateControls() throws WbemsmtException {
			   countAndCreateChildren();
			   adapter.updateControls(this);
		
			   				      getPrintersPanel().updateRows();				
			   		}

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    		childs.addAll(getPrinters());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       PrinterInUserACLDataContainerImpl source = (PrinterInUserACLDataContainerImpl)sourceContainer;
		    		    
    			
    	    		   List<PrinterACLItemDataContainer> targetListForPrinters = getPrinters();
    		   List<PrinterACLItemDataContainer> sourceListForPrinters = source.getPrinters();
    		   if (sourceListForPrinters.size() != targetListForPrinters.size())
    		   {
    			      throw new WbemsmtException(WbemsmtException.ERR_FAILED,"The Lists are not from same size. Source is " + sourceListForPrinters.size() + " and target is " + targetListForPrinters.size() );
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