package oblik.protocol.domain

import arrow.core.Either
import arrow.core.left
import arrow.core.raise.either
import arrow.core.raise.ensure
import arrow.core.right
import oblik.common.types.base.BusinessError
import oblik.common.types.base.ValueObject

@JvmInline
value class ProtocolNumber private constructor(private val protocolNumber: String) : ValueObject {

  fun asStringValue() = protocolNumber

  companion object {

    fun from(protocolNumber: String) =
      either {
        ensure(!protocolNumber.isEmpty()) {
          CreateProtocolNumberError.EmptyProtocolNumber
        }
        ProtocolNumber(protocolNumber)
      }
  }
}

sealed class CreateProtocolNumberError : BusinessError {
  object EmptyProtocolNumber : CreateProtocolNumberError()
}
