package leetcode.leetcode1;

import java.util.HashMap;

//https://leetcode.cn/problems/two-sum/description/
//EASY
//1. 两数之和
public class Solution {

    //补数方案 2022年10月29日
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(target-nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            Integer value = map.get(key);
            if(null != value && i != value){
                return new int[]{i,map.get(key)};
            }
        }
        return null;
    }

}
