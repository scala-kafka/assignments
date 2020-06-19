package com.scala.assignment4

class BankDetails_HASA {

  var branchName:String =_
  var ifscCode:Int =_
  var customer:CustomerDetails_HASA =_

  def this(branchName:String,ifscCode:Int,accNo:String,pNo:Int,accType:String){
    this()
    this.branchName=branchName
    this.ifscCode=ifscCode
    this.customer=new CustomerDetails_HASA(accNo,pNo)
    customer.setAccountType(accType)
  }

  def printBankDetails(): Unit ={
    println(s"Branch =$branchName ,IFSC =$ifscCode")
    customer.printCustomer()
  }
}
