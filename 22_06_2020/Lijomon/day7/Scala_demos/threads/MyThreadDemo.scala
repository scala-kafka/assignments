package com.info.threads

class MyThread extends  Thread{

  override def run(): Unit = {
    println("Run = "+ Thread.currentThread().getName)
    println("I am running using Thread class")
  }

}

object MyThreadDemo {

  def main(args: Array[String]): Unit = {
    println("Main = "+ Thread.currentThread().getName)

    var t: MyThread = new MyThread
    t.setName("CustomThread")
    t.start()

  }
}
