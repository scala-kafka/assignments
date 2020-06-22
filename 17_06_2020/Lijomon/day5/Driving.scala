package com.info.basics.day5

object Driving {
  def main(args: Array[String]): Unit = {
    var car:Vehicle = new Car
    var bike:Vehicle = new Bike
    var bus:Vehicle = new Bus

    car.driving();
    bike.driving()
    bus.driving()
  }

}
