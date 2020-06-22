package com.info.basics.day4

object MethodOverLoadObject {

  var methodOverLoad:MethodOverLoadClass = new MethodOverLoadClass();
  def print(id: Int, name: String) = {
    println(s"m2 id = $id name=$name")
  }

  def print(name: String, id: Int) = {
    println(s"m2 name = $name id=$id")
  }

  def print(id: Int, name: String, sal: Double) = {
    println(s"m3 name = $name id=$id sal=$sal")
  }

  def print(id: Int, sal: Double = 100, name: String) = {
    println(s" m4 name = $name  sal=$sal id=$id sal=$sal")
  }

  def main(args: Array[String]): Unit = {
    print(24264, "UST Global")
    print("UST Global", 24264)
    print(24264, "UST Global", 44000)
  }
}
