package oblik.protocol.scanarios.usecases

import oblik.protocol.domain.ProtocolIdGenerator
import oblik.protocol.scenarios.dto.CreatingProtocol
import oblik.protocol.scenarios.inbound.CreateProtocol
import oblik.protocol.scenarios.outbound.ProtocolPersister

class CreateProtocolUseCase(
  private val persister: ProtocolPersister,
  private val protocolIdGenerator: ProtocolIdGenerator
) : CreateProtocol {
  override fun execute(protocol: CreatingProtocol) {
    TODO("not implemented")
//    val creatingProtocol = Protocol.create(
//      protocolIdGenerator,
//      protocol.protocolNo,
//      protocol.beginAt,
//      protocol.chiefMember,
//      protocol.secretaryMember,
//      protocol.members,
//      protocol.status,
//    )
//    persister.persist(creatingProtocol)
  }
}
