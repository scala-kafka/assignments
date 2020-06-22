package com.scala.asynchronous
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
class EmployeeDao {

  def countEmployee=(employeeList:List[Employee])=>Future{
    var count=0
    println("===========Employee DAO==============")
    for(empList<-employeeList){
      count=count+1
      Thread.sleep(3000);
    }
    count
  }
  def countDepartment=(departmentList:List[Department])=>Future{
    var count=0
    println("===========Department DAO==============")
    for(deptList<-departmentList){
      Thread.sleep(2000);
      count=count+1

    }
    count
  }
}
