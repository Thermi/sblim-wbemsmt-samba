/** 
  * ShareListItemDataContainer_AsShares_InShareListDataContainerImpl.java
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
  * @template: org/sblim/wbemsmt/dcg/templates/jsf/containerImplMultiLine.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: share within a list of shares
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.share;

import java.util.*;
import org.sblim.wbemsmt.tools.input.jsf.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;


	
public class ShareListItemDataContainer_AsShares_InShareListDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel2 implements org.sblim.wbemsmt.samba.bl.container.share.ShareListItemDataContainer {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Name;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Available;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Comment;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Path;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Browsable;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_GuestOK;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_GuestOnly;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_HostsAllow;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_HostsDeny;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_ReadOnly;
		
	public static final int COLS = 10;
	
	public static String[] orientationOfColumnAsCss = new String[]{
    				"left",
    				"left",
    				"left",
    				"left",
    				"left",
    				"left",
    				"left",
    				"left",
    				"left",
    				"left",
    		
	};
	
	
	
	public ShareListItemDataContainer_AsShares_InShareListDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String expressionPrefix,int index) throws WbemsmtException {
	    super(adapter,expressionPrefix,index);
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Name() {
    		if (ic_Name == null)
    		{
				String label = bundle.getString("ShareListItemDataContainer.Name");
				String binding = expressionPrefix + "shares["+ index +"]._Name.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_Name = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)ic_Name).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_Name;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Available() {
    		if (ic_Available == null)
    		{
				String label = bundle.getString("ShareListItemDataContainer.Available");
				String binding = expressionPrefix + "shares["+ index +"]._Available.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_Available = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)ic_Available).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_Available;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Comment() {
    		if (ic_Comment == null)
    		{
				String label = bundle.getString("ShareListItemDataContainer.Comment");
				String binding = expressionPrefix + "shares["+ index +"]._Comment.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_Comment = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)ic_Comment).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_Comment;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Path() {
    		if (ic_Path == null)
    		{
				String label = bundle.getString("ShareListItemDataContainer.Path");
				String binding = expressionPrefix + "shares["+ index +"]._Path.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_Path = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)ic_Path).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_Path;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Browsable() {
    		if (ic_Browsable == null)
    		{
				String label = bundle.getString("ShareListItemDataContainer.Browsable");
				String binding = expressionPrefix + "shares["+ index +"]._Browsable.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_Browsable = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)ic_Browsable).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_Browsable;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_GuestOK() {
    		if (ic_GuestOK == null)
    		{
				String label = bundle.getString("ShareListItemDataContainer.GuestOK");
				String binding = expressionPrefix + "shares["+ index +"]._GuestOK.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_GuestOK = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)ic_GuestOK).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_GuestOK;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_GuestOnly() {
    		if (ic_GuestOnly == null)
    		{
				String label = bundle.getString("ShareListItemDataContainer.GuestOnly");
				String binding = expressionPrefix + "shares["+ index +"]._GuestOnly.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_GuestOnly = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)ic_GuestOnly).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_GuestOnly;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_HostsAllow() {
    		if (ic_HostsAllow == null)
    		{
				String label = bundle.getString("ShareListItemDataContainer.HostsAllow");
				String binding = expressionPrefix + "shares["+ index +"]._HostsAllow.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_HostsAllow = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)ic_HostsAllow).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_HostsAllow;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_HostsDeny() {
    		if (ic_HostsDeny == null)
    		{
				String label = bundle.getString("ShareListItemDataContainer.HostsDeny");
				String binding = expressionPrefix + "shares["+ index +"]._HostsDeny.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_HostsDeny = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)ic_HostsDeny).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_HostsDeny;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_ReadOnly() {
    		if (ic_ReadOnly == null)
    		{
				String label = bundle.getString("ShareListItemDataContainer.ReadOnly");
				String binding = expressionPrefix + "shares["+ index +"]._ReadOnly.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_ReadOnly = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)ic_ReadOnly).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_ReadOnly;
    	}
		

	/**
	 * @return all the Components
	 */
	public LabeledJSFInputComponent[] getComponents() {
		return new LabeledJSFInputComponent[]{
						(LabeledJSFInputComponent)get_Name(),
						(LabeledJSFInputComponent)get_Available(),
						(LabeledJSFInputComponent)get_Comment(),
						(LabeledJSFInputComponent)get_Path(),
						(LabeledJSFInputComponent)get_Browsable(),
						(LabeledJSFInputComponent)get_GuestOK(),
						(LabeledJSFInputComponent)get_GuestOnly(),
						(LabeledJSFInputComponent)get_HostsAllow(),
						(LabeledJSFInputComponent)get_HostsDeny(),
						(LabeledJSFInputComponent)get_ReadOnly(),
					};
	}
	
	
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_Name != null)
    		{
				ic_Name.setLabelText(bundle.getString("ShareListItemDataContainer.Name"));
    		}
	    		if (ic_Available != null)
    		{
				ic_Available.setLabelText(bundle.getString("ShareListItemDataContainer.Available"));
    		}
	    		if (ic_Comment != null)
    		{
				ic_Comment.setLabelText(bundle.getString("ShareListItemDataContainer.Comment"));
    		}
	    		if (ic_Path != null)
    		{
				ic_Path.setLabelText(bundle.getString("ShareListItemDataContainer.Path"));
    		}
	    		if (ic_Browsable != null)
    		{
				ic_Browsable.setLabelText(bundle.getString("ShareListItemDataContainer.Browsable"));
    		}
	    		if (ic_GuestOK != null)
    		{
				ic_GuestOK.setLabelText(bundle.getString("ShareListItemDataContainer.GuestOK"));
    		}
	    		if (ic_GuestOnly != null)
    		{
				ic_GuestOnly.setLabelText(bundle.getString("ShareListItemDataContainer.GuestOnly"));
    		}
	    		if (ic_HostsAllow != null)
    		{
				ic_HostsAllow.setLabelText(bundle.getString("ShareListItemDataContainer.HostsAllow"));
    		}
	    		if (ic_HostsDeny != null)
    		{
				ic_HostsDeny.setLabelText(bundle.getString("ShareListItemDataContainer.HostsDeny"));
    		}
	    		if (ic_ReadOnly != null)
    		{
				ic_ReadOnly.setLabelText(bundle.getString("ShareListItemDataContainer.ReadOnly"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesSamba"};
	}
	
	protected String getOrientationOfColumnAsCss(int column) {
		return orientationOfColumnAsCss[column];
	}
	

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    				fields.add(get_Name());
    				fields.add(get_Available());
    				fields.add(get_Comment());
    				fields.add(get_Path());
    				fields.add(get_Browsable());
    				fields.add(get_GuestOK());
    				fields.add(get_GuestOnly());
    				fields.add(get_HostsAllow());
    				fields.add(get_HostsDeny());
    				fields.add(get_ReadOnly());
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
	    		       ShareListItemDataContainer_AsShares_InShareListDataContainerImpl source = (ShareListItemDataContainer_AsShares_InShareListDataContainerImpl)sourceContainer;
		    		    
    	    		   get_Name().copyFrom(source.get_Name());
		        		   get_Available().copyFrom(source.get_Available());
		        		   get_Comment().copyFrom(source.get_Comment());
		        		   get_Path().copyFrom(source.get_Path());
		        		   get_Browsable().copyFrom(source.get_Browsable());
		        		   get_GuestOK().copyFrom(source.get_GuestOK());
		        		   get_GuestOnly().copyFrom(source.get_GuestOnly());
		        		   get_HostsAllow().copyFrom(source.get_HostsAllow());
		        		   get_HostsDeny().copyFrom(source.get_HostsDeny());
		        		   get_ReadOnly().copyFrom(source.get_ReadOnly());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
	
	
	
}