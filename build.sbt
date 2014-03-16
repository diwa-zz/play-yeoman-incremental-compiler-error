name := "play-yeoman-incremental-compiler-error"

version := "1.0-SNAPSHOT"

// enable improved (experimental) incremental compilation algorithm called "name hashing"
incOptions := incOptions.value.withNameHashing(true)

libraryDependencies ++= Seq(
  jdbc,
  cache
)

play.Project.playScalaSettings
