object Products {
  def main(args: Array[String]) {
    val products = Map("mleko" -> 3d, "jajko" -> 0.4d, "chleb" -> 3d)
    println("Produkty")
    println(products)

    println("Produkty po obniżce")
    val productsAfterDiscount = products mapValues (_ * 0.9d)
    println(productsAfterDiscount)
  }
}