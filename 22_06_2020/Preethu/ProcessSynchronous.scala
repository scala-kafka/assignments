package com.scala.synchronous

object ProcessSynchronous extends App {

  var obj1=new EmployeeSyncService
  println("==============Process Started============")
  var empData=List(EmployeeSync(1),EmployeeSync(2),EmployeeSync(3),EmployeeSync(4),EmployeeSync(5))
  var deptData=List(DepartmentSync(3),DepartmentSync(4),DepartmentSync(5))
  var empCount=obj1.countEmployee(empData)
  var deptCount=obj1.countDepartment(deptData)
  println("Employee ="+empCount)
  println("Department ="+deptCount)
  println("=============Process End=================")
}
