package oblik.protocol.scenarios.inbound

import oblik.protocol.scenarios.dto.CreatingProtocol

interface CreateProtocol {
  fun execute(protocol: CreatingProtocol)
}
