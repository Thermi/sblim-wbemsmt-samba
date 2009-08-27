/** 
  * UserInPrinterACLDataContainerImpl.java
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
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.cli.samba.container.printer;

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.BaseDataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinter;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class UserInPrinterACLDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.samba.bl.container.printer.UserInPrinterACLDataContainer
			, org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinterHeader		
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_CurrentForceUser;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_NewForceUser;
    			
		
		private java.util.List<UserACLItemDataContainerForPrinter> icUsers = new java.util.ArrayList<UserACLItemDataContainerForPrinter>();

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_SambaUserName;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_AccessTypeVI;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_AccessTypeRW;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icUsersHeader_usr_Admin;
		
	
		
	public UserInPrinterACLDataContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
		super();
		setAdapter(adapter);
    			adapter.initContainer(this);
	}

			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_CurrentForceUser() {
    		if (ic_usr_CurrentForceUser == null)
    		{
				String label = getAdapter().getBundle().getString("UserInPrinterACLDataContainer.currentForceUser");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_CurrentForceUser = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_CurrentForceUser;
    	}
			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType COMBOBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_NewForceUser() {
    		if (ic_usr_NewForceUser == null)
    		{
				String label = getAdapter().getBundle().getString("UserInPrinterACLDataContainer.newForceUser");
				org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
    			ic_usr_NewForceUser = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(this,label,null,converter);
    		}
    		return ic_usr_NewForceUser;
    	}
		
			
		
		/**
		* 
		* linked container UserACLItemDataContainerForPrinter
		*/
				public java.util.List<UserACLItemDataContainerForPrinter> getUsers()
				{
			return icUsers;
		}

   	       /**
		* Header for:
		* 
		* linked container UserACLItemDataContainerForPrinter
		*/
		public org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinterHeader getUsersHeader()
		{
			return this;
		}

				/**
   		 * Header for field SambaUserName
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_SambaUserName() {
    		if (icUsersHeader_SambaUserName == null)
    		{
    			String label = getAdapter().getBundle().getString("UserACLItemDataContainerForPrinter.SambaUserName");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			icUsersHeader_SambaUserName = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icUsersHeader_SambaUserName;
    	    }
				/**
   		 * Header for field accessTypeVI
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_AccessTypeVI() {
    		if (icUsersHeader_usr_AccessTypeVI == null)
    		{
    			String label = getAdapter().getBundle().getString("UserACLItemDataContainerForPrinter.accessTypeVI");
			    org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
    			icUsersHeader_usr_AccessTypeVI = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(this,label,"",converter);
			}
    		return icUsersHeader_usr_AccessTypeVI;
    	    }
				/**
   		 * Header for field accessTypeRW
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_AccessTypeRW() {
    		if (icUsersHeader_usr_AccessTypeRW == null)
    		{
    			String label = getAdapter().getBundle().getString("UserACLItemDataContainerForPrinter.accessTypeRW");
			    org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
    			icUsersHeader_usr_AccessTypeRW = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(this,label,"",converter);
			}
    		return icUsersHeader_usr_AccessTypeRW;
    	    }
				/**
   		 * Header for field admin
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getUsersHeader_usr_Admin() {
    		if (icUsersHeader_usr_Admin == null)
    		{
    			String label = getAdapter().getBundle().getString("UserACLItemDataContainerForPrinter.admin");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			icUsersHeader_usr_Admin = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icUsersHeader_usr_Admin;
    	    }
		

	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("UserInPrinterACLDataContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_usr_CurrentForceUser().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_CurrentForceUser()).getValue();
        				printStream.println(get_usr_CurrentForceUser().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_NewForceUser().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_NewForceUser()).getValue();
        				printStream.println(get_usr_NewForceUser().getLabelText() + ": " + value);
   			}
   					}

		if (showChilds(listOptions))
		{
			traceChilds(printStream,listOptions,title);
		}
	}
	
	public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title)
	{
    		        		List<UserACLItemDataContainerForPrinter> listusers = getUsers();
        		printStream.println();
        		printStream.println(getAdapter().getBundle().getString("UserInPrinterACLDataContainer.role.users") + " " + getAdapter().getBundle().getString("items.found", new Object[]{new Integer(listusers.size())}));
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
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    				fields.add(get_usr_CurrentForceUser());
    				fields.add(get_usr_NewForceUser());
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    		childs.addAll(getUsers());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       UserInPrinterACLDataContainerImpl source = (UserInPrinterACLDataContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_CurrentForceUser().copyFrom(source.get_usr_CurrentForceUser());
		        		   get_usr_NewForceUser().copyFrom(source.get_usr_NewForceUser());
		    		
    	    		   List<UserACLItemDataContainerForPrinter> targetListForUsers = getUsers();
    		   List<UserACLItemDataContainerForPrinter> sourceListForUsers = source.getUsers();
    		   if (sourceListForUsers.size() != targetListForUsers.size())
    		   {
    			      throw new WbemsmtException(WbemsmtException.ERR_FAILED,"The Lists are not from same size. Source is " + sourceListForUsers.size() + " and target is " + targetListForUsers.size() );
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