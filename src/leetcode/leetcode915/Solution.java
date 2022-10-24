package leetcode.leetcode915;

//https://leetcode.cn/problems/partition-array-into-disjoint-intervals/
//915. 分割数组
class Solution {
    //1,记录左侧最大leftMax，与总体最大max
    //2，判断左边最大是否大于当前遍历，大于说明符合加入左边，res=i，并且为了保障leftMax最大，需要把max赋值。
    //3，否则max取，max = Math.max(nums[i],max)
    //4，返回 res+1；
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