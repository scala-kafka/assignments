package com.scala.assignment5

trait MyTrait1 {
  var state="Punjab"
  val streetNo:Int=10
  def library()

  def categoryOfBooks(): Unit ={
    println("Category of books >> MyTrait1")
  }

}
trait MyTrait2{
  var buildingNo:Int
  def locationDetails()
}