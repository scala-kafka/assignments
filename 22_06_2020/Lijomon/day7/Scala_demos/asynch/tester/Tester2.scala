package com.info.asynch.tester

import com.info.asynch.service.EmployeeService
import com.info.asynch.bean.Department
import com.info.asynch.bean.Employee

import scala.concurrent.Await
import scala.concurrent.duration._
import scala.concurrent.Future
import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.Implicits.global

object Tester2 {
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

     empCount.onComplete{
         case Success(x)=>println(s"Redeemed Result: ${x}");
         case Failure(f)=>println(s"Failure: ${f}")
         println("Click any key to terminate program");
     };
     
     println("After Call Back method");
     println("Press Any key to Stop")
     println("=====================")
     
     System.in.read()
     //Thread.sleep(150000)                                                                                    
  }
}
