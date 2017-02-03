/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Feb 02 14:59:07 GMT 2017
 */

package com.es.generated;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

@EvoSuiteClassExclude
public class Queue_ESTest_scaffolding {

  @org.junit.Rule 
  public org.junit.rules.Timeout globalTimeout = new org.junit.rules.Timeout(4000); 

  private static final java.util.Properties defaultProperties = (java.util.Properties) System.getProperties().clone();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);

  @BeforeClass
  public static void initEvoSuiteFramework() {
    org.evosuite.runtime.RuntimeSettings.className = "com.es.Queue";
    org.evosuite.runtime.GuiSupport.initialize();
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100;
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000;
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true;
    org.evosuite.runtime.RuntimeSettings.sandboxMode = SandboxMode.RECOMMENDED;
    Sandbox.initializeSecurityManagerForSUT();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime();
  }

  @AfterClass
  public static void clearEvoSuiteFramework(){
    Sandbox.resetDefaultSecurityManager();
    System.setProperties((java.util.Properties) defaultProperties.clone());
  }

  @Before
  public void initTestCase(){
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler();
    Sandbox.goingToExecuteSUTCode();
    setSystemProperties();
    org.evosuite.runtime.GuiSupport.setHeadless();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime();
    org.evosuite.runtime.agent.InstrumentingAgent.activate();
  }

  @After
  public void doneWithTestCase(){
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks();
    resetClasses();
    Sandbox.doneWithExecutingSUTCode();
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate();
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode();
  }

  public void setSystemProperties() {

    System.setProperties((java.util.Properties) defaultProperties.clone());
    System.setProperty("java.vm.vendor", "Oracle Corporation");
    System.setProperty("java.specification.version", "1.8");
            System.setProperty("java.home", "/Library/Java/JavaVirtualMachines/jdk1.8.0_71.jdk/Contents/Home/jre");
    System.setProperty("user.dir", "/Users/nicolasfontenele/IdeaProjects/es-sample");
    System.setProperty("java.io.tmpdir", "/var/folders/_c/vq9qqdjj6474yq0hhlz_hphr0000gn/T/");
    System.setProperty("awt.toolkit", "sun.lwawt.macosx.LWCToolkit");
    System.setProperty("file.encoding", "UTF-8");
    System.setProperty("file.separator", "/");
        System.setProperty("java.awt.graphicsenv", "sun.awt.CGraphicsEnvironment");
    System.setProperty("java.awt.headless", "true");
    System.setProperty("java.awt.printerjob", "sun.lwawt.macosx.CPrinterJob");
    System.setProperty("java.class.path", "/Users/nicolasfontenele/.m2/repository/org/evosuite/evosuite-master/1.0.1/evosuite-master-1.0.1.jar:/Users/nicolasfontenele/.m2/repository/org/evosuite/evosuite-standalone-runtime/1.0.1/evosuite-standalone-runtime-1.0.1-tests.jar:/Users/nicolasfontenele/.m2/repository/org/evosuite/evosuite-client/1.0.1/evosuite-client-1.0.1-tests.jar:/Users/nicolasfontenele/.m2/repository/org/evosuite/evosuite-runtime/1.0.1/evosuite-runtime-1.0.1.jar:/Users/nicolasfontenele/.m2/repository/org/hsqldb/hsqldb/2.3.2/hsqldb-2.3.2.jar:/Users/nicolasfontenele/.m2/repository/org/springframework/spring-orm/4.1.6.RELEASE/spring-orm-4.1.6.RELEASE.jar:/Users/nicolasfontenele/.m2/repository/org/springframework/spring-beans/4.1.6.RELEASE/spring-beans-4.1.6.RELEASE.jar:/Users/nicolasfontenele/.m2/repository/org/springframework/spring-core/4.1.6.RELEASE/spring-core-4.1.6.RELEASE.jar:/Users/nicolasfontenele/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/Users/nicolasfontenele/.m2/repository/org/springframework/spring-jdbc/4.1.6.RELEASE/spring-jdbc-4.1.6.RELEASE.jar:/Users/nicolasfontenele/.m2/repository/org/springframework/spring-tx/4.1.6.RELEASE/spring-tx-4.1.6.RELEASE.jar:/Users/nicolasfontenele/.m2/repository/org/springframework/spring-context/4.1.6.RELEASE/spring-context-4.1.6.RELEASE.jar:/Users/nicolasfontenele/.m2/repository/org/springframework/spring-aop/4.1.6.RELEASE/spring-aop-4.1.6.RELEASE.jar:/Users/nicolasfontenele/.m2/repository/aopalliance/aopalliance/1.0/aopalliance-1.0.jar:/Users/nicolasfontenele/.m2/repository/org/springframework/spring-expression/4.1.6.RELEASE/spring-expression-4.1.6.RELEASE.jar:/Users/nicolasfontenele/.m2/repository/junit/junit/4.12/junit-4.12.jar:/Users/nicolasfontenele/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/Users/nicolasfontenele/.m2/repository/org/mockito/mockito-all/2.0.2-beta/mockito-all-2.0.2-beta.jar:/Users/nicolasfontenele/.m2/repository/org/slf4j/slf4j-api/1.7.12/slf4j-api-1.7.12.jar:/Users/nicolasfontenele/.m2/repository/org/ow2/asm/asm-all/5.0.4/asm-all-5.0.4.jar:/Users/nicolasfontenele/.m2/repository/javax/xml/bind/jaxb-api/2.2.12/jaxb-api-2.2.12.jar:/Users/nicolasfontenele/.m2/repository/net/sf/opencsv/opencsv/2.3/opencsv-2.3.jar:/Users/nicolasfontenele/.m2/repository/dk/brics/automaton/automaton/1.11-8/automaton-1.11-8.jar:/Users/nicolasfontenele/.m2/repository/ch/qos/logback/logback-classic/1.1.3/logback-classic-1.1.3.jar:/Users/nicolasfontenele/.m2/repository/ch/qos/logback/logback-core/1.1.3/logback-core-1.1.3.jar:/Users/nicolasfontenele/.m2/repository/com/googlecode/gentyref/gentyref/1.2.0/gentyref-1.2.0.jar:/Users/nicolasfontenele/.m2/repository/net/sf/jgrapht/jgrapht/0.8.3/jgrapht-0.8.3.jar:/Users/nicolasfontenele/.m2/repository/com/panayotis/JavaPlot/0.4.0/JavaPlot-0.4.0.jar:/Users/nicolasfontenele/.m2/repository/com/thoughtworks/xstream/xstream/1.4.8/xstream-1.4.8.jar:/Users/nicolasfontenele/.m2/repository/xmlpull/xmlpull/1.1.3.1/xmlpull-1.1.3.1.jar:/Users/nicolasfontenele/.m2/repository/xpp3/xpp3_min/1.1.4c/xpp3_min-1.1.4c.jar:/Users/nicolasfontenele/.m2/repository/org/apache/commons/commons-lang3/3.3.2/commons-lang3-3.3.2.jar:/Users/nicolasfontenele/.m2/repository/commons-io/commons-io/2.4/commons-io-2.4.jar:/Users/nicolasfontenele/.m2/repository/commons-cli/commons-cli/1.3.1/commons-cli-1.3.1.jar:/Users/nicolasfontenele/.m2/repository/org/kohsuke/graphviz-api/1.1/graphviz-api-1.1.jar:/Users/nicolasfontenele/.m2/repository/oro/oro/2.0.8/oro-2.0.8.jar:/Users/nicolasfontenele/.m2/repository/org/jboss/spec/javax/servlet/jboss-servlet-api_3.1_spec/1.0.0.Final/jboss-servlet-api_3.1_spec-1.0.0.Final.jar:/Users/nicolasfontenele/.m2/repository/javax/inject/javax.inject/1/javax.inject-1.jar:/Users/nicolasfontenele/.m2/repository/javax/enterprise/cdi-api/1.2/cdi-api-1.2.jar:/Users/nicolasfontenele/.m2/repository/javax/el/javax.el-api/3.0.0/javax.el-api-3.0.0.jar:/Users/nicolasfontenele/.m2/repository/javax/interceptor/javax.interceptor-api/1.2/javax.interceptor-api-1.2.jar:/Users/nicolasfontenele/.m2/repository/org/hibernate/hibernate-entitymanager/4.3.10.Final/hibernate-entitymanager-4.3.10.Final.jar:/Users/nicolasfontenele/.m2/repository/org/jboss/logging/jboss-logging/3.1.3.GA/jboss-logging-3.1.3.GA.jar:/Users/nicolasfontenele/.m2/repository/org/jboss/logging/jboss-logging-annotations/1.2.0.Beta1/jboss-logging-annotations-1.2.0.Beta1.jar:/Users/nicolasfontenele/.m2/repository/org/hibernate/hibernate-core/4.3.10.Final/hibernate-core-4.3.10.Final.jar:/Users/nicolasfontenele/.m2/repository/antlr/antlr/2.7.7/antlr-2.7.7.jar:/Users/nicolasfontenele/.m2/repository/org/jboss/jandex/1.1.0.Final/jandex-1.1.0.Final.jar:/Users/nicolasfontenele/.m2/repository/dom4j/dom4j/1.6.1/dom4j-1.6.1.jar:/Users/nicolasfontenele/.m2/repository/xml-apis/xml-apis/1.0.b2/xml-apis-1.0.b2.jar:/Users/nicolasfontenele/.m2/repository/org/hibernate/common/hibernate-commons-annotations/4.0.5.Final/hibernate-commons-annotations-4.0.5.Final.jar:/Users/nicolasfontenele/.m2/repository/org/hibernate/javax/persistence/hibernate-jpa-2.1-api/1.0.0.Final/hibernate-jpa-2.1-api-1.0.0.Final.jar:/Users/nicolasfontenele/.m2/repository/org/jboss/spec/javax/transaction/jboss-transaction-api_1.2_spec/1.0.0.Final/jboss-transaction-api_1.2_spec-1.0.0.Final.jar:/Users/nicolasfontenele/.m2/repository/org/javassist/javassist/3.18.1-GA/javassist-3.18.1-GA.jar:/Users/nicolasfontenele/IdeaProjects/es-sample/target/classes:/Users/nicolasfontenele/IdeaProjects/es-sample/target/classes");
    System.setProperty("java.class.version", "52.0");
        System.setProperty("java.endorsed.dirs", "/Library/Java/JavaVirtualMachines/jdk1.8.0_71.jdk/Contents/Home/jre/lib/endorsed");
    System.setProperty("java.ext.dirs", "/Users/nicolasfontenele/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.8.0_71.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java");
    System.setProperty("java.library.path", "lib");
    System.setProperty("java.runtime.name", "Java(TM) SE Runtime Environment");
    System.setProperty("java.runtime.version", "1.8.0_71-b15");
    System.setProperty("java.specification.name", "Java Platform API Specification");
    System.setProperty("java.specification.vendor", "Oracle Corporation");
        System.setProperty("java.vendor", "Oracle Corporation");
    System.setProperty("java.vendor.url", "http://java.oracle.com/");
    System.setProperty("java.version", "1.8.0_71");
    System.setProperty("java.vm.info", "mixed mode");
    System.setProperty("java.vm.name", "Java HotSpot(TM) 64-Bit Server VM");
    System.setProperty("java.vm.specification.name", "Java Virtual Machine Specification");
    System.setProperty("java.vm.specification.vendor", "Oracle Corporation");
    System.setProperty("java.vm.specification.version", "1.8");
    System.setProperty("java.vm.version", "25.71-b15");
    System.setProperty("line.separator", "\n");
    System.setProperty("os.arch", "x86_64");
    System.setProperty("os.name", "Mac OS X");
    System.setProperty("os.version", "10.11");
    System.setProperty("path.separator", ":");
    System.setProperty("user.country", "BR");
    System.setProperty("user.home", "/Users/nicolasfontenele");
    System.setProperty("user.language", "pt");
    System.setProperty("user.name", "nicolasfontenele");
    System.setProperty("user.timezone", "America/Fortaleza");
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Queue_ESTest_scaffolding.class.getClassLoader() ,
      "com.es.Queue",
      "com.es.Person"
    );
  } 

  private static void resetClasses() {
  }
}
