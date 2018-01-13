object LiczbyCalkowiteMapowanieKolekcji {
  def main(args: Array[String]) {
    val numericList = List(1, 2, 3, 4, 0, 1, 2, 3, 4, 0)
    println(numericList)
    println(addOne(numericList))
  }

  private def addOne(list: List[Int]) = {
    list.map(_ + 1)
  }
}
