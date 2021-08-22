import scala.collection.{SortedMap, mutable}
import scala.math.Numeric.IntIsIntegral

class School {
  type DB = Map[Int, Seq[String]]
  var database: DB = Map()

  def add(name: String, g: Int) = {
    if (database.contains(g))
      database += database(g) :+ name
    else database += (g -> Seq(name))
  }

  def db: DB = database

  def grade(g: Int): Seq[String] =
    if (database.contains(g)) database(g)
    else Seq()

  def sorted: DB = SortedMap(database.toSeq:_*).toMap
}

