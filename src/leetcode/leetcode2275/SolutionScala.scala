package leetcode.leetcode2275

object SolutionScala {
  def largestCombination(candidates: Array[Int]): Int = {
    val ans = new Array[Int](24)
    for (v <- candidates){
      var vv = v
      var i =0
      while (vv>0){
        ans(i) += vv&1
        vv >>= 1
        i += 1
      }
    }
    ans.max
  }

  def main(args: Array[String]): Unit = {
    val input = Array(16, 17, 71, 62, 12, 24, 14)
    val ans = largestCombination(input)
    println(ans)
  }

}
