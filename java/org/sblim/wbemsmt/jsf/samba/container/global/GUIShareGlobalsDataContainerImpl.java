/** 
  * GUIShareGlobalsDataContainerImpl.java
  *

 
 * (C) Copyright IBM Corp. 2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE COMMON PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Common Public License from
  * http://www.opensource.org/licenses/cpl1.0.php
  *
  * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
  * @template: ./tools-dcg/templates/jsf/containerImpl.vm
  *
  * Contributors: 
  * 
  * Description: Container with UI-extensions for global share settings
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.global;

import org.sblim.wbemsmt.exception.*;

public class GUIShareGlobalsDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.global.GUIShareGlobalsDataContainer {

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
    			private java.util.List icUsers = new java.util.ArrayList();
	
		
			GUIShareGlobalsDataContainerImplLayouter layouter = null;
		
		public GUIShareGlobalsDataContainerImplLayouter getLayouter()
		{
			return layouter;
		}	
	
	public GUIShareGlobalsDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {
		super(adapter,bindingPrefix, "GUIShareGlobalsDataContainer.caption");
		
				
    			
    				layouter = new GUIShareGlobalsDataContainerImplLayouter();//.layout(getPanelForCustomLayout(),this,bundle);
				
		setFooter(getInputFieldContainer(),"GUIShareGlobalsDataContainer.footerText");
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
				String binding = bindingPrefix + "_CaseSensitive.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_CaseSensitive = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_DosFiletimes.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_DosFiletimes = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_HideDotFiles.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_HideDotFiles = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_AclCompatibility.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt8StringConverter();
				boolean readOnly = false;
    			ic_AclCompatibility = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFComboBoxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_EASupport.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_EASupport = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_NTACLSupport.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_NTACLSupport = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Create_u.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_u = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Create_g.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_g = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Create_s.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_s = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Create_user_r.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_user_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Create_user_w.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_user_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Create_user_x.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_user_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Create_group_r.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_group_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Create_group_w.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_group_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Create_group_x.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_group_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Create_other_r.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_other_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Create_other_w.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_other_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Create_other_x.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Create_other_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_u.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_u = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_g.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_g = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_s.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_s = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_user_r.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_user_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_user_w.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_user_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_user_x.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_user_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_group_r.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_group_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_group_w.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_group_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_group_x.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_group_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_other_r.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_other_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_other_w.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_other_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_other_x.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_other_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_security_u.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_u = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_security_g.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_g = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_security_s.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_s = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_security_user_r.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_user_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_security_user_w.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_user_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_security_user_x.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_user_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_security_group_r.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_group_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_security_group_w.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_group_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_security_group_x.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_group_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_security_other_r.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_other_r = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_security_other_w.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_other_w = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
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
				String binding = bindingPrefix + "_usr_Directory_security_other_x.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Directory_security_other_x = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
    		}
    		return ic_usr_Directory_security_other_x;
    	}
		
			
		/**
		* 
		* linked container AdminUsersInShareGlobals
		*/
		public java.util.List getUsers()
		{
			return icUsers;
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

	
}