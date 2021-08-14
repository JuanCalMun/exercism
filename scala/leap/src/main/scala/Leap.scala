object Leap {
  def leapYear(year: Int): Boolean = {

    val yearDivisibleBy: Int => Boolean = year % _ == 0

    yearDivisibleBy(4) && yearDivisibleBy(400) || !yearDivisibleBy(100)

  }

}
