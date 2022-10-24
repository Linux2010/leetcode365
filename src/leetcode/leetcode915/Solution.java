package leetcode.leetcode915;

//https://leetcode.cn/problems/partition-array-into-disjoint-intervals/
//915. 分割数组
class Solution {
    public int partitionDisjoint(int[] nums) {
        int res = 0 ;
        int max = nums[res];
        int leftMax = nums[res];
        for (int i = 1; i < nums.length; i++) {
            if(leftMax>nums[i]){
                res = i;
                leftMax = max;
            }else {
                max = Math.max(nums[i],max);
            }
        }
        return res +1;
    }
}