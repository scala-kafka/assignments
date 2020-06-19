package com.scala.assignment5

class Payment {
  def payBill(): Unit ={
   println("Payment Called")
  }
}
class Creditcard extends Payment{
  override def payBill(): Unit ={
    println("Credit card called")
  }
}
class Debitcard extends Payment{
  override def payBill():Unit={
    println("Debit card called")
  }
}

