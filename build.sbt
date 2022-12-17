ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.1"

lazy val root = (project in file("."))
  .settings(
    name := "ScalaPlugin",
    idePackagePrefix := Some("me.zdziszkee.scalaplugin")
  )

Compile / unmanagedJars := ( (baseDirectory.value / "/Server/libraries") ** "*.jar").classpath
Compile/packageBin/artifactPath := (baseDirectory.value / "/Server/plugins/ScalaPlugin.jar")

artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
  "ScalaPlugin.jar"
}