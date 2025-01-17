package leetcode.leetcode3095;

public class Solution {


    //https://leetcode.cn/problems/shortest-subarray-with-or-at-least-k-i/
    public int minimumSubarrayLength(int[] nums, int k) {
        int ans = Integer.MAX_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int v = 0;
            for (int j = i; j < n; j++) {
                v |= nums[j];
                if (v >= k) {
                    ans = Math.min(ans, j - i + 1);
                    break;
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
