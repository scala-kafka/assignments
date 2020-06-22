package com.info.basics.day4

object SalaryObject {
  def main(args: Array[String]): Unit = {
    println(patternMatchSample(10000))
    println(patternMatchSample(20000))
    println(patternMatchSample(40000))
    println(patternMatchSample(60000))
    println(patternMatchSample(4500))

  }

 def patternMatchSample(salary:Long):Int = {
    var rate:Int = 0
    salary match {
      case 10000 => {rate = 1}
      case 20000 => {rate = 2}
      case 40000 => {rate = 3}
      case 60000 => {rate = 4}
      case _ => {rate = 5}
    }
    return rate
  }
}

