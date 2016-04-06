name := "slick-plainsql"

mainClass in Compile := Some("PlainSQL")

scalaVersion := "2.11.8"

libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "3.1.1",
  "org.slf4j" % "slf4j-nop" % "1.7.10",
  "com.h2database" % "h2" % "1.4.187",
  "com.github.tminglei" %% "slick-pg" % "0.12.1",
  "com.github.tminglei" %% "slick-pg_joda-time" % "0.12.1",
  "com.github.tminglei" %% "slick-pg_jts" % "0.12.1",
  "com.github.tminglei" %% "slick-pg_json4s" % "0.12.1",
  "org.postgresql" % "postgresql" % "9.4.1208",
  "org.json4s" %% "json4s-jackson" % "3.3.0"
)
