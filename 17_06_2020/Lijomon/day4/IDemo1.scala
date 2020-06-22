package com.info.basics.day4

object IDemo1 {
  def main(args: Array[String]): Unit = {
    var person:Person = new Person
    person.printPerson()

    var employee:Employee1 = new Employee1
    employee.printEmployee()
    employee.printPerson()
  }
}

class Person {            // super class
  def printPerson(): Unit ={
    println("Top level class")
  }
}

class Employee1 extends Person{      // sub class
  def printEmployee(): Unit ={
    println("Employee class extends person [sub class]")
  }
}

