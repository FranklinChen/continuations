import sbt._
import sbt.Keys._

object ContinuationsBuild extends Build {

  lazy val continuations = Project(
    id = "continuations",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "continuations",
      organization := "umich",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.0",
      scalacOptions += "-P:continuations:enable",
      autoCompilerPlugins := true,
      libraryDependencies ++= Seq(
        compilerPlugin("org.scala-lang.plugins" % "continuations" % "2.10.0"),
        "org.scala-lang" % "scala-swing" % "2.10.0"
      )
    )
  )
}
