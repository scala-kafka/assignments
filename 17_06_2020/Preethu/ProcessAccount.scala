package com.scala.exceptionHandling

import java.util.{InputMismatchException, Scanner}

class ProcessAccount {

  def withDraw(): Unit ={


    try {
      var accountBalance:Int=10000
      val input=new Scanner(System.in)
      println("Enter Amount to debit.....")
      val amountToDebit =input.nextDouble()
      val balance=0
      if((accountBalance - amountToDebit) >= 5000){
        println("Account Balance : "+(accountBalance - amountToDebit ))
      }else{
        println("No sufficent balance")
      }
    }catch {
      case e : InputMismatchException => println("Please enter an Integer value")
    }finally {
      println("Finally block executed")
    }

  }
//Custom exception
  def evenNumberCheck(): Unit ={
    val input=new Scanner(System.in)
    println("Enter a number.....")
    var number =input.nextInt()

    if(number % 2==0){
      println(number+"  is even")
    }else {
      throw new EvenNumberException("Not an even number")
    }

  }

}

