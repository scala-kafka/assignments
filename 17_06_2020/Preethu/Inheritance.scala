package com.scala.assignment4

class Inheritance {
  def printAnimal(): Unit ={
    println("Animal Category")
  }

}
class InheritanceTwo extends Inheritance {
    def specifyFeature(): Unit ={
      println("Elephant is the largest land animal")
    }
}