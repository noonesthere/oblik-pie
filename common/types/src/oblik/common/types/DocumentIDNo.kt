package oblik.common.types

import oblik.common.types.base.ValueObject


@JvmInline
value class DocumentIDNo private constructor(val value: String) : ValueObject {
  companion object {
    fun create(value: String) = DocumentIDNo(value) // TODO: add invariants
  }
}
