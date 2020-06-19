package com.scala.exceptionHandling

object ProcessTest {
  def main (args: Array[String] ): Unit = {

    val obj =classOf[ProcessAccount].newInstance()
    //val obj:ProcessAccount =new ProcessAccount()
    obj.withDraw();
    obj.evenNumberCheck()

  }
}
