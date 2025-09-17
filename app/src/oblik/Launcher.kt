package oblik

import oblik.common.types.Address

fun main() {
  val successMessage = Address.create("Street", "5a", "55").fold(
    { err -> "Failed: $err" },   // Left
    { value -> "Success: $value" } // Right
  )

  val errorMessage = Address.create("", "5a", "55").fold(
    { err -> "Failed: $err" },   // Left
    { value -> "Success: $value" } // Right
  )
  println(successMessage)
  println(errorMessage)
}
