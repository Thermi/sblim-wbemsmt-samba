 /** 
  * SambaCimAdapterInstallValidatorsDelegatee.java
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
  * Description: Delegatee for Installing validators
  * 
  */
package org.sblim.wbemsmt.samba.bl.adapter;

import javax.cim.UnsignedInteger16;
import javax.cim.UnsignedInteger32;

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.container.global.*;
import org.sblim.wbemsmt.samba.bl.container.host.HostDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.*;
import org.sblim.wbemsmt.samba.bl.container.service.*;
import org.sblim.wbemsmt.samba.bl.container.share.*;
import org.sblim.wbemsmt.samba.bl.container.user.PrinterInUserACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.ShareInUserACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.UserDataContainer;
import org.sblim.wbemsmt.samba.bl.container.wizard.*;
import org.sblim.wbemsmt.samba.bl.validator.DuplicateSambaServiceValidator;
import org.sblim.wbemsmt.samba.bl.validator.SambaUsernameValidator;
import org.sblim.wbemsmt.samba.bl.wrapper.Service;
import org.sblim.wbemsmt.tools.validator.*;

public class SambaCimAdapterInstallValidatorsDelegatee extends SambaDelegatee implements
		SambaCimAdapterInstallValidatorsIf {

	public SambaCimAdapterInstallValidatorsDelegatee(SambaCimAdapter adapter) {
		super(adapter);
	}



	public void installValidatorsImpl(ServiceOperationsDataContainer container) {
		
		
	}

	public void installValidatorsImpl(ServiceOptionsDataContainer container) {
		
		
	}

	public void installValidatorsImpl(ServiceLoggingDataContainer container) {
		adapter.addValidator(container,new NumericFieldValidator(UnsignedInteger16.MIN_VALUE,UnsignedInteger16.MAX_VALUE,container.get_SysLog(), adapter));
		adapter.addValidator(container,new NumericFieldValidator(UnsignedInteger32.MIN_VALUE,UnsignedInteger32.MAX_VALUE,container.get_MaxLogSize(), adapter));
	}

	public void installValidatorsImpl(ServiceGlobalSecurityOptionsDataContainer container) {
		
		
	}

	public void installValidatorsImpl(ServiceUserSecurityOptionsDataContainer container) {
		
		
	}

	public void installValidatorsImpl(ServiceAllowHostSecurityDataContainer container) {
		
		
	}

	public void installValidatorsImpl(ServiceDenyHostDataContainer container) {
		
		
	}

	public void installValidatorsImpl(ServiceScriptingDataContainer container) {
		
		
	}

	public void installValidatorsImpl(ServiceWinsDataContainer container) {
		
		
	}

	public void installValidatorsImpl(ShareWizardPage1 container) {
		RequiredFieldValidator requiredFieldValidator = new RequiredFieldValidator(container.get_Name(),adapter);
		requiredFieldValidator.addChild(new DuplicateSambaServiceValidator(container.get_Name(),adapter));
		adapter.addValidator(container,requiredFieldValidator);
		adapter.addValidator(container,new RequiredFieldValidator(container.get_Path(),adapter));
	}

	public void installValidatorsImpl(ShareOptionsDataContainer container) {
		
		
	}

	public void installValidatorsImpl(ShareGlobalsDataContainer container) {
		
		
	}

	public void installValidatorsImpl(CMDShareGlobalsDataContainer container) {
		
		
	}

	public void installValidatorsImpl(GUIShareGlobalsDataContainer container) {
		
		
	}

	public void installValidatorsImpl(PrintingGlobalsDataContainer container) {
		
		adapter.addValidator(container,new NumericFieldValidator(Long.MIN_VALUE,Long.MAX_VALUE,container.get_PrintcapCacheTime(), adapter));
		adapter.addValidator(container,new NumericFieldValidator(Long.MIN_VALUE,Long.MAX_VALUE,container.get_MaxReportedPrintjobs(),adapter));
		adapter.addValidator(container,new NumericFieldValidator(Long.MIN_VALUE,Long.MAX_VALUE,container.get_MaxPrintjobs(),adapter));
	}

	public void installValidatorsImpl(PrinterWizardPage1 container) {
	}

	public void installValidatorsImpl(UserWizardPage1 container) throws WbemsmtException {

		Validator sysUserRequiredValidator = new RequiredFieldValidator(container.get_SystemUserName(),adapter);
        sysUserRequiredValidator.addChild(new OtherSelectionValidator(container.get_SystemUserName(),Service.KEY_NO_SYSTEMUSER_FOUND,adapter,adapter.getSelectedService().getSystemUsers().getNameArray()));
        adapter.addValidator(container,sysUserRequiredValidator);

		
		Validator password1Validator = new RequiredFieldValidator(container.get_SambaUserPassword(),adapter);
		Validator password2Validator = new RequiredFieldValidator(container.get_SambaUserPassword2(),adapter);
		adapter.addValidator(container,password1Validator);
		adapter.addValidator(container,password2Validator);

		Validator passwordsOkValidator = new ValidationOKValidator(new Validator[]{password1Validator,password2Validator},adapter);
		passwordsOkValidator.addChild(new SameContentValidator(container.get_SambaUserPassword(),container.get_SambaUserPassword2(),adapter));
		adapter.addValidator(container, passwordsOkValidator);
		
		RequiredFieldValidator sambaUserNameRequiredValidator = new RequiredFieldValidator(container.get_SambaUserName(),adapter);
		sambaUserNameRequiredValidator.addChild(new SambaUsernameValidator(container.get_SambaUserName(),adapter));
		adapter.addValidator(container,sambaUserNameRequiredValidator);
		
	}

	public void installValidatorsImpl(HostWizardPage1 container) {
		adapter.addValidator(container,new RequiredFieldValidator(container.get_Name(),adapter));
	}
	
	public void installValidatorsImpl(ShareDenyHostSecurityDataContainer container) {
		
		
	}

	public void installValidatorsImpl(PrinterOptionsDataContainer container) {
	}

	public void installValidatorsImpl(PrintingOptionsDataContainer container) {
		adapter.addValidator(container,new NumericFieldValidator(Long.MIN_VALUE,Long.MAX_VALUE,container.get_MaxReportedPrintjobs(),adapter));
		adapter.addValidator(container,new NumericFieldValidator(Long.MIN_VALUE,Long.MAX_VALUE,container.get_MaxPrintjobs(),adapter));
	}

	public void installValidatorsImpl(PrinterAllowHostSecurityDataContainer container) {
		
		
	}

	public void installValidatorsImpl(PrinterDenyHostSecurityDataContainer container) {
		
		
	}

	public void installValidatorsImpl(HostDataContainer container) {
	}

	public void installValidatorsImpl(UserDataContainer container) {
	}

	public void installValidatorsImpl(ShareFileAttributes container) {
	}

	public void installValidatorsImpl(CMDShareFileAttributes container) {
		installShareFileAttributesValidators(container);
	}

	public void installValidatorsImpl(GUIShareFileAttributes container) {
		installShareFileAttributesValidators(container);
	}

	private void installShareFileAttributesValidators(ShareFileAttributes container) {
	}
	

	public void installValidatorsImpl(UserACLItemDataContainerForShare container) {
	}

	public void installValidatorsImpl(UserACLItemDataContainerForPrinter container) {
	}

	public void installValidatorsImpl(UserACLItemDataContainerForService container) {
	}

	public void installValidatorsImpl(PrinterACLItemDataContainer container) {
	}


	public void installValidatorsImpl(ShareACLItemDataContainer container) {
	}


	public void installValidatorsImpl(UserInShareACLDataContainer container) {
	}


	public void installValidatorsImpl(UserInPrinterACLDataContainer container) {
	}


	public void installValidatorsImpl(PrinterInUserACLDataContainer container) {
	}


	public void installValidatorsImpl(ShareInUserACLDataContainer container) {
	}


	public void installValidatorsImpl(ShareAllowHostSecurityDataContainer container) {
	}


	public void installValidatorsImpl(PrinterWizardPage2 container) throws WbemsmtException {
		adapter.addValidator(container,new OtherSelectionValidator(container.get_usr_SystemPrinterName(),Service.KEY_NO_SYSTEMPRINTER_FOUND,adapter,adapter.getSelectedService().getSystemPrinters().getNameArray()));
        RequiredFieldValidator requiredFieldValidator = new RequiredFieldValidator(container.get_SambaPrinterName(),adapter);
        requiredFieldValidator.addChild(new DuplicateSambaServiceValidator(container.get_SambaPrinterName(),adapter));
        adapter.addValidator(container,requiredFieldValidator);
        adapter.addValidator(container,new RequiredFieldValidator(container.get_Path(),adapter));
	}


	public void installValidatorsImpl(PrinterWizardPage3 container) {
	}


	public void installValidatorsImpl(PrinterWizardPage4 container) {
	}


	public void installValidatorsImpl(PrinterWizardPage5 container) {
	}


	public void installValidatorsImpl(UserWizardPage2 container) {
	}


	public void installValidatorsImpl(UserWizardPage3 container) {
	}


	public void installValidatorsImpl(ShareWizardPage2 container) {
	}


	public void installValidatorsImpl(ShareWizardPage3GUI container) {
	}


	public void installValidatorsImpl(ShareWizardPage4 container) {
	}


	public void installValidatorsImpl(HostWizardPage2 container) {
	}


	public void installValidatorsImpl(PrinterInUserWizardACLItemDataContainer container) {
	}


	public void installValidatorsImpl(ShareInUserWizardACLItemDataContainer container) {
	}


	public void installValidatorsImpl(UserInPrinterWizardACLItemDataContainer container) {
	}


	public void installValidatorsImpl(UserInShareWizardACLItemDataContainer container) {
	}


	public void installValidatorsImpl(ShareWizardPage3CMD container) {
		adapter.addValidator(container,new RequiredFieldValidator(container.get_CreateMask(),adapter));
		adapter.addValidator(container,new RequiredFieldValidator(container.get_DirectoryMask(),adapter));
		adapter.addValidator(container,new RequiredFieldValidator(container.get_DirectorySecurityMask(),adapter));
	}


	public void installValidatorsImpl(UserIsAdminItem container) {
		
		
	}


	public void installValidatorsImpl(AdminUsersInPrinterGlobals container) {
	}

	public void installValidatorsImpl(AdminUsersInShareGlobals container) {
	}
}
