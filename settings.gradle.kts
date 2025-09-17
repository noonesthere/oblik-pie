plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "oblik-pie"

include(
  "app",
  "protocol",
  "protocol:domain",
  "common:types",
)

