package com.scala.asynchronous

import scala.concurrent.{Await, Future}
import scala.concurrent.duration.Duration
import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.Implicits.global

object ProcessAsynchronous extends App {
  var obj1=new EmployeeSErvice
  println("==============Process Started============")
  var empData=List(Employee(1),Employee(2),Employee(3),Employee(4),Employee(5))
  var deptData=List(Department(3),Department(4),Department(5))

  var empCount:Future[Int]=obj1.countEmployee(empData)
  var deptCount:Future[Int]=obj1.countDepartment(deptData)


  var v1=Await.result(empCount,Duration("30 second"))
  var v2=Await.result(deptCount, Duration("30 second"))
  println("Result ="+v1+v2)
  println("=============Process End=================")
}
object  ProcessAsynch2 extends App{
  var obj1=new EmployeeSErvice
  println("==============Process Started============")
  var empData=List(Employee(1),Employee(2),Employee(3),Employee(4),Employee(5))
  var deptData=List(Department(3),Department(4),Department(5))

  var empCount:Future[Int]=obj1.countEmployee(empData)
  var deptCount:Future[Int]=obj1.countDepartment(deptData)


  empCount.onComplete{
    case Success(x)=>println(s" Result: ${x}");
    case Failure(f)=>println(s"Failure: ${f}")
  }

  println("=============Process End=================")
  System.in.read()
}
object ProcessAsychronous3 extends App{
  var obj1=new EmployeeSErvice
  println("==============Process Started============")
  var empData=List(Employee(1),Employee(2),Employee(3),Employee(4),Employee(5))
  var deptData=List(Department(3),Department(4),Department(5))

  var empCount:Future[Int]=obj1.countEmployee(empData)
  var deptCount:Future[Int]=obj1.countDepartment(deptData)

  var countCombined:Future[String]= deptCount.zipWith(empCount)(
    (rDept,rEmployee)=>
      "Department Created: "+rDept
        +", Employee created: "+rEmployee
  )

  countCombined.onComplete{
    case Success(x)=>println(s" Result: ${x}");
    case Failure(f)=>println(s"Failure: ${f}")
  }

  println("=============Process End=================")
  System.in.read()
}