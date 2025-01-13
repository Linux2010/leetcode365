package leetcode.leetcode2270;

import java.util.Arrays;

public class Solution {


    // 2次遍历
    // 1， 算左到右和右到左的前缀和
    //2，比较左右前缀和
    //注意：long[]防止前缀和溢出，计算ans 从1开始，len结束，不计算左右无值的情况。
    public int waysToSplitArray(int[] nums) {
        int len = nums.length;
        long[] l = new long[len + 1];
        long[] r = new long[len + 1];
        for (int i = 0, j = len; i < len; i++, j--) {
            l[i+1] = nums[i] + l[i];
            r[j-1] = nums[j-1] + r[j];
        }
        int ans = 0;
        for (int i = 1; i < len; i++) {
            if(l[i]>=r[i]){
                ans++;
            }
        }
        return ans;
    }


    // 数学公式，临界公式： x >= total -x  -->  2x >= total

    public int waysToSplitArray2(int[] nums) {
        long total = 0;
        for (int num : nums) {
            total += num;
        }
        int ans =0;
        long x =0;
        for (int i = 0; i < nums.length - 1; i++) {
            x += nums[i];
            if (2*x >= total) ans++;
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{-100000,100000};
        int ans = new Solution().waysToSplitArray(nums);
        System.out.println(ans);
    }


}
