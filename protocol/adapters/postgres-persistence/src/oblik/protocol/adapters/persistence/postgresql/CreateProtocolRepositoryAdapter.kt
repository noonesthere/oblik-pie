package oblik.protocol.adapters.persistence.postgresql

import oblik.protocol.domain.Protocol
import oblik.protocol.scenarios.outbound.ProtocolPersister

class CreateProtocolRepositoryAdapter(private val repository: ProtocolRepository) : ProtocolPersister {

  override fun persist(protocol: Protocol) {
    val events = protocol.popEvents()
    if (events.isNotEmpty()) {
      repository.save(ProtocolEntity.from(protocol))
    } // TODO : events
  }
}
