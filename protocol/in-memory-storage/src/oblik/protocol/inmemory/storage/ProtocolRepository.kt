package oblik.protocol.inmemory.storage

import oblik.common.types.base.Repository
import oblik.protocol.domain.Protocol
import oblik.protocol.scenarios.outbound.ProtocolPersister

class ProtocolRepository() : Repository<Protocol>, ProtocolPersister {

  val data: MutableMap<Int, Protocol> = mutableMapOf()

  override fun persist(protocol: Protocol): Protocol {
    data[protocol.id] = protocol
    return protocol
  }
}
