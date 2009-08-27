 /** 
  * ShareList.java
  *
  * © Copyright IBM Corp.  2009,2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: List of samba Share wrapper objects
  * 
  */
package org.sblim.wbemsmt.samba.bl.wrapper.list;

import javax.cim.CIMObjectPath;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.wrapper.ObjectList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.wrapper.Share;
import org.sblim.wbemsmt.schema.cim221.CIM_ManagedElement;


/**
 * @see org.sblim.wbemsmt.samba.bl.wrapper.Share
 */

public class ShareList extends ObjectList  {

	public Share getShare(CimObjectKey key)
	{
		return (Share)get(key);
	}
	
	public Share getShare(CIMObjectPath path)
	{
		return getShare(new CimObjectKey(path));
	}

	public Share getShare(CIM_ManagedElement element)
	{
		return getShare(new CimObjectKey(element.getCimObjectPath()));
	}

	public void addShare(Share share) throws WbemsmtException
	{
		put(share);
	}
	
	protected Object getKey(Object value) {
		Share share = (Share) value;
		return share.getShare().get_key_Name();
	}
	
	protected Object getFco(Object value) {
		Share share = (Share) value;
		return share.getShare();
	}

	public Share getShareByName(String nameOfShare) throws WbemsmtException {
		return (Share) getObjectsByName().get(nameOfShare);
	}

	public Share getShare(int i) throws WbemsmtException {
		return (Share) getList().get(i);
	}
}
