val mainClassName = "oblik.LauncherKt"

group = "oblik"
version = "1.0"

sourceSets {
  main {
    resources.srcDirs("db")
  }
}

dependencies {
  // common
  implementation(libs.arrow)
  implementation(project(":common:types"))
//  protocol
  implementation(project(":protocol:domain"))

  implementation(project(":protocol:scenarios"))
  implementation(project(":protocol:scenarios:inbound"))
  implementation(project(":protocol:scenarios:dto"))
  implementation(project(":protocol:scenarios:outbound"))

  implementation(project(":protocol:adapters:postgres-persistence"))
  implementation(project(":protocol:adapters:rest"))


  implementation(libs.klite.server)
  implementation(libs.klite.json)
  implementation(libs.klite.jdbc)
  implementation(libs.klite.liquibase)
  implementation(libs.hikari)
  implementation(libs.postgres)
  implementation(libs.snakeyaml)
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
