name := """service-container"""

version := "0.0.1"

scalaVersion := "2.11.6"

com.github.retronym.SbtOneJar.oneJarSettings

mainClass in (Compile, run) := Some("Main")

libraryDependencies ++= Seq(
  "com.github.vonnagy" %% "service-container" % "1.0.2"
)
