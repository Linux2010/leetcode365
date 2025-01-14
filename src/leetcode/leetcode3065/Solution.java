package leetcode.leetcode3065;

import java.util.Arrays;

public class Solution {
    // https://leetcode.cn/problems/minimum-operations-to-exceed-threshold-value-i/
    public int minOperations(int[] nums, int k) {
        int ans =0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= k){
                ans = i;
                break;
            }
        }
        return  ans;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{2,11,10,1,3};
        int ans = new Solution().minOperations(nums,10);
        System.out.println(ans);

    }
}
