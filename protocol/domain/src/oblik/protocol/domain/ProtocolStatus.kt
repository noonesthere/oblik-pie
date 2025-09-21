package oblik.protocol.domain

enum class ProtocolStatus(val id: Int, val title: String) {
  UNKNOWN(0, "Невизначений"),
  IN_PROGRESS(1, "Поточний"),
  FINISHED(2, "Завершений");
}
