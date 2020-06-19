package com.scala.assignment4

object ConstructorOverloading {
  def main(args: Array[String]): Unit = {
    var pdt1:Product=new Product(1);
    pdt1.printProductData()
    var pdt2:Product=new Product(123,"Smartphone","64GB");
    pdt2.printProductData()
    var pdt3:Product =new Product(321,"LCD TV",45000,"BLACK")
    pdt3.printProductData()
  }
}
