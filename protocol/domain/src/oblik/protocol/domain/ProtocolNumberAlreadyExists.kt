package oblik.protocol.domain

interface ProtocolNumberAlreadyExists {
  fun invoke(protocolNumber: ProtocolNumber): Boolean
}
