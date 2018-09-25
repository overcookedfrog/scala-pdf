//releaseSettings
//ReleaseKeys.crossBuild := true

name := "scala-pdf"

//organization := "net.kaliber"
organization := "com.github.overcookedfrog"

scalaVersion := "2.12.4"

crossScalaVersions := Seq("2.10.4", "2.11.4", scalaVersion.value)

val flyingSaucerVersion = "9.1.15"

libraryDependencies ++= Seq(
  "org.xhtmlrenderer" % "flying-saucer-core" % flyingSaucerVersion,
  "org.xhtmlrenderer" % "flying-saucer-pdf" % flyingSaucerVersion,
  "com.lowagie" % "itext" % "2.1.7",
  "net.sf.jtidy" % "jtidy" % "r938",
  "org.scalactic" %% "scalactic" % "3.0.5",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)

resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)

bintrayReleaseOnPublish in ThisBuild := false
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
