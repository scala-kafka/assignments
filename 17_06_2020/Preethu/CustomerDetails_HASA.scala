package com.scala.assignment4

class CustomerDetails_HASA {
  var accNo:String =_
  var phoneNo:Int=_
  var accountType:String=_
 //Composition
  def this(accNo:String,pNo:Int){
    this
    this.accNo=accNo
    this.phoneNo=pNo
  }
  //Aggregation
  def getAccountType(): Unit ={
    accountType
  }
  def setAccountType(accType:String): Unit ={
    this.accountType=accType
  }
  def printCustomer(): Unit ={
    println(s"Customer Account =$accNo ,Phone =$phoneNo,Account Type=$accountType")
  }

}
