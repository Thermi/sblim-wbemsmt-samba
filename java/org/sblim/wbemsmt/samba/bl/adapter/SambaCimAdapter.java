 /** 
  * SambaCimAdapter.java
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
  * Description: Adapter for Samba BusinessLogic
  * 
  */

package org.sblim.wbemsmt.samba.bl.adapter;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.bl.fco.FcoHelper;
import org.sblim.wbemsmt.bl.tree.ICIMClassNode;
import org.sblim.wbemsmt.bl.tree.ICIMInstanceNode;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.samba.bl.fco.*;
import org.sblim.wbemsmt.samba.bl.wrapper.*;
import org.sblim.wbemsmt.samba.bl.wrapper.list.*;
import org.sblim.wbemsmt.samba.bl.wrapper.wizard.HostWizard;
import org.sblim.wbemsmt.samba.bl.wrapper.wizard.PrinterWizard;
import org.sblim.wbemsmt.samba.bl.wrapper.wizard.ShareWizard;
import org.sblim.wbemsmt.samba.bl.wrapper.wizard.UserWizard;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;

public class SambaCimAdapter extends AbstractBaseCimAdapter {

	public static final String[] RESOURCE_BUNDLE_NAMES = new String[]{"messages","messagesSamba"};
	public static final boolean DUMMY_MODE = true;
	
	private SambaSelectionHierarchy sambaSelectionHierarchy = new SambaSelectionHierarchy();

	
	private ServiceList services = new ServiceList();
	Logger logger = Logger.getLogger(this.getClass().getName());
	
	SambaCimAdapterCreateDelegatee sambaCimAdapterCreateDelegatee = null;
	SambaCimAdapterUpdateControlsDelegatee sambaCimAdapterUpdateControlsDelegatee = null;
	SambaCimAdapterUpdateModelDelegatee sambaCimAdapterUpdateModelDelegatee = null;
	SambaCimAdapterSaveDelegatee sambaCimAdapterSaveDelegatee = null;
	SambaCimAdapterRevertDelegatee sambaCimAdapterRevertDelegatee = null;
	SambaCimAdapterDeleteDelegatee sambaCimAdapterDeleteDelegatee = null;
	SambaCimAdapterCountDelegatee sambaCimAdapterCountDelegatee = null;
	SambaCimAdapterInstallValidatorsDelegatee sambaCimAdapterInstallValidatorsDelegatee = null;
	SambaCimAdapterInitContainerDelegatee sambaCimAdapterInitContainerDelegatee = null;
	SambaCimAdapterInitWizardDelegatee sambaCimAdapterInitWizardDelegatee = null;

	private ShareWizard shareWizard; 
	private UserWizard userWizard; 
	private PrinterWizard printerWizard; 
	private HostWizard hostWizard; 
	
	private Service selectedService;

	private Share selectedShare;
	private Printer selectedPrinter;
	private User selectedUser;
	private Host selectedHost;
    public SambaCimAdapter(Locale locale) {
		super();
		
		init(ResourceBundleManager.getResourceBundle(RESOURCE_BUNDLE_NAMES,locale),sambaSelectionHierarchy, new FcoHelper());
		sambaSelectionHierarchy.setAdapter(this);
		sambaCimAdapterCreateDelegatee = new SambaCimAdapterCreateDelegatee(this);
		sambaCimAdapterUpdateControlsDelegatee = new SambaCimAdapterUpdateControlsDelegatee(this);
		sambaCimAdapterUpdateModelDelegatee = new SambaCimAdapterUpdateModelDelegatee(this);
		sambaCimAdapterSaveDelegatee = new SambaCimAdapterSaveDelegatee(this);
		sambaCimAdapterRevertDelegatee = new SambaCimAdapterRevertDelegatee(this);
		sambaCimAdapterDeleteDelegatee = new SambaCimAdapterDeleteDelegatee(this);
		sambaCimAdapterCountDelegatee = new SambaCimAdapterCountDelegatee(this);
		sambaCimAdapterInstallValidatorsDelegatee = new SambaCimAdapterInstallValidatorsDelegatee(this);
		sambaCimAdapterInitContainerDelegatee = new SambaCimAdapterInitContainerDelegatee(this);
		sambaCimAdapterInitWizardDelegatee = new SambaCimAdapterInitWizardDelegatee(this);
		
		shareWizard = new ShareWizard(this);
		userWizard = new UserWizard(this);
		printerWizard = new PrinterWizard(this);
		hostWizard = new HostWizard(this);
		
	}

	public void reLoad(WBEMClient cimClient) throws WbemsmtException
	{
		loaded = false;
		load(cimClient);
	}

	public void load(WBEMClient cimClient) throws WbemsmtException {
		
		if (loaded)
			return;

		setCimClient(cimClient);
        List<Linux_SambaService> list = Linux_SambaServiceHelper.enumerateInstances(cimClient, namespace, true);
        
        for (Iterator<Linux_SambaService> iter = list.iterator(); iter.hasNext();) {
        	Linux_SambaService serviceFco = (Linux_SambaService) iter.next();
        	Service service = new Service(this,serviceFco);

        	ShareList shares = new ShareList();
        	List<Linux_SambaShareOptions> associated_Linux_SambaShareOptions = serviceFco.getAssociated_Linux_SambaShareOptions_Linux_SambaShareForServices(cimClient);
        	for (Iterator<Linux_SambaShareOptions> iter2 = associated_Linux_SambaShareOptions.iterator(); iter2.hasNext();) {
        		Linux_SambaShareOptions shareFco = (Linux_SambaShareOptions) iter2.next();
        		shares.addShare(new Share(service,shareFco,this));
        	}
        	service.setShares(shares);
        	
        	PrinterList printers = new PrinterList();
        	List<Linux_SambaPrinterOptions> associated_Linux_SambaPrinterOptions = serviceFco.getAssociated_Linux_SambaPrinterOptions_Linux_SambaPrinterForServices(cimClient);
        	for (Iterator<Linux_SambaPrinterOptions> iter2 = associated_Linux_SambaPrinterOptions.iterator(); iter2.hasNext();) {
        		Linux_SambaPrinterOptions printerFco = (Linux_SambaPrinterOptions) iter2.next();
        		printers.addPrinter(new Printer(service,printerFco,this));
        	}
        	service.setPrinters(printers);

        	UserList users = new UserList();
        	List<Linux_SambaUser> associated_Linux_SambaUsers = serviceFco.getAssociated_Linux_SambaUser_Linux_SambaUsersForServices(cimClient);
        	for (Iterator<Linux_SambaUser> iter2 = associated_Linux_SambaUsers.iterator(); iter2.hasNext();) {
        		Linux_SambaUser userFco = (Linux_SambaUser) iter2.next();
        		users.addUser(new User(service,userFco,this));
        	}
        	service.setUsers(users);

        	HostList hosts = new HostList();
        	List<Linux_SambaHost> associated_Linux_SambaHosts = serviceFco.getAssociated_Linux_SambaHost_Linux_SambaHostsForServices(cimClient);
        	for (Iterator<Linux_SambaHost> iter2 = associated_Linux_SambaHosts.iterator(); iter2.hasNext();) {
        		Linux_SambaHost hostFco = (Linux_SambaHost) iter2.next();
        		hosts.addHost(new Host(service,hostFco,this));
        	}
        	service.setHosts(hosts);
        	
        	services.addService(service);
        	
        	loaded = true;

        }
		
	}

	public void reLoad(ITaskLauncherTreeNode rootNode) throws WbemsmtException {
		loaded = false;
		services.clear();
		load(rootNode);
	}

	public void load(ITaskLauncherTreeNode rootNode) throws WbemsmtException {
		try {
			if (loaded == true)
				return;
			this.cimClient = rootNode.getCimClient();
			
			this.rootNode = rootNode;
			
			List<ICIMInstanceNode> listWithServiceNodes = rootNode.findInstanceNodes(Linux_SambaService.CIM_CLASS_NAME);
			for (Iterator<ICIMInstanceNode> iterServiceNodes = listWithServiceNodes.iterator(); iterServiceNodes.hasNext();) {
				ICIMInstanceNode serviceNode = (ICIMInstanceNode) iterServiceNodes.next();

				Linux_SambaService serviceFco = new Linux_SambaService(serviceNode.getCimInstance());
				
				Service service = new Service(this,serviceFco);
				
				System.err.println("Service");
				
				ShareList shares = new ShareList();			
				List<ICIMInstanceNode> shareNodes = serviceNode.findInstanceNodes(Linux_SambaShareOptions.CIM_CLASS_NAME);
				for (Iterator<ICIMInstanceNode> iter = shareNodes.iterator(); iter.hasNext();) {
					ICIMInstanceNode shareNode = (ICIMInstanceNode) iter.next();
					Linux_SambaShareOptions shareFco = new Linux_SambaShareOptions(shareNode.getCimInstance());
					shares.addShare(new Share(service,shareFco,this));
				}
				service.setShares(shares);

				System.err.println("Shares");

				PrinterList printers = new PrinterList();			
				List<ICIMInstanceNode> printerNodes = serviceNode.findInstanceNodes(Linux_SambaPrinterOptions.CIM_CLASS_NAME);
				for (Iterator<ICIMInstanceNode> iter = printerNodes.iterator(); iter.hasNext();) {
					ICIMInstanceNode shareNode = (ICIMInstanceNode) iter.next();
					Linux_SambaPrinterOptions printerFco = new Linux_SambaPrinterOptions(shareNode.getCimInstance());
					printers.addPrinter(new Printer(service,printerFco,this));
				}
				service.setPrinters(printers);

				System.err.println("Printers");

				UserList users = new UserList();			
				List<ICIMInstanceNode> userNodes = serviceNode.findInstanceNodes(Linux_SambaUser.CIM_CLASS_NAME);
				for (Iterator<ICIMInstanceNode> iter = userNodes.iterator(); iter.hasNext();) {
					ICIMInstanceNode shareNode = (ICIMInstanceNode) iter.next();
					Linux_SambaUser userFco = new Linux_SambaUser(shareNode.getCimInstance());
					users.addUser(new User(service,userFco,this));
				}
				service.setUsers(users);
				System.err.println("users");

				HostList hosts = new HostList();			
				List<ICIMInstanceNode> hostNodes = serviceNode.findInstanceNodes(Linux_SambaHost.CIM_CLASS_NAME);
				for (Iterator<ICIMInstanceNode> iter = hostNodes.iterator(); iter.hasNext();) {
					ICIMInstanceNode shareNode = (ICIMInstanceNode) iter.next();
					Linux_SambaHost hostFco = new Linux_SambaHost(shareNode.getCimInstance());
					hosts.addHost(new Host(service,hostFco,this));
				}
				service.setHosts(hosts);
				System.err.println("hosts");
				
				services.addService(service);
				
				loaded = true;
			}
		} catch (WbemsmtException e) {
			throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,e);
		}
	}

	public CimObjectKey getKeyByTreeNode(ITaskLauncherTreeNode treeNode) throws WbemsmtException {

		if (treeNode instanceof ICIMInstanceNode) {
			ICIMInstanceNode node = (ICIMInstanceNode) treeNode;
			if (node.getCimInstance().getClassName().equals(Linux_SambaService.CIM_CLASS_NAME))
			{
				CimObjectKey key = new CimObjectKey(node);
				return key;
			}
			else if (node.getCimInstance().getClassName().equals(Linux_SambaShareOptions.CIM_CLASS_NAME)
					|| node.getCimInstance().getClassName().equals(Linux_SambaPrinterOptions.CIM_CLASS_NAME)
					|| node.getCimInstance().getClassName().equals(Linux_SambaUser.CIM_CLASS_NAME)
					|| node.getCimInstance().getClassName().equals(Linux_SambaHost.CIM_CLASS_NAME)
					)
			{
				ICIMInstanceNode serviceNode = (ICIMInstanceNode) node.getParent().getParent();
				CimObjectKey key = new CimObjectKey(serviceNode);
				key.setNextKey(new CimObjectKey(node));
				return key;
			}
		}
		
		//for the printer and share - globals we select the samba service
		else if (treeNode instanceof ICIMClassNode) {
			ICIMClassNode classNode = (ICIMClassNode) treeNode;
			if (classNode.getName().equals("tree.shares")
				|| classNode.getName().equals("tree.printers")	
				|| classNode.getName().equals("tree.users")	
				)
			{
				ICIMInstanceNode parent = (ICIMInstanceNode) classNode.getParent();
				return new CimObjectKey(parent.getCimInstance().getObjectPath());
			}
		}
		return null;
	}

	public String[] getResourceBundleNames() {
		return RESOURCE_BUNDLE_NAMES;
	}

	public boolean select_0_Linux_SambaService(CimObjectKey key)
	{
		Service service = services.getService(key.getObjectPath());
		//if service was not found try to reload
		if (service == null)
		{
			try {
				Linux_SambaService fco = Linux_SambaServiceHelper.getInstance(cimClient,key.getObjectPath());
				if (fco != null)
				{
					service = new Service(this,fco);
					service.loadUserList();
					service.loadPrinterList();
					service.loadShareList();
					service.loadHostList();
					services.addService(service);
					sambaSelectionHierarchy.add(service);
					//service loaded
					return true;
				}
			} catch (Exception e) {
				logger.log(Level.SEVERE,"Cannot select SambaService with key " + key.toString(),e);
			}
			//service not found
			return false;
		}
		else
		{
			sambaSelectionHierarchy.add(service);
			//service found
			return true;
		}
	}
	
	public boolean select_1_Linux_SambaShareOptions(CimObjectKey key)
	{
		Service service = getSelectedService();
		ShareList shares = service.getShares();

		Share share = shares.getShare(key);
		if (share != null)
		{
			sambaSelectionHierarchy.add(share);
			return true;
		}
		
		//if object was not found try to reload
		try {
			Linux_SambaShareOptions shareFco = Linux_SambaShareOptionsHelper.getInstance(cimClient,key.getObjectPath());
			if (shareFco != null)
			{
				share = new Share(service,shareFco,this);
				shares.addShare(share);
				sambaSelectionHierarchy.add(share);
				return true;
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE,"Cannot select SambaShareOptions with key " + key.toString(),e);
		}
		
		return false;
	}

	public boolean select_1_Linux_SambaPrinterOptions(CimObjectKey key)
	{
		Service service = getSelectedService();
		PrinterList printers = service.getPrinters();

		Printer printer = printers.getPrinter(key);
		if (printer != null)
		{
			sambaSelectionHierarchy.add(printer);
			return true;
		}
		
		//if object was not found try to reload
		try {
			Linux_SambaPrinterOptions fco = Linux_SambaPrinterOptionsHelper.getInstance(cimClient,key.getObjectPath());
			if (fco != null)
			{
				printer = new Printer(service,fco,this);
				printers.addPrinter(printer);
				sambaSelectionHierarchy.add(printer);
				return true;
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE,"Cannot select SambaPrinterOptions with key " + key.toString(),e);
		}
		
		return false;
	}

	public boolean select_1_Linux_SambaUser(CimObjectKey key)
	{
		Service service = getSelectedService();
		UserList users = service.getUsers();

		User usr = users.getUser(key);
		if (usr != null)
		{
			sambaSelectionHierarchy.add(usr);
			return true;
		}
		
		//if object was not found try to reload
		try {
			Linux_SambaUser fco = Linux_SambaUserHelper.getInstance(cimClient,key.getObjectPath());
			if (fco != null)
			{
				usr = new User(service,fco,this);
				users.addUser(usr);
				sambaSelectionHierarchy.add(usr);
				return true;
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE,"Cannot select SambaUser with key " + key.toString(),e);
		}
		
		return false;
	}

	public boolean select_1_Linux_SambaHost(CimObjectKey key)
	{
		Service service = getSelectedService();
		HostList hosts = service.getHosts();

		Host host = hosts.getHost(key);
		sambaSelectionHierarchy.add(host);
		return true;
		//hosts are always found
//		try {
//			Linux_SambaHost shareFco = Linux_SambaHost.getInstance(cimClient,key.getObjectPath());
//			if (shareFco != null)
//			{
//				host = new Host(service,shareFco,cimClient);
//				hosts.addHost(host);
//				sambaSelectionHierarchy.add(host);
//				return true;
//			}
//		} catch (Exception e) {
//			logger.log(Level.SEVERE,"Cannot select SambaHost with key " + key.toString(),e);
//		}
//		
//		return false;
	}

	public ServiceList getServices() {
		return services;
	}

	public Share getSelectedShare() {
		return selectedShare;
	}
	
	public void setSelectedService(Service selectedService) {
		this.selectedService = selectedService;
		this.selectedShare = null;
		this.selectedHost = null;
		this.selectedUser = null;
		this.selectedPrinter = null;
	}

	public void setSelectedShare(Share selectedShare) {
		this.selectedShare = selectedShare;
		this.selectedHost = null;
		this.selectedUser = null;
		this.selectedPrinter = null;
	}

	public void setSelectedPrinter(Printer selectedPrinter) {
		this.selectedPrinter = selectedPrinter;
		this.selectedHost = null;
		this.selectedUser = null;
		this.selectedShare = null;
	}

	public void setSelectedUser(User selectedUser) {
		this.selectedUser = selectedUser;
		this.selectedHost = null;
		this.selectedPrinter = null;
		this.selectedShare = null;
	}

	public void setSelectedHost(Host selectedHost) {
		this.selectedHost = selectedHost;
		this.selectedUser = null;
		this.selectedPrinter = null;
		this.selectedShare = null;
	}

	public Host getSelectedHost() {
		return selectedHost;
	}

	public Printer getSelectedPrinter() {
		return selectedPrinter;
	}

	public User getSelectedUser() {
		return selectedUser;
	}


	public Service getSelectedService() {
		return selectedService;
	}	
	
	

	public HostWizard getHostWizard() {
		return hostWizard;
	}

	public PrinterWizard getPrinterWizard() {
		return printerWizard;
	}

	public ShareWizard getShareWizard() {
		return shareWizard;
	}

	public UserWizard getUserWizard() {
		return userWizard;
	}

	public CreateDelegatee getCreateDelegatee() {
		return sambaCimAdapterCreateDelegatee;
	}

	public SaveDelegatee getSaveDelegatee() {
		return sambaCimAdapterSaveDelegatee;
	}

	public RevertDelegatee getRevertDelegatee() {
		return sambaCimAdapterRevertDelegatee;
	}

	public DeleteDelegatee getDeleteDelegatee() {
		return sambaCimAdapterDeleteDelegatee;
	}

	public UpdateControlsDelegatee getUpdateControlsDelegatee() {
		return sambaCimAdapterUpdateControlsDelegatee;
	}

	public UpdateModelDelegatee getUpdateModelDelegatee() {
		return sambaCimAdapterUpdateModelDelegatee;
	}

	public CountDelegatee getCountDelegatee() {
		return sambaCimAdapterCountDelegatee;
	}

	public InstallValidatorsDelegatee getInstallValidatorsDelegatee() {
		return sambaCimAdapterInstallValidatorsDelegatee;
	}

	public SambaSelectionHierarchy getSelectionHierarchy() {
		return sambaSelectionHierarchy;
	}

	public void loadInitial(WBEMClient cimClient) throws WbemsmtException {
	    load(cimClient);
	}

	public InitContainerDelegatee getInitContainerDelegatee() {
		return sambaCimAdapterInitContainerDelegatee;
	}

	public InitWizardDelegatee getInitWizardDelegatee() {
		return sambaCimAdapterInitWizardDelegatee;
	}
	
}
