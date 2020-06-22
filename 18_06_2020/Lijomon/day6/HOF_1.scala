package com.info.basics.day6

object HOF_1 {


  var multiply = performMultiply()


  def processArithmetic1(performMultiply:Int) = {
    var result:Int = performMultiply
    println(result)
  }
  def main(args: Array[String]): Unit = {
    var value1 = 34
    var value2 = 53
    processArithmetic1(multiply)
  }

  def performMultiply():Int={
    println("Performing Multiplication...")
    100 * 10
  }
 }