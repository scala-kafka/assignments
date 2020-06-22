package com.info.basics.day3

import scala.collection.mutable.ArrayBuffer

object Sample {

  def main(args: Array[String]): Unit = {
    var first = Array("one", "two", "three", "four", "five")
    var second = Array("six", "seven", "eight", "nine", "ten")

    println("Print first part of the array elements...")
    printArray(first)
    println("Print second part of the array elements...")
    printArray(second)

    println("Print combined array elements...")
    combinedArray(first, second)

    var firstArayBuffer = ArrayBuffer("one", "two", "three", "four", "five")
    var secondArayBuffer = Array("six", "seven", "eight", "nine", "ten")

    val combined = firstArayBuffer ++ secondArayBuffer

    println("Print combined Buffered array elements...")
    combinedArrayBuffer(combined)

    println("String Concat example using Scala...")
    println(strConcat(first))

    println("String Slice example using Scala...")
    println(strSlice(first))

    println("String Sub String example using Scala...UST Global")
    strsubstring()

    println("Reverse example using Scala...UST Global")
    strReverse()
  }

  def printArray(first:Array[String]):Unit={
    first.foreach(x => println(x))
  }

  def combinedArray(first:Array[String], second:Array[String]):Unit= {
    // Array Combine using "++" symbol
    var numbers = first ++ second
    numbers.foreach(x => println(x))
  }

  def combinedArrayBuffer(arr:ArrayBuffer[String]):Unit ={
    arr.foreach(x => println(x))
  }

  def strConcat(first:Array[String]):String = {
    var str1 = first(0)
    var str2 = first(1)

    return str1 + str2 + first(2) + first(3)
  }


  def strSlice(first:Array[String]):String = {
    var result =  first(0) + "," + first(1) + "," + first(2) + "," + first(3)
    var marksArray: String = result.slice(0,3)
    return marksArray
  }

  def strsubstring() : Unit ={
    println("UST Global".substring(4,10) )
  }

  def strReverse() : Unit = {

    val strList: List[String] = List("UST", "Global","Trivandrum")
    val strList1: List[String] = List("10", "9","8")
    println(strList.reverse)
    println(strList1.reverse)

  }
}
