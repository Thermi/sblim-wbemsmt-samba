 /** 
  * SambaCimAdapterDeleteDelegatee.java
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
  * Description: Delegatee for Deleting objects
  * 
  */
package org.sblim.wbemsmt.samba.bl.adapter;

import org.sblim.wbemsmt.bl.fco.FcoHelper;
import org.sblim.wbemsmt.exception.ObjectDeletionException;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaHost;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaPrinterOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareOptions;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaUser;

public class SambaCimAdapterDeleteDelegatee extends SambaDelegatee implements SambaCimAdapterDeleteIf {

	public SambaCimAdapterDeleteDelegatee(SambaCimAdapter adapter) {
		super(adapter);
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapterDeleteIf#deleteImpl(org.sblim.wbemsmt.samba.bl.fco.Linux_SambaShareOptions)
	 */
	public void deleteImpl(Linux_SambaShareOptions fco)
			throws ObjectDeletionException {
		
		try {
			FcoHelper.delete(fco,adapter.getCimClient());
			adapter.setMarkedForReload();
		} catch (Exception e) {
			throw new ObjectDeletionException(fco,e);
		}
			

	}

	public void deleteImpl(Linux_SambaHost fco) throws ObjectDeletionException {
		try {
			FcoHelper.delete(fco,adapter.getCimClient());
			adapter.setMarkedForReload();
		} catch (Exception e) {
			throw new ObjectDeletionException(fco,e);
		}
	}

	public void deleteImpl(Linux_SambaPrinterOptions fco) throws ObjectDeletionException {
		try {
			FcoHelper.delete(fco,adapter.getCimClient());
			adapter.setMarkedForReload();
		} catch (Exception e) {
			throw new ObjectDeletionException(fco,e);
		}
	}

	public void deleteImpl(Linux_SambaUser fco) throws ObjectDeletionException {
		try {
			FcoHelper.delete(fco,adapter.getCimClient());
			adapter.setMarkedForReload();
		} catch (Exception e) {
			throw new ObjectDeletionException(fco,e);
		}
	}

}
