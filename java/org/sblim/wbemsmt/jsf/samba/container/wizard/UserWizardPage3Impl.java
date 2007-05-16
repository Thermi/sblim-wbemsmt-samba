/** 
  * UserWizardPage3Impl.java
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
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.wizard;

import org.sblim.wbemsmt.exception.*;
import java.util.*;

//imports for that field of a linked container with occurence = MANY
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class UserWizardPage3Impl extends org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel implements org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3 {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SambaUserName;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SystemUserName;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_IsGuest;
    			
				private java.util.List icShares = new java.util.ArrayList();
		
		private MultiLinePanel sharesPanel;

				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icShares_ShareNameHeader;
				private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf icShares_usr_AccessTypeVIHeader;
				private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf icShares_usr_AccessTypeRWHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icShares_usr_AdminHeader;
				
			
				private java.util.List icPrinters = new java.util.ArrayList();
		
		private MultiLinePanel printersPanel;

				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icPrinters_PrinterNameHeader;
				private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf icPrinters_usr_AccessTypeVIHeader;
				private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf icPrinters_usr_AccessTypeRWHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icPrinters_usr_AdminHeader;
				
	
		
	
	public UserWizardPage3Impl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {

			
				super(adapter,bindingPrefix, "UserWizardPage3.caption","UserWizardPage3.subTitle",false);
				
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_SambaUserName());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_SystemUserName());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_IsGuest());
        					
		setFooter(getPanelForCustomLayout(),"UserWizardPage3.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SambaUserName() {
    		if (ic_SambaUserName == null)
    		{
				String label = bundle.getString("UserWizardPage3.SambaUserName");
				String binding = bindingPrefix + "_SambaUserName.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_SambaUserName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_SambaUserName;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SystemUserName() {
    		if (ic_SystemUserName == null)
    		{
				String label = bundle.getString("UserWizardPage3.SystemUserName");
				String binding = bindingPrefix + "_SystemUserName.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_SystemUserName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_SystemUserName;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_IsGuest() {
    		if (ic_usr_IsGuest == null)
    		{
				String label = bundle.getString("UserWizardPage3.isGuest");
				String binding = bindingPrefix + "_usr_IsGuest.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_usr_IsGuest = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_IsGuest;
    	}
		
			
				
		/**
		* 
		* linked container ShareInUserWizardACLItemDataContainer
		*/
		public java.util.List getShares()
		{
						return icShares;
		}
		
		public MultiLinePanel getSharesPanel()
		{
			if (sharesPanel == null)
			{
  			   sharesPanel = new SharesPanel(adapter,bindingPrefix, // the prefix for binding values
							  "#{" +  bindingPrefix + "sharesPanel", // binding for Title
							  "ShareInUserWizardACLItemDataContainer_AsShares_InUserWizardPage3.caption", //Key for title
							  org.sblim.wbemsmt.jsf.samba.container.wizard.ShareInUserWizardACLItemDataContainer_AsShares_InUserWizardPage3Impl.COLS);
			}		
			
			return sharesPanel;
		}

		static class SharesPanel extends MultiLinePanel
		{
			public SharesPanel(AbstractBaseCimAdapter adapter, String bindingPrefix, String bindigForTitle, String keyForTitle, int cols) {
				super(adapter, bindingPrefix, bindigForTitle, keyForTitle, cols);
			}
	
			protected String getOrientationOfColumnAsCss(int column) {
				return org.sblim.wbemsmt.jsf.samba.container.wizard.ShareInUserWizardACLItemDataContainer_AsShares_InUserWizardPage3Impl.orientationOfColumnAsCss[column];
			}
		}

	public void addShares(org.sblim.wbemsmt.jsf.samba.container.wizard.ShareInUserWizardACLItemDataContainer_AsShares_InUserWizardPage3Impl child) {

		getShares().add(child);
		getSharesPanel().addComponents(child.getComponents());
		
					((LabeledJSFInputComponent)getShares_ShareNameHeader()).getDependentChildFields().add(child.get_ShareName());
					((LabeledJSFInputComponent)getShares_usr_AccessTypeVIHeader()).getDependentChildFields().add(child.get_usr_AccessTypeVI());
					((LabeledJSFInputComponent)getShares_usr_AccessTypeRWHeader()).getDependentChildFields().add(child.get_usr_AccessTypeRW());
					((LabeledJSFInputComponent)getShares_usr_AdminHeader()).getDependentChildFields().add(child.get_usr_Admin());
		
		
	}

	public void clearShares() {
		getShares().clear();
		getSharesPanel().getInputFieldContainer().getChildren().clear();
					((LabeledJSFInputComponent)getShares_ShareNameHeader()).getDependentChildFields().clear();
					((LabeledJSFInputComponent)getShares_usr_AccessTypeVIHeader()).getDependentChildFields().clear();
					((LabeledJSFInputComponent)getShares_usr_AccessTypeRWHeader()).getDependentChildFields().clear();
					((LabeledJSFInputComponent)getShares_usr_AdminHeader()).getDependentChildFields().clear();
			}

	public void addSharesHeader() {
		getSharesPanel().setHeader(getSharesHeaderComponents());
	}
	
	private LabeledJSFInputComponent[] getSharesHeaderComponents() {
		return new LabeledJSFInputComponent[]{
							(LabeledJSFInputComponent)getShares_ShareNameHeader(),
							(LabeledJSFInputComponent)getShares_usr_AccessTypeVIHeader(),
							(LabeledJSFInputComponent)getShares_usr_AccessTypeRWHeader(),
							(LabeledJSFInputComponent)getShares_usr_AdminHeader(),
						};
	}

			/**
   		 * Header for field shareName
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getShares_ShareNameHeader() {
    		if (icShares_ShareNameHeader == null)
    		{
				String label = bundle.getString("ShareInUserWizardACLItemDataContainer.shareName");
				String binding = bindingPrefix + "shares_ShareNameHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icShares_ShareNameHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icShares_ShareNameHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icShares_ShareNameHeader).setHeader(true);
			
    		return icShares_ShareNameHeader;
    	}
			/**
   		 * Header for field accessTypeVI
		 */
		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf getShares_usr_AccessTypeVIHeader() {
    		if (icShares_usr_AccessTypeVIHeader == null)
    		{
				String label = bundle.getString("ShareInUserWizardACLItemDataContainer.accessTypeVI");
				String binding = bindingPrefix + "shares_usr_AccessTypeVIHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			icShares_usr_AccessTypeVIHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)icShares_usr_AccessTypeVIHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)icShares_usr_AccessTypeVIHeader).setHeader(true);
			
    		return icShares_usr_AccessTypeVIHeader;
    	}
			/**
   		 * Header for field accessTypeRW
		 */
		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf getShares_usr_AccessTypeRWHeader() {
    		if (icShares_usr_AccessTypeRWHeader == null)
    		{
				String label = bundle.getString("ShareInUserWizardACLItemDataContainer.accessTypeRW");
				String binding = bindingPrefix + "shares_usr_AccessTypeRWHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			icShares_usr_AccessTypeRWHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)icShares_usr_AccessTypeRWHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent)icShares_usr_AccessTypeRWHeader).setHeader(true);
			
    		return icShares_usr_AccessTypeRWHeader;
    	}
			/**
   		 * Header for field admin
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getShares_usr_AdminHeader() {
    		if (icShares_usr_AdminHeader == null)
    		{
				String label = bundle.getString("ShareInUserWizardACLItemDataContainer.admin");
				String binding = bindingPrefix + "shares_usr_AdminHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icShares_usr_AdminHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icShares_usr_AdminHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icShares_usr_AdminHeader).setHeader(true);
			
    		return icShares_usr_AdminHeader;
    	}
	
			
				
		/**
		* 
		* linked container PrinterInUserWizardACLItemDataContainer
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
							  "PrinterInUserWizardACLItemDataContainer_AsPrinters_InUserWizardPage3.caption", //Key for title
							  org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterInUserWizardACLItemDataContainer_AsPrinters_InUserWizardPage3Impl.COLS);
			}		
			
			return printersPanel;
		}

		static class PrintersPanel extends MultiLinePanel
		{
			public PrintersPanel(AbstractBaseCimAdapter adapter, String bindingPrefix, String bindigForTitle, String keyForTitle, int cols) {
				super(adapter, bindingPrefix, bindigForTitle, keyForTitle, cols);
			}
	
			protected String getOrientationOfColumnAsCss(int column) {
				return org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterInUserWizardACLItemDataContainer_AsPrinters_InUserWizardPage3Impl.orientationOfColumnAsCss[column];
			}
		}

	public void addPrinters(org.sblim.wbemsmt.jsf.samba.container.wizard.PrinterInUserWizardACLItemDataContainer_AsPrinters_InUserWizardPage3Impl child) {

		getPrinters().add(child);
		getPrintersPanel().addComponents(child.getComponents());
		
					((LabeledJSFInputComponent)getPrinters_PrinterNameHeader()).getDependentChildFields().add(child.get_PrinterName());
					((LabeledJSFInputComponent)getPrinters_usr_AccessTypeVIHeader()).getDependentChildFields().add(child.get_usr_AccessTypeVI());
					((LabeledJSFInputComponent)getPrinters_usr_AccessTypeRWHeader()).getDependentChildFields().add(child.get_usr_AccessTypeRW());
					((LabeledJSFInputComponent)getPrinters_usr_AdminHeader()).getDependentChildFields().add(child.get_usr_Admin());
		
		
	}

	public void clearPrinters() {
		getPrinters().clear();
		getPrintersPanel().getInputFieldContainer().getChildren().clear();
					((LabeledJSFInputComponent)getPrinters_PrinterNameHeader()).getDependentChildFields().clear();
					((LabeledJSFInputComponent)getPrinters_usr_AccessTypeVIHeader()).getDependentChildFields().clear();
					((LabeledJSFInputComponent)getPrinters_usr_AccessTypeRWHeader()).getDependentChildFields().clear();
					((LabeledJSFInputComponent)getPrinters_usr_AdminHeader()).getDependentChildFields().clear();
			}

	public void addPrintersHeader() {
		getPrintersPanel().setHeader(getPrintersHeaderComponents());
	}
	
	private LabeledJSFInputComponent[] getPrintersHeaderComponents() {
		return new LabeledJSFInputComponent[]{
							(LabeledJSFInputComponent)getPrinters_PrinterNameHeader(),
							(LabeledJSFInputComponent)getPrinters_usr_AccessTypeVIHeader(),
							(LabeledJSFInputComponent)getPrinters_usr_AccessTypeRWHeader(),
							(LabeledJSFInputComponent)getPrinters_usr_AdminHeader(),
						};
	}

			/**
   		 * Header for field PrinterName
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getPrinters_PrinterNameHeader() {
    		if (icPrinters_PrinterNameHeader == null)
    		{
				String label = bundle.getString("PrinterInUserWizardACLItemDataContainer.PrinterName");
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
				String label = bundle.getString("PrinterInUserWizardACLItemDataContainer.accessTypeVI");
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
				String label = bundle.getString("PrinterInUserWizardACLItemDataContainer.accessTypeRW");
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
				String label = bundle.getString("PrinterInUserWizardACLItemDataContainer.admin");
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
	    		if (ic_SambaUserName != null)
    		{
				ic_SambaUserName.setLabelText(bundle.getString("UserWizardPage3.SambaUserName"));
    		}
	    		if (ic_SystemUserName != null)
    		{
				ic_SystemUserName.setLabelText(bundle.getString("UserWizardPage3.SystemUserName"));
    		}
	    		if (ic_usr_IsGuest != null)
    		{
				ic_usr_IsGuest.setLabelText(bundle.getString("UserWizardPage3.isGuest"));
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
    				fields.add(get_SambaUserName());
    				fields.add(get_SystemUserName());
    				fields.add(get_usr_IsGuest());
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List getChildContainers()
	{
		List childs = new ArrayList();
    	    		childs.addAll(getShares());
    	    		childs.addAll(getPrinters());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer)
	{
		UserWizardPage3Impl source = (UserWizardPage3Impl)sourceContainer;
	
    	    		get_SambaUserName().setValue(source.get_SambaUserName().getValue());
		    		get_SystemUserName().setValue(source.get_SystemUserName().getValue());
		    		get_usr_IsGuest().setValue(source.get_usr_IsGuest().getValue());
				
    	    		List targetListForShares = (List) getShares();
    		List sourceListForShares = (List) source.getShares();
    		if (sourceListForShares.size() != targetListForShares.size())
    		{
    			throw new IllegalArgumentException("The Lists are not from same size. Source is " + sourceListForShares.size() + " and target is " + targetListForShares.size() );
    		}
			for (int ii=0; ii < sourceListForShares.size(); ii++)
			{
				((DataContainer) targetListForShares.get(ii)).copyFrom(((DataContainer) sourceListForShares.get(ii)));
			}
			
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