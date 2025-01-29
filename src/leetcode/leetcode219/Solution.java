package leetcode.leetcode219;

import java.util.HashSet;

public class Solution {


    //https://leetcode.cn/problems/contains-duplicate-ii/?envType=daily-question&envId=2025-01-29

    /**
     * 定长滑动窗口
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i])){
                return true;
            }
            if(i>=k){

                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}
