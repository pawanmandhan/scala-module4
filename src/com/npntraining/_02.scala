package com.npntraining

object _02 {
  def main(args: Array[String]): Unit = {
    val list = 1 to 10
    for (e <- list) {
      println(e)
    }
    println("FIlter")
    
    val result = list.filter((e:Int)=>{e % 2 ==0})
    
    println(result)
    
  }
}