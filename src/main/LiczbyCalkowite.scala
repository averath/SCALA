object LiczbyCalkowite {
  def main(args: Array[String]) {
    val numericList = List(0, 1, 0, 2, 3, 4, 5, 10, 0, 3, 2, 22)
    println(numericList)
    println(removeZeros(numericList))
  }

  private def removeZeros(list: List[Int]) = {
    list.filter(_ != 0)
  }
}