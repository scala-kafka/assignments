package com.scala.assignment4

import java.util.Scanner

object EmployeeSalaryRate {

  def findRate (x:Double): Int ={
    var result= x match {
      case x if(x <10000) => 1
      case x if(x>10000 && x<20000)=>2
      case x if(x>20000 && x<40000)=>3
      case x if(x>40000 && x<60000)=>4
      case _ =>5
    }
    result
  }


  def main(args: Array[String]): Unit = {
   var input =new Scanner(System.in)
    println("Enter Empno ,Name and salary")
    var empNo=input.nextInt();
    var empName=input.next();
    var empSalary=input.nextDouble();
    var rate=findRate(empSalary)
    println(s"Emp No = $empNo ,Employee Name =$empName ,Salary Rate=$rate")

  }

}
