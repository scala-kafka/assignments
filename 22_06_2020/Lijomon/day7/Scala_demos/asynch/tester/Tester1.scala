package com.info.asynch.tester

import com.info.asynch.service.EmployeeService
import com.info.asynch.bean.Department
import com.info.asynch.bean.Employee

import scala.concurrent.Await
import scala.concurrent.duration._
import scala.concurrent.Future
import scala.language.postfixOps

object Tester1 {
  var empService:EmployeeService =  new EmployeeService();
  def main(args: Array[String]): Unit = {
    println("Started with the Process");
    println("=========================");
    var departmentList:List[Department] = List(Department(2001,"Java"),Department(2002,"Scala"),
      Department(2003,"Spark"),Department(2004,"Python"))
    var employeeList:List[Employee] = List(Employee(3001,"David"),Employee(3002,"Stuart"),
      Employee(3003,"Dan"),Employee(3004,"John"),
      Employee(3005,"Jim"),Employee(3005,"Sam"))

    var empCount:Future[Int]= empService.createEmployee(employeeList);
     var deptCount:Future[Int]=empService.createDepartment(departmentList);


     var v1:Int= Await.result(empCount, 600 seconds);
     var v2:Int= Await.result(deptCount, 600 seconds);

     println("Process Completed: "+(v1+v2));
                                                                                       
  }
}
