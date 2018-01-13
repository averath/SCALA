object Option {

  val products = Map("mleko" -> 3d, "jajko" -> 0.4d, "chleb" -> 3d)

  def printVal(x: Option[Double]): String = x match {
    case Some(i) => "Cena: " + i + " zł"
    case None => "Brak towaru"
  }

  def main(args: Array[String]) {
    var price = printVal(products.get("mleko"))
    println(price)
    price = printVal(products.get("cookies"))
    println(price)
  }
}
