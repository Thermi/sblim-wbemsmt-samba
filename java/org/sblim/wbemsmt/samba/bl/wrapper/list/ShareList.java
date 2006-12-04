 /** 
  * ShareList.java
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
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: List of samba Share wrapper objects
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper.list;

import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.wrapper.ObjectList;
import org.sblim.wbemsmt.samba.bl.wrapper.Share;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;


/**
 * @see org.sblim.wbemsmt.samba.bl.wrapper.Share
 */

public class ShareList extends ObjectList  {

	public Share getShare(CimObjectKey key)
	{
		return (Share)objectsByCimObjectKey.get(key);
	}
	
	public Share getShare(CIMObjectPath path)
	{
		return getShare(new CimObjectKey(path));
	}

	public Share getShare(CIM_ManagedElement element)
	{
		return getShare(new CimObjectKey(element.getCimObjectPath()));
	}

	public void addShare(Share share)
	{
		objectsByCimObjectKey.put(share.getCimObjectKey(),share);
	}
	
	protected String getKey(Object value) {
		Share share = (Share) value;
		return share.getShare().get_Name();
	}
	
	protected Object getFco(Object value) {
		Share share = (Share) value;
		return share.getShare();
	}

	public Share getShareByName(String nameOfShare) {
		return (Share) getObjectsByName().get(nameOfShare);
	}

	public Share getShare(int i) {
		return (Share) getList().get(i);
	}
}
