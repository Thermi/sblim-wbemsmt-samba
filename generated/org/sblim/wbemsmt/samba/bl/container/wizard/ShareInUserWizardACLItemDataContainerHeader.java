/**
 * UserWizardPage3.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS OF
 * THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/headerClass.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Header for: linked container
 *            ShareInUserWizardACLItemDataContainer
 */

package org.sblim.wbemsmt.samba.bl.container.wizard;

public interface ShareInUserWizardACLItemDataContainerHeader {
    /**
     * Header for
     * <br>
     * DataType STRING<br>
     * UIType LABEL<br>
     * Relation to FCO: Linux_SambaShareOptions.get_Name<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_ShareName();

    /**
     * Header for
     * relates to<br> Linux_SambaReadListForShare<br> Linux_SambaWriteListForShare<br> Linux_SambaInvalidUsersForShare<br> Linux_SambaValidUsersForShare<br> <br>
     * DataType UNSIGNED_INT16<br>
     * UIType RADIOBUTTON<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_usr_AccessTypeVI();

    /**
     * Header for
     * relates to<br> Linux_SambaReadListForShare<br> Linux_SambaWriteListForShare<br> Linux_SambaInvalidUsersForShare<br> Linux_SambaValidUsersForShare<br> <br>
     * DataType UNSIGNED_INT16<br>
     * UIType RADIOBUTTON<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_usr_AccessTypeRW();

    /**
     * Header for
     * relates to Linux_SambaAdminUsersForShare<br>
     * DataType BOOLEAN<br>
     * UIType CHECKBOX<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getSharesHeader_usr_Admin();
}