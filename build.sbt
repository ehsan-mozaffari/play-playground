logLevel in update := sbt.Level.Warn

name := """play-playground"""
organization := "com.nejatezamin"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala, SwaggerPlugin)

scalaVersion := "2.13.1"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

// Swagger dep. See alternative: Api-first-hand
// see support version 3
swaggerV3 := true
swaggerDomainNameSpaces := Seq("daos")
libraryDependencies += "org.webjars" % "swagger-ui" % "3.24.3"
swaggerPrettyJson := true
swaggerFileName := "swagger.json"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
