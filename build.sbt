ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.1"

lazy val root = (project in file("."))
  .settings(
    name := "ScalaPlugin",
    idePackagePrefix := Some("me.zdziszkee.scalaplugin")
  )

Compile / unmanagedJars := ( (baseDirectory.value / "/Server/libraries") ** "*.jar").classpath
assemblyJarName in assembly := "ScalaPlugin.jar"
//assembly/packageBin/artifactPath := (baseDirectory.value / "/Server/plugins")
assembly / assemblyOutputPath := (baseDirectory.value / "/Server/plugins/ScalaPlugin.jar")

ThisBuild / assemblyShadeRules := Seq(
  ShadeRule.keep("scala**").inAll,
  ShadeRule.keep("me.zdziszkee**").inAll
)
assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}
lazy val app = (project in file("ScalaPlugin"))
  .settings(
    assembly / logLevel := Level.Debug
    // more settings here ...
  )
