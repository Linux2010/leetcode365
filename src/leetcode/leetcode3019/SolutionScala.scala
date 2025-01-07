package leetcode.leetcode3019

object SolutionScala {

  def countKeyChanges(s: String): Int = {
    var ans = 0
    for (i <- 1 until s.length) {
      val pre = s.charAt(i - 1)
      val c = s.charAt(i)
      if (Character.toLowerCase(pre) != Character.toLowerCase(c)) ans += 1
    }
    ans
  }


}
