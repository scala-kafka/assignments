package com.scala.assignment6

abstract class AnonymousInterface {
  def myMethod()
  def myMethod2(): Unit ={
    println("My Method 2 in base class.......")
  }

}

object processAnonymous{
  def main(args: Array[String]): Unit = {
    val obj:AnonymousInterface=new AnonymousInterface {
      override def myMethod(): Unit = {
          super.myMethod2()
          println("Anonymous ......")
      }
   }
    obj.myMethod()
  }
}