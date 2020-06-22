package com.info.basics.day4

class Employee {
  def Employee{
    println("Default Constructoer without param...")
  }

  def Employee(eno:Int){
    println("Constructor with single param")
  }

  def Employee(eno:Int, name:String){
    println("Constructor with two param")
  }

}
