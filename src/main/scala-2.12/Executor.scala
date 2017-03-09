import com.alpinemonk.Domain.{Monastery, Monk}

object Executor extends  App {
  import com.alpinemonk.AdHocPolymorphicFunctions._
  import com.alpinemonk.DomainSerializationImpl._

  println(serialize((Monk("Peter", 50))))
  println(serialize(Monastery("Namgyal", Seq("Library", "Schools"))))
}
