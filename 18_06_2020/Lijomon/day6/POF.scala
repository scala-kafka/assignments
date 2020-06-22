package com.info.basics.day6

class Simple{

  def printMultipleValuesData(x:Int): Unit ={
      print(x +"\t")
  }


}

object POF {

  def add(x:Int, y:Int, z:Int) = x+y+z

  def add2(x:Int)(y:Int)(z:Int) = x+y+z

  def main(args: Array[String]): Unit = {

    println(add(10, 20, 30))

    var v2 = add(100, _:Int, _:Int)
    var v1 = add(100, 200, _:Int)

    println(add2(10)(20)_)

    var v22 = add2(100)(200)_
    var v11 = add2(100)_

  }
}
