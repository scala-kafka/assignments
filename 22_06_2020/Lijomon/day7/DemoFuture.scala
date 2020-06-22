package com.info.basics.day7

import scala.concurrent.{Future}
import scala.concurrent.ExecutionContext.Implicits.global

object DemoFuture {
  def main(args: Array[String]): Unit = {
    var salary = Future {
      Thread.sleep(5000)
      80000
    }

    val salaryLarge = salary.filter(s => s>50000)
    Thread.sleep(5000)
    println(salaryLarge)
  }
}
