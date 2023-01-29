package leetcode.leetcode53;

//53. 最大子数组和
//https://leetcode.cn/problems/maximum-subarray/description/
//medium
public class Solution {

    //2022年11月10日
    //动态规划方法。
    //
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for (int i=1;i<nums.length;i++){
            if(nums[i-1]>0){
                nums[i]+=nums[i-1];
            }
            res = Math.max(res,nums[i]);
        }
        return res;
    }
}
