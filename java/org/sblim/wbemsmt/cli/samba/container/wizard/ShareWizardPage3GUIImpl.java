/** 
  * ShareWizardPage3GUIImpl.java
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
  * @template: ./tools-dcg/templates/cmd/containerImpl.vm
  *
  * Contributors: 
  * 
  * Description: page 3 of the share wizard for the UI
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.container.wizard;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;


public class ShareWizardPage3GUIImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3GUI {

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
    	
		
	public ShareWizardPage3GUIImpl(AbstractBaseCimAdapter adapter) throws InitContainerException {
		super();
		setAdapter(adapter);
    			adapter.initContainer(this);
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.create_u");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.create_g");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.create_s");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.create_user_r");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.create_user_w");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.create_user_x");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.create_group_r");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.create_group_w");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.create_group_x");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.create_other_r");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.create_other_w");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.create_other_x");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_u");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_g");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_s");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_user_r");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_user_w");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_user_x");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_group_r");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_group_w");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_group_x");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_other_r");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_other_w");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_other_x");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_security_u");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_security_g");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_security_s");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_security_user_r");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_security_user_w");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_security_user_x");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_security_group_r");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_security_group_w");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_security_group_x");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_security_other_r");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_security_other_w");
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
				String label = getAdapter().getBundle().getString("ShareWizardPage3GUI.directory_security_other_x");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Directory_security_other_x = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_Directory_security_other_x;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("ShareWizardPage3GUI.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
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
	public List getFields()
	{
		List fields = new ArrayList();
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
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer)
	{
		ShareWizardPage3GUIImpl source = (ShareWizardPage3GUIImpl)sourceContainer;
	
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
				
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}