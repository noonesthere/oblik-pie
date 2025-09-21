package oblik.protocol.domain

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import oblik.common.types.base.BusinessError
import oblik.common.types.base.ValueObject

@JvmInline
value class ProtocolNumber private constructor(private val protocolNumber: String) : ValueObject {

  fun asStringValue() = protocolNumber

  companion object {

    fun from(protocolNumber: String): Either<CreateProtocolNumberError, ProtocolNumber> = when {
      protocolNumber.isEmpty() -> CreateProtocolNumberError.EmptyProtocolNumber.left()
      else -> ProtocolNumber(protocolNumber).right()
    }
  }
}

sealed class CreateProtocolNumberError : BusinessError {
  object EmptyProtocolNumber : CreateProtocolNumberError()
}
