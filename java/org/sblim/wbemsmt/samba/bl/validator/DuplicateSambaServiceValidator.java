 /** 
  * DuplicateSambaServiceValidator.java
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
  * Description: Validates if the name of the samba service (Share,Printer) already exists 
  * 
  */
package org.sblim.wbemsmt.samba.bl.validator;

import org.sblim.wbemsmt.bl.adapter.Message;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.exception.ValidationException;
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
	public void validateElement(MessageList result) throws ValidationException {
		
		String name = (String) shareOrPrinterName.getConvertedControlValue();
		
		Share share = sambaCimAdapter.getSelectedService().getShares().getShareByName(name);
		if (share != null)
		{
			String msg = adapter.getBundle().getString(SambaErrCodes.MSG_SHARE_EXISTS, "validator.shareExists",new Object[]{shareOrPrinterName.getLabelText(), name});
			result.addMessage(new Message(SambaErrCodes.MSG_SHARE_EXISTS,Message.ERROR,msg,shareOrPrinterName));
		}
		
		Printer printer = sambaCimAdapter.getSelectedService().getPrinters().getPrinterByName(name);
		if (printer != null)
		{
			String msg = adapter.getBundle().getString(SambaErrCodes.MSG_PRINTER_EXISTS, "validator.printerExists",new Object[]{shareOrPrinterName.getLabelText(), name});
			result.addMessage(new Message(SambaErrCodes.MSG_PRINTER_EXISTS,Message.ERROR,msg,shareOrPrinterName));
		}
		
		if (name.equalsIgnoreCase("global"))
		{
			String msg = adapter.getBundle().getString(SambaErrCodes.MSG_GLOBAL_EXISTS,"validator.globalExists", new Object[]{shareOrPrinterName.getLabelText()});
			result.addMessage(new Message(SambaErrCodes.MSG_PRINTER_EXISTS,Message.ERROR,msg,shareOrPrinterName));
		}

	}

}
