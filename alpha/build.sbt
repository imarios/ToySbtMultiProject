import sbt._
import Keys._

name := "AlphaProject"

version := "1.0"

libraryDependencies ++= Seq( "org.ahocorasick" % "ahocorasick" % "0.2.3" )
