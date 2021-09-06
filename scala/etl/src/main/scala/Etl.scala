object Etl {
  def transform(oldScores: Map[Int, Seq[String]]): Map[String, Int] =
    oldScores
      .flatMap { case (c,innerList) => innerList.map(_.toLowerCase -> c).sortBy(_._1) }
}