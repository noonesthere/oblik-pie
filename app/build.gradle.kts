val mainClassName = "oblik.LauncherKt"

group = "oblik"
version = "1.0"

sourceSets {
  main {
    resources.srcDirs("db", "i18n")
  }
}

tasks.jar {
  doFirst {
    manifest {
      attributes(
        "Main-Class" to mainClassName,
//        "Class-Path" to ""
      )
    }
  }
}

tasks.register<JavaExec>("run") {
  mainClass.set(mainClassName)
  classpath = sourceSets.main.get().runtimeClasspath
}
