package com.info.day6

object InnerMethods {

  def familyMembers(): Unit = {
    println("surname =ABC")

    def son(): Unit = {
      println("son = A")
    }

    def wife(): Unit = {
      println("wife =B")
    }
    son();
    wife();
  }

  def main(args: Array[String]): Unit = {
    familyMembers();
  }

}
