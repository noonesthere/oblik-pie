package oblik.protocol.scenarios.outbound

import oblik.protocol.domain.ProtocolNumber

interface ProtocolExtractor {
  fun getByProtocolNumber(protocolNumber: ProtocolNumber): ProtocolNumber?
}
