group = "oblik.protocol.scenarios"
version = "1.0"

dependencies {
  implementation(project(":protocol:domain"))
  implementation(project(":protocol:scenarios:inbound"))
  implementation(project(":protocol:scenarios:outbound"))
  implementation(project(":protocol:scenarios:dto"))
}
