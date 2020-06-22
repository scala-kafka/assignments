package com.info.basics.day6

object FactorialSample {
  def main(args: Array[String]) {
    println(factorial(5))
  }

  // With Recursion and Lamda
  def factorial(num: Int): Int = num match {
    case 0 => 1
    case _ => num * factorial(num-1)
  }

  // traditional
  //  def factorial(number: Int): Int = {
  //    if (number <= 1) 1 else number * factorial(number - 1)
  //  }
}
