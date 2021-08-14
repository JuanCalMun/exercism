object SpaceAge {

  val MERCURY_ORBITAL = 0.2408467
  val VENUS_ORBITAL = 0.61519726
  val MARS_ORBITAL = 1.8808158
  val JUPITER_ORBITAL = 11.862615
  val SATURN_ORBITAL = 29.447498
  val URANUS_ORBITAL = 84.016846
  val NEPTUNE_ORBITAL = 164.79132

  val SECONDS_IN_A_EARTH_YEAR = 31557600

  val earthSecondsToEarthYears: Double => Double =
    _ / SECONDS_IN_A_EARTH_YEAR
  val yearsWithPeriod: (Double, Double) => Double =
    earthSecondsToEarthYears(_) / _

  def onMercury(seconds: Double): Double =
    yearsWithPeriod(seconds, MERCURY_ORBITAL)

  def onVenus(seconds: Double): Double =
    yearsWithPeriod(seconds, VENUS_ORBITAL)

  def onEarth(seconds: Double): Double =
    earthSecondsToEarthYears(seconds)

  def onMars(seconds: Double): Double =
    yearsWithPeriod(seconds, MARS_ORBITAL)

  def onJupiter(seconds: Double): Double =
    yearsWithPeriod(seconds, JUPITER_ORBITAL)

  def onSaturn(seconds: Double): Double =
    yearsWithPeriod(seconds, SATURN_ORBITAL)

  def onUranus(seconds: Double): Double =
    yearsWithPeriod(seconds, URANUS_ORBITAL)

  def onNeptune(seconds: Double): Double =
    yearsWithPeriod(seconds, NEPTUNE_ORBITAL)

}