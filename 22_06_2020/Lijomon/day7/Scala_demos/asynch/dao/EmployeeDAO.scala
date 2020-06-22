package com.info.asynch.dao

import com.info.asynch.bean.Employee
import com.info.asynch.bean.Department
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

class EmployeeDAO {
  def createEmployee(employeeList:List[Employee]):Future[Int]=Future{
    var count:Int=0;
    for(itr<-employeeList){
      count+=1;
      Thread.sleep(6000);
      println("Employee Created by: ["+Thread.currentThread().getName+"]");
    }
    count
  }
  
  def createDepartment(departmentList:List[Department]):Future[Int]=Future{
    var count:Int=0;2
    for(itr<-departmentList){
      count+=1;
      Thread.sleep(3000);
      println("Department Created by: ["+Thread.currentThread().getName+"]");
    }
    count;
  }
  
}
//Future is used to wrap the data type, dont use return at line 27 and 17
/*
 * We've had to import scala.concurrent.Future to have access to the Future type
 * We've also had to import scala.concurrent.ExecutionContext.Implicits.global 
 * which will place a default thread pool in scope on which our Future will be executed asynchronously. 
 * If you are not familiar with ExecutionContext,
*/
