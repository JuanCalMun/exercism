object Hamming {
  def distance(s1: String, s2: String) = (s1, s2) match {
    case (s1, s2) if s1.length != s2.length => None
    case _ => Some(s1.zip(s2).count(x => x._1 != x._2))
  }
}