package leetcode.leetcode350;

import java.util.*;

public class Solution {

    //https://leetcode.cn/problems/intersection-of-two-arrays-ii/?envType=daily-question&envId=2025-01-30

    /**
     * 1，优化命名，常识规范化
     * 2，思路最优化，从暴力算法逐步切换到最短路径求解
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<>();
        int[] cnt = new int[1001];
        for (int x : nums1) {
            cnt[x]++;
        }
        for (int x : nums2) {
            if(cnt[x] > 0){
                res.add(x);
                cnt[x]--;
            }

        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
