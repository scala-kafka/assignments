package com.scala.assignment4

object MethodOverLoading {


  def cardDetails(): Unit ={
    println("No Parameters passed")
  }
  def carDetails(acNo:Int): Unit ={
    println(s"Account No = $acNo")
  }
  def cardDetails(acNo:Int,accType:String): Unit ={
    println(s"Account No= $acNo ,Type =$accType")
  }

  def main(args :Array[String]): Unit ={
    cardDetails()
    carDetails(23523)
    cardDetails(23423,"Debit Card")
  }
}