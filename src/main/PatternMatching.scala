object PatternMatching {

  def main(args: Array[String]) {

    var workOrNot = getDayInfo("Poniedziałek")
    println("Poniedziałek: " + workOrNot)
    workOrNot = getDayInfo("Sobota")
    println("Sobota: " + workOrNot)
    workOrNot = getDayInfo("Szóstek")
    println("Szóstek: " + workOrNot)
  }

  def getDayInfo(day: String): String = day match {
    case "Poniedziałek" | "Wtorek" | "Sroda" | "Czwartek" | "Piątek" => "Praca"
    case "Sobota" | "Niedziela" => "Weekend"
    case _ => "Nie ma takiego dnia"
  }
}