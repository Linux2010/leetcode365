package leetcode.leetcode2239;

public class Solution {

    //https://leetcode.cn/problems/find-closest-number-to-zero/?envType=daily-question&envId=2025-01-20

    /**
     * 注意所有的比较使用绝对值
     * @param nums
     * @return
     */
    public int findClosestNumber(int[] nums) {
        int ans = nums[0];
        for (int num : nums) {
            if(Math.abs(num)<ans || Math.abs(num)==Math.abs(ans) && num>ans){
                ans = num;
            }
        }
        return ans;
    }
}
