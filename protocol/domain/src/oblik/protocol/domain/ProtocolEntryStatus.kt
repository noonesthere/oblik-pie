package oblik.protocol.domain

enum class ProtocolEntryStatus(val id: Int, val title: String) {
  WAITING(0, "Очікує"),
  ACCEPTED(1, "Надано"),
  REJECTED(2, "Відмовлено"),
}
