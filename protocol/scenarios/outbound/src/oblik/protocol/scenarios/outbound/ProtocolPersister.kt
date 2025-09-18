package oblik.protocol.scenarios.outbound

import oblik.protocol.domain.Protocol

interface ProtocolPersister {
  fun persist(protocol: Protocol): Protocol
}
