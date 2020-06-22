package com.info.basics.day7

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object FuturesExample1 {

  def main(args: Array[String]): Unit = {
    val salary = Future {
      Thread.sleep(5000)
      80000
    }

    salary.onComplete {   //call back method
      case Success(value) => println(s"After Success = $value")
      case Failure(ex) => ex.printStackTrace()
    }

    println("Statement Exe in Main")
    println("Statement Exe in Main")
    println("Statement Exe in Main")

    val salaryLarge = salary.filter(s => s >5000)
    Thread.sleep(5000)
    println(salaryLarge)
  }

}
