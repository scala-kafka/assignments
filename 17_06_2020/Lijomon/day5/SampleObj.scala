package com.info.basics.day5

object SampleObj {

  def main(args: Array[String]) = {
    functionExample(50, multiplyBy2)
    functionExample(100, addition2)
  }

  def functionExample(first:Int, f:Int=>AnyVal):Unit = {
    println(f(first))
  }

  // This function will get invoked
  def multiplyBy2(num:Int):Int = {
    num*2
  }

  def addition2(num0:Int):Int = {
    num0+100
  }
}
