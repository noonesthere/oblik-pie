package oblik.protocol.adapters.persistence.postgresql

import klite.jdbc.BaseEntity
import klite.jdbc.UpdatableEntity
import oblik.protocol.domain.Protocol

import java.time.Instant
import java.time.LocalDate

data class ProtocolEntity(
  override var id: Int,
  val protocolNumber: String,
  val status: Int,
  val beginAt: LocalDate,
  val createdAt: Instant,
  override var updatedAt: Instant?,
  val deletedAt: Instant? = null,
  val chiefMember: String,
  val secretaryMember: String,
  val member0: String,
  val member1: String,
  val member2: String,
  val member3: String,
  val member4: String,
  val member5: String,
  val member6: String,
  val member7: String,
  val member8: String,
  val member9: String,
) : BaseEntity<Int>, UpdatableEntity {

  companion object {
    fun from(protocol: Protocol): ProtocolEntity = ProtocolEntity(
      id = protocol.id.toIntValue(),
      protocolNumber = protocol.protocolNumber.asStringValue(),
      status = protocol.status.id,
      beginAt = protocol.beginAt,
      createdAt = protocol.createdAt,
      deletedAt = protocol.deletedAt,
      chiefMember = protocol.members.chiefMember,
      secretaryMember = protocol.members.secretaryMember,
      member0 = protocol.members.member0,
      member1 = protocol.members.member1,
      member2 = protocol.members.member2,
      member3 = protocol.members.member3,
      member4 = protocol.members.member4,
      member5 = protocol.members.member5,
      member6 = protocol.members.member6,
      member7 = protocol.members.member7,
      member8 = protocol.members.member8,
      member9 = protocol.members.member9,
      updatedAt = protocol.updatedAt
    )
  }
}
