package com.npntraining.immutable_collections

object _01 {
  def main(args: Array[String]): Unit = {
    val names1 = List("Naveen", "Venkat", "Srinivas")
    val names2: List[String] = List("Naveen", "Venkat", "Srinivas")
    println(names1(1))
    
    // Appends elements at the end of the list
    val list = names1.:+("ROhtih")
    
    // Prepends elemnts at the beginning of the list
    val list1 = list.+:("Naveen1")
    println(list1)
//    val emptyList = List.empty[String]
  }
}