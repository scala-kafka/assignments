package com.info.hashequals

import com.info.caseclass

class Employee(var employeeId:Int, var employeeName:String, var salary:Double){

  override def equals(obj: Any): Boolean = {
    var flag:Boolean = true

    if(obj.isInstanceOf[caseclass.Employee]){
      var emp: caseclass.Employee = obj.asInstanceOf[caseclass.Employee]  // any type to employee type

      if(employeeId != emp.employeeId){
        flag = false
      }else if(!employeeName.equals(emp.employeeName)){
        flag = false
      }else if(salary != emp.salary) {
        flag = false
      }
    }
    else{
      flag = false
    }
    return flag
  }

  override def hashCode(): Int = {
    return 94729847  // custom hashcode
  }
}

object HashEqualDemo{

  def main(args: Array[String]): Unit = {

    var employee1: caseclass.Employee = new caseclass.Employee(1001, "David", 56000)
    var employee2: caseclass.Employee = new caseclass.Employee(1001, "David", 56000)

    println(employee1 == employee2)
    println(employee1.equals(employee2))

    println(employee1.hashCode())
    println(employee2.hashCode())

  }
}
