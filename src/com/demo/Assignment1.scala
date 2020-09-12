package com.demo

object Assignment1 {

  def main(args: Array[String]): Unit = {
    // question 1
    println(getString(5))

    // question 3
    countdown(5)

    //question 5
    println(decorate("$", 5))

    //question 6
    loopEquivalent

    //question 7
    println(filterPositive(Array(1, 2, 3, -1, -90, 100)).mkString(" "))
    
  }

  def getString(num: Int): String = {
    val list = 1 to num
    return list.mkString
  }

  def countdown(num: Int) {
    val list = (1 to num)
    //1
    println(list.reverse.mkString)
    //2
    // list.reverse.foreach(print)

    //3
    //(num to 1 by -1) foreach print
  }

  def decorate(specialSymbol: String, num: Int): String = {
    return specialSymbol * num
  }

  def loopEquivalent() {
    for (i <- 10 to 0 by -1) {
      println(i + " ")
    }

    // this also works
    //(10 to 1 by -1) foreach println
  }

  def filterPositive(arr: Array[Int]): Array[Int] = {
    arr.filter((i: Int) => i >= 0)
  }
}