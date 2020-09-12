package com.npntraining.immutable_collections

object _05 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)
    
    var sum =0
    val sumFn = (e:Int)=>{sum +=e}
    list.foreach(sumFn);
    println(sum)
  }
}