/** 
 * SambaCimAdapterIf.java
 *
 * 
 * © Copyright IBM Corp. 2006,2007
 *
 * THIS FILE IS PROVIDED UNDER THE TER	MS OF THE COMMON PUBLIC LICENSE
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Common Public License from
 * http://www.opensource.org/licenses/cpl1.0.php
 *
 * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterface.vm
 *
 * Contributors: 
 *   michael.bauschert@de.ibm.com
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.samba.bl.adapter;

/** 
 * This is the interface containing all Methods
 **/

public interface SambaCimAdapterIf extends SambaCimAdapterCountIf, SambaCimAdapterCreateIf,
        SambaCimAdapterDeleteIf, SambaCimAdapterInstallValidatorsIf, SambaCimAdapterSaveIf,
        SambaCimAdapterRevertIf, SambaCimAdapterUpdateControlsIf, SambaCimAdapterUpdateModelIf,
        SambaCimAdapterInitWizardIf, SambaCimAdapterInitContainerIf {

    public static final String[] RESOURCE_BUNDLE_NAMES = new String[] { "messages", "messagesSamba" };

}