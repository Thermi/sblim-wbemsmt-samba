/** 
  * PrintingOptionsDataContainer.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm
  *
  * Contributors: 
  * 
  * Description: container for printing options
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.container.printer;

public interface PrintingOptionsDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer
{
	/** 
	 * Constants for Fields and Roles
	 **/
			public static final String FIELD_CUPSOPTIONS = "CupsOptions" ;
			public static final String FIELD_DEFAULTDEVMODE = "DefaultDevMode" ;
			public static final String FIELD_MAXPRINTJOBS = "MaxPrintjobs" ;
			public static final String FIELD_MAXREPORTEDPRINTJOBS = "MaxReportedPrintjobs" ;
			public static final String FIELD_PRINTCOMMAND = "PrintCommand" ;
			public static final String FIELD_USECLIENTDRIVER = "UseClientDriver" ;
		
	
	/** 
	 * Defined Fields
	 **/
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType TEXTFIELD<br>
		* Relation to FCO: Linux_SambaPrinterPrintingOptions.get_CupsOptions<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_CupsOptions();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaPrinterPrintingOptions.get_DefaultDevMode<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DefaultDevMode();
			
		/**
		* <br>
		* DataType UNSIGNED_INT64<br>
		* UIType TEXTFIELD<br>
		* Relation to FCO: Linux_SambaPrinterPrintingOptions.get_MaxPrintjobs<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_MaxPrintjobs();
			
		/**
		* <br>
		* DataType UNSIGNED_INT64<br>
		* UIType TEXTFIELD<br>
		* Relation to FCO: Linux_SambaPrinterPrintingOptions.get_MaxReportedPrintjobs<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_MaxReportedPrintjobs();
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType TEXTFIELD<br>
		* Relation to FCO: Linux_SambaPrinterPrintingOptions.get_PrintCommand<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_PrintCommand();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaPrinterPrintingOptions.get_UseClientDriver<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_UseClientDriver();
	
	
	/** 
	 * Linked DataContainers
	 **/
	 
	
	
}