package com.camilo

import com.typesafe.scalalogging.LazyLogging

import scala.util.{Failure, Success, Try}

/**
 * @author Camilo Sarmiento
 * @since 2016-08-02
 */
object Main extends LazyLogging {
  def main(args: Array[String]): Unit = {
    if (args.length != 2) {
      println("Illegal number of parameters, please enter two numbers n and k")
      println("Usage: Main <numberOfPeople> <stepRate>")
    } else {
      Try((args(0).toInt, args(1).toInt)) match {
        case Success((n, k)) =>
          Try(CountingOut.getSafePosition(n, k)) match {
            case Success(value) =>
              println(s"For n: $n and k: $k, the safe position is: $value")
            case Failure(e) =>
              println("Check your input parameters")
              logger.error(e.getMessage)
          }
        case Failure(e) =>
          println("Check your input parameters")
          logger.error(e.getMessage)
      }
    }
  }
}
