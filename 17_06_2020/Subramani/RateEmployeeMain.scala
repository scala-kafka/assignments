package demo.assignment1

object RateEmployeeMain {

  def main(args: Array[String]): Unit = {
    var rateEmployee:RateEmployee = new RateEmployee
    var a = rateEmployee.getRate(1,"subu",9000)
    println(a)
  }

}
