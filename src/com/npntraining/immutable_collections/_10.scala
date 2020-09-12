package com.npntraining.immutable_collections

object _10 {
  def main(args: Array[String]): Unit = {
    val t1 = ("EmployeeA", "DeptA", 1000.00)
    val t2 = ("EmployeeB", "DeptA", 2000.00)
    val t3 = ("EmployeeC", "DeptB", 3000.00)

    val employeeList = List(t1, t2, t3)
    println(employeeList)

    employeeList.foreach(e => {
      e match {
        case (name, "DeptA", salary) => println("Employee Name who belongs to DepA" + name)
        case t if t._3 > 2500.00     => println("EMployee Name whose salary is greater than 2500.00" + t._1)
        case _                       => None
      }
    })

  }
}