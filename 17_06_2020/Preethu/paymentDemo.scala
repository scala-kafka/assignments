package com.scala.assignment5

object paymentDemo {
  def main(args: Array[String]): Unit = {
    var obj1:ProcessPayment=new ProcessPayment(new Payment())
    var obj2:ProcessPayment=new ProcessPayment(new Creditcard())
    var obj3:ProcessPayment=new ProcessPayment(new Debitcard())
  }
}
