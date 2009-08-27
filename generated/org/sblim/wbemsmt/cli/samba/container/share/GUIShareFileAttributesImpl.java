/** 
  * GUIShareFileAttributesImpl.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/cmd/containerImpl.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: UI extensions for FileAttributres for a share
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.container.share;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class GUIShareFileAttributesImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.share.GUIShareFileAttributes
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_CaseSensitive;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_HideDotFiles;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DosFiletimes;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_EASupport;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_AclCompatibility;
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
    	
		
	public GUIShareFileAttributesImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.CaseSensitive");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_CaseSensitive = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_CaseSensitive;
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.HideDotFiles");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_HideDotFiles = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_HideDotFiles;
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.DosFiletimes");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_DosFiletimes = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_DosFiletimes;
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.EASupport");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_EASupport = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_EASupport;
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.AclCompatibility");
				org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt8StringArrayConverter();
    			ic_AclCompatibility = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(this,label,null,converter);
    		}
    		return ic_AclCompatibility;
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.NTACLSupport");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_NTACLSupport = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.create_u");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_u = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.create_g");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_g = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.create_s");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_s = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.create_user_r");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_user_r = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.create_user_w");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_user_w = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.create_user_x");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_user_x = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.create_group_r");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_group_r = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.create_group_w");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_group_w = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.create_group_x");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_group_x = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.create_other_r");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_other_r = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.create_other_w");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_other_w = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.create_other_x");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Create_other_x = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_u");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_u = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_g");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_g = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_s");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_s = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_user_r");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_user_r = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_user_w");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_user_w = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_user_x");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_user_x = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_group_r");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_group_r = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_group_w");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_group_w = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_group_x");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_group_x = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_other_r");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_other_r = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_other_w");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_other_w = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_other_x");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_other_x = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_security_u");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_u = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_security_g");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_g = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_security_s");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_s = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_security_user_r");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_user_r = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_security_user_w");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_user_w = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_security_user_x");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_user_x = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_security_group_r");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_group_r = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_security_group_w");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_group_w = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_security_group_x");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_group_x = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_security_other_r");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_other_r = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_security_other_w");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_other_w = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("GUIShareFileAttributes.directory_security_other_x");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_other_x = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_Directory_security_other_x;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("GUIShareFileAttributes.caption"));
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
   			   			   			if (get_HideDotFiles().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_HideDotFiles()).getValue();
        				printStream.println(get_HideDotFiles().getLabelText() + ": " + value);
   			}
   			   			   			if (get_DosFiletimes().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_DosFiletimes()).getValue();
        				printStream.println(get_DosFiletimes().getLabelText() + ": " + value);
   			}
   			   			   			if (get_EASupport().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_EASupport()).getValue();
        				printStream.println(get_EASupport().getLabelText() + ": " + value);
   			}
   			   			   			if (get_AclCompatibility().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_AclCompatibility()).getValue();
        				printStream.println(get_AclCompatibility().getLabelText() + ": " + value);
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
    			
			
	}
	
	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    				fields.add(get_CaseSensitive());
    				fields.add(get_HideDotFiles());
    				fields.add(get_DosFiletimes());
    				fields.add(get_EASupport());
    				fields.add(get_AclCompatibility());
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
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       GUIShareFileAttributesImpl source = (GUIShareFileAttributesImpl)sourceContainer;
		    		    
    	    		   get_CaseSensitive().copyFrom(source.get_CaseSensitive());
		        		   get_HideDotFiles().copyFrom(source.get_HideDotFiles());
		        		   get_DosFiletimes().copyFrom(source.get_DosFiletimes());
		        		   get_EASupport().copyFrom(source.get_EASupport());
		        		   get_AclCompatibility().copyFrom(source.get_AclCompatibility());
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
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}