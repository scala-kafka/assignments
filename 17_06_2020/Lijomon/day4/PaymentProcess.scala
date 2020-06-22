package com.info.basics.day4

object PaymentProcess {

  var crediCard:Payment = new CrediCard
  var debitCard:Payment = new DebitCard
  var cheque:Payment = new Cheque
  var paytm:Payment = new Paytm

  def main(args: Array[String]): Unit = {
    crediCard.payMobileBill()
    debitCard.payMobileBill()
    cheque.payMobileBill()
    paytm.payMobileBill()
  }

}
