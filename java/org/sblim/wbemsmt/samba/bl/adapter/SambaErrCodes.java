 /** 
  * SambaErrCodes.java
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
  * Description: ErrorCodes for Samba Task
  * 
  */
package org.sblim.wbemsmt.samba.bl.adapter;

import org.sblim.wbemsmt.bl.ErrCodes;
import org.sblim.wbemsmt.bl.MessageNumber;
import org.sblim.wbemsmt.bl.adapter.Message;
import org.sblim.wbemsmt.bl.adapter.MessageDefinition;

/**
 * @author Bauschert
 *
 */
public class SambaErrCodes {
	/**
	 * Validator
	 */
	public final static String SUBSYS_SMB = "SMB";

	/**
	 * Messages for Samba
	 */
	public static final MessageNumber MSG_PRINTER_EXISTS = new MessageNumber(ErrCodes.COMPONENT,SUBSYS_SMB,1);
	public static final MessageNumber MSG_SHARE_EXISTS = new MessageNumber(ErrCodes.COMPONENT,SUBSYS_SMB,2);
	public static final MessageNumber MSG_USER_EXISTS = new MessageNumber(ErrCodes.COMPONENT,SUBSYS_SMB,3);
	public static final MessageNumber MSG_GLOBAL_EXISTS = new MessageNumber(ErrCodes.COMPONENT,SUBSYS_SMB,4);

	public static final MessageNumber MSG_CANNOT_SELECT_SERVICE = new MessageNumber(ErrCodes.COMPONENT,SUBSYS_SMB,5);
	
	public static final MessageDefinition MSGDEF_CANNOT_STOP_RC = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_SMB,6),Message.ERROR,"cannot.stop.rc");
	public static final MessageDefinition MSGDEF_CANNOT_STOP_STATUS = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_SMB,7),Message.ERROR,"cannot.stop.status");
	public static final MessageDefinition MSGDEF_CANNOT_START_RC = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_SMB,8),Message.ERROR,"cannot.start.rc");
	public static final MessageDefinition MSGDEF_CANNOT_START_STATUS = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_SMB,9),Message.ERROR,"cannot.start.status");
	

}
