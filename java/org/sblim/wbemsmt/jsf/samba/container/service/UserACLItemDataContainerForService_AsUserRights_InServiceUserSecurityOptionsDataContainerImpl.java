/** 
  * UserACLItemDataContainerForService_AsUserRights_InServiceUserSecurityOptionsDataContainerImpl.java
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
  * Description: Container with a abstract definition of the rights that can be given to a user
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.service;

import javax.faces.component.html.HtmlPanelGrid;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.tools.input.jsf.*;
import org.sblim.wbemsmt.exception.*;

	
public class UserACLItemDataContainerForService_AsUserRights_InServiceUserSecurityOptionsDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel implements org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForService {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_SambaUserName;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_AccessTypeVI;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_AccessTypeRW;
    	
	
	private final int index;
	
//	public UserACLItemDataContainerForService_AsUserRights_InServiceUserSecurityOptionsDataContainerImpl(String bindingPrefix, org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,int index) throws InitContainerException {
//		this(adapter,bindingPrefix,index, null);
//	}
	
	public UserACLItemDataContainerForService_AsUserRights_InServiceUserSecurityOptionsDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String bindingPrefix,int index, HtmlPanelGrid grid) throws InitContainerException {
	    super(adapter,
			  bindingPrefix, // the prefix for binding values
			  "#{" +  bindingPrefix + "userRights["+ index +"]", // binding for Title
			  "UserACLItemDataContainerForService_AsUserRights_InServiceUserSecurityOptionsDataContainer.caption", //Key for title
			  3,grid);
		this.index = index;
		addComponents(new LabeledJSFInputComponent[]{
					(LabeledJSFInputComponent)get_SambaUserName(),
			
					(LabeledJSFInputComponent)get_usr_AccessTypeVI(),
			
					(LabeledJSFInputComponent)get_usr_AccessTypeRW(),
			
				});
		if (first)
		{
			//setFooter(getInputFieldContainer(),"#{localeManager.bundle['SAMBA'].UserACLItemDataContainerForService_AsUserRights_InServiceUserSecurityOptionsDataContainerImpl_footerText}","UserACLItemDataContainerForService_AsUserRights_InServiceUserSecurityOptionsDataContainerImpl.footerText");
			//setFooter(getInputFieldContainer(),"UserACLItemDataContainerForService_AsUserRights_InServiceUserSecurityOptionsDataContainerImpl.footerText");
			String binding = "#{" +  bindingPrefix + "userRights["+ index +"].footerText}";
			setFooter(getOuterPanel(),"UserACLItemDataContainerForService_AsUserRights_InServiceUserSecurityOptionsDataContainer.footerText",binding);
		}
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SambaUserName() {
    		if (ic_SambaUserName == null)
    		{
				String label = bundle.getString("UserACLItemDataContainerForService.SambaUserName");
				String binding = bindingPrefix + "userRights["+ index +"]._SambaUserName.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_SambaUserName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
    		return ic_SambaUserName;
    	}
			/**
		* relates to<br> Linux_SambaReadListForShare<br> Linux_SambaWriteListForShare<br> Linux_SambaInvalidUsersForShare<br> Linux_SambaValidUsersForShare<br> 
		* DataType UNSIGNED_INT16
		* UIType RADIOBUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_AccessTypeVI() {
    		if (ic_usr_AccessTypeVI == null)
    		{
				String label = bundle.getString("UserACLItemDataContainerForService.accessTypeVI");
				String binding = bindingPrefix + "userRights["+ index +"]._usr_AccessTypeVI.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_usr_AccessTypeVI = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(parent,label,binding,converter, readOnly);
				;
    		}
    		return ic_usr_AccessTypeVI;
    	}
			/**
		* relates to<br> Linux_SambaReadListForShare<br> Linux_SambaWriteListForShare<br> Linux_SambaInvalidUsersForShare<br> Linux_SambaValidUsersForShare<br> 
		* DataType UNSIGNED_INT16
		* UIType RADIOBUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_AccessTypeRW() {
    		if (ic_usr_AccessTypeRW == null)
    		{
				String label = bundle.getString("UserACLItemDataContainerForService.accessTypeRW");
				String binding = bindingPrefix + "userRights["+ index +"]._usr_AccessTypeRW.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_usr_AccessTypeRW = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(parent,label,binding,converter, readOnly);
				;
    		}
    		return ic_usr_AccessTypeRW;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_SambaUserName != null)
    		{
				ic_SambaUserName.setLabelText(bundle.getString("UserACLItemDataContainerForService.SambaUserName"));
    		}
	    		if (ic_usr_AccessTypeVI != null)
    		{
				ic_usr_AccessTypeVI.setLabelText(bundle.getString("UserACLItemDataContainerForService.accessTypeVI"));
    		}
	    		if (ic_usr_AccessTypeRW != null)
    		{
				ic_usr_AccessTypeRW.setLabelText(bundle.getString("UserACLItemDataContainerForService.accessTypeRW"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesSamba"};
	}
	

}