package com.npntraining.immutable_collections

import scala.collection.immutable.HashMap

object _07 {
  def main(args: Array[String]): Unit = {
    val map01 : HashMap[Int,String] = HashMap((1,"One"),(2,"Two"))
    println(map01 - (2))
  }
}