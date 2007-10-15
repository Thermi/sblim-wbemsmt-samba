/** 
  * GUIShareGlobalsDataContainerImpl.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/cmd/containerImpl.vm
  *
  * Contributors: 
  * 
  * Description: Container with UI-extensions for global share settings
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.container.global;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class GUIShareGlobalsDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.global.GUIShareGlobalsDataContainer
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
    			
		
		private java.util.List icUsers = new java.util.ArrayList();

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_SambaUserName;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_Admin;
		
	
		
	public GUIShareGlobalsDataContainerImpl(AbstractBaseCimAdapter adapter) throws InitContainerException {
		super();
		setAdapter(adapter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.CaseSensitive");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_CaseSensitive = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.DosFiletimes");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_DosFiletimes = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.HideDotFiles");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_HideDotFiles = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.AclCompatibility");
				org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt8StringArrayConverter();
    			ic_AclCompatibility = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.EASupport");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_EASupport = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.NTACLSupport");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_NTACLSupport = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.create_u");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_u = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.create_g");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_g = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.create_s");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_s = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.create_user_r");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_user_r = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.create_user_w");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_user_w = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.create_user_x");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_user_x = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.create_group_r");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_group_r = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.create_group_w");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_group_w = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.create_group_x");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_group_x = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.create_other_r");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_other_r = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.create_other_w");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_other_w = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.create_other_x");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_other_x = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_u");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_u = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_g");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_g = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_s");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_s = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_user_r");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_user_r = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_user_w");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_user_w = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_user_x");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_user_x = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_group_r");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_group_r = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_group_w");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_group_w = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_group_x");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_group_x = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_other_r");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_other_r = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_other_w");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_other_w = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_other_x");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_other_x = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_security_u");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_u = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_security_g");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_g = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_security_s");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_s = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_security_user_r");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_user_r = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_security_user_w");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_user_w = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_security_user_x");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_user_x = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_security_group_r");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_group_r = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_security_group_w");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_group_w = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_security_group_x");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_group_x = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_security_other_r");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_other_r = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_security_other_w");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_other_w = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.directory_security_other_x");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_other_x = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
    			String label = getAdapter().getBundle().getString("AdminUsersInShareGlobals.SambaUserName");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			icUsersHeader_usr_SambaUserName = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icUsersHeader_usr_SambaUserName;
    	    }
				/**
   		 * Header for field admin
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_Admin() {
    		if (icUsersHeader_usr_Admin == null)
    		{
    			String label = getAdapter().getBundle().getString("AdminUsersInShareGlobals.admin");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			icUsersHeader_usr_Admin = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icUsersHeader_usr_Admin;
    	    }
		

	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_CaseSensitive().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_CaseSensitive()).getValue();
        				printStream.println(get_CaseSensitive().getLabelText() + ": " + value);
   			}
   			   			   			if (get_DosFiletimes().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_DosFiletimes()).getValue();
        				printStream.println(get_DosFiletimes().getLabelText() + ": " + value);
   			}
   			   			   			if (get_HideDotFiles().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_HideDotFiles()).getValue();
        				printStream.println(get_HideDotFiles().getLabelText() + ": " + value);
   			}
   			   			   			if (get_AclCompatibility().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_AclCompatibility()).getValue();
        				printStream.println(get_AclCompatibility().getLabelText() + ": " + value);
   			}
   			   			   			if (get_EASupport().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_EASupport()).getValue();
        				printStream.println(get_EASupport().getLabelText() + ": " + value);
   			}
   			   			   			if (get_NTACLSupport().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_NTACLSupport()).getValue();
        				printStream.println(get_NTACLSupport().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Create_u().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Create_u()).getValue();
        				printStream.println(get_usr_Create_u().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Create_g().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Create_g()).getValue();
        				printStream.println(get_usr_Create_g().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Create_s().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Create_s()).getValue();
        				printStream.println(get_usr_Create_s().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Create_user_r().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Create_user_r()).getValue();
        				printStream.println(get_usr_Create_user_r().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Create_user_w().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Create_user_w()).getValue();
        				printStream.println(get_usr_Create_user_w().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Create_user_x().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Create_user_x()).getValue();
        				printStream.println(get_usr_Create_user_x().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Create_group_r().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Create_group_r()).getValue();
        				printStream.println(get_usr_Create_group_r().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Create_group_w().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Create_group_w()).getValue();
        				printStream.println(get_usr_Create_group_w().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Create_group_x().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Create_group_x()).getValue();
        				printStream.println(get_usr_Create_group_x().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Create_other_r().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Create_other_r()).getValue();
        				printStream.println(get_usr_Create_other_r().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Create_other_w().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Create_other_w()).getValue();
        				printStream.println(get_usr_Create_other_w().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Create_other_x().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Create_other_x()).getValue();
        				printStream.println(get_usr_Create_other_x().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_u().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_u()).getValue();
        				printStream.println(get_usr_Directory_u().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_g().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_g()).getValue();
        				printStream.println(get_usr_Directory_g().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_s().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_s()).getValue();
        				printStream.println(get_usr_Directory_s().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_user_r().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_user_r()).getValue();
        				printStream.println(get_usr_Directory_user_r().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_user_w().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_user_w()).getValue();
        				printStream.println(get_usr_Directory_user_w().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_user_x().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_user_x()).getValue();
        				printStream.println(get_usr_Directory_user_x().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_group_r().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_group_r()).getValue();
        				printStream.println(get_usr_Directory_group_r().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_group_w().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_group_w()).getValue();
        				printStream.println(get_usr_Directory_group_w().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_group_x().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_group_x()).getValue();
        				printStream.println(get_usr_Directory_group_x().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_other_r().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_other_r()).getValue();
        				printStream.println(get_usr_Directory_other_r().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_other_w().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_other_w()).getValue();
        				printStream.println(get_usr_Directory_other_w().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_other_x().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_other_x()).getValue();
        				printStream.println(get_usr_Directory_other_x().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_security_u().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_security_u()).getValue();
        				printStream.println(get_usr_Directory_security_u().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_security_g().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_security_g()).getValue();
        				printStream.println(get_usr_Directory_security_g().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_security_s().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_security_s()).getValue();
        				printStream.println(get_usr_Directory_security_s().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_security_user_r().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_security_user_r()).getValue();
        				printStream.println(get_usr_Directory_security_user_r().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_security_user_w().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_security_user_w()).getValue();
        				printStream.println(get_usr_Directory_security_user_w().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_security_user_x().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_security_user_x()).getValue();
        				printStream.println(get_usr_Directory_security_user_x().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_security_group_r().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_security_group_r()).getValue();
        				printStream.println(get_usr_Directory_security_group_r().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_security_group_w().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_security_group_w()).getValue();
        				printStream.println(get_usr_Directory_security_group_w().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_security_group_x().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_security_group_x()).getValue();
        				printStream.println(get_usr_Directory_security_group_x().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_security_other_r().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_security_other_r()).getValue();
        				printStream.println(get_usr_Directory_security_other_r().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_security_other_w().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_security_other_w()).getValue();
        				printStream.println(get_usr_Directory_security_other_w().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Directory_security_other_x().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Directory_security_other_x()).getValue();
        				printStream.println(get_usr_Directory_security_other_x().getLabelText() + ": " + value);
   			}
   					}

		if (showChilds(listOptions))
		{
			traceChilds(printStream,listOptions,title);
		}
	}
	
	public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title)
	{
    		        		List listusers = getUsers();
        		printStream.println();
        		printStream.println(getAdapter().getBundle().getString("GUIShareGlobalsDataContainer.role.users") + " " + getAdapter().getBundle().getString("items.found", new Object[]{new Integer(listusers.size())}));
        		for (int i = 0; i < listusers.size(); i++) {
        			BaseDataContainer child = (BaseDataContainer)listusers.get(i);
        			printStream.println();
        			printStream.println(getAdapter().getBundle().getString("item") + ": " + (i+1) + " " + getAdapter().getBundle().getString("of") + " " + listusers.size());
        			child.trace(printStream,listOptions,false);
        		}
    			
			
	}
	
	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List getFields()
	{
		List fields = new ArrayList();
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
	public List getChildContainers()
	{
		List childs = new ArrayList();
    	    		childs.addAll(getUsers());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer)
	{
		GUIShareGlobalsDataContainerImpl source = (GUIShareGlobalsDataContainerImpl)sourceContainer;
	
    	    		get_CaseSensitive().setValue(source.get_CaseSensitive().getValue());
		    		get_DosFiletimes().setValue(source.get_DosFiletimes().getValue());
		    		get_HideDotFiles().setValue(source.get_HideDotFiles().getValue());
		    		get_AclCompatibility().setValue(source.get_AclCompatibility().getValue());
		    		get_EASupport().setValue(source.get_EASupport().getValue());
		    		get_NTACLSupport().setValue(source.get_NTACLSupport().getValue());
		    		get_usr_Create_u().setValue(source.get_usr_Create_u().getValue());
		    		get_usr_Create_g().setValue(source.get_usr_Create_g().getValue());
		    		get_usr_Create_s().setValue(source.get_usr_Create_s().getValue());
		    		get_usr_Create_user_r().setValue(source.get_usr_Create_user_r().getValue());
		    		get_usr_Create_user_w().setValue(source.get_usr_Create_user_w().getValue());
		    		get_usr_Create_user_x().setValue(source.get_usr_Create_user_x().getValue());
		    		get_usr_Create_group_r().setValue(source.get_usr_Create_group_r().getValue());
		    		get_usr_Create_group_w().setValue(source.get_usr_Create_group_w().getValue());
		    		get_usr_Create_group_x().setValue(source.get_usr_Create_group_x().getValue());
		    		get_usr_Create_other_r().setValue(source.get_usr_Create_other_r().getValue());
		    		get_usr_Create_other_w().setValue(source.get_usr_Create_other_w().getValue());
		    		get_usr_Create_other_x().setValue(source.get_usr_Create_other_x().getValue());
		    		get_usr_Directory_u().setValue(source.get_usr_Directory_u().getValue());
		    		get_usr_Directory_g().setValue(source.get_usr_Directory_g().getValue());
		    		get_usr_Directory_s().setValue(source.get_usr_Directory_s().getValue());
		    		get_usr_Directory_user_r().setValue(source.get_usr_Directory_user_r().getValue());
		    		get_usr_Directory_user_w().setValue(source.get_usr_Directory_user_w().getValue());
		    		get_usr_Directory_user_x().setValue(source.get_usr_Directory_user_x().getValue());
		    		get_usr_Directory_group_r().setValue(source.get_usr_Directory_group_r().getValue());
		    		get_usr_Directory_group_w().setValue(source.get_usr_Directory_group_w().getValue());
		    		get_usr_Directory_group_x().setValue(source.get_usr_Directory_group_x().getValue());
		    		get_usr_Directory_other_r().setValue(source.get_usr_Directory_other_r().getValue());
		    		get_usr_Directory_other_w().setValue(source.get_usr_Directory_other_w().getValue());
		    		get_usr_Directory_other_x().setValue(source.get_usr_Directory_other_x().getValue());
		    		get_usr_Directory_security_u().setValue(source.get_usr_Directory_security_u().getValue());
		    		get_usr_Directory_security_g().setValue(source.get_usr_Directory_security_g().getValue());
		    		get_usr_Directory_security_s().setValue(source.get_usr_Directory_security_s().getValue());
		    		get_usr_Directory_security_user_r().setValue(source.get_usr_Directory_security_user_r().getValue());
		    		get_usr_Directory_security_user_w().setValue(source.get_usr_Directory_security_user_w().getValue());
		    		get_usr_Directory_security_user_x().setValue(source.get_usr_Directory_security_user_x().getValue());
		    		get_usr_Directory_security_group_r().setValue(source.get_usr_Directory_security_group_r().getValue());
		    		get_usr_Directory_security_group_w().setValue(source.get_usr_Directory_security_group_w().getValue());
		    		get_usr_Directory_security_group_x().setValue(source.get_usr_Directory_security_group_x().getValue());
		    		get_usr_Directory_security_other_r().setValue(source.get_usr_Directory_security_other_r().getValue());
		    		get_usr_Directory_security_other_w().setValue(source.get_usr_Directory_security_other_w().getValue());
		    		get_usr_Directory_security_other_x().setValue(source.get_usr_Directory_security_other_x().getValue());
				
    	    		List targetListForUsers = (List) getUsers();
    		List sourceListForUsers = (List) source.getUsers();
    		if (sourceListForUsers.size() != targetListForUsers.size())
    		{
    			throw new IllegalArgumentException("The Lists are not from same size. Source is " + sourceListForUsers.size() + " and target is " + targetListForUsers.size() );
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