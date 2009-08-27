 /** 
  * GUIShareGlobalsDataContainerImplLayouter.java
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
  * Description: Class to layout Share Globals
  * 
  */
package org.sblim.wbemsmt.jsf.samba.container.global;

import javax.faces.component.html.HtmlPanelGrid;

import org.sblim.wbemsmt.jsf.layout.JsfLayouter;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class GUIShareGlobalsDataContainerImplLayouter extends JsfLayouter {

	/**
	 * 
	 */
	public GUIShareGlobalsDataContainerImplLayouter() {
		super();
		
	}

	public void layout(HtmlPanelGrid parent, GUIShareGlobalsDataContainerImpl container, WbemSmtResourceBundle bundle) {
//		String styleCaptions = "font-weight:bold";

		parent.setColumns(1);
		parent.setWidth("100%");
		
		
//		HtmlPanelGrid gridRights = JsfUtil.createPanelGrid(4);
		HtmlPanelGrid gridOtherFields = JsfUtil.createPanelGrid(1);

		//parent.getChildren().add(gridRights);
		parent.getChildren().add(gridOtherFields);

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
//		gridRights.getChildren().add(JsfUtil.createText(""));
//		gridRights.getChildren().add(JsfUtil.createText(bundle.getString("user"),styleCaptions));
//		gridRights.getChildren().add(JsfUtil.createText(bundle.getString("group"),styleCaptions));
//		gridRights.getChildren().add(JsfUtil.createText(bundle.getString("other"),styleCaptions));
//		
//		gridRights.getChildren().add(gridBits);
//		gridRights.getChildren().add(gridUser);
//		gridRights.getChildren().add(gridGroup);
//		gridRights.getChildren().add(gridOther);
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
//		gridBits.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_u()).getComponentPanel());
//		gridBits.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_g()).getComponentPanel());
//		gridBits.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_s()).getComponentPanel());
//		gridUser.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_user_r()).getComponentPanel());
//		gridUser.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_user_w()).getComponentPanel());
//		gridUser.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_user_x()).getComponentPanel());
//		gridGroup.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_group_r()).getComponentPanel());
//		gridGroup.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_group_w()).getComponentPanel());
//		gridGroup.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_group_x()).getComponentPanel());
//		gridOther.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_other_r()).getComponentPanel());
//		gridOther.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_other_w()).getComponentPanel());
//		gridOther.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Create_other_x()).getComponentPanel());
//		
//		gridBits.getChildren().add(JsfUtil.createText(bundle.getString("right.directory"),styleCaptions));
//		gridBits.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_u()).getComponentPanel());
//		gridBits.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_g()).getComponentPanel());
//		gridBits.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_s()).getComponentPanel());
//		gridUser.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_user_r()).getComponentPanel());
//		gridUser.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_user_w()).getComponentPanel());
//		gridUser.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_user_x()).getComponentPanel());
//		gridGroup.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_group_r()).getComponentPanel());
//		gridGroup.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_group_w()).getComponentPanel());
//		gridGroup.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_group_x()).getComponentPanel());
//		gridOther.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_other_r()).getComponentPanel());
//		gridOther.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_other_w()).getComponentPanel());
//		gridOther.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_other_x()).getComponentPanel());
//
//		gridBits.getChildren().add(JsfUtil.createText(bundle.getString("right.directory.security"),styleCaptions));
//		gridBits.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_u()).getComponentPanel());
//		gridBits.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_g()).getComponentPanel());
//		gridBits.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_s()).getComponentPanel());
//		gridUser.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_user_r()).getComponentPanel());
//		gridUser.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_user_w()).getComponentPanel());
//		gridUser.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_user_x()).getComponentPanel());
//		gridGroup.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_group_r()).getComponentPanel());
//		gridGroup.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_group_w()).getComponentPanel());
//		gridGroup.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_group_x()).getComponentPanel());
//		gridOther.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_other_r()).getComponentPanel());
//		gridOther.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_other_w()).getComponentPanel());
//		gridOther.getChildren().add(((LabeledJSFInputComponent)container.get_usr_Directory_security_other_x()).getComponentPanel());	
		
		addComponent(gridOtherFields,((LabeledJSFInputComponent)container.get_NTACLSupport()));
		addComponent(gridOtherFields,((LabeledJSFInputComponent)container.get_CaseSensitive()));
		addComponent(gridOtherFields,((LabeledJSFInputComponent)container.get_EASupport()));
		addComponent(gridOtherFields,((LabeledJSFInputComponent)container.get_HideDotFiles()));
		addComponent(gridOtherFields,((LabeledJSFInputComponent)container.get_AclCompatibility()));	

	}

	
}
