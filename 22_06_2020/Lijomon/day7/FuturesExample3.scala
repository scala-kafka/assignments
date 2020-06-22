package com.info.basics.day7

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util._

object FuturesExample3 extends App {
  println("1 - starting with Future ...")
  val result = Future[String] {
    println("Am in Future Method")
    "100"
  }

  println("2- before onComplete")
  result.onComplete {
    case Success(value) => println(s"Got the callback, meaning = $value")
    case Failure(e) => e.printStackTrace
  }
}