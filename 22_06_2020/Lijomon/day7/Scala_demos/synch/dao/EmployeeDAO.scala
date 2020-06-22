package com.info.synch.dao

import com.info.synch.bean.Employee
import com.info.synch.bean.Department

class EmployeeDAO {
  
  def createEmployee(employeeList:List[Employee])={
    var count:Int=0;
    for(itr<-employeeList){
      count+=1;
      Thread.sleep(6000);
      println("Employee Created by: ["+Thread.currentThread().getName+"]");
    }
    count
  }
  
  def createDepartment(departmentList:List[Department])={
    var count:Int=0;
    for(itr<-departmentList){
      count+=1;
      Thread.sleep(3000);
      println("Department Created by: ["+Thread.currentThread().getName+"]");
    }
    count;
  }
  
}