name := "NLPExampleWithScala"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  // "edu.berkeley.nlp" % "berkeleyparser" % "r32",
  "edu.stanford.nlp" % "stanford-corenlp" % "3.8.0",
  "edu.stanford.nlp" % "stanford-corenlp" % "3.8.0" classifier "models"
  //"edu.stanford.nlp" % "stanford-parser" % "3.7.0"
)