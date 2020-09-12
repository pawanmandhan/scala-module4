package com.npntraining.immutable_collections

object Tuple {
  def main(args: Array[String]): Unit = {
    val t1 = Tuple2("Hello","World")
    
    val t = ("Hello","World","Java","C#","Pascal")
    println(t1._1)
    println(t1._2)
    
    t.productIterator.foreach((e:Any)=>println(e))
    println()
    t.productIterator.foreach(println)
  }
}