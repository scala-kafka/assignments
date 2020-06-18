package com.info.day5
class Parent {
  def printName(): Unit = {
    println("Parent class print name method")
  }

}
class Child extends Parent {
  override def printName(): Unit = {

    super.printName()
    println("Child class print name method")
  }
}

object OverridingExample {
  def main(args: Array[String]): Unit = {

//    var child: Child = new Child
//    child.printName();

    // var parent:parent=new Child();
    var parent: Parent = new Child
    parent.printName()
  }
}
