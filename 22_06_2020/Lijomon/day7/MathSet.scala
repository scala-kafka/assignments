package com.info.basics.day7

class MathSet(param:Array[Int] = Array[Int]()) {

  var set=param
  def  isDuplicate(element: Int):Boolean = set.contains(element)

  // add an element
  def + (element: Int) = if(!isDuplicate(element)) new MathSet(set :+ element) else this

  // remove an element
  def - (element:Int)  = new MathSet(set.filter(_!=element))

  //union
  def U (that:MathSet) = new MathSet((set ++ that.set.filter((!set.contains(_)))))

  //difference between sets
  def -- (that: MathSet) = new MathSet(set.diff(that.set))

  //intersection
  def n (that: MathSet) = new MathSet(set.diff(--(that).set))

  def  contains(that:MathSet) = that.set.map(set.contains(_)).forall(_==true)

  override def toString : String = set.mkString(",")

}

