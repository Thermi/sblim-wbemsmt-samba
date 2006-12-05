%define name                    sblim-wbemsmt-samba
%define version                 0.2.3
%define build_release           1
%define release                 %{build_release}jpp
%define section                 free


%define wbemsmt_webapp_name     sblim-wbemsmt-webapp
%define wbemsmt_webapp_instdir  %{_localstatedir}/lib/%{wbemsmt_webapp_name}/webapps/%{wbemsmt_webapp_name}

###############################################################################

Name:           %{name}
Version:        %{version}
Release:        %{release}
License:        Common Public License
Url:            http://sblim.sourceforge.net/
Group:          Development/Libraries/Java
Vendor:         IBM
Summary:        Provides a wbemsmt-based task that provides support to configure Samba
SOURCE0:        %{name}-%{version}-src.tar.bz2
BuildRoot:      %{_tmppath}/%{name}-%{version}-%{release}
BuildArch:      noarch

BuildRequires: jpackage-utils >= 0:1.5.32
BuildRequires: ant >= 0:1.6
BuildRequires: sblim-cim-client >= 0:1.3.1
#BuildRequires: sblim-wbemsmt-commons => 0.2.3
BuildRequires: jakarta-commons-cli >= 1.0
BuildRequires: jakarta-commons-lang >= 2.0
#BuildRequires:  myfaces >= 1.1.4

###############################################################################

Requires: jpackage-utils >= 0:1.5.32
Requires: sblim-cim-client >= 0:1.3.1
Requires: sblim-wbemsmt-commons => 0.2.3
Requires: sblim-wbemsmt-webapp => 0.2.3
Requires: jakarta-commons-cli >= 1.0
Requires: jakarta-commons-lang >= 2.0
#Requires:  myfaces >= 1.1.4

###############################################################################

%description
This module provides the wbemsmt-based task that provides the support to
configure Samba shares, printers and users.
It contains the generated data containers, the generated first class objects 
and the business logic for the Samba app. It also contains the generated cli 
interface for the samba task. 

###############################################################################

%prep
%setup -q -n %{name}

###############################################################################

%build
CLASSPATH=$(build-classpath sblim-cim-client)
CLASSPATH=$(build-classpath commons-cli commons-lang):$CLASSPATH
CLASSPATH=$(build-classpath myfaces-api myfaces-impl ):$CLASSPATH
CLASSPATH=$(build-classpath sblim-wbemsmt/sblim-wbemsmt-commons sblim-wbemsmt/sblim-wbemsmt-commons-launcher-config):$CLASSPATH
export CLASSPATH

ant build-jar


###############################################################################

%install
rm -rf $RPM_BUILD_ROOT
install -d $RPM_BUILD_ROOT%{_bindir}/
install -d $RPM_BUILD_ROOT%{_sysconfdir}/sblim-wbemsmt/tasklauncher.d
install -d $RPM_BUILD_ROOT%{_javadir}/sblim-wbemsmt
install -d $RPM_BUILD_ROOT%{_docdir}/%{name}-%{version}

# Installation of documentation files
install COPYING   $RPM_BUILD_ROOT%{_docdir}/%{name}-%{version}/COPYING
install AUTHORS   $RPM_BUILD_ROOT%{_docdir}/%{name}-%{version}/AUTHORS
install README    $RPM_BUILD_ROOT%{_docdir}/%{name}-%{version}/README
install ChangeLog $RPM_BUILD_ROOT%{_docdir}/%{name}-%{version}/ChangeLog
install NEWS      $RPM_BUILD_ROOT%{_docdir}/%{name}-%{version}/NEWS
install TroubleShooting $RPM_BUILD_ROOT%{_docdir}/%{name}-%{version}/TroubleShooting
install MultipleHostsSupport $RPM_BUILD_ROOT%{_docdir}/%{name}-%{version}/MultipleHostsSupport

install target/package/etc/sblim-wbemsmt/tasklauncher.d/samba-task-config.xml $RPM_BUILD_ROOT%{_sysconfdir}/sblim-wbemsmt/tasklauncher.d/
install target/package/cli-scripts/sblim-wbemsmt-samba-cli.sh $RPM_BUILD_ROOT%{_bindir}/sblim-wbemsmt-samba-cli.sh

# Installation of java files
install target/package/%{name}-%{version}.jar $RPM_BUILD_ROOT%{_javadir}/sblim-wbemsmt
(
  cd $RPM_BUILD_ROOT%{_javadir}/sblim-wbemsmt &&
    ln -sf %{name}-%{version}.jar %{name}.jar;
)

###############################################################################

%post
unset JAVA_HOME
[ -r %{_sysconfdir}/tomcat5/tomcat5.conf ] && . %{_sysconfdir}/tomcat5/tomcat5.conf
[ -z "$JAVA_HOME" ] && [ -r %{_sysconfdir}/java/java.conf ] && \
    . %{_sysconfdir}/java/java.conf
[ -z "$JAVA_HOME" ] && JAVA_HOME=%{_jvmdir}/java
build-jar-repository %{wbemsmt_webapp_instdir}/WEB-INF/lib sblim-wbemsmt/%{name}


###############################################################################

%preun
if [ $1 = 0 ]; then
     rm -f %{wbemsmt_webapp_instdir}/WEB-INF/lib/\[sblim-wbemsmt\]\[%{name}.jar\]*.jar
fi


###############################################################################

%files
%defattr(0644,root,root,0755)
%doc %{_docdir}/%{name}-%{version}/COPYING
%doc %{_docdir}/%{name}-%{version}/AUTHORS
%doc %{_docdir}/%{name}-%{version}/README
%doc %{_docdir}/%{name}-%{version}/ChangeLog
%doc %{_docdir}/%{name}-%{version}/NEWS
%doc %{_docdir}/%{name}-%{version}/TroubleShooting
%doc %{_docdir}/%{name}-%{version}/MultipleHostsSupport
%{_javadir}/sblim-wbemsmt/%{name}.jar
%{_javadir}/sblim-wbemsmt/%{name}-%{version}.jar
%{_bindir}/sblim-wbemsmt-samba-cli.sh
%attr(444,root,tomcat) %config(noreplace) %{_sysconfdir}/sblim-wbemsmt/tasklauncher.d/samba-task-config.xml

###############################################################################
%changelog
* Mon Dec 4 2006 Wolfgang Taphorn <taphorn@de.ibm.com> 0.2.3-1
  - Consolidation of the different cvs modules
  - Inclusion of fixes for the following bug entries:
    o 1609093  wbemsmt-samba: Consolidation of cvs module

* Tue Oct 17 2006 Wolfgang Taphorn <taphorn@de.ibm.com> 0.2.2-1
  Changelog information out of the distributed cvs modules
  - Inclusion of fixes for the following bug entries:
    o 1576424  UserWizard: CreateAll-Checkbox causes Error
    o 1576423  PrinterWizard: CIM_ERR_ALREADY_EXISTS while creating Printer
    o 1573739  Samba: Rework of ACL UI Elements
    o 1573713  WizardPanels are vanishing
    
* Sat Jul 22 2006 Wolfgang Taphorn <taphorn@de.ibm.com> 0.2.1-1
  - Initial upload of distributed CVS modules
