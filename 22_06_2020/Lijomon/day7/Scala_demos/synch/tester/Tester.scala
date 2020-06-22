package com.info.synch.tester

import com.info.synch.service.EmployeeService
import com.info.synch.bean.Department
import com.info.synch.bean.Employee

object Tester {
  var empService:EmployeeService =  new EmployeeService();
  def main(args: Array[String]): Unit = {
    println("Started with the Process");
    println("=========================");
    var departmentList:List[Department] = List(Department(2001,"Java"),Department(2002,"Scala"),
      Department(2003,"Spark"),Department(2004,"Python"))
    var employeeList:List[Employee] = List(Employee(3001,"David"),Employee(3002,"Stuart"),
      Employee(3003,"Dan"),Employee(3004,"John"),
      Employee(3005,"Jim"),Employee(3005,"Sam"))

     empService.createEmployee(employeeList);
     empService.createDepartment(departmentList);
    
    println("Process Completed");
                                                                                       
  }
}
/// Blocked Call