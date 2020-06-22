package com.info.basics.day4

class CrediCard extends Payment() {
  override def payMobileBill(): Unit ={
    println("Credit Card Payment is in process...")
  }
}
