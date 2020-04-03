name := "Polymathor"

version := "0.1"

scalaVersion := "2.13.1"

val http4sVersion = "0.21.2"

// Only necessary for SNAPSHOT releases
resolvers += Resolver.sonatypeRepo("snapshots")
scalacOptions in Test ++= Seq("-Yrangepos")
libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-dsl" % http4sVersion,
  "org.http4s" %% "http4s-blaze-server" % http4sVersion,
  "org.http4s" %% "http4s-blaze-client" % http4sVersion,
  "dev.zio" %% "zio" % "1.0.0-RC18-2",
  "org.typelevel" %% "cats-effect" % "2.1.2",
  "org.specs2" %% "specs2-core" % "4.8.3" % "test"
)
