package com.scala.asynchronous

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
class EmployeeSErvice {
  var empDao=new EmployeeDao
  def countEmployee(employeeList:List[Employee]):Future[Int]= {
    var count:Future[Int]= Future{0}
    count=empDao.countEmployee(employeeList)
    count
  }
  def countDepartment(deptList:List[Department]):Future[Int]={
    var count:Future[Int]= Future{0}
    count=empDao.countDepartment(deptList)
    count
  }
}
