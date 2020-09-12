package com.npntraining

object _03 {
  def main(args: Array[String]): Unit = {
    val list = 1 to 10
    val result = for(e<-list if e%2==0) yield{
      e
    }
    
    println(result)
  }
}