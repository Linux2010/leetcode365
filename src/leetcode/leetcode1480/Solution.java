package leetcode.leetcode1480;

//1480. 一维数组的动态和
//给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}