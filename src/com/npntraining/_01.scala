package com.npntraining
/*
 * A predicate is simply a method, function , or anonymous function that takes one ore more parameters
 * and returns a boolean value;
 * 
 */
object _01 {
  
  def isEven(num:Int):Boolean={
    if(num.%(2) ==0){
      return true
    }
    false;
  }
  
  def main(args: Array[String]): Unit = {
    println(isEven(34))
  }
}