/** 
  * ServiceLoggingDataContainer.java
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
  * @template: ./tools-dcg/templates/containerClass.vm
  *
  * Contributors: 
  * 
  * Description: Container for defining the logging
  * 
  * generated Class
  */

package org.sblim.wbemsmt.samba.bl.container.service;

public interface ServiceLoggingDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer
{
	/** 
	 * Constants for Fields and Roles
	 **/
			public static final String FIELD_SYSLOG = "SysLog" ;
			public static final String FIELD_SYSLOGONLY = "SysLogOnly" ;
			public static final String FIELD_MAXLOGSIZE = "MaxLogSize" ;
			public static final String FIELD_DEBUGHIRESTIMESTAMP = "DebugHiresTimestamp" ;
			public static final String FIELD_DEBUGPID = "DebugPID" ;
			public static final String FIELD_DEBUGTIMESTAMP = "DebugTimestamp" ;
			public static final String FIELD_DEBUGUID = "DebugUID" ;
			public static final String FIELD_LOGFILE = "LogFile" ;
			public static final String FIELD_LOGLEVEL = "LogLevel" ;
		
	
	/** 
	 * Defined Fields
	 **/
			
		/**
		* <br>
		* DataType UNSIGNED_INT16<br>
		* UIType TEXTFIELD<br>
		* Relation to FCO: Linux_SambaLoggingOptions.get_SysLog<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SysLog();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaLoggingOptions.get_SysLogOnly<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_SysLogOnly();
			
		/**
		* <br>
		* DataType UNSIGNED_INT32<br>
		* UIType TEXTFIELD<br>
		* Relation to FCO: Linux_SambaLoggingOptions.get_MaxLogSize<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_MaxLogSize();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaLoggingOptions.get_DebugHiresTimestamp<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DebugHiresTimestamp();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaLoggingOptions.get_DebugPID<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DebugPID();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaLoggingOptions.get_DebugTimestamp<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DebugTimestamp();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: Linux_SambaLoggingOptions.get_DebugUID<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DebugUID();
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType TEXTFIELD<br>
		* Relation to FCO: Linux_SambaLoggingOptions.get_LogFile<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_LogFile();
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType TEXTFIELD<br>
		* Relation to FCO: Linux_SambaLoggingOptions.get_LogLevel<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_LogLevel();
	
	
	/** 
	 * Linked DataContainers
	 **/
	 
	
	
}