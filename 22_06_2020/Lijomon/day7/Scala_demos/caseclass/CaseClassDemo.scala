package com.info.caseclass

case class Employee(var employeeId:Int, var employeeName:String, var salary:Double){
  // hashcode
  // equals()
  // apply()
  // unapply()

}

object CaseClassDemo {
  def main(args: Array[String]): Unit = {

    var emp1:Employee = Employee(1001, "David", 45000)
    var emp2:Employee = Employee(1001, "David", 45000)

    println(emp1.equals(emp2))

    println(emp1.hashCode())
    println(emp2.hashCode())

  }

}
