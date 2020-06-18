package com.info.day5

trait IndianMotors {

  def color();
  def isBs6Engine();
  def prize(): Unit = {
    println("default price is 50k")
  };
}

class HeroMotors extends IndianMotors {

  override def color(): Unit = println("color = blue")

  override def isBs6Engine(): Unit = println("bs6 engine = true")
  override def prize(): Unit = {
    super.prize();
    println("custom price 80k")
  }
}

object TraitExample {
  def main(args: Array[String]): Unit = {
    var heroMotors: HeroMotors = new HeroMotors
    heroMotors.color();
    heroMotors.isBs6Engine();
    heroMotors.prize()
  }
}
