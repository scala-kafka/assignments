package com.scala.synchronous

class EmployeeSyncDao {

  def countEmployee=(employeeList:List[EmployeeSync])=>
    {var count=0
      println("===========Employee DAO==============")
      for(empList<-employeeList){
        count=count+1
        Thread.sleep(3000);
      }
      count
    }
  def countDepartment=(departmentList:List[DepartmentSync])=>
  {
    var count=0
    println("===========Department DAO==============")
    for(deptList<-departmentList){
      Thread.sleep(2000);
      count=count+1

    }
    count
  }
}
