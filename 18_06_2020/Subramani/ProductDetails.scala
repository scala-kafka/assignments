package demo.product



class Product(var productId:Int,var productName:String,var price:Double,var productType:Char){

  /*override def toString():String={

    return "[ProductId: "+this.productId+" ProductName: "+this.productName+", Price:"+this.price;
  }*/
}

object ProductDetails {

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
    var listOfProduct:List[Product] = getProductList
    println()

    println(" Assignment 1 - Print all product" )
    println()
    listOfProduct.foreach(x => println(" Product Id = "+ x.productId +" Product Name = "+ x.productName +" Price = "+x.price+ " ProductType = "+x.productType))
    println()

    println(" Assignemnt 2 - print the product price greater than equal to 30000f ")
    println()
    listOfProduct.filter(x => x.price >= 30000).foreach(x => println(" Product Id = "+ x.productId +" Product Name = "+ x.productName +" Price = "+x.price+ " ProductType = "+x.productType))
    println()

    println(" Assignment 3 - print the product price greater than equal to 30000f Using List")
    println()
    var filterHighlevelPricelist:List[Product] = listOfProduct.filter(x => x.price >= 30000)

    filterHighlevelPricelist.map(x => println(" Product Id = "+ x.productId +" Product Name = "+ x.productName +" Price = "+x.price+ " ProductType = "+x.productType))
    println()

    println(" Assignment 3 - print the product price greater than equal to 30000f Using Set")
    println()
    var filterHighlevelPriceset:Set[Product] = filterHighlevelPricelist.toSet

    filterHighlevelPriceset.foreach(x => println(" Product Id = "+ x.productId +" Product Name = "+ x.productName +" Price = "+x.price+ " ProductType = "+x.productType))
    println()

    println(" Assignment 4 - list of Product  get id and name seperately")
    println()
    listOfProduct.map(x => println(" product ID = "+x.productId + " product name = "+x.productName))
    println()

    println(" Assignment 5 - find the maximum price")
    println()
    listOfProduct.map(x => x.price).map(x => x.max(x)).foreach(x => println(x))


  }
}

