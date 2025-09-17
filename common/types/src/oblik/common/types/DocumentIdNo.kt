package oblik.common.types

import oblik.common.types.base.ValueObject


@JvmInline
value class DocumentIdNo private constructor(val value: String) : ValueObject {
  companion object {
    fun create(value: String) = DocumentIdNo(value) // TODO: add invariants
  }
}
