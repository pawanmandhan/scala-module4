package com.npntraining.immutable_collections

object _02 {
  def main(args: Array[String]): Unit = {
   val months = List("Feb","March","Apr","May")
   val months1 = months.+:("Jan")
   print(months1(0));
   print(months1)
   println(months1.head)
   println(months1.last)
   println(months1.tail)
   println(months1.init)
  }
}