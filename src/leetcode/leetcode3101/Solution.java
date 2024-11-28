package leetcode.leetcode3101;

public class Solution {


    //3101. 交替子数组计数

    /**
     * 1，核心判断逻辑：
     * 一般地，如果 nums(i) != nums(i-1),我们可以把 nums(i)
     * 加到所有以 i−1 为右端点的交替子数组的末尾，所以「以 i 为右端点的交替子数组个数」比「以 i−1 为右端点的交替子数组个数」多 1。
     *
     * @param nums
     * @return
     */
    public long countAlternatingSubarrays(int[] nums) {
        long res =0;
        int cnt =0;
        for(int i = 0; i<nums.length; i++){
           if(i>0&&nums[i]!= nums[i-1]){
               cnt++;
           } else {
               cnt=1;
           }
           res+=cnt; // 有 cnt 个右端点下标为 i 的交替子数组
        }
        return res;
    }

}
