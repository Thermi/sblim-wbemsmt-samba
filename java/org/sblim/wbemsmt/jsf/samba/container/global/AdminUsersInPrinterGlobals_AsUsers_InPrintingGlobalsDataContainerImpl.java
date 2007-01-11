/** 
  * AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainerImpl.java
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
  * @template: ./tools-dcg/templates/jsf/containerImplMultiLine.vm
  *
  * Contributors: 
  * 
  * Description: container for admin Users in global printer settings
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.global;

import javax.faces.component.html.HtmlPanelGrid;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.tools.input.jsf.*;
import org.sblim.wbemsmt.tools.input.*;
import org.sblim.wbemsmt.exception.*;

	
public class AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel implements org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_SambaUserName;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Admin;
		
	private static String[] orientationOfColumnAsCss = new String[]{
    				"left",
    				"left",
    		
	};
	
	
	
	private final int index;
	
//	public AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainerImpl(String bindingPrefix, org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,int index) throws InitContainerException {
//		this(adapter,bindingPrefix,index, null);
//	}
	
	public AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix,int index, HtmlPanelGrid grid) throws InitContainerException {
	    super(adapter,
			  bindingPrefix, // the prefix for binding values
			  "#{" +  bindingPrefix + "users["+ index +"]", // binding for Title
			  "AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainer.caption", //Key for title
			  2,grid);
		this.index = index;
		addComponents(new LabeledJSFInputComponent[]{
					(LabeledJSFInputComponent)get_usr_SambaUserName(),
			
					(LabeledJSFInputComponent)get_usr_Admin(),
			
				});
		if (first)
		{
			//setFooter(getInputFieldContainer(),"#{localeManager.bundle['SAMBA'].AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainerImpl_footerText}","AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainerImpl.footerText");
			//setFooter(getInputFieldContainer(),"AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainerImpl.footerText");
			String binding = "#{" +  bindingPrefix + "users["+ index +"].footerText}";
			setFooter(getOuterPanel(),"AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainer.footerText",binding);
		}
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_SambaUserName() {
    		if (ic_usr_SambaUserName == null)
    		{
				String label = bundle.getString("AdminUsersInPrinterGlobals.SambaUserName");
				String binding = bindingPrefix + "users["+ index +"]._usr_SambaUserName.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_usr_SambaUserName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)ic_usr_SambaUserName).setOrientation( LabeledBaseInputComponentIf.LEFT );
    		}
    		return ic_usr_SambaUserName;
    	}
			/**
		* relates to Linux_SambaAdminUsersForShare
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Admin() {
    		if (ic_usr_Admin == null)
    		{
				String label = bundle.getString("AdminUsersInPrinterGlobals.admin");
				String binding = bindingPrefix + "users["+ index +"]._usr_Admin.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Admin = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)ic_usr_Admin).setOrientation( LabeledBaseInputComponentIf.LEFT );
    		}
    		return ic_usr_Admin;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_SambaUserName != null)
    		{
				ic_usr_SambaUserName.setLabelText(bundle.getString("AdminUsersInPrinterGlobals.SambaUserName"));
    		}
	    		if (ic_usr_Admin != null)
    		{
				ic_usr_Admin.setLabelText(bundle.getString("AdminUsersInPrinterGlobals.admin"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesSamba"};
	}
	
	protected String getOrientationOfColumnAsCss(int column) {
		return orientationOfColumnAsCss[column];
	}
}