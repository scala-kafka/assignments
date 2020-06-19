package demo.Assignment.Product

import com.sun.prism.impl.MeshVertex

object ProductMainAssignment1 {

  def main(args: Array[String]): Unit = {

    var listOfProduct:List[Product] = ProductDetails.getProductList

    /*Assignment 1 - list of the productid, name and price*/
    var listofProductId:List[Int] = listOfProduct.map(x => x.productId).toList
    listofProductId.foreach(productId => println(productId))

    var listofProductName:List[String] = listOfProduct.map(product => product.productName).toList
    listofProductName.foreach(productName => println(productName))

    var listOfProductPrice:List[Double] = listOfProduct.map(product => product.price).toList
    listOfProductPrice.foreach(price => println(price))

    /*Assignment 2 - greater than 30000*/
    println("Assignment 2 - greater than 30000")
    var productlistabove30000:List[Product] = listOfProduct.filter(product => product.price >=30000)
    productlistabove30000.foreach(productlistabove => println(productlistabove))

    /*Assignment 3 - greater than 30000 using list*/
    println("Assignment 3 - greater than 30000 using list")
    var productlist:List[Product] = listOfProduct.filter(product => product.price >=30000).toList
    productlist.foreach(productlistabove => println(productlistabove))

    /*Assignment 3 - greater than 30000 using set*/
    println("Assignment 3 - greater than 30000 using list")
    var productSetabove30000:Set[Product] = listOfProduct.filter(product => product.price >=30000).toSet
    productSetabove30000.foreach(productSetabove => println(productSetabove))


    /*Assignment 4 - list of product get list of id, name seperately*/
    println("Assignment 4 - list of product get list of id, name seperately")
    var productList:List[Map[Int,String]] = listOfProduct.map(x => Map(x.productId -> x.productName)).toList
    productList.foreach(productlistOfMap => println(productlistOfMap))

    /*Assignment 5 - maximum price*/
    println("Assignment 5 - maximum price")
    var maximumPriceOfProduct:Double = listOfProduct.map(product => product.price).max
    println("MAX PRICE OF PRODUCT = " + maximumPriceOfProduct)

    /*Assignment 5 - minimum price*/
    println("Assignment 5 - minimum price")
    var minimumPriceOfProduct:Double = listOfProduct.map(product => product.price).min
    println("MAX PRICE OF PRODUCT = " + minimumPriceOfProduct)

    /*Assignment 5 - sum price*/
    println("Assignment 5 - sum price")
    var sumOfProductPrice = listOfProduct.map(product => product.price).reduce((initial, productprice) => initial + productprice)
    println("SUM OF PRODUCT PRICE = "+ sumOfProductPrice)

    /*Assignment 5 - average price*/
    println("Assignment 5 - average price")
    var averageOfproductPrice:Double = listOfProduct.map(product => product.price).sum/listOfProduct.map(product => product.price).size
    println("AVERAGE OF PRODUCT PRICE = "+ averageOfproductPrice)

    /*Assignment 6 - count of products have distinct price */
    println("Assignment 6 - count of products have distinct price")
    var distinctList:List[Double] = listOfProduct.map(product => product.price).distinct
    println("count of products have distinct price " +distinctList.size)

    /*Assignment 7 - maximum price using map*/
    println("Assignment 7 - maximum price using map")
    var maximumPrice:Double = listOfProduct.map(product => product.price).max
    println("MAX PRICE OF PRODUCT = " + maximumPrice)

    /*Assignment 8 - Collect the details of the product having name starting with I as map, id should be key and value should be name of the product*/
    println("Assignment 8 - Collect the details of the product having name starting with O as map, id should be key and value should be name of the product")
    var listOfT:List[Product] = listOfProduct.filter(product => product.productType.==('O'))

    var listOfMap:List[Map[Int,String]] = listOfT.map(productMap => Map(productMap.productId -> productMap.productName))
    listOfMap.foreach(product => println(product))

    /*Assignment 8 - Collect the details of the product having price greater than 30000f as map, id should be key*/
    var listofgreaterprice:List[Product] = listOfProduct.filter(product => product.price >= 30000)

    var listOfMapgreaterPrice:List[Map[Int,String]] = listofgreaterprice.map(productMap => Map(productMap.productId -> productMap.productName))
    println("Collect the details of the product having price greater than 30000f as map, id should be key\n       ")
    listOfMapgreaterPrice.foreach(product => println(product))

    /*Assignment 9 - Group  the products by productType*/
    listOfProduct.groupBy(product=>product.productType).foreach(x =>println(x))












  }

}
