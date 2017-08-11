package com.ebay.test

import org.junit._
import Assert._

@Test
class AppTest {

  @Test
  def testNumber() {
    assertTrue(App.getString(8, 3, 5) == "8")

  }

  @Test
  def testFizz() {
    assertTrue(App.getString(3, 3, 5) == "Fizz")

  }

  @Test
  def testBuzz() {
    assertTrue(App.getString(5, 3, 5) == "Buzz")

  }

  @Test
  def testFizzBuzz() {

    assertTrue(App.getString(30,3,5) == "FizzBuzz")

  }

  @Test
  def testNegative() {

    assertTrue(App.getString(-4,3,5) == "-4")

  }
  @Test
  def testForException() {

    assertTrue(App.getString(-4,0,5) == "can not divide by 0")

  }
}


