package com.info.basics.day5

class Cheque extends Payment(){
  override def payMobileBill(): Unit ={
    println("Cheque Payment is in process...")
  }
}
