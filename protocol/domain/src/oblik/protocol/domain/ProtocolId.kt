package oblik.protocol.domain

@JvmInline
value class ProtocolId(val value: Int) {
  fun toIntValue() = value
}

interface ProtocolIdGenerator {
  fun generate(): ProtocolId
}
