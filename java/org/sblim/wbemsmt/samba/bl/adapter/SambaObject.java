 /** 
  * SambaObject.java
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
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Base class for objects wrapping samba business objects and their actions
  * 
  */
package org.sblim.wbemsmt.samba.bl.adapter;

import java.lang.reflect.Constructor;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Logger;

import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.WbemsmtBusinessObject;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.ObjectCreationException;
import org.sblim.wbemsmt.exception.ObjectDeletionException;
import org.sblim.wbemsmt.exception.ObjectSaveException;
import org.sblim.wbemsmt.exception.UpdateControlsException;
import org.sblim.wbemsmt.samba.bl.container.global.UserIsAdminItem;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser;
import org.sblim.wbemsmt.samba.bl.wrapper.Service;
import org.sblim.wbemsmt.samba.bl.wrapper.User;
import org.sblim.wbemsmt.samba.bl.wrapper.list.PrinterList;
import org.sblim.wbemsmt.samba.bl.wrapper.list.ShareList;
import org.sblim.wbemsmt.samba.bl.wrapper.list.UserList;
import org.sblim.wbemsmt.schema.cim29.CIM_Component;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.util.StringUtil;

public abstract class SambaObject extends WbemsmtBusinessObject {

	protected final SambaCimAdapter adapter;

	protected SambaObject(SambaCimAdapter adapter) {
		super(adapter);
		this.adapter = adapter;
	}

	protected static final int USR_ACL_IDX_READ = 0;
	protected static final int USR_ACL_IDX_WRITE = 1;

	protected static final int USR_ACL_IDX_DISABLE = 0;
	protected static final int USR_ACL_IDX_ENABLE = 1;

	protected Logger logger = Logger.getLogger(SambaObject.class.getName());	
	
	protected Map allHosts = new HashMap();
	protected boolean reloadChilds;

	private static final DecimalFormat DF_MASK_STRING = new DecimalFormat("0000");
	
	public abstract CimObjectKey getCimObjectKey();
	
	protected void setShareUsers(Set map, List associated_Linux_SambaUsers) {
		for (Iterator iter = associated_Linux_SambaUsers.iterator(); iter.hasNext();) {
			CIMObjectPath path = (CIMObjectPath) iter.next();
			String name = (String) path.getKey("SambaUserName").getValue().getValue();
			map.add(name);
		}
	}

	protected void setUserPrinters(Set map, List associated_Linux_SambaUsers) {
		for (Iterator iter = associated_Linux_SambaUsers.iterator(); iter.hasNext();) {
			CIMObjectPath path = (CIMObjectPath) iter.next();
			String name = (String) path.getKey("Name").getValue().getValue();
			map.add(name);
		}
	}
	
	protected void setUserShares(Set map, List associated_Linux_SambaUsers) {
		for (Iterator iter = associated_Linux_SambaUsers.iterator(); iter.hasNext();) {
			CIMObjectPath path = (CIMObjectPath) iter.next();
			String name = (String) path.getKey("Name").getValue().getValue();
			map.add(name);
		}
	}

	protected void setHosts(Set map, List associated_Linux_SambaHosts) {
		for (Iterator iter = associated_Linux_SambaHosts.iterator(); iter.hasNext();) {
			CIMObjectPath path = (CIMObjectPath) iter.next();
			String name = (String) path.getKey("Name").getValue().getValue();
			map.add(name);
		}
	}

	protected void updateMaskControls(LabeledBaseInputComponentIf field_r, LabeledBaseInputComponentIf field_w, LabeledBaseInputComponentIf field_x, UnsignedInt16 mask, int position)
	{
		String maskString = DF_MASK_STRING.format(mask.longValue());
		int maskValue = Integer.parseInt(maskString.substring(position,position+1));
		field_r.setControlValue((Boolean) new Boolean( (maskValue & 4) > 0));
		field_w.setControlValue((Boolean) new Boolean( (maskValue & 2) > 0));
		field_x.setControlValue((Boolean) new Boolean( (maskValue & 1) > 0));
	}

	protected String updateModel(LabeledBaseInputComponentIf field_r, LabeledBaseInputComponentIf field_w, LabeledBaseInputComponentIf field_x) {
		
		int retValue = 0;
		if (((Boolean) field_r.getConvertedControlValue()).booleanValue())
		{
			retValue += 4;
		}
		if (((Boolean) field_w.getConvertedControlValue()).booleanValue())
		{
			retValue += 2;
		}
		if (((Boolean) field_x.getConvertedControlValue()).booleanValue())
		{
			retValue += 1;
		}
		return ""+retValue;
	}

	protected UnsignedInt16 updateModel(CIM_ManagedElement element, LabeledBaseInputComponentIf s, 
			LabeledBaseInputComponentIf g, 
			LabeledBaseInputComponentIf u, 
			LabeledBaseInputComponentIf user_r, 
			LabeledBaseInputComponentIf user_w, 
			LabeledBaseInputComponentIf user_x,
			LabeledBaseInputComponentIf group_r,
			LabeledBaseInputComponentIf group_w, 
			LabeledBaseInputComponentIf group_x, 
			LabeledBaseInputComponentIf other_r,
			LabeledBaseInputComponentIf other_w, 
			LabeledBaseInputComponentIf other_x) throws ObjectSaveException {
		
		String result = updateModel(s,g,u) + updateModel(user_r,user_w,user_x) + updateModel(group_r,group_w,group_x) + updateModel(other_r,other_w,other_x);
		try {
			return new UnsignedInt16(DF_MASK_STRING.parse(result).intValue());
		} catch (ParseException e) {
			throw new ObjectSaveException(result + "is no number",adapter.getFcoHelper().getCIM_ObjectCreator().createUnhecked(element), e);
		}
	}

	protected void seperateDenyHosts(Set allowHosts, Set denyHosts, List listHostsToDeny, List listHostsDenied) {
		Iterator iterator = allHosts.keySet().iterator();
		while (iterator.hasNext())
		{
			String hostname = (String) iterator.next();
			if (allowHosts.contains(hostname))
			{
				listHostsToDeny.add(hostname);
			}
			else if (denyHosts.contains(hostname))
			{
				listHostsDenied.add(hostname);
			}
		}
	}
	protected void seperateAllowHosts(Set allowHosts, Set denyHosts, List listHostsToAllow, List listHostsAllowed) {
		Iterator iterator = allHosts.keySet().iterator();
		while (iterator.hasNext())
		{
			String hostname = (String) iterator.next();
			if (allowHosts.contains(hostname))
			{
				listHostsAllowed.add(hostname);
			}
			else if (denyHosts.contains(hostname))
			{
				listHostsToAllow.add(hostname);
			}
		}
	}
	
	protected void updateValidInvalidWithUserList(DataContainer container, LabeledStringArrayInputComponentIf viField, String key, Set invalidUsers, Set validUsers, boolean globalAcl, Service service, CIMClient cc) throws UpdateControlsException {
		UnsignedInt16 selectedIV = null; 

		try {
			WbemSmtResourceBundle bundle = container.getAdapter().getBundle();
			viField.setValues(getValidInvalidTypes(bundle));
			
			int count = (invalidUsers.contains(key) ? 1 : 0);
			count = count + (validUsers.contains(key) ? 1 : 0);

			if (!globalAcl && count > 1)
			{
				
				//check the global ones to get the info whats really matching
				//if globals contains an invalid user there must be an valid user in local
				if (service.getInvalidUsers(cc).contains(key))
				{
					selectedIV = new UnsignedInt16(USR_ACL_IDX_ENABLE);
				}
				//if globals contains an valid user there must be an invalid user in local
				if (service.getValidUsers(cc).contains(key))
				{
					selectedIV = new UnsignedInt16(USR_ACL_IDX_DISABLE);
				}
			}
			else
			{
				if (invalidUsers.contains(key))
				{
					selectedIV = new UnsignedInt16(USR_ACL_IDX_DISABLE);
				}
				if (validUsers.contains(key))
				{
					selectedIV = new UnsignedInt16(USR_ACL_IDX_ENABLE);
				}
			}
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
		
		if (selectedIV != null)
		{
			viField.setControlValue(new UnsignedInt16(selectedIV));
		}
//		else if (RuntimeUtil.getInstance().isCommandline())
//		{
//			viField.setValue(container.getAdapter().getBundle().getString("right.not.defined"));
//		}
		
	}

	protected void updateReadWriteWithUserList(DataContainer container, LabeledStringArrayInputComponentIf rwField, String key, Set readUsers, Set writeUsers, boolean globalAcl, Service service, CIMClient cc) throws UpdateControlsException {
		UnsignedInt16 selectedRW = null; 

		try {
			WbemSmtResourceBundle bundle = container.getAdapter().getBundle();
			rwField.setValues(getReadWriteTypes(bundle));
			
			int count = (readUsers.contains(key) ? 1 : 0);
			count = count + (writeUsers.contains(key) ? 1 : 0);

			if (!globalAcl && count > 1)
			{
				//check the global ones to get the info whats really matching
				//if globals contains an read user there must be an write user in local
				if (service.getReadUsers(cc).contains(key))
				{
					selectedRW = new UnsignedInt16(USR_ACL_IDX_WRITE);
				}
				// if globals contains an write user there must be an read user in local
				if (service.getWriteUsers(cc).contains(key))
				{
					selectedRW = new UnsignedInt16(USR_ACL_IDX_READ);
				}
			}
			else
			{
				if (readUsers.contains(key))
				{
					selectedRW = new UnsignedInt16(USR_ACL_IDX_READ);
				}
				if (writeUsers.contains(key))
				{
					selectedRW = new UnsignedInt16(USR_ACL_IDX_WRITE);
				}
			}
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
		
		if (selectedRW != null)
		{
			rwField.setControlValue(new UnsignedInt16(selectedRW));
		}
//		else if (RuntimeUtil.getInstance().isCommandline())
//		{
//			rwField.setValue(container.getAdapter().getBundle().getString("right.not.defined"));
//		}
	}
	
	protected void updateAdminWithUserList(DataContainer container, LabeledBaseInputComponentIf adminField, String key, Set adminUsers, Service service, CIMClient cc, Set setWithGlobalAdmins, boolean globalAcl) throws UpdateControlsException {
		adminField.setControlValue(new Boolean(adminUsers.contains(key) || setWithGlobalAdmins.contains(key)));
		
		if (!globalAcl)
		{
			//if the admin is defined in global the mark the field as read-only
			adminField.getProperties().setReadOnly(setWithGlobalAdmins.contains(key));
		}
		else
		{
			adminField.getProperties().setReadOnly(false);
		}
	}	

	protected String[] getReadWriteTypes(WbemSmtResourceBundle bundle) {
		if (RuntimeUtil.getInstance().isCommandline())
		{
			return new String[]{"r","r/w"};
		}
		else
		{
			return new String[]{bundle.getString("read"),bundle.getString("readWrite")};
		}
	}

	protected String[] getValidInvalidTypes(WbemSmtResourceBundle bundle) {
		if (RuntimeUtil.getInstance().isCommandline())
		{
			return new String[]{"no","yes"};
		}
		else
		{
			return new String[]{bundle.getString("no.access"),bundle.getString("access")};
		}
	}
	
	protected void updateModelHostsAcl(DataContainer container, LabeledBaseInputComponentIf btnAdd, LabeledBaseInputComponentIf btnRemove, LabeledStringArrayInputComponentIf allowedHosts, LabeledStringArrayInputComponentIf hostsToAllow, ArrayList listHostsAllowed, ArrayList listHostsToAllow) {
		AbstractBaseCimAdapter adapter = container.getAdapter();
		
		if (adapter.getUpdateTrigger() == btnRemove)
		{
			UnsignedInt16 index = (UnsignedInt16) allowedHosts.getConvertedControlValue();
			if (index != null)
			{
				String host = (String) listHostsAllowed.get(index.intValue());
				logger.info("Remove Allow Host " + host);
			}
		}
		if (adapter.getUpdateTrigger() == btnAdd)
		{
			UnsignedInt16 index = (UnsignedInt16) hostsToAllow.getConvertedControlValue();
			if (index != null)
			{
				String host = (String) listHostsToAllow.get(index.intValue());
				logger.info("Add Allow Host " + host);
			}
		}
	}

	public void resetUserAcl(Service service) {
		UserList userList = service.getUsers();
		for (int i=0; i < userList.size(); i++)
		{
			userList.getUser(i).resetAcl();
		}
	}

	public void resetShareAcl(Service service) {
		ShareList shareList = service.getShares();
		for (int i=0; i < shareList.size(); i++)
		{
			shareList.getShare(i).resetShareUsers();
		}
	}
	
	public void resetShareChilds(Service service) {
		ShareList shareList = service.getShares();
		for (int i=0; i < shareList.size(); i++)
		{
			shareList.getShare(i).resetChilds();
		}
	}

	public void resetPrinterAcl(Service service) {
		PrinterList printerList = service.getPrinters();
		for (int i=0; i < printerList.size(); i++)
		{
			printerList.getPrinter(i).resetPrinterUsers();
		}
	}

	public void resetPrinterChilds(Service service) {
		PrinterList printerList = service.getPrinters();
		for (int i=0; i < printerList.size(); i++)
		{
			printerList.getPrinter(i).resetChilds();
		}
	}

	protected void updateSharePrinterAdminForGlobalControls(UserIsAdminItem container, Linux_SambaUser fco, Set adminsBySambaUserName) {

		String username = fco.get_SambaUserName();
		container.get_usr_SambaUserName().setControlValue(username);
		container.get_usr_Admin().setControlValue(new Boolean(adminsBySambaUserName.contains(username)));
		
	}

	protected void updateSharePrinterAdminForGlobalControls(UserIsAdminItem container, Set adminsBySambaUserName, Service service) throws UpdateControlsException {

		try {
			User user = getCurrenUser(container, service);
			Linux_SambaUser fco = user.getUser();
			updateSharePrinterAdminForGlobalControls(container,fco,adminsBySambaUserName);
		} catch (ModelLoadException e) {
			throw new UpdateControlsException(e);
		}
	}

	/**
	 * This method is called from the commandline and so we get the userid from the Container itself. Which is set by the Commandlet
	 * @param container
	 * @param service
	 * @return
	 * @throws UpdateControlsException
	 */
	protected User getCurrenUser(UserIsAdminItem container, Service service) throws ModelLoadException {
		String userName = (String) container.get_usr_SambaUserName().getConvertedControlValue();
		User user = service.getUsers().getUserByName(userName);
		if (user == null)
		{
			throw new ModelLoadException(container.getAdapter().getBundle().getString("userInService.not.found", new Object[]{service.getService().get_Name(),userName}));
		}
		return user;
	}

	public void updateForceUser(DataContainer container, LabeledBaseInputComponentIf currentForceUser, LabeledStringArrayInputComponentIf newForceUser, Service service, Linux_SambaUser currentForceUserFco) throws UpdateControlsException {
		String name = currentForceUserFco != null ? currentForceUserFco.get_SambaUserName() : container.getAdapter().getBundle().getString("no.force.user");
		currentForceUser.setControlValue( name );
		
		List userNames = new ArrayList();
		userNames.add(container.getAdapter().getBundle().getString("no.new.force.user"));
		userNames.addAll(StringUtil.asList(service.getUsers().getNameArray()));
		String[] array = (String[]) userNames.toArray(new String[userNames.size()]);
		newForceUser.setValues(array);
		int index = StringUtil.indexOf(array,name);
		if (index == -1)
		{
			index = 0;
		}
		newForceUser.setControlValue(new UnsignedInt16(index));
	}

	protected boolean saveValidInvalid(LabeledStringArrayInputComponentIf viField, Linux_SambaUser fco, Set invalidUsers, Set validUsers, CIMClient cc, Vector vKeyProperties, Class invalidAssocClass, Class validAssocClass) throws ObjectSaveException {
		String key = fco.get_SambaUserName();
		return saveValidInvalidImpl(viField, invalidUsers, validUsers, cc, vKeyProperties, invalidAssocClass, validAssocClass, key);
	}

	protected boolean saveValidInvalid(LabeledStringArrayInputComponentIf viField, Linux_SambaPrinterOptions fco, Set invalidPrinters, Set validPrinters, CIMClient cc, Vector vKeyProperties, Class invalidAssocClass, Class validAssocClass) throws ObjectSaveException {
		String key = fco.get_Name();
		return saveValidInvalidImpl(viField, invalidPrinters, validPrinters, cc, vKeyProperties, invalidAssocClass, validAssocClass, key);
	}
	protected boolean saveValidInvalid(LabeledStringArrayInputComponentIf viField, Linux_SambaShareOptions fco, Set invalidShares, Set validShares, CIMClient cc, Vector vKeyProperties, Class invalidAssocClass, Class validAssocClass) throws ObjectSaveException {
		String key = fco.get_Name();
		return saveValidInvalidImpl(viField, invalidShares, validShares, cc, vKeyProperties, invalidAssocClass, validAssocClass, key);
	}

	private boolean saveValidInvalidImpl(LabeledStringArrayInputComponentIf viField, Set invalids, Set valids, CIMClient cc, Vector vKeyProperties, Class invalidAssocClass, Class validAssocClass, String key) throws ObjectSaveException {
		UnsignedInt16 index = null;
		try {
			index = (UnsignedInt16) viField.getConvertedControlValue();
		} catch (IllegalArgumentException e) {
			// can occur if the commandline part write a "not-defined" value if no value was set
		}
		boolean invalid = false,valid=false;
		if (index == null)
		{
			invalid = valid = false;
		}
		else
		{
			if (index.intValue() == USR_ACL_IDX_DISABLE)
			{
				invalid = true;	
			}
			else
			{
				valid = true;
			}
		}
		boolean reload = save(invalid,invalids,invalidAssocClass,key,vKeyProperties,cc);
		return save(valid,valids,validAssocClass,key,vKeyProperties,cc) || reload;
	}

	protected boolean saveReadWrite(LabeledStringArrayInputComponentIf rwField, Linux_SambaUser fco, Set readUsers, Set writeUsers, CIMClient cc, Vector vKeyProperties, Class readListAssocClass, Class writeListAssocClass) throws ObjectSaveException {
		String key = fco.get_SambaUserName();
		return saveReadWriteImpl(rwField, readUsers, writeUsers, cc, vKeyProperties, readListAssocClass, writeListAssocClass, key);
	}

	protected boolean saveReadWrite(LabeledStringArrayInputComponentIf rwField, Linux_SambaShareOptions fco, Set readShares, Set writeShares, CIMClient cc, Vector vKeyProperties, Class readListAssocClass, Class writeListAssocClass) throws ObjectSaveException {
		String key = fco.get_Name();
		return saveReadWriteImpl(rwField, readShares, writeShares, cc, vKeyProperties, readListAssocClass, writeListAssocClass, key);
	}

	protected boolean saveReadWrite(LabeledStringArrayInputComponentIf rwField, Linux_SambaPrinterOptions fco, Set readPrinters, Set writePrinters, CIMClient cc, Vector vKeyProperties, Class readListAssocClass, Class writeListAssocClass) throws ObjectSaveException {
		String key = fco.get_Name();
		return saveReadWriteImpl(rwField, readPrinters, writePrinters, cc, vKeyProperties, readListAssocClass, writeListAssocClass, key);
	}

	private boolean saveReadWriteImpl(LabeledStringArrayInputComponentIf rwField, Set reads, Set writes, CIMClient cc, Vector vKeyProperties, Class readListAssocClass, Class writeListAssocClass, String key) throws ObjectSaveException {
		UnsignedInt16 index = null;
		try {
			index = (UnsignedInt16) rwField.getConvertedControlValue();
		} catch (IllegalArgumentException e) {
			// can occur if the commandline part write a "not-defined" value if no value was set
		}
		boolean read = false,write=false;
		if (index == null)
		{
			read = write = false;
		}
		else
		{
			if (index.intValue() == USR_ACL_IDX_DISABLE)
			{
				read = true;	
			}
			else
			{
				write = true;
			}
		}
		boolean reload = save(read,reads,readListAssocClass,key,vKeyProperties,cc);
		return save(write,writes,writeListAssocClass,key,vKeyProperties,cc) || reload;
	}
	
	/**
	 * compares if the createFlag is true and the item with the key key is contained in the set. If it's not contained the item is created
	 * Same for deleting the object. If !createFlag and the item with the key key is contained in the set it's deleted.
	 * @param createFlag
	 * @param set
	 * @param fcoClass
	 * @param key
	 * @param keyProperties
	 * @param cc
	 * @return
	 * @throws ObjectSaveException
	 */
	public boolean save(boolean createFlag, Set set, Class fcoClass, String key, Vector keyProperties, CIMClient cc) throws ObjectSaveException {
		
		Object o = null;
		try {
			boolean reload = false;
			if (createFlag)
			{
				if (!set.contains(key))
				{
					reload = true;
					
					Constructor constructor = fcoClass.getConstructor(new Class[]{Vector.class});
					constructor.setAccessible(true);
					o = constructor.newInstance(new Object[]{keyProperties});
					adapter.getFcoHelper().create(o,cc);
				}
			}
			else
			{
				if (set.contains(key))
				{
					reload = true;
					adapter.getFcoHelper().delete(fcoClass,keyProperties,cc);
				}
			}
			return reload;
		} catch (ObjectCreationException e) {
			throw e;
		} catch (ObjectDeletionException e) {
			throw new ObjectSaveException(e);
		}
		
		catch (Exception e) {
			if (o instanceof CIM_ManagedElement) {
				throw new ObjectSaveException(adapter.getFcoHelper().getCIM_ObjectCreator().createUnhecked(o),e);
			} else if (o instanceof CIM_Component) {
				throw new ObjectSaveException(adapter.getFcoHelper().getCIM_ObjectCreator().createUnhecked(o),e);
			}
			throw new ObjectSaveException(e);
		}
	}
}
