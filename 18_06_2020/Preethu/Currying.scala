package com.scala.assignment6

class Currying {

 def add (x:Int)(y:Int)(z:Int) :Int=x+y+z
}
object processCurrying extends App {

      var obj:Currying = new Currying
      var result=obj.add(10)(20)_
      println(result(20))
      var result2=obj.add(10)_
      println(result2(10)(80))


}