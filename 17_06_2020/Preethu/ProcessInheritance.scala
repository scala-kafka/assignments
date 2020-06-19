package com.scala.assignment4

object ProcessInheritance {

def main(args: Array[String]): Unit ={
  var baseCalss:Inheritance=new Inheritance
  var subClass:InheritanceTwo=new InheritanceTwo

  println("Subclass >>Base method ")
  subClass.printAnimal()
  println("Subcclass >>subclass method")
  subClass.specifyFeature()
  println("Baseclass >> Base method")
  baseCalss.printAnimal()

  var obj:Inheritance=new InheritanceTwo
  println("-------")
  obj.printAnimal()
}
}
