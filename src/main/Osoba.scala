object Osoba {
  def main(args: Array[String]): Unit = {
    val konrad = new Osoba("Konrad", "Początek")
    println(hello(konrad))
    val jan = new Osoba("Jan", "Nowak")
    println(hello(jan))
    val anna = new Osoba("Anna", "Kowalska")
    println(hello(anna))
  }

  private def hello(osoba: Osoba) = {
    osoba.imie match {
      case "Jan" => "Siemka Janek"
      case "Anna" => "Anna to jest dobra Panna"
      case _ => "Hej " + osoba.imie
    }
  }

  class Osoba(val imie: String, nazwisko: String)

}