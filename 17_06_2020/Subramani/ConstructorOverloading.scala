package demo.assignment1

class ConstructorOverloading(pno:Int) {

  var name:String = _
  var description:String =_
  var price:Double = _
  var manufactureyear:Int = _

  def this(pno:Int,name:String){
    this(pno)
    this.name = name
  }

  def this(pno:Int,name:String,description:String){
    this(pno,name)
    //this(pno)
    this.name = name
    this.description = description
  }

  def this(pno:Int,name:String,description:String,price:Double){
    this(pno,name,description)
    //this(pno)
    //this()
    this.name = name
    this.description = description
    this.price = price
  }

  def this(pno:Int,name:String,description:String,price:Double,manufactureyear:Int){
    this(pno,name,description,price)
    this.name = name
    this.description = description
    this.price = price
    this.manufactureyear = manufactureyear
  }

  def productDetails(): Unit ={
    println(s"pno = $pno name = $name description =$description price = $price manfactureyear = $manufactureyear")
  }

}
