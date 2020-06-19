package com.info.day6
trait SmartPhone {
  def price()
}
class Nokia extends SmartPhone {
  override def price(): Unit = {
    println("custom price 20k")
  }
}

object LamdaExample {
  def main(args: Array[String]): Unit = {

    // Normal style
    var smartPhone: SmartPhone = new Nokia
    smartPhone.price();

    // lamda style
    var smartPhone1: SmartPhone = new SmartPhone {
      override def price(): Unit = println("custom price 30k ")
    }
    smartPhone1.price()

    // single line lamda style
    var smartPhone2: SmartPhone = () => println("custom price 40k")
    smartPhone2.price()
  }
}
