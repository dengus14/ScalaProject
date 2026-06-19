ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.ScalaProject"

lazy val root = (project in file("."))
  .settings(
    name := "my-sbt-project",
    scalaVersion := "3.3.4",
  )
