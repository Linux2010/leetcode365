package leetcode.leetcode2275;

import java.util.Arrays;

public class Solution {
    public int largestCombination(int[] candidates) {
        int[] ans = new int[24];
        for(int v : candidates){
            for(int i=0;v>0;i++){
                ans[i] += v&1;
                v >>= 1;
            }
        }
        return Arrays.stream(ans).max().getAsInt();
    }
}
