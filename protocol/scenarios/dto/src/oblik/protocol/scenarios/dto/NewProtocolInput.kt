package oblik.protocol.scenarios.dto

import oblik.protocol.domain.ProtocolStatus
import java.time.LocalDate

data class NewProtocolInput(
  val protocolNo: String,
  val beginAt: LocalDate,
  val chiefMember: String = "",
  val secretaryMember: String = "",
  val members: List<String> = listOf(),
  val status: ProtocolStatus,
)
