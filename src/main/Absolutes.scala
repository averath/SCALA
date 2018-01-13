object Absolutes {
  def main(args: Array[String]) {

    val numericList = List(0, 1.0, 0, -20, 3, 4, -5, 10, 0, -3, 2, 22)
    println(numericList)
    println(abs(numericList))
  }

  private def abs(list: List[Double]) = {
    list.filter(x => x >= -5 && x < 12).map(_.abs)
  }
}