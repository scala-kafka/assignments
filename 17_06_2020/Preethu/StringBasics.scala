package com.scala.stringOperations

object StringBasics {


  def main(args: Array[String]): Unit = {
     var  str:String= "Scala Training"
    println(" String :"+str)
    println(" String Length :"+str.length)
     var strToConcat=" by UST"
     var newStr=str.concat(strToConcat)
    println("After Concatination one :"+newStr)
    println("Concatination second method :"+str+strToConcat)

    println("String reverse :"+str.reverse)

    println("To lowercase :"+newStr.toLowerCase)
    println("To String :"+"123".toString)

    println("Substring : "+newStr.substring(5,15))
    println("Slice String :"+newStr.slice(5,15))

    var list=List(10,20,30,40,50)
    println("List slice :"+list.slice(1,3))

    //StringBuilder
    val sb:StringBuilder =new StringBuilder("Hello")
    println("StringBuilder : "+sb+"World")
    println("StringBuilder append :"+sb.append(" World"))
    println("Delete StringBuilder :"+sb.delete(0,5))
    println("Clear StringBuilder :"+sb.clear())
    sb.append("Scala")
    println("Insert : "+sb.insert(5," Training"))
    println("To string :"+sb.toString())
  }
}
