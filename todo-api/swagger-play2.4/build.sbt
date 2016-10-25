name := """swagger-play2.4"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "io.swagger" %% "swagger-play2" % "1.5.1",
  "org.webjars" % "swagger-ui" % "2.2.0",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

routesGenerator := InjectedRoutesGenerator
