name := "browserless"

enablePlugins(ScalaJSBundlerPlugin)

scalaVersion := "2.11.12"

scalaJSUseMainModuleInitializer := true

// Adds a dependency on the uuid npm package
npmDependencies in Compile += "uuid" -> "3.1.0"

// Adds a dependency on scalatest
libraryDependencies += "org.scalatest" %%% "scalatest" % "3.1.0-SNAP9" % Test

ivyLoggingLevel in ThisBuild := UpdateLogging.Quiet
