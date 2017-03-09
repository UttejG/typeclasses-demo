import com.alpinemonk.Domain.{Monastery, Monk}

object AdhocPolymorphicFunctions {
  def serialize(monk: Monk) =
    s"Monk(${monk.name}, ${monk.age})"

  def serialize(monastery: Monastery) =
    s"Monastery(${monastery.name}, (${monastery.availableFacilities mkString(",")}))"
}
