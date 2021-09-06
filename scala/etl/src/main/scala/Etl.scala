object Etl {
  def transform(oldScores: Map[Int, Seq[String]]): Map[String, Int] =
    oldScores
      .map(_.swap)
      .flatMap { case (innerList, c) => innerList.map(_.toLowerCase -> c).sortBy(_._1) }
}