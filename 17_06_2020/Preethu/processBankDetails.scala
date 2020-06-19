package com.scala.assignment4

object processBankDetails {
  def main(args:Array[String]): Unit ={

   var bank:BankDetails_HASA = new BankDetails_HASA(accType="Savings",accNo="FV1230P",ifscCode=1090999,branchName="ERNAKULAM",pNo=1130919301)
      bank.printBankDetails()

  }

}
