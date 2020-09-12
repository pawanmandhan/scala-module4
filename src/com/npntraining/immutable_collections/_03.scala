package com.npntraining.immutable_collections

object _03 {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3)
    val list2 = List(4,5,6)
    // Concatenate two lists
    
    val list3 = list1 ::: list2
    println(list3)
    
    val list4 = List(1,2,3) ::: List(4,5,6)
    println(list4)
    println(list4.reverse)
    
    val reverseList4 = List(6,5,4,3,2,1)
    
    println(list4.reverse equals reverseList4)
    println(list4.reverse.reverse equals list4)
    println(list4.reverse.tail equals list4.init.reverse)
//    println(list4.init.reverse)
    println(list4.reverse.head equals list4.last)
  }
  
}