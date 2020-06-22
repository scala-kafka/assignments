package com.info.basics.day6

object ProcessCurrying extends App {
  var objCurrying:Currying = new Currying
  var result=objCurrying.add(20)(30)_
  println(result(41))
  var result2=objCurrying.add(20)_
  println(result2(20)(90))
}

class Currying {

  def add (x:Int)(y:Int)(z:Int) :Int=x+y+z
}