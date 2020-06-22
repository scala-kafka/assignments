package com.info.basics.day7

object Assignments extends App{
  var prodcutLists:List[Product] = Products.getProductList

  println("1st Assignment - Collect and print details of all the products")
  prodcutLists.foreach((prdct)=>println(prdct))

  println("2nd Assignment - Collect and Print Details of the Product having price greater than or equal to 30000f")
  var product36000:List[Product] = prodcutLists.filter(product=> product.price >= 30000)
  product36000.foreach((prdct)=>println(prdct.productName))

  println("3rd Assignment - Collect the details of the product having price greater than or equal to 30000f")
  var product36000_1:List[Product] = prodcutLists.filter(product=> product.price >= 30000)
  product36000_1.foreach((prdct)=>println("[ProductId: "+prdct.productId+" ProductName: "+prdct.productName+", Price:"+prdct.price))

  println("4th Assignment - From List of Products get the List Of id,name separately")
  prodcutLists.foreach((prdct)=>println("[ProductId: "+prdct.productId+" ProductName: "+prdct.productName))

  println("5th Assignment - Find Maximum price")
  var result_max:Double = prodcutLists.map((x) => x.price).max
  println(result_max)

  println("5th Assignment - Find Minimum price")
  val result_min:Double = prodcutLists.map((x) => x.price).min
  println(result_min)

  println("5th Assignment - Price Sum")
  val result_sum:Double = prodcutLists.map((x) => x.price).sum
  println(result_sum)

  println("5th Assignment - Average Price")
  val result_size:Long = prodcutLists.size
  println(result_sum/result_size)

  println("6th Assignment - Find count of products have distinct price")
  val tempProdcutList = prodcutLists.map((x) => x.price).distinct
  println(tempProdcutList)

  println("7th Assignment - Find the product that has Maximum price [Hint: use map]")
  val tempProdcutMaxPrice = prodcutLists.map((x) => x.price).max
  println(tempProdcutMaxPrice)

  println("8th Assignment - Collect the details of the product having name starting with T as map, id should be key and value should be name of the product")
  println(prodcutLists.filter(product => product.productName.startsWith("T")))

  //prodcutLists.foreach((prdct)=>println("[ProductId: "+prdct.productId+" ProductName: "+prdct.productName + "Product Type" + prdct.productType))
  println("9th Assignment - Group the products by productType")
  prodcutLists.groupBy(ele => ele.productType).foreach(println)

}

//PFA for scala file (ProductDetails.scala) and complete the below queries.
//
//1 Collect and print details of all the products:
//2 Collect and Print Details of the Product having price greater than or equal to 30000f
//
//3 Collect the details of the product having price greater than or equal to 30000f
//in list
//in Set
//
//4 From List of Products get the List Of id,name separately
//
//5
//Find Maximum    price [Hint: use map]
//Find Minimum     price [Hint: use map]
//Find Sum     of price [Hint: use map]
//Find Average  price [Hint: use map]
//
//6 Find count of products have distinct price
//
//7 Find the product that has Maximum price [Hint: use map]
//
//8 Collect the details of the product having name starting with T as map, id should be key and value should be name of the product
//
//Collect the details of the product having price greater than 30000f as map, id should be key
//
//9 Group  the products by productType