package oblik.protocol.scenarios.inbound

import oblik.protocol.scenarios.dto.NewProtocolInput

interface CreateProtocol {
  fun execute(protocol: NewProtocolInput)
}
