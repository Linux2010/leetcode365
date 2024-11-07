package leetcode.leetcode3254;

import java.util.Arrays;

public class Solution {

    public int[] resultsArray(int[] nums, int k) {
        if (k ==1) return nums;
        int n = nums.length;
        int[] res = new int[n-k+1];
        Arrays.fill(res ,-1);
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if(nums[i] == nums[i-1]+1){
                cnt++;
            }else {
                cnt=1;
            }
            if(cnt>=k) res[i-k+1] = nums[i];
        }
        return res;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,3,2,5};
        new Solution().resultsArray(arr,3);
    }


}
