/**
 * CreateSambaShare.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS OF
 * THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/cmd/createCommand.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Class for creating objects generated Class
 */

package org.sblim.wbemsmt.cli.samba.listener;

import org.apache.commons.cli.*;
import org.apache.commons.lang.ClassUtils;
import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.bl.messages.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.cli.*;
import org.sblim.wbemsmt.tools.wizard.cli.*;

public class CreateSambaShare extends CimCommand implements ContainerUpdater {

    //All Options that are local and defined for this command
    /**
     * required,  --sharename
     */
    public static final OptionDefinition KEY_sharename = new OptionDefinition(null, "sharename",
            null, "ShareWizardPage1.Name.argValue", true, false,
            "ShareWizardPage1.Name.argDescription");
    /**
     * required,  --path
     */
    public static final OptionDefinition KEY_path = new OptionDefinition(null, "path", null,
            "ShareWizardPage1.Path.argValue", true, false, "ShareWizardPage1.Path.argDescription");
    /**
     *  --comment
     */
    public static final OptionDefinition KEY_comment = new OptionDefinition(null, "comment", null,
            "ShareWizardPage1.Comment.argValue", false, false,
            "ShareWizardPage1.Comment.argDescription");
    /**
     *  --seenByEverybody
     */
    public static final OptionDefinition KEY_seenByEverybody = new OptionDefinition(null,
            "seenByEverybody", null, "ShareWizardPage2.seenByEverybody.argValue", false, false,
            "ShareWizardPage2.seenByEverybody.argDescription");
    /**
     *  --forceUser
     */
    public static final OptionDefinition KEY_forceUser = new OptionDefinition(null, "forceUser",
            null, "ShareWizardPage2.forceUser.argValue", false, false,
            "ShareWizardPage2.forceUser.argDescription");
    /**
     *  --enableGuest
     */
    public static final OptionDefinition KEY_enableGuest = new OptionDefinition(null,
            "enableGuest", null, "ShareWizardPage2.enableGuest.argValue", false, false,
            "ShareWizardPage2.enableGuest.argDescription");
    /**
     *  --enableAllUsers
     */
    public static final OptionDefinition KEY_enableAllUsers = new OptionDefinition(null,
            "enableAllUsers", null, "ShareWizardPage2.enableAllUsers.argValue", false, false,
            "ShareWizardPage2.enableAllUsers.argDescription");

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

    private static final OptionDefinition[] LOCAL_OPTIONS = new OptionDefinition[] { KEY_sharename,
            KEY_path, KEY_comment, KEY_seenByEverybody, KEY_forceUser, KEY_enableGuest,
            KEY_enableAllUsers, };

    private static final OptionDefinition[] GLOBAL_TASK_OPTIONS = new OptionDefinition[] { KEY_GLOBAL_serviceName, };

    private static final OptionDefinition[] GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS = new OptionDefinition[] {
            KEY_GLOBAL_hostname, KEY_GLOBAL_port, KEY_GLOBAL_namespace, KEY_GLOBAL_user,
            KEY_GLOBAL_password, KEY_GLOBAL_publickeyfile, KEY_GLOBAL_privatekeyfile,
            KEY_GLOBAL_httpProtocolType, };

    private static final OptionDefinition[] GLOBAL_WBEMSMT_COMMON_OPTIONS = new OptionDefinition[] {
            KEY_GLOBAL_QUESTION_MARK_, KEY_GLOBAL_help, KEY_GLOBAL_locale, };

    CommandLine cmd = null;
    AbstractBaseCimAdapter adapter = null;

    public CreateSambaShare(java.util.Locale locale) {
        super("CreateSambaShare", new String[] { "messages", "messagesSamba" }, locale);
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

            values.getOut().println("\n" + bundle.getString("shareWizard.create.start"));

            CliDataLoader loader = new CreateSambaShareLoader();
            loader.load(bundle, adapter, commandValues);

            org.sblim.wbemsmt.cli.samba.wizard.ShareWizard wizard = new org.sblim.wbemsmt.cli.samba.wizard.ShareWizard(
                    (org.sblim.wbemsmt.samba.bl.adapter.SambaCimAdapter) adapter);
            if (!wizard.canBeExecuted()) {
                traceErrors("error.while.execution", wizard.getMessageList());
                return;
            }
            wizard.startWizard();

            while (!wizard.getContainer().isLast(wizard.getContainer().getCurrentPageName())) {
                BaseDataContainer dataContainer = wizard.getCurrentPanel();
                if (true == false)
                    ;
                else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1)
                    setCommandLineValues(
                            cmd,
                            adapter,
                            (org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1) dataContainer);
                else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2)
                    setCommandLineValues(
                            cmd,
                            adapter,
                            (org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2) dataContainer);
                else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4)
                    setCommandLineValues(
                            cmd,
                            adapter,
                            (org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4) dataContainer);
                else {
                    logger.severe(dataContainer.getClass().getName()
                            + " cannot be handled from command class " + this.getClass().getName());
                    throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, bundle
                            .getString("internal.error"));
                }

                MessageList result = MessageList.init(dataContainer);
                if (result.hasErrors()) {
                    traceErrors(result);
                    return;
                }
                else {
                    Message caption = Message.create(ErrCodes.MSG_ADDITIONAL_MESSAGES,
                            Message.ERROR, bundle, "additional.messages");
                    traceMessages(caption, result);
                    result.clear();
                }

                wizard.next(this);
                result = wizard.getCurrentPanel().getMessagesList();

                if (result != null) {
                    if (result.hasErrors()) {
                        Message caption = Message.create(ErrCodes.MSG_VALIDATION_ERROR,
                                Message.ERROR, bundle, "validation.error");
                        traceMessages(caption, result);
                        return;
                    }
                    else {
                        Message caption = Message.create(ErrCodes.MSG_ADDITIONAL_MESSAGES,
                                Message.ERROR, bundle, "additional.messages");
                        traceMessages(caption, result);
                        dataContainer.getMessagesList().clear();
                    }
                }
            }

            BaseDataContainer lastPanel = wizard.getCurrentPanel();

            MessageList result = wizard.finish();
            String wizardName = ClassUtils.getShortClassName(wizard.getClass());
            if (result != null && result.hasErrors()) {
                result.addMessage(new Message(ErrCodes.MSG_CREATE_FAILED, Message.ERROR, bundle
                        .getString(wizardName + ".create.failed")));
            }
            else {
                result.addMessage(new Message(ErrCodes.MSG_CREATE_SUCCESS, Message.SUCCESS, bundle
                        .getString(wizardName + ".create.success")));
            }
            traceErrors(result);

            if (true == false)
                ;
            else if (lastPanel instanceof org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4)
                ((CreateSambaShareLoader) loader).loadTracingObject(bundle, adapter,
                        (org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4) lastPanel);
            else {
                logger.severe("Cannot loadTracingObject for " + lastPanel.getClass().getName());
                throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, bundle
                        .getString("internal.error"));
            }

            org.sblim.wbemsmt.cli.samba.container.share.ShareOptionsDataContainerImpl dc = new org.sblim.wbemsmt.cli.samba.container.share.ShareOptionsDataContainerImpl(
                    adapter);

            adapter.updateControls(dc);
            values.getOut().println("\n" + bundle.getString("createdObject") + ":\n");
            dc.trace(values.getOut());

            //values.getOut().println("\n" + bundle.getString("shareWizard.create.success"));

        }
        catch (Exception e) {
            super.handleException(e, values.getArgs(), values.getOptions(), KEY_GLOBAL_password);
        }
        finally {
            if (adapter != null)
                adapter.cleanup();
        }
    }

    public void prepareForUpdateControls(DataContainer dataContainer) throws WbemsmtException {
        if (true == false)
            ;
        else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1)
            updateContainerChilds(cmd, adapter,
                    (org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1) dataContainer);
        else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2)
            updateContainerChilds(cmd, adapter,
                    (org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2) dataContainer);
        else if (dataContainer instanceof org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4)
            updateContainerChilds(cmd, adapter,
                    (org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4) dataContainer);
        else {

            logger.severe("Cannot setValues for Container " + dataContainer.getClass().getName());
            throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS,
                    "Cannot setValues for Container " + dataContainer.getClass().getName());
        }
    }

    private void updateContainerChilds(CommandLine cmd, AbstractBaseCimAdapter adapter,
            org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1 dc)
            throws WbemsmtException {

        try {
            //update the child-containers

        }
        catch (Exception e) {
            throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS, bundle
                    .getString("internal.error"), e);
        }

    }

    private void setCommandLineValues(CommandLine cmd, AbstractBaseCimAdapter adapter,
            org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage1 dc)
            throws WbemsmtException {
        //set the values
        setValue(cmd, dc.get_Name(), KEY_sharename);
        setValue(cmd, dc.get_Path(), KEY_path);
        setValue(cmd, dc.get_Comment(), KEY_comment);

        //The Buttons

    }

    private void updateContainerChilds(CommandLine cmd, AbstractBaseCimAdapter adapter,
            org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2 dc)
            throws WbemsmtException {

        try {
            //update the child-containers

            int count = 0;

            count = adapter
                    .count(
                            "users",
                            org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer.class,
                            dc);
            dc.getUsers().clear();
            for (int i = 0; i < count; i++) {
                org.sblim.wbemsmt.cli.samba.container.wizard.UserInShareWizardACLItemDataContainerImpl child = new org.sblim.wbemsmt.cli.samba.container.wizard.UserInShareWizardACLItemDataContainerImpl(
                        adapter);
                dc.getUsers().add(child);
            }
        }
        catch (Exception e) {
            throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS, bundle
                    .getString("internal.error"), e);
        }

    }

    private void setCommandLineValues(CommandLine cmd, AbstractBaseCimAdapter adapter,
            org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage2 dc)
            throws WbemsmtException {
        //set the values
        setCheckboxValue(cmd, dc.get_usr_SeenByEverybody(), KEY_seenByEverybody);
        setMultiValue(adapter.getBundle(), cmd, dc.get_usr_ForceUser(), KEY_forceUser);
        setCheckboxValue(cmd, dc.get_usr_EnableGuest(), KEY_enableGuest);
        setCheckboxValue(cmd, dc.get_usr_EnableAllUsers(), KEY_enableAllUsers);

        //The Buttons
        if (!pressButton(cmd, adapter, dc, dc.get_usr_EnableAllUsers(), KEY_enableAllUsers))
            return;

    }

    private void updateContainerChilds(CommandLine cmd, AbstractBaseCimAdapter adapter,
            org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4 dc)
            throws WbemsmtException {

        try {
            //update the child-containers

            int count = 0;

            count = adapter
                    .count(
                            "users",
                            org.sblim.wbemsmt.samba.bl.container.wizard.UserInShareWizardACLItemDataContainer.class,
                            dc);
            dc.getUsers().clear();
            for (int i = 0; i < count; i++) {
                org.sblim.wbemsmt.cli.samba.container.wizard.UserInShareWizardACLItemDataContainerImpl child = new org.sblim.wbemsmt.cli.samba.container.wizard.UserInShareWizardACLItemDataContainerImpl(
                        adapter);
                dc.getUsers().add(child);
            }
        }
        catch (Exception e) {
            throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS, bundle
                    .getString("internal.error"), e);
        }

    }

    private void setCommandLineValues(CommandLine cmd, AbstractBaseCimAdapter adapter,
            org.sblim.wbemsmt.samba.bl.container.wizard.ShareWizardPage4 dc)
            throws WbemsmtException {
        //set the values

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