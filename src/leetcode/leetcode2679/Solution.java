package leetcode.leetcode2679;

import java.util.Arrays;

//2679. 矩阵中的和
public class Solution {

    //标记法+3层循环
    public int matrixSum(int[][] nums) {
        int res = 0;
        int len = nums[0].length;
        for (int i = 0; i < len; i++) {
            int max = 0;
            for (int j = 0; j < nums.length; j++) {
                int col_idx = 0;
                for (int k = 0; k < len; k++) {
                    if(nums[j][k]>nums[j][col_idx]){
                        col_idx = k;
                    }
                }
                max = Math.max(max,nums[j][col_idx]);
                nums[j][col_idx] = -1;
            }
            res += max;
        }
        return res;
    }
    //快排+2层循环
    public int matrixSum_sort(int[][] nums) {
        int res = 0;
        for (int[] num : nums) {
            Arrays.sort(num);
        }
        int len = nums[0].length;
        for (int i = 0; i < len; i++) {
            int max = 0;
            for (int[] num : nums) {
                max = Math.max(max, num[i]);
            }
            res += max;
        }
        return res;
    }
}
