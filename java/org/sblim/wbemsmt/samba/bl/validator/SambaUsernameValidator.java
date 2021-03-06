 /** 
  * SambaUsernameValidator.java
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
  * Description: Checks if a user with the same name already exists 
  * 
  */
package org.sblim.wbemsmt.samba.bl.validator;

import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter;
import org.sblim.wbemsmt.samba.bl.adapter.SambaErrCodes;
import org.sblim.wbemsmt.samba.bl.wrapper.User;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.validator.Validator;

public class SambaUsernameValidator extends Validator {

	
	private final LabeledBaseInputComponentIf component;
	private final SambaCimAdapter sambaCimAdapter;

	/**
	 * Creates a new Validator
	 * @param component the component where the selected index is extracted from
	 * @param key the resourceBundle key of the value that is not allowed
	 * @param adapter
	 * @param values the array with the possible values
	 */
	public SambaUsernameValidator(LabeledBaseInputComponentIf component, SambaCimAdapter adapter) {
		super(adapter);
		this.component = component;
		sambaCimAdapter = adapter;
	}

	/**
	 * @see org.sblim.wbemsmt.tools.validator.Validator#validate()
	 */
	public void validateElement(MessageList result) throws WbemsmtException {
		
		if (!component.isEmpty())
        {
        	String userName = (String) component.getConvertedControlValue();
        	User user = sambaCimAdapter.getSelectedService().getUsers().getUserByName(userName);
        	if (user != null)
        	{
        		String msg = adapter.getBundle().getString(SambaErrCodes.MSG_USER_EXISTS,"validator.userExists",new Object[]{userName});
        		result.addMessage(new Message(SambaErrCodes.MSG_USER_EXISTS,Message.ERROR,msg,component));
        		
        	}
        }
	}

	protected LabeledBaseInputComponentIf[] getComponents() {
		return new LabeledBaseInputComponentIf[]{component} ;
	}

}
