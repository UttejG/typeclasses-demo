package com.alpinemonk

import com.alpinemonk.Domain.{Monastery, Monk}

object AdhocPolymorphicFunctions {
  def serialize(any: Any) = {
    any match {
      case monk: Monk =>
        s"Monk(${monk.name}, ${monk.age})"
      case monastery :Monastery =>
        s"Monastery(${monastery.name}, (${monastery.availableFacilities mkString (",")}))"
    }
  }
}
