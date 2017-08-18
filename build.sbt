lazy val root = (project in file("."))
  .settings(
    organization := "com.example",
    scalaVersion := "2.12.3"
  )
  .enablePlugins(JavaCodeGenPlugin)
