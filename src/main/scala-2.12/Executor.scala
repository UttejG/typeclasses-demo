import com.alpinemonk.Domain.{Monastery, Monk}

object Executor extends  App {
  import com.alpinemonk.AdhocPolymorphicFunctions._

  println((Monk("Peter", 50)).serialize)
  println((Monastery("Namgyal", Seq("Library", "Schools"))).serialize)
}
