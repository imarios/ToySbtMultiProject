import sbt._
import Keys._

name := "MultiProject"

lazy val root = Project("root", file(".")).aggregate(alpha, beta)

lazy val alpha = ProjectRef(file("alpha"), "alpha")

lazy val beta = ProjectRef(file("beta"), "beta")
