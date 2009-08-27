 /** 
  * DuplicateSambaServiceValidator.java
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
  * Description: Validates if the name of the samba service (Share,Printer) already exists 
  * 
  */
package org.sblim.wbemsmt.samba.bl.validator;

import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter;
import org.sblim.wbemsmt.samba.bl.adapter.SambaErrCodes;
import org.sblim.wbemsmt.samba.bl.wrapper.Printer;
import org.sblim.wbemsmt.samba.bl.wrapper.Share;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.validator.Validator;

public class DuplicateSambaServiceValidator extends Validator {

	private final SambaCimAdapter sambaCimAdapter;
	private final LabeledBaseInputComponentIf shareOrPrinterName;

	public DuplicateSambaServiceValidator(LabeledBaseInputComponentIf shareOrPrinterName, SambaCimAdapter adapter) {
		super(adapter);
		this.shareOrPrinterName = shareOrPrinterName;
		sambaCimAdapter = adapter;
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.validator.Validator#getComponents()
	 */
	protected LabeledBaseInputComponentIf[] getComponents() {
		return new LabeledBaseInputComponentIf[]{shareOrPrinterName};
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.validator.Validator#validateElement(org.sblim.wbemsmt.bl.adapter.MessageList)
	 */
	public void validateElement(MessageList result) throws WbemsmtException {
		
		String name = (String) shareOrPrinterName.getConvertedControlValue();
        
        Share share = sambaCimAdapter.getSelectedService().getShares().getShareByName(name);
        if (share != null)
        {
        	result.addMessage(Message.create(SambaErrCodes.MSG_SHARE_EXISTS,Message.ERROR,adapter.getBundle(),"validator.shareExists",new Object[]{shareOrPrinterName.getLabelText(), name}));
        }
        
        Printer printer = sambaCimAdapter.getSelectedService().getPrinters().getPrinterByName(name);
        if (printer != null)
        {
        	result.addMessage(Message.create(SambaErrCodes.MSG_PRINTER_EXISTS,Message.ERROR,adapter.getBundle(),"validator.printerExists",new Object[]{shareOrPrinterName.getLabelText(), name}));
        }
        
        if (name.equalsIgnoreCase("global"))
        {
        	result.addMessage(Message.create(SambaErrCodes.MSG_PRINTER_EXISTS,Message.ERROR,adapter.getBundle(),"validator.globalExists", new Object[]{shareOrPrinterName.getLabelText()}));
        }

	}

}
