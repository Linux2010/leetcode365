package leetcode.leetcode2500;

import java.util.Arrays;

// https://leetcode.cn/problems/delete-greatest-value-in-each-row/
// 2500. 删除每行中的最大值
public class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int res =0;
        for (int[] ints : grid) {
            Arrays.sort(ints);
        }

        for (int[] ints : grid) {
            int len_max = 0;
            for (int i = grid[0].length-1; i >=0 ; i--) {
                len_max = Math.max(ints[i],len_max);
            }
            res += len_max;
        }

        for (int i = grid[0].length-1; i >=0 ; i--) {
            int len_max = 0;
            for (int[] ints : grid) {
                len_max = Math.max(ints[i],len_max);
            }
            res += len_max;
        }

        return res;
    }
}
