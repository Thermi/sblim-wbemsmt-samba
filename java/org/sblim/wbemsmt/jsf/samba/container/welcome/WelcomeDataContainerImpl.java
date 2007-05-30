/** 
  * WelcomeDataContainerImpl.java
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

package org.sblim.wbemsmt.jsf.samba.container.welcome;

import org.sblim.wbemsmt.exception.*;
import java.util.*;




import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class WelcomeDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.welcome.WelcomeDataContainer {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_WelcomeText;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_SharePicture;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_LinkCreateShare;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Memo;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_LinkCreatePrinter;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_LinkCreateUser;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Actions;
    	
		
			WelcomeDataContainerImplLayouter layouter = null;
		
		public WelcomeDataContainerImplLayouter getLayouter()
		{
			return layouter;
		}	
	
	public WelcomeDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {

			
				super(adapter,bindingPrefix, "WelcomeDataContainer.caption",false);
				
				
		
				
    			
    				layouter = new WelcomeDataContainerImplLayouter();
			//layout is done in the edit-method of the Editbean
			//layouter.layout(getPanelForCustomLayout(),this,bundle);
				
		setFooter(getPanelForCustomLayout(),"WelcomeDataContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_WelcomeText() {
    		if (ic_usr_WelcomeText == null)
    		{
				String label = bundle.getString("WelcomeDataContainer.welcomeText");
				String binding = bindingPrefix + "_usr_WelcomeText.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_usr_WelcomeText = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_WelcomeText;
    	}
			/**
		* 
		* DataType PICTUREDATA
		* UIType PICTURE
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_SharePicture() {
    		if (ic_usr_SharePicture == null)
    		{
				String label = bundle.getString("WelcomeDataContainer.sharePicture");
				String binding = bindingPrefix + "_usr_SharePicture.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.jsf.PictureDataConverter();
				boolean readOnly = false;
    			ic_usr_SharePicture = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFPictureComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_SharePicture;
    	}
			/**
		* 
		* DataType LINKDATA
		* UIType LINK
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_LinkCreateShare() {
    		if (ic_usr_LinkCreateShare == null)
    		{
				String label = bundle.getString("WelcomeDataContainer.linkCreateShare");
				String binding = bindingPrefix + "_usr_LinkCreateShare.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.jsf.LinkDataConverter();
				boolean readOnly = false;
    			ic_usr_LinkCreateShare = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLinkComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_LinkCreateShare;
    	}
			/**
		* 
		* DataType MEMODATA
		* UIType MEMO
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Memo() {
    		if (ic_usr_Memo == null)
    		{
				String label = bundle.getString("WelcomeDataContainer.memo");
				String binding = bindingPrefix + "_usr_Memo.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.jsf.MemoDataConverter();
				boolean readOnly = false;
    			ic_usr_Memo = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFMemoComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Memo;
    	}
			/**
		* 
		* DataType LINKDATA
		* UIType LINK
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_LinkCreatePrinter() {
    		if (ic_usr_LinkCreatePrinter == null)
    		{
				String label = bundle.getString("WelcomeDataContainer.linkCreatePrinter");
				String binding = bindingPrefix + "_usr_LinkCreatePrinter.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.jsf.LinkDataConverter();
				boolean readOnly = false;
    			ic_usr_LinkCreatePrinter = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLinkComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_LinkCreatePrinter;
    	}
			/**
		* 
		* DataType LINKDATA
		* UIType LINK
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_LinkCreateUser() {
    		if (ic_usr_LinkCreateUser == null)
    		{
				String label = bundle.getString("WelcomeDataContainer.linkCreateUser");
				String binding = bindingPrefix + "_usr_LinkCreateUser.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.jsf.LinkDataConverter();
				boolean readOnly = false;
    			ic_usr_LinkCreateUser = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLinkComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_LinkCreateUser;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Actions() {
    		if (ic_usr_Actions == null)
    		{
				String label = bundle.getString("WelcomeDataContainer.actions");
				String binding = bindingPrefix + "_usr_Actions.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Actions = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Actions;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_WelcomeText != null)
    		{
				ic_usr_WelcomeText.setLabelText(bundle.getString("WelcomeDataContainer.welcomeText"));
    		}
	    		if (ic_usr_SharePicture != null)
    		{
				ic_usr_SharePicture.setLabelText(bundle.getString("WelcomeDataContainer.sharePicture"));
    		}
	    		if (ic_usr_LinkCreateShare != null)
    		{
				ic_usr_LinkCreateShare.setLabelText(bundle.getString("WelcomeDataContainer.linkCreateShare"));
    		}
	    		if (ic_usr_Memo != null)
    		{
				ic_usr_Memo.setLabelText(bundle.getString("WelcomeDataContainer.memo"));
    		}
	    		if (ic_usr_LinkCreatePrinter != null)
    		{
				ic_usr_LinkCreatePrinter.setLabelText(bundle.getString("WelcomeDataContainer.linkCreatePrinter"));
    		}
	    		if (ic_usr_LinkCreateUser != null)
    		{
				ic_usr_LinkCreateUser.setLabelText(bundle.getString("WelcomeDataContainer.linkCreateUser"));
    		}
	    		if (ic_usr_Actions != null)
    		{
				ic_usr_Actions.setLabelText(bundle.getString("WelcomeDataContainer.actions"));
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
    				fields.add(get_usr_WelcomeText());
    				fields.add(get_usr_SharePicture());
    				fields.add(get_usr_LinkCreateShare());
    				fields.add(get_usr_Memo());
    				fields.add(get_usr_LinkCreatePrinter());
    				fields.add(get_usr_LinkCreateUser());
    				fields.add(get_usr_Actions());
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
		WelcomeDataContainerImpl source = (WelcomeDataContainerImpl)sourceContainer;
	
    	    		get_usr_WelcomeText().setValue(source.get_usr_WelcomeText().getValue());
		    		get_usr_SharePicture().setValue(source.get_usr_SharePicture().getValue());
		    		get_usr_LinkCreateShare().setValue(source.get_usr_LinkCreateShare().getValue());
		    		get_usr_Memo().setValue(source.get_usr_Memo().getValue());
		    		get_usr_LinkCreatePrinter().setValue(source.get_usr_LinkCreatePrinter().getValue());
		    		get_usr_LinkCreateUser().setValue(source.get_usr_LinkCreateUser().getValue());
		    		get_usr_Actions().setValue(source.get_usr_Actions().getValue());
				
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}