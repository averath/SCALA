object Tuples {
  def main(args: Array[String]) {
    val t = Tuple3(3, "abc", 5.5)
    tupleWriter(t)
  }

  def tupleWriter(tuple:(Int, String, Double)): Unit ={
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
  }
}