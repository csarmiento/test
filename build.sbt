name := "hello"
version := "1.0"
mainClass in(Compile, run) := Some("com.camilo.Main")

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"