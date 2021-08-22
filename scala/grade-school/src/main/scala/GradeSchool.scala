import scala.collection.immutable.SortedMap
import scala.collection.immutable.TreeMap


class School {
  var db = SortedMap[Int, Seq[String]]().withDefaultValue(Seq())

  def add(name: String, g: Int) =
    db += g -> (db(g) :+ name)

  def grade = db

  def sorted = db.mapValues(_.sorted)
}

