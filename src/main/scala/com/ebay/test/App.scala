package com.ebay.test

object App {
  def main(args: Array[String]): Unit = {
    print(100)
  }

  private def print(number: Int) {
    for (n <- 1 to number) {
      println(getString(n, 3, 5))
    }
  }

  def getString(n: Int, firstNumber: Int, secondNumber: Int): String = {
    try {
      getMod(n, firstNumber) match {
        case 0 => {
          getMod(n, secondNumber) match {
            case 0 => "FizzBuzz"
            case _ => "Fizz"
          }
        }
        case _ => {
          getMod(n, secondNumber) match {
            case 0 => "Buzz"
            case _ => n.toString
          }
        }
      }
    } catch {
      case ae: ArithmeticException => ae.getLocalizedMessage
    }
  }

  private def getMod(dividend: Int, divisor: Int): Int = {
    if (divisor != 0)
      dividend % divisor
    else throw new ArithmeticException("can not divide by 0")
  }
}
