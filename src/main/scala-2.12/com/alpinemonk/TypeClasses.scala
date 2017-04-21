package com.alpinemonk

import com.alpinemonk.Domain.{Monastery, Monk}


trait Serializable[T] {
  def serialize(t: T): String
}

object Serializable {
  def apply[T](implicit se: Serializable[T]): Serializable[T] = se

  def serialize[T: Serializable](t: T) = Serializable[T].serialize(t)

  object ops {
    implicit class SerializableOps[T: Serializable](t: T) {
      def serialize = Serializable[T].serialize(t)
    }
  }

  implicit val MonkSerializer: Serializable[Monk] =
    monk => s"Monk(${monk.name}, ${monk.age})"

  implicit val MonasterySerializer: Serializable[Monastery] =
    monastery => s"Monastery(${monastery.name}, (${monastery.availableFacilities mkString (",")}))"
}

