package com.camilo

import org.scalatest.refspec.RefSpec

/**
 * @author Camilo Sarmiento
 * @since 2016-08-02
 */
class CountingOutTest extends RefSpec {

  def `00 Trivial cases should be handled correctly`() = {
    assertResult(3)(CountingOut.getSafePosition(n = 5, k = 2))
    assertResult(1)(CountingOut.getSafePosition(n = 4, k = 2))
    assertResult(5)(CountingOut.getSafePosition(n = 10, k = 2))
    assertResult(13)(CountingOut.getSafePosition(n = 14, k = 2))
    assertResult(4)(CountingOut.getSafePosition(n = 5, k = 3))
    assertResult(28)(CountingOut.getSafePosition(n = 40, k = 3))
  }

  def `00 When k=2, formula is going to be used doesn't matter if n is very large`() = {
    assert(2147483647 == CountingOut.getSafePosition(n = Int.MaxValue, k = 2))
    assert(951425 == CountingOut.getSafePosition(n = 1000000, k = 2))
    assert(3222785 == CountingOut.getSafePosition(n = 10000000, k = 2))
  }

  def `01 Bad parameters should generate AssertionError`() = {
    assertThrows[AssertionError](CountingOut.getSafePosition(-1, -1))
    assertThrows[AssertionError](CountingOut.getSafePosition(0, 0))
  }
}
