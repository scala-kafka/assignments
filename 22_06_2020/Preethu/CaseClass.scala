package com.scala.threads

case class CaseClass(id:Int) {
 /* override def hashCode(): Int = {
    33333
  }*/
}
object processCase extends App{
  var obj=CaseClass(100)
  var obj2=CaseClass(100)

  println(obj.hashCode()+" "+obj2.hashCode())
  println(obj==obj2)
  println(obj.equals(obj2))

}