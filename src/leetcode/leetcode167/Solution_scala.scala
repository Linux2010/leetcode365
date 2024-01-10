package leetcode.leetcode167;

object Solution_scala {
  def twoSum(numbers: Array[Int], target: Int): Array[Int] = {
    var l = 0
    var r = numbers.length - 1
    while (l < r) {
      if (numbers(l) + numbers(r) == target) Array[Int](l + 1, r + 1)
      if (numbers(l) + numbers(r) > target) r -= 1
      else l += 1
    }
    Array[Int](l + 1, r + 1)
  }
}