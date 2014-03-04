Scalding template
=================

An SBT skeleton for Scalding projects.

Running on Hadoop
-----------------

Use the `assembly` task to assemble a fat jar to be deployed to hadoop. Run the
jar on hadoop as normal.

Running locally
---------------

Fire up SBT and run the main class using Scalding's `Tool`. For example, to
run the sample application, enter
```scala
runMain com.twitter.scalding.Tool com.organization.WordCount --local --input "README" --output "output.txt"
```

*Note that to run locally, Hadoop must not be specified as a "provided"
dependency. See `dependencies.sbt`.*
