addSbtPlugin("com.eed3si9n" % "sbt-projectmatrix" % "0.9.1")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.18.1")
addSbtPlugin("com.rallyhealth.sbt" % "sbt-git-versioning" % "1.6.0")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.21")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.1.1")

libraryDependencies += "org.scala-js" %% "scalajs-env-jsdom-nodejs" % "1.1.0"
