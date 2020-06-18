package com.info.day5
class Message {
  def send(): Unit = {
    println("send method")
  }
}

class WhatsApp extends Message {
  override def send(): Unit = {
    println("send by whats app")
  }
}
class Gmail extends Message {
  override def send(): Unit = {
    println("send by gmail")
  }

}

class Mobile {
  def chat(msg: Message): Unit = {
    msg.send();
  }
}

object Polymorphism {
  def main(args: Array[String]): Unit = {
    var mobile: Mobile = new Mobile
    mobile.chat(new Gmail)
    mobile.chat(new WhatsApp)
    mobile.chat(new Message)
  }

}
