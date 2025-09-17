package oblik.common.types

import oblik.common.types.base.ValueObject


@JvmInline
value class Phone private constructor(val value: String) : ValueObject {
  companion object {
    fun create(value: String) = Phone(value) // TODO: add invariants

  }
}
