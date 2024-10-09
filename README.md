Jenkins pipeline console
![Uploading image.png…]()




Started by user Sreenivasa  Raju Dhenuvakonda
Loading library my-shared-library@main
Attempting to resolve main from remote references...
 > git --version # timeout=10
 > git --version # 'git version 2.34.1'
 > git ls-remote -h -- https://github.com/Srinu-rj/groovy.git # timeout=10
Found match: refs/heads/main revision 4209c27e118ce6e6bc0518c05e03d8f8816e730b
The recommended git tool is: NONE
No credentials specified
 > git rev-parse --resolve-git-dir /var/lib/jenkins/workspace/groovy@libs/c3a83c135863e4bbe2ced10e330aecced3aafbc60bb585c48f7a6cf45b77d252/.git # timeout=10
Fetching changes from the remote Git repository
 > git config remote.origin.url https://github.com/Srinu-rj/groovy.git # timeout=10
Fetching without tags
Fetching upstream changes from https://github.com/Srinu-rj/groovy.git
 > git --version # timeout=10
 > git --version # 'git version 2.34.1'
 > git fetch --no-tags --force --progress -- https://github.com/Srinu-rj/groovy.git +refs/heads/*:refs/remotes/origin/* # timeout=10
Checking out Revision 4209c27e118ce6e6bc0518c05e03d8f8816e730b (main)
 > git config core.sparsecheckout # timeout=10
 > git checkout -f 4209c27e118ce6e6bc0518c05e03d8f8816e730b # timeout=10
Commit message: "Update mvnBuild.groovy"
 > git rev-list --no-walk 4209c27e118ce6e6bc0518c05e03d8f8816e730b # timeout=10
[Pipeline] Start of Pipeline
[Pipeline] node
Running on Jenkins in /var/lib/jenkins/workspace/groovy
[Pipeline] {
[Pipeline] tool
[Pipeline] withEnv
[Pipeline] {
[Pipeline] stage
[Pipeline] { (Declarative: Tool Install)
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] }
[Pipeline] // stage
[Pipeline] withEnv
[Pipeline] {
[Pipeline] stage
[Pipeline] { (Git CheckOut)
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] withEnv
[Pipeline] {
[Pipeline] echo
Running Git CheckOut...
[Pipeline] checkout
Selected Git installation does not exist. Using Default
The recommended git tool is: NONE
No credentials specified
 > git rev-parse --resolve-git-dir /var/lib/jenkins/workspace/groovy/.git # timeout=10
Fetching changes from the remote Git repository
 > git config remote.origin.url https://github.com/Srinu-rj/spring-food-app.git # timeout=10
Fetching upstream changes from https://github.com/Srinu-rj/spring-food-app.git
 > git --version # timeout=10
 > git --version # 'git version 2.34.1'
 > git fetch --tags --force --progress -- https://github.com/Srinu-rj/spring-food-app.git +refs/heads/*:refs/remotes/origin/* # timeout=10
 > git rev-parse origin/main^{commit} # timeout=10
Checking out Revision 2bc6b27e660190d38b9ca628de38866ae3caaf5e (origin/main)
 > git config core.sparsecheckout # timeout=10
 > git checkout -f 2bc6b27e660190d38b9ca628de38866ae3caaf5e # timeout=10
Commit message: "jenkins pipeline"
 > git rev-list --no-walk 2bc6b27e660190d38b9ca628de38866ae3caaf5e # timeout=10
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Unit Test maven)
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] withEnv
[Pipeline] {
[Pipeline] echo
Running Unit Test maven...
[Pipeline] sh
+ mvn test
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------< com.foodapp:spring-food-app >---------------------
[INFO] Building spring-food-app 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ spring-food-app ---
[INFO] Copying 1 resource from src/main/resources to target/classes
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.11.0:compile (default-compile) @ spring-food-app ---
[INFO] Changes detected - recompiling the module! :source
[INFO] Compiling 69 source files with javac [debug release 17] to target/classes
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ spring-food-app ---
[INFO] skip non existing resourceDirectory /var/lib/jenkins/workspace/groovy/src/test/resources
[INFO] 
[INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ spring-food-app ---
[INFO] Changes detected - recompiling the module! :dependency
[INFO] Compiling 1 source file with javac [debug release 17] to target/test-classes
[INFO] 
[INFO] --- surefire:3.1.2:test (default-test) @ spring-food-app ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.foodapp.springfoodapp.SpringFoodAppApplicationTests
16:49:05.458 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [com.foodapp.springfoodapp.SpringFoodAppApplicationTests]: SpringFoodAppApplicationTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
16:49:05.726 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.foodapp.springfoodapp.SpringFoodAppApplication for test class com.foodapp.springfoodapp.SpringFoodAppApplicationTests
16:49:06.225 [main] INFO org.springframework.boot.devtools.restart.RestartApplicationListener -- Restart disabled due to context in which it is running

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.0)

2024-10-09T16:49:06.782+05:30  INFO 3998 --- [spring-food-app] [           main] c.f.s.SpringFoodAppApplicationTests      : Starting SpringFoodAppApplicationTests using Java 17.0.12 with PID 3998 (started by jenkins in /var/lib/jenkins/workspace/groovy)
2024-10-09T16:49:06.786+05:30  INFO 3998 --- [spring-food-app] [           main] c.f.s.SpringFoodAppApplicationTests      : No active profile set, falling back to 1 default profile: "default"
2024-10-09T16:49:10.702+05:30  INFO 3998 --- [spring-food-app] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2024-10-09T16:49:10.942+05:30  INFO 3998 --- [spring-food-app] [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.3.1.Final
2024-10-09T16:49:11.072+05:30  INFO 3998 --- [spring-food-app] [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2024-10-09T16:49:11.807+05:30  INFO 3998 --- [spring-food-app] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2024-10-09T16:49:16.043+05:30  INFO 3998 --- [spring-food-app] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@50d666a2
2024-10-09T16:49:16.061+05:30  INFO 3998 --- [spring-food-app] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2024-10-09T16:49:16.715+05:30  WARN 3998 --- [spring-food-app] [           main] org.hibernate.orm.deprecation            : HHH90000025: MySQLDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2024-10-09T16:49:18.458+05:30  INFO 3998 --- [spring-food-app] [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2024-10-09T16:49:29.553+05:30 TRACE 3998 --- [spring-food-app] [           main] eGlobalAuthenticationAutowiredConfigurer : Eagerly initializing {appConfig=com.foodapp.springfoodapp.security.config.AppConfig$$SpringCGLIB$$0@1b5e6983}
2024-10-09T16:49:31.023+05:30  INFO 3998 --- [spring-food-app] [           main] o.s.s.web.DefaultSecurityFilterChain     : Will secure any request with [org.springframework.security.web.session.DisableEncodeUrlFilter@7f8614ce, org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter@11261fc9, org.springframework.security.web.context.SecurityContextHolderFilter@142f0ac1, org.springframework.security.web.header.HeaderWriterFilter@7585531b, org.springframework.security.web.authentication.logout.LogoutFilter@2623ad23, com.foodapp.springfoodapp.security.config.JwtTokenValidator@273cb729, org.springframework.security.web.savedrequest.RequestCacheAwareFilter@26a0068a, org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter@42748f59, org.springframework.security.web.authentication.AnonymousAuthenticationFilter@76603c44, org.springframework.security.web.session.SessionManagementFilter@42a08547, org.springframework.security.web.access.ExceptionTranslationFilter@430abcad, org.springframework.security.web.access.intercept.AuthorizationFilter@590182a6]
2024-10-09T16:49:32.229+05:30  INFO 3998 --- [spring-food-app] [           main] c.f.s.SpringFoodAppApplicationTests      : Started SpringFoodAppApplicationTests in 26.034 seconds (process running for 28.673)
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 28.16 s -- in com.foodapp.springfoodapp.SpringFoodAppApplicationTests
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  42.089 s
[INFO] Finished at: 2024-10-09T16:49:35+05:30
[INFO] ------------------------------------------------------------------------
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Integration Test maven)
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] withEnv
[Pipeline] {
[Pipeline] echo
Running Integration Test maven...
[Pipeline] sh
+ mvn verify -DskipUnitTests
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------< com.foodapp:spring-food-app >---------------------
[INFO] Building spring-food-app 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ spring-food-app ---
[INFO] Copying 1 resource from src/main/resources to target/classes
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.11.0:compile (default-compile) @ spring-food-app ---
[INFO] Changes detected - recompiling the module! :source
[INFO] Compiling 69 source files with javac [debug release 17] to target/classes
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ spring-food-app ---
[INFO] skip non existing resourceDirectory /var/lib/jenkins/workspace/groovy/src/test/resources
[INFO] 
[INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ spring-food-app ---
[INFO] Changes detected - recompiling the module! :dependency
[INFO] Compiling 1 source file with javac [debug release 17] to target/test-classes
[INFO] 
[INFO] --- surefire:3.1.2:test (default-test) @ spring-food-app ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.foodapp.springfoodapp.SpringFoodAppApplicationTests
16:49:48.696 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [com.foodapp.springfoodapp.SpringFoodAppApplicationTests]: SpringFoodAppApplicationTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
16:49:48.882 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.foodapp.springfoodapp.SpringFoodAppApplication for test class com.foodapp.springfoodapp.SpringFoodAppApplicationTests
16:49:49.072 [main] INFO org.springframework.boot.devtools.restart.RestartApplicationListener -- Restart disabled due to context in which it is running

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.0)

2024-10-09T16:49:49.413+05:30  INFO 4183 --- [spring-food-app] [           main] c.f.s.SpringFoodAppApplicationTests      : Starting SpringFoodAppApplicationTests using Java 17.0.12 with PID 4183 (started by jenkins in /var/lib/jenkins/workspace/groovy)
2024-10-09T16:49:49.416+05:30  INFO 4183 --- [spring-food-app] [           main] c.f.s.SpringFoodAppApplicationTests      : No active profile set, falling back to 1 default profile: "default"
2024-10-09T16:49:52.237+05:30  INFO 4183 --- [spring-food-app] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2024-10-09T16:49:52.326+05:30  INFO 4183 --- [spring-food-app] [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.3.1.Final
2024-10-09T16:49:52.383+05:30  INFO 4183 --- [spring-food-app] [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2024-10-09T16:49:52.765+05:30  INFO 4183 --- [spring-food-app] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2024-10-09T16:49:56.587+05:30  INFO 4183 --- [spring-food-app] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@3f6906f4
2024-10-09T16:49:56.594+05:30  INFO 4183 --- [spring-food-app] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2024-10-09T16:49:57.286+05:30  WARN 4183 --- [spring-food-app] [           main] org.hibernate.orm.deprecation            : HHH90000025: MySQLDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2024-10-09T16:49:58.616+05:30  INFO 4183 --- [spring-food-app] [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2024-10-09T16:50:09.514+05:30 TRACE 4183 --- [spring-food-app] [           main] eGlobalAuthenticationAutowiredConfigurer : Eagerly initializing {appConfig=com.foodapp.springfoodapp.security.config.AppConfig$$SpringCGLIB$$0@1d642682}
2024-10-09T16:50:10.681+05:30  INFO 4183 --- [spring-food-app] [           main] o.s.s.web.DefaultSecurityFilterChain     : Will secure any request with [org.springframework.security.web.session.DisableEncodeUrlFilter@7ca46aaf, org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter@701c092c, org.springframework.security.web.context.SecurityContextHolderFilter@532b3244, org.springframework.security.web.header.HeaderWriterFilter@fcdeb50, org.springframework.security.web.authentication.logout.LogoutFilter@154ea177, com.foodapp.springfoodapp.security.config.JwtTokenValidator@20c4be8d, org.springframework.security.web.savedrequest.RequestCacheAwareFilter@28d48616, org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter@5967492a, org.springframework.security.web.authentication.AnonymousAuthenticationFilter@590182a6, org.springframework.security.web.session.SessionManagementFilter@28817763, org.springframework.security.web.access.ExceptionTranslationFilter@6d17cd8b, org.springframework.security.web.access.intercept.AuthorizationFilter@2fbc704a]
2024-10-09T16:50:11.776+05:30  INFO 4183 --- [spring-food-app] [           main] c.f.s.SpringFoodAppApplicationTests      : Started SpringFoodAppApplicationTests in 22.718 seconds (process running for 24.242)
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 24.42 s -- in com.foodapp.springfoodapp.SpringFoodAppApplicationTests
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- jar:3.3.0:jar (default-jar) @ spring-food-app ---
[INFO] Building jar: /var/lib/jenkins/workspace/groovy/target/spring-image.jar
[INFO] 
[INFO] --- spring-boot:3.2.0:repackage (repackage) @ spring-food-app ---
[INFO] Replacing main artifact /var/lib/jenkins/workspace/groovy/target/spring-image.jar with repackaged archive, adding nested dependencies in BOOT-INF/.
[INFO] The original artifact has been renamed to /var/lib/jenkins/workspace/groovy/target/spring-image.jar.original
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  39.133 s
[INFO] Finished at: 2024-10-09T16:50:18+05:30
[INFO] ------------------------------------------------------------------------
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Static code analysis: Sonarqube)
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] withEnv
[Pipeline] {
[Pipeline] echo
Running Static code analysis: Sonarqube...
[Pipeline] script
[Pipeline] {
[Pipeline] withSonarQubeEnv
Injecting SonarQube environment variables using the configuration: sonar
[Pipeline] {
[Pipeline] sh
+ /var/lib/jenkins/tools/hudson.plugins.sonar.SonarRunnerInstallation/sonar-scanner/bin/sonar-scanner -Dsonar.projectName=spring-boot-application -Dsonar.projectKey=spring-boot-application -Dsonar.java.binaries=.
16:50:20.861 INFO  Scanner configuration file: /var/lib/jenkins/tools/hudson.plugins.sonar.SonarRunnerInstallation/sonar-scanner/conf/sonar-scanner.properties
16:50:20.867 INFO  Project root configuration file: NONE
16:50:20.889 INFO  SonarScanner CLI 6.1.0.4477
16:50:20.891 INFO  Java 17.0.12 Eclipse Adoptium (64-bit)
16:50:20.892 INFO  Linux 5.15.153.1-microsoft-standard-WSL2 amd64
16:50:20.938 INFO  User cache: /var/lib/jenkins/.sonar/cache
16:50:22.000 INFO  JRE provisioning: os[linux], arch[x86_64]
16:50:22.287 INFO  Communicating with SonarQube Server 10.6.0.92116
16:50:22.893 INFO  Starting SonarScanner Engine...
16:50:22.894 INFO  Java 17.0.11 Eclipse Adoptium (64-bit)
16:50:24.325 INFO  Load global settings
16:50:24.551 INFO  Load global settings (done) | time=225ms
16:50:24.555 INFO  Server id: 147B411E-AZIOTUWKwbipMjtO6bmM
16:50:24.568 INFO  Loading required plugins
16:50:24.569 INFO  Load plugins index
16:50:24.640 INFO  Load plugins index (done) | time=72ms
16:50:24.640 INFO  Load/download plugins
16:51:01.078 INFO  Load/download plugins (done) | time=36439ms
16:50:25.279 INFO  Process project properties
16:50:25.280 INFO  Process project properties (done) | time=0ms
16:50:25.299 INFO  Project key: spring-boot-application
16:50:25.301 INFO  Base dir: /var/lib/jenkins/workspace/groovy
16:50:25.302 INFO  Working dir: /var/lib/jenkins/workspace/groovy/.scannerwork
16:50:25.312 INFO  Load project settings for component key: 'spring-boot-application'
16:50:25.428 INFO  Load project settings for component key: 'spring-boot-application' (done) | time=112ms
16:50:25.481 INFO  Load quality profiles
16:50:25.935 INFO  Load quality profiles (done) | time=455ms
16:50:25.952 INFO  Auto-configuring with CI 'Jenkins'
16:50:25.994 INFO  Load active rules
16:50:38.018 INFO  Load active rules (done) | time=12025ms
16:50:38.025 INFO  Load analysis cache
16:50:38.061 INFO  Load analysis cache (3.5 kB) | time=36ms
16:50:38.140 INFO  Preprocessing files...
16:50:38.469 INFO  4 languages detected in 80 preprocessed files
16:50:38.470 INFO  79 files ignored because of scm ignore settings
16:50:38.472 INFO  Loading plugins for detected languages
16:50:38.473 INFO  Load/download plugins
16:50:38.494 INFO  Load/download plugins (done) | time=21ms
16:50:38.804 INFO  Load project repositories
16:50:38.836 INFO  Load project repositories (done) | time=32ms
16:50:38.861 INFO  Indexing files...
16:50:38.861 INFO  Project configuration:
16:50:38.877 INFO  80 files indexed
16:50:38.878 INFO  Quality profile for docker: Sonar way
16:50:38.878 INFO  Quality profile for java: Sonar way
16:50:38.878 INFO  Quality profile for xml: Sonar way
16:50:38.879 INFO  Quality profile for yaml: Sonar way
16:50:38.879 INFO  ------------- Run sensors on module spring-boot-application
16:50:38.952 INFO  Load metrics repository
16:50:38.987 INFO  Load metrics repository (done) | time=35ms
16:50:40.510 INFO  Sensor JavaSensor [java]
16:50:40.534 INFO  Server-side caching is enabled. The Java analyzer will not try to leverage data from a previous analysis.
16:50:40.536 INFO  Using ECJ batch to parse 70 Main java source files with batch size 49 KB.
16:50:40.880 INFO  Starting batch processing.
16:50:41.517 INFO  The Java analyzer cannot skip unchanged files in this context. A full analysis is performed for all files.
16:50:43.852 INFO  100% analyzed
16:50:43.852 INFO  Batch processing: Done.
16:50:43.852 INFO  Did not optimize analysis for any files, performed a full analysis for all 70 files.
16:50:43.855 WARN  Dependencies/libraries were not provided for analysis of SOURCE files. The 'sonar.java.libraries' property is empty. Verify your configuration, as you might end up with less precise results.
16:50:43.858 WARN  Unresolved imports/types have been detected during analysis. Enable DEBUG mode to see them.
16:50:43.859 WARN  Use of preview features have been detected during analysis. Enable DEBUG mode to see them.
16:50:43.860 INFO  No "Test" source files to scan.
16:50:43.860 INFO  No "Generated" source files to scan.
16:50:43.860 INFO  Sensor JavaSensor [java] (done) | time=3350ms
16:50:43.861 INFO  Sensor SurefireSensor [java]
16:50:43.861 INFO  parsing [/var/lib/jenkins/workspace/groovy/target/surefire-reports]
16:50:43.999 INFO  Sensor SurefireSensor [java] (done) | time=138ms
16:50:44.000 INFO  Sensor XML Sensor [xml]
16:50:44.008 INFO  1 source file to be analyzed
16:50:44.354 INFO  1/1 source file has been analyzed
16:50:44.355 INFO  Sensor XML Sensor [xml] (done) | time=354ms
16:50:44.356 INFO  Sensor JaCoCo XML Report Importer [jacoco]
16:50:44.356 INFO  'sonar.coverage.jacoco.xmlReportPaths' is not defined. Using default locations: target/site/jacoco/jacoco.xml,target/site/jacoco-it/jacoco.xml,build/reports/jacoco/test/jacocoTestReport.xml
16:50:44.357 INFO  No report imported, no coverage information will be imported by JaCoCo XML Report Importer
16:50:44.357 INFO  Sensor JaCoCo XML Report Importer [jacoco] (done) | time=4ms
16:50:44.357 INFO  Sensor IaC CloudFormation Sensor [iac]
16:50:44.370 INFO  0 source files to be analyzed
16:50:44.387 INFO  0/0 source files have been analyzed
16:50:44.388 INFO  Sensor IaC CloudFormation Sensor [iac] (done) | time=30ms
16:50:44.388 INFO  Sensor IaC Kubernetes Sensor [iac]
16:50:44.560 INFO  2 source files to be analyzed
16:51:21.107 INFO  2/2 source files have been analyzed
16:51:21.107 INFO  Sensor IaC Kubernetes Sensor [iac] (done) | time=36720ms
16:51:21.108 INFO  Sensor Java Config Sensor [iac]
16:51:21.116 INFO  1 source file to be analyzed
16:51:21.241 INFO  1/1 source file has been analyzed
16:51:21.241 INFO  Sensor Java Config Sensor [iac] (done) | time=133ms
16:51:21.242 INFO  Sensor JavaScript inside YAML analysis [javascript]
16:51:21.254 INFO  No input files found for analysis
16:51:21.255 INFO  Hit the cache for 0 out of 0
16:51:21.255 INFO  Miss the cache for 0 out of 0
16:51:21.255 INFO  Sensor JavaScript inside YAML analysis [javascript] (done) | time=15ms
16:51:21.255 INFO  Sensor CSS Rules [javascript]
16:51:21.256 INFO  No CSS, PHP, HTML or VueJS files are found in the project. CSS analysis is skipped.
16:51:21.257 INFO  Sensor CSS Rules [javascript] (done) | time=1ms
16:51:21.257 INFO  Sensor IaC Docker Sensor [iac]
16:51:21.261 INFO  1 source file to be analyzed
16:50:45.058 INFO  1/1 source file has been analyzed
16:50:45.059 INFO  Sensor IaC Docker Sensor [iac] (done) | time=-36199ms
16:50:45.059 INFO  Sensor TextAndSecretsSensor [text]
16:50:45.059 INFO  Available processors: 8
16:50:45.060 INFO  Using 8 threads for analysis.
16:50:45.679 INFO  The property "sonar.tests" is not set. To improve the analysis accuracy, we categorize a file as a test file if any of the following is true:
  * The filename starts with "test"
  * The filename contains "test." or "tests."
  * Any directory in the file path is named: "doc", "docs", "test" or "tests"
  * Any directory in the file path has a name ending in "test" or "tests"

16:50:45.711 INFO  Using git CLI to retrieve untracked files
16:50:45.729 INFO  Analyzing language associated files and files included via "sonar.text.inclusions" that are tracked by git
16:50:45.755 INFO  76 source files to be analyzed
16:50:45.908 INFO  76/76 source files have been analyzed
16:50:45.909 INFO  Sensor TextAndSecretsSensor [text] (done) | time=851ms
16:50:45.917 INFO  ------------- Run sensors on project
16:50:45.974 INFO  Sensor Zero Coverage Sensor
16:50:45.997 INFO  Sensor Zero Coverage Sensor (done) | time=23ms
16:50:45.997 INFO  Sensor Java CPD Block Indexer
16:50:46.087 INFO  Sensor Java CPD Block Indexer (done) | time=90ms
16:50:46.112 INFO  CPD Executor 33 files had no CPD blocks
16:50:46.113 INFO  CPD Executor Calculating CPD for 37 files
16:50:46.141 INFO  CPD Executor CPD calculation finished (done) | time=28ms
16:50:46.156 INFO  SCM revision ID '2bc6b27e660190d38b9ca628de38866ae3caaf5e'
16:50:46.323 INFO  Analysis report generated in 147ms, dir size=392.9 kB
16:50:46.569 INFO  Analysis report compressed in 245ms, zip size=183.8 kB
16:50:46.667 INFO  Analysis report uploaded in 96ms
16:50:46.670 INFO  ANALYSIS SUCCESSFUL, you can find the results at: http://172.20.99.79:9000/dashboard?id=spring-boot-application
16:50:46.670 INFO  Note that you will be able to access the updated dashboard once the server has processed the submitted analysis report
16:50:46.670 INFO  More about the report processing at http://172.20.99.79:9000/api/ce/task?id=cbf4f667-8d08-42ba-b9de-94e84fae4eb9
16:50:46.702 INFO  Analysis total time: -14.-452 s
16:50:46.704 INFO  SonarScanner Engine completed successfully
16:50:47.058 INFO  EXECUTION SUCCESS
16:50:47.073 INFO  Total time: 26.244s
[Pipeline] }
[Pipeline] // withSonarQubeEnv
[Pipeline] }
[Pipeline] // script
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Quality Gate Status Check : Sonarqube)
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] withEnv
[Pipeline] {
[Pipeline] script
[Pipeline] {
[Pipeline] echo
Running Quality Gate Status Check : Sonarqube...
[Pipeline] waitForQualityGate
Checking status of SonarQube task 'cbf4f667-8d08-42ba-b9de-94e84fae4eb9' on server 'sonar'
SonarQube task 'cbf4f667-8d08-42ba-b9de-94e84fae4eb9' status is 'IN_PROGRESS'
SonarQube task 'cbf4f667-8d08-42ba-b9de-94e84fae4eb9' status is 'SUCCESS'
SonarQube task 'cbf4f667-8d08-42ba-b9de-94e84fae4eb9' completed. Quality gate is 'ERROR'
[Pipeline] }
[Pipeline] // script
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Maven Build : maven)
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] withEnv
[Pipeline] {
[Pipeline] script
[Pipeline] {
[Pipeline] echo
Running Maven Build : maven ...
[Pipeline] sh
+ mvn clean install
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------< com.foodapp:spring-food-app >---------------------
[INFO] Building spring-food-app 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.3.2:clean (default-clean) @ spring-food-app ---
[INFO] Deleting /var/lib/jenkins/workspace/groovy/target
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ spring-food-app ---
[INFO] Copying 1 resource from src/main/resources to target/classes
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.11.0:compile (default-compile) @ spring-food-app ---
[INFO] Changes detected - recompiling the module! :source
[INFO] Compiling 69 source files with javac [debug release 17] to target/classes
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ spring-food-app ---
[INFO] skip non existing resourceDirectory /var/lib/jenkins/workspace/groovy/src/test/resources
[INFO] 
[INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ spring-food-app ---
[INFO] Changes detected - recompiling the module! :dependency
[INFO] Compiling 1 source file with javac [debug release 17] to target/test-classes
[INFO] 
[INFO] --- surefire:3.1.2:test (default-test) @ spring-food-app ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.foodapp.springfoodapp.SpringFoodAppApplicationTests
16:51:24.557 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [com.foodapp.springfoodapp.SpringFoodAppApplicationTests]: SpringFoodAppApplicationTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
16:51:24.704 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.foodapp.springfoodapp.SpringFoodAppApplication for test class com.foodapp.springfoodapp.SpringFoodAppApplicationTests
16:52:01.320 [main] INFO org.springframework.boot.devtools.restart.RestartApplicationListener -- Restart disabled due to context in which it is running

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.0)

2024-10-09T16:51:25.424+05:30  INFO 4623 --- [spring-food-app] [           main] c.f.s.SpringFoodAppApplicationTests      : Starting SpringFoodAppApplicationTests using Java 17.0.12 with PID 4623 (started by jenkins in /var/lib/jenkins/workspace/groovy)
2024-10-09T16:51:25.426+05:30  INFO 4623 --- [spring-food-app] [           main] c.f.s.SpringFoodAppApplicationTests      : No active profile set, falling back to 1 default profile: "default"
2024-10-09T16:51:28.642+05:30  INFO 4623 --- [spring-food-app] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2024-10-09T16:51:28.758+05:30  INFO 4623 --- [spring-food-app] [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.3.1.Final
2024-10-09T16:51:28.830+05:30  INFO 4623 --- [spring-food-app] [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2024-10-09T16:51:29.257+05:30  INFO 4623 --- [spring-food-app] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2024-10-09T16:51:34.086+05:30  INFO 4623 --- [spring-food-app] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@53079ae6
2024-10-09T16:51:34.094+05:30  INFO 4623 --- [spring-food-app] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2024-10-09T16:51:34.782+05:30  WARN 4623 --- [spring-food-app] [           main] org.hibernate.orm.deprecation            : HHH90000025: MySQLDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2024-10-09T16:51:36.358+05:30  INFO 4623 --- [spring-food-app] [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2024-10-09T16:51:51.189+05:30 TRACE 4623 --- [spring-food-app] [           main] eGlobalAuthenticationAutowiredConfigurer : Eagerly initializing {appConfig=com.foodapp.springfoodapp.security.config.AppConfig$$SpringCGLIB$$0@645b67d6}
2024-10-09T16:51:52.696+05:30  INFO 4623 --- [spring-food-app] [           main] o.s.s.web.DefaultSecurityFilterChain     : Will secure any request with [org.springframework.security.web.session.DisableEncodeUrlFilter@5935ade6, org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter@72187492, org.springframework.security.web.context.SecurityContextHolderFilter@5ac3d009, org.springframework.security.web.header.HeaderWriterFilter@77ef7b2b, org.springframework.security.web.authentication.logout.LogoutFilter@4e9b66ab, com.foodapp.springfoodapp.security.config.JwtTokenValidator@3ba55a6b, org.springframework.security.web.savedrequest.RequestCacheAwareFilter@353b5d86, org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter@7f7eeaaf, org.springframework.security.web.authentication.AnonymousAuthenticationFilter@5b20024b, org.springframework.security.web.session.SessionManagementFilter@7f5a5ef3, org.springframework.security.web.access.ExceptionTranslationFilter@3520d2db, org.springframework.security.web.access.intercept.AuthorizationFilter@22edca96]
2024-10-09T16:51:54.145+05:30  INFO 4623 --- [spring-food-app] [           main] c.f.s.SpringFoodAppApplicationTests      : Started SpringFoodAppApplicationTests in -7.155 seconds (process running for 30.758)
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 34.63 s -- in com.foodapp.springfoodapp.SpringFoodAppApplicationTests
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- jar:3.3.0:jar (default-jar) @ spring-food-app ---
[INFO] Building jar: /var/lib/jenkins/workspace/groovy/target/spring-image.jar
[INFO] 
[INFO] --- spring-boot:3.2.0:repackage (repackage) @ spring-food-app ---
[INFO] Replacing main artifact /var/lib/jenkins/workspace/groovy/target/spring-image.jar with repackaged archive, adding nested dependencies in BOOT-INF/.
[INFO] The original artifact has been renamed to /var/lib/jenkins/workspace/groovy/target/spring-image.jar.original
[INFO] 
[INFO] --- install:3.1.1:install (default-install) @ spring-food-app ---
[INFO] Installing /var/lib/jenkins/workspace/groovy/pom.xml to /var/lib/jenkins/.m2/repository/com/foodapp/spring-food-app/0.0.1-SNAPSHOT/spring-food-app-0.0.1-SNAPSHOT.pom
[INFO] Installing /var/lib/jenkins/workspace/groovy/target/spring-image.jar to /var/lib/jenkins/.m2/repository/com/foodapp/spring-food-app/0.0.1-SNAPSHOT/spring-food-app-0.0.1-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  47.911 s
[INFO] Finished at: 2024-10-09T16:52:04+05:30
[INFO] ------------------------------------------------------------------------
[Pipeline] }
[Pipeline] // script
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Docker Image Build )
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] withEnv
[Pipeline] {
[Pipeline] script
[Pipeline] {
[Pipeline] echo
Running Docker Image Build...
[Pipeline] sh
+ docker image build -t srinu641/spring-image .
failed to fetch metadata: fork/exec /usr/local/lib/docker/cli-plugins/docker-buildx: no such file or directory

DEPRECATED: The legacy builder is deprecated and will be removed in a future release.
            Install the buildx component to build images with BuildKit:
            https://docs.docker.com/go/buildx/

Sending build context to Docker daemon  72.66MB
Step 1/5 : FROM openjdk:17-jdk-slim
 ---> 37cb44321d04
Step 2/5 : WORKDIR /app
 ---> Using cache
 ---> e073a4d0e9f4
Step 3/5 : COPY target/spring-image.jar /app/spring-image.jar
 ---> e82ca69793c4
Step 4/5 : EXPOSE 8998
 ---> Running in ab1b7996d4df
 ---> Removed intermediate container ab1b7996d4df
 ---> d2847258cef2
Step 5/5 : ENTRYPOINT ["java", "-jar", "/app/spring-image.jar"]
 ---> Running in ceaa950c6059
 ---> Removed intermediate container ceaa950c6059
 ---> 79c6774c545c
Successfully built 79c6774c545c
Successfully tagged srinu641/spring-image:latest
+ docker image tag srinu641/spring-image srinu641/spring-image:1.0
+ docker image tag srinu641/spring-image srinu641/spring-image:latest
[Pipeline] }
[Pipeline] // script
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Docker Image Scan: trivy )
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] withEnv
[Pipeline] {
[Pipeline] script
[Pipeline] {
[Pipeline] echo
Running Docker Image Scan With trivy...
[Pipeline] sh
+ trivy image srinu641/spring-image:latest
2024-10-09T16:52:46+05:30	INFO	[vuln] Vulnerability scanning is enabled
2024-10-09T16:52:46+05:30	INFO	[secret] Secret scanning is enabled
2024-10-09T16:52:46+05:30	INFO	[secret] If your scanning is slow, please try '--scanners vuln' to disable secret scanning
2024-10-09T16:52:46+05:30	INFO	[secret] Please see also https://aquasecurity.github.io/trivy/v0.56/docs/scanner/secret#recommendation for faster secret detection
2024-10-09T16:52:18+05:30	INFO	Detected OS	family="debian" version="11.3"
2024-10-09T16:52:18+05:30	INFO	[debian] Detecting vulnerabilities...	os_version="11" pkg_num=100
2024-10-09T16:52:18+05:30	INFO	Number of language-specific files	num=1
2024-10-09T16:52:18+05:30	INFO	[jar] Detecting vulnerabilities...
2024-10-09T16:52:18+05:30	WARN	Using severities from other vendors for some vulnerabilities. Read https://aquasecurity.github.io/trivy/v0.56/docs/scanner/vulnerability#severity-selection for details.
2024-10-09T16:52:18+05:30	INFO	Table result includes only package filenames. Use '--format json' option to get the full path to the package file.
+ cat scan.txt

For OSS Maintainers: VEX Notice
--------------------------------
If you're an OSS maintainer and Trivy has detected vulnerabilities in your project that you believe are not actually exploitable, consider issuing a VEX (Vulnerability Exploitability eXchange) statement.
VEX allows you to communicate the actual status of vulnerabilities in your project, improving security transparency and reducing false positives for your users.
Learn more and start using VEX: https://aquasecurity.github.io/trivy/v0.56/docs/supply-chain/vex/repo#publishing-vex-documents

To disable this notice, set the TRIVY_DISABLE_VEX_NOTICE environment variable.


srinu641/spring-image:latest (debian 11.3)
==========================================
Total: 219 (UNKNOWN: 0, LOW: 75, MEDIUM: 69, HIGH: 60, CRITICAL: 15)

┌────────────────────┬─────────────────────┬──────────┬──────────────┬─────────────────────────┬─────────────────────────┬──────────────────────────────────────────────────────────────┐
│      Library       │    Vulnerability    │ Severity │    Status    │    Installed Version    │      Fixed Version      │                            Title                             │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ apt                │ CVE-2011-3374       │ LOW      │ affected     │ 2.2.4                   │                         │ It was found that apt-key in apt, all versions, do not       │
│                    │                     │          │              │                         │                         │ correctly...                                                 │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2011-3374                    │
├────────────────────┼─────────────────────┼──────────┤              ├─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ bash               │ CVE-2022-3715       │ HIGH     │              │ 5.1-2+b3                │                         │ bash: a heap-buffer-overflow in valid_parameter_transform    │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-3715                    │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ TEMP-0841856-B18BAF │ LOW      │              │                         │                         │ [Privilege escalation possible to other user than root]      │
│                    │                     │          │              │                         │                         │ https://security-tracker.debian.org/tracker/TEMP-0841856-B1- │
│                    │                     │          │              │                         │                         │ 8BAF                                                         │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ bsdutils           │ CVE-2024-28085      │ HIGH     │ fixed        │ 1:2.36.1-8+deb11u1      │ 2.36.1-8+deb11u2        │ util-linux: CVE-2024-28085: wall: escape sequence injection  │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-28085                   │
│                    ├─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-0563       │ LOW      │ affected     │                         │                         │ util-linux: partial disclosure of arbitrary files in chfn    │
│                    │                     │          │              │                         │                         │ and chsh when compiled...                                    │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-0563                    │
├────────────────────┼─────────────────────┤          ├──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ coreutils          │ CVE-2016-2781       │          │ will_not_fix │ 8.32-4+b1               │                         │ coreutils: Non-privileged session can escape to the parent   │
│                    │                     │          │              │                         │                         │ session in chroot                                            │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2016-2781                    │
│                    ├─────────────────────┤          ├──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2017-18018      │          │ affected     │                         │                         │ coreutils: race condition vulnerability in chown and chgrp   │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2017-18018                   │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ dpkg               │ CVE-2022-1664       │ CRITICAL │ fixed        │ 1.20.9                  │ 1.20.10                 │ Dpkg::Source::Archive in dpkg, the Debian package management │
│                    │                     │          │              │                         │                         │ system, b ...                                                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-1664                    │
├────────────────────┼─────────────────────┼──────────┤              ├─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ e2fsprogs          │ CVE-2022-1304       │ HIGH     │              │ 1.46.2-2                │ 1.46.2-2+deb11u1        │ e2fsprogs: out-of-bounds read/write via crafted filesystem   │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-1304                    │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ gcc-10-base        │ CVE-2023-4039       │ MEDIUM   │ affected     │ 10.2.1-6                │                         │ gcc: -fstack-protector fails to guard dynamic stack          │
│                    │                     │          │              │                         │                         │ allocations on ARM64                                         │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-4039                    │
├────────────────────┤                     │          │              ├─────────────────────────┼─────────────────────────┤                                                              │
│ gcc-9-base         │                     │          │              │ 9.3.0-22                │                         │                                                              │
│                    │                     │          │              │                         │                         │                                                              │
│                    │                     │          │              │                         │                         │                                                              │
├────────────────────┼─────────────────────┤          ├──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ gpgv               │ CVE-2022-34903      │          │ fixed        │ 2.2.27-2+deb11u1        │ 2.2.27-2+deb11u2        │ gpg: Signature spoofing via status line injection            │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-34903                   │
│                    ├─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-3219       │ LOW      │ affected     │                         │                         │ gnupg: denial of service issue (resource consumption) using  │
│                    │                     │          │              │                         │                         │ compressed packets                                           │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-3219                    │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ gzip               │ CVE-2022-1271       │ HIGH     │ fixed        │ 1.10-4                  │ 1.10-4+deb11u1          │ gzip: arbitrary-file-write vulnerability                     │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-1271                    │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libapt-pkg6.0      │ CVE-2011-3374       │ LOW      │ affected     │ 2.2.4                   │                         │ It was found that apt-key in apt, all versions, do not       │
│                    │                     │          │              │                         │                         │ correctly...                                                 │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2011-3374                    │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libblkid1          │ CVE-2024-28085      │ HIGH     │ fixed        │ 2.36.1-8+deb11u1        │ 2.36.1-8+deb11u2        │ util-linux: CVE-2024-28085: wall: escape sequence injection  │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-28085                   │
│                    ├─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-0563       │ LOW      │ affected     │                         │                         │ util-linux: partial disclosure of arbitrary files in chfn    │
│                    │                     │          │              │                         │                         │ and chsh when compiled...                                    │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-0563                    │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libc-bin           │ CVE-2021-3999       │ HIGH     │ fixed        │ 2.31-13+deb11u3         │ 2.31-13+deb11u4         │ glibc: Off-by-one buffer overflow/underflow in getcwd()      │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2021-3999                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-4911       │          │              │                         │ 2.31-13+deb11u7         │ glibc: buffer overflow in ld.so leading to privilege         │
│                    │                     │          │              │                         │                         │ escalation                                                   │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-4911                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-2961       │          │              │                         │ 2.31-13+deb11u9         │ glibc: Out of bounds write in iconv may lead to remote       │
│                    │                     │          │              │                         │                         │ code...                                                      │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-2961                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-33599      │          │              │                         │ 2.31-13+deb11u10        │ glibc: stack-based buffer overflow in netgroup cache         │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-33599                   │
│                    ├─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-4806       │ MEDIUM   │ affected     │                         │                         │ glibc: potential use-after-free in getaddrinfo()             │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-4806                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-4813       │          │              │                         │                         │ glibc: potential use-after-free in gaih_inet()               │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-4813                    │
│                    ├─────────────────────┤          ├──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-33600      │          │ fixed        │                         │ 2.31-13+deb11u10        │ glibc: null pointer dereferences after failed netgroup cache │
│                    │                     │          │              │                         │                         │ insertion                                                    │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-33600                   │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-33601      │          │              │                         │                         │ glibc: netgroup cache may terminate daemon on memory         │
│                    │                     │          │              │                         │                         │ allocation failure                                           │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-33601                   │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-33602      │          │              │                         │                         │ glibc: netgroup cache assumes NSS callback uses in-buffer    │
│                    │                     │          │              │                         │                         │ strings                                                      │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-33602                   │
│                    ├─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2010-4756       │ LOW      │ affected     │                         │                         │ glibc: glob implementation can cause excessive CPU and       │
│                    │                     │          │              │                         │                         │ memory consumption due to...                                 │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2010-4756                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2018-20796      │          │              │                         │                         │ glibc: uncontrolled recursion in function                    │
│                    │                     │          │              │                         │                         │ check_dst_limits_calc_pos_1 in posix/regexec.c               │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2018-20796                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2019-1010022    │          │              │                         │                         │ glibc: stack guard protection bypass                         │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2019-1010022                 │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2019-1010023    │          │              │                         │                         │ glibc: running ldd on malicious ELF leads to code execution  │
│                    │                     │          │              │                         │                         │ because of...                                                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2019-1010023                 │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2019-1010024    │          │              │                         │                         │ glibc: ASLR bypass using cache of thread stack and heap      │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2019-1010024                 │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2019-1010025    │          │              │                         │                         │ glibc: information disclosure of heap addresses of           │
│                    │                     │          │              │                         │                         │ pthread_created thread                                       │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2019-1010025                 │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2019-9192       │          │              │                         │                         │ glibc: uncontrolled recursion in function                    │
│                    │                     │          │              │                         │                         │ check_dst_limits_calc_pos_1 in posix/regexec.c               │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2019-9192                    │
├────────────────────┼─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libc6              │ CVE-2021-3999       │ HIGH     │ fixed        │                         │ 2.31-13+deb11u4         │ glibc: Off-by-one buffer overflow/underflow in getcwd()      │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2021-3999                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-4911       │          │              │                         │ 2.31-13+deb11u7         │ glibc: buffer overflow in ld.so leading to privilege         │
│                    │                     │          │              │                         │                         │ escalation                                                   │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-4911                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-2961       │          │              │                         │ 2.31-13+deb11u9         │ glibc: Out of bounds write in iconv may lead to remote       │
│                    │                     │          │              │                         │                         │ code...                                                      │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-2961                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-33599      │          │              │                         │ 2.31-13+deb11u10        │ glibc: stack-based buffer overflow in netgroup cache         │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-33599                   │
│                    ├─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-4806       │ MEDIUM   │ affected     │                         │                         │ glibc: potential use-after-free in getaddrinfo()             │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-4806                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-4813       │          │              │                         │                         │ glibc: potential use-after-free in gaih_inet()               │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-4813                    │
│                    ├─────────────────────┤          ├──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-33600      │          │ fixed        │                         │ 2.31-13+deb11u10        │ glibc: null pointer dereferences after failed netgroup cache │
│                    │                     │          │              │                         │                         │ insertion                                                    │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-33600                   │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-33601      │          │              │                         │                         │ glibc: netgroup cache may terminate daemon on memory         │
│                    │                     │          │              │                         │                         │ allocation failure                                           │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-33601                   │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-33602      │          │              │                         │                         │ glibc: netgroup cache assumes NSS callback uses in-buffer    │
│                    │                     │          │              │                         │                         │ strings                                                      │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-33602                   │
│                    ├─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2010-4756       │ LOW      │ affected     │                         │                         │ glibc: glob implementation can cause excessive CPU and       │
│                    │                     │          │              │                         │                         │ memory consumption due to...                                 │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2010-4756                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2018-20796      │          │              │                         │                         │ glibc: uncontrolled recursion in function                    │
│                    │                     │          │              │                         │                         │ check_dst_limits_calc_pos_1 in posix/regexec.c               │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2018-20796                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2019-1010022    │          │              │                         │                         │ glibc: stack guard protection bypass                         │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2019-1010022                 │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2019-1010023    │          │              │                         │                         │ glibc: running ldd on malicious ELF leads to code execution  │
│                    │                     │          │              │                         │                         │ because of...                                                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2019-1010023                 │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2019-1010024    │          │              │                         │                         │ glibc: ASLR bypass using cache of thread stack and heap      │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2019-1010024                 │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2019-1010025    │          │              │                         │                         │ glibc: information disclosure of heap addresses of           │
│                    │                     │          │              │                         │                         │ pthread_created thread                                       │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2019-1010025                 │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2019-9192       │          │              │                         │                         │ glibc: uncontrolled recursion in function                    │
│                    │                     │          │              │                         │                         │ check_dst_limits_calc_pos_1 in posix/regexec.c               │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2019-9192                    │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libcom-err2        │ CVE-2022-1304       │ HIGH     │ fixed        │ 1.46.2-2                │ 1.46.2-2+deb11u1        │ e2fsprogs: out-of-bounds read/write via crafted filesystem   │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-1304                    │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libdb5.3           │ CVE-2019-8457       │ CRITICAL │ will_not_fix │ 5.3.28+dfsg1-0.8        │                         │ sqlite: heap out-of-bound read in function rtreenode()       │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2019-8457                    │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libext2fs2         │ CVE-2022-1304       │ HIGH     │ fixed        │ 1.46.2-2                │ 1.46.2-2+deb11u1        │ e2fsprogs: out-of-bounds read/write via crafted filesystem   │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-1304                    │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libgcc-s1          │ CVE-2023-4039       │ MEDIUM   │ affected     │ 10.2.1-6                │                         │ gcc: -fstack-protector fails to guard dynamic stack          │
│                    │                     │          │              │                         │                         │ allocations on ARM64                                         │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-4039                    │
├────────────────────┼─────────────────────┼──────────┤              ├─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libgcrypt20        │ CVE-2021-33560      │ HIGH     │              │ 1.8.7-6                 │                         │ libgcrypt: mishandles ElGamal encryption because it lacks    │
│                    │                     │          │              │                         │                         │ exponent blinding to address a...                            │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2021-33560                   │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-2236       │ MEDIUM   │              │                         │                         │ libgcrypt: vulnerable to Marvin Attack                       │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-2236                    │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2018-6829       │ LOW      │              │                         │                         │ libgcrypt: ElGamal implementation doesn't have semantic      │
│                    │                     │          │              │                         │                         │ security due to incorrectly encoded plaintexts...            │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2018-6829                    │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libgnutls30        │ CVE-2022-2509       │ HIGH     │ fixed        │ 3.7.1-5                 │ 3.7.1-5+deb11u2         │ gnutls: Double free during gnutls_pkcs7_verify               │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-2509                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-0361       │          │              │                         │ 3.7.1-5+deb11u3         │ gnutls: timing side-channel in the TLS RSA key exchange code │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-0361                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-0553       │          │              │                         │ 3.7.1-5+deb11u5         │ gnutls: incomplete fix for CVE-2023-5981                     │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-0553                    │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-0567       │          │              │                         │                         │ gnutls: rejects certificate chain with distributed trust     │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-0567                    │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2021-4209       │ MEDIUM   │              │                         │ 3.7.1-5+deb11u1         │ GnuTLS: Null pointer dereference in MD_UPDATE                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2021-4209                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-5981       │          │              │                         │ 3.7.1-5+deb11u4         │ gnutls: timing side-channel in the RSA-PSK authentication    │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-5981                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-28834      │          │              │                         │ 3.7.1-5+deb11u6         │ gnutls: vulnerable to Minerva side-channel information leak  │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-28834                   │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-28835      │          │              │                         │                         │ gnutls: potential crash during chain building/verification   │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-28835                   │
│                    ├─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2011-3389       │ LOW      │ affected     │                         │                         │ HTTPS: block-wise chosen-plaintext attack against SSL/TLS    │
│                    │                     │          │              │                         │                         │ (BEAST)                                                      │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2011-3389                    │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libgssapi-krb5-2   │ CVE-2024-37371      │ CRITICAL │ fixed        │ 1.18.3-6+deb11u1        │ 1.18.3-6+deb11u5        │ krb5: GSS message token handling                             │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-37371                   │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-42898      │ HIGH     │              │                         │ 1.18.3-6+deb11u3        │ krb5: integer overflow vulnerabilities in PAC parsing        │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-42898                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-37370      │          │              │                         │ 1.18.3-6+deb11u5        │ krb5: GSS message token handling                             │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-37370                   │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-36054      │ MEDIUM   │              │                         │ 1.18.3-6+deb11u4        │ krb5: Denial of service through freeing uninitialized        │
│                    │                     │          │              │                         │                         │ pointer                                                      │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-36054                   │
│                    ├─────────────────────┤          ├──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-26458      │          │ affected     │                         │                         │ krb5: Memory leak at /krb5/src/lib/rpc/pmap_rmt.c            │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-26458                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-26461      │          │              │                         │                         │ krb5: Memory leak at /krb5/src/lib/gssapi/krb5/k5sealv3.c    │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-26461                   │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2018-5709       │ LOW      │              │                         │                         │ krb5: integer overflow in dbentry->n_key_data in             │
│                    │                     │          │              │                         │                         │ kadmin/dbutil/dump.c                                         │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2018-5709                    │
├────────────────────┼─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libk5crypto3       │ CVE-2024-37371      │ CRITICAL │ fixed        │                         │ 1.18.3-6+deb11u5        │ krb5: GSS message token handling                             │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-37371                   │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-42898      │ HIGH     │              │                         │ 1.18.3-6+deb11u3        │ krb5: integer overflow vulnerabilities in PAC parsing        │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-42898                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-37370      │          │              │                         │ 1.18.3-6+deb11u5        │ krb5: GSS message token handling                             │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-37370                   │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-36054      │ MEDIUM   │              │                         │ 1.18.3-6+deb11u4        │ krb5: Denial of service through freeing uninitialized        │
│                    │                     │          │              │                         │                         │ pointer                                                      │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-36054                   │
│                    ├─────────────────────┤          ├──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-26458      │          │ affected     │                         │                         │ krb5: Memory leak at /krb5/src/lib/rpc/pmap_rmt.c            │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-26458                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-26461      │          │              │                         │                         │ krb5: Memory leak at /krb5/src/lib/gssapi/krb5/k5sealv3.c    │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-26461                   │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2018-5709       │ LOW      │              │                         │                         │ krb5: integer overflow in dbentry->n_key_data in             │
│                    │                     │          │              │                         │                         │ kadmin/dbutil/dump.c                                         │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2018-5709                    │
├────────────────────┼─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libkrb5-3          │ CVE-2024-37371      │ CRITICAL │ fixed        │                         │ 1.18.3-6+deb11u5        │ krb5: GSS message token handling                             │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-37371                   │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-42898      │ HIGH     │              │                         │ 1.18.3-6+deb11u3        │ krb5: integer overflow vulnerabilities in PAC parsing        │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-42898                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-37370      │          │              │                         │ 1.18.3-6+deb11u5        │ krb5: GSS message token handling                             │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-37370                   │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-36054      │ MEDIUM   │              │                         │ 1.18.3-6+deb11u4        │ krb5: Denial of service through freeing uninitialized        │
│                    │                     │          │              │                         │                         │ pointer                                                      │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-36054                   │
│                    ├─────────────────────┤          ├──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-26458      │          │ affected     │                         │                         │ krb5: Memory leak at /krb5/src/lib/rpc/pmap_rmt.c            │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-26458                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-26461      │          │              │                         │                         │ krb5: Memory leak at /krb5/src/lib/gssapi/krb5/k5sealv3.c    │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-26461                   │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2018-5709       │ LOW      │              │                         │                         │ krb5: integer overflow in dbentry->n_key_data in             │
│                    │                     │          │              │                         │                         │ kadmin/dbutil/dump.c                                         │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2018-5709                    │
├────────────────────┼─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libkrb5support0    │ CVE-2024-37371      │ CRITICAL │ fixed        │                         │ 1.18.3-6+deb11u5        │ krb5: GSS message token handling                             │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-37371                   │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-42898      │ HIGH     │              │                         │ 1.18.3-6+deb11u3        │ krb5: integer overflow vulnerabilities in PAC parsing        │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-42898                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-37370      │          │              │                         │ 1.18.3-6+deb11u5        │ krb5: GSS message token handling                             │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-37370                   │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-36054      │ MEDIUM   │              │                         │ 1.18.3-6+deb11u4        │ krb5: Denial of service through freeing uninitialized        │
│                    │                     │          │              │                         │                         │ pointer                                                      │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-36054                   │
│                    ├─────────────────────┤          ├──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-26458      │          │ affected     │                         │                         │ krb5: Memory leak at /krb5/src/lib/rpc/pmap_rmt.c            │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-26458                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-26461      │          │              │                         │                         │ krb5: Memory leak at /krb5/src/lib/gssapi/krb5/k5sealv3.c    │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-26461                   │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2018-5709       │ LOW      │              │                         │                         │ krb5: integer overflow in dbentry->n_key_data in             │
│                    │                     │          │              │                         │                         │ kadmin/dbutil/dump.c                                         │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2018-5709                    │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ liblzma5           │ CVE-2022-1271       │ HIGH     │ fixed        │ 5.2.5-2                 │ 5.2.5-2.1~deb11u1       │ gzip: arbitrary-file-write vulnerability                     │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-1271                    │
├────────────────────┼─────────────────────┤          │              ├─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libmount1          │ CVE-2024-28085      │          │              │ 2.36.1-8+deb11u1        │ 2.36.1-8+deb11u2        │ util-linux: CVE-2024-28085: wall: escape sequence injection  │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-28085                   │
│                    ├─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-0563       │ LOW      │ affected     │                         │                         │ util-linux: partial disclosure of arbitrary files in chfn    │
│                    │                     │          │              │                         │                         │ and chsh when compiled...                                    │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-0563                    │
├────────────────────┼─────────────────────┼──────────┤              ├─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libpam-modules     │ CVE-2024-22365      │ MEDIUM   │              │ 1.4.0-9+deb11u1         │                         │ pam: allowing unprivileged user to block another user        │
│                    │                     │          │              │                         │                         │ namespace                                                    │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-22365                   │
├────────────────────┤                     │          │              │                         ├─────────────────────────┤                                                              │
│ libpam-modules-bin │                     │          │              │                         │                         │                                                              │
│                    │                     │          │              │                         │                         │                                                              │
│                    │                     │          │              │                         │                         │                                                              │
├────────────────────┤                     │          │              │                         ├─────────────────────────┤                                                              │
│ libpam-runtime     │                     │          │              │                         │                         │                                                              │
│                    │                     │          │              │                         │                         │                                                              │
│                    │                     │          │              │                         │                         │                                                              │
├────────────────────┤                     │          │              │                         ├─────────────────────────┤                                                              │
│ libpam0g           │                     │          │              │                         │                         │                                                              │
│                    │                     │          │              │                         │                         │                                                              │
│                    │                     │          │              │                         │                         │                                                              │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libpcre2-8-0       │ CVE-2022-1586       │ CRITICAL │ fixed        │ 10.36-2                 │ 10.36-2+deb11u1         │ pcre2: Out-of-bounds read in compile_xclass_matchingpath in  │
│                    │                     │          │              │                         │                         │ pcre2_jit_compile.c                                          │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-1586                    │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-1587       │          │              │                         │                         │ pcre2: Out-of-bounds read in get_recurse_data_length in      │
│                    │                     │          │              │                         │                         │ pcre2_jit_compile.c                                          │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-1587                    │
│                    ├─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-41409      │ LOW      │ affected     │                         │                         │ pcre2: negative repeat value in a pcre2test subject line     │
│                    │                     │          │              │                         │                         │ leads to inifinite...                                        │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-41409                   │
├────────────────────┼─────────────────────┤          │              ├─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libpcre3           │ CVE-2017-11164      │          │              │ 2:8.39-13               │                         │ pcre: OP_KETRMAX feature in the match function in            │
│                    │                     │          │              │                         │                         │ pcre_exec.c                                                  │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2017-11164                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2017-16231      │          │              │                         │                         │ pcre: self-recursive call in match() in pcre_exec.c leads to │
│                    │                     │          │              │                         │                         │ denial of service...                                         │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2017-16231                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2017-7245       │          │              │                         │                         │ pcre: stack-based buffer overflow write in                   │
│                    │                     │          │              │                         │                         │ pcre32_copy_substring                                        │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2017-7245                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2017-7246       │          │              │                         │                         │ pcre: stack-based buffer overflow write in                   │
│                    │                     │          │              │                         │                         │ pcre32_copy_substring                                        │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2017-7246                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2019-20838      │          │              │                         │                         │ pcre: Buffer over-read in JIT when UTF is disabled and \X    │
│                    │                     │          │              │                         │                         │ or...                                                        │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2019-20838                   │
├────────────────────┼─────────────────────┤          │              ├─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libsepol1          │ CVE-2021-36084      │          │              │ 3.1-1                   │                         │ libsepol: use-after-free in __cil_verify_classperms()        │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2021-36084                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2021-36085      │          │              │                         │                         │ libsepol: use-after-free in __cil_verify_classperms()        │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2021-36085                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2021-36086      │          │              │                         │                         │ libsepol: use-after-free in cil_reset_classpermission()      │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2021-36086                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2021-36087      │          │              │                         │                         │ libsepol: heap-based buffer overflow in ebitmap_match_any()  │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2021-36087                   │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libsmartcols1      │ CVE-2024-28085      │ HIGH     │ fixed        │ 2.36.1-8+deb11u1        │ 2.36.1-8+deb11u2        │ util-linux: CVE-2024-28085: wall: escape sequence injection  │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-28085                   │
│                    ├─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-0563       │ LOW      │ affected     │                         │                         │ util-linux: partial disclosure of arbitrary files in chfn    │
│                    │                     │          │              │                         │                         │ and chsh when compiled...                                    │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-0563                    │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libss2             │ CVE-2022-1304       │ HIGH     │ fixed        │ 1.46.2-2                │ 1.46.2-2+deb11u1        │ e2fsprogs: out-of-bounds read/write via crafted filesystem   │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-1304                    │
├────────────────────┼─────────────────────┼──────────┤              ├─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libssl1.1          │ CVE-2022-1292       │ CRITICAL │              │ 1.1.1n-0+deb11u1        │ 1.1.1n-0+deb11u2        │ openssl: c_rehash script allows command injection            │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-1292                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-2068       │          │              │                         │ 1.1.1n-0+deb11u3        │ openssl: the c_rehash script allows command injection        │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-2068                    │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-4450       │ HIGH     │              │                         │ 1.1.1n-0+deb11u4        │ openssl: double free after calling PEM_read_bio_ex           │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-4450                    │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-0215       │          │              │                         │                         │ openssl: use-after-free following BIO_new_NDEF               │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-0215                    │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-0286       │          │              │                         │                         │ openssl: X.400 address type confusion in X.509 GeneralName   │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-0286                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-0464       │          │              │                         │ 1.1.1n-0+deb11u5        │ openssl: Denial of service by excessive resource usage in    │
│                    │                     │          │              │                         │                         │ verifying X509 policy...                                     │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-0464                    │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-2097       │ MEDIUM   │              │                         │ 1.1.1n-0+deb11u4        │ openssl: AES OCB fails to encrypt some bytes                 │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-2097                    │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-4304       │          │              │                         │                         │ openssl: timing attack in RSA Decryption implementation      │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-4304                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-0465       │          │              │                         │ 1.1.1n-0+deb11u5        │ openssl: Invalid certificate policies in leaf certificates   │
│                    │                     │          │              │                         │                         │ are silently ignored                                         │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-0465                    │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-0466       │          │              │                         │                         │ openssl: Certificate policy check not enabled                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-0466                    │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-2650       │          │              │                         │                         │ openssl: Possible DoS translating ASN.1 object identifiers   │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-2650                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-3446       │          │              │                         │ 1.1.1v-0~deb11u1        │ openssl: Excessive time spent checking DH keys and           │
│                    │                     │          │              │                         │                         │ parameters                                                   │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-3446                    │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-3817       │          │              │                         │                         │ OpenSSL: Excessive time spent checking DH q parameter value  │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-3817                    │
│                    ├─────────────────────┤          ├──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-5678       │          │ affected     │                         │                         │ openssl: Generating excessively long X9.42 DH keys or        │
│                    │                     │          │              │                         │                         │ checking excessively long X9.42...                           │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-5678                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-0727       │          │              │                         │                         │ openssl: denial of service via null dereference              │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-0727                    │
│                    ├─────────────────────┤          ├──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-4741       │          │ fix_deferred │                         │                         │ openssl: Use After Free with SSL_free_buffers                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-4741                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-5535       │          │              │                         │                         │ openssl: SSL_select_next_proto buffer overread               │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-5535                    │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-2511       │ LOW      │              │                         │                         │ openssl: Unbounded memory growth with session handling in    │
│                    │                     │          │              │                         │                         │ TLSv1.3                                                      │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-2511                    │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libstdc++6         │ CVE-2023-4039       │ MEDIUM   │ affected     │ 10.2.1-6                │                         │ gcc: -fstack-protector fails to guard dynamic stack          │
│                    │                     │          │              │                         │                         │ allocations on ARM64                                         │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-4039                    │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libsystemd0        │ CVE-2023-50387      │ HIGH     │ fixed        │ 247.3-7                 │ 247.3-7+deb11u6         │ bind9: KeyTrap - Extreme CPU consumption in DNSSEC validator │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-50387                   │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-50868      │          │              │                         │                         │ bind9: Preparing an NSEC3 closest encloser proof can exhaust │
│                    │                     │          │              │                         │                         │ CPU resources                                                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-50868                   │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-3821       │ MEDIUM   │              │                         │ 247.3-7+deb11u2         │ systemd: buffer overrun in format_timespan() function        │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-3821                    │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-4415       │          │              │                         │                         │ systemd: local information leak due to systemd-coredump not  │
│                    │                     │          │              │                         │                         │ respecting fs.suid_dumpable kernel setting...                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-4415                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-7008       │          │              │                         │ 247.3-7+deb11u6         │ systemd-resolved: Unsigned name response in signed zone is   │
│                    │                     │          │              │                         │                         │ not refused when DNSSEC=yes...                               │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-7008                    │
│                    ├─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2013-4392       │ LOW      │ affected     │                         │                         │ systemd: TOCTOU race condition when updating file            │
│                    │                     │          │              │                         │                         │ permissions and SELinux security contexts...                 │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2013-4392                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2020-13529      │          │              │                         │                         │ systemd: DHCP FORCERENEW authentication not implemented can  │
│                    │                     │          │              │                         │                         │ cause a system running the...                                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2020-13529                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-31437      │          │              │                         │                         │ An issue was discovered in systemd 253. An attacker can      │
│                    │                     │          │              │                         │                         │ modify a...                                                  │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-31437                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-31438      │          │              │                         │                         │ An issue was discovered in systemd 253. An attacker can      │
│                    │                     │          │              │                         │                         │ truncate a...                                                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-31438                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-31439      │          │              │                         │                         │ An issue was discovered in systemd 253. An attacker can      │
│                    │                     │          │              │                         │                         │ modify the...                                                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-31439                   │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libtasn1-6         │ CVE-2021-46848      │ CRITICAL │ fixed        │ 4.16.0-2                │ 4.16.0-2+deb11u1        │ libtasn1: Out-of-bound access in ETYPE_OK                    │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2021-46848                   │
├────────────────────┼─────────────────────┼──────────┤              ├─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libtinfo6          │ CVE-2022-29458      │ HIGH     │              │ 6.2+20201114-2          │ 6.2+20201114-2+deb11u1  │ ncurses: segfaulting OOB read                                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-29458                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-29491      │          │              │                         │ 6.2+20201114-2+deb11u2  │ ncurses: Local users can trigger security-relevant memory    │
│                    │                     │          │              │                         │                         │ corruption via malformed data                                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-29491                   │
│                    ├─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-50495      │ MEDIUM   │ affected     │                         │                         │ ncurses: segmentation fault via _nc_wrap_entry()             │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-50495                   │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-45918      │ LOW      │              │                         │                         │ ncurses: NULL pointer dereference in tgetstr in              │
│                    │                     │          │              │                         │                         │ tinfo/lib_termcap.c                                          │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-45918                   │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libtirpc-common    │ CVE-2021-46828      │ HIGH     │ fixed        │ 1.3.1-1                 │ 1.3.1-1+deb11u1         │ libtirpc: DoS vulnerability with lots of connections         │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2021-46828                   │
├────────────────────┤                     │          │              │                         │                         │                                                              │
│ libtirpc3          │                     │          │              │                         │                         │                                                              │
│                    │                     │          │              │                         │                         │                                                              │
├────────────────────┼─────────────────────┤          │              ├─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libudev1           │ CVE-2023-50387      │          │              │ 247.3-7                 │ 247.3-7+deb11u6         │ bind9: KeyTrap - Extreme CPU consumption in DNSSEC validator │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-50387                   │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-50868      │          │              │                         │                         │ bind9: Preparing an NSEC3 closest encloser proof can exhaust │
│                    │                     │          │              │                         │                         │ CPU resources                                                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-50868                   │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-3821       │ MEDIUM   │              │                         │ 247.3-7+deb11u2         │ systemd: buffer overrun in format_timespan() function        │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-3821                    │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-4415       │          │              │                         │                         │ systemd: local information leak due to systemd-coredump not  │
│                    │                     │          │              │                         │                         │ respecting fs.suid_dumpable kernel setting...                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-4415                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-7008       │          │              │                         │ 247.3-7+deb11u6         │ systemd-resolved: Unsigned name response in signed zone is   │
│                    │                     │          │              │                         │                         │ not refused when DNSSEC=yes...                               │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-7008                    │
│                    ├─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2013-4392       │ LOW      │ affected     │                         │                         │ systemd: TOCTOU race condition when updating file            │
│                    │                     │          │              │                         │                         │ permissions and SELinux security contexts...                 │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2013-4392                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2020-13529      │          │              │                         │                         │ systemd: DHCP FORCERENEW authentication not implemented can  │
│                    │                     │          │              │                         │                         │ cause a system running the...                                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2020-13529                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-31437      │          │              │                         │                         │ An issue was discovered in systemd 253. An attacker can      │
│                    │                     │          │              │                         │                         │ modify a...                                                  │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-31437                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-31438      │          │              │                         │                         │ An issue was discovered in systemd 253. An attacker can      │
│                    │                     │          │              │                         │                         │ truncate a...                                                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-31438                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-31439      │          │              │                         │                         │ An issue was discovered in systemd 253. An attacker can      │
│                    │                     │          │              │                         │                         │ modify the...                                                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-31439                   │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libuuid1           │ CVE-2024-28085      │ HIGH     │ fixed        │ 2.36.1-8+deb11u1        │ 2.36.1-8+deb11u2        │ util-linux: CVE-2024-28085: wall: escape sequence injection  │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-28085                   │
│                    ├─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-0563       │ LOW      │ affected     │                         │                         │ util-linux: partial disclosure of arbitrary files in chfn    │
│                    │                     │          │              │                         │                         │ and chsh when compiled...                                    │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-0563                    │
├────────────────────┼─────────────────────┼──────────┤              ├─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ libzstd1           │ CVE-2022-4899       │ HIGH     │              │ 1.4.8+dfsg-2.1          │                         │ zstd: mysql: buffer overrun in util.c                        │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-4899                    │
├────────────────────┼─────────────────────┼──────────┤              ├─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ login              │ CVE-2023-4641       │ MEDIUM   │              │ 1:4.8.1-1               │                         │ shadow-utils: possible password leak during passwd(1) change │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-4641                    │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2007-5686       │ LOW      │              │                         │                         │ initscripts in rPath Linux 1 sets insecure permissions for   │
│                    │                     │          │              │                         │                         │ the /var/lo ......                                           │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2007-5686                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2013-4235       │          │              │                         │                         │ shadow-utils: TOCTOU race conditions by copying and removing │
│                    │                     │          │              │                         │                         │ directory trees                                              │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2013-4235                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2019-19882      │          │              │                         │                         │ shadow-utils: local users can obtain root access because     │
│                    │                     │          │              │                         │                         │ setuid programs are misconfigured...                         │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2019-19882                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-29383      │          │              │                         │                         │ shadow: Improper input validation in shadow-utils package    │
│                    │                     │          │              │                         │                         │ utility chfn                                                 │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-29383                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ TEMP-0628843-DBAD28 │          │              │                         │                         │ [more related to CVE-2005-4890]                              │
│                    │                     │          │              │                         │                         │ https://security-tracker.debian.org/tracker/TEMP-0628843-DB- │
│                    │                     │          │              │                         │                         │ AD28                                                         │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ logsave            │ CVE-2022-1304       │ HIGH     │ fixed        │ 1.46.2-2                │ 1.46.2-2+deb11u1        │ e2fsprogs: out-of-bounds read/write via crafted filesystem   │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-1304                    │
├────────────────────┼─────────────────────┤          │              ├─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ mount              │ CVE-2024-28085      │          │              │ 2.36.1-8+deb11u1        │ 2.36.1-8+deb11u2        │ util-linux: CVE-2024-28085: wall: escape sequence injection  │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-28085                   │
│                    ├─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-0563       │ LOW      │ affected     │                         │                         │ util-linux: partial disclosure of arbitrary files in chfn    │
│                    │                     │          │              │                         │                         │ and chsh when compiled...                                    │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-0563                    │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ ncurses-base       │ CVE-2022-29458      │ HIGH     │ fixed        │ 6.2+20201114-2          │ 6.2+20201114-2+deb11u1  │ ncurses: segfaulting OOB read                                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-29458                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-29491      │          │              │                         │ 6.2+20201114-2+deb11u2  │ ncurses: Local users can trigger security-relevant memory    │
│                    │                     │          │              │                         │                         │ corruption via malformed data                                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-29491                   │
│                    ├─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-50495      │ MEDIUM   │ affected     │                         │                         │ ncurses: segmentation fault via _nc_wrap_entry()             │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-50495                   │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-45918      │ LOW      │              │                         │                         │ ncurses: NULL pointer dereference in tgetstr in              │
│                    │                     │          │              │                         │                         │ tinfo/lib_termcap.c                                          │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-45918                   │
├────────────────────┼─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ ncurses-bin        │ CVE-2022-29458      │ HIGH     │ fixed        │                         │ 6.2+20201114-2+deb11u1  │ ncurses: segfaulting OOB read                                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-29458                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-29491      │          │              │                         │ 6.2+20201114-2+deb11u2  │ ncurses: Local users can trigger security-relevant memory    │
│                    │                     │          │              │                         │                         │ corruption via malformed data                                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-29491                   │
│                    ├─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-50495      │ MEDIUM   │ affected     │                         │                         │ ncurses: segmentation fault via _nc_wrap_entry()             │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-50495                   │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-45918      │ LOW      │              │                         │                         │ ncurses: NULL pointer dereference in tgetstr in              │
│                    │                     │          │              │                         │                         │ tinfo/lib_termcap.c                                          │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-45918                   │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ openssl            │ CVE-2022-1292       │ CRITICAL │ fixed        │ 1.1.1n-0+deb11u1        │ 1.1.1n-0+deb11u2        │ openssl: c_rehash script allows command injection            │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-1292                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-2068       │          │              │                         │ 1.1.1n-0+deb11u3        │ openssl: the c_rehash script allows command injection        │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-2068                    │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-4450       │ HIGH     │              │                         │ 1.1.1n-0+deb11u4        │ openssl: double free after calling PEM_read_bio_ex           │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-4450                    │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-0215       │          │              │                         │                         │ openssl: use-after-free following BIO_new_NDEF               │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-0215                    │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-0286       │          │              │                         │                         │ openssl: X.400 address type confusion in X.509 GeneralName   │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-0286                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-0464       │          │              │                         │ 1.1.1n-0+deb11u5        │ openssl: Denial of service by excessive resource usage in    │
│                    │                     │          │              │                         │                         │ verifying X509 policy...                                     │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-0464                    │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-2097       │ MEDIUM   │              │                         │ 1.1.1n-0+deb11u4        │ openssl: AES OCB fails to encrypt some bytes                 │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-2097                    │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-4304       │          │              │                         │                         │ openssl: timing attack in RSA Decryption implementation      │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-4304                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-0465       │          │              │                         │ 1.1.1n-0+deb11u5        │ openssl: Invalid certificate policies in leaf certificates   │
│                    │                     │          │              │                         │                         │ are silently ignored                                         │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-0465                    │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-0466       │          │              │                         │                         │ openssl: Certificate policy check not enabled                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-0466                    │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-2650       │          │              │                         │                         │ openssl: Possible DoS translating ASN.1 object identifiers   │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-2650                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-3446       │          │              │                         │ 1.1.1v-0~deb11u1        │ openssl: Excessive time spent checking DH keys and           │
│                    │                     │          │              │                         │                         │ parameters                                                   │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-3446                    │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-3817       │          │              │                         │                         │ OpenSSL: Excessive time spent checking DH q parameter value  │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-3817                    │
│                    ├─────────────────────┤          ├──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-5678       │          │ affected     │                         │                         │ openssl: Generating excessively long X9.42 DH keys or        │
│                    │                     │          │              │                         │                         │ checking excessively long X9.42...                           │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-5678                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-0727       │          │              │                         │                         │ openssl: denial of service via null dereference              │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-0727                    │
│                    ├─────────────────────┤          ├──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-4741       │          │ fix_deferred │                         │                         │ openssl: Use After Free with SSL_free_buffers                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-4741                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-5535       │          │              │                         │                         │ openssl: SSL_select_next_proto buffer overread               │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-5535                    │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2024-2511       │ LOW      │              │                         │                         │ openssl: Unbounded memory growth with session handling in    │
│                    │                     │          │              │                         │                         │ TLSv1.3                                                      │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-2511                    │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ passwd             │ CVE-2023-4641       │ MEDIUM   │ affected     │ 1:4.8.1-1               │                         │ shadow-utils: possible password leak during passwd(1) change │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-4641                    │
│                    ├─────────────────────┼──────────┤              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2007-5686       │ LOW      │              │                         │                         │ initscripts in rPath Linux 1 sets insecure permissions for   │
│                    │                     │          │              │                         │                         │ the /var/lo ......                                           │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2007-5686                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2013-4235       │          │              │                         │                         │ shadow-utils: TOCTOU race conditions by copying and removing │
│                    │                     │          │              │                         │                         │ directory trees                                              │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2013-4235                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2019-19882      │          │              │                         │                         │ shadow-utils: local users can obtain root access because     │
│                    │                     │          │              │                         │                         │ setuid programs are misconfigured...                         │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2019-19882                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-29383      │          │              │                         │                         │ shadow: Improper input validation in shadow-utils package    │
│                    │                     │          │              │                         │                         │ utility chfn                                                 │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-29383                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ TEMP-0628843-DBAD28 │          │              │                         │                         │ [more related to CVE-2005-4890]                              │
│                    │                     │          │              │                         │                         │ https://security-tracker.debian.org/tracker/TEMP-0628843-DB- │
│                    │                     │          │              │                         │                         │ AD28                                                         │
├────────────────────┼─────────────────────┼──────────┤              ├─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ perl-base          │ CVE-2020-16156      │ HIGH     │              │ 5.32.1-4+deb11u2        │                         │ perl-CPAN: Bypass of verification of signatures in CHECKSUMS │
│                    │                     │          │              │                         │                         │ files                                                        │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2020-16156                   │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-31484      │          │              │                         │                         │ perl: CPAN.pm does not verify TLS certificates when          │
│                    │                     │          │              │                         │                         │ downloading distributions over HTTPS...                      │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-31484                   │
│                    ├─────────────────────┤          ├──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-47038      │          │ fixed        │                         │ 5.32.1-4+deb11u3        │ perl: Write past buffer end via illegal user-defined Unicode │
│                    │                     │          │              │                         │                         │ property                                                     │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-47038                   │
│                    ├─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2011-4116       │ LOW      │ affected     │                         │                         │ perl: File:: Temp insecure temporary file handling           │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2011-4116                    │
│                    ├─────────────────────┤          │              │                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-31486      │          │              │                         │                         │ http-tiny: insecure TLS cert default                         │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-31486                   │
├────────────────────┼─────────────────────┤          │              ├─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ sysvinit-utils     │ TEMP-0517018-A83CE6 │          │              │ 2.96-7+deb11u1          │                         │ [sysvinit: no-root option in expert installer exposes        │
│                    │                     │          │              │                         │                         │ locally exploitable security flaw]                           │
│                    │                     │          │              │                         │                         │ https://security-tracker.debian.org/tracker/TEMP-0517018-A8- │
│                    │                     │          │              │                         │                         │ 3CE6                                                         │
├────────────────────┼─────────────────────┤          │              ├─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ tar                │ CVE-2005-2541       │          │              │ 1.34+dfsg-1             │                         │ tar: does not properly warn the user when extracting setuid  │
│                    │                     │          │              │                         │                         │ or setgid...                                                 │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2005-2541                    │
│                    ├─────────────────────┤          ├──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-48303      │          │ fixed        │                         │ 1.34+dfsg-1+deb11u1     │ tar: heap buffer overflow at from_header() in list.c via     │
│                    │                     │          │              │                         │                         │ specially crafted checksum...                                │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-48303                   │
│                    ├─────────────────────┤          │              │                         │                         ├──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-39804      │          │              │                         │                         │ tar: Incorrectly handled extension attributes in PAX         │
│                    │                     │          │              │                         │                         │ archives can lead to a...                                    │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-39804                   │
│                    ├─────────────────────┤          ├──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ TEMP-0290435-0B57B5 │          │ affected     │                         │                         │ [tar's rmt command may have undesired side effects]          │
│                    │                     │          │              │                         │                         │ https://security-tracker.debian.org/tracker/TEMP-0290435-0B- │
│                    │                     │          │              │                         │                         │ 57B5                                                         │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ util-linux         │ CVE-2024-28085      │ HIGH     │ fixed        │ 2.36.1-8+deb11u1        │ 2.36.1-8+deb11u2        │ util-linux: CVE-2024-28085: wall: escape sequence injection  │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2024-28085                   │
│                    ├─────────────────────┼──────────┼──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2022-0563       │ LOW      │ affected     │                         │                         │ util-linux: partial disclosure of arbitrary files in chfn    │
│                    │                     │          │              │                         │                         │ and chsh when compiled...                                    │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-0563                    │
├────────────────────┼─────────────────────┼──────────┼──────────────┼─────────────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────────┤
│ zlib1g             │ CVE-2022-37434      │ CRITICAL │ fixed        │ 1:1.2.11.dfsg-2+deb11u1 │ 1:1.2.11.dfsg-2+deb11u2 │ zlib: heap-based buffer over-read and overflow in inflate()  │
│                    │                     │          │              │                         │                         │ in inflate.c via a...                                        │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2022-37434                   │
│                    ├─────────────────────┤          ├──────────────┤                         ├─────────────────────────┼──────────────────────────────────────────────────────────────┤
│                    │ CVE-2023-45853      │          │ will_not_fix │                         │                         │ zlib: integer overflow and resultant heap-based buffer       │
│                    │                     │          │              │                         │                         │ overflow in zipOpenNewFileInZip4_6                           │
│                    │                     │          │              │                         │                         │ https://avd.aquasec.com/nvd/cve-2023-45853                   │
└────────────────────┴─────────────────────┴──────────┴──────────────┴─────────────────────────┴─────────────────────────┴──────────────────────────────────────────────────────────────┘

Java (jar)
==========
Total: 17 (UNKNOWN: 0, LOW: 1, MEDIUM: 6, HIGH: 10, CRITICAL: 0)

┌──────────────────────────────────────────────────────────────┬────────────────┬──────────┬────────┬───────────────────┬─────────────────────────────────────┬──────────────────────────────────────────────────────────────┐
│                           Library                            │ Vulnerability  │ Severity │ Status │ Installed Version │            Fixed Version            │                            Title                             │
├──────────────────────────────────────────────────────────────┼────────────────┼──────────┼────────┼───────────────────┼─────────────────────────────────────┼──────────────────────────────────────────────────────────────┤
│ ch.qos.logback:logback-classic (spring-image.jar)            │ CVE-2023-6378  │ HIGH     │ fixed  │ 1.4.11            │ 1.3.12, 1.4.12, 1.2.13              │ logback: serialization vulnerability in logback receiver     │
│                                                              │                │          │        │                   │                                     │ https://avd.aquasec.com/nvd/cve-2023-6378                    │
├──────────────────────────────────────────────────────────────┤                │          │        │                   │                                     │                                                              │
│ ch.qos.logback:logback-core (spring-image.jar)               │                │          │        │                   │                                     │                                                              │
│                                                              │                │          │        │                   │                                     │                                                              │
├──────────────────────────────────────────────────────────────┼────────────────┼──────────┤        ├───────────────────┼─────────────────────────────────────┼──────────────────────────────────────────────────────────────┤
│ com.google.guava:guava (spring-image.jar)                    │ CVE-2018-10237 │ MEDIUM   │        │ 20.0              │ 24.1.1-android                      │ guava: Unbounded memory allocation in AtomicDoubleArray and  │
│                                                              │                │          │        │                   │                                     │ CompoundOrdering classes allow remote attackers...           │
│                                                              │                │          │        │                   │                                     │ https://avd.aquasec.com/nvd/cve-2018-10237                   │
│                                                              ├────────────────┤          │        │                   ├─────────────────────────────────────┼──────────────────────────────────────────────────────────────┤
│                                                              │ CVE-2023-2976  │          │        │                   │ 32.0.0-android                      │ guava: insecure temporary directory creation                 │
│                                                              │                │          │        │                   │                                     │ https://avd.aquasec.com/nvd/cve-2023-2976                    │
│                                                              ├────────────────┼──────────┤        │                   │                                     ├──────────────────────────────────────────────────────────────┤
│                                                              │ CVE-2020-8908  │ LOW      │        │                   │                                     │ guava: local information disclosure via temporary directory  │
│                                                              │                │          │        │                   │                                     │ created with unsafe permissions                              │
│                                                              │                │          │        │                   │                                     │ https://avd.aquasec.com/nvd/cve-2020-8908                    │
├──────────────────────────────────────────────────────────────┼────────────────┼──────────┤        ├───────────────────┼─────────────────────────────────────┼──────────────────────────────────────────────────────────────┤
│ com.mysql:mysql-connector-j (spring-image.jar)               │ CVE-2023-22102 │ HIGH     │        │ 8.1.0             │ 8.2.0                               │ mysql-connector-java: Connector/J unspecified vulnerability  │
│                                                              │                │          │        │                   │                                     │ (CPU October 2023)                                           │
│                                                              │                │          │        │                   │                                     │ https://avd.aquasec.com/nvd/cve-2023-22102                   │
├──────────────────────────────────────────────────────────────┼────────────────┼──────────┤        ├───────────────────┼─────────────────────────────────────┼──────────────────────────────────────────────────────────────┤
│ com.nimbusds:nimbus-jose-jwt (spring-image.jar)              │ CVE-2023-52428 │ MEDIUM   │        │ 9.24.4            │ 9.37.2                              │ nimbus-jose-jwt: large JWE p2c header value causes Denial of │
│                                                              │                │          │        │                   │                                     │ Service                                                      │
│                                                              │                │          │        │                   │                                     │ https://avd.aquasec.com/nvd/cve-2023-52428                   │
├──────────────────────────────────────────────────────────────┼────────────────┼──────────┤        ├───────────────────┼─────────────────────────────────────┼──────────────────────────────────────────────────────────────┤
│ org.apache.tomcat.embed:tomcat-embed-core (spring-image.jar) │ CVE-2024-34750 │ HIGH     │        │ 10.1.16           │ 11.0.0-M21, 10.1.25, 9.0.90         │ tomcat: Improper Handling of Exceptional Conditions          │
│                                                              │                │          │        │                   │                                     │ https://avd.aquasec.com/nvd/cve-2024-34750                   │
│                                                              ├────────────────┼──────────┤        │                   ├─────────────────────────────────────┼──────────────────────────────────────────────────────────────┤
│                                                              │ CVE-2024-24549 │ MEDIUM   │        │                   │ 8.5.99, 9.0.86, 10.1.19, 11.0.0-M17 │ Tomcat: HTTP/2 header handling DoS                           │
│                                                              │                │          │        │                   │                                     │ https://avd.aquasec.com/nvd/cve-2024-24549                   │
├──────────────────────────────────────────────────────────────┼────────────────┤          │        │                   ├─────────────────────────────────────┼──────────────────────────────────────────────────────────────┤
│ org.apache.tomcat.embed:tomcat-embed-websocket               │ CVE-2024-23672 │          │        │                   │ 11.0.0-M17, 10.1.19, 9.0.86, 8.5.99 │ Tomcat: WebSocket DoS with incomplete closing handshake      │
│ (spring-image.jar)                                           │                │          │        │                   │                                     │ https://avd.aquasec.com/nvd/cve-2024-23672                   │
├──────────────────────────────────────────────────────────────┼────────────────┼──────────┤        ├───────────────────┼─────────────────────────────────────┼──────────────────────────────────────────────────────────────┤
│ org.springframework.security:spring-security-core            │ CVE-2024-22234 │ HIGH     │        │ 6.2.0             │ 6.1.7, 6.2.2                        │ spring-security: Broken Access Control in Spring Security    │
│ (spring-image.jar)                                           │                │          │        │                   │                                     │ With Direct Use of isFullyAuthenticated...                   │
│                                                              │                │          │        │                   │                                     │ https://avd.aquasec.com/nvd/cve-2024-22234                   │
│                                                              ├────────────────┤          │        │                   ├─────────────────────────────────────┼──────────────────────────────────────────────────────────────┤
│                                                              │ CVE-2024-22257 │          │        │                   │ 5.7.12, 5.8.11, 6.1.8, 6.2.3        │ spring-security: Broken Access Control With Direct Use of    │
│                                                              │                │          │        │                   │                                     │ AuthenticatedVoter                                           │
│                                                              │                │          │        │                   │                                     │ https://avd.aquasec.com/nvd/cve-2024-22257                   │
├──────────────────────────────────────────────────────────────┼────────────────┤          │        ├───────────────────┼─────────────────────────────────────┼──────────────────────────────────────────────────────────────┤
│ org.springframework:spring-web (spring-image.jar)            │ CVE-2024-22243 │          │        │ 6.1.1             │ 6.1.4, 6.0.17, 5.3.32               │ springframework: URL Parsing with Host Validation            │
│                                                              │                │          │        │                   │                                     │ https://avd.aquasec.com/nvd/cve-2024-22243                   │
│                                                              ├────────────────┤          │        │                   ├─────────────────────────────────────┼──────────────────────────────────────────────────────────────┤
│                                                              │ CVE-2024-22259 │          │        │                   │ 6.1.5, 6.0.18, 5.3.33               │ springframework: URL Parsing with Host Validation            │
│                                                              │                │          │        │                   │                                     │ https://avd.aquasec.com/nvd/cve-2024-22259                   │
│                                                              ├────────────────┤          │        │                   ├─────────────────────────────────────┼──────────────────────────────────────────────────────────────┤
│                                                              │ CVE-2024-22262 │          │        │                   │ 5.3.34, 6.0.19, 6.1.6               │ springframework: URL Parsing with Host Validation            │
│                                                              │                │          │        │                   │                                     │ https://avd.aquasec.com/nvd/cve-2024-22262                   │
│                                                              ├────────────────┼──────────┤        │                   ├─────────────────────────────────────┼──────────────────────────────────────────────────────────────┤
│                                                              │ CVE-2024-38809 │ MEDIUM   │        │                   │ 5.3.38, 6.0.23, 6.1.12              │ org.springframework:spring-web: Spring Framework DoS via     │
│                                                              │                │          │        │                   │                                     │ conditional HTTP request                                     │
│                                                              │                │          │        │                   │                                     │ https://avd.aquasec.com/nvd/cve-2024-38809                   │
├──────────────────────────────────────────────────────────────┼────────────────┼──────────┤        │                   ├─────────────────────────────────────┼──────────────────────────────────────────────────────────────┤
│ org.springframework:spring-webmvc (spring-image.jar)         │ CVE-2024-38816 │ HIGH     │        │                   │ 6.1.13, 6.0.24, 5.3.40              │ spring-webmvc: Path Traversal Vulnerability in Spring        │
│                                                              │                │          │        │                   │                                     │ Applications Using RouterFunctions and FileSystemResource    │
│                                                              │                │          │        │                   │                                     │ https://avd.aquasec.com/nvd/cve-2024-38816                   │
└──────────────────────────────────────────────────────────────┴────────────────┴──────────┴────────┴───────────────────┴─────────────────────────────────────┴──────────────────────────────────────────────────────────────┘
[Pipeline] }
[Pipeline] // script
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Docker Image Push : DockerHub )
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] withEnv
[Pipeline] {
[Pipeline] script
[Pipeline] {
[Pipeline] echo
Running Docker Image Push : DockerHub...
[Pipeline] withCredentials
Masking supported pattern matches of $srinu1234
[Pipeline] {
[Pipeline] sh
Warning: A secret was passed to "sh" using Groovy String interpolation, which is insecure.
		 Affected argument(s) used the following variable(s): [****]
		 See https://jenkins.io/redirect/groovy-string-interpolation for details.
+ docker login -u dnsrinu143@gmail.com -p ****
WARNING! Using --password via the CLI is insecure. Use --password-stdin.
WARNING! Your password will be stored unencrypted in /var/lib/jenkins/.docker/config.json.
Configure a credential helper to remove this warning. See
https://docs.docker.com/engine/reference/commandline/login/#credential-stores

Login Succeeded
[Pipeline] }
[Pipeline] // withCredentials
[Pipeline] sh
+ docker image push srinu641/spring-image:1.0
The push refers to repository [docker.io/srinu641/spring-image]
b09e658b281c: Preparing
8dd4e94e2d3c: Preparing
6be690267e47: Preparing
13a34b6fff78: Preparing
9c1b6dd6c1e6: Preparing
6be690267e47: Layer already exists
8dd4e94e2d3c: Layer already exists
9c1b6dd6c1e6: Layer already exists
13a34b6fff78: Layer already exists
b09e658b281c: Pushed
1.0: digest: sha256:6c04e98aa7c8d603370682e9cac0f08d7fc7645663ba7f26d317d6ca6954b74c size: 1371
[Pipeline] sh
+ docker image push srinu641/spring-image:latest
The push refers to repository [docker.io/srinu641/spring-image]
b09e658b281c: Preparing
8dd4e94e2d3c: Preparing
6be690267e47: Preparing
13a34b6fff78: Preparing
9c1b6dd6c1e6: Preparing
8dd4e94e2d3c: Layer already exists
6be690267e47: Layer already exists
9c1b6dd6c1e6: Layer already exists
b09e658b281c: Layer already exists
13a34b6fff78: Layer already exists
latest: digest: sha256:6c04e98aa7c8d603370682e9cac0f08d7fc7645663ba7f26d317d6ca6954b74c size: 1371
[Pipeline] }
[Pipeline] // script
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // stage
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // node
[Pipeline] End of Pipeline
Finished: SUCCESS
