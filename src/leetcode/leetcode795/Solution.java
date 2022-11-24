package leetcode.leetcode795;


// https://leetcode.cn/problems/number-of-subarrays-with-bounded-maximum/
// MEDIUM

public class Solution {
    // 牛人思路
    // https://leetcode.cn/problems/number-of-subarrays-with-bounded-maximum/solutions/432755/xi-fa-dai-ni-xue-suan-fa-yi-ci-gao-ding-qian-zhu-2/
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int lr=0,rr=0,lc=0,rc=0;
        for (int num : nums) {
            if (num<left) lc++;
            else lc = 0;
            lr += lc;
            if (num<=right) rc++;
            else rc = 0;
            rr+=rc;
        }
        return rr-lr;
    }
}
