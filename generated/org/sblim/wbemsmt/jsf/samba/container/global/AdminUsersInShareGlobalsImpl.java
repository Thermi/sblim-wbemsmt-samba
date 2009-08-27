/** 
  * AdminUsersInShareGlobalsImpl.java
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
  * Description: container for admin Users in global share settings
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.global;

import org.sblim.wbemsmt.exception.*;
import java.util.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;




import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class AdminUsersInShareGlobalsImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobals
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_SambaUserName;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Admin;

    	
		
	
	public AdminUsersInShareGlobalsImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "AdminUsersInShareGlobals.caption",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_SambaUserName());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Admin());
        					
		setFooter(getPanelForCustomLayout(),"AdminUsersInShareGlobals.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_SambaUserName() {
    		if (ic_usr_SambaUserName == null)
    		{
				String label = bundle.getString("AdminUsersInShareGlobals.SambaUserName");
				String binding = expressionPrefix + "_usr_SambaUserName.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_usr_SambaUserName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_SambaUserName;
    	}
			/**
		* relates to Linux_SambaAdminUsersForShare
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Admin() {
    		if (ic_usr_Admin == null)
    		{
				String label = bundle.getString("AdminUsersInShareGlobals.admin");
				String binding = expressionPrefix + "_usr_Admin.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Admin = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Admin;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_SambaUserName != null)
    		{
				ic_usr_SambaUserName.setLabelText(bundle.getString("AdminUsersInShareGlobals.SambaUserName"));
    		}
	    		if (ic_usr_Admin != null)
    		{
				ic_usr_Admin.setLabelText(bundle.getString("AdminUsersInShareGlobals.admin"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesSamba"};
	}

	public void countAndCreateChildren() throws WbemsmtException {
	
    		}


	/**
	 * count and create childrens
	 * @throws WbemsmtException
	 */
	public void updateControls() throws WbemsmtException {
			   countAndCreateChildren();
			   adapter.updateControls(this);
		
			   		}

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    				fields.add(get_usr_SambaUserName());
    				fields.add(get_usr_Admin());
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
	    		       AdminUsersInShareGlobalsImpl source = (AdminUsersInShareGlobalsImpl)sourceContainer;
		    		    
    	    		   get_usr_SambaUserName().copyFrom(source.get_usr_SambaUserName());
		        		   get_usr_Admin().copyFrom(source.get_usr_Admin());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}