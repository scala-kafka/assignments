package com.info.threads

class Simple extends Runnable{

  override def run(): Unit = {
    var name:String = Thread.currentThread().getName
    if(name.equals("evenThread")){
      even()
    }else {
      odd()
    }
  }

  def even():Unit = {
    println("Even = "+Thread.currentThread().getName)
  }

  def odd():Unit = {
    println("Odd = "+Thread.currentThread().getName)
  }

}

object ThreadDemo {

  def main(args: Array[String]): Unit = {
    println("Main = "+ Thread.currentThread().getName)

    var simple:Simple = new Simple
    var t1 = new Thread(simple)
    var t2 = new Thread(simple)

    t1.setName("evenThread")
    t2.setName("oddThread")

    t1.start()
    t2.start()
  }
}
