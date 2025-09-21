project.base.archivesName.set("protocols-rest")

group = "oblik.protocol.adapters.rest"
version = "1.0"

dependencies {

  implementation(project(":protocol:domain"))
  implementation(project(":protocol:scenarios:inbound"))
  implementation(project(":protocol:scenarios:dto"))

  implementation(libs.klite.server)
}

