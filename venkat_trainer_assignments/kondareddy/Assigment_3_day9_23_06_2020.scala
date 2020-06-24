package com.info.day9

import slick.jdbc.MySQLProfile.api._
import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class EmployeeDAO {
  var driverName: String = "com.mysql.cj.jdbc.Driver"
  var url: String =
    "jdbc:mysql://localhost:3306/mydb?user=root&password=root&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"
  val db = Database.forURL(url, driver = driverName)

  // creating mapping class
  private class EmployeeTable(tag: Tag)
      extends Table[EmployeeRow](tag, "Employee") {
    def employeeId = column[Int]("EMPLOYEEID", O.PrimaryKey, O.AutoInc)

    def employeeName = column[String]("EMPLOYEENAME")
    def gender = column[String]("GENDER")
    def salary = column[Double]("salary")

    def * =
      (employeeId, employeeName, gender, salary) <> ((EmployeeRow.apply _).tupled, EmployeeRow.unapply)
  }

  // creating instance of mapping class
  private val employees = TableQuery[EmployeeTable]

  /**
    * Task 1
    * Get Top-n highest Paid Employees from database employee table
    * @param num
    * @return
    */
  def topEmployees(num: Int): Future[Any] = {
    val action =
      employees.sortBy(emp => emp.salary.desc.nullsLast).take(num).result
    db.run(action)
  }

  /**
    * Task 2
    * Get All Employees Where Name Contains v or V from database employee table
    * @param str
    * @return
    */
  def getEmployeeStartsWith(str: String): Future[Any] = {
    val action = employees
      .filter(
        emp =>
          emp.employeeName.startsWith(str) || emp.employeeName.startsWith(str)
      )
      .result
    //    action.statements.foreach(println(_))
    db.run(action)
  }

  /**
    * Task 3
    *Get a max salary and also an Employee whose salary is Max
    * (if need write two methods. One is to get max salary and
    * another is to get Employee row
    */
  def getMaxSalEmp(): Future[Any] = {
    val action =
      employees.sortBy(emp => emp.salary.desc.nullsLast).take(1).result
    return db.run(action)
  }

  /**
    * Task 4
    *Get a min salary and also an Employee whose salary is Min
    * (if need write two methods.
    * One is to get min salary and another is to get Employee row)
    */
  def getMinSalEmp(): Future[Any] = {
    val action =
      employees.sortBy(emp => emp.salary.asc.nullsLast).take(1).result
    return db.run(action)
  }

  /**
    * Task 5
    * Get an average salary of employees. (Double)
    */
  def getAvgSal(): Unit = {

    val action = employees.map(x => x.salary).result
    db.run(action)
      .onComplete({
        case Success(x: Vector[Double]) => println(x.reduce(_ + _) / x.length)
        case Failure(err) =>
          println("error inside getAvgSal")

      })
  }

  /**
    * Task 6
    * Get all employees whose salary is more than the average salary of employees
    */
  def getGT_Avg_Sal(): Unit = {
    val action = employees.map(x => x.salary).result
    db.run(action)
      .onComplete({
        case Success(x: Vector[Double]) => {
          println("Avg sal ", x.reduce(_ + _) / x.length)
          getEmployeesSal_>(x.reduce(_ + _) / x.length)
        }
        case Failure(err) =>
          println("error inside getAvgSal")

      })
  }

  /**
    * getting > sal employees
    * @param sal
    * @return
    */
  def getEmployeesSal_>(sal: Double): Future[Any] = {
    val action = employees
      .filter(emp => emp.salary > sal)
      .result
    return db.run(action)
  }

}
