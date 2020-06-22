package com.info.day7

/**
  * Assigment 7 (Day 7 -19/06/2020 )
  * task achieving set functionality by using array
  */
class MathSet {
  private var values: Array[Int] = Array()

  // find duplicate value in array
  def isDuplicate(value: Int): Boolean = values.contains(value)

  // one parameter constructor
  def this(params: Array[Int]) {
    this();
    params.foreach(x => add(x))
  }

  // adding new value to array
  def add(value: Int): Unit = {
    if (!isDuplicate(value))
      values = values :+ value
  }

  //removing of value from array
  def removeOf(num: Int) = values = values.filter(x => x != num)

  //getting array of values
  def getValues(): Array[Int] = values

  // difference between two arrays
  def diff(arr: Array[Int]): Array[Int] = values.diff(arr)

  // adding array
  def combine(arr: Array[Int]) = arr.foreach(x => add(x))

}
object Demo {
  def main(args: Array[String]): Unit = {

    var mathSet = new MathSet(Array(20, 30, 20, 30))
    mathSet.add(40);
    mathSet.add(40);
    // result will be (20,30,40)
    mathSet.getValues().foreach(x => println(x))

    // =====================================
    println("=====")
    var mathSet1 = new MathSet()
    mathSet1.add(10)
    mathSet1.add(20)
    mathSet1.add(20)
    // result will be (10,20)
    mathSet1.getValues().foreach(x => println(x))
    mathSet1.combine(Array(30, 40, 10))

    println("after combing (30, 40, 10)=====")
    mathSet1.getValues().foreach(x => println(x))

    mathSet1.removeOf(20)
    println("after remove of 20=====")
    mathSet1.getValues().foreach(x => println(x))

  }
}
//==============================================
//=============================================
/**
  * Assigment 7 (Day 7 -19/06/2020 )
  * task achieving factorial  functionality by using higher order function
  */
class Factorial {

  // factorial function
  def findFact(num: Int): Int = if (num == 1) 1 else num * findFact(num - 1)

  // higher order function
  def find(operation: (Int) => Int, message: (String) => Unit, num: Int) = {
    message("factorial of " + num + "=" + operation(num))
  }
}
object FactorialDemo extends App {
  var factorial = new Factorial
  var printMsg = (str: String) => println(str)

// calling higher order function
  factorial.find(factorial.findFact, printMsg, num = 5)
}
