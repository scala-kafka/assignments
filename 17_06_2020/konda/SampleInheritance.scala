package com.info.day5

class A {
  def parent(): Unit = {
    println("a class method")
  }
}

class B extends A {
  def child() = {
    println("b class method")
  }
}

object SampleInheritance {
  def main(args: Array[String]): Unit = {
    var a: A = new A();
    a.parent();

    var b: B = new B();
    b.child()
    b.parent()

  }
}
