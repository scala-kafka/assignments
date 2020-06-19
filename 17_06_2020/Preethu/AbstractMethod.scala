package com.scala.assignment5

abstract class AbstractMethod {

  def employeeDetails()

  def employerDetails(): Unit ={
  print("Employer called >> Base class")
  }
}
class ImplementAbstract extends AbstractMethod {
   def employeeDetails(): Unit = {
    println("Employee called >> Subclass")
  }
}

object abstractTest{
  def main(args: Array[String]): Unit = {
      var obj:AbstractMethod=new ImplementAbstract
      obj.employeeDetails()
      obj.employerDetails()
  }
}