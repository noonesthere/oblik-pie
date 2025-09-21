package oblik

import klite.*
import klite.annotations.annotated
import klite.jdbc.DBMigrator
import klite.jdbc.DBModule
import klite.jdbc.RequestTransactionHandler
import klite.json.JsonBody
import oblik.protocol.adapters.persistence.postgresql.CreateProtocolRepositoryAdapter
import oblik.protocol.adapters.persistence.postgresql.PostgresProtocolEntryIdGenerator
import oblik.protocol.adapters.persistence.postgresql.PostgresProtocolIdGenerator
import oblik.protocol.adapters.rest.CreateProtocolRoute
import oblik.protocol.domain.ProtocolEntryIdGenerator
import oblik.protocol.domain.ProtocolIdGenerator
import oblik.protocol.scanarios.usecases.CreateProtocolUseCase
import oblik.protocol.scenarios.inbound.CreateProtocol
import oblik.protocol.scenarios.outbound.ProtocolPersister
import java.io.PrintStream
import java.nio.charset.StandardCharsets
import java.nio.file.Path
import java.util.*


fun applySystemProperties() {
  System.setProperty("user.country", "UA")
  System.setProperty("user.language", "uk")
  System.setProperty("user.timezone", "Europe/Kiev")
  TimeZone.setDefault(TimeZone.getTimeZone(System.getProperty("user.timezone")))

  System.setOut(PrintStream(System.out, true, StandardCharsets.UTF_8))
}

fun main() {
  applySystemProperties()
  Config.useEnvFile() // loads .env file if it exists and uses values from the file only if they are not set in the environment

  Server().apply {
    use<JsonBody>()
    use<DBModule>()
    use<DBMigrator>()
    use<RequestTransactionHandler>()

    //App dependencies protocols
    register<ProtocolPersister>(CreateProtocolRepositoryAdapter::class)
    register<ProtocolIdGenerator>(PostgresProtocolIdGenerator::class)
    register<ProtocolEntryIdGenerator>(PostgresProtocolEntryIdGenerator::class)

    register<CreateProtocol>(CreateProtocolUseCase::class)

    // Main index
    val path: String = if (Config.isDev) "OblikUI" else "public"
    assets("/", AssetsHandler(Path.of(path), useIndexForUnknownPaths = true))

    // Persons
//    context("/api/persons") {
//      useOnly<JsonBody>()
////      annotated<GetPersonsRoute>()
//    }

    context("/api") {
      useOnly<JsonBody>()
      annotated<CreateProtocolRoute>("/protocols")
    }

//    val s = org.h2.tools.Server.createWebServer("-web", "-webAllowOthers", "-webPort", "8082").start()
//    println("H2 console started at URL: ${s.url}")
    start()
  }
}
