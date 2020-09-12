package com.npntraining.immutable_collections

object _04 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5,6,7,8,9,10)
    println(list take 3)
    println(list take 5)
    
    // Takes 2 list and forms a pair of list
    val list2 = List(1,2,3) zip List("One","Two","Three","FOur")
    println(list2)
    println(list2.unzip)
    
  }
}