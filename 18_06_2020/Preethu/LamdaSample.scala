package com.scala.assignment6

trait LamdaSample {
  def add (x:Int,y:Int):Int

}
trait LambdaSample2{
  def printData()
}
object ImplementLamda extends App {

    def obj1:LamdaSample = (x, y) => x+y
    println(obj1.add(60,40))

    def obj2:LambdaSample2=()=>println("Lambda Sample 2")
    obj2.printData()

}