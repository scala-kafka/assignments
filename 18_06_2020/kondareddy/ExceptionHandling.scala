package com.info.day6

class InsuficentFundsException(s: String) extends Exception {

  def info(): Unit = {
    println(s)
  }
}
class Account {
  val acount_balance: Int = 10000

  def withDraw(amount: Int): Unit = {
    if (amount > acount_balance) {
      throw new InsuficentFundsException("insuficent funds")
    } else {
      println("successfully withdraw the amount ")
    }
  }
}
object ExceptionHandling {

  def main(args: Array[String]): Unit = {
    try {
      var account: Account = new Account
      account.withDraw(1000)
    } catch {
      case ifx: InsuficentFundsException => {}
      ifx.info()
      println("Please withdraw below 10k")
    }
  }
}
