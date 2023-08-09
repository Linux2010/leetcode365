package leetcode.leetcode1749;

import java.util.Arrays;

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int res=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]>0){
                res=0;
            }else {
                res=Math.min(nums[i-1],res);
                nums[i]+=nums[i-1];
            }
        }
        res=Math.min(nums[nums.length-1],res);
        return res;
    }


    public int maxAbsoluteSum2(int[] nums) {
        int r=0;
        int[] nums2 = Arrays.copyOf(nums,nums.length);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]<0){
                r=0;
            }else {
                r=Math.max(nums[i-1],r);
                nums[i]+=nums[i-1];
            }
        }
        r=Math.max(nums[nums.length-1],r);

        int l=0;
        for (int i = 1; i < nums2.length; i++) {
            if(nums2[i-1]>0){
                l=0;
            }else {
                l=Math.min(nums2[i-1],l);
                nums2[i]+=nums2[i-1];
            }
        }
        l=Math.min(nums2[nums2.length-1],l);
        return Math.max(Math.abs(l),Math.abs(r));
    }


    public int maxAbsoluteSum3(int[] nums) {
        int r=0,r_tmp =0;
        int l=0,l_tmp =0;
        for (int num : nums) {
            r_tmp += num;
            r = Math.max(r,r_tmp);
            r_tmp = Math.max(r_tmp,0);
            l_tmp += num;
            l = Math.min(l,l_tmp);
            l_tmp = Math.min(l_tmp,0);
        }
        return Math.max(r,-l);
    }


    public static void main(String[] args) {
        int[] nums = {-7,-1,0,-2,1,3,8,-2,-6,-1,-10,-6,-6,8,-4,-9,-4,1,4,-9};
        System.out.println( new Solution().maxAbsoluteSum3(nums));
    }
}