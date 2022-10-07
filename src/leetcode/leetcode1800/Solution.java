package leetcode.leetcode1800;
//1800. 最大升序子数组和
// https://leetcode.cn/problems/maximum-ascending-subarray-sum/
public class Solution {
    public int maxAscendingSum(int[] nums) {
        int res = nums[0];
        int tmp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>nums[i-1]){
                tmp+=nums[i];
                res = Math.max(res,tmp);
            }else {
                tmp=nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ints = {3,6,10,1,8,9,9,8,9};
        new Solution().maxAscendingSum(ints);
    }
}
