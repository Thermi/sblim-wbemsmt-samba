/** 
  * CMDShareFileAttributesImpl.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
  * @template: ./tools-dcg/templates/cmd/containerImpl.vm
  *
  * Contributors: 
  * 
  * Description: CLI extensions for FileAttributres for a share
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.container.share;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
//import org.sblim.wbemsmt.tools.converter.*;
//import org.sblim.wbemsmt.tools.converter.test.*;
//import org.sblim.wbemsmt.tools.input.*;
//import org.sblim.wbemsmt.tools.input.test.*;
import org.sblim.wbemsmt.tools.resources.*;
import org.sblim.wbemsmt.exception.*;

public class CMDShareFileAttributesImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.share.CMDShareFileAttributes {

	protected static WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(new String[]{"messages","messagesSamba"},Locale.getDefault());

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_CaseSensitive;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_HideDotFiles;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DosFiletimes;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_EASupport;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_AclCompatibility;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_NTACLSupport;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_CreateMask;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DirectoryMask;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DirectorySecurityMask;
    	
		
	public CMDShareFileAttributesImpl(AbstractBaseCimAdapter adapter) throws InitContainerException {
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
				String label = bundle.getString("CMDShareFileAttributes.CaseSensitive");
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_HideDotFiles() {
    		if (ic_HideDotFiles == null)
    		{
				String label = bundle.getString("CMDShareFileAttributes.HideDotFiles");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_HideDotFiles = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = bundle.getString("CMDShareFileAttributes.DosFiletimes");
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_EASupport() {
    		if (ic_EASupport == null)
    		{
				String label = bundle.getString("CMDShareFileAttributes.EASupport");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_EASupport = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = bundle.getString("CMDShareFileAttributes.AclCompatibility");
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_NTACLSupport() {
    		if (ic_NTACLSupport == null)
    		{
				String label = bundle.getString("CMDShareFileAttributes.NTACLSupport");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_NTACLSupport = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_NTACLSupport;
    	}
			/**
		* the Default Create Mask
		* DataType UNSIGNED_INT16
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_CreateMask() {
    		if (ic_CreateMask == null)
    		{
				String label = bundle.getString("CMDShareFileAttributes.CreateMask");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
    			ic_CreateMask = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_CreateMask;
    	}
			/**
		* The directory Mask
		* DataType UNSIGNED_INT16
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DirectoryMask() {
    		if (ic_DirectoryMask == null)
    		{
				String label = bundle.getString("CMDShareFileAttributes.DirectoryMask");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
    			ic_DirectoryMask = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_DirectoryMask;
    	}
			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DirectorySecurityMask() {
    		if (ic_DirectorySecurityMask == null)
    		{
				String label = bundle.getString("CMDShareFileAttributes.DirectorySecurityMask");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
    			ic_DirectorySecurityMask = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_DirectorySecurityMask;
    	}
		
	
		
	public void trace(java.io.PrintStream printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(bundle.getString("CMDShareFileAttributes.caption"));
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
						if (get_CreateMask().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_CreateMask()).getValue();
				printStream.println(get_CreateMask().getLabelText() + ": " + value);
			}
						if (get_DirectoryMask().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_DirectoryMask()).getValue();
				printStream.println(get_DirectoryMask().getLabelText() + ": " + value);
			}
						if (get_DirectorySecurityMask().isVisible())
			{
				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_DirectorySecurityMask()).getValue();
				printStream.println(get_DirectorySecurityMask().getLabelText() + ": " + value);
			}
					}

		if (showChilds(listOptions))
		{
			traceChilds(printStream,listOptions,title);
		}
	}
	
	public void traceChilds(java.io.PrintStream printStream, String listOptions, boolean title)
	{
    			
			
	}
	
}