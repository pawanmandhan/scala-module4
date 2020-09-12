package com.npntraining.immutable_collections

object _08 {
  def main(args: Array[String]): Unit = {  
    val set = Set("C","C++","C","C++","Java","Scala");
    println(set)
    
    val set02 = set + "Pascal"
    println(set02)
   
    println(set & set02)
    println(set intersect( set02))
    
    println(set02 &~ set)
    
  }
}