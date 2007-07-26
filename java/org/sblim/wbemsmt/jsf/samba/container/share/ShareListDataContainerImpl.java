/** 
  * ShareListDataContainerImpl.java
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
  * Description: List with shares
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.share;

import org.sblim.wbemsmt.exception.*;
import java.util.*;

//imports for that field of a linked container with occurence = MANY
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class ShareListDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.share.ShareListDataContainer {

				
				private java.util.List icShares = new java.util.ArrayList();
		
		private MultiLinePanel sharesPanel;
		private int sharesCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icShares_NameHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icShares_AvailableHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icShares_CommentHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icShares_PathHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icShares_BrowsableHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icShares_GuestOKHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icShares_GuestOnlyHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icShares_HostsAllowHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icShares_HostsDenyHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icShares_ReadOnlyHeader;
				
	
		
	
	public ShareListDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {

			
				super(adapter,bindingPrefix, "ShareListDataContainer.caption",false);
				
				
		
				
    			
    	    						
		setFooter(getPanelForCustomLayout(),"ShareListDataContainer.footerText");
		adapter.initContainer(this);
	}
	

		
			
				
		/**
		* 
		* linked container ShareListItemDataContainer
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
							  "ShareListItemDataContainer_AsShares_InShareListDataContainer.caption", //Key for title
							  org.sblim.wbemsmt.jsf.samba.container.share.ShareListItemDataContainer_AsShares_InShareListDataContainerImpl.COLS);
			  addSharesHeader();							  
			}		
			
			return sharesPanel;
		}

		static class SharesPanel extends MultiLinePanel
		{
			public SharesPanel(AbstractBaseCimAdapter adapter, String bindingPrefix, String bindigForTitle, String keyForTitle, int cols) {
				super(adapter, bindingPrefix, bindigForTitle, keyForTitle, "shares", cols);
			}
	
			protected String getOrientationOfColumnAsCss(int column) {
				return org.sblim.wbemsmt.jsf.samba.container.share.ShareListItemDataContainer_AsShares_InShareListDataContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	private void addShares(org.sblim.wbemsmt.jsf.samba.container.share.ShareListItemDataContainer_AsShares_InShareListDataContainerImpl child) {

		getShares().add(child);
		getSharesPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getShares_NameHeader()).getDependentChildFields().add(child.get_Name());
					//((LabeledJSFInputComponent)getShares_AvailableHeader()).getDependentChildFields().add(child.get_Available());
					//((LabeledJSFInputComponent)getShares_CommentHeader()).getDependentChildFields().add(child.get_Comment());
					//((LabeledJSFInputComponent)getShares_PathHeader()).getDependentChildFields().add(child.get_Path());
					//((LabeledJSFInputComponent)getShares_BrowsableHeader()).getDependentChildFields().add(child.get_Browsable());
					//((LabeledJSFInputComponent)getShares_GuestOKHeader()).getDependentChildFields().add(child.get_GuestOK());
					//((LabeledJSFInputComponent)getShares_GuestOnlyHeader()).getDependentChildFields().add(child.get_GuestOnly());
					//((LabeledJSFInputComponent)getShares_HostsAllowHeader()).getDependentChildFields().add(child.get_HostsAllow());
					//((LabeledJSFInputComponent)getShares_HostsDenyHeader()).getDependentChildFields().add(child.get_HostsDeny());
					//((LabeledJSFInputComponent)getShares_ReadOnlyHeader()).getDependentChildFields().add(child.get_ReadOnly());
			}
	
	private void clearShares() {
		getShares().clear();
	}

	/**
	* 
	* Get the Shares for the UI repesentation
	*/
	public java.util.List getSharesForUI()
	{
				
		List result = new ArrayList();
		result.addAll(icShares);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.jsf.samba.container.share.ShareListItemDataContainer_AsShares_InShareListDataContainerImpl item = new org.sblim.wbemsmt.jsf.samba.container.share.ShareListItemDataContainer_AsShares_InShareListDataContainerImpl((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)adapter,bindingPrefix, result.size());
				DataContainerUtil.setVisibilityOfFields(item,false);
				result.add(item);
			} catch (InitContainerException e) {
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
							(LabeledJSFInputComponent)getShares_NameHeader(),
							(LabeledJSFInputComponent)getShares_AvailableHeader(),
							(LabeledJSFInputComponent)getShares_CommentHeader(),
							(LabeledJSFInputComponent)getShares_PathHeader(),
							(LabeledJSFInputComponent)getShares_BrowsableHeader(),
							(LabeledJSFInputComponent)getShares_GuestOKHeader(),
							(LabeledJSFInputComponent)getShares_GuestOnlyHeader(),
							(LabeledJSFInputComponent)getShares_HostsAllowHeader(),
							(LabeledJSFInputComponent)getShares_HostsDenyHeader(),
							(LabeledJSFInputComponent)getShares_ReadOnlyHeader(),
						};
	}

	private String[] getSharesFieldNames() {
		return new String[]{
							"_Name",
							"_Available",
							"_Comment",
							"_Path",
							"_Browsable",
							"_GuestOK",
							"_GuestOnly",
							"_HostsAllow",
							"_HostsDeny",
							"_ReadOnly",
						};
	}

			/**
   		 * Header for field Name
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getShares_NameHeader() {
    		if (icShares_NameHeader == null)
    		{
				String label = bundle.getString("ShareListItemDataContainer.Name");
				String binding = bindingPrefix + "shares_NameHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			icShares_NameHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icShares_NameHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icShares_NameHeader).setHeader(true);
			
    		return icShares_NameHeader;
    	}
			/**
   		 * Header for field Available
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getShares_AvailableHeader() {
    		if (icShares_AvailableHeader == null)
    		{
				String label = bundle.getString("ShareListItemDataContainer.Available");
				String binding = bindingPrefix + "shares_AvailableHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icShares_AvailableHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icShares_AvailableHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icShares_AvailableHeader).setHeader(true);
			
    		return icShares_AvailableHeader;
    	}
			/**
   		 * Header for field Comment
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getShares_CommentHeader() {
    		if (icShares_CommentHeader == null)
    		{
				String label = bundle.getString("ShareListItemDataContainer.Comment");
				String binding = bindingPrefix + "shares_CommentHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icShares_CommentHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icShares_CommentHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icShares_CommentHeader).setHeader(true);
			
    		return icShares_CommentHeader;
    	}
			/**
   		 * Header for field Path
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getShares_PathHeader() {
    		if (icShares_PathHeader == null)
    		{
				String label = bundle.getString("ShareListItemDataContainer.Path");
				String binding = bindingPrefix + "shares_PathHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icShares_PathHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icShares_PathHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icShares_PathHeader).setHeader(true);
			
    		return icShares_PathHeader;
    	}
			/**
   		 * Header for field Browsable
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getShares_BrowsableHeader() {
    		if (icShares_BrowsableHeader == null)
    		{
				String label = bundle.getString("ShareListItemDataContainer.Browsable");
				String binding = bindingPrefix + "shares_BrowsableHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icShares_BrowsableHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icShares_BrowsableHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icShares_BrowsableHeader).setHeader(true);
			
    		return icShares_BrowsableHeader;
    	}
			/**
   		 * Header for field GuestOK
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getShares_GuestOKHeader() {
    		if (icShares_GuestOKHeader == null)
    		{
				String label = bundle.getString("ShareListItemDataContainer.GuestOK");
				String binding = bindingPrefix + "shares_GuestOKHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icShares_GuestOKHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icShares_GuestOKHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icShares_GuestOKHeader).setHeader(true);
			
    		return icShares_GuestOKHeader;
    	}
			/**
   		 * Header for field GuestOnly
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getShares_GuestOnlyHeader() {
    		if (icShares_GuestOnlyHeader == null)
    		{
				String label = bundle.getString("ShareListItemDataContainer.GuestOnly");
				String binding = bindingPrefix + "shares_GuestOnlyHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icShares_GuestOnlyHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icShares_GuestOnlyHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icShares_GuestOnlyHeader).setHeader(true);
			
    		return icShares_GuestOnlyHeader;
    	}
			/**
   		 * Header for field HostsAllow
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getShares_HostsAllowHeader() {
    		if (icShares_HostsAllowHeader == null)
    		{
				String label = bundle.getString("ShareListItemDataContainer.HostsAllow");
				String binding = bindingPrefix + "shares_HostsAllowHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icShares_HostsAllowHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icShares_HostsAllowHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icShares_HostsAllowHeader).setHeader(true);
			
    		return icShares_HostsAllowHeader;
    	}
			/**
   		 * Header for field HostsDeny
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getShares_HostsDenyHeader() {
    		if (icShares_HostsDenyHeader == null)
    		{
				String label = bundle.getString("ShareListItemDataContainer.HostsDeny");
				String binding = bindingPrefix + "shares_HostsDenyHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icShares_HostsDenyHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icShares_HostsDenyHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icShares_HostsDenyHeader).setHeader(true);
			
    		return icShares_HostsDenyHeader;
    	}
			/**
   		 * Header for field ReadOnly
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getShares_ReadOnlyHeader() {
    		if (icShares_ReadOnlyHeader == null)
    		{
				String label = bundle.getString("ShareListItemDataContainer.ReadOnly");
				String binding = bindingPrefix + "shares_ReadOnlyHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icShares_ReadOnlyHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icShares_ReadOnlyHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icShares_ReadOnlyHeader).setHeader(true);
			
    		return icShares_ReadOnlyHeader;
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
			int count = adapter.count(org.sblim.wbemsmt.samba.bl.container.share.ShareListItemDataContainer.class);
	        if (count != sharesCount)
	        {
	           sharesCount = count;
	           clearShares();
			   for (int i=0; i < count ; i++) {
	    			addShares(new org.sblim.wbemsmt.jsf.samba.container.share.ShareListItemDataContainer_AsShares_InShareListDataContainerImpl((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)adapter,bindingPrefix, i));
			   }
	        }
			getSharesPanel().setList(getShares());				   
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
		
							getSharesPanel().updateRows();				
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
    	    		childs.addAll(getShares());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer)
	{
		ShareListDataContainerImpl source = (ShareListDataContainerImpl)sourceContainer;
	
    			
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
			
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}