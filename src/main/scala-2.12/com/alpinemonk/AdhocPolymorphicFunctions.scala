package com.alpinemonk

object AdHocPolymorphicFunctions {

  trait Serializable[T] {
    def serialize(t: T): String
  }

  def serialize[T](t: T, s: Serializable[T]) = s.serialize(t)

}
