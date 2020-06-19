package demo.assignment1

class RateEmployee {

  def getRate(eno:Int,name:String,salary:Double): Int ={

    var rate:Int = salary match {
      case salary if(salary<10000) =>1
      case salary if(salary>10000 && salary<20000) => 2
      case salary if(salary>20000 && salary<30000) => 3
      case salary if(salary>30000 && salary<40000) => 4
      case _ => 5
    }
    rate
  }

}
