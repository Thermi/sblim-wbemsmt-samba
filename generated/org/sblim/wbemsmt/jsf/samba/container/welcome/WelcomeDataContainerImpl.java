/** 
  * WelcomeDataContainerImpl.java
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

package org.sblim.wbemsmt.jsf.samba.container.welcome;

import org.sblim.wbemsmt.exception.*;
import java.util.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;




import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class WelcomeDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.welcome.WelcomeDataContainer
	{
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
	
	public WelcomeDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "WelcomeDataContainer.caption",false);
				
				
		
				
    			
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
				String binding = expressionPrefix + "_usr_WelcomeText.item";
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
				String binding = expressionPrefix + "_usr_SharePicture.item";
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
				String binding = expressionPrefix + "_usr_LinkCreateShare.item";
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
				String binding = expressionPrefix + "_usr_Memo.item";
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
				String binding = expressionPrefix + "_usr_LinkCreatePrinter.item";
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
				String binding = expressionPrefix + "_usr_LinkCreateUser.item";
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
				String binding = expressionPrefix + "_usr_Actions.item";
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

	public void countAndCreateChildren() throws WbemsmtException {
	
    		}


	/**
	 * count and create childrens
	 * @throws WbemsmtException
	 */
	public void updateControls() throws WbemsmtException {
			   countAndCreateChildren();
			   adapter.updateControls(this);
		
			   		}

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
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
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       WelcomeDataContainerImpl source = (WelcomeDataContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_WelcomeText().copyFrom(source.get_usr_WelcomeText());
		        		   get_usr_SharePicture().copyFrom(source.get_usr_SharePicture());
		        		   get_usr_LinkCreateShare().copyFrom(source.get_usr_LinkCreateShare());
		        		   get_usr_Memo().copyFrom(source.get_usr_Memo());
		        		   get_usr_LinkCreatePrinter().copyFrom(source.get_usr_LinkCreatePrinter());
		        		   get_usr_LinkCreateUser().copyFrom(source.get_usr_LinkCreateUser());
		        		   get_usr_Actions().copyFrom(source.get_usr_Actions());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}