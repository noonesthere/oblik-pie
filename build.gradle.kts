plugins {
    alias(libs.plugins.kotlin.jvm)
}

group = "oblik"
version = "1.0"

subprojects {
    apply(plugin = "kotlin")
//    apply(plugin = "maven-publish")

    sourceSets {
        main {
            java.setSrcDirs(emptyList<String>())
            kotlin.setSrcDirs(listOf("src"))
            resources.setSrcDirs(listOf("src")).exclude("**/*.kt")
        }
        test {
            java.setSrcDirs(emptyList<String>())
            kotlin.setSrcDirs(listOf("test"))
            resources.setSrcDirs(listOf("test")).exclude("**/*.kt")
        }
    }

    repositories {
        mavenCentral()
    }
}

tasks.jar {
    archiveBaseName.set("${rootProject.name}-${project.name}")
    manifest {
        attributes(mapOf(
            "Implementation-Title" to archiveBaseName,
            "Implementation-Version" to project.version
        ))
    }
}

java {
    withSourcesJar()
}

tasks.named<Jar>("sourcesJar") {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

tasks.test {
    useJUnitPlatform()
    jvmArgs("--enable-preview", "--add-opens=java.base/java.lang=ALL-UNNAMED")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}
