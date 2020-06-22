package com.info.basics.day7

object ScalaDemo extends App {
  var customer1:Customer = new Customer;  var customer2:Customer = new Customer;  var customer3:Customer = new Customer;
  customer1.name = "UST1";  customer2.name = "UST2";  customer3.name = "UST3";
  val salaries = Seq(customer1, customer2, customer3)
  val newSalaries = salaries.map(x => {println(x.Increment)})
  println(newSalaries)

}

class Customer(){
  //Default Balance
  var name:String="UST Global"
  var balance:Int = 25000
  def Increment(): Int ={
    var newSal = balance+5000
    newSal
  }
}
