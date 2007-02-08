 /** 
  * PrinterWizardPage1ImplLayouter.java
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
  * Description: Class to layout page1 of the printer wizard
  * 
  */
package org.sblim.wbemsmt.jsf.samba.container.wizard;

import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.component.html.HtmlPanelGroup;

import org.sblim.wbemsmt.jsf.layout.JsfLayouter;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class PrinterWizardPage1ImplLayouter extends JsfLayouter {

	public void layout(HtmlPanelGrid parent, PrinterWizardPage1Impl page, WbemSmtResourceBundle bundle) {
		
		HtmlPanelGroup group = JsfUtil.createPanelGroup();
		parent.getChildren().add(group);

		LabeledJSFInputComponent get_usr_AllOrOne = (LabeledJSFInputComponent) page.get_usr_AllOrOne();
		HtmlOutputText txt = JsfUtil.createText("<br><br><br>");
		txt.setEscape(false);
		group.getChildren().add(txt);

		group.getChildren().add(get_usr_AllOrOne.getComponentPanel());
		
		HtmlOutputText txt1 = JsfUtil.createText("<br><br><br>");
		txt1.setEscape(false);
		group.getChildren().add(txt1);
	}

}
