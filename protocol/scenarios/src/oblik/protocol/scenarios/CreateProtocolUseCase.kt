package oblik.protocol.scenarios

import oblik.protocol.domain.Protocol
import oblik.protocol.domain.ProtocolIdFactory
import oblik.protocol.scenarios.dto.CreatingProtocol
import oblik.protocol.scenarios.inbound.CreateProtocol
import oblik.protocol.scenarios.outbound.ProtocolPersister
import java.time.LocalDate

class CreateProtocolUseCase(
  private val persister: ProtocolPersister,
  private val protocolIdFactory: ProtocolIdFactory
) : CreateProtocol {
  override fun execute(protocol: CreatingProtocol) {
    val newProtocol = Protocol(
      protocolIdFactory.generate(),
      protocol.protocolNo,
      protocol.beginAt,
      LocalDate.now(),
      listOf(),
      protocol.chiefMember,
      protocol.secretaryMember,
      protocol.members,
      protocol.status,
    )
    persister.persist(newProtocol)
  }
}
