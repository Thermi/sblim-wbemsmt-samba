/** 
  * GUIShareGlobalsDataContainerImpl.java
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
  * Description: Container with UI-extensions for global share settings
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.global;

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobals;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;

public class GUIShareGlobalsDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.global.GUIShareGlobalsDataContainer
			, org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobalsHeader		
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_CaseSensitive;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DosFiletimes;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_HideDotFiles;

    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_AclCompatibility;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_EASupport;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_NTACLSupport;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_u;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_g;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_s;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_user_r;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_user_w;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_user_x;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_group_r;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_group_w;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_group_x;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_other_r;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_other_w;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Create_other_x;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_u;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_g;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_s;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_user_r;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_user_w;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_user_x;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_group_r;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_group_w;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_group_x;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_other_r;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_other_w;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_other_x;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_u;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_g;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_s;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_user_r;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_user_w;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_user_x;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_group_r;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_group_w;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_group_x;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_other_r;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_other_w;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Directory_security_other_x;

    			
				private java.util.List<AdminUsersInShareGlobals> icUsers = new java.util.ArrayList<AdminUsersInShareGlobals>();
		
		private MultiLinePanel usersPanel;
		private int usersCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_SambaUserName;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_Admin;
				
	
		
			GUIShareGlobalsDataContainerImplLayouter layouter = null;
		
		public GUIShareGlobalsDataContainerImplLayouter getLayouter()
		{
			return layouter;
		}	
	
	public GUIShareGlobalsDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "GUIShareGlobalsDataContainer.caption",false);
				
				
		
				
    			
    				layouter = new GUIShareGlobalsDataContainerImplLayouter();
			//layout is done in the edit-method of the Editbean
			//layouter.layout(getPanelForCustomLayout(),this,bundle);
				
		setFooter(getPanelForCustomLayout(),"GUIShareGlobalsDataContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_CaseSensitive() {
    		if (ic_CaseSensitive == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.CaseSensitive");
				String binding = expressionPrefix + "_CaseSensitive.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_CaseSensitive = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_CaseSensitive;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DosFiletimes() {
    		if (ic_DosFiletimes == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.DosFiletimes");
				String binding = expressionPrefix + "_DosFiletimes.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_DosFiletimes = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_DosFiletimes;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_HideDotFiles() {
    		if (ic_HideDotFiles == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.HideDotFiles");
				String binding = expressionPrefix + "_HideDotFiles.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_HideDotFiles = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_HideDotFiles;
    	}
			/**
		* 
		* DataType UNSIGNED_INT8
		* UIType COMBOBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_AclCompatibility() {
    		if (ic_AclCompatibility == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.AclCompatibility");
				String binding = expressionPrefix + "_AclCompatibility.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt8StringConverter();
				boolean readOnly = false;
    			ic_AclCompatibility = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFComboBoxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_AclCompatibility;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_EASupport() {
    		if (ic_EASupport == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.EASupport");
				String binding = expressionPrefix + "_EASupport.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_EASupport = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_EASupport;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_NTACLSupport() {
    		if (ic_NTACLSupport == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.NTACLSupport");
				String binding = expressionPrefix + "_NTACLSupport.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_NTACLSupport = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_NTACLSupport;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_u() {
    		if (ic_usr_Create_u == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.create_u");
				String binding = expressionPrefix + "_usr_Create_u.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_u = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Create_u;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_g() {
    		if (ic_usr_Create_g == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.create_g");
				String binding = expressionPrefix + "_usr_Create_g.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_g = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Create_g;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_s() {
    		if (ic_usr_Create_s == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.create_s");
				String binding = expressionPrefix + "_usr_Create_s.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_s = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Create_s;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_user_r() {
    		if (ic_usr_Create_user_r == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.create_user_r");
				String binding = expressionPrefix + "_usr_Create_user_r.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_user_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Create_user_r;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_user_w() {
    		if (ic_usr_Create_user_w == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.create_user_w");
				String binding = expressionPrefix + "_usr_Create_user_w.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_user_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Create_user_w;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_user_x() {
    		if (ic_usr_Create_user_x == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.create_user_x");
				String binding = expressionPrefix + "_usr_Create_user_x.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_user_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Create_user_x;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_group_r() {
    		if (ic_usr_Create_group_r == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.create_group_r");
				String binding = expressionPrefix + "_usr_Create_group_r.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_group_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Create_group_r;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_group_w() {
    		if (ic_usr_Create_group_w == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.create_group_w");
				String binding = expressionPrefix + "_usr_Create_group_w.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_group_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Create_group_w;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_group_x() {
    		if (ic_usr_Create_group_x == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.create_group_x");
				String binding = expressionPrefix + "_usr_Create_group_x.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_group_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Create_group_x;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_other_r() {
    		if (ic_usr_Create_other_r == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.create_other_r");
				String binding = expressionPrefix + "_usr_Create_other_r.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_other_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Create_other_r;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_other_w() {
    		if (ic_usr_Create_other_w == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.create_other_w");
				String binding = expressionPrefix + "_usr_Create_other_w.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_other_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Create_other_w;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Create_other_x() {
    		if (ic_usr_Create_other_x == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.create_other_x");
				String binding = expressionPrefix + "_usr_Create_other_x.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_other_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Create_other_x;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_u() {
    		if (ic_usr_Directory_u == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_u");
				String binding = expressionPrefix + "_usr_Directory_u.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_u = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_u;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_g() {
    		if (ic_usr_Directory_g == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_g");
				String binding = expressionPrefix + "_usr_Directory_g.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_g = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_g;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_s() {
    		if (ic_usr_Directory_s == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_s");
				String binding = expressionPrefix + "_usr_Directory_s.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_s = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_s;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_user_r() {
    		if (ic_usr_Directory_user_r == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_user_r");
				String binding = expressionPrefix + "_usr_Directory_user_r.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_user_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_user_r;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_user_w() {
    		if (ic_usr_Directory_user_w == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_user_w");
				String binding = expressionPrefix + "_usr_Directory_user_w.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_user_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_user_w;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_user_x() {
    		if (ic_usr_Directory_user_x == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_user_x");
				String binding = expressionPrefix + "_usr_Directory_user_x.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_user_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_user_x;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_group_r() {
    		if (ic_usr_Directory_group_r == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_group_r");
				String binding = expressionPrefix + "_usr_Directory_group_r.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_group_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_group_r;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_group_w() {
    		if (ic_usr_Directory_group_w == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_group_w");
				String binding = expressionPrefix + "_usr_Directory_group_w.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_group_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_group_w;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_group_x() {
    		if (ic_usr_Directory_group_x == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_group_x");
				String binding = expressionPrefix + "_usr_Directory_group_x.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_group_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_group_x;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_other_r() {
    		if (ic_usr_Directory_other_r == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_other_r");
				String binding = expressionPrefix + "_usr_Directory_other_r.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_other_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_other_r;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_other_w() {
    		if (ic_usr_Directory_other_w == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_other_w");
				String binding = expressionPrefix + "_usr_Directory_other_w.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_other_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_other_w;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_other_x() {
    		if (ic_usr_Directory_other_x == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_other_x");
				String binding = expressionPrefix + "_usr_Directory_other_x.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_other_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_other_x;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_u() {
    		if (ic_usr_Directory_security_u == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_security_u");
				String binding = expressionPrefix + "_usr_Directory_security_u.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_u = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_security_u;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_g() {
    		if (ic_usr_Directory_security_g == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_security_g");
				String binding = expressionPrefix + "_usr_Directory_security_g.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_g = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_security_g;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_s() {
    		if (ic_usr_Directory_security_s == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_security_s");
				String binding = expressionPrefix + "_usr_Directory_security_s.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_s = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_security_s;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_user_r() {
    		if (ic_usr_Directory_security_user_r == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_security_user_r");
				String binding = expressionPrefix + "_usr_Directory_security_user_r.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_user_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_security_user_r;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_user_w() {
    		if (ic_usr_Directory_security_user_w == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_security_user_w");
				String binding = expressionPrefix + "_usr_Directory_security_user_w.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_user_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_security_user_w;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_user_x() {
    		if (ic_usr_Directory_security_user_x == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_security_user_x");
				String binding = expressionPrefix + "_usr_Directory_security_user_x.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_user_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_security_user_x;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_group_r() {
    		if (ic_usr_Directory_security_group_r == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_security_group_r");
				String binding = expressionPrefix + "_usr_Directory_security_group_r.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_group_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_security_group_r;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_group_w() {
    		if (ic_usr_Directory_security_group_w == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_security_group_w");
				String binding = expressionPrefix + "_usr_Directory_security_group_w.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_group_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_security_group_w;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_group_x() {
    		if (ic_usr_Directory_security_group_x == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_security_group_x");
				String binding = expressionPrefix + "_usr_Directory_security_group_x.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_group_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_security_group_x;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_other_r() {
    		if (ic_usr_Directory_security_other_r == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_security_other_r");
				String binding = expressionPrefix + "_usr_Directory_security_other_r.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_other_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_security_other_r;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_other_w() {
    		if (ic_usr_Directory_security_other_w == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_security_other_w");
				String binding = expressionPrefix + "_usr_Directory_security_other_w.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_other_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_security_other_w;
    	}
			/**
		* only one part of the bitmask
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Directory_security_other_x() {
    		if (ic_usr_Directory_security_other_x == null)
    		{
				String label = bundle.getString("GUIShareGlobalsDataContainer.directory_security_other_x");
				String binding = expressionPrefix + "_usr_Directory_security_other_x.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_other_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Directory_security_other_x;
    	}
		
			
				
		/**
		* 
		* linked container AdminUsersInShareGlobals
		*/
				public java.util.List<AdminUsersInShareGlobals> getUsers()
				{
						return icUsers;
		}
		
		public MultiLinePanel getUsersPanel()
		{
			if (usersPanel == null)
			{
  			   usersPanel = new UsersPanel(adapter,expressionPrefix, // the prefix for binding values
							  "#{" +  expressionPrefix + "usersPanel", // binding for Title
							  "AdminUsersInShareGlobals_AsUsers_InGUIShareGlobalsDataContainer.caption", //Key for title
							  org.sblim.wbemsmt.jsf.samba.container.global.AdminUsersInShareGlobals_AsUsers_InGUIShareGlobalsDataContainerImpl.COLS);
			  addUsersHeader();							  
			}		
			
			return usersPanel;
		}

		static class UsersPanel extends MultiLinePanel
		{
			public UsersPanel(AbstractBaseCimAdapter adapter, String expressionPrefix, String bindigForTitle, String keyForTitle, int cols) {
				super(adapter, expressionPrefix, bindigForTitle, keyForTitle, "users", cols);
			}
	
			protected String getOrientationOfColumnAsCss(int column) {
				return org.sblim.wbemsmt.jsf.samba.container.global.AdminUsersInShareGlobals_AsUsers_InGUIShareGlobalsDataContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	private void addUsers(org.sblim.wbemsmt.jsf.samba.container.global.AdminUsersInShareGlobals_AsUsers_InGUIShareGlobalsDataContainerImpl child) {

		getUsers().add(child);
		getUsersPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getUsers_usr_SambaUserNameHeader()).getDependentChildFields().add(child.get_usr_SambaUserName());
					//((LabeledJSFInputComponent)getUsers_usr_AdminHeader()).getDependentChildFields().add(child.get_usr_Admin());
			}
	
	private void clearUsers() {
		getUsers().clear();
	}

	/**
	* 
	* Get the Users for the UI repesentation
	*/
	public java.util.List<AdminUsersInShareGlobals> getUsersForUI()
	{
				
		List<AdminUsersInShareGlobals> result = new ArrayList<AdminUsersInShareGlobals>();
		result.addAll(icUsers);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.jsf.samba.container.global.AdminUsersInShareGlobals_AsUsers_InGUIShareGlobalsDataContainerImpl item = new org.sblim.wbemsmt.jsf.samba.container.global.AdminUsersInShareGlobals_AsUsers_InGUIShareGlobalsDataContainerImpl((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)adapter,expressionPrefix, result.size());
				DataContainerUtil.setVisibilityOfFields(item,false);
				result.add(item);
			} catch (WbemsmtException e) {
				e.printStackTrace();
			}
		}
		
		usersPanel.setList(result);
		
		return result;
	}		
		
		
	/**
	 * manages the style for whole footer which is displayed if there are no entries in the table or if there is a custom panel in it
	 * @return
	 */
	public String getUsersFooterClass()
	{
		return "multiLineRowHeader center "  
		+ (icUsers.size() == 0 || getUsersPanel().isHavingCustomFooter() ?  "visible " : "hidden ");
	}
	
	/**
	 * manages the style for the label which is displayed if there are no entries in the table
	 * @return
	 */
	public String getUsersAvailableFooterClass()
	{
		return icUsers.size() > 0 ? " hidden " : " visible ";
	}
	
	private void addUsersHeader() {
		getUsersPanel().setHeader(getUsersHeaderComponents(),getUsersFieldNames());
	}
	
	private LabeledJSFInputComponent[] getUsersHeaderComponents() {
		return new LabeledJSFInputComponent[]{
							(LabeledJSFInputComponent)getUsersHeader_usr_SambaUserName(),
							(LabeledJSFInputComponent)getUsersHeader_usr_Admin(),
						};
	}

	private String[] getUsersFieldNames() {
		return new String[]{
							"_usr_SambaUserName",
							"_usr_Admin",
						};
	}

	   /**
		* Header for:
		* 
		* linked container AdminUsersInShareGlobals
		*/
		public org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobalsHeader getUsersHeader()
		{
			return this;
		}
		
				/**
   		 * Header for field SambaUserName
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_SambaUserName() {
    		if (icUsersHeader_usr_SambaUserName == null)
    		{
				String label = bundle.getString("AdminUsersInShareGlobals.SambaUserName");
				String binding = expressionPrefix + "usersHeader_usr_SambaUserName.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			icUsersHeader_usr_SambaUserName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icUsersHeader_usr_SambaUserName).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icUsersHeader_usr_SambaUserName).setHeader(true);
			
    		return icUsersHeader_usr_SambaUserName;
    	}
				/**
   		 * Header for field admin
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_Admin() {
    		if (icUsersHeader_usr_Admin == null)
    		{
				String label = bundle.getString("AdminUsersInShareGlobals.admin");
				String binding = expressionPrefix + "usersHeader_usr_Admin.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icUsersHeader_usr_Admin = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icUsersHeader_usr_Admin).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icUsersHeader_usr_Admin).setHeader(true);
			
    		return icUsersHeader_usr_Admin;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_CaseSensitive != null)
    		{
				ic_CaseSensitive.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.CaseSensitive"));
    		}
	    		if (ic_DosFiletimes != null)
    		{
				ic_DosFiletimes.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.DosFiletimes"));
    		}
	    		if (ic_HideDotFiles != null)
    		{
				ic_HideDotFiles.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.HideDotFiles"));
    		}
	    		if (ic_AclCompatibility != null)
    		{
				ic_AclCompatibility.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.AclCompatibility"));
    		}
	    		if (ic_EASupport != null)
    		{
				ic_EASupport.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.EASupport"));
    		}
	    		if (ic_NTACLSupport != null)
    		{
				ic_NTACLSupport.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.NTACLSupport"));
    		}
	    		if (ic_usr_Create_u != null)
    		{
				ic_usr_Create_u.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.create_u"));
    		}
	    		if (ic_usr_Create_g != null)
    		{
				ic_usr_Create_g.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.create_g"));
    		}
	    		if (ic_usr_Create_s != null)
    		{
				ic_usr_Create_s.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.create_s"));
    		}
	    		if (ic_usr_Create_user_r != null)
    		{
				ic_usr_Create_user_r.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.create_user_r"));
    		}
	    		if (ic_usr_Create_user_w != null)
    		{
				ic_usr_Create_user_w.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.create_user_w"));
    		}
	    		if (ic_usr_Create_user_x != null)
    		{
				ic_usr_Create_user_x.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.create_user_x"));
    		}
	    		if (ic_usr_Create_group_r != null)
    		{
				ic_usr_Create_group_r.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.create_group_r"));
    		}
	    		if (ic_usr_Create_group_w != null)
    		{
				ic_usr_Create_group_w.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.create_group_w"));
    		}
	    		if (ic_usr_Create_group_x != null)
    		{
				ic_usr_Create_group_x.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.create_group_x"));
    		}
	    		if (ic_usr_Create_other_r != null)
    		{
				ic_usr_Create_other_r.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.create_other_r"));
    		}
	    		if (ic_usr_Create_other_w != null)
    		{
				ic_usr_Create_other_w.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.create_other_w"));
    		}
	    		if (ic_usr_Create_other_x != null)
    		{
				ic_usr_Create_other_x.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.create_other_x"));
    		}
	    		if (ic_usr_Directory_u != null)
    		{
				ic_usr_Directory_u.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_u"));
    		}
	    		if (ic_usr_Directory_g != null)
    		{
				ic_usr_Directory_g.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_g"));
    		}
	    		if (ic_usr_Directory_s != null)
    		{
				ic_usr_Directory_s.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_s"));
    		}
	    		if (ic_usr_Directory_user_r != null)
    		{
				ic_usr_Directory_user_r.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_user_r"));
    		}
	    		if (ic_usr_Directory_user_w != null)
    		{
				ic_usr_Directory_user_w.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_user_w"));
    		}
	    		if (ic_usr_Directory_user_x != null)
    		{
				ic_usr_Directory_user_x.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_user_x"));
    		}
	    		if (ic_usr_Directory_group_r != null)
    		{
				ic_usr_Directory_group_r.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_group_r"));
    		}
	    		if (ic_usr_Directory_group_w != null)
    		{
				ic_usr_Directory_group_w.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_group_w"));
    		}
	    		if (ic_usr_Directory_group_x != null)
    		{
				ic_usr_Directory_group_x.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_group_x"));
    		}
	    		if (ic_usr_Directory_other_r != null)
    		{
				ic_usr_Directory_other_r.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_other_r"));
    		}
	    		if (ic_usr_Directory_other_w != null)
    		{
				ic_usr_Directory_other_w.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_other_w"));
    		}
	    		if (ic_usr_Directory_other_x != null)
    		{
				ic_usr_Directory_other_x.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_other_x"));
    		}
	    		if (ic_usr_Directory_security_u != null)
    		{
				ic_usr_Directory_security_u.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_security_u"));
    		}
	    		if (ic_usr_Directory_security_g != null)
    		{
				ic_usr_Directory_security_g.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_security_g"));
    		}
	    		if (ic_usr_Directory_security_s != null)
    		{
				ic_usr_Directory_security_s.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_security_s"));
    		}
	    		if (ic_usr_Directory_security_user_r != null)
    		{
				ic_usr_Directory_security_user_r.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_security_user_r"));
    		}
	    		if (ic_usr_Directory_security_user_w != null)
    		{
				ic_usr_Directory_security_user_w.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_security_user_w"));
    		}
	    		if (ic_usr_Directory_security_user_x != null)
    		{
				ic_usr_Directory_security_user_x.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_security_user_x"));
    		}
	    		if (ic_usr_Directory_security_group_r != null)
    		{
				ic_usr_Directory_security_group_r.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_security_group_r"));
    		}
	    		if (ic_usr_Directory_security_group_w != null)
    		{
				ic_usr_Directory_security_group_w.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_security_group_w"));
    		}
	    		if (ic_usr_Directory_security_group_x != null)
    		{
				ic_usr_Directory_security_group_x.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_security_group_x"));
    		}
	    		if (ic_usr_Directory_security_other_r != null)
    		{
				ic_usr_Directory_security_other_r.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_security_other_r"));
    		}
	    		if (ic_usr_Directory_security_other_w != null)
    		{
				ic_usr_Directory_security_other_w.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_security_other_w"));
    		}
	    		if (ic_usr_Directory_security_other_x != null)
    		{
				ic_usr_Directory_security_other_x.setLabelText(bundle.getString("GUIShareGlobalsDataContainer.directory_security_other_x"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesSamba"};
	}

	public void countAndCreateChildren() throws WbemsmtException {
	
    			try
		{
			int count = adapter.count("users",org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobals.class, this);
	        if (count != usersCount)
	        {
	           usersCount = count;
	           clearUsers();
			   for (int i=0; i < count ; i++) {
	    			addUsers(new org.sblim.wbemsmt.jsf.samba.container.global.AdminUsersInShareGlobals_AsUsers_InGUIShareGlobalsDataContainerImpl((org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter)adapter,expressionPrefix, i));
			   }
	        }
			getUsersPanel().setList(getUsers());				   
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
		
			   				      getUsersPanel().updateRows();				
			   		}

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    				fields.add(get_CaseSensitive());
    				fields.add(get_DosFiletimes());
    				fields.add(get_HideDotFiles());
    				fields.add(get_AclCompatibility());
    				fields.add(get_EASupport());
    				fields.add(get_NTACLSupport());
    				fields.add(get_usr_Create_u());
    				fields.add(get_usr_Create_g());
    				fields.add(get_usr_Create_s());
    				fields.add(get_usr_Create_user_r());
    				fields.add(get_usr_Create_user_w());
    				fields.add(get_usr_Create_user_x());
    				fields.add(get_usr_Create_group_r());
    				fields.add(get_usr_Create_group_w());
    				fields.add(get_usr_Create_group_x());
    				fields.add(get_usr_Create_other_r());
    				fields.add(get_usr_Create_other_w());
    				fields.add(get_usr_Create_other_x());
    				fields.add(get_usr_Directory_u());
    				fields.add(get_usr_Directory_g());
    				fields.add(get_usr_Directory_s());
    				fields.add(get_usr_Directory_user_r());
    				fields.add(get_usr_Directory_user_w());
    				fields.add(get_usr_Directory_user_x());
    				fields.add(get_usr_Directory_group_r());
    				fields.add(get_usr_Directory_group_w());
    				fields.add(get_usr_Directory_group_x());
    				fields.add(get_usr_Directory_other_r());
    				fields.add(get_usr_Directory_other_w());
    				fields.add(get_usr_Directory_other_x());
    				fields.add(get_usr_Directory_security_u());
    				fields.add(get_usr_Directory_security_g());
    				fields.add(get_usr_Directory_security_s());
    				fields.add(get_usr_Directory_security_user_r());
    				fields.add(get_usr_Directory_security_user_w());
    				fields.add(get_usr_Directory_security_user_x());
    				fields.add(get_usr_Directory_security_group_r());
    				fields.add(get_usr_Directory_security_group_w());
    				fields.add(get_usr_Directory_security_group_x());
    				fields.add(get_usr_Directory_security_other_r());
    				fields.add(get_usr_Directory_security_other_w());
    				fields.add(get_usr_Directory_security_other_x());
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    		childs.addAll(getUsers());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       GUIShareGlobalsDataContainerImpl source = (GUIShareGlobalsDataContainerImpl)sourceContainer;
		    		    
    	    		   get_CaseSensitive().copyFrom(source.get_CaseSensitive());
		        		   get_DosFiletimes().copyFrom(source.get_DosFiletimes());
		        		   get_HideDotFiles().copyFrom(source.get_HideDotFiles());
		        		   get_AclCompatibility().copyFrom(source.get_AclCompatibility());
		        		   get_EASupport().copyFrom(source.get_EASupport());
		        		   get_NTACLSupport().copyFrom(source.get_NTACLSupport());
		        		   get_usr_Create_u().copyFrom(source.get_usr_Create_u());
		        		   get_usr_Create_g().copyFrom(source.get_usr_Create_g());
		        		   get_usr_Create_s().copyFrom(source.get_usr_Create_s());
		        		   get_usr_Create_user_r().copyFrom(source.get_usr_Create_user_r());
		        		   get_usr_Create_user_w().copyFrom(source.get_usr_Create_user_w());
		        		   get_usr_Create_user_x().copyFrom(source.get_usr_Create_user_x());
		        		   get_usr_Create_group_r().copyFrom(source.get_usr_Create_group_r());
		        		   get_usr_Create_group_w().copyFrom(source.get_usr_Create_group_w());
		        		   get_usr_Create_group_x().copyFrom(source.get_usr_Create_group_x());
		        		   get_usr_Create_other_r().copyFrom(source.get_usr_Create_other_r());
		        		   get_usr_Create_other_w().copyFrom(source.get_usr_Create_other_w());
		        		   get_usr_Create_other_x().copyFrom(source.get_usr_Create_other_x());
		        		   get_usr_Directory_u().copyFrom(source.get_usr_Directory_u());
		        		   get_usr_Directory_g().copyFrom(source.get_usr_Directory_g());
		        		   get_usr_Directory_s().copyFrom(source.get_usr_Directory_s());
		        		   get_usr_Directory_user_r().copyFrom(source.get_usr_Directory_user_r());
		        		   get_usr_Directory_user_w().copyFrom(source.get_usr_Directory_user_w());
		        		   get_usr_Directory_user_x().copyFrom(source.get_usr_Directory_user_x());
		        		   get_usr_Directory_group_r().copyFrom(source.get_usr_Directory_group_r());
		        		   get_usr_Directory_group_w().copyFrom(source.get_usr_Directory_group_w());
		        		   get_usr_Directory_group_x().copyFrom(source.get_usr_Directory_group_x());
		        		   get_usr_Directory_other_r().copyFrom(source.get_usr_Directory_other_r());
		        		   get_usr_Directory_other_w().copyFrom(source.get_usr_Directory_other_w());
		        		   get_usr_Directory_other_x().copyFrom(source.get_usr_Directory_other_x());
		        		   get_usr_Directory_security_u().copyFrom(source.get_usr_Directory_security_u());
		        		   get_usr_Directory_security_g().copyFrom(source.get_usr_Directory_security_g());
		        		   get_usr_Directory_security_s().copyFrom(source.get_usr_Directory_security_s());
		        		   get_usr_Directory_security_user_r().copyFrom(source.get_usr_Directory_security_user_r());
		        		   get_usr_Directory_security_user_w().copyFrom(source.get_usr_Directory_security_user_w());
		        		   get_usr_Directory_security_user_x().copyFrom(source.get_usr_Directory_security_user_x());
		        		   get_usr_Directory_security_group_r().copyFrom(source.get_usr_Directory_security_group_r());
		        		   get_usr_Directory_security_group_w().copyFrom(source.get_usr_Directory_security_group_w());
		        		   get_usr_Directory_security_group_x().copyFrom(source.get_usr_Directory_security_group_x());
		        		   get_usr_Directory_security_other_r().copyFrom(source.get_usr_Directory_security_other_r());
		        		   get_usr_Directory_security_other_w().copyFrom(source.get_usr_Directory_security_other_w());
		        		   get_usr_Directory_security_other_x().copyFrom(source.get_usr_Directory_security_other_x());
		    		
    	    		   List<AdminUsersInShareGlobals> targetListForUsers = getUsers();
    		   List<AdminUsersInShareGlobals> sourceListForUsers = source.getUsers();
    		   if (sourceListForUsers.size() != targetListForUsers.size())
    		   {
    			      throw new WbemsmtException(WbemsmtException.ERR_FAILED,"The Lists are not from same size. Source is " + sourceListForUsers.size() + " and target is " + targetListForUsers.size() );
    		   }
			       for (int ii=0; ii < sourceListForUsers.size(); ii++)
			       {
				          ((DataContainer) targetListForUsers.get(ii)).copyFrom(((DataContainer) sourceListForUsers.get(ii)));
			        }
			
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}