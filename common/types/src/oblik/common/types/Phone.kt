package oblik.common.types

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import oblik.common.types.base.ValueObject


@JvmInline
value class Phone private constructor(val value: String) : ValueObject {
  companion object {
    val EMPTY = Phone("")

    fun of(value: String): Either<CreatePhoneNumberError, Phone> {
      return when {
        value.length != 10 -> CreatePhoneNumberError.InvalidCreatePhoneNumberLength.left()
        value.any { it.isLetter() } -> CreatePhoneNumberError.InvalidCreatePhoneNumber.left()
        value.isEmpty() -> EMPTY.right()
        else -> Phone(value).right()
      }
    }
  }
}

sealed class CreatePhoneNumberError {
  object InvalidCreatePhoneNumberLength : CreatePhoneNumberError()
  object InvalidCreatePhoneNumber : CreatePhoneNumberError()
}
