logLevel in update := sbt.Level.Warn

name := """play-playground"""
organization := "com.nejatezamin"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala, SwaggerPlugin)

scalaVersion := "2.13.1"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

//libraryDependencies += "io.swagger.core.v3" % "swagger-core" % "2.1.0"
swaggerDomainNameSpaces := Seq("daos")
libraryDependencies += "org.webjars" % "swagger-ui" % "3.24.3"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
