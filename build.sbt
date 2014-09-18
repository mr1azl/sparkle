name := "sparkle"

version := "0.1"

scalaVersion := "2.10.2"

scalacOptions := Seq("-deprecation", "-unchecked", "-Xlint", "-feature", "-encoding", "utf8")

resolvers ++= Seq(
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Sonatype OSS Releases" at "http://oss.sonatype.org/content/repositories/releases/",
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
  "Restlet Repository" at "http://maven.restlet.org",
  "google-api-services" at "http://mavenrepo.google-api-java-client.googlecode.com/hg",
  "Spray Repository" at "http://repo.spray.cc/",
  "spray" at "http://repo.spray.io/"
)


libraryDependencies ++= Seq(
  "io.argonaut" %% "argonaut" % "6.0.4"
  "com.typesafe" % "config" % "1.2.1",
  "org.specs2" %% "specs2" % "2.3.4" % "test",
  "org.mockito" % "mockito-core" % "1.9.5" % "test",
  "org.apache.spark" %% "spark-core" % "1.1.0",
  "org.apache.spark" % "spark-streaming_2.10" % "1.1.0",
  "org.apache.spark" % "spark-mllib_2.10" % "1.1.0"
)
