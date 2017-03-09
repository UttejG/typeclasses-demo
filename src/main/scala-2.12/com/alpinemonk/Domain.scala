package com.alpinemonk

object Domain {
  import AdhocPolymorphicFunctions._
  case class Monk(name: String, age: Int) extends Serializable {
    def serialize: String =
      s"Monk(${name}, ${age})"
  }

  case class Monastery(name: String, availableFacilities: Seq[String]) extends Serializable {
    override def serialize: String =
      s"Monastery(${name}, (${availableFacilities mkString (",")}))"
  }
}
