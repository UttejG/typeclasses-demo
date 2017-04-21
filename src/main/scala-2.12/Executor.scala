import com.alpinemonk.Domain.{Monastery, Monk}

object Executor extends  App {
  import com.alpinemonk.Serializable._
  import com.alpinemonk.Serializable.ops._

  println(serialize((Monk("Peter", 50))))
  println((Monk("Peter", 50).serialize))

  println(serialize(Monastery("Namgyal", Seq("Library", "Schools"))))
  println(Monastery("Namgyal", Seq("Library", "Schools")).serialize)
}
