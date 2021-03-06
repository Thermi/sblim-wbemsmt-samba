 /** 
  * SambaCreateListenerSelector.java
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
  * Description: Selector for all create aciton which are independent of the selected node
  * 
  */
package org.sblim.wbemsmt.samba.listener;

import java.util.List;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimAdapterFactory;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageUtil;
import org.sblim.wbemsmt.bl.tree.CIMInstanceNode;
import org.sblim.wbemsmt.bl.tree.ICIMInstanceNode;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeSelectorForCreate;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter;
import org.sblim.wbemsmt.samba.bl.adapter.SambaErrCodes;
import org.sblim.wbemsmt.samba.bl.fco.Linux_SambaService;

/**
 * @author Bauschert
 *
 */
public class SambaCreateListenerSelector implements TaskLauncherTreeNodeSelectorForCreate {

	private AbstractBaseCimAdapter adapter;

	public void select(ITaskLauncherTreeNode treeNode, AbstractBaseCimAdapter cimAdapter, String createId) throws WbemsmtException {
		
		ITaskLauncherTreeNode parent = treeNode;
		try {
			while ( ! (parent instanceof CIMInstanceNode && ((CIMInstanceNode)parent).getCimInstance().getClassName().equals(Linux_SambaService.CIM_CLASS_NAME))
					&& parent.findInstanceNodes(Linux_SambaService.CIM_CLASS_NAME).size() != 1
					&& parent.getParent() != null 
					&& parent.getParent() != parent)
			{
				parent = parent.getParent();
			}
		
			List<ICIMInstanceNode> list = parent.findInstanceNodes(Linux_SambaService.CIM_CLASS_NAME);
			
			if (list.size() == 1)
			{
				CIMInstanceNode node = (CIMInstanceNode) list.get(0);
				this.adapter = CimAdapterFactory.getInstance().getAdapter(SambaCimAdapter.class, node.getCimClient());
				this.adapter.select(this.adapter.getKeyByTreeNode(node));
			}
			else
			{
				MessageUtil.addMessage(SambaErrCodes.MSG_CANNOT_SELECT_SERVICE, Message.ERROR, SambaCimAdapter.RESOURCE_BUNDLE_NAMES, "cannot.select.service");
			}
			
			
		} catch (WbemsmtException e) {
			throw new WbemsmtException(WbemsmtException.ERR_OBJECT_NOT_FOUND,"Cannot find SambaService with node " + treeNode.getInfo(),e); 
		}
		
	}

	public boolean execute() {
		return adapter != null;
	}

	public AbstractBaseCimAdapter getAdapter() {
		return adapter;
	}

}
