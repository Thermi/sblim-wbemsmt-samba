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

import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt32;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInPrinterGlobals;
import org.sblim.wbemsmt.samba.bl.container.global.AdminUsersInShareGlobals;
import org.sblim.wbemsmt.samba.bl.container.global.CMDShareGlobalsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.global.GUIShareGlobalsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.global.PrintingGlobalsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.global.ShareGlobalsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.global.UserIsAdminItem;
import org.sblim.wbemsmt.samba.bl.container.host.HostDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.PrinterAllowHostSecurityDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.PrinterDenyHostSecurityDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.PrinterListDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.PrinterListItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.PrinterOptionsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.PrintingOptionsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.printer.UserACLItemDataContainerForPrinter;
import org.sblim.wbemsmt.samba.bl.container.printer.UserInPrinterACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceAllowHostSecurityDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceDenyHostDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceGlobalSecurityOptionsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceLoggingDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceOperationsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceOptionsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceScriptingDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceUserSecurityOptionsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.ServiceWinsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.service.UserACLItemDataContainerForService;
import org.sblim.wbemsmt.samba.bl.container.share.CMDShareFileAttributes;
import org.sblim.wbemsmt.samba.bl.container.share.GUIShareFileAttributes;
import org.sblim.wbemsmt.samba.bl.container.share.PrinterACLItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.ShareACLItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.ShareAllowHostSecurityDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.ShareDenyHostSecurityDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.ShareFileAttributes;
import org.sblim.wbemsmt.samba.bl.container.share.ShareListDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.ShareListItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.ShareOptionsDataContainer;
import org.sblim.wbemsmt.samba.bl.container.share.UserACLItemDataContainerForShare;
import org.sblim.wbemsmt.samba.bl.container.share.UserInShareACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.PrinterInUserACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.ShareInUserACLDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.UserDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.UserListDataContainer;
import org.sblim.wbemsmt.samba.bl.container.user.UserListItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.welcome.WelcomeDataContainer;
import org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage1;
import org.sblim.wbemsmt.samba.bl.container.wizard.HostWizardPage2;
import org.sblim.wbemsmt.samba.bl.container.wizard.PrinterInUserWizardACLItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage1;
import org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage2;
import org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage3;
import org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage4;
import org.sblim.wbemsmt.samba.bl.container.wizard.PrinterWizardPage5;
import org.sblim.wbemsmt.samba.bl.container.wizard.ShareInUserWizardACLItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1;
import org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2;
import org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3CMD;
import org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage3GUI;
import org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4;
import org.sblim.wbemsmt.samba.bl.container.wizard.UserInPrinterWizardACLItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer;
import org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage1;
import org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage2;
import org.sblim.wbemsmt.samba.bl.container.wizard.UserWizardPage3;
import org.sblim.wbemsmt.samba.bl.validator.DuplicateSambaServiceValidator;
import org.sblim.wbemsmt.samba.bl.validator.SambaUsernameValidator;
import org.sblim.wbemsmt.samba.bl.wrapper.Service;
import org.sblim.wbemsmt.tools.validator.NumericFieldValidator;
import org.sblim.wbemsmt.tools.validator.OtherSelectionValidator;
import org.sblim.wbemsmt.tools.validator.RequiredFieldValidator;
import org.sblim.wbemsmt.tools.validator.SameContentValidator;
import org.sblim.wbemsmt.tools.validator.ValidationOKValidator;
import org.sblim.wbemsmt.tools.validator.Validator;

public class SambaCimAdapterInstallValidatorsDelegatee extends SambaDelegatee implements
		SambaCimAdapterInstallValidatorsIf {

	public SambaCimAdapterInstallValidatorsDelegatee(SambaCimAdapter adapter) {
		super(adapter);
	}


	private void installShareFileAttributesValidators(ShareFileAttributes container) {
	}


	public void installValidatorsImpl(ServiceOperationsDataContainer container) {
		
		
	}

	public void installValidatorsImpl(ServiceOptionsDataContainer container) {
		
		
	}

	public void installValidatorsImpl(ServiceLoggingDataContainer container) {
		adapter.addValidator(container,new NumericFieldValidator(UnsignedInt16.MIN_VALUE,UnsignedInt16.MAX_VALUE,container.get_SysLog(), adapter));
		adapter.addValidator(container,new NumericFieldValidator(UnsignedInt32.MIN_VALUE,UnsignedInt32.MAX_VALUE,container.get_MaxLogSize(), adapter));
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

	public void installValidatorsImpl(UserWizardPage1 container) {

		try {
			
			Validator sysUserRequiredValidator = new RequiredFieldValidator(container.get_SystemUserName(),adapter);
			sysUserRequiredValidator.addChild(new OtherSelectionValidator(container.get_SystemUserName(),Service.KEY_NO_SYSTEMUSER_FOUND,adapter,adapter.getSelectedService().getSystemUsers(container.getAdapter().getCimClient()).getNameArray()));
			adapter.addValidator(container,sysUserRequiredValidator);
		} catch (ModelLoadException e) {
			throw new RuntimeException("Cannot install Validators for WizardPage",e);
		}

		
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


	public void installValidatorsImpl(PrinterWizardPage2 container) {
		try {
			adapter.addValidator(container,new OtherSelectionValidator(container.get_usr_SystemPrinterName(),Service.KEY_NO_SYSTEMPRINTER_FOUND,adapter,adapter.getSelectedService().getSystemPrinters(container.getAdapter().getCimClient()).getNameArray()));
			RequiredFieldValidator requiredFieldValidator = new RequiredFieldValidator(container.get_SambaPrinterName(),adapter);
			requiredFieldValidator.addChild(new DuplicateSambaServiceValidator(container.get_SambaPrinterName(),adapter));
			adapter.addValidator(container,requiredFieldValidator);
			adapter.addValidator(container,new RequiredFieldValidator(container.get_Path(),adapter));
		} catch (ModelLoadException e) {
			throw new RuntimeException("Cannot install Validators for WizardPage",e);
		}
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


	public void installValidatorsImpl(ShareListDataContainer container) {
	}


	public void installValidatorsImpl(ShareListItemDataContainer container) {
	}


	public void installValidatorsImpl(PrinterListDataContainer container) {
	}


	public void installValidatorsImpl(PrinterListItemDataContainer container) {
	}


	public void installValidatorsImpl(UserListDataContainer container) {
	}


	public void installValidatorsImpl(UserListItemDataContainer container) {
	}


	public void installValidatorsImpl(WelcomeDataContainer container) {
		// TODO Auto-generated method stub
		
	}

}
