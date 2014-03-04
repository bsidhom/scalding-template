val hadoopVersion = "1.2.1"

val scaldingVersion = "0.9.0rc8"

libraryDependencies ++= Seq(
  "com.twitter" %% "scalding-core" % scaldingVersion,
  //"org.apache.hadoop" % "hadoop-core" % hadoopVersion % "provided"
  // replace above with the following to run in local mode
  "org.apache.hadoop" % "hadoop-core" % hadoopVersion
)

resolvers ++= Seq(
  "Conjars repo" at "http://conjars.org/repo"
)
