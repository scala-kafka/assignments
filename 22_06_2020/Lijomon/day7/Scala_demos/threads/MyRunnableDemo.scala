package com.info.threads

class MyRunnable extends Runnable{
  override def run(): Unit = {
    println("Run = "+ Thread.currentThread().getName)

    println("I am running using Runnable")
  }
}

object MyRunnableDemo {
  def main(args: Array[String]): Unit = {
    println("Main = "+ Thread.currentThread().getName)

    //var mr:MyRunnable = new MyRunnable;
    var t:Thread = new Thread(new MyRunnable)
    t.setName("CustomThread")
    t.start()

  }

}
