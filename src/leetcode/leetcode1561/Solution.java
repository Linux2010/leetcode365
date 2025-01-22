package leetcode.leetcode1561;

import java.util.Arrays;

public class Solution {


    // https://leetcode.cn/problems/maximum-number-of-coins-you-can-get/description/
    // 模拟，排序，贪心
    public int maxCoins(int[] piles) {
        int ans = 0;
        Arrays.sort(piles);
        int i = piles.length / 3;
        int n = piles.length - 2;
        while (i > 0) {
            ans += piles[n];
            n -= 2;
            i--;
        }
        return  ans;
    }

}
