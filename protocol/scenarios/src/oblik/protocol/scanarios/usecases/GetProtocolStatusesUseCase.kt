package oblik.protocol.scanarios.usecases

import oblik.protocol.domain.ProtocolStatus
import oblik.protocol.scenarios.inbound.GetProtocolStatuses

class GetProtocolStatusesUseCase() : GetProtocolStatuses {
  override fun execute() = ProtocolStatus.entries
}
