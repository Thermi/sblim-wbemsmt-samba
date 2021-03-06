/** 
  * AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainerImpl.java
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
  * @template: org/sblim/wbemsmt/dcg/templates/jsf/containerImplMultiLine.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: container for admin Users in global printer settings
  * 
  * generated Class
  */

package org.sblim.wbemsmt.jsf.samba.container.global;

import java.util.*;
import org.sblim.wbemsmt.tools.input.jsf.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;


	
public class AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel2 implements org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_SambaUserName;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Admin;
		
	public static final int COLS = 2;
	
	public static String[] orientationOfColumnAsCss = new String[]{
    				"left",
    				"left",
    		
	};
	
	
	
	public AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainerImpl(org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter adapter,String expressionPrefix,int index) throws WbemsmtException {
	    super(adapter,expressionPrefix,index);
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
				String binding = expressionPrefix + "users["+ index +"]._usr_SambaUserName.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_usr_SambaUserName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)ic_usr_SambaUserName).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
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
				String binding = expressionPrefix + "users["+ index +"]._usr_Admin.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Admin = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)ic_usr_Admin).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_usr_Admin;
    	}
		

	/**
	 * @return all the Components
	 */
	public LabeledJSFInputComponent[] getComponents() {
		return new LabeledJSFInputComponent[]{
						(LabeledJSFInputComponent)get_usr_SambaUserName(),
						(LabeledJSFInputComponent)get_usr_Admin(),
					};
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
	    		       AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainerImpl source = (AdminUsersInPrinterGlobals_AsUsers_InPrintingGlobalsDataContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_SambaUserName().copyFrom(source.get_usr_SambaUserName());
		        		   get_usr_Admin().copyFrom(source.get_usr_Admin());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
	
	
	
}