package com.info.basics.day4

object OverLoadObjectDemoObject {
  def main(args: Array[String]): Unit = {
    println(new OverloadClass)
    println(new OverloadClass(10))
    println(new OverloadClass(12, "Tally"))
    println(new OverloadClass(14, "Tally", description = "Accounting", 68.55d, "2012", 546456546L))
  }
}
