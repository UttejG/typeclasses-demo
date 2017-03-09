package com.alpinemonk

import com.alpinemonk.Domain.{Monastery, Monk}

object DomainSerializationImpl {
  import AdHocPolymorphicFunctions._

  implicit object MonkSerializer extends Serializable[Monk] {
    def serialize(monk: Monk) = s"Monk(${monk.name}, ${monk.age})"
  }

  implicit object MonasterySerializer extends Serializable[Monastery] {
    def serialize(monastery: Monastery) = s"Monastery(${monastery.name}, (${monastery.availableFacilities mkString (",")}))"
  }
}
