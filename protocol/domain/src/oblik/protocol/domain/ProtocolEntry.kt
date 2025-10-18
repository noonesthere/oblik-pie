package oblik.protocol.domain

import oblik.common.types.*
import oblik.common.types.base.DomainEntity
import java.time.Instant
import java.time.LocalDate
import java.time.OffsetDateTime

class ProtocolEntry(
  id: ProtocolEntryId,
  val protocolId: ProtocolId,
  val orderNumber: Int,
  val personId: Int,
  val reason: ExceptionalReason,
  val createdAt: OffsetDateTime,
  updatedAt: Instant,
  val expiredAt: LocalDate,
  val rank: Rank,
  val address: Address,
  val phone: Phone,
  val documentIDNo: DocumentIDNo,
  val status: ProtocolEntryStatus
) : DomainEntity<ProtocolEntryId>(id, updatedAt) {

}

