 /** 
  * ListSambaSharesLoader.java
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
  * Description: class for loading the objects if user lists the printers
  * 
  */
package org.sblim.wbemsmt.cli.samba.listener;

import org.sblim.wbemsmt.tools.cli.CliDataLoader;
import org.sblim.wbemsmt.tools.cli.OptionDefinition;

public class ListSambaPrintersLoader extends SambaServiceLoader implements
		CliDataLoader {

	/**
	 * 
	 */
	public ListSambaPrintersLoader() {
		super();
		
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.cli.samba.listener.SambaServiceLoader#getServiceNameKey()
	 */
	protected OptionDefinition getServiceNameKey() {
		return ListSambaPrinters.KEY_GLOBAL_serviceName;
	}

}