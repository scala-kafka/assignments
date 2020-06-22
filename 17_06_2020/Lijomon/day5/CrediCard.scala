package com.info.basics.day5

class CrediCard extends Payment() {
  override def payMobileBill(): Unit ={
    println("Credit Card Payment is in process...")
  }
}
