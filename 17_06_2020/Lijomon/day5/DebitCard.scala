package com.info.basics.day5

class DebitCard extends Payment(){
  override def payMobileBill(): Unit ={
    println("Debit Card Payment is in process...")
  }
}
