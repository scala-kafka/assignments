package com.info.asynch.service

import com.info.asynch.dao.EmployeeDAO
import com.info.asynch.bean.Employee
import com.info.asynch.bean.Department
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

class EmployeeService {
  var empDAO:EmployeeDAO  = new EmployeeDAO();
  def createEmployee(employeeList:List[Employee]):Future[Int]={
    var count:Future[Int]=Future{0}; //requires execution context
    count=empDAO.createEmployee(employeeList);
    count
  }
  
  def createDepartment(departmentList:List[Department]):Future[Int]={
    var count:Future[Int]=Future{0}; //requires execution context
    count=empDAO.createDepartment(departmentList);
    count;
  }
  
}
// here Future wrapping is not required as the returned result is already a type of future 
/*
 * We've had to import scala.concurrent.Future to have access to the Future type
 * We've also had to import scala.concurrent.ExecutionContext.Implicits.global 
 * which will place a default thread pool in scope on which our Future will be executed asynchronously. 
 * If you are not familiar with ExecutionContext,
*/