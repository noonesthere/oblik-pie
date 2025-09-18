package oblik.protocol.scenarios.dto

import oblik.protocol.domain.ProtocolStatus
import java.time.LocalDate

data class CreatingProtocol(
  val protocolNo: String,
  val beginAt: LocalDate,
  val chiefMember: String,
  val secretaryMember: String,
  val members: List<String>,
  val status: ProtocolStatus,
)
