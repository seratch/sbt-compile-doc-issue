```
$ sbt
[info] Loading project definition from /Users/kazuhirosera/github/oss/simple-java-soruce-generator/project
[info] Updating {file:/Users/kazuhirosera/github/oss/simple-java-soruce-generator/project/}simple-java-soruce-generator-build...
[info] Resolving org.fusesource.jansi#jansi;1.4 ...
[info] Done updating.
[info] Compiling 1 Scala source to /Users/kazuhirosera/github/oss/simple-java-soruce-generator/project/target/scala-2.10/sbt-0.13/classes...
[info] Set current project to root (in build file:/Users/kazuhirosera/github/oss/simple-java-soruce-generator/)

> doc
XXX
[info] Updating {file:/Users/kazuhirosera/github/oss/simple-java-soruce-generator/}root...
[info] Resolving jline#jline;2.14.4 ...
[info] Done updating.
[info] Main Scala API documentation to /Users/kazuhirosera/github/oss/simple-java-soruce-generator/target/scala-2.12/api...
[error] /Users/kazuhirosera/github/oss/simple-java-soruce-generator/src/main/java/sample/App.java:3: App is already defined as object App
[error] public class App {
[error]              ^
[info] No documentation generated with unsuccessful compiler run
[error] one error found
[error] (compile:doc) Scaladoc generation failed
[error] Total time: 2 s, completed Aug 19, 2017 1:30:34 AM


> publishLocal
XXX
[info] Packaging /Users/kazuhirosera/github/oss/simple-java-soruce-generator/target/scala-2.12/root_2.12-0.1-SNAPSHOT-sources.jar ...
[info] Wrote /Users/kazuhirosera/github/oss/simple-java-soruce-generator/target/scala-2.12/root_2.12-0.1-SNAPSHOT.pom
[info] :: delivering :: com.example#root_2.12;0.1-SNAPSHOT :: 0.1-SNAPSHOT :: integration :: Sat Aug 19 01:30:39 JST 2017
[info] Done packaging.
[info] Compiling 1 Scala source and 2 Java sources to /Users/kazuhirosera/github/oss/simple-java-soruce-generator/target/scala-2.12/classes...
[info] Main Scala API documentation to /Users/kazuhirosera/github/oss/simple-java-soruce-generator/target/scala-2.12/api...
[info] 	delivering ivy file to /Users/kazuhirosera/github/oss/simple-java-soruce-generator/target/scala-2.12/ivy-0.1-SNAPSHOT.xml
[error] /Users/kazuhirosera/github/oss/simple-java-soruce-generator/src/main/java/sample/App.java:3: App is already defined as object App
[error] public class App {
[error]              ^
[info] No documentation generated with unsuccessful compiler run
[error] one error found
[info] Packaging /Users/kazuhirosera/github/oss/simple-java-soruce-generator/target/scala-2.12/root_2.12-0.1-SNAPSHOT.jar ...
[info] Done packaging.
[error] (compile:doc) Scaladoc generation failed
[error] Total time: 3 s, completed Aug 19, 2017 1:30:41 AM


> compile
XXX
[success] Total time: 0 s, completed Aug 19, 2017 1:30:44 AM


> test
XXX
[success] Total time: 5 s, completed Aug 19, 2017 1:30:51 AM


> package
XXX
[success] Total time: 0 s, completed Aug 19, 2017 1:30:55 AM
>
```
