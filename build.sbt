import scala.sys.process.*
ThisBuild / scalaVersion := "3.3.4"

scalacOptions += "-deprecation"
Test / fork := true
Test / javaOptions ++= Seq(
  "-Xmx4G"
)
enablePlugins(AssemblyPlugin)
Compile / mainClass := Some("ulisse.Main")
assembly / assemblyMergeStrategy := {
  case PathList("META-INF", _*) => MergeStrategy.discard
  case _                        => MergeStrategy.first
}
assembly / assemblyJarName := "ulisse.jar"

lazy val root = (project in file("."))
  .settings(
    name := "pps-23-ulisse",
    libraryDependencies ++= Seq(
      "com.formdev"             % "flatlaf"           % "3.5.4",
      "com.formdev"             % "flatlaf-extras"    % "3.5.4",
      "org.typelevel"          %% "cats-core"         % "2.12.0",
      "org.typelevel"          %% "cats-effect"       % "3.5.4",
      "org.scala-lang.modules" %% "scala-swing"       % "3.0.0",
      "org.slf4j"               % "slf4j-simple"      % "2.0.13",
      "org.scalatestplus"      %% "mockito-5-10"      % "3.2.18.0" % Test,
      "org.scalatest"          %% "scalatest"         % "3.2.19"   % Test,
      "io.cucumber"            %% "cucumber-scala"    % "8.25.1"   % Test,
      "com.tngtech.archunit"    % "archunit"          % "1.3.0"    % Test,
      "org.junit.jupiter"       % "junit-jupiter-api" % "5.10.3"   % Test
    ),
  )
