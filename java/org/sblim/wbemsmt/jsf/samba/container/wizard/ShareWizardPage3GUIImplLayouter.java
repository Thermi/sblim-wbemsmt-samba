 /** 
  * ShareWizardPage3GUIImplLayouter.java
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
  * Description: The Layouter for the wizard page
  * 
  */
package org.sblim.wbemsmt.jsf.samba.container.wizard;

import javax.faces.component.html.HtmlPanelGrid;

import org.sblim.wbemsmt.jsf.layout.JsfLayouter;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class ShareWizardPage3GUIImplLayouter extends JsfLayouter {

	/**
	 * 
	 */
	public ShareWizardPage3GUIImplLayouter() {
		super();
	}

	public void layout(HtmlPanelGrid parent, ShareWizardPage3GUIImpl container, WbemSmtResourceBundle bundle) {
		
		//String styleCaptions = "font-weight:bold";

		parent.setColumns(4);
		parent.setWidth("100%");
		
//		HtmlPanelGrid gridBits = JsfUtil.createPanelGrid(4);
//		HtmlPanelGrid gridUser = JsfUtil.createPanelGrid(3);
//		HtmlPanelGrid gridGroup = JsfUtil.createPanelGrid(3);
//		HtmlPanelGrid gridOther = JsfUtil.createPanelGrid(3);
//		
//		gridBits.setWidth("34%");
//		gridUser.setWidth("22%");
//		gridGroup.setWidth("22%");
//		gridOther.setWidth("22%");
//		
//		parent.getChildren().add(JsfUtil.createText(""));
//		parent.getChildren().add(JsfUtil.createText(bundle.getString("user"),styleCaptions));
//		parent.getChildren().add(JsfUtil.createText(bundle.getString("group"),styleCaptions));
//		parent.getChildren().add(JsfUtil.createText(bundle.getString("other"),styleCaptions));
//		
//		parent.getChildren().add(gridBits);
//		parent.getChildren().add(gridUser);
//		parent.getChildren().add(gridGroup);
//		parent.getChildren().add(gridOther);
//
//		gridBits.getChildren().add(JsfUtil.createText(""));
//		gridBits.getChildren().add(JsfUtil.createText(bundle.getString("right.u"),styleCaptions));
//		gridBits.getChildren().add(JsfUtil.createText(bundle.getString("right.g"),styleCaptions));
//		gridBits.getChildren().add(JsfUtil.createText(bundle.getString("right.s"),styleCaptions));
//		gridUser.getChildren().add(JsfUtil.createText(bundle.getString("read"),styleCaptions));
//		gridUser.getChildren().add(JsfUtil.createText(bundle.getString("write"),styleCaptions));
//		gridUser.getChildren().add(JsfUtil.createText(bundle.getString("execute"),styleCaptions));
//		gridGroup.getChildren().add(JsfUtil.createText(bundle.getString("read"),styleCaptions));
//		gridGroup.getChildren().add(JsfUtil.createText(bundle.getString("write"),styleCaptions));
//		gridGroup.getChildren().add(JsfUtil.createText(bundle.getString("execute"),styleCaptions));
//		gridOther.getChildren().add(JsfUtil.createText(bundle.getString("read"),styleCaptions));
//		gridOther.getChildren().add(JsfUtil.createText(bundle.getString("write"),styleCaptions));
//		gridOther.getChildren().add(JsfUtil.createText(bundle.getString("execute"),styleCaptions));
//
//		gridBits.getChildren().add(JsfUtil.createText(bundle.getString("right.create"),styleCaptions));
//		gridBits.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_u()).getComponent());
//		gridBits.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_g()).getComponent());
//		gridBits.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_s()).getComponent());
//		gridUser.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_user_r()).getComponent());
//		gridUser.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_user_w()).getComponent());
//		gridUser.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_user_x()).getComponent());
//		gridGroup.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_group_r()).getComponent());
//		gridGroup.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_group_w()).getComponent());
//		gridGroup.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_group_x()).getComponent());
//		gridOther.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_other_r()).getComponent());
//		gridOther.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_other_w()).getComponent());
//		gridOther.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_other_x()).getComponent());
//		
//		gridBits.getChildren().add(JsfUtil.createText(bundle.getString("right.directory"),styleCaptions));
//		gridBits.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_u()).getComponent());
//		gridBits.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_g()).getComponent());
//		gridBits.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_s()).getComponent());
//		gridUser.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_user_r()).getComponent());
//		gridUser.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_user_w()).getComponent());
//		gridUser.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_user_x()).getComponent());
//		gridGroup.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_group_r()).getComponent());
//		gridGroup.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_group_w()).getComponent());
//		gridGroup.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_group_x()).getComponent());
//		gridOther.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_other_r()).getComponent());
//		gridOther.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_other_w()).getComponent());
//		gridOther.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_other_x()).getComponent());
//
//		gridBits.getChildren().add(JsfUtil.createText(bundle.getString("right.directory.security"),styleCaptions));
//		gridBits.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_u()).getComponent());
//		gridBits.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_g()).getComponent());
//		gridBits.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_s()).getComponent());
//		gridUser.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_user_r()).getComponent());
//		gridUser.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_user_w()).getComponent());
//		gridUser.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_user_x()).getComponent());
//		gridGroup.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_group_r()).getComponent());
//		gridGroup.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_group_w()).getComponent());
//		gridGroup.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_group_x()).getComponent());
//		gridOther.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_other_r()).getComponent());
//		gridOther.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_other_w()).getComponent());
//		gridOther.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_other_x()).getComponent());

	}

}
