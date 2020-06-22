package com.info.basics.day4

class OverloadClass {
  var pno:Int = 12
  var prodName:String = "Tally"
  var description:String = "Accounting Software"
  var price:Double = 1258.12
  var manufacturedYear:String = "2020"
  var color:Long = 2165464L

  def this(pno: Int) {
    this()
    this.pno = pno
  }

  def this(pno: Int, prodName: String) {
    this(pno)
    this.prodName = prodName
  }

  def this(
          pno: Int,
          prodName: String,
          description: String,
          price:Double,
          manufacturedYear:String,
          color:Long) {
    this()
    this.pno=pno
    this.prodName=prodName
    this.description=description
    this.price=price
    this.manufacturedYear = manufacturedYear
    this.color=color
  }

  override def toString = {
    "%s Installation %s with product support.".format(pno, prodName)
  }
}
