/**
 * EditSambaServiceGlobalSecurity.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER
 * THE TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF
 * THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of
 * the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/cmd/editCommand.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Class for editing objects generated Class
 */

package org.sblim.wbemsmt.cli.samba.listener;

import org.apache.commons.cli.*;
import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.bl.messages.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.cli.*;

public class EditSambaServiceGlobalSecurity extends CimCommand {

    //All Options that are local and defined for this command
    /**
     *  --authMethods
     */
    public static final OptionDefinition KEY_authMethods = new OptionDefinition(null,
            "authMethods", null, "ServiceGlobalSecurityOptionsDataContainer.AuthMethods.argValue",
            false, false, "ServiceGlobalSecurityOptionsDataContainer.AuthMethods.argDescription");
    /**
     *  --encryptPasswords
     */
    public static final OptionDefinition KEY_encryptPasswords = new OptionDefinition(null,
            "encryptPasswords", null,
            "ServiceGlobalSecurityOptionsDataContainer.EncryptPasswords.argValue", false, false,
            "ServiceGlobalSecurityOptionsDataContainer.EncryptPasswords.argDescription");
    /**
     *  --minLength
     */
    public static final OptionDefinition KEY_minLength = new OptionDefinition(null, "minLength",
            null, "ServiceGlobalSecurityOptionsDataContainer.MinPasswordLength.argValue", false,
            false, "ServiceGlobalSecurityOptionsDataContainer.MinPasswordLength.argDescription");
    /**
     *  --nullPasswords
     */
    public static final OptionDefinition KEY_nullPasswords = new OptionDefinition(null,
            "nullPasswords", null,
            "ServiceGlobalSecurityOptionsDataContainer.NullPasswords.argValue", false, false,
            "ServiceGlobalSecurityOptionsDataContainer.NullPasswords.argDescription");
    /**
     *  --passdbBackend
     */
    public static final OptionDefinition KEY_passdbBackend = new OptionDefinition(null,
            "passdbBackend", null,
            "ServiceGlobalSecurityOptionsDataContainer.PassdbBackend.argValue", false, false,
            "ServiceGlobalSecurityOptionsDataContainer.PassdbBackend.argDescription");
    /**
     *  --smbPasswdFile
     */
    public static final OptionDefinition KEY_smbPasswdFile = new OptionDefinition(null,
            "smbPasswdFile", null,
            "ServiceGlobalSecurityOptionsDataContainer.SMBPasswdFile.argValue", false, false,
            "ServiceGlobalSecurityOptionsDataContainer.SMBPasswdFile.argDescription");
    /**
     *  --security
     */
    public static final OptionDefinition KEY_security = new OptionDefinition(null, "security",
            null, "ServiceGlobalSecurityOptionsDataContainer.Security.argValue", false, false,
            "ServiceGlobalSecurityOptionsDataContainer.Security.argDescription");
    /**
     *  --guestOK
     */
    public static final OptionDefinition KEY_guestOK = new OptionDefinition(null, "guestOK", null,
            "ServiceGlobalSecurityOptionsDataContainer.GuestOK.argValue", false, false,
            "ServiceGlobalSecurityOptionsDataContainer.GuestOK.argDescription");
    /**
     *  --guestOnly
     */
    public static final OptionDefinition KEY_guestOnly = new OptionDefinition(null, "guestOnly",
            null, "ServiceGlobalSecurityOptionsDataContainer.GuestOnly.argValue", false, false,
            "ServiceGlobalSecurityOptionsDataContainer.GuestOnly.argDescription");
    /**
     *  --hostAllow
     */
    public static final OptionDefinition KEY_hostAllow = new OptionDefinition(null, "hostAllow",
            null, "ServiceGlobalSecurityOptionsDataContainer.HostsAllow.argValue", false, false,
            "ServiceGlobalSecurityOptionsDataContainer.HostsAllow.argDescription");
    /**
     *  --hostDeny
     */
    public static final OptionDefinition KEY_hostDeny = new OptionDefinition(null, "hostDeny",
            null, "ServiceGlobalSecurityOptionsDataContainer.HostsDeny.argValue", false, false,
            "ServiceGlobalSecurityOptionsDataContainer.HostsDeny.argDescription");
    /**
     *  --readOnly
     */
    public static final OptionDefinition KEY_readOnly = new OptionDefinition(null, "readOnly",
            null, "ServiceGlobalSecurityOptionsDataContainer.ReadOnly.argValue", false, false,
            "ServiceGlobalSecurityOptionsDataContainer.ReadOnly.argDescription");
    /**
     *  --domainMaster
     */
    public static final OptionDefinition KEY_domainMaster = new OptionDefinition(null,
            "domainMaster", null,
            "ServiceGlobalSecurityOptionsDataContainer.DomainMaster.argValue", false, false,
            "ServiceGlobalSecurityOptionsDataContainer.DomainMaster.argDescription");
    /**
     *  --browsable
     */
    public static final OptionDefinition KEY_browsable = new OptionDefinition(null, "browsable",
            null, "ServiceGlobalSecurityOptionsDataContainer.Browsable.argValue", false, false,
            "ServiceGlobalSecurityOptionsDataContainer.Browsable.argDescription");

    //All Options that are global and task-related
    /**
     * required, used for selection:  --serviceName
     */
    public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition(null,
            "serviceName", null, "serviceName.argValue", true, false, "serviceName.argDescription");

    // Global Communication Options
    /**
     *  --hostname
     */
    public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition(null,
            "hostname", null, "hostname.argValue", false, false, "hostname.argDescription");
    /**
     *  --port, default: 5988
     */
    public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition(null, "port",
            "5988", "port.argValue", false, false, "port.argDescription");
    /**
     *  --namespace, default: /root/cimv2
     */
    public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition(null,
            "namespace", "/root/cimv2", "namespace.argValue", false, false,
            "namespace.argDescription");
    /**
     *  --user
     */
    public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition(null, "user", null,
            "user.argValue", false, false, "user.argDescription");
    /**
     *  --password
     */
    public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition(null,
            "password", null, "password.argValue", false, false, "password.argDescription");
    /**
     *  --publickeyfile
     */
    public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition(null,
            "publickeyfile", null, "publickeyfile.argValue", false, false,
            "publickeyfile.argDescription");
    /**
     *  --privatekeyfile
     */
    public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition(null,
            "privatekeyfile", null, "privatekeyfile.argValue", false, false,
            "privatekeyfile.argDescription");
    /**
     * used for selection:  --httpProtocolType, default: http
     */
    public static final OptionDefinition KEY_GLOBAL_httpProtocolType = new OptionDefinition(null,
            "httpProtocolType", "http", "httpProtocolType.argValue", false, false,
            "httpProtocolType.argDescription");

    // Global Common Options
    /**
     *  -?
     */
    public static final OptionDefinition KEY_GLOBAL_QUESTION_MARK_ = new OptionDefinition("?",
            null, null, null, false, false, "?.argDescription");
    /**
     *  -h --help
     */
    public static final OptionDefinition KEY_GLOBAL_help = new OptionDefinition("h", "help", null,
            null, false, false, "help.argDescription");
    /**
     *  -L --locale, default: en
     */
    public static final OptionDefinition KEY_GLOBAL_locale = new OptionDefinition("L", "locale",
            "en", "locale.argValue", false, false, "locale.argDescription");

    private static final OptionDefinition[] LOCAL_OPTIONS = new OptionDefinition[] {
            KEY_authMethods, KEY_encryptPasswords, KEY_minLength, KEY_nullPasswords,
            KEY_passdbBackend, KEY_smbPasswdFile, KEY_security, KEY_guestOK, KEY_guestOnly,
            KEY_hostAllow, KEY_hostDeny, KEY_readOnly, KEY_domainMaster, KEY_browsable, };

    private static final OptionDefinition[] GLOBAL_TASK_OPTIONS = new OptionDefinition[] { KEY_GLOBAL_serviceName, };

    private static final OptionDefinition[] GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS = new OptionDefinition[] {
            KEY_GLOBAL_hostname, KEY_GLOBAL_port, KEY_GLOBAL_namespace, KEY_GLOBAL_user,
            KEY_GLOBAL_password, KEY_GLOBAL_publickeyfile, KEY_GLOBAL_privatekeyfile,
            KEY_GLOBAL_httpProtocolType, };

    private static final OptionDefinition[] GLOBAL_WBEMSMT_COMMON_OPTIONS = new OptionDefinition[] {
            KEY_GLOBAL_QUESTION_MARK_, KEY_GLOBAL_help, KEY_GLOBAL_locale, };

    CommandLine cmd = null;
    AbstractBaseCimAdapter adapter = null;

    public EditSambaServiceGlobalSecurity(java.util.Locale locale) {
        super("EditSambaServiceGlobalSecurity", new String[] { "messages", "messagesSamba" },
                locale);
    }

    public void execute(CimCommandValues values) throws WbemsmtException {

        //do the real processing
        try {

            commandValues = values;
            cmd = values.getCommandLine();

            Options options = values.getOptions();

            //first handle the help options and then the parseException
            //if the user wants help parsing the args will fail (due to missing required args)
            //and so the helpOptions should be handled first

            if (hasOption(values.getArgs(), "-" + KEY_GLOBAL_QUESTION_MARK_.getShortKey())
                    || hasOption(values.getArgs(), "-" + KEY_GLOBAL_help.getShortKey())) {
                showUsage(values.getOut(), options);
                return;
            }
            else if (hasOption(values.getArgs(), "--" + KEY_GLOBAL_help.getLongKey())) {
                //TODO add extendedHelp by loading a manpage or sth else
                showUsage(values.getOut(), options);
                return;
            }

            else if (values.getParseException() != null) {
                handleParseException(values, KEY_GLOBAL_password);
                return;
            }
            adapter = (org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter) CimAdapterFactory
                    .getInstance().getAdapter(
                            org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter.class, this);
            adapter.setBundle(bundle);
            adapter.setCimClient(values.getCimClient());

            adapter.loadInitial(adapter.getCimClient());

            values
                    .getOut()
                    .println(
                            "\n"
                                    + bundle
                                            .getString(
                                                    "editing",
                                                    new Object[] { bundle
                                                            .getString("ServiceGlobalSecurityOptionsDataContainer.caption") }));

            CliDataLoader loader = new EditSambaServiceGlobalSecurityLoader();
            loader.load(bundle, adapter, commandValues);

            org.sblim.wbemsmt.cli.samba.container.service.ServiceGlobalSecurityOptionsDataContainerImpl dc = new org.sblim.wbemsmt.cli.samba.container.service.ServiceGlobalSecurityOptionsDataContainerImpl(
                    adapter);

            setKeyValues(cmd, adapter, dc);

            adapter.updateControls(dc);
            adapter.setActiveModule(AbstractBaseCimAdapter.ACTIVE_EDIT);

            values.getOut().println("\n" + bundle.getString("before.edit"));
            dc.trace(values.getOut());

            setValues(cmd, adapter, dc);

            MessageList result = MessageList.init(dc);

            if (result.hasErrors()) {
                Message caption = Message.create(ErrCodes.MSG_SAVE_ERROR, Message.ERROR, bundle,
                        "save.error");
                traceMessages(caption, result);
                return;
            }
            else {
                Message caption = Message.create(ErrCodes.MSG_ADDITIONAL_MESSAGES, Message.ERROR,
                        bundle, "additional.messages");
                traceMessages(caption, result);
                result.clear();
            }

            adapter.validateValues(dc);
            result = dc.getMessagesList();
            if (!result.hasErrors()) {
                adapter.save(dc);
                //Get the infos afte storing the values
                result = dc.getMessagesList();
                if (result.hasErrors()) {
                    Message caption = Message.create(ErrCodes.MSG_SAVE_ERROR, Message.ERROR,
                            bundle, "save.error");
                    traceMessages(caption, result);
                }
                else if (result.hasWarning()) {
                    Message caption = Message.create(ErrCodes.MSG_SAVE_WARNING, Message.WARNING,
                            bundle, "save.warning");
                    traceMessages(caption, result);
                }
                else if (result.hasInfo()) {
                    Message caption = Message.create(ErrCodes.MSG_SAVE_INFO, Message.INFO, bundle,
                            "save.info");
                    traceMessages(caption, result);
                }
            }
            else {
                Message caption = Message.create(ErrCodes.MSG_VALIDATION_ERROR, Message.ERROR,
                        bundle, "validation.error");
                traceMessages(caption, result);
                return;
            }
            values
                    .getOut()
                    .println(
                            "\n"
                                    + bundle
                                            .getString(
                                                    "edited",
                                                    new Object[] { bundle
                                                            .getString("ServiceGlobalSecurityOptionsDataContainer.caption") }));

            adapter.updateControls(dc);

            values.getOut().println("\n" + bundle.getString("after.edit"));
            dc.trace(values.getOut());

        }
        catch (Exception e) {
            super.handleException(e, values.getArgs(), values.getOptions(), KEY_GLOBAL_password);
        }
        finally {
            if (adapter != null)
                adapter.cleanup();
        }
    }

    /**
     * Set all Values that are needed for selecting the right objects. This fields are used even if they are read-only
     **/
    private void setKeyValues(
            CommandLine cmd,
            AbstractBaseCimAdapter adapter,
            org.sblim.wbemsmt.samba.bl.container.service.ServiceGlobalSecurityOptionsDataContainer dc)
            throws WbemsmtException {
    }

    /**
     * Set all Values that are not read-Only
     **/
    private void setValues(
            CommandLine cmd,
            AbstractBaseCimAdapter adapter,
            org.sblim.wbemsmt.samba.bl.container.service.ServiceGlobalSecurityOptionsDataContainer dc)
            throws WbemsmtException {
        setValue(cmd, dc.get_AuthMethods(), KEY_authMethods);
        setCheckboxValue(cmd, dc.get_EncryptPasswords(), KEY_encryptPasswords);
        setValue(cmd, dc.get_MinPasswordLength(), KEY_minLength);
        setCheckboxValue(cmd, dc.get_NullPasswords(), KEY_nullPasswords);
        setMultiValue(adapter.getBundle(), cmd, dc.get_usr_PassdbBackend(), KEY_passdbBackend);
        setValue(cmd, dc.get_SMBPasswdFile(), KEY_smbPasswdFile);
        setMultiValue(adapter.getBundle(), cmd, dc.get_Security(), KEY_security);
        setCheckboxValue(cmd, dc.get_GuestOK(), KEY_guestOK);
        setCheckboxValue(cmd, dc.get_GuestOnly(), KEY_guestOnly);
        setValue(cmd, dc.get_HostsAllow(), KEY_hostAllow);
        setValue(cmd, dc.get_HostsDeny(), KEY_hostDeny);
        setCheckboxValue(cmd, dc.get_ReadOnly(), KEY_readOnly);
        setMultiValue(adapter.getBundle(), cmd, dc.get_DomainMaster(), KEY_domainMaster);
        setCheckboxValue(cmd, dc.get_Browsable(), KEY_browsable);

        //The Buttons
    }

    protected LoginOptionValues getLoginOptions() {
        return new LoginOptionValues(KEY_GLOBAL_hostname, KEY_GLOBAL_user, KEY_GLOBAL_password);
    }

    protected CimClientOptionValues getCimClientOptions() {

        return new CimClientOptionValues(KEY_GLOBAL_httpProtocolType, KEY_GLOBAL_hostname,
                KEY_GLOBAL_port, KEY_GLOBAL_namespace, KEY_GLOBAL_user, KEY_GLOBAL_password,
                KEY_GLOBAL_publickeyfile, KEY_GLOBAL_privatekeyfile);
    }

    public Options getOptions() throws WbemsmtException {
        Options options = super.createOptions(LOCAL_OPTIONS, bundle);
        super.createOptions(options, GLOBAL_TASK_OPTIONS, bundle);
        super.createOptions(options, GLOBAL_WBEMSMT_COMMON_OPTIONS, bundle);
        super.createOptions(options, GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS, bundle);
        return options;
    }

    public Options getLocalOptions() throws WbemsmtException {
        Options options = super.createOptions(LOCAL_OPTIONS, bundle);
        return options;
    }

    public Options getGlobalWbemsmtCommonOptions() throws WbemsmtException {
        Options options = super.createOptions(GLOBAL_WBEMSMT_COMMON_OPTIONS, bundle);
        return options;
    }

    public Options getGlobalWbemsmtCommunicationOptions() throws WbemsmtException {
        Options options = super.createOptions(GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS, bundle);
        return options;
    }

    public Options getGlobalTaskOptions() throws WbemsmtException {
        Options options = super.createOptions(GLOBAL_TASK_OPTIONS, bundle);
        return options;
    }

}