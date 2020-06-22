package com.scala.synchronous

class EmployeeSyncService {
  var empDao=new EmployeeSyncDao
  def countEmployee=(employeeList:List[EmployeeSync])=>
  {
    var count=empDao.countEmployee(employeeList)
    count
  }
  def countDepartment=(deptList:List[DepartmentSync])=>
  {
    var count=empDao.countDepartment(deptList)
    count
  }


}
