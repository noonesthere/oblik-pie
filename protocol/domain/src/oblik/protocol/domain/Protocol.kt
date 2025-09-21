package oblik.protocol.domain

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import oblik.common.types.base.AggregateRoot
import oblik.common.types.base.BusinessError
import oblik.common.types.base.Version
import java.time.Instant
import java.time.LocalDate

class Protocol internal constructor(
  id: ProtocolId,
  val protocolNumber: ProtocolNumber,
  val beginAt: LocalDate,
  val createdAt: Instant,
  val status: ProtocolStatus,
  val entries: List<ProtocolEntry>,
  val members: Members,
  val updatedAt: Instant? = null,
  val deletedAt: Instant? = null,
  version: Version
) : AggregateRoot<ProtocolId>(id, version) {

  companion object {
    fun create(
      idGenerator: ProtocolIdGenerator,
      protocolNumberAlreadyExists: ProtocolNumberAlreadyExists,
      protocolNo: ProtocolNumber,
      beginAt: LocalDate,
      members: Members,
      status: ProtocolStatus
    ): Either<ProtocolAlreadyExistsWithSameName, Protocol> {

      if (protocolNumberAlreadyExists.invoke(protocolNo)) {
        return ProtocolAlreadyExistsWithSameName.left()
      }

      val id = idGenerator.generate()
      return Protocol(
        id = id,
        protocolNumber = protocolNo,
        beginAt = beginAt,
        createdAt = Instant.now(),
        status = status,
        entries = emptyList(),
        members = members,
        version = Version.new()
      ).apply {
        addEvent(ProtocolCreatedDomainEvent(id.toIntValue())) // Example DomainEvent
      }.right()
    }
  }
}

object ProtocolAlreadyExistsWithSameName : BusinessError
