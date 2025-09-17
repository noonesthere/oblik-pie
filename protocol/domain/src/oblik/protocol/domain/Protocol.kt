package oblik.protocol.domain

import java.time.LocalDate

class Protocol(
  private val id: Int,
  private val number: String,
  private val beginAt: LocalDate,
  private val createdAt: LocalDate,
  private val entries: List<ProtocolEntry>,
  private val chiefMember: String,
  private val secretaryMember: String,
  private val members: List<String>,
  private val status: ProtocolStatus
) {

}


enum class ProtocolStatus(id: Int, title: String) {
  UNKNOWN(0, "Невизначений"),
  IN_PROGRESS(1, "Поточний"),
  FINISHED(2, "Завершений");
}
