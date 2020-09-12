package com.npntraining.immutable_collections

object _06 {
  def main(args: Array[String]): Unit = {
    val map: Map[Int, String] = Map(1 -> "One", 2 -> "Two")
    println(map(1))
    println(map.keys)
    println(map.contains(1))
    println(map.contains(11))
    val map02:Map[Int,String] = Map(4-> "Four")
    val result = map ++ map02
//    val map02 = map + (4 -> "Four")
    println(result)
  }
}