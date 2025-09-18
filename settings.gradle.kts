plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "oblik-pie"

include(
  "app",
  "protocol",
  "protocol:domain",
  "protocol:scenarios",
  "protocol:scenarios:inbound",
  "protocol:scenarios:outbound",
  "protocol:scenarios:dto",
  "common:types",
)

