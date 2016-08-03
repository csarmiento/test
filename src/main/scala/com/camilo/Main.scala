package com.camilo

import scala.util.{Failure, Success, Try}

/**
 * @author Camilo Sarmiento
 * @since 2016-08-02
 */
object Main {
  def main(args: Array[String]): Unit = {
    if (args.length != 2) {
      println("Illegal number of parameters, please enter two numbers n and k")
      println("Usage example: Main 10 2")
    } else {
      Try((args(0).toInt, args(1).toInt)) match {
        case Success((n, k)) =>
          println(s"n: $n, k: $k")
        case Failure(e) =>
          println("Check your input parameters")
          println(e.getMessage)
      }
    }
  }
}
