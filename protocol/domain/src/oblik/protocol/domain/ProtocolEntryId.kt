package oblik.protocol.domain

@JvmInline
value class ProtocolEntryId(val value: Int) {
  fun toIntValue() = value
}

interface ProtocolEntryIdGenerator {
  fun generate(): ProtocolEntryId
}
