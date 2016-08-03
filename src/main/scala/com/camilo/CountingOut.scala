package com.camilo

/**
 * @author Camilo Sarmiento
 * @since 2016-08-02
 */
object CountingOut {
  /**
   * Method to get the safe position for the counting problem. As stated in [[https://en.wikipedia.org/wiki/Josephus_problem]]
   * when `k == 2` it can be resolved in a fast way using a formula, so here the case is treated in a special way.
   *
   * @param n number of people in the circle
   * @param k step rate
   * @return the safe position to be, to win (or not be killed)
   */
  def getSafePosition(n: Int, k: Int): Int = {
    assert(n > 0, "n should be > 0")
    assert(k > 0, "k should be > 0")
    k match {
      case 2 =>
        val valueOfL = n - java.lang.Integer.highestOneBit(n)
        2 * valueOfL + 1
      case _ =>
        if (n == 1) {
          1
        } else {
          ((getSafePosition(n - 1, k) + k - 1) % n) + 1
        }
    }
  }
}
