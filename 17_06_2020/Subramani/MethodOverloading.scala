package demo.assignment1

class MethodOverloading {

  def payment(accountNo:Double, name:String): Unit ={
    println("credit card payment")
  }

  /*def payment( name:String,accountNo:Double): Unit ={
    println("axiscredit card payment")
  }*/

  def payment(accountNo:Double, name:String,cvv:Int): Unit ={
    println("debit card payment")
  }

  def payment(upiID:Double): Unit = {
    println("payTM payment")
  }

}
