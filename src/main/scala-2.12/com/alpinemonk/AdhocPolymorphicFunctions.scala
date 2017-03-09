package com.alpinemonk

object AdHocPolymorphicFunctions {

  trait Serializable[T] {
    def serialize(t: T): String
  }

  def serialize[T: Serializable](t: T) = implicitly[Serializable[T]].serialize(t)

}
