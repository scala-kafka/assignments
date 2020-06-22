package com.info.basics.day5

class Employee {
  private var eno:Int = 0
  private var name:String = "UST Global"
  private var salary:Double = 0.00

  def Eeno_=(eno:Int):Unit ={
    this.eno=eno
  }

  def Ename_=(name:String):Unit ={
    this.name=name
  }

  def Esalary_=(salary:Double):Unit ={
    this.salary=salary
  }

  def getEno: Int = {eno}
  def getName: String = {name}
  def getSalary: Double = {salary}

  def this(x:Int){
    this()
  }

  def this(x:Int, y:Int){
    this()
  }

  def printDetails():Unit={
    println("Number" + eno)
    println("Name" + name)
    println("Salary" + salary)
  }
}
