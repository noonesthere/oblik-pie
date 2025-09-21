project.base.archivesName.set("protocols-postgres-persistence")

group = "oblik.protocol.adapters.persistence.postgresql"
version = "1.0"

sourceSets {
  main {
    resources.srcDirs("db")
  }
}

dependencies {

  implementation(project(":common:types"))
  implementation(project(":protocol:domain"))
  implementation(project(":protocol:scenarios:outbound"))
  implementation(libs.klite.jdbc)

  testImplementation(libs.klite.jdbc.test)
}

