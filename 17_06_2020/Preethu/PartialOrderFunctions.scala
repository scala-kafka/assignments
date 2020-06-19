package com.scala.assignment5

object PartialOrderFunctions {

  def main(args: Array[String]): Unit = {

    def multiply(num1:Int,num2:Int) = num1*num2

    println(multiply(2,4))

    var product1=multiply _
    println(product1(5,5))

    var product2=multiply (_ :Int,10)
    println(product2(5))



  }

}
