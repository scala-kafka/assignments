package com.info.day6

object PartialFunctions {
  def payBill(amount: Double, commission: Int): Unit = {
    println(s"amount =$amount , commission=$commission")
  }
  var payByBhimApp = payBill _;
  var payByCreditCard = payBill(_: Double, commission = 10)
  var payByDebitCard = payBill(_: Double, commission = 20)

  def main(args: Array[String]): Unit = {
    payByBhimApp(10000, 0)
    payByCreditCard(20000)
    payByDebitCard(30000)
  }
}
