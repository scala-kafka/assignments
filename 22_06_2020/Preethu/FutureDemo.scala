package com.scala.threads

import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.util.{Failure, Success}


class FutureDemo {
  println(">>FutureDemo")
  def add=(num1:Int,num2:Int)=>num1+num2
  def multiply=(num1:Int,num2:Int)=>println("Multiply  "+num1*num2)

}
class FutureDemo2 extends  Thread{
  println(">>FutureDemo2")
 var demoObj=new FutureDemo
 var future=Future{
   Thread.sleep(500)
   demoObj.add(10,40)
 }
  val sum=Await.result(future,Duration.Inf)
  println(s"Sum= $sum")
  demoObj.multiply(sum,10)

}
object processFutureDemo extends App{
  println(">>processFutureDemo>>")
  var obj=new FutureDemo2
  obj.start()
}