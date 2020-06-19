package com.scala.assignment4

class Product(pno:Int) {
  var name:String=_
  var description:String =_
  var price:Double =_
  var year:Int =_
  var color:String =_

  def this(pNo:Int,name:String,desc:String){
    this(pNo)
    this.name=name
    this.description=desc
  }
  def this(pNo:Int,name:String,desc:String,price:Double,mYear:Int){
    this(pNo,name,desc)
    this.price=price
    this.year=mYear
  }
  def this(pNo:Int,name:String,price:Double) {
    this(pNo)
    this.name = name
    this.price = price
  }
    def this(pNo:Int,name:String,price:Double,color:String){
      this(pNo,name,price)
      this.color=color
    }
    def printProductData(): Unit ={
      println(s"Pno =$pno,Name =$name,Description =$description,Price=$price,Manufacturer year =$year,Color=$color")
    }

}
