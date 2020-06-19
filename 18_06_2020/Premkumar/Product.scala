package com.info.assignment

class Product(var productId:Int,var productName:String,var price:Double,var productType:Char){

  override def toString():String={

    return "[ProductId: "+this.productId+" ProductName: "+this.productName+", Price:"+this.price;
  }

}

object ProductList {

  def getProductList={
    var productList:List[Product] = List(
      new Product(2010,"TV",35000,'N'),
      new Product(2011,"Refrigrator",17000,'N'),
      new Product(2012,"Radio",2000,'N'),
      new Product(2013,"Laptop",90000,'N'),
      new Product(2014,"Microwave",9000,'N'),
      new Product(2015,"Trimmer",1800,'N'),
      new Product(2016,"PC",60000,'N'),
      new Product(2017,"Washing Machine",18000,'N'),

      new Product(2018,"TV",12000,'O'),
      new Product(2019,"Xbox",15000,'O'),
      new Product(2020,"Piano",18000,'O'),
      new Product(2021,"Trimmer",1800,'O'),
    )
    productList
  }



  def main(args: Array[String]): Unit = {

    var allTheProducts=ProductList.getProductList

    //1
     var allTheProductss=allTheProducts.foreach(products=> println(products))
      println(allTheProductss)

    //2
    var moreThan30000f= allTheProducts.filter( products=> products.price>=30000f)
    println(moreThan30000f)

    //3
       var moreThan30000fList: List[Product] =  allTheProducts.filter( products=> products.price>=30000f)
        println(moreThan30000fList)
        var moreThan30000fSet : Set[Product]= moreThan30000fList.toSet
        println(moreThan30000fSet)

    //4
    var listOfIdandNames =allTheProducts.map(product =>  println(" product ID = "+product.productId + " product name = "+product.productName))


    //5
    var maxPrice=ProductList.getProductList
    println(maxPrice.map(product => product.price).max)

    var minPrice =ProductList.getProductList
    println(minPrice.map(product => product.price).min)

    var sumPrice= ProductList.getProductList
    println(sumPrice.map(product => product.price).sum)

    var avgPrice = ProductList.getProductList
    var averageOfproductPrice:Double = avgPrice.map(product => product.price).sum/avgPrice.map(product => product.price).size
    println(averageOfproductPrice)

    //6
    var listdistinct=allTheProducts.map(product=> product.price).distinct
      println(listdistinct.size)

    //7
      var productListT: List[Product] =allTheProducts.filter(product=> product.productType. == ('O'))
     println(productListT)

     //8
      var productListofMap : List[Map[Int,String]] = productListT.map(productMap => Map(productMap.productId-> productMap.productName))
       productListofMap.foreach(product => println(product))

      var listofgreaterprice:List[Product] = allTheProducts.filter(product => product.price >= 30000)
      var listOfMapgreaterPrice:List[Map[Int,String]] = listofgreaterprice.map(productMap => Map(productMap.productId -> productMap.productName))
      listOfMapgreaterPrice.foreach(product => println(product))

      //9
    allTheProducts.groupBy(product => product.productType).foreach(gproduct => println(gproduct))





  }
}
