package leetcode.leetcode560;

import java.util.HashMap;

public class Solution {


    // 运用前缀和，来计算 s-k，在整个前缀和中有多少个
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int s = 0;
        HashMap<Integer, Integer> cnt = new HashMap<>();
        for (int num : nums) {
            s += num;
            ans += cnt.getOrDefault(s - k,0);
            cnt.merge(s,1,Integer::sum);
        }
        return ans;
    }
}
