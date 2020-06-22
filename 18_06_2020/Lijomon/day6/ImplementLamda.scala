package com.info.basics.day6

trait LamdaSample {
  def add (x:Int,y:Int):Int

}

trait LambdaSample2{
  def printData()
}

object ImplementLamda {
  def main(args: Array[String]): Unit = {

    def objLamda:LamdaSample = (x, y) => x+y
    println(objLamda.add(60,40))
    def objLamda1:LambdaSample2=()=>println("Lambda Example 2")
    objLamda1.printData()

  }
}
