/** 
  * CMDShareFileAttributesImpl.java
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
  * Description: CLI extensions for FileAttributres for a share
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.share;

import org.sblim.wbemsmt.exception.*;
import java.util.*;




import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class CMDShareFileAttributesImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.share.CMDShareFileAttributes {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_CaseSensitive;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_HideDotFiles;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DosFiletimes;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_EASupport;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_AclCompatibility;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_NTACLSupport;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_CreateMask;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DirectoryMask;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DirectorySecurityMask;
    	
		
	
	public CMDShareFileAttributesImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix) throws InitContainerException  {

			
				super(adapter,bindingPrefix, "CMDShareFileAttributes.caption",false);
				
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_CaseSensitive());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_HideDotFiles());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_DosFiletimes());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_EASupport());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_AclCompatibility());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_NTACLSupport());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_CreateMask());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_DirectoryMask());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_DirectorySecurityMask());
        					
		setFooter(getPanelForCustomLayout(),"CMDShareFileAttributes.footerText");
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
				String binding = bindingPrefix + "_CaseSensitive.item";
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_HideDotFiles() {
    		if (ic_HideDotFiles == null)
    		{
				String label = bundle.getString("CMDShareFileAttributes.HideDotFiles");
				String binding = bindingPrefix + "_HideDotFiles.item";
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
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DosFiletimes() {
    		if (ic_DosFiletimes == null)
    		{
				String label = bundle.getString("CMDShareFileAttributes.DosFiletimes");
				String binding = bindingPrefix + "_DosFiletimes.item";
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_EASupport() {
    		if (ic_EASupport == null)
    		{
				String label = bundle.getString("CMDShareFileAttributes.EASupport");
				String binding = bindingPrefix + "_EASupport.item";
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
		* DataType UNSIGNED_INT8
		* UIType COMBOBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_AclCompatibility() {
    		if (ic_AclCompatibility == null)
    		{
				String label = bundle.getString("CMDShareFileAttributes.AclCompatibility");
				String binding = bindingPrefix + "_AclCompatibility.item";
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_NTACLSupport() {
    		if (ic_NTACLSupport == null)
    		{
				String label = bundle.getString("CMDShareFileAttributes.NTACLSupport");
				String binding = bindingPrefix + "_NTACLSupport.item";
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
		* the Default Create Mask
		* DataType UNSIGNED_INT16
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_CreateMask() {
    		if (ic_CreateMask == null)
    		{
				String label = bundle.getString("CMDShareFileAttributes.CreateMask");
				String binding = bindingPrefix + "_CreateMask.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_CreateMask = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
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
				String binding = bindingPrefix + "_DirectoryMask.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_DirectoryMask = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
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
				String binding = bindingPrefix + "_DirectorySecurityMask.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_DirectorySecurityMask = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_DirectorySecurityMask;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_CaseSensitive != null)
    		{
				ic_CaseSensitive.setLabelText(bundle.getString("CMDShareFileAttributes.CaseSensitive"));
    		}
	    		if (ic_HideDotFiles != null)
    		{
				ic_HideDotFiles.setLabelText(bundle.getString("CMDShareFileAttributes.HideDotFiles"));
    		}
	    		if (ic_DosFiletimes != null)
    		{
				ic_DosFiletimes.setLabelText(bundle.getString("CMDShareFileAttributes.DosFiletimes"));
    		}
	    		if (ic_EASupport != null)
    		{
				ic_EASupport.setLabelText(bundle.getString("CMDShareFileAttributes.EASupport"));
    		}
	    		if (ic_AclCompatibility != null)
    		{
				ic_AclCompatibility.setLabelText(bundle.getString("CMDShareFileAttributes.AclCompatibility"));
    		}
	    		if (ic_NTACLSupport != null)
    		{
				ic_NTACLSupport.setLabelText(bundle.getString("CMDShareFileAttributes.NTACLSupport"));
    		}
	    		if (ic_CreateMask != null)
    		{
				ic_CreateMask.setLabelText(bundle.getString("CMDShareFileAttributes.CreateMask"));
    		}
	    		if (ic_DirectoryMask != null)
    		{
				ic_DirectoryMask.setLabelText(bundle.getString("CMDShareFileAttributes.DirectoryMask"));
    		}
	    		if (ic_DirectorySecurityMask != null)
    		{
				ic_DirectorySecurityMask.setLabelText(bundle.getString("CMDShareFileAttributes.DirectorySecurityMask"));
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
    				fields.add(get_CaseSensitive());
    				fields.add(get_HideDotFiles());
    				fields.add(get_DosFiletimes());
    				fields.add(get_EASupport());
    				fields.add(get_AclCompatibility());
    				fields.add(get_NTACLSupport());
    				fields.add(get_CreateMask());
    				fields.add(get_DirectoryMask());
    				fields.add(get_DirectorySecurityMask());
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
		CMDShareFileAttributesImpl source = (CMDShareFileAttributesImpl)sourceContainer;
	
    	    		get_CaseSensitive().setValue(source.get_CaseSensitive().getValue());
		    		get_HideDotFiles().setValue(source.get_HideDotFiles().getValue());
		    		get_DosFiletimes().setValue(source.get_DosFiletimes().getValue());
		    		get_EASupport().setValue(source.get_EASupport().getValue());
		    		get_AclCompatibility().setValue(source.get_AclCompatibility().getValue());
		    		get_NTACLSupport().setValue(source.get_NTACLSupport().getValue());
		    		get_CreateMask().setValue(source.get_CreateMask().getValue());
		    		get_DirectoryMask().setValue(source.get_DirectoryMask().getValue());
		    		get_DirectorySecurityMask().setValue(source.get_DirectorySecurityMask().getValue());
				
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}