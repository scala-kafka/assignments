package com.scala.assignment6

import java.util.Scanner

object Factorial extends App {
  var factorial=(num1:Int)=>{
    var fact=1;
    for(value<-1 to num1){
      fact=fact*value
    }
    fact
  }
def findFactorial(x:Int,fact:(Int=>Int)): Int =  fact(x)

  val input=new Scanner(System.in)
  println("Enter a number")
  val num=input.nextInt()

  var result=findFactorial(num,factorial)
  println(result)


}
