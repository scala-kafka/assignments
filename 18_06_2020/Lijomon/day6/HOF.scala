package com.info.basics.day6

object HOF {

  var add = (num1:Int, num2:Int) => num1 + num2
  var sub = (num1:Int, num2:Int) => num1 - num2
  var mul = (num1:Int, num2:Int) => num1 * num2

  def processArithmetic(x:Int, y:Int, varble:((Int, Int) => Int)) :Unit = {
    var result:Int = varble(x,y)
    println(result)
  }

  def main(args: Array[String]): Unit = {
    var value1 = 34
    var value2 = 53
    processArithmetic(value1, value2, add)
  }
 }