package com.scala.assignment5

class MyClass1 extends MyTrait1 with MyTrait2 {

  def library(): Unit ={
    println("Library implementation >> MyClass1")
  }
  override def categoryOfBooks(): Unit ={
    super.categoryOfBooks()
    println("Category of books >> Myclass1")
  }
  //Class method
  def authorName(): Unit ={
    println("Authors details >> MyClass1")
  }

  //method from trait 2
  state = "Kerala"
  override val streetNo: Int = 309
  var buildingNo=232
  def locationDetails(): Unit ={
  println(s"State = $state ,Street No =$streetNo,sBuilding No = $buildingNo")
  }
}
