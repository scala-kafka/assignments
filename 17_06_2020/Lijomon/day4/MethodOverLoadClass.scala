package com.info.basics.day4

class MethodOverLoadClass {
  var trNumber:Int = 11
  var cardType:String = "Visa"
//  var fullname:String = ""
//  var exiryDate:String=""
//  var cardCode:String=""

  var balance:Double = 1000000

  def payAmount(amount:Double):Boolean = {
    var result:Boolean = false
    if (validate()){
      balance = balance-amount
      println(balance)
      result=true
    }
    result
  }

  /*
  Method to validate the Balance and Expiry Date
   */
  def validate():Boolean = {
    return true
  }
}
