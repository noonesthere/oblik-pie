package oblik.protocol.scanarios.invariants

import oblik.protocol.domain.ProtocolNumber
import oblik.protocol.domain.ProtocolNumberAlreadyExists

class ProtocolNumberAlreadyExistsInvariant: ProtocolNumberAlreadyExists {
  override fun invoke(protocolNumber: ProtocolNumber): Boolean {
    return false;
  }
}
