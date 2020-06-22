package com.info.threads

import scala.concurrent.{Future}
import scala.concurrent.ExecutionContext.Implicits.global

object FutureDemo {

  def main(args: Array[String]): Unit = {

    val salary = Future {
      Thread.sleep(5000)
      80000
    }

    val  salaryLarge = salary.filter(s => s > 50000)
    Thread.sleep(5000)
    println(salaryLarge)

  }
}
