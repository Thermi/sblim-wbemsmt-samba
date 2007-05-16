/** 
  * ShareInUserACLDataContainerImpl.java
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
  * Description: Container for the share-related acl within a user
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

public class ShareInUserACLDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.user.ShareInUserACLDataContainer {

				
				private java.util.List icShares = new java.util.ArrayList();
		
		private MultiLinePanel sharesPanel;

				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icShares_ShareNameHeader;
				private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf icShares_usr_AccessTypeVIHeader;
				private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf icShares_usr_AccessTypeRWHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icShares_usr_AdminHeader;
				
	
		
	
	public ShareInUserACLDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {

			
				super(adapter,bindingPrefix, "ShareInUserACLDataContainer.caption",false);
				
				
    			
    	    						
		setFooter(getPanelForCustomLayout(),"ShareInUserACLDataContainer.footerText");
		adapter.initContainer(this);
	}
	

		
			
				
		/**
		* 
		* linked container ShareACLItemDataContainer
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
							  "ShareACLItemDataContainer_AsShares_InShareInUserACLDataContainer.caption", //Key for title
							  org.sblim.wbemsmt.jsf.samba.container.share.ShareACLItemDataContainer_AsShares_InShareInUserACLDataContainerImpl.COLS);
			}		
			
			return sharesPanel;
		}

		static class SharesPanel extends MultiLinePanel
		{
			public SharesPanel(AbstractBaseCimAdapter adapter, String bindingPrefix, String bindigForTitle, String keyForTitle, int cols) {
				super(adapter, bindingPrefix, bindigForTitle, keyForTitle, cols);
			}
	
			protected String getOrientationOfColumnAsCss(int column) {
				return org.sblim.wbemsmt.jsf.samba.container.share.ShareACLItemDataContainer_AsShares_InShareInUserACLDataContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	public void addShares(org.sblim.wbemsmt.jsf.samba.container.share.ShareACLItemDataContainer_AsShares_InShareInUserACLDataContainerImpl child) {

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
				String label = bundle.getString("ShareACLItemDataContainer.shareName");
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
				String label = bundle.getString("ShareACLItemDataContainer.accessTypeVI");
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
				String label = bundle.getString("ShareACLItemDataContainer.accessTypeRW");
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
				String label = bundle.getString("ShareACLItemDataContainer.admin");
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
	
	
		
	public void reload()
	{
		super.reload();
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
		ShareInUserACLDataContainerImpl source = (ShareInUserACLDataContainerImpl)sourceContainer;
	
    			
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