import sbt._
import Keys._

object JavaCodeGenPlugin extends AutoPlugin {

  object autoImport {
    val sampleGen = taskKey[Seq[File]]("The task which generates source code")
    lazy val baseSettings: Seq[Def.Setting[_]] = Seq(sampleGen := sampleGenTask.value)
  }

  import autoImport._

  override def trigger  = noTrigger
  override def requires = sbt.plugins.JvmPlugin

  override val projectSettings: Seq[Def.Setting[_]] = {
    inConfig(Compile)(baseSettings) ++ Seq(
      compileOrder := CompileOrder.JavaThenScala,
      sourceGenerators in Compile += sampleGen in Compile//,
      // To avoid errors while running `sbt compile:doc` for `sbt publish` like "XXX is already defined as XXX"
      // The following settings are an inappropriate work around by bypassing to generate docs.
      // https://stackoverflow.com/questions/21461798/how-to-disable-scaladoc-generation-in-dist-task-in-play-2-2-x-using-project-bui
      //sources in (Compile, doc) := Seq.empty,
      //publishArtifact in (Compile, packageDoc) := false
    )
  }

  lazy val sampleGenTask: Def.Initialize[Task[Seq[File]]] = {
    Def.task {
      println("XXX")
      Seq(new File(new File("src/main/java/sample/App.java").getAbsolutePath))
    }
  }
}
