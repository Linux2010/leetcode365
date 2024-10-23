package leetcode.leetcode3185;

import java.util.Arrays;

class Solution {
    public static long countCompleteDayPairs(int[] hours) {
        final int H = 24;
        long ans = 0;
        int[] cnt = new int[H];
        for (int t : hours) {
            // 先查询 cnt，再更新 cnt，因为题目要求 i < j
            // 如果先更新，再查询，就把 i = j 的情况也考虑进去了
            ans += cnt[(H - t % H) % H];
            cnt[t % H]++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] hours = {12,12,12,12,12};
        System.out.println(my_countCompleteDayPairs(hours));

    }

    public static long my_countCompleteDayPairs(int[] hours) {
        long ans = 0L;
        int[] count = new int[24];
        for(int h :hours){
            ans += count[(24 - h%24)%24];
            count[h%24]++;
        }
        return ans;
    }


}
