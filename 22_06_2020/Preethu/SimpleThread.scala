package com.scala.threads

class SimpleThread extends Thread {
   override def run(): Unit = {
    var priority:Int = Thread.currentThread().getPriority
     println("Priority ="+priority)
    if(priority==1){
      myMethod1()
    }else {
      myMethod2()
    }
  }
  def myMethod1 = () => println("MY METHOD 1"+Thread.currentThread().getName)

  def myMethod2 = () => println("MY METHOD 2"+Thread.currentThread().getName)
}
class RunnableThread extends Runnable{
  override def run(): Unit = {
    println("Runnable Method "+Thread.currentThread().getPriority)
  }

}
object ProcessThread extends App{
  println("ProcessThread "+Thread.currentThread().getName)
  var simpleObj =new SimpleThread
  simpleObj.setPriority(2)
  simpleObj.start()

  var runnableObj=new RunnableThread
  var thread=new Thread(runnableObj)
  thread.setName("My runnable Thread")
  thread.start()

}
