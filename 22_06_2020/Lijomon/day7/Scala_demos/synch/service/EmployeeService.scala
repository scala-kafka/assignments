package com.info.synch.service

import com.info.synch.dao.EmployeeDAO
import com.info.synch.bean.Employee
import com.info.synch.bean.Department

class EmployeeService {
  var empDAO:EmployeeDAO  = new EmployeeDAO();
  def createEmployee(employeeList:List[Employee])={
    var count:Int=0;
    count=empDAO.createEmployee(employeeList);
    count
  }
  
  def createDepartment(departmentList:List[Department]){
    var count:Int=0;
    count=empDAO.createDepartment(departmentList);
    count;
  }
  
}