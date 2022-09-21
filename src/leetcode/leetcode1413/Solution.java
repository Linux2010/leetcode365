package leetcode.leetcode1413;

/**
 * 2022年08月09日
 */
public class Solution {
    //动态规划

    public int minStartValue(int[] nums) {
        int res = 1;
        int min = Math.min(nums[0], 0);
        for (int i = 1; i <nums.length ; i++) {
          nums[i] += nums[i-1];
          if (nums[i]<nums[i-1]){
             min =  Math.min(nums[i],min);
          }
        }
        return res-min;
    }

    public static void main(String[] args) {
        new Solution().minStartValue(new int[]{-5,-2,4,4,-2});
    }
    
    
}
