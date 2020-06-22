package com.info.scala.day6.Assignment1

object Factorial {


  def FindFactorial((f:Int=>))

  def findFactorial(value:Int):Int= {
    if (value>=1) {
     var fact=value*findFactorial(value-1)
      return fact
    }
     return 1

  }

    def main(args: Array[String]): Unit = {
    println(findFactorial( 5))
    }
  }



