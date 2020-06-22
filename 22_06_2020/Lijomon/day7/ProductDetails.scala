package com.info.basics.day7

class Product(var productId:Int,var productName:String,var price:Double,var productType:Char){
    
 override def toString():String={
    
    return "[ProductId: "+this.productId+" ProductName: "+this.productName+", Price:"+this.price;
  }
}

object Products {
  
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
}