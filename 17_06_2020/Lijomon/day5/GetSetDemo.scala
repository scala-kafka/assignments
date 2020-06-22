package com.info.basics.day5

object GetSetDemo {
  def main(args: Array[String]): Unit = {
    var employee:Employee = new Employee
    //employee.getClass.getDeclaredMethods.map(x => x.getParameterCount).foreach(x=>println(x))
    employee.getClass.getDeclaredMethods.map(x => x.getName).foreach(x=>println(x))
    println("==========================================")
    employee.getClass.getConstructors.map(x => x.getName).foreach(y=>println(y))
  }
}
