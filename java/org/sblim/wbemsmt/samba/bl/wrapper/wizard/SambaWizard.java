 /** 
  * SambaWizard.java
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
  * Description: Wrapper for Wrapper Object for Samba Wizards
  * 
  */


package org.sblim.wbemsmt.samba.bl.wrapper.wizard;

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.UpdateControlsException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter;
import org.sblim.wbemsmt.samba.bl.adapter.SambaObject;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser;
import org.sblim.wbemsmt.samba.bl.wrapper.Service;
import org.sblim.wbemsmt.schema.cim29.CIM_SettingData;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf;
import org.sblim.wbemsmt.util.StringUtil;

public class SambaWizard extends SambaObject {

	protected final SambaCimAdapter adapter;

	public SambaWizard(SambaCimAdapter adapter) {
		this.adapter = adapter;
	}

	public void loadChilds(CIMClient cimClient) throws ModelLoadException {
		//do nothing per defautl - wizards have no childs
	}

	public CimObjectKey getCimObjectKey() {
		return null;
	}

	public void setInstanceId(CIM_SettingData settingData) {
		settingData.set_InstanceID(adapter.getSelectedService().getService().get_Name());
	}
	
	public void updateForceUserForWizard(DataContainer container, LabeledStringArrayInputComponentIf newForceUser, Service service) throws UpdateControlsException {
		List userNames = new ArrayList();
		userNames.add(container.getAdapter().getBundle().getString("no.new.force.user"));
		userNames.addAll(StringUtil.asList(service.getUsers().getNameArray()));
		String[] array = (String[]) userNames.toArray(new String[userNames.size()]);
		newForceUser.setValues(array);
	}

	public void setForceUserForWizardOverview(DataContainer container, LabeledStringArrayInputComponentIf forceUserInput, LabeledBaseInputComponentIf forceUserLabel) {
		UnsignedInt16 index = (UnsignedInt16) forceUserInput.getConvertedControlValue();
		//first element is the "no force user text" so subtract one to get the right user
		if (index == null || index.intValue() == 0)
		{
			forceUserLabel.setControlValue(container.getAdapter().getBundle().getString("no.new.force.user"));
		}
		else
		{
			Linux_SambaUser user = ((SambaCimAdapter) container.getAdapter()).getSelectedService().getUsers().getUser(index.intValue()-1).getUser();
			forceUserLabel.setControlValue(user.get_SambaUserName());
		}
	}
	

}
