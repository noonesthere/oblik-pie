package oblik.common.types

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import oblik.common.types.base.ValueObject

data class Address private constructor(
  val street: String,
  val building: String,
  val flat: String
) : ValueObject {

  companion object {
    fun of(street: String, building: String, flat: String): Either<CreateAddressError, Address> {
      return when {
        street.isEmpty() -> CreateAddressError.EmptyStreet.left()
        building.isEmpty() -> CreateAddressError.EmptyBuilding.left()
        else -> Address(street, building, flat).right()
      }
    }
  }
}

sealed class CreateAddressError {
  object EmptyStreet : CreateAddressError()
  object EmptyBuilding : CreateAddressError()
}


