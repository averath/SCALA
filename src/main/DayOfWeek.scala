object DayOfWeek {
  def main(args: Array[String]) {
    val lista = List("Poniedziałek", "Wtorek", "Sroda", "Czwartek", "Piątek", "Sobota", "Niedziela")

    val filteredWeek = lista.filter(day => day.startsWith("P"))

    println("Lista dni tygodnia foldRight")
    val daysFoldRight = filteredWeek.foldRight("")("\n" + _ + _)
    println(daysFoldRight)

    println("Lista dni tygodnia foldLeft")
    val daysFoldLeft = filteredWeek.foldLeft("")(_ + _ + "\n")
    println(daysFoldLeft)

  }
}