package com.info.day5

class Father {
  def parent(): Unit = {
    println("father  class method")
  }
}

class Son extends Father {
  def child() = {
    println("son class method")
  }
}

object SampleInheritance {
  def main(args: Array[String]): Unit = {
    var a: Father = new Father();
    a.parent();

    var b: Son = new Son();
    b.child()
    b.parent()

  }
}
