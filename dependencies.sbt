val hadoopVersion = "1.2.1"

val scaldingVersion = "0.9.0rc8"

libraryDependencies ++= Seq(
  "com.twitter" %% "scalding-core" % scaldingVersion,
  // include Hadoop runtime to run locally
  "org.apache.hadoop" % "hadoop-core" % hadoopVersion
  // replace above with the following to exclude Hadoop from assembly jar
  //"org.apache.hadoop" % "hadoop-core" % hadoopVersion % "provided"
)

resolvers ++= Seq(
  "Conjars repo" at "http://conjars.org/repo"
)
