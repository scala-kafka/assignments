package com.info.threads

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object FutureDemo3 {
  def main(args: Array[String]): Unit = {

    val futureBlock = Future {
      println("Future: Before sleep")
      Thread.sleep(5000)
      println("Future: After sleep")
      80000
    }

    futureBlock.onComplete{    // call back method
      case Success(value) => println(s"After success = $value")
      case Failure(ex) => ex.printStackTrace
    }

    println("statement executed by main")
    println("statement executed by main")
    println("statement executed by main")
    println("statement executed by main")
    println("statement executed by main")
    Thread.sleep(2000)
  }
}
