package oblik.protocol.scanarios.usecases

import oblik.protocol.domain.Protocol
import oblik.protocol.domain.ProtocolIdGenerator
import oblik.protocol.domain.ProtocolNumber
import oblik.protocol.domain.ProtocolNumberAlreadyExists
import oblik.protocol.scenarios.dto.NewProtocolInput
import oblik.protocol.scenarios.inbound.CreateProtocol
import oblik.protocol.scenarios.outbound.ProtocolPersister

class CreateProtocolUseCase(
  private val persister: ProtocolPersister,
  private val protocolIdGenerator: ProtocolIdGenerator,
  private val protocolNumberAlreadyExists: ProtocolNumberAlreadyExists
) : CreateProtocol {
  override fun execute(input: NewProtocolInput) {
    var protocolNo = ProtocolNumber.from(input.protocolNo)
    
    val creatingProtocol = Protocol.create(
      protocolIdGenerator,
      protocolNumberAlreadyExists,
      protocolNo = protocolNo,
      beginAt = input.beginAt,
      members = input.members,
      status = input.status
    )
    persister.persist(creatingProtocol)
  }
}
