 /** 
  * WelcomeDataContainerImplLayouter.java
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
  * Description: Layouter for the welcome Listener
  * 
  */
package org.sblim.wbemsmt.jsf.samba.container.welcome;

import javax.faces.component.html.HtmlPanelGrid;

import org.sblim.wbemsmt.jsf.layout.JsfLayouter;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFPictureComponent;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

/**
 * @author Bauschert
 *
 */
public class WelcomeDataContainerImplLayouter extends JsfLayouter {

	public void layout(HtmlPanelGrid panelForCustomLayout, WelcomeDataContainerImpl container, WbemSmtResourceBundle bundle) {
		
		LabeledJSFPictureComponent picture = (LabeledJSFPictureComponent) container.get_usr_SharePicture();
		panelForCustomLayout.getChildren().add(picture.getComponentPanel());
		addComponent(panelForCustomLayout, (LabeledJSFInputComponent) container.get_usr_WelcomeText());
		LabeledJSFInputComponent actions = (LabeledJSFInputComponent) container.get_usr_Actions();
		LabeledJSFInputComponent createShare = (LabeledJSFInputComponent) container.get_usr_LinkCreateShare();
		LabeledJSFInputComponent createPrinter = (LabeledJSFInputComponent) container.get_usr_LinkCreatePrinter();
		LabeledJSFInputComponent createUser = (LabeledJSFInputComponent) container.get_usr_LinkCreateUser();

		addComponent(panelForCustomLayout, actions);
		panelForCustomLayout.getChildren().add(createShare.getComponentPanel());
		panelForCustomLayout.getChildren().add(createPrinter.getComponentPanel());
		panelForCustomLayout.getChildren().add(createUser.getComponentPanel());
		addComponent(panelForCustomLayout, (LabeledJSFInputComponent) container.get_usr_Memo());
		
	}

}
