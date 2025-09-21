plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "oblik-pie"

include(
  // commons:
  "common:types",
  // main project:
  "app",
  // protocol:
  "protocol",
  "protocol:domain",
  "protocol:scenarios",
  "protocol:scenarios:inbound",
  "protocol:scenarios:outbound",
  "protocol:scenarios:dto",
  "protocol:adapters:postgres-persistence",
  "protocol:adapters:rest",

)

