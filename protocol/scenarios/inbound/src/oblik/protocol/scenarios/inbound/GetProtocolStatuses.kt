package oblik.protocol.scenarios.inbound

import oblik.protocol.domain.ProtocolStatus

interface GetProtocolStatuses {
  fun execute(): List<ProtocolStatus>
}
