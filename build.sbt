import bintray.Keys._

lazy val commonSettings = Seq(
  version in ThisBuild := "0.0.1",
  organization in ThisBuild := "com.github.tsandall"
)

lazy val root = (project in file("."))
  .settings(commonSettings ++ bintrayPublishSettings: _*)
  .settings(
    sbtPlugin := true,
    name := "tsandall-plugin-exp",
    description := "experimenting with sbt plugins",
    licenses += ("Apache 2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html")),
    publishMavenStyle := false,
    repository in bintray := "sbt-plugins",
    bintrayOrganization in bintray := None
  )
