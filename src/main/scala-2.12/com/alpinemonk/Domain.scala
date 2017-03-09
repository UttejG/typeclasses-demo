package com.alpinemonk

object Domain {
  case class Monk(name: String, age: Int)
  case class Monastery(name: String, availableFacilities: Seq[String])
}
