package com.github.tsandall
import sbt._

object Plugin extends sbt.Plugin {
    import Keys._

    val defaultSettings = Seq(
        organization := "com.github.tsandall",
        version := "0.1.0",
        scalaVersion := "2.11.5",
        libraryDependencies ++= Seq(
            "com.typesafe.akka" %% "akka-actor" % "2.3.9"
        )
    )

}
// vim: set ts=4 sw=4 et:
