/** 
  * UserWizardPage2Impl.java
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
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.wizard;

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainer;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;

public class UserWizardPage2Impl extends org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel implements org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2
			, org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainerHeader		
			, org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainerHeader		
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_AccessToAll;

    			
				private java.util.List<ShareInUserWizardACLItemDataContainer> icShares = new java.util.ArrayList<ShareInUserWizardACLItemDataContainer>();
		
		private MultiLinePanel sharesPanel;
		private int sharesCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_ShareName;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_usr_AccessTypeVI;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_usr_AccessTypeRW;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icSharesHeader_usr_Admin;
				
			
				private java.util.List<PrinterInUserWizardACLItemDataContainer> icPrinters = new java.util.ArrayList<PrinterInUserWizardACLItemDataContainer>();
		
		private MultiLinePanel printersPanel;
		private int printersCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_PrinterName;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_usr_AccessTypeVI;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_usr_AccessTypeRW;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icPrintersHeader_usr_Admin;
				
	
		
	
	public UserWizardPage2Impl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "UserWizardPage2.caption","UserWizardPage2.subTitle",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_AccessToAll());
        					
		setFooter(getPanelForCustomLayout(),"UserWizardPage2.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX_WITH_CLICKEVENT
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_AccessToAll() {
    		if (ic_usr_AccessToAll == null)
    		{
				String label = bundle.getString("UserWizardPage2.accessToAll");
				String binding = expressionPrefix + "_usr_AccessToAll.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_AccessToAll = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxActionComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_AccessToAll;
    	}
		
			
				
		/**
		* 
		* linked container ShareInUserWizardACLItemDataContainer
		*/
				public java.util.List<ShareInUserWizardACLItemDataContainer> getShares()
				{
						return icShares;
		}
		
		public MultiLinePanel getSharesPanel()
		{
			if (sharesPanel == null)
			{
  			   sharesPanel = new SharesPanel(adapter,expressionPrefix, // the prefix for binding values
							  "#{" +  expressionPrefix + "sharesPanel", // binding for Title
							  "ShareInUserWizardACLItemDataContainer_AsShares_InUserWizardPage2.caption", //Key for title
							  org.sblim.wbemsmt.jsf.samba.container.wizard.ShareInUserWizardACLItemDataContainer_AsShares_InUserWizardPage2Impl.COLS);
			  addSharesHeader();							  
			}		
			
			return sharesPanel;
		}

		static class SharesPanel extends MultiLinePanel
		{
			public SharesPanel(AbstractBaseCimAdapter adapter, String expressionPrefix, String bindigForTitle, String keyForTitle, int cols) {
				super(adapter, expressionPrefix, bindigForTitle, keyForTitle, "shares", cols);
			}
	
			protected String getOrientationOfColumnAsCss(int column) {
				return org.sblim.wbemsmt.jsf.samba.container.wizard.ShareInUserWizardACLItemDataContainer_AsShares_InUserWizardPage2Impl.orientationOfColumnAsCss[column];
			}
		}

	private void addShares(org.sblim.wbemsmt.jsf.samba.container.wizard.ShareInUserWizardACLItemDataContainer_AsShares_InUserWizardPage2Impl child) {

		getShares().add(child);
		getSharesPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getShares_ShareNameHeader()).getDependentChildFields().add(child.get_ShareName());
					//((LabeledJSFInputComponent)getShares_usr_AccessTypeVIHeader()).getDependentChildFields().add(child.get_usr_AccessTypeVI());
					//((LabeledJSFInputComponent)getShares_usr_AccessTypeRWHeader()).getDependentChildFields().add(child.get_usr_AccessTypeRW());
					//((LabeledJSFInputComponent)getShares_usr_AdminHeader()).getDependentChildFields().add(child.get_usr_Admin());
			}
	
	private void clearShares() {
		getShares().clear();
	}

	/**
	* 
	* Get the Shares for the UI repesentation
	*/
	public java.util.List<ShareInUserWizardACLItemDataContainer> getSharesForUI()
	{
				
		List<ShareInUserWizardACLItemDataContainer> result = new ArrayList<ShareInUserWizardACLItemDataContainer>();
		result.addAll(icShares);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.jsf.samba.container.wizard.ShareInUserWizardACLItemDataContainer_AsShares_InUserWizardPage2Impl item = new org.sblim.wbemsmt.jsf.samba.container.wizard.ShareInUserWizardACLItemDataContainer_AsShares_InUserWizardPage2Impl((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)adapter,expressionPrefix, result.size());
				DataContainerUtil.setVisibilityOfFields(item,false);
				result.add(item);
			} catch (WbemsmtException e) {
				e.printStackTrace();
			}
		}
		
		sharesPanel.setList(result);
		
		return result;
	}		
		
		
	/**
	 * manages the style for whole footer which is displayed if there are no entries in the table or if there is a custom panel in it
	 * @return
	 */
	public String getSharesFooterClass()
	{
		return "multiLineRowHeader center "  
		+ (icShares.size() == 0 || getSharesPanel().isHavingCustomFooter() ?  "visible " : "hidden ");
	}
	
	/**
	 * manages the style for the label which is displayed if there are no entries in the table
	 * @return
	 */
	public String getSharesAvailableFooterClass()
	{
		return icShares.size() > 0 ? " hidden " : " visible ";
	}
	
	private void addSharesHeader() {
		getSharesPanel().setHeader(getSharesHeaderComponents(),getSharesFieldNames());
	}
	
	private LabeledJSFInputComponent[] getSharesHeaderComponents() {
		return new LabeledJSFInputComponent[]{
							(LabeledJSFInputComponent)getSharesHeader_ShareName(),
							(LabeledJSFInputComponent)getSharesHeader_usr_AccessTypeVI(),
							(LabeledJSFInputComponent)getSharesHeader_usr_AccessTypeRW(),
							(LabeledJSFInputComponent)getSharesHeader_usr_Admin(),
						};
	}

	private String[] getSharesFieldNames() {
		return new String[]{
							"_ShareName",
							"_usr_AccessTypeVI",
							"_usr_AccessTypeRW",
							"_usr_Admin",
						};
	}

	   /**
		* Header for:
		* 
		* linked container ShareInUserWizardACLItemDataContainer
		*/
		public org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainerHeader getSharesHeader()
		{
			return this;
		}
		
				/**
   		 * Header for field shareName
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_ShareName() {
    		if (icSharesHeader_ShareName == null)
    		{
				String label = bundle.getString("ShareInUserWizardACLItemDataContainer.shareName");
				String binding = expressionPrefix + "sharesHeader_ShareName.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icSharesHeader_ShareName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icSharesHeader_ShareName).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icSharesHeader_ShareName).setHeader(true);
			
    		return icSharesHeader_ShareName;
    	}
				/**
   		 * Header for field accessTypeVI
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_usr_AccessTypeVI() {
    		if (icSharesHeader_usr_AccessTypeVI == null)
    		{
				String label = bundle.getString("ShareInUserWizardACLItemDataContainer.accessTypeVI");
				String binding = expressionPrefix + "sharesHeader_usr_AccessTypeVI.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			icSharesHeader_usr_AccessTypeVI = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)icSharesHeader_usr_AccessTypeVI).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)icSharesHeader_usr_AccessTypeVI).setHeader(true);
			
    		return icSharesHeader_usr_AccessTypeVI;
    	}
				/**
   		 * Header for field accessTypeRW
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_usr_AccessTypeRW() {
    		if (icSharesHeader_usr_AccessTypeRW == null)
    		{
				String label = bundle.getString("ShareInUserWizardACLItemDataContainer.accessTypeRW");
				String binding = expressionPrefix + "sharesHeader_usr_AccessTypeRW.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			icSharesHeader_usr_AccessTypeRW = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)icSharesHeader_usr_AccessTypeRW).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)icSharesHeader_usr_AccessTypeRW).setHeader(true);
			
    		return icSharesHeader_usr_AccessTypeRW;
    	}
				/**
   		 * Header for field admin
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_usr_Admin() {
    		if (icSharesHeader_usr_Admin == null)
    		{
				String label = bundle.getString("ShareInUserWizardACLItemDataContainer.admin");
				String binding = expressionPrefix + "sharesHeader_usr_Admin.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icSharesHeader_usr_Admin = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icSharesHeader_usr_Admin).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icSharesHeader_usr_Admin).setHeader(true);
			
    		return icSharesHeader_usr_Admin;
    	}
		
			
				
		/**
		* 
		* linked container PrinterInUserWizardACLItemDataContainer
		*/
				public java.util.List<PrinterInUserWizardACLItemDataContainer> getPrinters()
				{
						return icPrinters;
		}
		
		public MultiLinePanel getPrintersPanel()
		{
			if (printersPanel == null)
			{
  			   printersPanel = new PrintersPanel(adapter,expressionPrefix, // the prefix for binding values
							  "#{" +  expressionPrefix + "printersPanel", // binding for Title
							  "PrinterInUserWizardACLItemDataContainer_AsPrinters_InUserWizardPage2.caption", //Key for title
							  org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterInUserWizardACLItemDataContainer_AsPrinters_InUserWizardPage2Impl.COLS);
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
				return org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterInUserWizardACLItemDataContainer_AsPrinters_InUserWizardPage2Impl.orientationOfColumnAsCss[column];
			}
		}

	private void addPrinters(org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterInUserWizardACLItemDataContainer_AsPrinters_InUserWizardPage2Impl child) {

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
	public java.util.List<PrinterInUserWizardACLItemDataContainer> getPrintersForUI()
	{
				
		List<PrinterInUserWizardACLItemDataContainer> result = new ArrayList<PrinterInUserWizardACLItemDataContainer>();
		result.addAll(icPrinters);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterInUserWizardACLItemDataContainer_AsPrinters_InUserWizardPage2Impl item = new org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterInUserWizardACLItemDataContainer_AsPrinters_InUserWizardPage2Impl((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)adapter,expressionPrefix, result.size());
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
		* linked container PrinterInUserWizardACLItemDataContainer
		*/
		public org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainerHeader getPrintersHeader()
		{
			return this;
		}
		
				/**
   		 * Header for field PrinterName
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getPrintersHeader_PrinterName() {
    		if (icPrintersHeader_PrinterName == null)
    		{
				String label = bundle.getString("PrinterInUserWizardACLItemDataContainer.PrinterName");
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
				String label = bundle.getString("PrinterInUserWizardACLItemDataContainer.accessTypeVI");
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
				String label = bundle.getString("PrinterInUserWizardACLItemDataContainer.accessTypeRW");
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
				String label = bundle.getString("PrinterInUserWizardACLItemDataContainer.admin");
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
	    		if (ic_usr_AccessToAll != null)
    		{
				ic_usr_AccessToAll.setLabelText(bundle.getString("UserWizardPage2.accessToAll"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesSamba"};
	}

	public void countAndCreateChildren() throws WbemsmtException {
	
    			try
		{
			int count = adapter.count("shares",org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainer.class, this);
	        if (count != sharesCount)
	        {
	           sharesCount = count;
	           clearShares();
			   for (int i=0; i < count ; i++) {
	    			addShares(new org.sblim.wbemsmt.jsf.samba.container.wizard.ShareInUserWizardACLItemDataContainer_AsShares_InUserWizardPage2Impl((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)adapter,expressionPrefix, i));
			   }
	        }
			getSharesPanel().setList(getShares());				   
		} catch (WbemsmtException e) {
			throw new WbemsmtException(WbemsmtException.ERR_INIT_CONTAINER,e);
		}
    			try
		{
			int count = adapter.count("printers",org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainer.class, this);
	        if (count != printersCount)
	        {
	           printersCount = count;
	           clearPrinters();
			   for (int i=0; i < count ; i++) {
	    			addPrinters(new org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterInUserWizardACLItemDataContainer_AsPrinters_InUserWizardPage2Impl((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)adapter,expressionPrefix, i));
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
		
			   				      getSharesPanel().updateRows();				
			   				      getPrintersPanel().updateRows();				
			   		}

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    				fields.add(get_usr_AccessToAll());
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    		childs.addAll(getShares());
    	    		childs.addAll(getPrinters());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       UserWizardPage2Impl source = (UserWizardPage2Impl)sourceContainer;
		    		    
    	    		   get_usr_AccessToAll().copyFrom(source.get_usr_AccessToAll());
		    		
    	    		   List<ShareInUserWizardACLItemDataContainer> targetListForShares = getShares();
    		   List<ShareInUserWizardACLItemDataContainer> sourceListForShares = source.getShares();
    		   if (sourceListForShares.size() != targetListForShares.size())
    		   {
    			      throw new WbemsmtException(WbemsmtException.ERR_FAILED,"The Lists are not from same size. Source is " + sourceListForShares.size() + " and target is " + targetListForShares.size() );
    		   }
			       for (int ii=0; ii < sourceListForShares.size(); ii++)
			       {
				          ((DataContainer) targetListForShares.get(ii)).copyFrom(((DataContainer) sourceListForShares.get(ii)));
			        }
			
    	    		   List<PrinterInUserWizardACLItemDataContainer> targetListForPrinters = getPrinters();
    		   List<PrinterInUserWizardACLItemDataContainer> sourceListForPrinters = source.getPrinters();
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