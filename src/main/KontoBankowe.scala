object KontoBankowe {
  def main(args: Array[String]): Unit = {
    var konto1000 = new KontoBankowe(1000)
    var kontoPuste = new KontoBankowe()
    println(konto1000.balance)
    println(kontoPuste.balance)
  }

  class KontoBankowe(val balance: Double) {

    def this() = this(0)

    private var _balance = balance

    def wplata(value: Double) {
      _balance = _balance + value
    }

    def wyplata(value: Double) {
      if (_balance > value)
        _balance = _balance - value
    }
  }

}