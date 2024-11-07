package leetcode.leetcode128;

import java.util.Arrays;

public class Solution {

    public int longestConsecutive(int[] nums) {
        int res =0;
        if(nums.length==0)return res;
        Arrays.sort(nums);
        int cnt =1;
        res = cnt;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]+1== nums[i]) {
                cnt++;
                res = Math.max(res,cnt);
            }else if(nums[i-1]==nums[i]){
                continue;
            }else {
                cnt=1;
            }
        }
        return  res;
    }


    public int longestConsecutive_1(int[] nums) {
        if(nums.length==0)return 0;
        int res=1,cnt =1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]+1==nums[i+1]) {
                cnt++;
                res = Math.max(res,cnt);
            }else if(nums[i]<nums[i+1]){
                cnt=1;
            }
        }
        return  res;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{0};
        System.out.println(new Solution().longestConsecutive_1(nums));
    }

}
