package leetcode.leetcode3270

object SolutionScala {
  def generateKey(num1: Int, num2: Int, num3: Int): Int = {
    var x = num1
    var y = num2
    var z = num3
    var ans =0
    val t = List(1,10,100,1000)
    for(v <- t){
      ans += Math.min(x%10,Math.min(y%10,z%10))*v
      x /= 10
      y /= 10
      z /= 10
    }
    ans
  }

}
